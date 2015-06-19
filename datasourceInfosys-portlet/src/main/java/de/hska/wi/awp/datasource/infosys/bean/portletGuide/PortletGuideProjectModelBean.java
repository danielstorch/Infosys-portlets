package de.hska.wi.awp.datasource.infosys.bean.portletGuide;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import de.hska.wi.awp.datasource.infosys.model.Project;

@ManagedBean(name = "portletGuideProjectModelBean")
@SessionScoped
public class PortletGuideProjectModelBean {

	private Project selectedProject;

	public Project getSelectedProject() {
		return selectedProject;
	}

	public void setSelectedProject(Project selectedProject) {
		this.selectedProject = selectedProject;
	}
}
