package de.hska.wi.awp.datasource.infosys.util.mock;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.primefaces.json.JSONArray;
import org.primefaces.json.JSONObject;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import de.hska.wi.awp.datasource.infosys.model.Allgemeines;
import de.hska.wi.awp.datasource.infosys.model.Feedback;
import de.hska.wi.awp.datasource.infosys.model.Geplante_arbeit;
import de.hska.wi.awp.datasource.infosys.model.Project;
import de.hska.wi.awp.datasource.infosys.model.Statusberichte;
import de.hska.wi.awp.datasource.infosys.model.Statusueberblick;
import de.hska.wi.awp.datasource.infosys.model.Student;
import de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback;
import de.hska.wi.awp.datasource.infosys.service.AllgemeinesLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.FeedbackLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.Geplante_arbeitLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.ProjectLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.StatusberichteLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.StatusueberblickLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.StudentLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.Teilnote_feedbackLocalServiceUtil;

public class MockData {
	
	public static void DeleteAllMockData() throws SystemException, PortalException {
		System.out.println("Amount of projects before delete: "+ProjectLocalServiceUtil.getProjectsCount());
		System.out.println("Amount of students before delete: "+StudentLocalServiceUtil.getStudentsCount());
		System.out.println("Amount of feedback before delete: "+FeedbackLocalServiceUtil.getFeedbacksCount());
		System.out.println("Amount of Teilnote_feedback before delete: "+Teilnote_feedbackLocalServiceUtil.getTeilnote_feedbacksCount());
		System.out.println("Amount of statusberichte before delete: "+StatusberichteLocalServiceUtil.getStatusberichtesCount());
		System.out.println("Amount of statusueberblick before delete: "+StatusueberblickLocalServiceUtil.getStatusueberblicksCount());
		System.out.println("Amount of allgemeines before delete: "+AllgemeinesLocalServiceUtil.getAllgemeinesesCount());
		System.out.println("Amount of geplante_arbeit before delete: "+Geplante_arbeitLocalServiceUtil.getGeplante_arbeitsCount());
		List<Student> alleStudents = StudentLocalServiceUtil.getStudents(0, StudentLocalServiceUtil.getStudentsCount());
		List<Project> allProjects = ProjectLocalServiceUtil.getProjects(0, ProjectLocalServiceUtil.getProjectsCount());
		List<Feedback> allFeedback = FeedbackLocalServiceUtil.getFeedbacks(0, FeedbackLocalServiceUtil.getFeedbacksCount());
		List<Teilnote_feedback> allTeilnote_feedback = Teilnote_feedbackLocalServiceUtil.getTeilnote_feedbacks(0, Teilnote_feedbackLocalServiceUtil.getTeilnote_feedbacksCount());
		List<Statusberichte> allStatusberichte = StatusberichteLocalServiceUtil.getStatusberichtes(0, StatusberichteLocalServiceUtil.getStatusberichtesCount());
		List<Statusueberblick> allStatusueberblick = StatusueberblickLocalServiceUtil.getStatusueberblicks(0, StatusueberblickLocalServiceUtil.getStatusueberblicksCount());
		List<Allgemeines> allAllgemeines = AllgemeinesLocalServiceUtil.getAllgemeineses(0, AllgemeinesLocalServiceUtil.getAllgemeinesesCount());
		List<Geplante_arbeit> allGeplante_arbeit = Geplante_arbeitLocalServiceUtil.getGeplante_arbeits(0, Geplante_arbeitLocalServiceUtil.getGeplante_arbeitsCount());
		
		for(int zl = 0; zl < allProjects.size(); zl++) {
			System.out.println("Delete Project Name: " + allProjects.get(zl).getName());
			ProjectLocalServiceUtil.deleteProject(allProjects.get(zl).getPrimaryKey());
		}
		
		for(int zl = 0; zl < alleStudents.size(); zl++) {
			System.out.println("Delete Student FirstName: " +alleStudents.get(zl).getFirstName());
			StudentLocalServiceUtil.deleteStudent(alleStudents.get(zl).getPrimaryKey());
		}
		
		for(int zl = 0; zl < allFeedback.size(); zl++) {
			System.out.println("Delete Feedback ID: " +allFeedback.get(zl).getPrimaryKey());
			FeedbackLocalServiceUtil.deleteFeedback(allFeedback.get(zl).getPrimaryKey());
		}
		
		for(int zl = 0; zl < allTeilnote_feedback.size(); zl++) {
			System.out.println("Delete Teilnote ID: " +allTeilnote_feedback.get(zl).getPrimaryKey());
			Teilnote_feedbackLocalServiceUtil.deleteTeilnote_feedback(allTeilnote_feedback.get(zl).getPrimaryKey());
		}
		
		for(int zl = 0; zl < allStatusberichte.size(); zl++) {
			System.out.println("Delete Statusbericht ID: " +allStatusberichte.get(zl).getPrimaryKey());
			StatusberichteLocalServiceUtil.deleteStatusberichte(allStatusberichte.get(zl).getPrimaryKey());
		}
		
		for(int zl = 0; zl < allStatusueberblick.size(); zl++) {
			System.out.println("Delete Statusueberblick ID: " +allStatusueberblick.get(zl).getPrimaryKey());
			StatusueberblickLocalServiceUtil.deleteStatusueberblick(allStatusueberblick.get(zl).getPrimaryKey());
		}
		
		for(int zl = 0; zl < allAllgemeines.size(); zl++) {
			System.out.println("Delete Allgemeines ID: " +allAllgemeines.get(zl).getPrimaryKey());
			AllgemeinesLocalServiceUtil.deleteAllgemeines(allAllgemeines.get(zl).getPrimaryKey());
		}
		
		for(int zl = 0; zl < allGeplante_arbeit.size(); zl++) {
			System.out.println("Delete Geplante_arbeit ID: " +allGeplante_arbeit.get(zl).getPrimaryKey());
			Geplante_arbeitLocalServiceUtil.deleteGeplante_arbeit(allGeplante_arbeit.get(zl).getPrimaryKey());
		}
		
		System.out.println("Amount of projects after delete: "+ProjectLocalServiceUtil.getProjectsCount());
		System.out.println("Amount of students after delete: "+StudentLocalServiceUtil.getStudentsCount());
		System.out.println("Amount of feedback after delete: "+FeedbackLocalServiceUtil.getFeedbacksCount());
		System.out.println("Amount of Teilnote_feedback after delete: "+Teilnote_feedbackLocalServiceUtil.getTeilnote_feedbacksCount());
		System.out.println("Amount of statusberichte after delete: "+StatusberichteLocalServiceUtil.getStatusberichtesCount());
		System.out.println("Amount of statusueberblick after delete: "+StatusueberblickLocalServiceUtil.getStatusueberblicksCount());
		System.out.println("Amount of allgemeines after delete: "+AllgemeinesLocalServiceUtil.getAllgemeinesesCount());
		System.out.println("Amount of geplante_arbeit after delete: "+Geplante_arbeitLocalServiceUtil.getGeplante_arbeitsCount());
	}
	
