package de.hska.wi.awp.datasource.infosys.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AllgemeinesLocalService}.
 *
 * @author Daniel Storch
 * @see AllgemeinesLocalService
 * @generated
 */
public class AllgemeinesLocalServiceWrapper implements AllgemeinesLocalService,
    ServiceWrapper<AllgemeinesLocalService> {
    private AllgemeinesLocalService _allgemeinesLocalService;

    public AllgemeinesLocalServiceWrapper(
        AllgemeinesLocalService allgemeinesLocalService) {
        _allgemeinesLocalService = allgemeinesLocalService;
    }

    /**
    * Adds the allgemeines to the database. Also notifies the appropriate model listeners.
    *
    * @param allgemeines the allgemeines
    * @return the allgemeines that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Allgemeines addAllgemeines(
        de.hska.wi.awp.datasource.infosys.model.Allgemeines allgemeines)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _allgemeinesLocalService.addAllgemeines(allgemeines);
    }

    /**
    * Creates a new allgemeines with the primary key. Does not add the allgemeines to the database.
    *
    * @param id the primary key for the new allgemeines
    * @return the new allgemeines
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Allgemeines createAllgemeines(
        long id) {
        return _allgemeinesLocalService.createAllgemeines(id);
    }

    /**
    * Deletes the allgemeines with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the allgemeines
    * @return the allgemeines that was removed
    * @throws PortalException if a allgemeines with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Allgemeines deleteAllgemeines(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _allgemeinesLocalService.deleteAllgemeines(id);
    }

    /**
    * Deletes the allgemeines from the database. Also notifies the appropriate model listeners.
    *
    * @param allgemeines the allgemeines
    * @return the allgemeines that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Allgemeines deleteAllgemeines(
        de.hska.wi.awp.datasource.infosys.model.Allgemeines allgemeines)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _allgemeinesLocalService.deleteAllgemeines(allgemeines);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _allgemeinesLocalService.dynamicQuery();
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
        return _allgemeinesLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.AllgemeinesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _allgemeinesLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.AllgemeinesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _allgemeinesLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _allgemeinesLocalService.dynamicQueryCount(dynamicQuery);
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
        return _allgemeinesLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Allgemeines fetchAllgemeines(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return _allgemeinesLocalService.fetchAllgemeines(id);
    }

    /**
    * Returns the allgemeines with the primary key.
    *
    * @param id the primary key of the allgemeines
    * @return the allgemeines
    * @throws PortalException if a allgemeines with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Allgemeines getAllgemeines(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _allgemeinesLocalService.getAllgemeines(id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _allgemeinesLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the allgemeineses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.AllgemeinesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of allgemeineses
    * @param end the upper bound of the range of allgemeineses (not inclusive)
    * @return the range of allgemeineses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Allgemeines> getAllgemeineses(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _allgemeinesLocalService.getAllgemeineses(start, end);
    }

    /**
    * Returns the number of allgemeineses.
    *
    * @return the number of allgemeineses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getAllgemeinesesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _allgemeinesLocalService.getAllgemeinesesCount();
    }

    /**
    * Updates the allgemeines in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param allgemeines the allgemeines
    * @return the allgemeines that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Allgemeines updateAllgemeines(
        de.hska.wi.awp.datasource.infosys.model.Allgemeines allgemeines)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _allgemeinesLocalService.updateAllgemeines(allgemeines);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _allgemeinesLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _allgemeinesLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _allgemeinesLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public AllgemeinesLocalService getWrappedAllgemeinesLocalService() {
        return _allgemeinesLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedAllgemeinesLocalService(
        AllgemeinesLocalService allgemeinesLocalService) {
        _allgemeinesLocalService = allgemeinesLocalService;
    }

    @Override
    public AllgemeinesLocalService getWrappedService() {
        return _allgemeinesLocalService;
    }

    @Override
    public void setWrappedService(
        AllgemeinesLocalService allgemeinesLocalService) {
        _allgemeinesLocalService = allgemeinesLocalService;
    }
}
