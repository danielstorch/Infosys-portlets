package de.hska.wi.awp.datasource.infosys.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import de.hska.wi.awp.datasource.infosys.event.ReceivedFeedbackEventHandler;
import de.hska.wi.awp.datasource.infosys.model.Bewertungskriterium;
import de.hska.wi.awp.datasource.infosys.service.BewertungskriteriumLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.base.BewertungskriteriumLocalServiceBaseImpl;

/**
 * The implementation of the bewertungskriterium local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link de.hska.wi.awp.datasource.infosys.service.BewertungskriteriumLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Daniel Storch
 * @see de.hska.wi.awp.datasource.infosys.service.base.BewertungskriteriumLocalServiceBaseImpl
 * @see de.hska.wi.awp.datasource.infosys.service.BewertungskriteriumLocalServiceUtil
 */
public class BewertungskriteriumLocalServiceImpl
    extends BewertungskriteriumLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link de.hska.wi.awp.datasource.infosys.service.BewertungskriteriumLocalServiceUtil} to access the bewertungskriterium local service.
     */
	
	/**
     * Logger Util
     */	
	private static final Log log = LogFactoryUtil.getLog(BewertungskriteriumLocalServiceImpl.class);
	
	public List<Bewertungskriterium> getAllBewertungskriterium(){
		log.debug("BEGIN: getAllBewertungskriterium");
		
		List<Bewertungskriterium> allBewertungskriterium = new ArrayList<Bewertungskriterium>();
		try {
			allBewertungskriterium = BewertungskriteriumLocalServiceUtil.getBewertungskriteriums(0, BewertungskriteriumLocalServiceUtil.getBewertungskriteriumsCount());
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			log.error(e);
			e.printStackTrace();
		}
		
		log.debug("END: getAllBewertungskriterium");
		return allBewertungskriterium;
	}
}