	public static void SaveAllMockData() throws Exception {
		/*
		if(StudentLocalServiceUtil.getStudentsCount() == 0 && ProjectLocalServiceUtil.getProjectsCount() == 0) {
		
	        InputStream is = MockData.class.getResourceAsStream("infosysMockData");
	        String jsonString = IOUtils.toString(is);
	        
	        JSONObject jsonObject = null;
	        
			try {
				jsonObject = new JSONObject(jsonString);
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception ("Daten können nicht geladen werden");
			}

			
			JSONArray projectsJsonArray = jsonObject.getJSONArray("Projects");
			
			for (int i = 0; i < projectsJsonArray.length(); i++) {
				System.out.println("count projectsJsonArray: " + projectsJsonArray.length());
				
				JSONObject projectJSONObject = projectsJsonArray.getJSONObject(i);
				Project project = ProjectLocalServiceUtil.createProject(projectJSONObject.getLong("id"));
				project.setName(projectJSONObject.getString("name"));
				project.setProjecthskaId(projectJSONObject.getString("projecthskaId"));
				ProjectLocalServiceUtil.addProject(project);
			
				JSONArray studentsJsonArray = projectJSONObject.getJSONArray("Students");
				
				for(int j = 0; j < studentsJsonArray.length(); j++) {
					System.out.println("count studentsJsonArray: " + studentsJsonArray.length());
					
					JSONObject studentJSONObject = studentsJsonArray.getJSONObject(j);
					Student student = StudentLocalServiceUtil.createStudent(studentJSONObject.getLong("id"));
					student.setFirstName(studentJSONObject.getString("firstName"));
					student.setLastName(studentJSONObject.getString("lastName"));
					student.setStudenthskaId(studentJSONObject.getString("studenthskaId"));
					student.setMatnr(studentJSONObject.getInt("matnr"));
					student.setRole(studentJSONObject.getInt("role"));
					student.setProject_id(studentJSONObject.getLong("project_id"));
					StudentLocalServiceUtil.addStudent(student);
					
					if(studentJSONObject.has("Feedback")) {
					JSONArray feedbackJsonArray = studentJSONObject.getJSONArray("Feedback");
					
					for(int y = 0; y < feedbackJsonArray.length(); y++) {
						System.out.println("count feedbackJsonArray: " + feedbackJsonArray.length());
						
						JSONObject feedbackJSONObject = feedbackJsonArray.getJSONObject(y);
						Feedback feedback = FeedbackLocalServiceUtil.createFeedback(feedbackJSONObject.getLong("id"));
						feedback.setStudent_id(feedbackJSONObject.getLong("student_id"));
						feedback.setEigenbewertung(feedbackJSONObject.getString("eigenbewertung"));
						feedback.setKommentar_kompetenzen(feedbackJSONObject.getString("kommentar_kompetenzen"));
						feedback.setKommentar_beitrag(feedbackJSONObject.getString("kommentar_beitrag"));
						feedback.setFeedback_runden_nr(feedbackJSONObject.getInt("feedback_runden_nr"));
						feedback.setBeitrag(feedbackJSONObject.getInt("beitrag"));
						FeedbackLocalServiceUtil.addFeedback(feedback);
						
						JSONArray teilnoteJsonArray = feedbackJSONObject.getJSONArray("Teilnote");
						
						for(int x = 0; x < teilnoteJsonArray.length(); x++) {
							System.out.println("count teilnoteJsonArray: " + teilnoteJsonArray.length());
							
							JSONObject teilnoteJSONObject = teilnoteJsonArray.getJSONObject(x);
							Teilnote teilnote = TeilnoteLocalServiceUtil.createTeilnote(teilnoteJSONObject.getLong("id"));
							teilnote.setFeedback_id(teilnoteJSONObject.getLong("feedback_id"));
							teilnote.setNote(teilnoteJSONObject.getInt("note"));
							teilnote.setKategorie(teilnoteJSONObject.getLong("kategorie"));
							TeilnoteLocalServiceUtil.addTeilnote(teilnote);
						}
					}
				}
				}
				
				JSONArray statusberichteJsonArray = projectJSONObject.getJSONArray("statusbericht");
				
				for (int j = 0; j < statusberichteJsonArray.length(); j++) {
					System.out.println("count statusberichte: " + statusberichteJsonArray.length());
					
					JSONObject statusberichtJSONObject = statusberichteJsonArray.getJSONObject(j);
					Statusberichte statusberichte = StatusberichteLocalServiceUtil.createStatusberichte(statusberichtJSONObject.getLong("id"));
					statusberichte.setProject_id(statusberichtJSONObject.getLong("project_id"));
				//	statusbericht.setDatum(statusberichtJSONObject.getString("datum"));
					statusberichte.setKalenderwoche(statusberichtJSONObject.getInt("kw"));
					StatusberichteLocalServiceUtil.addStatusberichte(statusberichte);
					
					JSONObject statusueberblickJSONObject = statusberichtJSONObject.getJSONObject("Statusueberblick");
					Statusueberblick statusueberblick = StatusueberblickLocalServiceUtil.createStatusueberblick(statusueberblickJSONObject.getLong("id"));
					statusueberblick.setStatusbericht_id(statusueberblickJSONObject.getLong("statusbericht_id"));
					statusueberblick.setQualitaet_status(statusueberblickJSONObject.getString("qualitaet_status"));
					statusueberblick.setQualitaet_text(statusueberblickJSONObject.getString("qualitaet_text"));
					statusueberblick.setKosten_status(statusueberblickJSONObject.getString("kosten_status"));
					statusueberblick.setKosten_text(statusueberblickJSONObject.getString("kosten_text"));
					statusueberblick.setAufwand_status(statusueberblickJSONObject.getString("aufwand_status"));
					statusueberblick.setAufwand_text(statusueberblickJSONObject.getString("aufwand_text"));
					statusueberblick.setTermine_status(statusueberblickJSONObject.getString("termine_status"));
					statusueberblick.setTermine_text(statusueberblickJSONObject.getString("termine_text"));
					StatusueberblickLocalServiceUtil.addStatusueberblick(statusueberblick);
					
					JSONObject allgemeinesJSONObject = statusberichtJSONObject.getJSONObject("Allgemeines");
					Allgemeines allgemeines = AllgemeinesLocalServiceUtil.createAllgemeines(allgemeinesJSONObject.getLong("id"));
					allgemeines.setStatusbericht_id(allgemeinesJSONObject.getLong("statusbericht_id"));
					allgemeines.setProbleme_risiken(allgemeinesJSONObject.getString("probleme_risiken"));
					allgemeines.setMassnahmen(allgemeinesJSONObject.getString("massnahmen"));
					allgemeines.setSituation(allgemeinesJSONObject.getString("situation"));
					allgemeines.setGruende(allgemeinesJSONObject.getString("gruende"));
					AllgemeinesLocalServiceUtil.addAllgemeines(allgemeines);
					
					JSONArray geplante_arbeitJsonArray = statusberichtJSONObject.getJSONArray("Geplante_arbeit");
					
					for (int y = 0; y < geplante_arbeitJsonArray.length(); y++) {
						System.out.println("count geplante_arbeit: " + geplante_arbeitJsonArray.length());
						
						JSONObject geplante_arbeitJSONObject = geplante_arbeitJsonArray.getJSONObject(y);
						Geplante_arbeit geplante_arbeit = Geplante_arbeitLocalServiceUtil.createGeplante_arbeit(geplante_arbeitJSONObject.getLong("id"));
						geplante_arbeit.setStatusbericht_id(geplante_arbeitJSONObject.getLong("statusbericht_id"));
						geplante_arbeit.setVerantwortlicher(geplante_arbeitJSONObject.getLong("verantwortlicher"));
						geplante_arbeit.setArbeit(geplante_arbeitJSONObject.getString("arbeit"));
						//geplante_arbeit.setBis_wann(geplante_arbeitJSONObject.getString("bis_wann"));
						Geplante_arbeitLocalServiceUtil.addGeplante_arbeit(geplante_arbeit);
					}
				}
				
			}
		}else {
			System.out.println("Data already exists, can't save same data twice");
		}
		*/
		addProjectMockData();
		addStudentMockData();
		addFeedbackMockData();
		addTeilnoteFeedbackMockData();
		addStatusberichtMockDate();
		addStatusueberblickMockData();
		addAllgemeinsMockData();
		addGeplante_arbeitMockData();
	}
	
