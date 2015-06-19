package de.hska.wi.awp.datasource.infosys.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import de.hska.wi.awp.datasource.infosys.model.Statusbericht_geplante_arbeit;

/**
 * The persistence interface for the statusbericht_geplante_arbeit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Daniel Storch
 * @see Statusbericht_geplante_arbeitPersistenceImpl
 * @see Statusbericht_geplante_arbeitUtil
 * @generated
 */
public interface Statusbericht_geplante_arbeitPersistence
    extends BasePersistence<Statusbericht_geplante_arbeit> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link Statusbericht_geplante_arbeitUtil} to access the statusbericht_geplante_arbeit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the statusbericht_geplante_arbeits where statusbericht_id = &#63;.
    *
    * @param statusbericht_id the statusbericht_id
    * @return the matching statusbericht_geplante_arbeits
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusbericht_geplante_arbeit> findByStatusbericht_id(
        long statusbericht_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the statusbericht_geplante_arbeits where statusbericht_id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_geplante_arbeitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param statusbericht_id the statusbericht_id
    * @param start the lower bound of the range of statusbericht_geplante_arbeits
    * @param end the upper bound of the range of statusbericht_geplante_arbeits (not inclusive)
    * @return the range of matching statusbericht_geplante_arbeits
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusbericht_geplante_arbeit> findByStatusbericht_id(
        long statusbericht_id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the statusbericht_geplante_arbeits where statusbericht_id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_geplante_arbeitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param statusbericht_id the statusbericht_id
    * @param start the lower bound of the range of statusbericht_geplante_arbeits
    * @param end the upper bound of the range of statusbericht_geplante_arbeits (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching statusbericht_geplante_arbeits
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusbericht_geplante_arbeit> findByStatusbericht_id(
        long statusbericht_id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first statusbericht_geplante_arbeit in the ordered set where statusbericht_id = &#63;.
    *
    * @param statusbericht_id the statusbericht_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching statusbericht_geplante_arbeit
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_geplante_arbeitException if a matching statusbericht_geplante_arbeit could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_geplante_arbeit findByStatusbericht_id_First(
        long statusbericht_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_geplante_arbeitException;

    /**
    * Returns the first statusbericht_geplante_arbeit in the ordered set where statusbericht_id = &#63;.
    *
    * @param statusbericht_id the statusbericht_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching statusbericht_geplante_arbeit, or <code>null</code> if a matching statusbericht_geplante_arbeit could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_geplante_arbeit fetchByStatusbericht_id_First(
        long statusbericht_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last statusbericht_geplante_arbeit in the ordered set where statusbericht_id = &#63;.
    *
    * @param statusbericht_id the statusbericht_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching statusbericht_geplante_arbeit
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_geplante_arbeitException if a matching statusbericht_geplante_arbeit could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_geplante_arbeit findByStatusbericht_id_Last(
        long statusbericht_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_geplante_arbeitException;

    /**
    * Returns the last statusbericht_geplante_arbeit in the ordered set where statusbericht_id = &#63;.
    *
    * @param statusbericht_id the statusbericht_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching statusbericht_geplante_arbeit, or <code>null</code> if a matching statusbericht_geplante_arbeit could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_geplante_arbeit fetchByStatusbericht_id_Last(
        long statusbericht_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the statusbericht_geplante_arbeits before and after the current statusbericht_geplante_arbeit in the ordered set where statusbericht_id = &#63;.
    *
    * @param id the primary key of the current statusbericht_geplante_arbeit
    * @param statusbericht_id the statusbericht_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next statusbericht_geplante_arbeit
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_geplante_arbeitException if a statusbericht_geplante_arbeit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_geplante_arbeit[] findByStatusbericht_id_PrevAndNext(
        long id, long statusbericht_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_geplante_arbeitException;

    /**
    * Removes all the statusbericht_geplante_arbeits where statusbericht_id = &#63; from the database.
    *
    * @param statusbericht_id the statusbericht_id
    * @throws SystemException if a system exception occurred
    */
    public void removeByStatusbericht_id(long statusbericht_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of statusbericht_geplante_arbeits where statusbericht_id = &#63;.
    *
    * @param statusbericht_id the statusbericht_id
    * @return the number of matching statusbericht_geplante_arbeits
    * @throws SystemException if a system exception occurred
    */
    public int countByStatusbericht_id(long statusbericht_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the statusbericht_geplante_arbeit in the entity cache if it is enabled.
    *
    * @param statusbericht_geplante_arbeit the statusbericht_geplante_arbeit
    */
    public void cacheResult(
        de.hska.wi.awp.datasource.infosys.model.Statusbericht_geplante_arbeit statusbericht_geplante_arbeit);

    /**
    * Caches the statusbericht_geplante_arbeits in the entity cache if it is enabled.
    *
    * @param statusbericht_geplante_arbeits the statusbericht_geplante_arbeits
    */
    public void cacheResult(
        java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusbericht_geplante_arbeit> statusbericht_geplante_arbeits);

    /**
    * Creates a new statusbericht_geplante_arbeit with the primary key. Does not add the statusbericht_geplante_arbeit to the database.
    *
    * @param id the primary key for the new statusbericht_geplante_arbeit
    * @return the new statusbericht_geplante_arbeit
    */
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_geplante_arbeit create(
        long id);

    /**
    * Removes the statusbericht_geplante_arbeit with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the statusbericht_geplante_arbeit
    * @return the statusbericht_geplante_arbeit that was removed
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_geplante_arbeitException if a statusbericht_geplante_arbeit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_geplante_arbeit remove(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_geplante_arbeitException;

    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_geplante_arbeit updateImpl(
        de.hska.wi.awp.datasource.infosys.model.Statusbericht_geplante_arbeit statusbericht_geplante_arbeit)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the statusbericht_geplante_arbeit with the primary key or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_geplante_arbeitException} if it could not be found.
    *
    * @param id the primary key of the statusbericht_geplante_arbeit
    * @return the statusbericht_geplante_arbeit
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_geplante_arbeitException if a statusbericht_geplante_arbeit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_geplante_arbeit findByPrimaryKey(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_geplante_arbeitException;

    /**
    * Returns the statusbericht_geplante_arbeit with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the statusbericht_geplante_arbeit
    * @return the statusbericht_geplante_arbeit, or <code>null</code> if a statusbericht_geplante_arbeit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_geplante_arbeit fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the statusbericht_geplante_arbeits.
    *
    * @return the statusbericht_geplante_arbeits
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusbericht_geplante_arbeit> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the statusbericht_geplante_arbeits.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_geplante_arbeitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of statusbericht_geplante_arbeits
    * @param end the upper bound of the range of statusbericht_geplante_arbeits (not inclusive)
    * @return the range of statusbericht_geplante_arbeits
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusbericht_geplante_arbeit> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the statusbericht_geplante_arbeits.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_geplante_arbeitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of statusbericht_geplante_arbeits
    * @param end the upper bound of the range of statusbericht_geplante_arbeits (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of statusbericht_geplante_arbeits
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusbericht_geplante_arbeit> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the statusbericht_geplante_arbeits from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of statusbericht_geplante_arbeits.
    *
    * @return the number of statusbericht_geplante_arbeits
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
