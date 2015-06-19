package de.hska.wi.awp.datasource.infosys.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link StatusberichteLocalService}.
 *
 * @author Daniel Storch
 * @see StatusberichteLocalService
 * @generated
 */
public class StatusberichteLocalServiceWrapper
    implements StatusberichteLocalService,
        ServiceWrapper<StatusberichteLocalService> {
    private StatusberichteLocalService _statusberichteLocalService;

    public StatusberichteLocalServiceWrapper(
        StatusberichteLocalService statusberichteLocalService) {
        _statusberichteLocalService = statusberichteLocalService;
    }

    /**
    * Adds the statusberichte to the database. Also notifies the appropriate model listeners.
    *
    * @param statusberichte the statusberichte
    * @return the statusberichte that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusberichte addStatusberichte(
        de.hska.wi.awp.datasource.infosys.model.Statusberichte statusberichte)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _statusberichteLocalService.addStatusberichte(statusberichte);
    }

    /**
    * Creates a new statusberichte with the primary key. Does not add the statusberichte to the database.
    *
    * @param id the primary key for the new statusberichte
    * @return the new statusberichte
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusberichte createStatusberichte(
        long id) {
        return _statusberichteLocalService.createStatusberichte(id);
    }

    /**
    * Deletes the statusberichte with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the statusberichte
    * @return the statusberichte that was removed
    * @throws PortalException if a statusberichte with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusberichte deleteStatusberichte(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _statusberichteLocalService.deleteStatusberichte(id);
    }

    /**
    * Deletes the statusberichte from the database. Also notifies the appropriate model listeners.
    *
    * @param statusberichte the statusberichte
    * @return the statusberichte that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusberichte deleteStatusberichte(
        de.hska.wi.awp.datasource.infosys.model.Statusberichte statusberichte)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _statusberichteLocalService.deleteStatusberichte(statusberichte);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _statusberichteLocalService.dynamicQuery();
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
        return _statusberichteLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.StatusberichteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _statusberichteLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.StatusberichteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _statusberichteLocalService.dynamicQuery(dynamicQuery, start,
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
        return _statusberichteLocalService.dynamicQueryCount(dynamicQuery);
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
        return _statusberichteLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusberichte fetchStatusberichte(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return _statusberichteLocalService.fetchStatusberichte(id);
    }

    /**
    * Returns the statusberichte with the primary key.
    *
    * @param id the primary key of the statusberichte
    * @return the statusberichte
    * @throws PortalException if a statusberichte with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusberichte getStatusberichte(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _statusberichteLocalService.getStatusberichte(id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _statusberichteLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the statusberichtes.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.StatusberichteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of statusberichtes
    * @param end the upper bound of the range of statusberichtes (not inclusive)
    * @return the range of statusberichtes
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusberichte> getStatusberichtes(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _statusberichteLocalService.getStatusberichtes(start, end);
    }

    /**
    * Returns the number of statusberichtes.
    *
    * @return the number of statusberichtes
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getStatusberichtesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _statusberichteLocalService.getStatusberichtesCount();
    }

    /**
    * Updates the statusberichte in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param statusberichte the statusberichte
    * @return the statusberichte that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusberichte updateStatusberichte(
        de.hska.wi.awp.datasource.infosys.model.Statusberichte statusberichte)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _statusberichteLocalService.updateStatusberichte(statusberichte);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _statusberichteLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _statusberichteLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _statusberichteLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusberichte> findByProjectId(
        long project_id) {
        return _statusberichteLocalService.findByProjectId(project_id);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public StatusberichteLocalService getWrappedStatusberichteLocalService() {
        return _statusberichteLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedStatusberichteLocalService(
        StatusberichteLocalService statusberichteLocalService) {
        _statusberichteLocalService = statusberichteLocalService;
    }

    @Override
    public StatusberichteLocalService getWrappedService() {
        return _statusberichteLocalService;
    }

    @Override
    public void setWrappedService(
        StatusberichteLocalService statusberichteLocalService) {
        _statusberichteLocalService = statusberichteLocalService;
    }
}
