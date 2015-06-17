package de.hska.wi.awp.datasource.infosys.bean.receivedfeedback;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import com.liferay.faces.util.logging.Logger;
import com.liferay.faces.util.logging.LoggerFactory;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import de.hska.wi.awp.datasource.infosys.model.Bewertungskriterium;
import de.hska.wi.awp.datasource.infosys.model.Feedback;
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

@ManagedBean(name = "receivedFeedbackModelBean")
@SessionScoped
public class ReceivedFeedbackModelBean implements Serializable{

	/**
	 * Serializable
	 */
	private static final long serialVersionUID = 7688649824548474421L;

	/**
     * Logger Util
     */	
	private static final Logger logger = LoggerFactory.getLogger(ReceivedFeedbackModelBean.class);
	
	private List<Feedback> allFeedbacksOfStudent;
	private String studenthskaId;
	private Student student;
	private int feedbackRoundNr = 1;
	private String selectedFeedbackComment;
	private List<Bewertungskriterium> allBewrtungskriterium;
	
	@PostConstruct
    public void init() {
		setAllBewrtungskriterium(BewertungskriteriumLocalServiceUtil.getAllBewertungskriterium());
	}
	
	public List<Feedback> getAllFeedbackOfStudent(){
		List<Feedback> allFeedbacksOfStudent = new ArrayList<Feedback>();
		if(this.student != null) {
			allFeedbacksOfStudent = FeedbackLocalServiceUtil.findByStudent_idAndFeedback_runden_nr(this.student.getPrimaryKey(), this.feedbackRoundNr);
		}
		return allFeedbacksOfStudent;
	}
	
	public int getTeilnoteOfFeedback(long feedback_id, int bewertungskriterium_id){
		return Teilnote_feedbackLocalServiceUtil.findByFeedback_idAndBewertungskriterium_id(feedback_id, bewertungskriterium_id).getNote();
	}
	
	public int averageContribution() {
		int averageContribution = -1;
		if(this.student != null) {
			averageContribution = FeedbackLocalServiceUtil.averageContribution(this.student.getId(), this.feedbackRoundNr);
		}
		return averageContribution;
	}
	
	public String getStudenthskaId() {
		return studenthskaId;
	}

	public void setStudenthskaId(String studenthskaId) {
		this.studenthskaId = studenthskaId;
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

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public List<Bewertungskriterium> getAllBewrtungskriterium() {
		return allBewrtungskriterium;
	}

	public void setAllBewrtungskriterium(List<Bewertungskriterium> allBewrtungskriterium) {
		this.allBewrtungskriterium = allBewrtungskriterium;
	}
}
