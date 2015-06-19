package de.hska.wi.awp.datasource.infosys.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Statusbericht_info. This utility wraps
 * {@link de.hska.wi.awp.datasource.infosys.service.impl.Statusbericht_infoLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Daniel Storch
 * @see Statusbericht_infoLocalService
 * @see de.hska.wi.awp.datasource.infosys.service.base.Statusbericht_infoLocalServiceBaseImpl
 * @see de.hska.wi.awp.datasource.infosys.service.impl.Statusbericht_infoLocalServiceImpl
 * @generated
 */
public class Statusbericht_infoLocalServiceUtil {
    private static Statusbericht_infoLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link de.hska.wi.awp.datasource.infosys.service.impl.Statusbericht_infoLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the statusbericht_info to the database. Also notifies the appropriate model listeners.
    *
    * @param statusbericht_info the statusbericht_info
    * @return the statusbericht_info that was added
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Statusbericht_info addStatusbericht_info(
        de.hska.wi.awp.datasource.infosys.model.Statusbericht_info statusbericht_info)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addStatusbericht_info(statusbericht_info);
    }

    /**
    * Creates a new statusbericht_info with the primary key. Does not add the statusbericht_info to the database.
    *
    * @param id the primary key for the new statusbericht_info
    * @return the new statusbericht_info
    */
    public static de.hska.wi.awp.datasource.infosys.model.Statusbericht_info createStatusbericht_info(
        long id) {
        return getService().createStatusbericht_info(id);
    }

    /**
    * Deletes the statusbericht_info with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the statusbericht_info
    * @return the statusbericht_info that was removed
    * @throws PortalException if a statusbericht_info with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Statusbericht_info deleteStatusbericht_info(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteStatusbericht_info(id);
    }

    /**
    * Deletes the statusbericht_info from the database. Also notifies the appropriate model listeners.
    *
    * @param statusbericht_info the statusbericht_info
    * @return the statusbericht_info that was removed
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Statusbericht_info deleteStatusbericht_info(
        de.hska.wi.awp.datasource.infosys.model.Statusbericht_info statusbericht_info)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteStatusbericht_info(statusbericht_info);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_infoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static de.hska.wi.awp.datasource.infosys.model.Statusbericht_info fetchStatusbericht_info(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchStatusbericht_info(id);
    }

    /**
    * Returns the statusbericht_info with the primary key.
    *
    * @param id the primary key of the statusbericht_info
    * @return the statusbericht_info
    * @throws PortalException if a statusbericht_info with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Statusbericht_info getStatusbericht_info(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getStatusbericht_info(id);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusbericht_info> getStatusbericht_infos(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getStatusbericht_infos(start, end);
    }

    /**
    * Returns the number of statusbericht_infos.
    *
    * @return the number of statusbericht_infos
    * @throws SystemException if a system exception occurred
    */
    public static int getStatusbericht_infosCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getStatusbericht_infosCount();
    }

    /**
    * Updates the statusbericht_info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param statusbericht_info the statusbericht_info
    * @return the statusbericht_info that was updated
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Statusbericht_info updateStatusbericht_info(
        de.hska.wi.awp.datasource.infosys.model.Statusbericht_info statusbericht_info)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateStatusbericht_info(statusbericht_info);
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

    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusbericht_info> findByStatusbericht_id(
        java.lang.Long statusbericht_id) {
        return getService().findByStatusbericht_id(statusbericht_id);
    }

    public static void clearService() {
        _service = null;
    }

    public static Statusbericht_infoLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    Statusbericht_infoLocalService.class.getName());

            if (invokableLocalService instanceof Statusbericht_infoLocalService) {
                _service = (Statusbericht_infoLocalService) invokableLocalService;
            } else {
                _service = new Statusbericht_infoLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(Statusbericht_infoLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(Statusbericht_infoLocalService service) {
    }
}
