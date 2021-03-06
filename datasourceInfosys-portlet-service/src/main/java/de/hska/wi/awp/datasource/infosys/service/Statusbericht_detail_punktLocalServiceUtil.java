package de.hska.wi.awp.datasource.infosys.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Statusbericht_detail_punkt. This utility wraps
 * {@link de.hska.wi.awp.datasource.infosys.service.impl.Statusbericht_detail_punktLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Daniel Storch
 * @see Statusbericht_detail_punktLocalService
 * @see de.hska.wi.awp.datasource.infosys.service.base.Statusbericht_detail_punktLocalServiceBaseImpl
 * @see de.hska.wi.awp.datasource.infosys.service.impl.Statusbericht_detail_punktLocalServiceImpl
 * @generated
 */
public class Statusbericht_detail_punktLocalServiceUtil {
    private static Statusbericht_detail_punktLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link de.hska.wi.awp.datasource.infosys.service.impl.Statusbericht_detail_punktLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the statusbericht_detail_punkt to the database. Also notifies the appropriate model listeners.
    *
    * @param statusbericht_detail_punkt the statusbericht_detail_punkt
    * @return the statusbericht_detail_punkt that was added
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail_punkt addStatusbericht_detail_punkt(
        de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail_punkt statusbericht_detail_punkt)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .addStatusbericht_detail_punkt(statusbericht_detail_punkt);
    }

    /**
    * Creates a new statusbericht_detail_punkt with the primary key. Does not add the statusbericht_detail_punkt to the database.
    *
    * @param id the primary key for the new statusbericht_detail_punkt
    * @return the new statusbericht_detail_punkt
    */
    public static de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail_punkt createStatusbericht_detail_punkt(
        long id) {
        return getService().createStatusbericht_detail_punkt(id);
    }

    /**
    * Deletes the statusbericht_detail_punkt with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the statusbericht_detail_punkt
    * @return the statusbericht_detail_punkt that was removed
    * @throws PortalException if a statusbericht_detail_punkt with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail_punkt deleteStatusbericht_detail_punkt(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteStatusbericht_detail_punkt(id);
    }

    /**
    * Deletes the statusbericht_detail_punkt from the database. Also notifies the appropriate model listeners.
    *
    * @param statusbericht_detail_punkt the statusbericht_detail_punkt
    * @return the statusbericht_detail_punkt that was removed
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail_punkt deleteStatusbericht_detail_punkt(
        de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail_punkt statusbericht_detail_punkt)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .deleteStatusbericht_detail_punkt(statusbericht_detail_punkt);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_detail_punktModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail_punkt fetchStatusbericht_detail_punkt(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchStatusbericht_detail_punkt(id);
    }

    /**
    * Returns the statusbericht_detail_punkt with the primary key.
    *
    * @param id the primary key of the statusbericht_detail_punkt
    * @return the statusbericht_detail_punkt
    * @throws PortalException if a statusbericht_detail_punkt with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail_punkt getStatusbericht_detail_punkt(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getStatusbericht_detail_punkt(id);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail_punkt> getStatusbericht_detail_punkts(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getStatusbericht_detail_punkts(start, end);
    }

    /**
    * Returns the number of statusbericht_detail_punkts.
    *
    * @return the number of statusbericht_detail_punkts
    * @throws SystemException if a system exception occurred
    */
    public static int getStatusbericht_detail_punktsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getStatusbericht_detail_punktsCount();
    }

    /**
    * Updates the statusbericht_detail_punkt in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param statusbericht_detail_punkt the statusbericht_detail_punkt
    * @return the statusbericht_detail_punkt that was updated
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail_punkt updateStatusbericht_detail_punkt(
        de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail_punkt statusbericht_detail_punkt)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .updateStatusbericht_detail_punkt(statusbericht_detail_punkt);
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

    public static Statusbericht_detail_punktLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    Statusbericht_detail_punktLocalService.class.getName());

            if (invokableLocalService instanceof Statusbericht_detail_punktLocalService) {
                _service = (Statusbericht_detail_punktLocalService) invokableLocalService;
            } else {
                _service = new Statusbericht_detail_punktLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(Statusbericht_detail_punktLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(Statusbericht_detail_punktLocalService service) {
    }
}
