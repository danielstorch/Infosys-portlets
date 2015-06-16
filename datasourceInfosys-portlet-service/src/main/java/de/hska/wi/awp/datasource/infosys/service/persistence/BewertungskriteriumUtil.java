package de.hska.wi.awp.datasource.infosys.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import de.hska.wi.awp.datasource.infosys.model.Bewertungskriterium;

import java.util.List;

/**
 * The persistence utility for the bewertungskriterium service. This utility wraps {@link BewertungskriteriumPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Daniel Storch
 * @see BewertungskriteriumPersistence
 * @see BewertungskriteriumPersistenceImpl
 * @generated
 */
public class BewertungskriteriumUtil {
    private static BewertungskriteriumPersistence _persistence;

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
    public static void clearCache(Bewertungskriterium bewertungskriterium) {
        getPersistence().clearCache(bewertungskriterium);
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
    public static List<Bewertungskriterium> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Bewertungskriterium> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Bewertungskriterium> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Bewertungskriterium update(
        Bewertungskriterium bewertungskriterium) throws SystemException {
        return getPersistence().update(bewertungskriterium);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Bewertungskriterium update(
        Bewertungskriterium bewertungskriterium, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(bewertungskriterium, serviceContext);
    }

    /**
    * Caches the bewertungskriterium in the entity cache if it is enabled.
    *
    * @param bewertungskriterium the bewertungskriterium
    */
    public static void cacheResult(
        de.hska.wi.awp.datasource.infosys.model.Bewertungskriterium bewertungskriterium) {
        getPersistence().cacheResult(bewertungskriterium);
    }

    /**
    * Caches the bewertungskriteriums in the entity cache if it is enabled.
    *
    * @param bewertungskriteriums the bewertungskriteriums
    */
    public static void cacheResult(
        java.util.List<de.hska.wi.awp.datasource.infosys.model.Bewertungskriterium> bewertungskriteriums) {
        getPersistence().cacheResult(bewertungskriteriums);
    }

    /**
    * Creates a new bewertungskriterium with the primary key. Does not add the bewertungskriterium to the database.
    *
    * @param id the primary key for the new bewertungskriterium
    * @return the new bewertungskriterium
    */
    public static de.hska.wi.awp.datasource.infosys.model.Bewertungskriterium create(
        long id) {
        return getPersistence().create(id);
    }

    /**
    * Removes the bewertungskriterium with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the bewertungskriterium
    * @return the bewertungskriterium that was removed
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchBewertungskriteriumException if a bewertungskriterium with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Bewertungskriterium remove(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchBewertungskriteriumException {
        return getPersistence().remove(id);
    }

    public static de.hska.wi.awp.datasource.infosys.model.Bewertungskriterium updateImpl(
        de.hska.wi.awp.datasource.infosys.model.Bewertungskriterium bewertungskriterium)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(bewertungskriterium);
    }

    /**
    * Returns the bewertungskriterium with the primary key or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchBewertungskriteriumException} if it could not be found.
    *
    * @param id the primary key of the bewertungskriterium
    * @return the bewertungskriterium
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchBewertungskriteriumException if a bewertungskriterium with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Bewertungskriterium findByPrimaryKey(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchBewertungskriteriumException {
        return getPersistence().findByPrimaryKey(id);
    }

    /**
    * Returns the bewertungskriterium with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the bewertungskriterium
    * @return the bewertungskriterium, or <code>null</code> if a bewertungskriterium with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Bewertungskriterium fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(id);
    }

    /**
    * Returns all the bewertungskriteriums.
    *
    * @return the bewertungskriteriums
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Bewertungskriterium> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the bewertungskriteriums.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.BewertungskriteriumModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of bewertungskriteriums
    * @param end the upper bound of the range of bewertungskriteriums (not inclusive)
    * @return the range of bewertungskriteriums
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Bewertungskriterium> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the bewertungskriteriums.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.BewertungskriteriumModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of bewertungskriteriums
    * @param end the upper bound of the range of bewertungskriteriums (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of bewertungskriteriums
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Bewertungskriterium> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the bewertungskriteriums from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of bewertungskriteriums.
    *
    * @return the number of bewertungskriteriums
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static BewertungskriteriumPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (BewertungskriteriumPersistence) PortletBeanLocatorUtil.locate(de.hska.wi.awp.datasource.infosys.service.ClpSerializer.getServletContextName(),
                    BewertungskriteriumPersistence.class.getName());

            ReferenceRegistry.registerReference(BewertungskriteriumUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(BewertungskriteriumPersistence persistence) {
    }
}
