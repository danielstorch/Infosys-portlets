package de.hska.wi.awp.datasource.infosys.bean.receivedfeedback;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UICommand;
import javax.faces.event.ActionEvent;

@ManagedBean(name = "receivedFeedbackStudentBackingBean")
@RequestScoped
public class ReceivedFeedbackStudentBackingBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8659247319999044869L;
	
	@ManagedProperty(name = "receivedFeedbackStudentModelBean", value = "#{receivedFeedbackStudentModelBean}")
	private ReceivedFeedbackStudentModelBean receivedFeedbackStudentModelBean;
	
	public void selectedFeedbackComment(String selectedFeedbackComment) {
		receivedFeedbackStudentModelBean.setSelectedFeedbackComment(selectedFeedbackComment);
	}
	
	public void setReceivedFeedbackStudentModelBean(ReceivedFeedbackStudentModelBean receivedFeedbackStudentModelBean) {

		// Injected via ManagedProperty annotation
		this.receivedFeedbackStudentModelBean = receivedFeedbackStudentModelBean;
	}
}
