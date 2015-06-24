package de.hska.wi.awp.datasource.infosys.service.impl;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import de.hska.wi.awp.datasource.infosys.NoSuchProjectException;
import de.hska.wi.awp.datasource.infosys.model.Project;
import de.hska.wi.awp.datasource.infosys.service.base.ProjectLocalServiceBaseImpl;
import de.hska.wi.awp.datasource.infosys.service.persistence.ProjectUtil;

/**
 * The implementation of the project local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link de.hska.wi.awp.datasource.infosys.service.ProjectLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Daniel Storch
 * @see de.hska.wi.awp.datasource.infosys.service.base.ProjectLocalServiceBaseImpl
 * @see de.hska.wi.awp.datasource.infosys.service.ProjectLocalServiceUtil
 */
public class ProjectLocalServiceImpl extends ProjectLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link de.hska.wi.awp.datasource.infosys.service.ProjectLocalServiceUtil} to access the project local service.
     */
	
	/**
     * Logger Util
     */	
	private static final Log log = LogFactoryUtil.getLog(ProjectLocalServiceImpl.class);
	
	public Project findByProjecthskaId(String projecthskaId) {
		log.debug("BEGIN: findByProjecthskaId");
		
		Project project = null;
		
		try {
			project = ProjectUtil.findByProjecthskaId(projecthskaId);
		} catch (NoSuchProjectException e) {
			// TODO Auto-generated catch block
			log.error("es wurden keine Fields für die projecthskaId: " + projecthskaId + " gefunden");
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			log.error(e);
			e.printStackTrace();
		}
	
		log.debug("END: findByProjecthskaId");
		return project;
	}
	
}
