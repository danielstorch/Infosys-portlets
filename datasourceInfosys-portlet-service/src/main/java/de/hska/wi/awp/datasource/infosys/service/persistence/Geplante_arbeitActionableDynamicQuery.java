package de.hska.wi.awp.datasource.infosys.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import de.hska.wi.awp.datasource.infosys.model.Geplante_arbeit;
import de.hska.wi.awp.datasource.infosys.service.Geplante_arbeitLocalServiceUtil;

/**
 * @author Daniel Storch
 * @generated
 */
public abstract class Geplante_arbeitActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public Geplante_arbeitActionableDynamicQuery() throws SystemException {
        setBaseLocalService(Geplante_arbeitLocalServiceUtil.getService());
        setClass(Geplante_arbeit.class);

        setClassLoader(de.hska.wi.awp.datasource.infosys.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("id");
    }
}
