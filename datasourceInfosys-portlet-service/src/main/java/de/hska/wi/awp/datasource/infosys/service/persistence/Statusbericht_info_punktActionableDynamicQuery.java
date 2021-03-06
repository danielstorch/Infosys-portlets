package de.hska.wi.awp.datasource.infosys.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import de.hska.wi.awp.datasource.infosys.model.Statusbericht_info_punkt;
import de.hska.wi.awp.datasource.infosys.service.Statusbericht_info_punktLocalServiceUtil;

/**
 * @author Daniel Storch
 * @generated
 */
public abstract class Statusbericht_info_punktActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public Statusbericht_info_punktActionableDynamicQuery()
        throws SystemException {
        setBaseLocalService(Statusbericht_info_punktLocalServiceUtil.getService());
        setClass(Statusbericht_info_punkt.class);

        setClassLoader(de.hska.wi.awp.datasource.infosys.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("id");
    }
}
