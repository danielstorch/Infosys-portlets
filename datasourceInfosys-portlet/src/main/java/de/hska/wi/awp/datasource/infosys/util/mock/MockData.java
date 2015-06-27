package de.hska.wi.awp.datasource.infosys.util.mock;

import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.primefaces.json.JSONArray;
import org.primefaces.json.JSONObject;

import com.liferay.faces.util.logging.Logger;
import com.liferay.faces.util.logging.LoggerFactory;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import de.hska.wi.awp.datasource.infosys.model.Bewertungskriterium;
import de.hska.wi.awp.datasource.infosys.model.Feedback;
import de.hska.wi.awp.datasource.infosys.model.Project;
import de.hska.wi.awp.datasource.infosys.model.Rolle;
import de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail;
import de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail_punkt;
import de.hska.wi.awp.datasource.infosys.model.Statusbericht_geplante_arbeit;
import de.hska.wi.awp.datasource.infosys.model.Statusbericht_info;
import de.hska.wi.awp.datasource.infosys.model.Statusbericht_info_punkt;
import de.hska.wi.awp.datasource.infosys.model.Statusberichte;
import de.hska.wi.awp.datasource.infosys.model.Student;
import de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback;
import de.hska.wi.awp.datasource.infosys.service.BewertungskriteriumLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.FeedbackLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.ProjectLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.RolleLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.Statusbericht_detailLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.Statusbericht_detail_punktLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.Statusbericht_geplante_arbeitLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.Statusbericht_infoLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.Statusbericht_info_punktLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.StatusberichteLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.StudentLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.Teilnote_feedbackLocalServiceUtil;

/**
 * Mocks the InfosysData
 * Should be deleted when there are REST-Apis available
 * 
 * @author Daniel Storch
 */
public class MockData {
	
	public static void DeleteAllMockData() throws SystemException, PortalException {
		deleteProjectMockData();
		deleteStudentMockData();
		deleteFeedbackMockData();
		deleteTeilnote_feedbackMockData();
		deleteStatusberichteMockData();
		deleteBewertungskriteriumMockData();	
		deleteRolleMockData();
		deleteStatusbericht_infoMockData();
		deleteStatusbericht_geplante_arbeitMockData();
		deleteStatusbericht_detail_punktMockData();
		deleteStatusbericht_detailMockData();
	}
	
	public static void SaveAllMockData() throws Exception {
		addProjectMockData();
		addStudentMockData();
		addFeedbackMockData();
		addTeilnoteFeedbackMockData();
		addStatusberichtMockDate();
		addBewertungskriteriumMockData();
		addRolleMockData();
		addStatusbericht_infoMockData();
		addStatusbericht_info_punktMockData();
		addStatusbericht_geplante_arbeitMockData();
		addStatusbericht_detail_punktMockData();
		addStatusbericht_detailMockData();
	}
	
	public static void deleteRolleMockData() throws SystemException, PortalException {
		System.out.println("Amount of rolle before delete: "+RolleLocalServiceUtil.getRollesCount());
		List<Rolle> allRolle = RolleLocalServiceUtil.getRolles(0, RolleLocalServiceUtil.getRollesCount());
		
		for(int zl = 0; zl < allRolle.size(); zl++) {
			RolleLocalServiceUtil.deleteRolle(allRolle.get(zl).getPrimaryKey());
		}
		
		System.out.println("Amount of rolle after delete: "+RolleLocalServiceUtil.getRollesCount());
	}
	
	public static void deleteBewertungskriteriumMockData() throws SystemException, PortalException {
		System.out.println("Amount of bewertungskriterium before delete: "+BewertungskriteriumLocalServiceUtil.getBewertungskriteriumsCount());
		List<Bewertungskriterium> allBewertungskriterium = BewertungskriteriumLocalServiceUtil.getBewertungskriteriums(0, BewertungskriteriumLocalServiceUtil.getBewertungskriteriumsCount());
		
		for(int zl = 0; zl < allBewertungskriterium.size(); zl++) {
			BewertungskriteriumLocalServiceUtil.deleteBewertungskriterium(allBewertungskriterium.get(zl).getPrimaryKey());
		}
		
		System.out.println("Amount of bewertungskriterium after delete: "+BewertungskriteriumLocalServiceUtil.getBewertungskriteriumsCount());
	}
	
