package de.hska.wi.awp.datasource.infosys.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import de.hska.wi.awp.datasource.infosys.model.Statusbericht_geplante_arbeit;
import de.hska.wi.awp.datasource.infosys.model.Statusberichte;
import de.hska.wi.awp.datasource.infosys.service.base.Statusbericht_geplante_arbeitLocalServiceBaseImpl;
import de.hska.wi.awp.datasource.infosys.service.persistence.Statusbericht_geplante_arbeitUtil;
import de.hska.wi.awp.datasource.infosys.service.persistence.StatusberichteUtil;

/**
 * The implementation of the statusbericht_geplante_arbeit local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link de.hska.wi.awp.datasource.infosys.service.Statusbericht_geplante_arbeitLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Daniel Storch
 * @see de.hska.wi.awp.datasource.infosys.service.base.Statusbericht_geplante_arbeitLocalServiceBaseImpl
 * @see de.hska.wi.awp.datasource.infosys.service.Statusbericht_geplante_arbeitLocalServiceUtil
 */
public class Statusbericht_geplante_arbeitLocalServiceImpl
    extends Statusbericht_geplante_arbeitLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link de.hska.wi.awp.datasource.infosys.service.Statusbericht_geplante_arbeitLocalServiceUtil} to access the statusbericht_geplante_arbeit local service.
     */
	
	/**
     * Logger Util
     */	
	private static final Log log = LogFactoryUtil.getLog(Statusbericht_geplante_arbeitLocalServiceImpl.class);
	
	public List<Statusbericht_geplante_arbeit> findByStatusbericht_id(long statusbericht_id) {
		log.debug("BEGIN: findByStatusbericht_id");
		
		List<Statusbericht_geplante_arbeit> statusbericht_geplante_arbeit = new ArrayList<Statusbericht_geplante_arbeit>();
		
		try {
			statusbericht_geplante_arbeit = Statusbericht_geplante_arbeitUtil.findByStatusbericht_id(statusbericht_id);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			log.error(e);
			e.printStackTrace();
		}
		
		log.debug("END: findByStatusbericht_id");
		return statusbericht_geplante_arbeit;
	}
}
