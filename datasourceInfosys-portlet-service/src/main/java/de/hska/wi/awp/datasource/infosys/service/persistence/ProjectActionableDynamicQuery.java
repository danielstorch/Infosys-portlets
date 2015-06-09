package de.hska.wi.awp.datasource.infosys.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import de.hska.wi.awp.datasource.infosys.model.Project;
import de.hska.wi.awp.datasource.infosys.service.ProjectLocalServiceUtil;

/**
 * @author Daniel Storch
 * @generated
 */
public abstract class ProjectActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public ProjectActionableDynamicQuery() throws SystemException {
        setBaseLocalService(ProjectLocalServiceUtil.getService());
        setClass(Project.class);

        setClassLoader(de.hska.wi.awp.datasource.infosys.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("id");
    }
}