	public static void deleteStatusberichteMockData() throws SystemException, PortalException {
		System.out.println("Amount of statusberichte before delete: "+StatusberichteLocalServiceUtil.getStatusberichtesCount());
		List<Statusberichte> allStatusberichte = StatusberichteLocalServiceUtil.getStatusberichtes(0, StatusberichteLocalServiceUtil.getStatusberichtesCount());
		
		for(int zl = 0; zl < allStatusberichte.size(); zl++) {
			StatusberichteLocalServiceUtil.deleteStatusberichte(allStatusberichte.get(zl).getPrimaryKey());
		}
		
		System.out.println("Amount of statusberichte after delete: "+StatusberichteLocalServiceUtil.getStatusberichtesCount());
	}
	
	public static void deleteTeilnote_feedbackMockData() throws SystemException, PortalException {
		System.out.println("Amount of Teilnote_feedback before delete: "+Teilnote_feedbackLocalServiceUtil.getTeilnote_feedbacksCount());
		List<Teilnote_feedback> allTeilnote_feedback = Teilnote_feedbackLocalServiceUtil.getTeilnote_feedbacks(0, Teilnote_feedbackLocalServiceUtil.getTeilnote_feedbacksCount());
		
		for(int zl = 0; zl < allTeilnote_feedback.size(); zl++) {
			Teilnote_feedbackLocalServiceUtil.deleteTeilnote_feedback(allTeilnote_feedback.get(zl).getPrimaryKey());
		}
		
		System.out.println("Amount of Teilnote_feedback after delete: "+Teilnote_feedbackLocalServiceUtil.getTeilnote_feedbacksCount());
	}
	
	public static void deleteFeedbackMockData() throws SystemException, PortalException {
		System.out.println("Amount of feedback before delete: "+FeedbackLocalServiceUtil.getFeedbacksCount());
		List<Feedback> allFeedback = FeedbackLocalServiceUtil.getFeedbacks(0, FeedbackLocalServiceUtil.getFeedbacksCount());
		
		for(int zl = 0; zl < allFeedback.size(); zl++) {
			FeedbackLocalServiceUtil.deleteFeedback(allFeedback.get(zl).getPrimaryKey());
		}
		
		System.out.println("Amount of feedback after delete: "+FeedbackLocalServiceUtil.getFeedbacksCount());
	}
	
	public static void deleteStudentMockData() throws SystemException, PortalException {
		System.out.println("Amount of students before delete: "+StudentLocalServiceUtil.getStudentsCount());
		List<Student> alleStudents = StudentLocalServiceUtil.getStudents(0, StudentLocalServiceUtil.getStudentsCount());
		
		for(int zl = 0; zl < alleStudents.size(); zl++) {
			StudentLocalServiceUtil.deleteStudent(alleStudents.get(zl).getPrimaryKey());
		}
		
		System.out.println("Amount of students after delete: "+StudentLocalServiceUtil.getStudentsCount());
	}
	
	public static void deleteProjectMockData() throws SystemException, PortalException {
		System.out.println("Amount of projects before delete: "+ProjectLocalServiceUtil.getProjectsCount());
		List<Project> allProjects = ProjectLocalServiceUtil.getProjects(0, ProjectLocalServiceUtil.getProjectsCount());
		
		for(int zl = 0; zl < allProjects.size(); zl++) {
			System.out.println("Delete Project Name: " + allProjects.get(zl).getName());
			ProjectLocalServiceUtil.deleteProject(allProjects.get(zl).getPrimaryKey());
		}
		
		System.out.println("Amount of projects after delete: "+ProjectLocalServiceUtil.getProjectsCount());
	}
	
