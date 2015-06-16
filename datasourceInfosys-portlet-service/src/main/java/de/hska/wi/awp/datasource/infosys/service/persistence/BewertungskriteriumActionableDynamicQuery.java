package de.hska.wi.awp.datasource.infosys.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import de.hska.wi.awp.datasource.infosys.model.Bewertungskriterium;
import de.hska.wi.awp.datasource.infosys.service.BewertungskriteriumLocalServiceUtil;

/**
 * @author Daniel Storch
 * @generated
 */
public abstract class BewertungskriteriumActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public BewertungskriteriumActionableDynamicQuery()
        throws SystemException {
        setBaseLocalService(BewertungskriteriumLocalServiceUtil.getService());
        setClass(Bewertungskriterium.class);

        setClassLoader(de.hska.wi.awp.datasource.infosys.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("id");
    }
}
