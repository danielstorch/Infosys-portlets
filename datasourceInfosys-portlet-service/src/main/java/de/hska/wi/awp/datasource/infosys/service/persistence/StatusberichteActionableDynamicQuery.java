package de.hska.wi.awp.datasource.infosys.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import de.hska.wi.awp.datasource.infosys.model.Statusberichte;
import de.hska.wi.awp.datasource.infosys.service.StatusberichteLocalServiceUtil;

/**
 * @author Daniel Storch
 * @generated
 */
public abstract class StatusberichteActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public StatusberichteActionableDynamicQuery() throws SystemException {
        setBaseLocalService(StatusberichteLocalServiceUtil.getService());
        setClass(Statusberichte.class);

        setClassLoader(de.hska.wi.awp.datasource.infosys.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("id");
    }
}
