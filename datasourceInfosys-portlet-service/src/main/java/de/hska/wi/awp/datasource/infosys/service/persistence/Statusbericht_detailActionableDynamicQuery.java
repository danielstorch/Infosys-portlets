package de.hska.wi.awp.datasource.infosys.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail;
import de.hska.wi.awp.datasource.infosys.service.Statusbericht_detailLocalServiceUtil;

/**
 * @author Daniel Storch
 * @generated
 */
public abstract class Statusbericht_detailActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public Statusbericht_detailActionableDynamicQuery()
        throws SystemException {
        setBaseLocalService(Statusbericht_detailLocalServiceUtil.getService());
        setClass(Statusbericht_detail.class);

        setClassLoader(de.hska.wi.awp.datasource.infosys.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("id");
    }
}
