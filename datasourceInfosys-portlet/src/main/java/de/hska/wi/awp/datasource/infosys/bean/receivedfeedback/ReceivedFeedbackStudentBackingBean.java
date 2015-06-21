package de.hska.wi.awp.datasource.infosys.bean.receivedfeedback;

import java.io.IOException;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import org.primefaces.model.DefaultStreamedContent;

import com.itextpdf.text.DocumentException;
import com.liferay.faces.util.logging.Logger;
import com.liferay.faces.util.logging.LoggerFactory;
import com.liferay.portal.kernel.exception.SystemException;

import de.hska.wi.awp.datasource.infosys.bean.receivedfeedback.pdf.ReceivedFeedbackToPDF;
import de.hska.wi.awp.datasource.infosys.model.Project;
import de.hska.wi.awp.datasource.infosys.service.ProjectLocalServiceUtil;

/**
 * StudentBackingBean
 * 
 * @author Daniel Storch
 */
@ManagedBean(name = "receivedFeedbackStudentBackingBean")
@RequestScoped
public class ReceivedFeedbackStudentBackingBean implements Serializable {

	/**
	 * Serializable
	 */
	private static final long serialVersionUID = -8659247319999044869L;
	
	/**
     * Logger Util
     */	
	private static final Logger logger = LoggerFactory.getLogger(ReceivedFeedbackStudentBackingBean.class);
	
	/**
     * Injecting receivedFeedbackStudentModelBean
     */
	@ManagedProperty(name = "receivedFeedbackStudentModelBean", value = "#{receivedFeedbackStudentModelBean}")
	private ReceivedFeedbackStudentModelBean receivedFeedbackStudentModelBean;
	
	/**
     * Invoking the method which creates the FeebackPDF
     */
	public DefaultStreamedContent getReceivedFeebackPDF() throws IOException, DocumentException, SystemException {
		int roundNr = receivedFeedbackStudentModelBean.getFeedbackRoundNr();
		Project project = ProjectLocalServiceUtil.fetchProject(receivedFeedbackStudentModelBean.getSelectedStudent().getProject_id());
		return ReceivedFeedbackToPDF.CreateFeedbackPDF(roundNr, project);
	}
	
	/**
     * Sets the comment of a Feedback
     * This method gets called in the receivedFeedbackStudent.xhtml and shows the comment in a dialog
     */
	public void selectedFeedbackComment(String selectedFeedbackComment) {
		receivedFeedbackStudentModelBean.setSelectedFeedbackComment(selectedFeedbackComment);
	}
	
	/**
     * Setter for the Injection
     */
	public void setReceivedFeedbackStudentModelBean(ReceivedFeedbackStudentModelBean receivedFeedbackStudentModelBean) {
		this.receivedFeedbackStudentModelBean = receivedFeedbackStudentModelBean;
	}	
}
