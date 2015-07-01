package de.hska.wi.awp.datasource.infosys.bean.statusreports;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import de.hska.wi.awp.datasource.infosys.model.Project;
import de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail;
import de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail_punkt;
import de.hska.wi.awp.datasource.infosys.model.Statusbericht_geplante_arbeit;
import de.hska.wi.awp.datasource.infosys.model.Statusbericht_info;
import de.hska.wi.awp.datasource.infosys.model.Statusbericht_info_punkt;
import de.hska.wi.awp.datasource.infosys.model.Statusberichte;
import de.hska.wi.awp.datasource.infosys.model.Student;
import de.hska.wi.awp.datasource.infosys.service.Statusbericht_detailLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.Statusbericht_detail_punktLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.Statusbericht_geplante_arbeitLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.Statusbericht_infoLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.Statusbericht_info_punktLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.StatusberichteLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.StudentLocalServiceUtil;

/**
 * @author Michael Lautenschlaeger
 */

@ManagedBean(name = "statusreportsModelBean")
@SessionScoped
public class StatusreportsModelBean implements Serializable {
	/**
	 * Serializable
	 **/
	private static final long serialVersionUID = 1983565652702827101L;

	/**
	 * This is the selected Project from the NavigationPortlet
	 * The ReceivedFeedbackEventHandler sets this attribute when retrieving an event
	 */
	private Project selectedProject;

	/**
	 * Returns a List of all Statusreports for the selected Project
	 */
	public List<Statusberichte> getReportheader(){
		return StatusberichteLocalServiceUtil.findByProjectId(this.selectedProject.getId());
	}
	
	/**
	 * Returns a list of all infos for a statusreport
	 */
	public List<Statusbericht_info> getReportinfos(long berichtid) throws PortalException, SystemException{
		return Statusbericht_infoLocalServiceUtil.findByStatusbericht_id(berichtid);
	}
	
	/**
	 * Returns the characeristic of an info
	 */
	public Statusbericht_info_punkt getInfopoint(long infoid) throws PortalException, SystemException{
		return Statusbericht_info_punktLocalServiceUtil.getStatusbericht_info_punkt(infoid);
	}
	
	/**
	 * Returns a list of all details for a statusreport
	 */
	public List<Statusbericht_detail> getReportdetails(long berichtid) throws PortalException, SystemException{
		return Statusbericht_detailLocalServiceUtil.findByStatusbericht_id(berichtid);
	}
	
	/**
	 * Returns the characeristic of a detail
	 */
	public Statusbericht_detail_punkt getDetailpoint (long detailid) throws PortalException, SystemException {
		return Statusbericht_detail_punktLocalServiceUtil.getStatusbericht_detail_punkt(detailid);
	}
	

	/**
	 * Returns a list of all planned work in a statusreport
	 */
	public List<Statusbericht_geplante_arbeit> getPlannedwork(long berichtid) throws PortalException, SystemException{
		return Statusbericht_geplante_arbeitLocalServiceUtil.findByStatusbericht_id(berichtid);
	}
	
	/**
	 * Returns the worker to a planned work
	 */
	public Student getStudent(long studentid) throws PortalException, SystemException{
		return StudentLocalServiceUtil.getStudent(studentid);
	}
	
	
	// Getter/Setter
	public Project getSelectedProject() {
		return selectedProject;
	}

	public void setSelectedProject(Project selectedProject) {
		this.selectedProject = selectedProject;
	}
}
