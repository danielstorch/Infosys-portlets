package de.hska.wi.awp.datasource.infosys.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail;

import java.util.List;

/**
 * The persistence utility for the statusbericht_detail service. This utility wraps {@link Statusbericht_detailPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Daniel Storch
 * @see Statusbericht_detailPersistence
 * @see Statusbericht_detailPersistenceImpl
 * @generated
 */
public class Statusbericht_detailUtil {
    private static Statusbericht_detailPersistence _persistence;

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
    public static void clearCache(Statusbericht_detail statusbericht_detail) {
        getPersistence().clearCache(statusbericht_detail);
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
    public static List<Statusbericht_detail> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Statusbericht_detail> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Statusbericht_detail> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Statusbericht_detail update(
        Statusbericht_detail statusbericht_detail) throws SystemException {
        return getPersistence().update(statusbericht_detail);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Statusbericht_detail update(
        Statusbericht_detail statusbericht_detail, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(statusbericht_detail, serviceContext);
    }

    /**
    * Returns all the statusbericht_details where statusbericht_id = &#63;.
    *
    * @param statusbericht_id the statusbericht_id
    * @return the matching statusbericht_details
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail> findByStatusbericht_id(
        long statusbericht_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByStatusbericht_id(statusbericht_id);
    }

    /**
    * Returns a range of all the statusbericht_details where statusbericht_id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_detailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param statusbericht_id the statusbericht_id
    * @param start the lower bound of the range of statusbericht_details
    * @param end the upper bound of the range of statusbericht_details (not inclusive)
    * @return the range of matching statusbericht_details
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail> findByStatusbericht_id(
        long statusbericht_id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByStatusbericht_id(statusbericht_id, start, end);
    }

    /**
    * Returns an ordered range of all the statusbericht_details where statusbericht_id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_detailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param statusbericht_id the statusbericht_id
    * @param start the lower bound of the range of statusbericht_details
    * @param end the upper bound of the range of statusbericht_details (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching statusbericht_details
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail> findByStatusbericht_id(
        long statusbericht_id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByStatusbericht_id(statusbericht_id, start, end,
            orderByComparator);
    }

    /**
    * Returns the first statusbericht_detail in the ordered set where statusbericht_id = &#63;.
    *
    * @param statusbericht_id the statusbericht_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching statusbericht_detail
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_detailException if a matching statusbericht_detail could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail findByStatusbericht_id_First(
        long statusbericht_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_detailException {
        return getPersistence()
                   .findByStatusbericht_id_First(statusbericht_id,
            orderByComparator);
    }

    /**
    * Returns the first statusbericht_detail in the ordered set where statusbericht_id = &#63;.
    *
    * @param statusbericht_id the statusbericht_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching statusbericht_detail, or <code>null</code> if a matching statusbericht_detail could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail fetchByStatusbericht_id_First(
        long statusbericht_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByStatusbericht_id_First(statusbericht_id,
            orderByComparator);
    }

    /**
    * Returns the last statusbericht_detail in the ordered set where statusbericht_id = &#63;.
    *
    * @param statusbericht_id the statusbericht_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching statusbericht_detail
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_detailException if a matching statusbericht_detail could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail findByStatusbericht_id_Last(
        long statusbericht_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_detailException {
        return getPersistence()
                   .findByStatusbericht_id_Last(statusbericht_id,
            orderByComparator);
    }

    /**
    * Returns the last statusbericht_detail in the ordered set where statusbericht_id = &#63;.
    *
    * @param statusbericht_id the statusbericht_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching statusbericht_detail, or <code>null</code> if a matching statusbericht_detail could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail fetchByStatusbericht_id_Last(
        long statusbericht_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByStatusbericht_id_Last(statusbericht_id,
            orderByComparator);
    }

    /**
    * Returns the statusbericht_details before and after the current statusbericht_detail in the ordered set where statusbericht_id = &#63;.
    *
    * @param id the primary key of the current statusbericht_detail
    * @param statusbericht_id the statusbericht_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next statusbericht_detail
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_detailException if a statusbericht_detail with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail[] findByStatusbericht_id_PrevAndNext(
        long id, long statusbericht_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_detailException {
        return getPersistence()
                   .findByStatusbericht_id_PrevAndNext(id, statusbericht_id,
            orderByComparator);
    }

    /**
    * Removes all the statusbericht_details where statusbericht_id = &#63; from the database.
    *
    * @param statusbericht_id the statusbericht_id
    * @throws SystemException if a system exception occurred
    */
    public static void removeByStatusbericht_id(long statusbericht_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByStatusbericht_id(statusbericht_id);
    }

    /**
    * Returns the number of statusbericht_details where statusbericht_id = &#63;.
    *
    * @param statusbericht_id the statusbericht_id
    * @return the number of matching statusbericht_details
    * @throws SystemException if a system exception occurred
    */
    public static int countByStatusbericht_id(long statusbericht_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByStatusbericht_id(statusbericht_id);
    }

    /**
    * Caches the statusbericht_detail in the entity cache if it is enabled.
    *
    * @param statusbericht_detail the statusbericht_detail
    */
    public static void cacheResult(
        de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail statusbericht_detail) {
        getPersistence().cacheResult(statusbericht_detail);
    }

    /**
    * Caches the statusbericht_details in the entity cache if it is enabled.
    *
    * @param statusbericht_details the statusbericht_details
    */
    public static void cacheResult(
        java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail> statusbericht_details) {
        getPersistence().cacheResult(statusbericht_details);
    }

    /**
    * Creates a new statusbericht_detail with the primary key. Does not add the statusbericht_detail to the database.
    *
    * @param id the primary key for the new statusbericht_detail
    * @return the new statusbericht_detail
    */
    public static de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail create(
        long id) {
        return getPersistence().create(id);
    }

    /**
    * Removes the statusbericht_detail with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the statusbericht_detail
    * @return the statusbericht_detail that was removed
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_detailException if a statusbericht_detail with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail remove(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_detailException {
        return getPersistence().remove(id);
    }

    public static de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail updateImpl(
        de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail statusbericht_detail)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(statusbericht_detail);
    }

    /**
    * Returns the statusbericht_detail with the primary key or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_detailException} if it could not be found.
    *
    * @param id the primary key of the statusbericht_detail
    * @return the statusbericht_detail
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_detailException if a statusbericht_detail with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail findByPrimaryKey(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_detailException {
        return getPersistence().findByPrimaryKey(id);
    }

    /**
    * Returns the statusbericht_detail with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the statusbericht_detail
    * @return the statusbericht_detail, or <code>null</code> if a statusbericht_detail with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(id);
    }

    /**
    * Returns all the statusbericht_details.
    *
    * @return the statusbericht_details
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the statusbericht_details.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_detailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of statusbericht_details
    * @param end the upper bound of the range of statusbericht_details (not inclusive)
    * @return the range of statusbericht_details
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the statusbericht_details.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_detailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of statusbericht_details
    * @param end the upper bound of the range of statusbericht_details (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of statusbericht_details
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the statusbericht_details from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of statusbericht_details.
    *
    * @return the number of statusbericht_details
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static Statusbericht_detailPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (Statusbericht_detailPersistence) PortletBeanLocatorUtil.locate(de.hska.wi.awp.datasource.infosys.service.ClpSerializer.getServletContextName(),
                    Statusbericht_detailPersistence.class.getName());

            ReferenceRegistry.registerReference(Statusbericht_detailUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(Statusbericht_detailPersistence persistence) {
    }
}