	public static void deleteStatusbericht_infoMockData() throws SystemException, PortalException {
		System.out.println("Amount of Statusbericht_info before delete: "+Statusbericht_infoLocalServiceUtil.getStatusbericht_infosCount());
		List<Statusbericht_info> allStatusbericht_info = Statusbericht_infoLocalServiceUtil.getStatusbericht_infos(0, Statusbericht_infoLocalServiceUtil.getStatusbericht_infosCount());
		
		for(int zl = 0; zl < allStatusbericht_info.size(); zl++) {
			Statusbericht_infoLocalServiceUtil.deleteStatusbericht_info(allStatusbericht_info.get(zl).getPrimaryKey());
		}
		
		System.out.println("Amount of Statusbericht_info after delete: "+Statusbericht_infoLocalServiceUtil.getStatusbericht_infosCount());
	}
	
	public static void deleteStatusbericht_info_punktMockData() throws SystemException, PortalException {
		System.out.println("Amount of Statusbericht_info_punkt before delete: "+Statusbericht_info_punktLocalServiceUtil.getStatusbericht_info_punktsCount());
		List<Statusbericht_info_punkt> allStatusbericht_info_punkt = Statusbericht_info_punktLocalServiceUtil.getStatusbericht_info_punkts(0, Statusbericht_info_punktLocalServiceUtil.getStatusbericht_info_punktsCount());
		
		for(int zl = 0; zl < allStatusbericht_info_punkt.size(); zl++) {
			Statusbericht_info_punktLocalServiceUtil.deleteStatusbericht_info_punkt(allStatusbericht_info_punkt.get(zl).getPrimaryKey());
		}
		
		System.out.println("Amount of Statusbericht_info_punkt after delete: "+Statusbericht_info_punktLocalServiceUtil.getStatusbericht_info_punktsCount());
	}
	
	public static void deleteStatusbericht_geplante_arbeitMockData() throws SystemException, PortalException {
		System.out.println("Amount of Statusbericht_geplante_arbeit before delete: "+Statusbericht_geplante_arbeitLocalServiceUtil.getStatusbericht_geplante_arbeitsCount());
		List<Statusbericht_geplante_arbeit> allStatusbericht_geplante_arbeit = Statusbericht_geplante_arbeitLocalServiceUtil.getStatusbericht_geplante_arbeits(0, Statusbericht_geplante_arbeitLocalServiceUtil.getStatusbericht_geplante_arbeitsCount());
		
		for(int zl = 0; zl < allStatusbericht_geplante_arbeit.size(); zl++) {
			Statusbericht_geplante_arbeitLocalServiceUtil.deleteStatusbericht_geplante_arbeit(allStatusbericht_geplante_arbeit.get(zl).getPrimaryKey());
		}
		
		System.out.println("Amount of Statusbericht_info_punkt after delete: "+Statusbericht_info_punktLocalServiceUtil.getStatusbericht_info_punktsCount());
	}
	
	public static void deleteStatusbericht_detail_punktMockData() throws SystemException, PortalException {
		System.out.println("Amount of Statusbericht_detail_punkt before delete: "+Statusbericht_detail_punktLocalServiceUtil.getStatusbericht_detail_punktsCount());
		List<Statusbericht_detail_punkt> allStatusbericht_detail_punkt = Statusbericht_detail_punktLocalServiceUtil.getStatusbericht_detail_punkts(0, Statusbericht_detail_punktLocalServiceUtil.getStatusbericht_detail_punktsCount());
		
		for(int zl = 0; zl < allStatusbericht_detail_punkt.size(); zl++) {
			Statusbericht_detail_punktLocalServiceUtil.deleteStatusbericht_detail_punkt(allStatusbericht_detail_punkt.get(zl).getPrimaryKey());
		}
		
		System.out.println("Amount of Statusbericht_detail_punkt after delete: "+Statusbericht_detail_punktLocalServiceUtil.getStatusbericht_detail_punktsCount());
	}
	
