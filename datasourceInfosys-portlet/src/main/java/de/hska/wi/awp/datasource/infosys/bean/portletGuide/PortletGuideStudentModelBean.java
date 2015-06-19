package de.hska.wi.awp.datasource.infosys.bean.portletGuide;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import de.hska.wi.awp.datasource.infosys.model.Student;

@ManagedBean(name = "portletGuideStudentModelBean")
@SessionScoped
public class PortletGuideStudentModelBean {

	private Student selectedStudent;

	public Student getSelectedStudent() {
		return selectedStudent;
	}

	public void setSelectedStudent(Student selectedStudent) {
		this.selectedStudent = selectedStudent;
	}
}
