package de.hska.wi.awp.datasource.infosys.bean.receivedfeedback;

import java.io.IOException;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import org.primefaces.model.DefaultStreamedContent;

import com.itextpdf.text.DocumentException;

import de.hska.wi.awp.datasource.infosys.bean.receivedfeedback.pdf.ReceivedFeedbackToPDF;

@ManagedBean(name = "receivedFeedbackProjectBackingBean")
@RequestScoped
public class ReceivedFeedbackProjectBackingBean implements Serializable{
	
	public static final String RESOURCE = "resources/images/";
	/**
	 * 
	 */
	private static final long serialVersionUID = 2654984635400646925L;

	@ManagedProperty(name = "receivedFeedbackProjectModelBean", value = "#{receivedFeedbackProjectModelBean}")
	private ReceivedFeedbackProjectModelBean receivedFeedbackProjectModelBean;
	
	public DefaultStreamedContent getReceivedFeebackPDF() throws IOException, DocumentException {
		return ReceivedFeedbackToPDF.CreateFeedbackPDF(receivedFeedbackProjectModelBean.getFeedbackRoundNr(), receivedFeedbackProjectModelBean.getSelectedProject());
	}
	
	public void setReceivedFeedbackProjectModelBean(ReceivedFeedbackProjectModelBean receivedFeedbackProjectModelBean) {
		this.receivedFeedbackProjectModelBean = receivedFeedbackProjectModelBean;
	}
}
