package de.hska.wi.awp.datasource.infosys.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import de.hska.wi.awp.datasource.infosys.model.Statusbericht_info_punkt;

import java.util.List;

/**
 * The persistence utility for the statusbericht_info_punkt service. This utility wraps {@link Statusbericht_info_punktPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Daniel Storch
 * @see Statusbericht_info_punktPersistence
 * @see Statusbericht_info_punktPersistenceImpl
 * @generated
 */
public class Statusbericht_info_punktUtil {
    private static Statusbericht_info_punktPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(
        Statusbericht_info_punkt statusbericht_info_punkt) {
        getPersistence().clearCache(statusbericht_info_punkt);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Statusbericht_info_punkt> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Statusbericht_info_punkt> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Statusbericht_info_punkt> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Statusbericht_info_punkt update(
        Statusbericht_info_punkt statusbericht_info_punkt)
        throws SystemException {
        return getPersistence().update(statusbericht_info_punkt);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Statusbericht_info_punkt update(
        Statusbericht_info_punkt statusbericht_info_punkt,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(statusbericht_info_punkt, serviceContext);
    }

    /**
    * Caches the statusbericht_info_punkt in the entity cache if it is enabled.
    *
    * @param statusbericht_info_punkt the statusbericht_info_punkt
    */
    public static void cacheResult(
        de.hska.wi.awp.datasource.infosys.model.Statusbericht_info_punkt statusbericht_info_punkt) {
        getPersistence().cacheResult(statusbericht_info_punkt);
    }

    /**
    * Caches the statusbericht_info_punkts in the entity cache if it is enabled.
    *
    * @param statusbericht_info_punkts the statusbericht_info_punkts
    */
    public static void cacheResult(
        java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusbericht_info_punkt> statusbericht_info_punkts) {
        getPersistence().cacheResult(statusbericht_info_punkts);
    }

    /**
    * Creates a new statusbericht_info_punkt with the primary key. Does not add the statusbericht_info_punkt to the database.
    *
    * @param id the primary key for the new statusbericht_info_punkt
    * @return the new statusbericht_info_punkt
    */
    public static de.hska.wi.awp.datasource.infosys.model.Statusbericht_info_punkt create(
        long id) {
        return getPersistence().create(id);
    }

    /**
    * Removes the statusbericht_info_punkt with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the statusbericht_info_punkt
    * @return the statusbericht_info_punkt that was removed
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_info_punktException if a statusbericht_info_punkt with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Statusbericht_info_punkt remove(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_info_punktException {
        return getPersistence().remove(id);
    }

    public static de.hska.wi.awp.datasource.infosys.model.Statusbericht_info_punkt updateImpl(
        de.hska.wi.awp.datasource.infosys.model.Statusbericht_info_punkt statusbericht_info_punkt)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(statusbericht_info_punkt);
    }

    /**
    * Returns the statusbericht_info_punkt with the primary key or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_info_punktException} if it could not be found.
    *
    * @param id the primary key of the statusbericht_info_punkt
    * @return the statusbericht_info_punkt
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_info_punktException if a statusbericht_info_punkt with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Statusbericht_info_punkt findByPrimaryKey(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_info_punktException {
        return getPersistence().findByPrimaryKey(id);
    }

    /**
    * Returns the statusbericht_info_punkt with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the statusbericht_info_punkt
    * @return the statusbericht_info_punkt, or <code>null</code> if a statusbericht_info_punkt with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Statusbericht_info_punkt fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(id);
    }

    /**
    * Returns all the statusbericht_info_punkts.
    *
    * @return the statusbericht_info_punkts
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusbericht_info_punkt> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusbericht_info_punkt> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the statusbericht_info_punkts.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_info_punktModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of statusbericht_info_punkts
    * @param end the upper bound of the range of statusbericht_info_punkts (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of statusbericht_info_punkts
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusbericht_info_punkt> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the statusbericht_info_punkts from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of statusbericht_info_punkts.
    *
    * @return the number of statusbericht_info_punkts
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static Statusbericht_info_punktPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (Statusbericht_info_punktPersistence) PortletBeanLocatorUtil.locate(de.hska.wi.awp.datasource.infosys.service.ClpSerializer.getServletContextName(),
                    Statusbericht_info_punktPersistence.class.getName());

            ReferenceRegistry.registerReference(Statusbericht_info_punktUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(Statusbericht_info_punktPersistence persistence) {
    }
}
