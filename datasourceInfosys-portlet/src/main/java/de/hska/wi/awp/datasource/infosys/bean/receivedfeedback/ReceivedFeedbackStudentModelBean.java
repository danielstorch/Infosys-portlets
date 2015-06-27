package de.hska.wi.awp.datasource.infosys.bean.receivedfeedback;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import de.hska.wi.awp.datasource.infosys.model.Bewertungskriterium;
import de.hska.wi.awp.datasource.infosys.model.Feedback;
import de.hska.wi.awp.datasource.infosys.model.Student;
import de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback;
import de.hska.wi.awp.datasource.infosys.service.BewertungskriteriumLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.FeedbackLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.Teilnote_feedbackLocalServiceUtil;

/**
 * 
 * @author Daniel Storch
 */

@ManagedBean(name = "receivedFeedbackStudentModelBean")
@SessionScoped
public class ReceivedFeedbackStudentModelBean implements Serializable{

	/**
	 * Serializable
	 */
	private static final long serialVersionUID = 7688649824548474421L;

	/**
     * Logger Util
     */	
	private static final Log log = LogFactoryUtil.getLog(ReceivedFeedbackStudentModelBean.class);
	
	/**
     * Contains the selected student from the Navigation-Portlet
     */	
	private Student selectedStudent;
	
	/**
     * Current chosen round number
     * Default is round number 1
     */	
	private int feedbackRoundNr = 1;
	
	/**
     * Contains the currently selected feedback comment
     */
	private String selectedFeedbackComment;
	
	/**
     * List of all criteria
     */
	private List<Bewertungskriterium> allBewrtungskriterium;
	
	/**
     * Sets all criteria
     */
	@PostConstruct
    public void init() {
		setAllBewrtungskriterium(BewertungskriteriumLocalServiceUtil.getAllBewertungskriterium());
		System.out.println(BewertungskriteriumLocalServiceUtil.getAllBewertungskriterium());
	}
	
	/**
     * Gets all feedback of the selected Student
     * Selected student is null when invoking this method for the first time
     * Gets invoked from receivedFeedbackStudent.xhtml
     */	
	public List<Feedback> getAllFeedbackOfStudent(){
		log.debug("BEGIN: getAllFeedbackOfStudent");
		
		List<Feedback> allFeedbacksOfStudent = new ArrayList<Feedback>();
		if(this.selectedStudent != null) {
			allFeedbacksOfStudent = FeedbackLocalServiceUtil.findByStudent_idAndFeedback_runden_nr(this.selectedStudent.getPrimaryKey(), feedbackRoundNr);
		}
		
		log.debug("END: getAllFeedbackOfStudent");
		return allFeedbacksOfStudent;
	}
	
	/**
     * Gets the grade of Feedback criteria
     * returning 0 if we don't find any, since the data is mocked right now
     */	
	public int getTeilnoteOfFeedback(long feedback_id, long bewertungskriterium_id){
		log.debug("BEGIN: getTeilnoteOfFeedback");
		
		Teilnote_feedback teilnoteOfFeedback = null;
		if(this.selectedStudent != null) {
			teilnoteOfFeedback = Teilnote_feedbackLocalServiceUtil.findByFeedback_idAndBewertungskriterium_id(feedback_id, bewertungskriterium_id);
		}
		
		log.debug("END: getTeilnoteOfFeedback");
		return teilnoteOfFeedback.getNote();
	}
	
	/**
     * Gets the averageContribution of a Student
     * If there is no Contribution, -1 gets returned
     */	
	public int averageContribution() {
		log.debug("BEGIN: averageContribution");
		
		int averageContribution = -1;
		if(this.selectedStudent != null) {
			averageContribution = FeedbackLocalServiceUtil.averageContributionOfStudent(this.selectedStudent.getId(), this.feedbackRoundNr);
		}
		
		log.debug("END: averageContribution");
		return averageContribution;
	}

	public int getFeedbackRoundNr() {
		return feedbackRoundNr;
	}

	public void setFeedbackRoundNr(int feedbackRoundNr) {
		this.feedbackRoundNr = feedbackRoundNr;
	}

	public String getSelectedFeedbackComment() {
		return selectedFeedbackComment;
	}

	public void setSelectedFeedbackComment(String selectedFeedbackComment) {
		this.selectedFeedbackComment = selectedFeedbackComment;
	}

	public List<Bewertungskriterium> getAllBewrtungskriterium() {
		return allBewrtungskriterium;
	}

	public void setAllBewrtungskriterium(List<Bewertungskriterium> allBewrtungskriterium) {
		this.allBewrtungskriterium = allBewrtungskriterium;
	}

	public Student getSelectedStudent() {
		return selectedStudent;
	}

	public void setSelectedStudent(Student selectedStudent) {
		this.selectedStudent = selectedStudent;
	}
}
