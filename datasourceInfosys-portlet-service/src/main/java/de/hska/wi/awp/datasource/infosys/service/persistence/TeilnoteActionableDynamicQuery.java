package de.hska.wi.awp.datasource.infosys.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import de.hska.wi.awp.datasource.infosys.model.Teilnote;
import de.hska.wi.awp.datasource.infosys.service.TeilnoteLocalServiceUtil;

/**
 * @author Daniel Storch
 * @generated
 */
public abstract class TeilnoteActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public TeilnoteActionableDynamicQuery() throws SystemException {
        setBaseLocalService(TeilnoteLocalServiceUtil.getService());
        setClass(Teilnote.class);

        setClassLoader(de.hska.wi.awp.datasource.infosys.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("id");
    }
}
