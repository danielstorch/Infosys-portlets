package de.hska.wi.awp.datasource.infosys.service.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import de.hska.wi.awp.datasource.infosys.model.Feedback;
import de.hska.wi.awp.datasource.infosys.model.Student;
import de.hska.wi.awp.datasource.infosys.service.StudentLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.base.FeedbackLocalServiceBaseImpl;
import de.hska.wi.awp.datasource.infosys.service.persistence.FeedbackUtil;

/**
 * The implementation of the feedback local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link de.hska.wi.awp.datasource.infosys.service.FeedbackLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Daniel Storch
 * @see de.hska.wi.awp.datasource.infosys.service.base.FeedbackLocalServiceBaseImpl
 * @see de.hska.wi.awp.datasource.infosys.service.FeedbackLocalServiceUtil
 */
public class FeedbackLocalServiceImpl extends FeedbackLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link de.hska.wi.awp.datasource.infosys.service.FeedbackLocalServiceUtil} to access the feedback local service.
     */
	
	/**
     * Logger Util
     */	
	private static final Log log = LogFactoryUtil.getLog(FeedbackLocalServiceImpl.class);
	
	public List<Feedback> findByStudent_idAndFeedback_runden_nr(long student_id, int feedback_runden_nr) {
		log.debug("BEGIN: findByStudent_idAndFeedback_runden_nr");
		
		List<Feedback> feedbacks = new ArrayList<Feedback>();
		
		try {
			feedbacks = FeedbackUtil.findByStudent_idAndFeedback_runden_nr(student_id, feedback_runden_nr);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			log.error(e);
			e.printStackTrace();
		}
		
		log.debug("END: findByStudent_idAndFeedback_runden_nr");
		return feedbacks;
	}
	
	public int averageContributionOfStudent(long student_id, int feedback_runden_nr) {
		log.debug("BEGIN: averageContributionOfStudent");
		
		List<Feedback> feedbacks = new ArrayList<Feedback>();
		
		try {
			feedbacks = FeedbackUtil.findByStudent_idAndFeedback_runden_nr(student_id, feedback_runden_nr);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			log.error(e);
			e.printStackTrace();
		}
		
		int average = 0;
		for( Feedback f: feedbacks )
		{
			average += f.getBeitrag();
		}
		
		if(average != 0) {
			average /= feedbacks.size();
		}else {
			average = -1;
		}
		
		log.debug("END: averageContributionOfStudent");
		
		return average;
	}
	
	public LinkedHashMap averageContributionOfPorject(long project_id, int feedback_runden_nr) {
		log.debug("BEGIN: averageContributionOfPorject");
		
		List<Student> studentsOfGroupe = StudentLocalServiceUtil.findByProjectId(project_id);
		LinkedHashMap<String,Integer> contribution = new LinkedHashMap();
		
		for( Student s: studentsOfGroupe )
		{
			contribution.put(s.getFirstName() +" " + s.getLastName(), averageContributionOfStudent(s.getId(),feedback_runden_nr));
		}

		log.debug("END: averageContributionOfPorject");
		return contribution;
	}
}
