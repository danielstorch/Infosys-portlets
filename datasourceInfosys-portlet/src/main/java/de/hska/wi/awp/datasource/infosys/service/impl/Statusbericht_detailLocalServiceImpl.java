package de.hska.wi.awp.datasource.infosys.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_detailException;
import de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail;
import de.hska.wi.awp.datasource.infosys.model.Student;
import de.hska.wi.awp.datasource.infosys.service.base.Statusbericht_detailLocalServiceBaseImpl;
import de.hska.wi.awp.datasource.infosys.service.persistence.Statusbericht_detailUtil;

/**
 * The implementation of the statusbericht_detail local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link de.hska.wi.awp.datasource.infosys.service.Statusbericht_detailLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Daniel Storch
 * @see de.hska.wi.awp.datasource.infosys.service.base.Statusbericht_detailLocalServiceBaseImpl
 * @see de.hska.wi.awp.datasource.infosys.service.Statusbericht_detailLocalServiceUtil
 */
public class Statusbericht_detailLocalServiceImpl
    extends Statusbericht_detailLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link de.hska.wi.awp.datasource.infosys.service.Statusbericht_detailLocalServiceUtil} to access the statusbericht_detail local service.
     */
	
	/**
     * Logger Util
     */	
	private static final Log log = LogFactoryUtil.getLog(Statusbericht_detailLocalServiceImpl.class);
	
	public List<Statusbericht_detail> findByStatusbericht_id(long statusbericht_id) {
		log.debug("BEGIN: findByStatusbericht_id");
		
		List<Statusbericht_detail> statusbericht_detail = new ArrayList<Statusbericht_detail>();
		
		try {
			statusbericht_detail = Statusbericht_detailUtil.findByStatusbericht_id(statusbericht_id);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			log.error(e);
			e.printStackTrace();
		}
	
		log.debug("END: findByStatusbericht_id");
		return statusbericht_detail;
	}
}
