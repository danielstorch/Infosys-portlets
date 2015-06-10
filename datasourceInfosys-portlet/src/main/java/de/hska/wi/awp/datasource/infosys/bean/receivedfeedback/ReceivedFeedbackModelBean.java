package de.hska.wi.awp.datasource.infosys.bean.receivedfeedback;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.liferay.faces.util.logging.Logger;
import com.liferay.faces.util.logging.LoggerFactory;

@RequestScoped
@ManagedBean(name = "receivedFeedbackModelBean")
public class ReceivedFeedbackModelBean {

	/**
     * Logger Util
     */	
	private static final Logger logger = LoggerFactory.getLogger(ReceivedFeedbackBackingBean.class);
	
	private String studenthskaId;
	
	/**
     * This method generates the menu.
     * setCommand and setParam are there to retrieve information when an menuItem got clicked
     */
	@PostConstruct
    public void init() {
		
		
	}

	public String getStudenthskaId() {
		return studenthskaId;
	}

	public void setStudenthskaId(String studenthskaId) {
		this.studenthskaId = studenthskaId;
	}	
}
