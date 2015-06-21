package de.hska.wi.awp.datasource.infosys.bean.receivedfeedback;

import java.io.IOException;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import org.primefaces.model.DefaultStreamedContent;

import com.itextpdf.text.DocumentException;
import com.liferay.portal.kernel.exception.SystemException;

import de.hska.wi.awp.datasource.infosys.bean.receivedfeedback.pdf.ReceivedFeedbackToPDF;
import de.hska.wi.awp.datasource.infosys.model.Project;
import de.hska.wi.awp.datasource.infosys.service.ProjectLocalServiceUtil;

@ManagedBean(name = "receivedFeedbackStudentBackingBean")
@RequestScoped
public class ReceivedFeedbackStudentBackingBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8659247319999044869L;
	
	@ManagedProperty(name = "receivedFeedbackStudentModelBean", value = "#{receivedFeedbackStudentModelBean}")
	private ReceivedFeedbackStudentModelBean receivedFeedbackStudentModelBean;
	
	public DefaultStreamedContent getReceivedFeebackPDF() throws IOException, DocumentException, SystemException {
		int roundNr = receivedFeedbackStudentModelBean.getFeedbackRoundNr();
		Project project = ProjectLocalServiceUtil.fetchProject(receivedFeedbackStudentModelBean.getSelectedStudent().getProject_id());
		return ReceivedFeedbackToPDF.CreateFeedbackPDF(roundNr, project);
	}
	public void selectedFeedbackComment(String selectedFeedbackComment) {
		receivedFeedbackStudentModelBean.setSelectedFeedbackComment(selectedFeedbackComment);
	}
	
	public void setReceivedFeedbackStudentModelBean(ReceivedFeedbackStudentModelBean receivedFeedbackStudentModelBean) {

		// Injected via ManagedProperty annotation
		this.receivedFeedbackStudentModelBean = receivedFeedbackStudentModelBean;
	}	
}
