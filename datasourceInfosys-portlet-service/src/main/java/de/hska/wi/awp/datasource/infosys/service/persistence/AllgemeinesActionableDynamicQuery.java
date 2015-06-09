package de.hska.wi.awp.datasource.infosys.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import de.hska.wi.awp.datasource.infosys.model.Allgemeines;
import de.hska.wi.awp.datasource.infosys.service.AllgemeinesLocalServiceUtil;

/**
 * @author Daniel Storch
 * @generated
 */
public abstract class AllgemeinesActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public AllgemeinesActionableDynamicQuery() throws SystemException {
        setBaseLocalService(AllgemeinesLocalServiceUtil.getService());
        setClass(Allgemeines.class);

        setClassLoader(de.hska.wi.awp.datasource.infosys.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("id");
    }
}