	public static void deleteStatusbericht_detailMockData() throws SystemException, PortalException {
		System.out.println("Amount of Statusbericht_detail before delete: "+Statusbericht_detailLocalServiceUtil.getStatusbericht_detailsCount());
		List<Statusbericht_detail> allStatusbericht_detail = Statusbericht_detailLocalServiceUtil.getStatusbericht_details(0, Statusbericht_detailLocalServiceUtil.getStatusbericht_detailsCount());
		
		for(int zl = 0; zl < allStatusbericht_detail.size(); zl++) {
			Statusbericht_detailLocalServiceUtil.deleteStatusbericht_detail(allStatusbericht_detail.get(zl).getPrimaryKey());
		}
		
		System.out.println("Amount of Statusbericht_detail after delete: "+Statusbericht_detailLocalServiceUtil.getStatusbericht_detailsCount());
	}
	
	public static void addStatusbericht_detailMockData() throws Exception{
		if(Statusbericht_detailLocalServiceUtil.getStatusbericht_detailsCount() == 0) {
			InputStream is = MockData.class.getResourceAsStream("Statusbericht_detail");
	        String jsonString = IOUtils.toString(is);
	        
	        JSONObject jsonObject = null;
	        
			try {
				jsonObject = new JSONObject(jsonString);
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception ("Daten können nicht geladen werden");
			}

			JSONArray statusbericht_detailJsonArray = jsonObject.getJSONArray("Statusbericht_detail");		
			System.out.println("count Statusbericht_detail: " + statusbericht_detailJsonArray.length());
			
			for (int j = 0; j < statusbericht_detailJsonArray.length(); j++) {

				JSONObject statusbericht_detailJSONObject = statusbericht_detailJsonArray.getJSONObject(j);
				Statusbericht_detail statusbericht_detail = Statusbericht_detailLocalServiceUtil.createStatusbericht_detail(statusbericht_detailJSONObject.getLong("id"));
				statusbericht_detail.setText(statusbericht_detailJSONObject.getString("text"));
				statusbericht_detail.setStatusbericht_id(statusbericht_detailJSONObject.getLong("statusbericht_id"));
				statusbericht_detail.setStatusbericht_detail_punkt_id(statusbericht_detailJSONObject.getLong("statusbericht_detail_punkt_id"));
				Statusbericht_detailLocalServiceUtil.addStatusbericht_detail(statusbericht_detail);
			}	
		}
	}
	
	public static void addStatusbericht_detail_punktMockData() throws Exception{
		if(Statusbericht_detail_punktLocalServiceUtil.getStatusbericht_detail_punktsCount() == 0) {
			InputStream is = MockData.class.getResourceAsStream("Statusbericht_detail_punkt");
	        String jsonString = IOUtils.toString(is);
	        
	        JSONObject jsonObject = null;
	        
			try {
				jsonObject = new JSONObject(jsonString);
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception ("Daten können nicht geladen werden");
			}

			JSONArray statusbericht_detail_punktJsonArray = jsonObject.getJSONArray("Statusbericht_detail_punkt");		
			System.out.println("count Statusbericht_detail_punkt: " + statusbericht_detail_punktJsonArray.length());
			
			for (int j = 0; j < statusbericht_detail_punktJsonArray.length(); j++) {

				JSONObject statusbericht_detail_punktJSONObject = statusbericht_detail_punktJsonArray.getJSONObject(j);
				Statusbericht_detail_punkt statusbericht_detail_punkt = Statusbericht_detail_punktLocalServiceUtil.createStatusbericht_detail_punkt(statusbericht_detail_punktJSONObject.getLong("id"));
				statusbericht_detail_punkt.setName(statusbericht_detail_punktJSONObject.getString("name"));
				Statusbericht_detail_punktLocalServiceUtil.addStatusbericht_detail_punkt(statusbericht_detail_punkt);
			}	
		}
	}
	
