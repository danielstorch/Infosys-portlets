package de.hska.wi.awp.datasource.infosys.bean.receivedfeedback;

import java.io.Serializable;
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

@ManagedBean(name = "receivedFeedbackBackingBean")
@SessionScoped
public class ReceivedFeedbackBackingBean implements Serializable{

	/**
	 * Serializable
	 */
	private static final long serialVersionUID = 7688649824548474421L;

	/**
     * Logger Util
     */	
	private static final Logger logger = LoggerFactory.getLogger(ReceivedFeedbackBackingBean.class);
	
	private List<Feedback> allFeedbacksOfStudent;
	private String studenthskaId;
	private int feedbackRoundNr = 1;
	private String selectedFeedbackComment;
	
	
	public List<Feedback> getAllFeedbackOfStudent(){
		if(getStudenthskaId() != null) {
			Student student = StudentLocalServiceUtil.findByStudenthskaId(getStudenthskaId());
			List<Feedback> allFeedbacksOfStudent = FeedbackLocalServiceUtil.findByStudent_idAndFeedback_runden_nr(student.getPrimaryKey(), getFeedbackRoundNr());
			return allFeedbacksOfStudent;
		}
		return null;
	}
	
	public int getTeilnoteOfFeedback(long feedback_id, int bewertungskriterium_id){
		return Teilnote_feedbackLocalServiceUtil.findByFeedback_idAndBewertungskriterium_id(feedback_id, bewertungskriterium_id).getNote();
	}
	
	public List<Bewertungskriterium> getAllBewrtungskriterium() throws SystemException{
		return BewertungskriteriumLocalServiceUtil.getBewertungskriteriums(0, BewertungskriteriumLocalServiceUtil.getBewertungskriteriumsCount());
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
}
