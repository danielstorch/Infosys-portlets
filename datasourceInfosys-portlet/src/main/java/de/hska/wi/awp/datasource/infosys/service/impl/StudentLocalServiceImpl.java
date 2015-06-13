package de.hska.wi.awp.datasource.infosys.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import de.hska.wi.awp.datasource.infosys.NoSuchStudentException;
import de.hska.wi.awp.datasource.infosys.model.Student;
import de.hska.wi.awp.datasource.infosys.service.base.StudentLocalServiceBaseImpl;
import de.hska.wi.awp.datasource.infosys.service.persistence.StudentUtil;

/**
 * The implementation of the student local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link de.hska.wi.awp.datasource.infosys.service.StudentLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Daniel Storch
 * @see de.hska.wi.awp.datasource.infosys.service.base.StudentLocalServiceBaseImpl
 * @see de.hska.wi.awp.datasource.infosys.service.StudentLocalServiceUtil
 */
public class StudentLocalServiceImpl extends StudentLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link de.hska.wi.awp.datasource.infosys.service.StudentLocalServiceUtil} to access the student local service.
     */
	public List<Student> findByProjectId(long project_id) {
		List<Student> students = new ArrayList<Student>();
		
		try {
			students = StudentUtil.findByProject_id(project_id);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return students;
	}
	
	public Student findByStudenthskaId(String studenthskaId) {
		Student student = null;
		
		try {
			student = StudentUtil.findByStudenthskaId(studenthskaId);
		} catch (NoSuchStudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return student;
	}
}
