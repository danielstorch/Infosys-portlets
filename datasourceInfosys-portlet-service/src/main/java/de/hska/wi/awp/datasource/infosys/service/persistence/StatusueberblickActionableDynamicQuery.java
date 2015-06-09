package de.hska.wi.awp.datasource.infosys.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import de.hska.wi.awp.datasource.infosys.model.Statusueberblick;
import de.hska.wi.awp.datasource.infosys.service.StatusueberblickLocalServiceUtil;

/**
 * @author Daniel Storch
 * @generated
 */
public abstract class StatusueberblickActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public StatusueberblickActionableDynamicQuery() throws SystemException {
        setBaseLocalService(StatusueberblickLocalServiceUtil.getService());
        setClass(Statusueberblick.class);

        setClassLoader(de.hska.wi.awp.datasource.infosys.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("id");
    }
}
