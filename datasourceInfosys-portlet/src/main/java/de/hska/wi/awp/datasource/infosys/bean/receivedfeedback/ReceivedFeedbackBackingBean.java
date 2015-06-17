package de.hska.wi.awp.datasource.infosys.bean.receivedfeedback;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UICommand;
import javax.faces.event.ActionEvent;

@ManagedBean(name = "receivedFeedbackBackingBean")
@RequestScoped
public class ReceivedFeedbackBackingBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8659247319999044869L;
	
	@ManagedProperty(name = "receivedFeedbackModelBean", value = "#{receivedFeedbackModelBean}")
	private ReceivedFeedbackModelBean receivedFeedbackModelBean;
	
	public void selectedFeedbackComment(String selectedFeedbackComment) {
		receivedFeedbackModelBean.setSelectedFeedbackComment(selectedFeedbackComment);
	}
	
	public void setReceivedFeedbackModelBean(ReceivedFeedbackModelBean receivedFeedbackModelBean) {

		// Injected via ManagedProperty annotation
		this.receivedFeedbackModelBean = receivedFeedbackModelBean;
	}
}
