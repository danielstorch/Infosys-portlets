package de.hska.wi.awp.datasource.infosys.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback;
import de.hska.wi.awp.datasource.infosys.service.Teilnote_feedbackLocalServiceUtil;

/**
 * @author Daniel Storch
 * @generated
 */
public abstract class Teilnote_feedbackActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public Teilnote_feedbackActionableDynamicQuery() throws SystemException {
        setBaseLocalService(Teilnote_feedbackLocalServiceUtil.getService());
        setClass(Teilnote_feedback.class);

        setClassLoader(de.hska.wi.awp.datasource.infosys.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("id");
    }
}