	public static void addStatusbericht_geplante_arbeitMockData() throws Exception{
		if(Statusbericht_geplante_arbeitLocalServiceUtil.getStatusbericht_geplante_arbeitsCount() == 0) {
			InputStream is = MockData.class.getResourceAsStream("Statusbericht_geplante_arbeit");
	        String jsonString = IOUtils.toString(is);
	        
	        JSONObject jsonObject = null;
	        
			try {
				jsonObject = new JSONObject(jsonString);
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception ("Daten können nicht geladen werden");
			}

			JSONArray statusbericht_geplante_arbeitJsonArray = jsonObject.getJSONArray("Statusbericht_geplante_arbeit");		
			System.out.println("count Statusbericht_geplante_arbeit: " + statusbericht_geplante_arbeitJsonArray.length());
			DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
			for (int j = 0; j < statusbericht_geplante_arbeitJsonArray.length(); j++) {

				JSONObject statusbericht_geplante_arbeitJSONObject = statusbericht_geplante_arbeitJsonArray.getJSONObject(j);
				Statusbericht_geplante_arbeit statusbericht_geplante_arbeit = Statusbericht_geplante_arbeitLocalServiceUtil.createStatusbericht_geplante_arbeit(statusbericht_geplante_arbeitJSONObject.getLong("id"));
				Date bisWannDate = dateFormat.parse(statusbericht_geplante_arbeitJSONObject.getString("bis_wann"));
				statusbericht_geplante_arbeit.setBis_wann(bisWannDate);
				statusbericht_geplante_arbeit.setAktivitaet(statusbericht_geplante_arbeitJSONObject.getString("aktivitaet"));
				statusbericht_geplante_arbeit.setStatusbericht_id(statusbericht_geplante_arbeitJSONObject.getLong("statusbericht_id"));
				statusbericht_geplante_arbeit.setVerantwortlicher(statusbericht_geplante_arbeitJSONObject.getLong("verantwortlicher"));
				Statusbericht_geplante_arbeitLocalServiceUtil.addStatusbericht_geplante_arbeit(statusbericht_geplante_arbeit);
			}	
		}
	}
	
	public static void addStatusbericht_info_punktMockData() throws Exception{
		if(Statusbericht_info_punktLocalServiceUtil.getStatusbericht_info_punktsCount() == 0) {
			InputStream is = MockData.class.getResourceAsStream("Statusbericht_info_punkt");
	        String jsonString = IOUtils.toString(is);
	        
	        JSONObject jsonObject = null;
	        
			try {
				jsonObject = new JSONObject(jsonString);
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception ("Daten können nicht geladen werden");
			}

			JSONArray statusbericht_info_punktJsonArray = jsonObject.getJSONArray("Statusbericht_info_punkt");		
			System.out.println("count Statusbericht_info_punkt: " + statusbericht_info_punktJsonArray.length());
			
			for (int j = 0; j < statusbericht_info_punktJsonArray.length(); j++) {

				JSONObject statusbericht_info_punktJSONObject = statusbericht_info_punktJsonArray.getJSONObject(j);
				Statusbericht_info_punkt statusbericht_info_punkt = Statusbericht_info_punktLocalServiceUtil.createStatusbericht_info_punkt(statusbericht_info_punktJSONObject.getLong("id"));
				statusbericht_info_punkt.setName(statusbericht_info_punktJSONObject.getString("name"));
				Statusbericht_info_punktLocalServiceUtil.addStatusbericht_info_punkt(statusbericht_info_punkt);
			}	
		}
	}
	
