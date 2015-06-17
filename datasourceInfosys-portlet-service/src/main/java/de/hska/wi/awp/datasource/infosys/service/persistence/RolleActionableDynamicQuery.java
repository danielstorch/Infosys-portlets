package de.hska.wi.awp.datasource.infosys.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import de.hska.wi.awp.datasource.infosys.model.Rolle;
import de.hska.wi.awp.datasource.infosys.service.RolleLocalServiceUtil;

/**
 * @author Daniel Storch
 * @generated
 */
public abstract class RolleActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public RolleActionableDynamicQuery() throws SystemException {
        setBaseLocalService(RolleLocalServiceUtil.getService());
        setClass(Rolle.class);

        setClassLoader(de.hska.wi.awp.datasource.infosys.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("id");
    }
}
