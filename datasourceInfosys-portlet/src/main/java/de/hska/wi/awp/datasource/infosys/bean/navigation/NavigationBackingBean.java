package de.hska.wi.awp.datasource.infosys.bean.navigation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.portlet.ActionResponse;
import javax.xml.namespace.QName;

import org.primefaces.event.MenuActionEvent;
import org.primefaces.model.menu.MenuItem;
import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;

import com.liferay.faces.util.logging.Logger;
import com.liferay.faces.util.logging.LoggerFactory;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import de.hska.wi.awp.datasource.infosys.model.Project;
import de.hska.wi.awp.datasource.infosys.model.Rolle;
import de.hska.wi.awp.datasource.infosys.model.Student;
import de.hska.wi.awp.datasource.infosys.service.ProjectLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.RolleLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.StudentLocalServiceUtil;

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
     * Sends a event when an group got clicked.
     * The event parameter is the hskaid of the project.
     */
	public void groupSelected(ActionEvent event) {
		 MenuItem menuItem = ((MenuActionEvent) event).getMenuItem();
		 String hskaId = menuItem.getParams().get("projecthskaId").get(0);
		 System.out.println("projecthskaId got selected: "+hskaId);
		 
		 sendEvent(hskaId, "ipc.projectSelected");
	}
	
	/**
     * Sends a event when an student got clicked.
     * The event parameter is the hskaid of the student.
     * @param actionEvent from the menuItem to retrieve the parameter
     */
	public void studentSelected(ActionEvent event) {
		 MenuItem menuItem = ((MenuActionEvent) event).getMenuItem();
		 String hskaId = menuItem.getParams().get("studenthskaId").get(0);
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
}