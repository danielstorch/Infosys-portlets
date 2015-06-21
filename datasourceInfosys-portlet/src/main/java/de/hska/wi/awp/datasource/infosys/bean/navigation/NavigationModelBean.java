package de.hska.wi.awp.datasource.infosys.bean.navigation;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;

import com.liferay.faces.util.logging.Logger;
import com.liferay.faces.util.logging.LoggerFactory;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import de.hska.wi.awp.datasource.infosys.model.Project;
import de.hska.wi.awp.datasource.infosys.model.Student;
import de.hska.wi.awp.datasource.infosys.service.ProjectLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.RolleLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.StudentLocalServiceUtil;

/**
 * The ModelBean for the Navigations Portlet.
 * It dynamically generates the navigation-menu the data in the DB.
 *
 * @author Daniel Storch
 */

@ManagedBean(name = "navigationModelBean")
@RequestScoped
public class NavigationModelBean {
	
	 /**
     * Logger Util
     */
	private static final Logger logger = LoggerFactory.getLogger(NavigationModelBean.class);
	
	/**
     * Menu model
     */
	private MenuModel menuModel;
	
	/**
     * This method generates the menu.
     * setCommand and setParam are there to retrieve information when an menuItem got clicked
     */
	@PostConstruct
    public void init() {
		menuModel = new DefaultMenuModel();
      
		List<Project> allProjects = new ArrayList<Project>();
		try {
			allProjects = ProjectLocalServiceUtil.getProjects(0, ProjectLocalServiceUtil.getProjectsCount());
			System.out.println("Projects count "+ProjectLocalServiceUtil.getProjectsCount());
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			logger.error(e);
			e.printStackTrace();
		}
		
		
		for(int i = 0; i < allProjects.size(); i++) {
			DefaultSubMenu groupMenu = new DefaultSubMenu(allProjects.get(i).getName());
			DefaultMenuItem groupMenuItem = new DefaultMenuItem(allProjects.get(i).getName());
			//TODO: STRING Generalisieren
			DefaultSubMenu studentSubMenu = new DefaultSubMenu("Students");
			
			//Ajax doesn't work with IPC https://www.liferay.com/de/community/forums/-/message_boards/message/29973568
			groupMenuItem.setAjax(false);
			groupMenuItem.setId(allProjects.get(i).getProjecthskaId());
			groupMenuItem.setCommand("#{navigationBackingBean.groupSelected}");
			groupMenuItem.setParam("projecthskaId", allProjects.get(i).getProjecthskaId());
			
			groupMenu.addElement(groupMenuItem);
			groupMenu.addElement(studentSubMenu);
			
			List<Student> studentsOfGroupe = StudentLocalServiceUtil.findByProjectId(allProjects.get(i).getPrimaryKey());
			System.out.println("Project "+ allProjects.get(i).getName() + " has "+studentsOfGroupe.size() + " Students");
			
			for(int j = 0; j < studentsOfGroupe.size(); j++) {
				String studentLastName = studentsOfGroupe.get(j).getLastName();
				String studentFirstName = studentsOfGroupe.get(j).getFirstName();
				
				Long studentRoleId = studentsOfGroupe.get(j).getRole();
				if(studentRoleId != 0) {
					String studentRole = null;
					try {
						studentRole = RolleLocalServiceUtil.getRolle(studentRoleId).getShortName();
					} catch (PortalException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SystemException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					studentLastName += " ("+studentRole+")";
				}
				
				DefaultMenuItem studentMenuItem = new DefaultMenuItem(studentFirstName + " " + studentLastName);
				
				studentMenuItem.setAjax(false);
				studentMenuItem.setCommand("#{navigationBackingBean.studentSelected}");
				studentMenuItem.setParam("studenthskaId", studentsOfGroupe.get(j).getStudenthskaId());
				
				studentSubMenu.addElement(studentMenuItem);
			}
			
			menuModel.addElement(groupMenu);
		}
	}
	
	public MenuModel getMenuModel() {
		return menuModel;
	}

	public void setMenuModel(MenuModel menuModel) {
		this.menuModel = menuModel;
	}
}
