package de.hska.wi.awp.datasource.infosys.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FeedbackLocalService}.
 *
 * @author Daniel Storch
 * @see FeedbackLocalService
 * @generated
 */
public class FeedbackLocalServiceWrapper implements FeedbackLocalService,
    ServiceWrapper<FeedbackLocalService> {
    private FeedbackLocalService _feedbackLocalService;

    public FeedbackLocalServiceWrapper(
        FeedbackLocalService feedbackLocalService) {
        _feedbackLocalService = feedbackLocalService;
    }

    /**
    * Adds the feedback to the database. Also notifies the appropriate model listeners.
    *
    * @param feedback the feedback
    * @return the feedback that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Feedback addFeedback(
        de.hska.wi.awp.datasource.infosys.model.Feedback feedback)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _feedbackLocalService.addFeedback(feedback);
    }

    /**
    * Creates a new feedback with the primary key. Does not add the feedback to the database.
    *
    * @param id the primary key for the new feedback
    * @return the new feedback
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Feedback createFeedback(
        long id) {
        return _feedbackLocalService.createFeedback(id);
    }

    /**
    * Deletes the feedback with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the feedback
    * @return the feedback that was removed
    * @throws PortalException if a feedback with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Feedback deleteFeedback(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _feedbackLocalService.deleteFeedback(id);
    }

    /**
    * Deletes the feedback from the database. Also notifies the appropriate model listeners.
    *
    * @param feedback the feedback
    * @return the feedback that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Feedback deleteFeedback(
        de.hska.wi.awp.datasource.infosys.model.Feedback feedback)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _feedbackLocalService.deleteFeedback(feedback);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _feedbackLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _feedbackLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _feedbackLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _feedbackLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _feedbackLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _feedbackLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Feedback fetchFeedback(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return _feedbackLocalService.fetchFeedback(id);
    }

    /**
    * Returns the feedback with the primary key.
    *
    * @param id the primary key of the feedback
    * @return the feedback
    * @throws PortalException if a feedback with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Feedback getFeedback(long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _feedbackLocalService.getFeedback(id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _feedbackLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the feedbacks.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of feedbacks
    * @param end the upper bound of the range of feedbacks (not inclusive)
    * @return the range of feedbacks
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Feedback> getFeedbacks(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _feedbackLocalService.getFeedbacks(start, end);
    }

    /**
    * Returns the number of feedbacks.
    *
    * @return the number of feedbacks
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getFeedbacksCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _feedbackLocalService.getFeedbacksCount();
    }

    /**
    * Updates the feedback in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param feedback the feedback
    * @return the feedback that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Feedback updateFeedback(
        de.hska.wi.awp.datasource.infosys.model.Feedback feedback)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _feedbackLocalService.updateFeedback(feedback);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _feedbackLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _feedbackLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _feedbackLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Feedback> findByStudent_idAndFeedback_runden_nr(
        long student_id, int feedback_runden_nr) {
        return _feedbackLocalService.findByStudent_idAndFeedback_runden_nr(student_id,
            feedback_runden_nr);
    }

    @Override
    public int averageContributionOfStudent(long student_id,
        int feedback_runden_nr) {
        return _feedbackLocalService.averageContributionOfStudent(student_id,
            feedback_runden_nr);
    }

    @Override
    public java.util.LinkedHashMap averageContributionOfPorject(
        long project_id, int feedback_runden_nr) {
        return _feedbackLocalService.averageContributionOfPorject(project_id,
            feedback_runden_nr);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public FeedbackLocalService getWrappedFeedbackLocalService() {
        return _feedbackLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedFeedbackLocalService(
        FeedbackLocalService feedbackLocalService) {
        _feedbackLocalService = feedbackLocalService;
    }

    @Override
    public FeedbackLocalService getWrappedService() {
        return _feedbackLocalService;
    }

    @Override
    public void setWrappedService(FeedbackLocalService feedbackLocalService) {
        _feedbackLocalService = feedbackLocalService;
    }
}
