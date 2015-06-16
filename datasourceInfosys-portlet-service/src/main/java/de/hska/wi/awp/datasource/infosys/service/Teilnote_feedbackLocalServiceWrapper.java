package de.hska.wi.awp.datasource.infosys.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Teilnote_feedbackLocalService}.
 *
 * @author Daniel Storch
 * @see Teilnote_feedbackLocalService
 * @generated
 */
public class Teilnote_feedbackLocalServiceWrapper
    implements Teilnote_feedbackLocalService,
        ServiceWrapper<Teilnote_feedbackLocalService> {
    private Teilnote_feedbackLocalService _teilnote_feedbackLocalService;

    public Teilnote_feedbackLocalServiceWrapper(
        Teilnote_feedbackLocalService teilnote_feedbackLocalService) {
        _teilnote_feedbackLocalService = teilnote_feedbackLocalService;
    }

    /**
    * Adds the teilnote_feedback to the database. Also notifies the appropriate model listeners.
    *
    * @param teilnote_feedback the teilnote_feedback
    * @return the teilnote_feedback that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback addTeilnote_feedback(
        de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback teilnote_feedback)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _teilnote_feedbackLocalService.addTeilnote_feedback(teilnote_feedback);
    }

    /**
    * Creates a new teilnote_feedback with the primary key. Does not add the teilnote_feedback to the database.
    *
    * @param id the primary key for the new teilnote_feedback
    * @return the new teilnote_feedback
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback createTeilnote_feedback(
        long id) {
        return _teilnote_feedbackLocalService.createTeilnote_feedback(id);
    }

    /**
    * Deletes the teilnote_feedback with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the teilnote_feedback
    * @return the teilnote_feedback that was removed
    * @throws PortalException if a teilnote_feedback with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback deleteTeilnote_feedback(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _teilnote_feedbackLocalService.deleteTeilnote_feedback(id);
    }

    /**
    * Deletes the teilnote_feedback from the database. Also notifies the appropriate model listeners.
    *
    * @param teilnote_feedback the teilnote_feedback
    * @return the teilnote_feedback that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback deleteTeilnote_feedback(
        de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback teilnote_feedback)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _teilnote_feedbackLocalService.deleteTeilnote_feedback(teilnote_feedback);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _teilnote_feedbackLocalService.dynamicQuery();
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
        return _teilnote_feedbackLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Teilnote_feedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _teilnote_feedbackLocalService.dynamicQuery(dynamicQuery, start,
            end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Teilnote_feedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _teilnote_feedbackLocalService.dynamicQuery(dynamicQuery, start,
            end, orderByComparator);
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
        return _teilnote_feedbackLocalService.dynamicQueryCount(dynamicQuery);
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
        return _teilnote_feedbackLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback fetchTeilnote_feedback(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return _teilnote_feedbackLocalService.fetchTeilnote_feedback(id);
    }

    /**
    * Returns the teilnote_feedback with the primary key.
    *
    * @param id the primary key of the teilnote_feedback
    * @return the teilnote_feedback
    * @throws PortalException if a teilnote_feedback with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback getTeilnote_feedback(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _teilnote_feedbackLocalService.getTeilnote_feedback(id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _teilnote_feedbackLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the teilnote_feedbacks.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Teilnote_feedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of teilnote_feedbacks
    * @param end the upper bound of the range of teilnote_feedbacks (not inclusive)
    * @return the range of teilnote_feedbacks
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback> getTeilnote_feedbacks(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _teilnote_feedbackLocalService.getTeilnote_feedbacks(start, end);
    }

    /**
    * Returns the number of teilnote_feedbacks.
    *
    * @return the number of teilnote_feedbacks
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getTeilnote_feedbacksCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _teilnote_feedbackLocalService.getTeilnote_feedbacksCount();
    }

    /**
    * Updates the teilnote_feedback in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param teilnote_feedback the teilnote_feedback
    * @return the teilnote_feedback that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback updateTeilnote_feedback(
        de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback teilnote_feedback)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _teilnote_feedbackLocalService.updateTeilnote_feedback(teilnote_feedback);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _teilnote_feedbackLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _teilnote_feedbackLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _teilnote_feedbackLocalService.invokeMethod(name,
            parameterTypes, arguments);
    }

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback findByFeedback_idAndBewertungskriterium_id(
        long feedback_id, int bewertungskriterium_id) {
        return _teilnote_feedbackLocalService.findByFeedback_idAndBewertungskriterium_id(feedback_id,
            bewertungskriterium_id);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Teilnote_feedbackLocalService getWrappedTeilnote_feedbackLocalService() {
        return _teilnote_feedbackLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedTeilnote_feedbackLocalService(
        Teilnote_feedbackLocalService teilnote_feedbackLocalService) {
        _teilnote_feedbackLocalService = teilnote_feedbackLocalService;
    }

    @Override
    public Teilnote_feedbackLocalService getWrappedService() {
        return _teilnote_feedbackLocalService;
    }

    @Override
    public void setWrappedService(
        Teilnote_feedbackLocalService teilnote_feedbackLocalService) {
        _teilnote_feedbackLocalService = teilnote_feedbackLocalService;
    }
}
