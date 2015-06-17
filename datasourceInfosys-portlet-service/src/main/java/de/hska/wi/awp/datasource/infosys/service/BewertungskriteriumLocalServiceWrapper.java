package de.hska.wi.awp.datasource.infosys.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BewertungskriteriumLocalService}.
 *
 * @author Daniel Storch
 * @see BewertungskriteriumLocalService
 * @generated
 */
public class BewertungskriteriumLocalServiceWrapper
    implements BewertungskriteriumLocalService,
        ServiceWrapper<BewertungskriteriumLocalService> {
    private BewertungskriteriumLocalService _bewertungskriteriumLocalService;

    public BewertungskriteriumLocalServiceWrapper(
        BewertungskriteriumLocalService bewertungskriteriumLocalService) {
        _bewertungskriteriumLocalService = bewertungskriteriumLocalService;
    }

    /**
    * Adds the bewertungskriterium to the database. Also notifies the appropriate model listeners.
    *
    * @param bewertungskriterium the bewertungskriterium
    * @return the bewertungskriterium that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Bewertungskriterium addBewertungskriterium(
        de.hska.wi.awp.datasource.infosys.model.Bewertungskriterium bewertungskriterium)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bewertungskriteriumLocalService.addBewertungskriterium(bewertungskriterium);
    }

    /**
    * Creates a new bewertungskriterium with the primary key. Does not add the bewertungskriterium to the database.
    *
    * @param id the primary key for the new bewertungskriterium
    * @return the new bewertungskriterium
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Bewertungskriterium createBewertungskriterium(
        long id) {
        return _bewertungskriteriumLocalService.createBewertungskriterium(id);
    }

    /**
    * Deletes the bewertungskriterium with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the bewertungskriterium
    * @return the bewertungskriterium that was removed
    * @throws PortalException if a bewertungskriterium with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Bewertungskriterium deleteBewertungskriterium(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _bewertungskriteriumLocalService.deleteBewertungskriterium(id);
    }

    /**
    * Deletes the bewertungskriterium from the database. Also notifies the appropriate model listeners.
    *
    * @param bewertungskriterium the bewertungskriterium
    * @return the bewertungskriterium that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Bewertungskriterium deleteBewertungskriterium(
        de.hska.wi.awp.datasource.infosys.model.Bewertungskriterium bewertungskriterium)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bewertungskriteriumLocalService.deleteBewertungskriterium(bewertungskriterium);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _bewertungskriteriumLocalService.dynamicQuery();
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
        return _bewertungskriteriumLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.BewertungskriteriumModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _bewertungskriteriumLocalService.dynamicQuery(dynamicQuery,
            start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.BewertungskriteriumModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _bewertungskriteriumLocalService.dynamicQuery(dynamicQuery,
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
        return _bewertungskriteriumLocalService.dynamicQueryCount(dynamicQuery);
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
        return _bewertungskriteriumLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Bewertungskriterium fetchBewertungskriterium(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return _bewertungskriteriumLocalService.fetchBewertungskriterium(id);
    }

    /**
    * Returns the bewertungskriterium with the primary key.
    *
    * @param id the primary key of the bewertungskriterium
    * @return the bewertungskriterium
    * @throws PortalException if a bewertungskriterium with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Bewertungskriterium getBewertungskriterium(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _bewertungskriteriumLocalService.getBewertungskriterium(id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _bewertungskriteriumLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the bewertungskriteriums.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.BewertungskriteriumModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of bewertungskriteriums
    * @param end the upper bound of the range of bewertungskriteriums (not inclusive)
    * @return the range of bewertungskriteriums
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Bewertungskriterium> getBewertungskriteriums(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bewertungskriteriumLocalService.getBewertungskriteriums(start,
            end);
    }

    /**
    * Returns the number of bewertungskriteriums.
    *
    * @return the number of bewertungskriteriums
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getBewertungskriteriumsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bewertungskriteriumLocalService.getBewertungskriteriumsCount();
    }

    /**
    * Updates the bewertungskriterium in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param bewertungskriterium the bewertungskriterium
    * @return the bewertungskriterium that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Bewertungskriterium updateBewertungskriterium(
        de.hska.wi.awp.datasource.infosys.model.Bewertungskriterium bewertungskriterium)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bewertungskriteriumLocalService.updateBewertungskriterium(bewertungskriterium);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _bewertungskriteriumLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _bewertungskriteriumLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _bewertungskriteriumLocalService.invokeMethod(name,
            parameterTypes, arguments);
    }

    @Override
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Bewertungskriterium> getAllBewertungskriterium() {
        return _bewertungskriteriumLocalService.getAllBewertungskriterium();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public BewertungskriteriumLocalService getWrappedBewertungskriteriumLocalService() {
        return _bewertungskriteriumLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedBewertungskriteriumLocalService(
        BewertungskriteriumLocalService bewertungskriteriumLocalService) {
        _bewertungskriteriumLocalService = bewertungskriteriumLocalService;
    }

    @Override
    public BewertungskriteriumLocalService getWrappedService() {
        return _bewertungskriteriumLocalService;
    }

    @Override
    public void setWrappedService(
        BewertungskriteriumLocalService bewertungskriteriumLocalService) {
        _bewertungskriteriumLocalService = bewertungskriteriumLocalService;
    }
}
