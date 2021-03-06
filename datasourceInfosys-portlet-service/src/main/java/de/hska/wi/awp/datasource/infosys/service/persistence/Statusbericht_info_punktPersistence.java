package de.hska.wi.awp.datasource.infosys.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import de.hska.wi.awp.datasource.infosys.model.Statusbericht_info_punkt;

/**
 * The persistence interface for the statusbericht_info_punkt service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Daniel Storch
 * @see Statusbericht_info_punktPersistenceImpl
 * @see Statusbericht_info_punktUtil
 * @generated
 */
public interface Statusbericht_info_punktPersistence extends BasePersistence<Statusbericht_info_punkt> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link Statusbericht_info_punktUtil} to access the statusbericht_info_punkt persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the statusbericht_info_punkt in the entity cache if it is enabled.
    *
    * @param statusbericht_info_punkt the statusbericht_info_punkt
    */
    public void cacheResult(
        de.hska.wi.awp.datasource.infosys.model.Statusbericht_info_punkt statusbericht_info_punkt);

    /**
    * Caches the statusbericht_info_punkts in the entity cache if it is enabled.
    *
    * @param statusbericht_info_punkts the statusbericht_info_punkts
    */
    public void cacheResult(
        java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusbericht_info_punkt> statusbericht_info_punkts);

    /**
    * Creates a new statusbericht_info_punkt with the primary key. Does not add the statusbericht_info_punkt to the database.
    *
    * @param id the primary key for the new statusbericht_info_punkt
    * @return the new statusbericht_info_punkt
    */
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_info_punkt create(
        long id);

    /**
    * Removes the statusbericht_info_punkt with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the statusbericht_info_punkt
    * @return the statusbericht_info_punkt that was removed
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_info_punktException if a statusbericht_info_punkt with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_info_punkt remove(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_info_punktException;

    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_info_punkt updateImpl(
        de.hska.wi.awp.datasource.infosys.model.Statusbericht_info_punkt statusbericht_info_punkt)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the statusbericht_info_punkt with the primary key or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_info_punktException} if it could not be found.
    *
    * @param id the primary key of the statusbericht_info_punkt
    * @return the statusbericht_info_punkt
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_info_punktException if a statusbericht_info_punkt with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_info_punkt findByPrimaryKey(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_info_punktException;

    /**
    * Returns the statusbericht_info_punkt with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the statusbericht_info_punkt
    * @return the statusbericht_info_punkt, or <code>null</code> if a statusbericht_info_punkt with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_info_punkt fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the statusbericht_info_punkts.
    *
    * @return the statusbericht_info_punkts
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusbericht_info_punkt> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusbericht_info_punkt> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusbericht_info_punkt> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the statusbericht_info_punkts from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of statusbericht_info_punkts.
    *
    * @return the number of statusbericht_info_punkts
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
