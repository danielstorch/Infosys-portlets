package de.hska.wi.awp.datasource.infosys.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import de.hska.wi.awp.datasource.infosys.NoSuchProjectException;
import de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_infoException;
import de.hska.wi.awp.datasource.infosys.model.Statusbericht_info;
import de.hska.wi.awp.datasource.infosys.model.Student;
import de.hska.wi.awp.datasource.infosys.service.base.Statusbericht_infoLocalServiceBaseImpl;
import de.hska.wi.awp.datasource.infosys.service.persistence.Statusbericht_infoUtil;

/**
 * The implementation of the statusbericht_info local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link de.hska.wi.awp.datasource.infosys.service.Statusbericht_infoLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Daniel Storch
 * @see de.hska.wi.awp.datasource.infosys.service.base.Statusbericht_infoLocalServiceBaseImpl
 * @see de.hska.wi.awp.datasource.infosys.service.Statusbericht_infoLocalServiceUtil
 */
public class Statusbericht_infoLocalServiceImpl
    extends Statusbericht_infoLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link de.hska.wi.awp.datasource.infosys.service.Statusbericht_infoLocalServiceUtil} to access the statusbericht_info local service.
     */
	public List<Statusbericht_info> findByStatusbericht_id(Long statusbericht_id) {
		List<Statusbericht_info> statusbericht_info = new ArrayList<Statusbericht_info>();
		
		try {
			statusbericht_info = Statusbericht_infoUtil.findByStatusbericht_id(statusbericht_id);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return statusbericht_info;
	}
}
