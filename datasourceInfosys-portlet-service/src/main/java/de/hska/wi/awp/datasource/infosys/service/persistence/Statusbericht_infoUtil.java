package de.hska.wi.awp.datasource.infosys.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import de.hska.wi.awp.datasource.infosys.model.Statusbericht_info;

import java.util.List;

/**
 * The persistence utility for the statusbericht_info service. This utility wraps {@link Statusbericht_infoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Daniel Storch
 * @see Statusbericht_infoPersistence
 * @see Statusbericht_infoPersistenceImpl
 * @generated
 */
public class Statusbericht_infoUtil {
    private static Statusbericht_infoPersistence _persistence;

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
    public static void clearCache(Statusbericht_info statusbericht_info) {
        getPersistence().clearCache(statusbericht_info);
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
    public static List<Statusbericht_info> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Statusbericht_info> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Statusbericht_info> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Statusbericht_info update(
        Statusbericht_info statusbericht_info) throws SystemException {
        return getPersistence().update(statusbericht_info);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Statusbericht_info update(
        Statusbericht_info statusbericht_info, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(statusbericht_info, serviceContext);
    }

    /**
    * Returns the statusbericht_info where statusbericht_id = &#63; or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_infoException} if it could not be found.
    *
    * @param statusbericht_id the statusbericht_id
    * @return the matching statusbericht_info
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_infoException if a matching statusbericht_info could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Statusbericht_info findByStatusbericht_id(
        long statusbericht_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_infoException {
        return getPersistence().findByStatusbericht_id(statusbericht_id);
    }

    /**
    * Returns the statusbericht_info where statusbericht_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param statusbericht_id the statusbericht_id
    * @return the matching statusbericht_info, or <code>null</code> if a matching statusbericht_info could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Statusbericht_info fetchByStatusbericht_id(
        long statusbericht_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByStatusbericht_id(statusbericht_id);
    }

    /**
    * Returns the statusbericht_info where statusbericht_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param statusbericht_id the statusbericht_id
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching statusbericht_info, or <code>null</code> if a matching statusbericht_info could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Statusbericht_info fetchByStatusbericht_id(
        long statusbericht_id, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByStatusbericht_id(statusbericht_id, retrieveFromCache);
    }

    /**
    * Removes the statusbericht_info where statusbericht_id = &#63; from the database.
    *
    * @param statusbericht_id the statusbericht_id
    * @return the statusbericht_info that was removed
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Statusbericht_info removeByStatusbericht_id(
        long statusbericht_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_infoException {
        return getPersistence().removeByStatusbericht_id(statusbericht_id);
    }

    /**
    * Returns the number of statusbericht_infos where statusbericht_id = &#63;.
    *
    * @param statusbericht_id the statusbericht_id
    * @return the number of matching statusbericht_infos
    * @throws SystemException if a system exception occurred
    */
    public static int countByStatusbericht_id(long statusbericht_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByStatusbericht_id(statusbericht_id);
    }

    /**
    * Caches the statusbericht_info in the entity cache if it is enabled.
    *
    * @param statusbericht_info the statusbericht_info
    */
    public static void cacheResult(
        de.hska.wi.awp.datasource.infosys.model.Statusbericht_info statusbericht_info) {
        getPersistence().cacheResult(statusbericht_info);
    }

    /**
    * Caches the statusbericht_infos in the entity cache if it is enabled.
    *
    * @param statusbericht_infos the statusbericht_infos
    */
    public static void cacheResult(
        java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusbericht_info> statusbericht_infos) {
        getPersistence().cacheResult(statusbericht_infos);
    }

    /**
    * Creates a new statusbericht_info with the primary key. Does not add the statusbericht_info to the database.
    *
    * @param id the primary key for the new statusbericht_info
    * @return the new statusbericht_info
    */
    public static de.hska.wi.awp.datasource.infosys.model.Statusbericht_info create(
        long id) {
        return getPersistence().create(id);
    }

    /**
    * Removes the statusbericht_info with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the statusbericht_info
    * @return the statusbericht_info that was removed
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_infoException if a statusbericht_info with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Statusbericht_info remove(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_infoException {
        return getPersistence().remove(id);
    }

    public static de.hska.wi.awp.datasource.infosys.model.Statusbericht_info updateImpl(
        de.hska.wi.awp.datasource.infosys.model.Statusbericht_info statusbericht_info)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(statusbericht_info);
    }

    /**
    * Returns the statusbericht_info with the primary key or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_infoException} if it could not be found.
    *
    * @param id the primary key of the statusbericht_info
    * @return the statusbericht_info
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_infoException if a statusbericht_info with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Statusbericht_info findByPrimaryKey(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_infoException {
        return getPersistence().findByPrimaryKey(id);
    }

    /**
    * Returns the statusbericht_info with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the statusbericht_info
    * @return the statusbericht_info, or <code>null</code> if a statusbericht_info with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Statusbericht_info fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(id);
    }

    /**
    * Returns all the statusbericht_infos.
    *
    * @return the statusbericht_infos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusbericht_info> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusbericht_info> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the statusbericht_infos.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_infoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of statusbericht_infos
    * @param end the upper bound of the range of statusbericht_infos (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of statusbericht_infos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusbericht_info> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the statusbericht_infos from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of statusbericht_infos.
    *
    * @return the number of statusbericht_infos
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static Statusbericht_infoPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (Statusbericht_infoPersistence) PortletBeanLocatorUtil.locate(de.hska.wi.awp.datasource.infosys.service.ClpSerializer.getServletContextName(),
                    Statusbericht_infoPersistence.class.getName());

            ReferenceRegistry.registerReference(Statusbericht_infoUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(Statusbericht_infoPersistence persistence) {
    }
}