	public static void addGeplante_arbeitMockData() throws Exception{
		if(Geplante_arbeitLocalServiceUtil.getGeplante_arbeitsCount() == 0) {
			InputStream is = MockData.class.getResourceAsStream("Geplante_arbeit");
	        String jsonString = IOUtils.toString(is);
	        
	        JSONObject jsonObject = null;
	        
			try {
				jsonObject = new JSONObject(jsonString);
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception ("Daten können nicht geladen werden");
			}

			JSONArray geplante_arbeitJsonArray = jsonObject.getJSONArray("Geplante_arbeit");		
			System.out.println("count geplante_arbeit: " + geplante_arbeitJsonArray.length());
			DateFormat format = new SimpleDateFormat("dd-MM-yyyy HH:mm");
			
			for (int j = 0; j < geplante_arbeitJsonArray.length(); j++) {

				JSONObject geplante_arbeitJSONObject = geplante_arbeitJsonArray.getJSONObject(j);
				Geplante_arbeit geplante_arbeit = Geplante_arbeitLocalServiceUtil.createGeplante_arbeit(geplante_arbeitJSONObject.getLong("id"));
				geplante_arbeit.setStatusbericht_id(geplante_arbeitJSONObject.getLong("statusbericht_id"));
				geplante_arbeit.setVerantwortlicher(geplante_arbeitJSONObject.getLong("verantwortlicher"));
				geplante_arbeit.setArbeit(geplante_arbeitJSONObject.getString("arbeit"));
				//geplante_arbeit.setBis_wann(format.parse(geplante_arbeitJSONObject.getString("bis_wann")));
				Geplante_arbeitLocalServiceUtil.addGeplante_arbeit(geplante_arbeit);
			}	
		}
	}
	
