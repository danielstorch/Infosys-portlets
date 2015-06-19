package de.hska.wi.awp.datasource.infosys.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import de.hska.wi.awp.datasource.infosys.model.Statusbericht_info;
import de.hska.wi.awp.datasource.infosys.service.Statusbericht_infoLocalServiceUtil;

/**
 * @author Daniel Storch
 * @generated
 */
public abstract class Statusbericht_infoActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public Statusbericht_infoActionableDynamicQuery() throws SystemException {
        setBaseLocalService(Statusbericht_infoLocalServiceUtil.getService());
        setClass(Statusbericht_info.class);

        setClassLoader(de.hska.wi.awp.datasource.infosys.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("id");
    }
}
