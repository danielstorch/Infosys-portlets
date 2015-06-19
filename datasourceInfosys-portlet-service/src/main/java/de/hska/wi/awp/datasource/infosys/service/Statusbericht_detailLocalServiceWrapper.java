package de.hska.wi.awp.datasource.infosys.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Statusbericht_detailLocalService}.
 *
 * @author Daniel Storch
 * @see Statusbericht_detailLocalService
 * @generated
 */
public class Statusbericht_detailLocalServiceWrapper
    implements Statusbericht_detailLocalService,
        ServiceWrapper<Statusbericht_detailLocalService> {
    private Statusbericht_detailLocalService _statusbericht_detailLocalService;

    public Statusbericht_detailLocalServiceWrapper(
        Statusbericht_detailLocalService statusbericht_detailLocalService) {
        _statusbericht_detailLocalService = statusbericht_detailLocalService;
    }

    /**
    * Adds the statusbericht_detail to the database. Also notifies the appropriate model listeners.
    *
    * @param statusbericht_detail the statusbericht_detail
    * @return the statusbericht_detail that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail addStatusbericht_detail(
        de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail statusbericht_detail)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _statusbericht_detailLocalService.addStatusbericht_detail(statusbericht_detail);
    }

    /**
    * Creates a new statusbericht_detail with the primary key. Does not add the statusbericht_detail to the database.
    *
    * @param id the primary key for the new statusbericht_detail
    * @return the new statusbericht_detail
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail createStatusbericht_detail(
        long id) {
        return _statusbericht_detailLocalService.createStatusbericht_detail(id);
    }

    /**
    * Deletes the statusbericht_detail with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the statusbericht_detail
    * @return the statusbericht_detail that was removed
    * @throws PortalException if a statusbericht_detail with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail deleteStatusbericht_detail(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _statusbericht_detailLocalService.deleteStatusbericht_detail(id);
    }

    /**
    * Deletes the statusbericht_detail from the database. Also notifies the appropriate model listeners.
    *
    * @param statusbericht_detail the statusbericht_detail
    * @return the statusbericht_detail that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail deleteStatusbericht_detail(
        de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail statusbericht_detail)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _statusbericht_detailLocalService.deleteStatusbericht_detail(statusbericht_detail);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _statusbericht_detailLocalService.dynamicQuery();
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
        return _statusbericht_detailLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_detailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _statusbericht_detailLocalService.dynamicQuery(dynamicQuery,
            start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_detailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _statusbericht_detailLocalService.dynamicQuery(dynamicQuery,
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
        return _statusbericht_detailLocalService.dynamicQueryCount(dynamicQuery);
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
        return _statusbericht_detailLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail fetchStatusbericht_detail(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return _statusbericht_detailLocalService.fetchStatusbericht_detail(id);
    }

    /**
    * Returns the statusbericht_detail with the primary key.
    *
    * @param id the primary key of the statusbericht_detail
    * @return the statusbericht_detail
    * @throws PortalException if a statusbericht_detail with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail getStatusbericht_detail(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _statusbericht_detailLocalService.getStatusbericht_detail(id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _statusbericht_detailLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the statusbericht_details.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_detailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of statusbericht_details
    * @param end the upper bound of the range of statusbericht_details (not inclusive)
    * @return the range of statusbericht_details
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail> getStatusbericht_details(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _statusbericht_detailLocalService.getStatusbericht_details(start,
            end);
    }

    /**
    * Returns the number of statusbericht_details.
    *
    * @return the number of statusbericht_details
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getStatusbericht_detailsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _statusbericht_detailLocalService.getStatusbericht_detailsCount();
    }

    /**
    * Updates the statusbericht_detail in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param statusbericht_detail the statusbericht_detail
    * @return the statusbericht_detail that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail updateStatusbericht_detail(
        de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail statusbericht_detail)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _statusbericht_detailLocalService.updateStatusbericht_detail(statusbericht_detail);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _statusbericht_detailLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _statusbericht_detailLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _statusbericht_detailLocalService.invokeMethod(name,
            parameterTypes, arguments);
    }

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail findByProjecthskaId(
        long statusbericht_id) {
        return _statusbericht_detailLocalService.findByProjecthskaId(statusbericht_id);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Statusbericht_detailLocalService getWrappedStatusbericht_detailLocalService() {
        return _statusbericht_detailLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedStatusbericht_detailLocalService(
        Statusbericht_detailLocalService statusbericht_detailLocalService) {
        _statusbericht_detailLocalService = statusbericht_detailLocalService;
    }

    @Override
    public Statusbericht_detailLocalService getWrappedService() {
        return _statusbericht_detailLocalService;
    }

    @Override
    public void setWrappedService(
        Statusbericht_detailLocalService statusbericht_detailLocalService) {
        _statusbericht_detailLocalService = statusbericht_detailLocalService;
    }
}
