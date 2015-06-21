package de.hska.wi.awp.datasource.infosys.bean.receivedfeedback;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.ChartSeries;

import com.liferay.faces.util.logging.Logger;
import com.liferay.faces.util.logging.LoggerFactory;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import de.hska.wi.awp.datasource.infosys.model.Bewertungskriterium;
import de.hska.wi.awp.datasource.infosys.model.Feedback;
import de.hska.wi.awp.datasource.infosys.model.Project;
import de.hska.wi.awp.datasource.infosys.model.Student;
import de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback;
import de.hska.wi.awp.datasource.infosys.service.BewertungskriteriumLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.StudentLocalServiceUtil;
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
	private static final Logger logger = LoggerFactory.getLogger(ReceivedFeedbackStudentModelBean.class);
	
	private List<Feedback> allFeedbacksOfStudent;
	private Student selectedStudent;
	private int feedbackRoundNr = 1;
	private String selectedFeedbackComment;
	private List<Bewertungskriterium> allBewrtungskriterium;
	
	/**
     * This does not work
     * Setting the attribute allFeedbacksOfStudent in the init method does not work. selectedStudent which comes from the event is always null
     */
	@PostConstruct
    public void init() {
		//Student is always null at this point
		if(this.selectedStudent != null) {
			allFeedbacksOfStudent = FeedbackLocalServiceUtil.findByStudent_idAndFeedback_runden_nr(this.selectedStudent.getPrimaryKey(), this.feedbackRoundNr);
		}
		System.out.println("Student in PostConstruct " + selectedStudent);
		setAllBewrtungskriterium(BewertungskriteriumLocalServiceUtil.getAllBewertungskriterium());
	}
	
	/**
     * THIS WORKS!!
     * Calling this method in my receivedFeedbackStudent.xhtml
     */	
	public List<Feedback> getAllFeedbackOfStudent(){
		List<Feedback> allFeedbacksOfStudent = new ArrayList<Feedback>();
		if(this.selectedStudent != null) {
			allFeedbacksOfStudent = FeedbackLocalServiceUtil.findByStudent_idAndFeedback_runden_nr(this.selectedStudent.getPrimaryKey(), feedbackRoundNr);
		}
		return allFeedbacksOfStudent;
	}
	
	public int getTeilnoteOfFeedback(long feedback_id, long bewertungskriterium_id){
		Teilnote_feedback teilnoteOfFeedback = null;
		if(this.selectedStudent != null) {
			teilnoteOfFeedback = Teilnote_feedbackLocalServiceUtil.findByFeedback_idAndBewertungskriterium_id(feedback_id, bewertungskriterium_id);
		}
		if(teilnoteOfFeedback != null) {
			return teilnoteOfFeedback.getNote();
		}
		return 0;
	}
	
	public int averageContribution() {
		int averageContribution = -1;
		if(this.selectedStudent != null) {
			averageContribution = FeedbackLocalServiceUtil.averageContributionOfStudent(this.selectedStudent.getId(), this.feedbackRoundNr);
		}
		return averageContribution;
	}
	
	public List<Feedback> getAllFeedbacksOfStudent() {
		return allFeedbacksOfStudent;
	}

	public void setAllFeedbacksOfStudent(List<Feedback> allFeedbacksOfStudent) {
		this.allFeedbacksOfStudent = allFeedbacksOfStudent;
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