	public static void addStatusbericht_infoMockData() throws Exception{
		if(Statusbericht_infoLocalServiceUtil.getStatusbericht_infosCount() == 0) {
			InputStream is = MockData.class.getResourceAsStream("Statusbericht_info");
	        String jsonString = IOUtils.toString(is);
	        
	        JSONObject jsonObject = null;
	        
			try {
				jsonObject = new JSONObject(jsonString);
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception ("Daten können nicht geladen werden");
			}

			JSONArray statusbericht_infoJsonArray = jsonObject.getJSONArray("Statusbericht_info");		
			System.out.println("count Statusbericht_info: " + statusbericht_infoJsonArray.length());
			
			for (int j = 0; j < statusbericht_infoJsonArray.length(); j++) {

				JSONObject statusbericht_infoJSONObject = statusbericht_infoJsonArray.getJSONObject(j);
				Statusbericht_info statusbericht_info = Statusbericht_infoLocalServiceUtil.createStatusbericht_info(statusbericht_infoJSONObject.getLong("id"));
				statusbericht_info.setBemerkung(statusbericht_infoJSONObject.getString("bemerkung"));
				statusbericht_info.setStatus(statusbericht_infoJSONObject.getInt("status"));
				statusbericht_info.setStatusbericht_id(statusbericht_infoJSONObject.getLong("statusbericht_id"));
				statusbericht_info.setStatusbericht_info_punkt_id(statusbericht_infoJSONObject.getLong("statusbericht_info_punkt_id"));
				Statusbericht_infoLocalServiceUtil.addStatusbericht_info(statusbericht_info);
			}	
		}
	}
	
	public static void addRolleMockData() throws Exception{
		if(RolleLocalServiceUtil.getRollesCount() == 0) {
			InputStream is = MockData.class.getResourceAsStream("Rolle");
	        String jsonString = IOUtils.toString(is);
	        
	        JSONObject jsonObject = null;
	        
			try {
				jsonObject = new JSONObject(jsonString);
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception ("Daten können nicht geladen werden");
			}

			JSONArray rolleJsonArray = jsonObject.getJSONArray("Rolle");		
			System.out.println("count rolle: " + rolleJsonArray.length());
			
			for (int j = 0; j < rolleJsonArray.length(); j++) {

				JSONObject roleJSONObject = rolleJsonArray.getJSONObject(j);
				Rolle rolle = RolleLocalServiceUtil.createRolle(roleJSONObject.getLong("id"));
				rolle.setName(roleJSONObject.getString("name"));
				rolle.setShortName(roleJSONObject.getString("kuerzel"));
				RolleLocalServiceUtil.addRolle(rolle);
			}	
		}
	}
	
	public static void addBewertungskriteriumMockData() throws Exception{
		if(BewertungskriteriumLocalServiceUtil.getBewertungskriteriumsCount() == 0) {
			InputStream is = MockData.class.getResourceAsStream("Bewertungskriterium");
	        String jsonString = IOUtils.toString(is);
	        
	        JSONObject jsonObject = null;
	        
			try {
				jsonObject = new JSONObject(jsonString);
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception ("Daten können nicht geladen werden");
			}

			JSONArray bewertungskriteriumJsonArray = jsonObject.getJSONArray("Bewertungskriterium");		
			System.out.println("count bewertungskriterium: " + bewertungskriteriumJsonArray.length());
			
			for (int j = 0; j < bewertungskriteriumJsonArray.length(); j++) {

				JSONObject bewertungskriteriumJSONObject = bewertungskriteriumJsonArray.getJSONObject(j);
				Bewertungskriterium bewertungskriterium = BewertungskriteriumLocalServiceUtil.createBewertungskriterium(bewertungskriteriumJSONObject.getLong("id"));
				bewertungskriterium.setBeschreibung(bewertungskriteriumJSONObject.getString("beschreibung"));
				bewertungskriterium.setGewichtung(bewertungskriteriumJSONObject.getInt("gewichtung"));
				bewertungskriterium.setName(bewertungskriteriumJSONObject.getString("name"));
				BewertungskriteriumLocalServiceUtil.addBewertungskriterium(bewertungskriterium);
			}	
		}
	}
	
