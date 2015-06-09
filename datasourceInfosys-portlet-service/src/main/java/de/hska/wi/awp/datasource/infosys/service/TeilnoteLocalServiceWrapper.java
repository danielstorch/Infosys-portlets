package de.hska.wi.awp.datasource.infosys.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TeilnoteLocalService}.
 *
 * @author Daniel Storch
 * @see TeilnoteLocalService
 * @generated
 */
public class TeilnoteLocalServiceWrapper implements TeilnoteLocalService,
    ServiceWrapper<TeilnoteLocalService> {
    private TeilnoteLocalService _teilnoteLocalService;

    public TeilnoteLocalServiceWrapper(
        TeilnoteLocalService teilnoteLocalService) {
        _teilnoteLocalService = teilnoteLocalService;
    }

    /**
    * Adds the teilnote to the database. Also notifies the appropriate model listeners.
    *
    * @param teilnote the teilnote
    * @return the teilnote that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Teilnote addTeilnote(
        de.hska.wi.awp.datasource.infosys.model.Teilnote teilnote)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _teilnoteLocalService.addTeilnote(teilnote);
    }

    /**
    * Creates a new teilnote with the primary key. Does not add the teilnote to the database.
    *
    * @param id the primary key for the new teilnote
    * @return the new teilnote
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Teilnote createTeilnote(
        long id) {
        return _teilnoteLocalService.createTeilnote(id);
    }

    /**
    * Deletes the teilnote with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the teilnote
    * @return the teilnote that was removed
    * @throws PortalException if a teilnote with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Teilnote deleteTeilnote(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _teilnoteLocalService.deleteTeilnote(id);
    }

    /**
    * Deletes the teilnote from the database. Also notifies the appropriate model listeners.
    *
    * @param teilnote the teilnote
    * @return the teilnote that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Teilnote deleteTeilnote(
        de.hska.wi.awp.datasource.infosys.model.Teilnote teilnote)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _teilnoteLocalService.deleteTeilnote(teilnote);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _teilnoteLocalService.dynamicQuery();
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
        return _teilnoteLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.TeilnoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _teilnoteLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.TeilnoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _teilnoteLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _teilnoteLocalService.dynamicQueryCount(dynamicQuery);
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
        return _teilnoteLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Teilnote fetchTeilnote(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return _teilnoteLocalService.fetchTeilnote(id);
    }

    /**
    * Returns the teilnote with the primary key.
    *
    * @param id the primary key of the teilnote
    * @return the teilnote
    * @throws PortalException if a teilnote with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Teilnote getTeilnote(long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _teilnoteLocalService.getTeilnote(id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _teilnoteLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the teilnotes.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.TeilnoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of teilnotes
    * @param end the upper bound of the range of teilnotes (not inclusive)
    * @return the range of teilnotes
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Teilnote> getTeilnotes(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _teilnoteLocalService.getTeilnotes(start, end);
    }

    /**
    * Returns the number of teilnotes.
    *
    * @return the number of teilnotes
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getTeilnotesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _teilnoteLocalService.getTeilnotesCount();
    }

    /**
    * Updates the teilnote in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param teilnote the teilnote
    * @return the teilnote that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.hska.wi.awp.datasource.infosys.model.Teilnote updateTeilnote(
        de.hska.wi.awp.datasource.infosys.model.Teilnote teilnote)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _teilnoteLocalService.updateTeilnote(teilnote);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _teilnoteLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _teilnoteLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _teilnoteLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public TeilnoteLocalService getWrappedTeilnoteLocalService() {
        return _teilnoteLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedTeilnoteLocalService(
        TeilnoteLocalService teilnoteLocalService) {
        _teilnoteLocalService = teilnoteLocalService;
    }

    @Override
    public TeilnoteLocalService getWrappedService() {
        return _teilnoteLocalService;
    }

    @Override
    public void setWrappedService(TeilnoteLocalService teilnoteLocalService) {
        _teilnoteLocalService = teilnoteLocalService;
    }
}
