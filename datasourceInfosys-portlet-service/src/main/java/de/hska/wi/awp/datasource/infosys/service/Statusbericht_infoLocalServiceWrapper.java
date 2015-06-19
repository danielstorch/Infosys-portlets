package de.hska.wi.awp.datasource.infosys.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Statusbericht_infoLocalService}.
 *
 * @author Daniel Storch
 * @see Statusbericht_infoLocalService
 * @generated
 */
public class Statusbericht_infoLocalServiceWrapper
    implements Statusbericht_infoLocalService,
        ServiceWrapper<Statusbericht_infoLocalService> {
    private Statusbericht_infoLocalService _statusbericht_infoLocalService;

    public Statusbericht_infoLocalServiceWrapper(
        Statusbericht_infoLocalService statusbericht_infoLocalService) {
        _statusbericht_infoLocalService = statusbericht_infoLocalService;
    }

    /**
    * Adds the statusbericht_info to the database. Also notifies the appropriate model listeners.
    *
    * @param statusbericht_info the statusbericht_info
    * @return the statusbericht_info that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_info addStatusbericht_info(
        de.hska.wi.awp.datasource.infosys.model.Statusbericht_info statusbericht_info)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _statusbericht_infoLocalService.addStatusbericht_info(statusbericht_info);
    }

    /**
    * Creates a new statusbericht_info with the primary key. Does not add the statusbericht_info to the database.
    *
    * @param id the primary key for the new statusbericht_info
    * @return the new statusbericht_info
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_info createStatusbericht_info(
        long id) {
        return _statusbericht_infoLocalService.createStatusbericht_info(id);
    }

    /**
    * Deletes the statusbericht_info with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the statusbericht_info
    * @return the statusbericht_info that was removed
    * @throws PortalException if a statusbericht_info with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_info deleteStatusbericht_info(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _statusbericht_infoLocalService.deleteStatusbericht_info(id);
    }

    /**
    * Deletes the statusbericht_info from the database. Also notifies the appropriate model listeners.
    *
    * @param statusbericht_info the statusbericht_info
    * @return the statusbericht_info that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_info deleteStatusbericht_info(
        de.hska.wi.awp.datasource.infosys.model.Statusbericht_info statusbericht_info)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _statusbericht_infoLocalService.deleteStatusbericht_info(statusbericht_info);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _statusbericht_infoLocalService.dynamicQuery();
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
        return _statusbericht_infoLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_infoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _statusbericht_infoLocalService.dynamicQuery(dynamicQuery,
            start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_infoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _statusbericht_infoLocalService.dynamicQuery(dynamicQuery,
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
        return _statusbericht_infoLocalService.dynamicQueryCount(dynamicQuery);
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
        return _statusbericht_infoLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_info fetchStatusbericht_info(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return _statusbericht_infoLocalService.fetchStatusbericht_info(id);
    }

    /**
    * Returns the statusbericht_info with the primary key.
    *
    * @param id the primary key of the statusbericht_info
    * @return the statusbericht_info
    * @throws PortalException if a statusbericht_info with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_info getStatusbericht_info(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _statusbericht_infoLocalService.getStatusbericht_info(id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _statusbericht_infoLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the statusbericht_infos.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_infoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of statusbericht_infos
    * @param end the upper bound of the range of statusbericht_infos (not inclusive)
    * @return the range of statusbericht_infos
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusbericht_info> getStatusbericht_infos(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _statusbericht_infoLocalService.getStatusbericht_infos(start, end);
    }

    /**
    * Returns the number of statusbericht_infos.
    *
    * @return the number of statusbericht_infos
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getStatusbericht_infosCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _statusbericht_infoLocalService.getStatusbericht_infosCount();
    }

    /**
    * Updates the statusbericht_info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param statusbericht_info the statusbericht_info
    * @return the statusbericht_info that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_info updateStatusbericht_info(
        de.hska.wi.awp.datasource.infosys.model.Statusbericht_info statusbericht_info)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _statusbericht_infoLocalService.updateStatusbericht_info(statusbericht_info);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _statusbericht_infoLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _statusbericht_infoLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _statusbericht_infoLocalService.invokeMethod(name,
            parameterTypes, arguments);
    }

    @Override
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusbericht_info> findByStatusbericht_id(
        java.lang.Long statusbericht_id) {
        return _statusbericht_infoLocalService.findByStatusbericht_id(statusbericht_id);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Statusbericht_infoLocalService getWrappedStatusbericht_infoLocalService() {
        return _statusbericht_infoLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedStatusbericht_infoLocalService(
        Statusbericht_infoLocalService statusbericht_infoLocalService) {
        _statusbericht_infoLocalService = statusbericht_infoLocalService;
    }

    @Override
    public Statusbericht_infoLocalService getWrappedService() {
        return _statusbericht_infoLocalService;
    }

    @Override
    public void setWrappedService(
        Statusbericht_infoLocalService statusbericht_infoLocalService) {
        _statusbericht_infoLocalService = statusbericht_infoLocalService;
    }
}