	public static void addStatusberichtMockDate() throws Exception{
		if(StatusberichteLocalServiceUtil.getStatusberichtesCount() == 0) {
			InputStream is = MockData.class.getResourceAsStream("Statusbericht");
	        String jsonString = IOUtils.toString(is);
	        
	        JSONObject jsonObject = null;
	        
			try {
				jsonObject = new JSONObject(jsonString);
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception ("Daten können nicht geladen werden");
			}

			
			JSONArray statusberichteJsonArray = jsonObject.getJSONArray("Statusbericht");		
			System.out.println("count statusberichte: " + statusberichteJsonArray.length());
			DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
			for (int j = 0; j < statusberichteJsonArray.length(); j++) {
				
				JSONObject statusberichtJSONObject = statusberichteJsonArray.getJSONObject(j);
				Statusberichte statusberichte = StatusberichteLocalServiceUtil.createStatusberichte(statusberichtJSONObject.getLong("id"));
				statusberichte.setProject_id(statusberichtJSONObject.getLong("projekt_id"));
				Date datumDate = dateFormat.parse(statusberichtJSONObject.getString("datum"));
				statusberichte.setDatum(datumDate);
				statusberichte.setKalenderwoche(statusberichtJSONObject.getInt("kw"));
				StatusberichteLocalServiceUtil.addStatusberichte(statusberichte);
			}
		}
	}
	
	public static void addTeilnoteFeedbackMockData() throws Exception{
		if(Teilnote_feedbackLocalServiceUtil.getTeilnote_feedbacksCount() == 0) {
			
			InputStream is = MockData.class.getResourceAsStream("Teilnote_feedback");
	        String jsonString = IOUtils.toString(is);
	        
	        JSONObject jsonObject = null;
	        
			try {
				jsonObject = new JSONObject(jsonString);
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception ("Daten können nicht geladen werden");
			}

			
			JSONArray teilnote_feedbackJsonArray = jsonObject.getJSONArray("Teilnote_feedback");
			System.out.println("count teilnote_feedback: " + teilnote_feedbackJsonArray.length());
			long lastId = 0;
			long lastFeedBackId = 0;
			for(int x = 0; x < teilnote_feedbackJsonArray.length(); x++) {
				
				JSONObject teilnoteJSONObject = teilnote_feedbackJsonArray.getJSONObject(x);
				Teilnote_feedback teilnote_feedback = Teilnote_feedbackLocalServiceUtil.createTeilnote_feedback(teilnoteJSONObject.getLong("id"));
				teilnote_feedback.setFeedback_id(teilnoteJSONObject.getLong("feedback_id"));
				teilnote_feedback.setNote(teilnoteJSONObject.getInt("note"));
				teilnote_feedback.setBewertungskriterium_id(teilnoteJSONObject.getLong("bewertungskriterium_id"));
				Teilnote_feedbackLocalServiceUtil.addTeilnote_feedback(teilnote_feedback);
				
				lastId = teilnoteJSONObject.getLong("id");
				lastFeedBackId = teilnoteJSONObject.getLong("feedback_id");
			}
			
			//Um "NotFoundError" zu vermeiden, erstelle ich neue 180 Teilnote für die mockdaten. Diese in JSON daten für jedes Teammitglied zu erfinden war zu aufwändig.
			lastId += 1;
			lastFeedBackId += 1;
			long bewertungskriterium_id = 100;
			int count = 0;
			for(int x = 0; x < 180; x++) {
				Teilnote_feedback teilnote_feedback = Teilnote_feedbackLocalServiceUtil.createTeilnote_feedback(lastId);
				teilnote_feedback.setFeedback_id(lastFeedBackId);
				teilnote_feedback.setNote(0);
				teilnote_feedback.setBewertungskriterium_id(bewertungskriterium_id);
				Teilnote_feedbackLocalServiceUtil.addTeilnote_feedback(teilnote_feedback);
				
				if(bewertungskriterium_id == 108 ) {
					bewertungskriterium_id = 100;
				}else {
					bewertungskriterium_id += 2;
				}
				
				if(count == 4) {
					lastFeedBackId++;
					count = 0;
				}else {
					count++;
				}
				lastId++;
				
			}
		}
	}
	
