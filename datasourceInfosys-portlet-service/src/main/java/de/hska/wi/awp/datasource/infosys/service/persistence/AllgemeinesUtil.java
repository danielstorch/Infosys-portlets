package de.hska.wi.awp.datasource.infosys.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import de.hska.wi.awp.datasource.infosys.model.Allgemeines;

import java.util.List;

/**
 * The persistence utility for the allgemeines service. This utility wraps {@link AllgemeinesPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Daniel Storch
 * @see AllgemeinesPersistence
 * @see AllgemeinesPersistenceImpl
 * @generated
 */
public class AllgemeinesUtil {
    private static AllgemeinesPersistence _persistence;

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
    public static void clearCache(Allgemeines allgemeines) {
        getPersistence().clearCache(allgemeines);
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
    public static List<Allgemeines> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Allgemeines> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Allgemeines> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Allgemeines update(Allgemeines allgemeines)
        throws SystemException {
        return getPersistence().update(allgemeines);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Allgemeines update(Allgemeines allgemeines,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(allgemeines, serviceContext);
    }

    /**
    * Caches the allgemeines in the entity cache if it is enabled.
    *
    * @param allgemeines the allgemeines
    */
    public static void cacheResult(
        de.hska.wi.awp.datasource.infosys.model.Allgemeines allgemeines) {
        getPersistence().cacheResult(allgemeines);
    }

    /**
    * Caches the allgemeineses in the entity cache if it is enabled.
    *
    * @param allgemeineses the allgemeineses
    */
    public static void cacheResult(
        java.util.List<de.hska.wi.awp.datasource.infosys.model.Allgemeines> allgemeineses) {
        getPersistence().cacheResult(allgemeineses);
    }

    /**
    * Creates a new allgemeines with the primary key. Does not add the allgemeines to the database.
    *
    * @param id the primary key for the new allgemeines
    * @return the new allgemeines
    */
    public static de.hska.wi.awp.datasource.infosys.model.Allgemeines create(
        long id) {
        return getPersistence().create(id);
    }

    /**
    * Removes the allgemeines with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the allgemeines
    * @return the allgemeines that was removed
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchAllgemeinesException if a allgemeines with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Allgemeines remove(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchAllgemeinesException {
        return getPersistence().remove(id);
    }

    public static de.hska.wi.awp.datasource.infosys.model.Allgemeines updateImpl(
        de.hska.wi.awp.datasource.infosys.model.Allgemeines allgemeines)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(allgemeines);
    }

    /**
    * Returns the allgemeines with the primary key or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchAllgemeinesException} if it could not be found.
    *
    * @param id the primary key of the allgemeines
    * @return the allgemeines
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchAllgemeinesException if a allgemeines with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Allgemeines findByPrimaryKey(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchAllgemeinesException {
        return getPersistence().findByPrimaryKey(id);
    }

    /**
    * Returns the allgemeines with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the allgemeines
    * @return the allgemeines, or <code>null</code> if a allgemeines with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Allgemeines fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(id);
    }

    /**
    * Returns all the allgemeineses.
    *
    * @return the allgemeineses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Allgemeines> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the allgemeineses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.AllgemeinesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of allgemeineses
    * @param end the upper bound of the range of allgemeineses (not inclusive)
    * @return the range of allgemeineses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Allgemeines> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the allgemeineses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.AllgemeinesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of allgemeineses
    * @param end the upper bound of the range of allgemeineses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of allgemeineses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Allgemeines> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the allgemeineses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of allgemeineses.
    *
    * @return the number of allgemeineses
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static AllgemeinesPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (AllgemeinesPersistence) PortletBeanLocatorUtil.locate(de.hska.wi.awp.datasource.infosys.service.ClpSerializer.getServletContextName(),
                    AllgemeinesPersistence.class.getName());

            ReferenceRegistry.registerReference(AllgemeinesUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(AllgemeinesPersistence persistence) {
    }
}
