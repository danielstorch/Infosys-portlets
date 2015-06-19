package de.hska.wi.awp.datasource.infosys.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import de.hska.wi.awp.datasource.infosys.model.Statusbericht_geplante_arbeit;
import de.hska.wi.awp.datasource.infosys.service.Statusbericht_geplante_arbeitLocalServiceUtil;

/**
 * @author Daniel Storch
 * @generated
 */
public abstract class Statusbericht_geplante_arbeitActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public Statusbericht_geplante_arbeitActionableDynamicQuery()
        throws SystemException {
        setBaseLocalService(Statusbericht_geplante_arbeitLocalServiceUtil.getService());
        setClass(Statusbericht_geplante_arbeit.class);

        setClassLoader(de.hska.wi.awp.datasource.infosys.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("id");
    }
}