	public static void addAllgemeinsMockData() throws Exception{
		if(AllgemeinesLocalServiceUtil.getAllgemeinesesCount() == 0) {
			InputStream is = MockData.class.getResourceAsStream("Allgemein");
	        String jsonString = IOUtils.toString(is);
	        
	        JSONObject jsonObject = null;
	        
			try {
				jsonObject = new JSONObject(jsonString);
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception ("Daten können nicht geladen werden");
			}

			JSONArray allgemeinJsonArray = jsonObject.getJSONArray("Allgemein");		
			System.out.println("count allgemein: " + allgemeinJsonArray.length());
			for (int j = 0; j < allgemeinJsonArray.length(); j++) {

				JSONObject allgemeinJSONObject = allgemeinJsonArray.getJSONObject(j);
				Allgemeines allgemein = AllgemeinesLocalServiceUtil.createAllgemeines(allgemeinJSONObject.getLong("id"));
				allgemein.setStatusbericht_id(allgemeinJSONObject.getLong("statusbericht_id"));
				allgemein.setProbleme_risiken(allgemeinJSONObject.getString("probleme_risiken"));
				allgemein.setMassnahmen(allgemeinJSONObject.getString("massnahmen"));
				allgemein.setSituation(allgemeinJSONObject.getString("situation"));
				allgemein.setGruende(allgemeinJSONObject.getString("gruende"));
				AllgemeinesLocalServiceUtil.addAllgemeines(allgemein);
			}	
		}
	}
	
