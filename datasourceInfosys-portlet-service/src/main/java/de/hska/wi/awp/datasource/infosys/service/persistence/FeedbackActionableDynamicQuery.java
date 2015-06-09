package de.hska.wi.awp.datasource.infosys.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import de.hska.wi.awp.datasource.infosys.model.Feedback;
import de.hska.wi.awp.datasource.infosys.service.FeedbackLocalServiceUtil;

/**
 * @author Daniel Storch
 * @generated
 */
public abstract class FeedbackActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public FeedbackActionableDynamicQuery() throws SystemException {
        setBaseLocalService(FeedbackLocalServiceUtil.getService());
        setClass(Feedback.class);

        setClassLoader(de.hska.wi.awp.datasource.infosys.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("id");
    }
}
