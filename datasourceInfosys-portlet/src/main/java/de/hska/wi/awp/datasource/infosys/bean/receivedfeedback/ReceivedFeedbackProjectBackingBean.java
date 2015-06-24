package de.hska.wi.awp.datasource.infosys.bean.receivedfeedback;

import java.io.IOException;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import org.primefaces.model.DefaultStreamedContent;

import com.itextpdf.text.DocumentException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import de.hska.wi.awp.datasource.infosys.bean.receivedfeedback.pdf.ReceivedFeedbackToPDF;

/**
 * ProjectBackingBean
 * 
 * @author Daniel Storch
 */
@ManagedBean(name = "receivedFeedbackProjectBackingBean")
@RequestScoped
public class ReceivedFeedbackProjectBackingBean implements Serializable{
	
	/**
	 * Serializable
	 */
	private static final long serialVersionUID = 2654984635400646925L;

	/**
     * Logger Util
     */	
	private static final Log log = LogFactoryUtil.getLog(ReceivedFeedbackProjectBackingBean.class);
	
	/**
     * Injecting receivedFeedbackProjectModelBean
     */
	@ManagedProperty(name = "receivedFeedbackProjectModelBean", value = "#{receivedFeedbackProjectModelBean}")
	private ReceivedFeedbackProjectModelBean receivedFeedbackProjectModelBean;
	
	/**
	 * Invokes the method which creates the PDF 
	 * To create the PDF, we need the RoundNumber and selectedProject
	 */
	public DefaultStreamedContent getReceivedFeebackPDF() throws IOException, DocumentException {
		return ReceivedFeedbackToPDF.CreateFeedbackPDF(receivedFeedbackProjectModelBean.getFeedbackRoundNr(), receivedFeedbackProjectModelBean.getSelectedProject());
	}
	
	/**
     * Setter for the Injection
     */
	public void setReceivedFeedbackProjectModelBean(ReceivedFeedbackProjectModelBean receivedFeedbackProjectModelBean) {
		this.receivedFeedbackProjectModelBean = receivedFeedbackProjectModelBean;
	}
}
