package de.hska.wi.awp.datasource.infosys.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import de.hska.wi.awp.datasource.infosys.model.Statusueberblick;

import java.util.List;

/**
 * The persistence utility for the statusueberblick service. This utility wraps {@link StatusueberblickPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Daniel Storch
 * @see StatusueberblickPersistence
 * @see StatusueberblickPersistenceImpl
 * @generated
 */
public class StatusueberblickUtil {
    private static StatusueberblickPersistence _persistence;

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
    public static void clearCache(Statusueberblick statusueberblick) {
        getPersistence().clearCache(statusueberblick);
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
    public static List<Statusueberblick> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Statusueberblick> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Statusueberblick> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Statusueberblick update(Statusueberblick statusueberblick)
        throws SystemException {
        return getPersistence().update(statusueberblick);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Statusueberblick update(Statusueberblick statusueberblick,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(statusueberblick, serviceContext);
    }

    /**
    * Returns the statusueberblick where statusbericht_id = &#63; or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchStatusueberblickException} if it could not be found.
    *
    * @param statusbericht_id the statusbericht_id
    * @return the matching statusueberblick
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusueberblickException if a matching statusueberblick could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Statusueberblick findByStatusbericht_id(
        long statusbericht_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchStatusueberblickException {
        return getPersistence().findByStatusbericht_id(statusbericht_id);
    }

    /**
    * Returns the statusueberblick where statusbericht_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param statusbericht_id the statusbericht_id
    * @return the matching statusueberblick, or <code>null</code> if a matching statusueberblick could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Statusueberblick fetchByStatusbericht_id(
        long statusbericht_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByStatusbericht_id(statusbericht_id);
    }

    /**
    * Returns the statusueberblick where statusbericht_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param statusbericht_id the statusbericht_id
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching statusueberblick, or <code>null</code> if a matching statusueberblick could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Statusueberblick fetchByStatusbericht_id(
        long statusbericht_id, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByStatusbericht_id(statusbericht_id, retrieveFromCache);
    }

    /**
    * Removes the statusueberblick where statusbericht_id = &#63; from the database.
    *
    * @param statusbericht_id the statusbericht_id
    * @return the statusueberblick that was removed
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Statusueberblick removeByStatusbericht_id(
        long statusbericht_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchStatusueberblickException {
        return getPersistence().removeByStatusbericht_id(statusbericht_id);
    }

    /**
    * Returns the number of statusueberblicks where statusbericht_id = &#63;.
    *
    * @param statusbericht_id the statusbericht_id
    * @return the number of matching statusueberblicks
    * @throws SystemException if a system exception occurred
    */
    public static int countByStatusbericht_id(long statusbericht_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByStatusbericht_id(statusbericht_id);
    }

    /**
    * Caches the statusueberblick in the entity cache if it is enabled.
    *
    * @param statusueberblick the statusueberblick
    */
    public static void cacheResult(
        de.hska.wi.awp.datasource.infosys.model.Statusueberblick statusueberblick) {
        getPersistence().cacheResult(statusueberblick);
    }

    /**
    * Caches the statusueberblicks in the entity cache if it is enabled.
    *
    * @param statusueberblicks the statusueberblicks
    */
    public static void cacheResult(
        java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusueberblick> statusueberblicks) {
        getPersistence().cacheResult(statusueberblicks);
    }

    /**
    * Creates a new statusueberblick with the primary key. Does not add the statusueberblick to the database.
    *
    * @param id the primary key for the new statusueberblick
    * @return the new statusueberblick
    */
    public static de.hska.wi.awp.datasource.infosys.model.Statusueberblick create(
        long id) {
        return getPersistence().create(id);
    }

    /**
    * Removes the statusueberblick with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the statusueberblick
    * @return the statusueberblick that was removed
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusueberblickException if a statusueberblick with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Statusueberblick remove(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchStatusueberblickException {
        return getPersistence().remove(id);
    }

    public static de.hska.wi.awp.datasource.infosys.model.Statusueberblick updateImpl(
        de.hska.wi.awp.datasource.infosys.model.Statusueberblick statusueberblick)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(statusueberblick);
    }

    /**
    * Returns the statusueberblick with the primary key or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchStatusueberblickException} if it could not be found.
    *
    * @param id the primary key of the statusueberblick
    * @return the statusueberblick
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusueberblickException if a statusueberblick with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Statusueberblick findByPrimaryKey(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchStatusueberblickException {
        return getPersistence().findByPrimaryKey(id);
    }

    /**
    * Returns the statusueberblick with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the statusueberblick
    * @return the statusueberblick, or <code>null</code> if a statusueberblick with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Statusueberblick fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(id);
    }

    /**
    * Returns all the statusueberblicks.
    *
    * @return the statusueberblicks
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusueberblick> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the statusueberblicks.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.StatusueberblickModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of statusueberblicks
    * @param end the upper bound of the range of statusueberblicks (not inclusive)
    * @return the range of statusueberblicks
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusueberblick> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the statusueberblicks.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.StatusueberblickModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of statusueberblicks
    * @param end the upper bound of the range of statusueberblicks (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of statusueberblicks
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusueberblick> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the statusueberblicks from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of statusueberblicks.
    *
    * @return the number of statusueberblicks
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static StatusueberblickPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (StatusueberblickPersistence) PortletBeanLocatorUtil.locate(de.hska.wi.awp.datasource.infosys.service.ClpSerializer.getServletContextName(),
                    StatusueberblickPersistence.class.getName());

            ReferenceRegistry.registerReference(StatusueberblickUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(StatusueberblickPersistence persistence) {
    }
}
