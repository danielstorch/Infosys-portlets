package de.hska.wi.awp.datasource.infosys.bean.receivedfeedback;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;

import com.liferay.faces.util.logging.Logger;
import com.liferay.faces.util.logging.LoggerFactory;
import com.liferay.portal.kernel.exception.SystemException;

import de.hska.wi.awp.datasource.infosys.bean.navigation.NavigationBackingBean;
import de.hska.wi.awp.datasource.infosys.model.Project;
import de.hska.wi.awp.datasource.infosys.model.Student;
import de.hska.wi.awp.datasource.infosys.service.ProjectLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.StudentLocalServiceUtil;

/**
 * 
 * @author Daniel Storch
 */

@ManagedBean(name = "receivedFeedbackBackingBean")
@RequestScoped
public class ReceivedFeedbackBackingBean implements Serializable{

	/**
	 * Serializable
	 */
	private static final long serialVersionUID = 7688649824548474421L;

	/**
     * Logger Util
     */	
	private static final Logger logger = LoggerFactory.getLogger(ReceivedFeedbackBackingBean.class);
	

	// Injections
	@ManagedProperty(name = "receivedFeedbackModelBean", value = "#{receivedFeedbackModelBean}")
	private ReceivedFeedbackModelBean receivedFeedbackModelBean;
	
	/**
     * This method generates the menu.
     * setCommand and setParam are there to retrieve information when an menuItem got clicked
     */
	@PostConstruct
    public void init() {
		
		
	}
}
