package de.hska.wi.awp.datasource.infosys.bean.navigation;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;

import de.hska.wi.awp.datasource.infosys.model.Project;
import de.hska.wi.awp.datasource.infosys.model.Student;
import de.hska.wi.awp.datasource.infosys.service.ProjectLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.StudentLocalServiceUtil;

/**
 * The ModelBean for the Navigations Portlet.
 * Retrieves all projects in the @PostConstruct method and sets the attribute
 * It also contains the selected MenuItem to retain the active state
 * 
 * @author Daniel Storch
 */

@ManagedBean(name = "navigationModelBean")
@SessionScoped
public class NavigationModelBean implements Serializable{
	
	 /**
	 * Serializable
	 */
	private static final long serialVersionUID = 1141179050804862311L;

	/**
     * Logger Util
     */
	private static final Log log = LogFactoryUtil.getLog(NavigationModelBean.class);
	
	/**
     * All Projects of this semester
     */
	private List<Project> allProjects;
	
	/**
     * Selected MenuItem to retain the State
     * This value is either the studenthskaId or the grouphskaId
     */
	private String selectedMenuItem;
	
	/**
     * Gets all projects and sets the attribute allProjects
     */
	@PostConstruct
    public void init() {
		log.debug("BEGIN: init");
		
		try {
			this.allProjects = ProjectLocalServiceUtil.getProjects(0, ProjectLocalServiceUtil.getProjectsCount());
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			log.error(e);
			e.printStackTrace();
		}
		
		log.debug("END: init");
	}
	
	/**
	 * This method gets invoked from the navigation.xhtml to generate the student menuItem
     * @param project_id to get all students of an project
     */
	public List<Student> getStudentsOfProject(long project_Id){
		return StudentLocalServiceUtil.findByProjectId(project_Id);
	}
	
	public String getSelectedMenuItem() {
		return selectedMenuItem;
	}

	public void setSelectedMenuItem(String selectedMenuItem) {
		this.selectedMenuItem = selectedMenuItem;
	}

	public List<Project> getAllProjects() {
		return allProjects;
	}

	public void setAllProjects(List<Project> allProjects) {
		this.allProjects = allProjects;
	}
}
