package de.hska.wi.awp.datasource.infosys.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import de.hska.wi.awp.datasource.infosys.NoSuchTeilnote_feedbackException;
import de.hska.wi.awp.datasource.infosys.model.Student;
import de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback;
import de.hska.wi.awp.datasource.infosys.service.base.Teilnote_feedbackLocalServiceBaseImpl;
import de.hska.wi.awp.datasource.infosys.service.persistence.Teilnote_feedbackUtil;

/**
 * The implementation of the teilnote_feedback local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link de.hska.wi.awp.datasource.infosys.service.Teilnote_feedbackLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Daniel Storch
 * @see de.hska.wi.awp.datasource.infosys.service.base.Teilnote_feedbackLocalServiceBaseImpl
 * @see de.hska.wi.awp.datasource.infosys.service.Teilnote_feedbackLocalServiceUtil
 */
public class Teilnote_feedbackLocalServiceImpl
    extends Teilnote_feedbackLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link de.hska.wi.awp.datasource.infosys.service.Teilnote_feedbackLocalServiceUtil} to access the teilnote_feedback local service.
     */
	public Teilnote_feedback findByFeedback_idAndBewertungskriterium_id(long feedback_id, long bewertungskriterium_id) {
		Teilnote_feedback teilnote_feedback = null;
		try {
			teilnote_feedback = Teilnote_feedbackUtil.findByFeedback_idAndBewertungskriterium_id(feedback_id, bewertungskriterium_id);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchTeilnote_feedbackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return teilnote_feedback;
	}
}
