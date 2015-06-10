package de.hska.wi.awp.datasource.infosys.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import de.hska.wi.awp.datasource.infosys.model.Statusberichte;

/**
 * The persistence interface for the statusberichte service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Daniel Storch
 * @see StatusberichtePersistenceImpl
 * @see StatusberichteUtil
 * @generated
 */
public interface StatusberichtePersistence extends BasePersistence<Statusberichte> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link StatusberichteUtil} to access the statusberichte persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the statusberichtes where project_id = &#63;.
    *
    * @param project_id the project_id
    * @return the matching statusberichtes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusberichte> findByProject_id(
        long project_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the statusberichtes where project_id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.StatusberichteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param project_id the project_id
    * @param start the lower bound of the range of statusberichtes
    * @param end the upper bound of the range of statusberichtes (not inclusive)
    * @return the range of matching statusberichtes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusberichte> findByProject_id(
        long project_id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the statusberichtes where project_id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.StatusberichteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param project_id the project_id
    * @param start the lower bound of the range of statusberichtes
    * @param end the upper bound of the range of statusberichtes (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching statusberichtes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusberichte> findByProject_id(
        long project_id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first statusberichte in the ordered set where project_id = &#63;.
    *
    * @param project_id the project_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching statusberichte
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusberichteException if a matching statusberichte could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Statusberichte findByProject_id_First(
        long project_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchStatusberichteException;

    /**
    * Returns the first statusberichte in the ordered set where project_id = &#63;.
    *
    * @param project_id the project_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching statusberichte, or <code>null</code> if a matching statusberichte could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Statusberichte fetchByProject_id_First(
        long project_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last statusberichte in the ordered set where project_id = &#63;.
    *
    * @param project_id the project_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching statusberichte
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusberichteException if a matching statusberichte could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Statusberichte findByProject_id_Last(
        long project_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchStatusberichteException;

    /**
    * Returns the last statusberichte in the ordered set where project_id = &#63;.
    *
    * @param project_id the project_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching statusberichte, or <code>null</code> if a matching statusberichte could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Statusberichte fetchByProject_id_Last(
        long project_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the statusberichtes before and after the current statusberichte in the ordered set where project_id = &#63;.
    *
    * @param id the primary key of the current statusberichte
    * @param project_id the project_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next statusberichte
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusberichteException if a statusberichte with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Statusberichte[] findByProject_id_PrevAndNext(
        long id, long project_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchStatusberichteException;

    /**
    * Removes all the statusberichtes where project_id = &#63; from the database.
    *
    * @param project_id the project_id
    * @throws SystemException if a system exception occurred
    */
    public void removeByProject_id(long project_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of statusberichtes where project_id = &#63;.
    *
    * @param project_id the project_id
    * @return the number of matching statusberichtes
    * @throws SystemException if a system exception occurred
    */
    public int countByProject_id(long project_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the statusberichte in the entity cache if it is enabled.
    *
    * @param statusberichte the statusberichte
    */
    public void cacheResult(
        de.hska.wi.awp.datasource.infosys.model.Statusberichte statusberichte);

    /**
    * Caches the statusberichtes in the entity cache if it is enabled.
    *
    * @param statusberichtes the statusberichtes
    */
    public void cacheResult(
        java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusberichte> statusberichtes);

    /**
    * Creates a new statusberichte with the primary key. Does not add the statusberichte to the database.
    *
    * @param id the primary key for the new statusberichte
    * @return the new statusberichte
    */
    public de.hska.wi.awp.datasource.infosys.model.Statusberichte create(
        long id);

    /**
    * Removes the statusberichte with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the statusberichte
    * @return the statusberichte that was removed
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusberichteException if a statusberichte with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Statusberichte remove(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchStatusberichteException;

    public de.hska.wi.awp.datasource.infosys.model.Statusberichte updateImpl(
        de.hska.wi.awp.datasource.infosys.model.Statusberichte statusberichte)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the statusberichte with the primary key or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchStatusberichteException} if it could not be found.
    *
    * @param id the primary key of the statusberichte
    * @return the statusberichte
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusberichteException if a statusberichte with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Statusberichte findByPrimaryKey(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchStatusberichteException;

    /**
    * Returns the statusberichte with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the statusberichte
    * @return the statusberichte, or <code>null</code> if a statusberichte with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Statusberichte fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the statusberichtes.
    *
    * @return the statusberichtes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusberichte> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the statusberichtes.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.StatusberichteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of statusberichtes
    * @param end the upper bound of the range of statusberichtes (not inclusive)
    * @return the range of statusberichtes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusberichte> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the statusberichtes.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.StatusberichteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of statusberichtes
    * @param end the upper bound of the range of statusberichtes (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of statusberichtes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusberichte> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the statusberichtes from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of statusberichtes.
    *
    * @return the number of statusberichtes
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