	public static void addFeedbackMockData() throws Exception{
		if(FeedbackLocalServiceUtil.getFeedbacksCount() == 0) {
					
			InputStream is = MockData.class.getResourceAsStream("Feedback");
	        String jsonString = IOUtils.toString(is);
	        
	        JSONObject jsonObject = null;
	        
			try {
				jsonObject = new JSONObject(jsonString);
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception ("Daten können nicht geladen werden");
			}

			
			JSONArray feedbackJsonArray = jsonObject.getJSONArray("Feedback");
			System.out.println("count feedbackJsonArray: " + feedbackJsonArray.length());
			for(int y = 0; y < feedbackJsonArray.length(); y++) {
						
				JSONObject feedbackJSONObject = feedbackJsonArray.getJSONObject(y);
				Feedback feedback = FeedbackLocalServiceUtil.createFeedback(feedbackJSONObject.getLong("id"));
				feedback.setStudent_id(feedbackJSONObject.getLong("student_id"));
				feedback.setEigenbewertung(feedbackJSONObject.getString("eigenbewertung"));
				feedback.setKommentar_kompetenzen(feedbackJSONObject.getString("kommentar_kompetenzen"));
				feedback.setKommentar_beitrag(feedbackJSONObject.getString("kommentar_beitrag"));
				feedback.setFeedback_runden_nr(feedbackJSONObject.getInt("feedback_runden_nr"));
				feedback.setBeitrag(feedbackJSONObject.getInt("beitrag"));
				FeedbackLocalServiceUtil.addFeedback(feedback);
			}        
		}
	}
	
	public static void addProjectMockData() throws Exception{
		if(ProjectLocalServiceUtil.getProjectsCount() == 0) {
			
	        InputStream is = MockData.class.getResourceAsStream("Project");
	        String jsonString = IOUtils.toString(is);
	        
	        JSONObject jsonObject = null;
	        
			try {
				jsonObject = new JSONObject(jsonString);
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception ("Daten können nicht geladen werden");
			}

			
			JSONArray projectJsonArray = jsonObject.getJSONArray("Project");
			System.out.println("count projectsJsonArray: " + projectJsonArray.length());
			for (int i = 0; i < projectJsonArray.length(); i++) {
				
				JSONObject projectJSONObject = projectJsonArray.getJSONObject(i);
				Project project = ProjectLocalServiceUtil.createProject(projectJSONObject.getLong("id"));
				project.setName(projectJSONObject.getString("name"));
				project.setProjecthskaId(projectJSONObject.getString("projecthskaId"));
				ProjectLocalServiceUtil.addProject(project);
			}
		}
	}
	
	public static void addStudentMockData() throws Exception{
		if(StudentLocalServiceUtil.getStudentsCount() == 0) {
			
	        InputStream is = MockData.class.getResourceAsStream("Student");
	        String jsonString = IOUtils.toString(is);
	        
	        JSONObject jsonObject = null;
	        
			try {
				jsonObject = new JSONObject(jsonString);
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception ("Daten können nicht geladen werden");
			}

			JSONArray studentJsonArray = jsonObject.getJSONArray("Student");
			System.out.println("count studentsJsonArray: " + studentJsonArray.length());
			for(int j = 0; j < studentJsonArray.length(); j++) {
				
				JSONObject studentJSONObject = studentJsonArray.getJSONObject(j);
				Student student = StudentLocalServiceUtil.createStudent(studentJSONObject.getLong("id"));
				student.setFirstName(studentJSONObject.getString("firstName"));
				student.setLastName(studentJSONObject.getString("lastName"));
				student.setStudenthskaId(studentJSONObject.getString("studenthskaId"));
				student.setMatnr(studentJSONObject.getInt("matnr"));
				student.setRole(studentJSONObject.getInt("role"));
				student.setProject_id(studentJSONObject.getLong("project_id"));
				StudentLocalServiceUtil.addStudent(student);
			}	
		
		}	
	}
}
	
