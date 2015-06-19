package de.hska.wi.awp.datasource.infosys.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Statusbericht_info_punktLocalService}.
 *
 * @author Daniel Storch
 * @see Statusbericht_info_punktLocalService
 * @generated
 */
public class Statusbericht_info_punktLocalServiceWrapper
    implements Statusbericht_info_punktLocalService,
        ServiceWrapper<Statusbericht_info_punktLocalService> {
    private Statusbericht_info_punktLocalService _statusbericht_info_punktLocalService;

    public Statusbericht_info_punktLocalServiceWrapper(
        Statusbericht_info_punktLocalService statusbericht_info_punktLocalService) {
        _statusbericht_info_punktLocalService = statusbericht_info_punktLocalService;
    }

    /**
    * Adds the statusbericht_info_punkt to the database. Also notifies the appropriate model listeners.
    *
    * @param statusbericht_info_punkt the statusbericht_info_punkt
    * @return the statusbericht_info_punkt that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_info_punkt addStatusbericht_info_punkt(
        de.hska.wi.awp.datasource.infosys.model.Statusbericht_info_punkt statusbericht_info_punkt)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _statusbericht_info_punktLocalService.addStatusbericht_info_punkt(statusbericht_info_punkt);
    }

    /**
    * Creates a new statusbericht_info_punkt with the primary key. Does not add the statusbericht_info_punkt to the database.
    *
    * @param id the primary key for the new statusbericht_info_punkt
    * @return the new statusbericht_info_punkt
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_info_punkt createStatusbericht_info_punkt(
        long id) {
        return _statusbericht_info_punktLocalService.createStatusbericht_info_punkt(id);
    }

    /**
    * Deletes the statusbericht_info_punkt with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the statusbericht_info_punkt
    * @return the statusbericht_info_punkt that was removed
    * @throws PortalException if a statusbericht_info_punkt with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_info_punkt deleteStatusbericht_info_punkt(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _statusbericht_info_punktLocalService.deleteStatusbericht_info_punkt(id);
    }

    /**
    * Deletes the statusbericht_info_punkt from the database. Also notifies the appropriate model listeners.
    *
    * @param statusbericht_info_punkt the statusbericht_info_punkt
    * @return the statusbericht_info_punkt that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_info_punkt deleteStatusbericht_info_punkt(
        de.hska.wi.awp.datasource.infosys.model.Statusbericht_info_punkt statusbericht_info_punkt)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _statusbericht_info_punktLocalService.deleteStatusbericht_info_punkt(statusbericht_info_punkt);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _statusbericht_info_punktLocalService.dynamicQuery();
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
        return _statusbericht_info_punktLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_info_punktModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _statusbericht_info_punktLocalService.dynamicQuery(dynamicQuery,
            start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_info_punktModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _statusbericht_info_punktLocalService.dynamicQuery(dynamicQuery,
            start, end, orderByComparator);
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
        return _statusbericht_info_punktLocalService.dynamicQueryCount(dynamicQuery);
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
        return _statusbericht_info_punktLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_info_punkt fetchStatusbericht_info_punkt(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return _statusbericht_info_punktLocalService.fetchStatusbericht_info_punkt(id);
    }

    /**
    * Returns the statusbericht_info_punkt with the primary key.
    *
    * @param id the primary key of the statusbericht_info_punkt
    * @return the statusbericht_info_punkt
    * @throws PortalException if a statusbericht_info_punkt with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_info_punkt getStatusbericht_info_punkt(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _statusbericht_info_punktLocalService.getStatusbericht_info_punkt(id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _statusbericht_info_punktLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the statusbericht_info_punkts.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_info_punktModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of statusbericht_info_punkts
    * @param end the upper bound of the range of statusbericht_info_punkts (not inclusive)
    * @return the range of statusbericht_info_punkts
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusbericht_info_punkt> getStatusbericht_info_punkts(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _statusbericht_info_punktLocalService.getStatusbericht_info_punkts(start,
            end);
    }

    /**
    * Returns the number of statusbericht_info_punkts.
    *
    * @return the number of statusbericht_info_punkts
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getStatusbericht_info_punktsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _statusbericht_info_punktLocalService.getStatusbericht_info_punktsCount();
    }

    /**
    * Updates the statusbericht_info_punkt in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param statusbericht_info_punkt the statusbericht_info_punkt
    * @return the statusbericht_info_punkt that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_info_punkt updateStatusbericht_info_punkt(
        de.hska.wi.awp.datasource.infosys.model.Statusbericht_info_punkt statusbericht_info_punkt)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _statusbericht_info_punktLocalService.updateStatusbericht_info_punkt(statusbericht_info_punkt);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _statusbericht_info_punktLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _statusbericht_info_punktLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _statusbericht_info_punktLocalService.invokeMethod(name,
            parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Statusbericht_info_punktLocalService getWrappedStatusbericht_info_punktLocalService() {
        return _statusbericht_info_punktLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedStatusbericht_info_punktLocalService(
        Statusbericht_info_punktLocalService statusbericht_info_punktLocalService) {
        _statusbericht_info_punktLocalService = statusbericht_info_punktLocalService;
    }

    @Override
    public Statusbericht_info_punktLocalService getWrappedService() {
        return _statusbericht_info_punktLocalService;
    }

    @Override
    public void setWrappedService(
        Statusbericht_info_punktLocalService statusbericht_info_punktLocalService) {
        _statusbericht_info_punktLocalService = statusbericht_info_punktLocalService;
    }
}
