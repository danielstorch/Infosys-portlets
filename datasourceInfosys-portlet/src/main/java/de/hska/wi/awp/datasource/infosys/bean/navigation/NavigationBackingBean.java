package de.hska.wi.awp.datasource.infosys.bean.navigation;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.portlet.ActionResponse;
import javax.xml.namespace.QName;

import com.liferay.faces.util.logging.Logger;
import com.liferay.faces.util.logging.LoggerFactory;

/**
 * The BackingBean for the Navigations Portlet.
 * Sends events to other Portlets which student or project got clicked.
 *
 * @author Daniel Storch
 */

@ManagedBean(name = "navigationBackingBean")
@RequestScoped
public class NavigationBackingBean implements Serializable{

	/**
	 * Serializable
	 */
	private static final long serialVersionUID = -3925205427112724628L;
	
	 /**
     * Logger Util
     */
	private static final Logger logger = LoggerFactory.getLogger(NavigationBackingBean.class);
	
	/**
     * Injecting navigationModelBean
     */
	@ManagedProperty(name = "navigationModelBean", value = "#{navigationModelBean}")
	private NavigationModelBean navigationModelBean;
	
	/**
     * Sends a event when an group got clicked.
     * The event parameter is the hskaid of the project.
     * Sets the selectedMenuItem for the acitveState
     * @param String hskaId from the menuItem to retrieve the parameter
     */
	public void groupSelected(String hskaId) {
		 navigationModelBean.setSelectedMenuItem(hskaId);
		 System.out.println("projecthskaId got selected: "+hskaId);
		 
		 sendEvent(hskaId, "ipc.projectSelected");
	}
	
	/**
     * Sends a event when an student got clicked.
     * The event parameter is the hskaId of the student.
     * Sets the selectedMenuItem for the acitveState
     * @param String hskaId from the menuItem to retrieve the parameter
     */
	public void studentSelected(String hskaId) {
		 navigationModelBean.setSelectedMenuItem(hskaId);
		 System.out.println("studenthskaId got selected: "+hskaId);
		 
		 sendEvent(hskaId, "ipc.studentSelected");
	}	
	
	/**
     * Handling the event that will be send
     * @param value that will be send
     * @param eventName is the name of the event specified in the portlet.xml
     */
	private void sendEvent(String value, String eventName) {
		
		QName qName = new QName("http://liferay.com/events", eventName);
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		ActionResponse actionResponse = (ActionResponse) externalContext.getResponse();
		
		Serializable eventPayload = value;

		System.out.println("EventName "+ eventName + " with value: " + value +" got send");
		actionResponse.setEvent(qName, eventPayload);
	}
	
	public void setNavigationModelBean(NavigationModelBean navigationModelBean) {
		this.navigationModelBean = navigationModelBean;
	}
}