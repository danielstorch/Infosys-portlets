package de.hska.wi.awp.datasource.infosys.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import de.hska.wi.awp.datasource.infosys.model.Geplante_arbeit;

import java.util.List;

/**
 * The persistence utility for the geplante_arbeit service. This utility wraps {@link Geplante_arbeitPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Daniel Storch
 * @see Geplante_arbeitPersistence
 * @see Geplante_arbeitPersistenceImpl
 * @generated
 */
public class Geplante_arbeitUtil {
    private static Geplante_arbeitPersistence _persistence;

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
    public static void clearCache(Geplante_arbeit geplante_arbeit) {
        getPersistence().clearCache(geplante_arbeit);
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
    public static List<Geplante_arbeit> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Geplante_arbeit> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Geplante_arbeit> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Geplante_arbeit update(Geplante_arbeit geplante_arbeit)
        throws SystemException {
        return getPersistence().update(geplante_arbeit);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Geplante_arbeit update(Geplante_arbeit geplante_arbeit,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(geplante_arbeit, serviceContext);
    }

    /**
    * Caches the geplante_arbeit in the entity cache if it is enabled.
    *
    * @param geplante_arbeit the geplante_arbeit
    */
    public static void cacheResult(
        de.hska.wi.awp.datasource.infosys.model.Geplante_arbeit geplante_arbeit) {
        getPersistence().cacheResult(geplante_arbeit);
    }

    /**
    * Caches the geplante_arbeits in the entity cache if it is enabled.
    *
    * @param geplante_arbeits the geplante_arbeits
    */
    public static void cacheResult(
        java.util.List<de.hska.wi.awp.datasource.infosys.model.Geplante_arbeit> geplante_arbeits) {
        getPersistence().cacheResult(geplante_arbeits);
    }

    /**
    * Creates a new geplante_arbeit with the primary key. Does not add the geplante_arbeit to the database.
    *
    * @param id the primary key for the new geplante_arbeit
    * @return the new geplante_arbeit
    */
    public static de.hska.wi.awp.datasource.infosys.model.Geplante_arbeit create(
        long id) {
        return getPersistence().create(id);
    }

    /**
    * Removes the geplante_arbeit with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the geplante_arbeit
    * @return the geplante_arbeit that was removed
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchGeplante_arbeitException if a geplante_arbeit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Geplante_arbeit remove(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchGeplante_arbeitException {
        return getPersistence().remove(id);
    }

    public static de.hska.wi.awp.datasource.infosys.model.Geplante_arbeit updateImpl(
        de.hska.wi.awp.datasource.infosys.model.Geplante_arbeit geplante_arbeit)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(geplante_arbeit);
    }

    /**
    * Returns the geplante_arbeit with the primary key or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchGeplante_arbeitException} if it could not be found.
    *
    * @param id the primary key of the geplante_arbeit
    * @return the geplante_arbeit
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchGeplante_arbeitException if a geplante_arbeit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Geplante_arbeit findByPrimaryKey(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchGeplante_arbeitException {
        return getPersistence().findByPrimaryKey(id);
    }

    /**
    * Returns the geplante_arbeit with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the geplante_arbeit
    * @return the geplante_arbeit, or <code>null</code> if a geplante_arbeit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Geplante_arbeit fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(id);
    }

    /**
    * Returns all the geplante_arbeits.
    *
    * @return the geplante_arbeits
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Geplante_arbeit> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the geplante_arbeits.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Geplante_arbeitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of geplante_arbeits
    * @param end the upper bound of the range of geplante_arbeits (not inclusive)
    * @return the range of geplante_arbeits
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Geplante_arbeit> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the geplante_arbeits.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Geplante_arbeitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of geplante_arbeits
    * @param end the upper bound of the range of geplante_arbeits (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of geplante_arbeits
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Geplante_arbeit> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the geplante_arbeits from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of geplante_arbeits.
    *
    * @return the number of geplante_arbeits
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static Geplante_arbeitPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (Geplante_arbeitPersistence) PortletBeanLocatorUtil.locate(de.hska.wi.awp.datasource.infosys.service.ClpSerializer.getServletContextName(),
                    Geplante_arbeitPersistence.class.getName());

            ReferenceRegistry.registerReference(Geplante_arbeitUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(Geplante_arbeitPersistence persistence) {
    }
}
