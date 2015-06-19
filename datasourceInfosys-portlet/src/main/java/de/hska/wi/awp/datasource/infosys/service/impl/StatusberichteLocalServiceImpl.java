package de.hska.wi.awp.datasource.infosys.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import de.hska.wi.awp.datasource.infosys.model.Statusberichte;
import de.hska.wi.awp.datasource.infosys.service.base.StatusberichteLocalServiceBaseImpl;
import de.hska.wi.awp.datasource.infosys.service.persistence.StatusberichteUtil;

/**
 * The implementation of the statusberichte local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link de.hska.wi.awp.datasource.infosys.service.StatusberichteLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Daniel Storch
 * @see de.hska.wi.awp.datasource.infosys.service.base.StatusberichteLocalServiceBaseImpl
 * @see de.hska.wi.awp.datasource.infosys.service.StatusberichteLocalServiceUtil
 */
public class StatusberichteLocalServiceImpl
    extends StatusberichteLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link de.hska.wi.awp.datasource.infosys.service.StatusberichteLocalServiceUtil} to access the statusberichte local service.
     */
	
	public List<Statusberichte> findByProjectId(long project_id) {
		List<Statusberichte> statusberichte = new ArrayList<Statusberichte>();
		
		try {
			statusberichte = StatusberichteUtil.findByProject_id(project_id);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return statusberichte;
	}
	
}
