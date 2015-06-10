package de.hska.wi.awp.datasource.infosys.util.mock;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
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
import de.hska.wi.awp.datasource.infosys.model.Teilnote;
import de.hska.wi.awp.datasource.infosys.service.AllgemeinesLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.FeedbackLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.Geplante_arbeitLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.ProjectLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.StatusberichteLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.StatusueberblickLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.StudentLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.TeilnoteLocalServiceUtil;

public class MockData {
	
	public static void DeleteAllMockData() throws SystemException, PortalException {
		System.out.println("Amount of projects before delete: "+ProjectLocalServiceUtil.getProjectsCount());
		System.out.println("Amount of students before delete: "+StudentLocalServiceUtil.getStudentsCount());
		System.out.println("Amount of feedback before delete: "+FeedbackLocalServiceUtil.getFeedbacksCount());
		System.out.println("Amount of teilnote before delete: "+TeilnoteLocalServiceUtil.getTeilnotesCount());
		System.out.println("Amount of statusberichte before delete: "+StatusberichteLocalServiceUtil.getStatusberichtesCount());
		System.out.println("Amount of statusueberblick before delete: "+StatusueberblickLocalServiceUtil.getStatusueberblicksCount());
		System.out.println("Amount of allgemeines before delete: "+AllgemeinesLocalServiceUtil.getAllgemeinesesCount());
		System.out.println("Amount of geplante_arbeit before delete: "+Geplante_arbeitLocalServiceUtil.getGeplante_arbeitsCount());
		List<Student> alleStudents = StudentLocalServiceUtil.getStudents(0, StudentLocalServiceUtil.getStudentsCount());
		List<Project> allProjects = ProjectLocalServiceUtil.getProjects(0, ProjectLocalServiceUtil.getProjectsCount());
		List<Feedback> allFeedback = FeedbackLocalServiceUtil.getFeedbacks(0, FeedbackLocalServiceUtil.getFeedbacksCount());
		List<Teilnote> allTeilnote = TeilnoteLocalServiceUtil.getTeilnotes(0, TeilnoteLocalServiceUtil.getTeilnotesCount());
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
		
		for(int zl = 0; zl < allTeilnote.size(); zl++) {
			System.out.println("Delete Teilnote ID: " +allTeilnote.get(zl).getPrimaryKey());
			TeilnoteLocalServiceUtil.deleteTeilnote(allTeilnote.get(zl).getPrimaryKey());
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
		System.out.println("Amount of teilnote after delete: "+TeilnoteLocalServiceUtil.getTeilnotesCount());
		System.out.println("Amount of statusberichte after delete: "+StatusberichteLocalServiceUtil.getStatusberichtesCount());
		System.out.println("Amount of statusueberblick after delete: "+StatusueberblickLocalServiceUtil.getStatusueberblicksCount());
		System.out.println("Amount of allgemeines after delete: "+AllgemeinesLocalServiceUtil.getAllgemeinesesCount());
		System.out.println("Amount of geplante_arbeit after delete: "+Geplante_arbeitLocalServiceUtil.getGeplante_arbeitsCount());
	}
	
	public static void SaveAllMockData() throws Exception {
		
		if(StudentLocalServiceUtil.getStudentsCount() == 0 && ProjectLocalServiceUtil.getProjectsCount() == 0) {
			
			// Der pfad muss hier angegeben werden.
			String privatePath = "/Users/Marc/Documents/workspace/liferay/Infosys-portlets";
			String pathToFile = privatePath + "/datasourceInfosys-portlet/src/main/java/de/hska/wi/awp/datasource/infosys/util/mock/infosysMockData"; 
			
	        InputStream is = new FileInputStream(pathToFile);
	        String jsonString = IOUtils.toString(is);
	        //System.out.print(jsonString);
	        
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
				
				JSONArray statusberichteJsonArray = projectJSONObject.getJSONArray("Statusberichte");
				
				for (int j = 0; j < statusberichteJsonArray.length(); j++) {
					System.out.println("count statusberichte: " + statusberichteJsonArray.length());
					
					JSONObject statusberichtJSONObject = statusberichteJsonArray.getJSONObject(j);
					Statusberichte statusberichte = StatusberichteLocalServiceUtil.createStatusberichte(statusberichtJSONObject.getLong("id"));
					statusberichte.setProject_id(statusberichtJSONObject.getLong("project_id"));
				//	statusbericht.setDatum(statusberichtJSONObject.getString("datum"));
					statusberichte.setKalenderwoche(statusberichtJSONObject.getInt("kalenderwoche"));
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
		
	}
	
}
