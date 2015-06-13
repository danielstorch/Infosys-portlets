package de.hska.wi.awp.datasource.infosys.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import de.hska.wi.awp.datasource.infosys.model.Feedback;
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
	public List<Feedback> findByStudent_id(long student_id) {
		List<Feedback> feedbacks = new ArrayList<Feedback>();
		
		try {
			feedbacks = FeedbackUtil.findByStudent_id(student_id);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return feedbacks;
	}
}
