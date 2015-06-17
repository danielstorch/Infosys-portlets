package de.hska.wi.awp.datasource.infosys.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Rolle. This utility wraps
 * {@link de.hska.wi.awp.datasource.infosys.service.impl.RolleLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Daniel Storch
 * @see RolleLocalService
 * @see de.hska.wi.awp.datasource.infosys.service.base.RolleLocalServiceBaseImpl
 * @see de.hska.wi.awp.datasource.infosys.service.impl.RolleLocalServiceImpl
 * @generated
 */
public class RolleLocalServiceUtil {
    private static RolleLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link de.hska.wi.awp.datasource.infosys.service.impl.RolleLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the rolle to the database. Also notifies the appropriate model listeners.
    *
    * @param rolle the rolle
    * @return the rolle that was added
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Rolle addRolle(
        de.hska.wi.awp.datasource.infosys.model.Rolle rolle)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addRolle(rolle);
    }

    /**
    * Creates a new rolle with the primary key. Does not add the rolle to the database.
    *
    * @param id the primary key for the new rolle
    * @return the new rolle
    */
    public static de.hska.wi.awp.datasource.infosys.model.Rolle createRolle(
        long id) {
        return getService().createRolle(id);
    }

    /**
    * Deletes the rolle with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the rolle
    * @return the rolle that was removed
    * @throws PortalException if a rolle with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Rolle deleteRolle(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteRolle(id);
    }

    /**
    * Deletes the rolle from the database. Also notifies the appropriate model listeners.
    *
    * @param rolle the rolle
    * @return the rolle that was removed
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Rolle deleteRolle(
        de.hska.wi.awp.datasource.infosys.model.Rolle rolle)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteRolle(rolle);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.RolleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.RolleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static de.hska.wi.awp.datasource.infosys.model.Rolle fetchRolle(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchRolle(id);
    }

    /**
    * Returns the rolle with the primary key.
    *
    * @param id the primary key of the rolle
    * @return the rolle
    * @throws PortalException if a rolle with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Rolle getRolle(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getRolle(id);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the rolles.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.RolleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of rolles
    * @param end the upper bound of the range of rolles (not inclusive)
    * @return the range of rolles
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Rolle> getRolles(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getRolles(start, end);
    }

    /**
    * Returns the number of rolles.
    *
    * @return the number of rolles
    * @throws SystemException if a system exception occurred
    */
    public static int getRollesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getRollesCount();
    }

    /**
    * Updates the rolle in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param rolle the rolle
    * @return the rolle that was updated
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Rolle updateRolle(
        de.hska.wi.awp.datasource.infosys.model.Rolle rolle)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateRolle(rolle);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static void clearService() {
        _service = null;
    }

    public static RolleLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    RolleLocalService.class.getName());

            if (invokableLocalService instanceof RolleLocalService) {
                _service = (RolleLocalService) invokableLocalService;
            } else {
                _service = new RolleLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(RolleLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(RolleLocalService service) {
    }
}
