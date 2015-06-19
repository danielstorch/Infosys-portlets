package de.hska.wi.awp.datasource.infosys.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Statusbericht_detail_punktLocalService}.
 *
 * @author Daniel Storch
 * @see Statusbericht_detail_punktLocalService
 * @generated
 */
public class Statusbericht_detail_punktLocalServiceWrapper
    implements Statusbericht_detail_punktLocalService,
        ServiceWrapper<Statusbericht_detail_punktLocalService> {
    private Statusbericht_detail_punktLocalService _statusbericht_detail_punktLocalService;

    public Statusbericht_detail_punktLocalServiceWrapper(
        Statusbericht_detail_punktLocalService statusbericht_detail_punktLocalService) {
        _statusbericht_detail_punktLocalService = statusbericht_detail_punktLocalService;
    }

    /**
    * Adds the statusbericht_detail_punkt to the database. Also notifies the appropriate model listeners.
    *
    * @param statusbericht_detail_punkt the statusbericht_detail_punkt
    * @return the statusbericht_detail_punkt that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail_punkt addStatusbericht_detail_punkt(
        de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail_punkt statusbericht_detail_punkt)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _statusbericht_detail_punktLocalService.addStatusbericht_detail_punkt(statusbericht_detail_punkt);
    }

    /**
    * Creates a new statusbericht_detail_punkt with the primary key. Does not add the statusbericht_detail_punkt to the database.
    *
    * @param id the primary key for the new statusbericht_detail_punkt
    * @return the new statusbericht_detail_punkt
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail_punkt createStatusbericht_detail_punkt(
        long id) {
        return _statusbericht_detail_punktLocalService.createStatusbericht_detail_punkt(id);
    }

    /**
    * Deletes the statusbericht_detail_punkt with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the statusbericht_detail_punkt
    * @return the statusbericht_detail_punkt that was removed
    * @throws PortalException if a statusbericht_detail_punkt with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail_punkt deleteStatusbericht_detail_punkt(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _statusbericht_detail_punktLocalService.deleteStatusbericht_detail_punkt(id);
    }

    /**
    * Deletes the statusbericht_detail_punkt from the database. Also notifies the appropriate model listeners.
    *
    * @param statusbericht_detail_punkt the statusbericht_detail_punkt
    * @return the statusbericht_detail_punkt that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail_punkt deleteStatusbericht_detail_punkt(
        de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail_punkt statusbericht_detail_punkt)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _statusbericht_detail_punktLocalService.deleteStatusbericht_detail_punkt(statusbericht_detail_punkt);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _statusbericht_detail_punktLocalService.dynamicQuery();
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
        return _statusbericht_detail_punktLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_detail_punktModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _statusbericht_detail_punktLocalService.dynamicQuery(dynamicQuery,
            start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_detail_punktModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _statusbericht_detail_punktLocalService.dynamicQuery(dynamicQuery,
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
        return _statusbericht_detail_punktLocalService.dynamicQueryCount(dynamicQuery);
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
        return _statusbericht_detail_punktLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail_punkt fetchStatusbericht_detail_punkt(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return _statusbericht_detail_punktLocalService.fetchStatusbericht_detail_punkt(id);
    }

    /**
    * Returns the statusbericht_detail_punkt with the primary key.
    *
    * @param id the primary key of the statusbericht_detail_punkt
    * @return the statusbericht_detail_punkt
    * @throws PortalException if a statusbericht_detail_punkt with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail_punkt getStatusbericht_detail_punkt(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _statusbericht_detail_punktLocalService.getStatusbericht_detail_punkt(id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _statusbericht_detail_punktLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the statusbericht_detail_punkts.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_detail_punktModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of statusbericht_detail_punkts
    * @param end the upper bound of the range of statusbericht_detail_punkts (not inclusive)
    * @return the range of statusbericht_detail_punkts
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail_punkt> getStatusbericht_detail_punkts(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _statusbericht_detail_punktLocalService.getStatusbericht_detail_punkts(start,
            end);
    }

    /**
    * Returns the number of statusbericht_detail_punkts.
    *
    * @return the number of statusbericht_detail_punkts
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getStatusbericht_detail_punktsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _statusbericht_detail_punktLocalService.getStatusbericht_detail_punktsCount();
    }

    /**
    * Updates the statusbericht_detail_punkt in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param statusbericht_detail_punkt the statusbericht_detail_punkt
    * @return the statusbericht_detail_punkt that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail_punkt updateStatusbericht_detail_punkt(
        de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail_punkt statusbericht_detail_punkt)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _statusbericht_detail_punktLocalService.updateStatusbericht_detail_punkt(statusbericht_detail_punkt);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _statusbericht_detail_punktLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _statusbericht_detail_punktLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _statusbericht_detail_punktLocalService.invokeMethod(name,
            parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Statusbericht_detail_punktLocalService getWrappedStatusbericht_detail_punktLocalService() {
        return _statusbericht_detail_punktLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedStatusbericht_detail_punktLocalService(
        Statusbericht_detail_punktLocalService statusbericht_detail_punktLocalService) {
        _statusbericht_detail_punktLocalService = statusbericht_detail_punktLocalService;
    }

    @Override
    public Statusbericht_detail_punktLocalService getWrappedService() {
        return _statusbericht_detail_punktLocalService;
    }

    @Override
    public void setWrappedService(
        Statusbericht_detail_punktLocalService statusbericht_detail_punktLocalService) {
        _statusbericht_detail_punktLocalService = statusbericht_detail_punktLocalService;
    }
}