	public static void addStatusueberblickMockData() throws Exception{
		if(StatusueberblickLocalServiceUtil.getStatusueberblicksCount() == 0) {
			InputStream is = MockData.class.getResourceAsStream("Statusueberblick");
	        String jsonString = IOUtils.toString(is);
	        
	        JSONObject jsonObject = null;
	        
			try {
				jsonObject = new JSONObject(jsonString);
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception ("Daten können nicht geladen werden");
			}

			
			JSONArray statusueberblickJsonArray = jsonObject.getJSONArray("Statusueberblick");		
			System.out.println("count statusueberblick: " + statusueberblickJsonArray.length());
			for (int j = 0; j < statusueberblickJsonArray.length(); j++) {

				JSONObject statusueberblickJSONObject = statusueberblickJsonArray.getJSONObject(j);
				Statusueberblick statusueberblick = StatusueberblickLocalServiceUtil.createStatusueberblick(statusueberblickJSONObject.getLong("id"));
				statusueberblick.setStatusbericht_id(statusueberblickJSONObject.getLong("statusbericht_id"));
				statusueberblick.setQualitaet_status(statusueberblickJSONObject.getString("qualitaet_status"));
				statusueberblick.setQualitaet_text(statusueberblickJSONObject.getString("qualitaet_text"));
				statusueberblick.setKosten_status(statusueberblickJSONObject.getString("kosten_status"));
				statusueberblick.setKosten_text(statusueberblickJSONObject.getString("kosten_text"));
				statusueberblick.setAufwand_status(statusueberblickJSONObject.getString("aufwand_status"));
				statusueberblick.setAufwand_text(statusueberblickJSONObject.getString("aufwand_text"));
				statusueberblick.setTermine_status(statusueberblickJSONObject.getString("termine_status"));
				statusueberblick.setTermine_text(statusueberblickJSONObject.getString("termine_text"));
				StatusueberblickLocalServiceUtil.addStatusueberblick(statusueberblick);
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
			
			for (int j = 0; j < statusberichteJsonArray.length(); j++) {
				
				JSONObject statusberichtJSONObject = statusberichteJsonArray.getJSONObject(j);
				Statusberichte statusberichte = StatusberichteLocalServiceUtil.createStatusberichte(statusberichtJSONObject.getLong("id"));
				statusberichte.setProject_id(statusberichtJSONObject.getLong("project_id"));
			//	statusbericht.setDatum(statusberichtJSONObject.getString("datum"));
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
			
			for(int x = 0; x < teilnote_feedbackJsonArray.length(); x++) {
				
				JSONObject teilnoteJSONObject = teilnote_feedbackJsonArray.getJSONObject(x);
				Teilnote_feedback teilnote_feedback = Teilnote_feedbackLocalServiceUtil.createTeilnote_feedback(teilnoteJSONObject.getLong("id"));
				teilnote_feedback.setFeedback_id(teilnoteJSONObject.getLong("feedback_id"));
				teilnote_feedback.setNote(teilnoteJSONObject.getInt("note"));
				teilnote_feedback.setBewertungskriterium_id(teilnoteJSONObject.getLong("bewertungskriterium_id"));
				Teilnote_feedbackLocalServiceUtil.addTeilnote_feedback(teilnote_feedback);
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
	
