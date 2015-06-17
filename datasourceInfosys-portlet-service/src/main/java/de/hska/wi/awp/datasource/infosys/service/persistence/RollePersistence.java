package de.hska.wi.awp.datasource.infosys.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import de.hska.wi.awp.datasource.infosys.model.Rolle;

/**
 * The persistence interface for the rolle service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Daniel Storch
 * @see RollePersistenceImpl
 * @see RolleUtil
 * @generated
 */
public interface RollePersistence extends BasePersistence<Rolle> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link RolleUtil} to access the rolle persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the rolle in the entity cache if it is enabled.
    *
    * @param rolle the rolle
    */
    public void cacheResult(de.hska.wi.awp.datasource.infosys.model.Rolle rolle);

    /**
    * Caches the rolles in the entity cache if it is enabled.
    *
    * @param rolles the rolles
    */
    public void cacheResult(
        java.util.List<de.hska.wi.awp.datasource.infosys.model.Rolle> rolles);

    /**
    * Creates a new rolle with the primary key. Does not add the rolle to the database.
    *
    * @param id the primary key for the new rolle
    * @return the new rolle
    */
    public de.hska.wi.awp.datasource.infosys.model.Rolle create(long id);

    /**
    * Removes the rolle with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the rolle
    * @return the rolle that was removed
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchRolleException if a rolle with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Rolle remove(long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchRolleException;

    public de.hska.wi.awp.datasource.infosys.model.Rolle updateImpl(
        de.hska.wi.awp.datasource.infosys.model.Rolle rolle)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the rolle with the primary key or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchRolleException} if it could not be found.
    *
    * @param id the primary key of the rolle
    * @return the rolle
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchRolleException if a rolle with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Rolle findByPrimaryKey(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchRolleException;

    /**
    * Returns the rolle with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the rolle
    * @return the rolle, or <code>null</code> if a rolle with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Rolle fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the rolles.
    *
    * @return the rolles
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Rolle> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the rolles.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.RolleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of rolles
    * @param end the upper bound of the range of rolles (not inclusive)
    * @return the range of rolles
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Rolle> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the rolles.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.RolleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of rolles
    * @param end the upper bound of the range of rolles (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of rolles
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Rolle> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the rolles from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rolles.
    *
    * @return the number of rolles
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
