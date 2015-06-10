package de.hska.wi.awp.datasource.infosys.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import de.hska.wi.awp.datasource.infosys.model.Teilnote;

/**
 * The persistence interface for the teilnote service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Daniel Storch
 * @see TeilnotePersistenceImpl
 * @see TeilnoteUtil
 * @generated
 */
public interface TeilnotePersistence extends BasePersistence<Teilnote> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link TeilnoteUtil} to access the teilnote persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the teilnotes where feedback_id = &#63;.
    *
    * @param feedback_id the feedback_id
    * @return the matching teilnotes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Teilnote> findByFeedback_id(
        long feedback_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the teilnotes where feedback_id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.TeilnoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param feedback_id the feedback_id
    * @param start the lower bound of the range of teilnotes
    * @param end the upper bound of the range of teilnotes (not inclusive)
    * @return the range of matching teilnotes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Teilnote> findByFeedback_id(
        long feedback_id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the teilnotes where feedback_id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.TeilnoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param feedback_id the feedback_id
    * @param start the lower bound of the range of teilnotes
    * @param end the upper bound of the range of teilnotes (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching teilnotes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Teilnote> findByFeedback_id(
        long feedback_id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first teilnote in the ordered set where feedback_id = &#63;.
    *
    * @param feedback_id the feedback_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching teilnote
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchTeilnoteException if a matching teilnote could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Teilnote findByFeedback_id_First(
        long feedback_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchTeilnoteException;

    /**
    * Returns the first teilnote in the ordered set where feedback_id = &#63;.
    *
    * @param feedback_id the feedback_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching teilnote, or <code>null</code> if a matching teilnote could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Teilnote fetchByFeedback_id_First(
        long feedback_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last teilnote in the ordered set where feedback_id = &#63;.
    *
    * @param feedback_id the feedback_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching teilnote
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchTeilnoteException if a matching teilnote could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Teilnote findByFeedback_id_Last(
        long feedback_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchTeilnoteException;

    /**
    * Returns the last teilnote in the ordered set where feedback_id = &#63;.
    *
    * @param feedback_id the feedback_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching teilnote, or <code>null</code> if a matching teilnote could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Teilnote fetchByFeedback_id_Last(
        long feedback_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the teilnotes before and after the current teilnote in the ordered set where feedback_id = &#63;.
    *
    * @param id the primary key of the current teilnote
    * @param feedback_id the feedback_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next teilnote
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchTeilnoteException if a teilnote with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Teilnote[] findByFeedback_id_PrevAndNext(
        long id, long feedback_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchTeilnoteException;

    /**
    * Removes all the teilnotes where feedback_id = &#63; from the database.
    *
    * @param feedback_id the feedback_id
    * @throws SystemException if a system exception occurred
    */
    public void removeByFeedback_id(long feedback_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of teilnotes where feedback_id = &#63;.
    *
    * @param feedback_id the feedback_id
    * @return the number of matching teilnotes
    * @throws SystemException if a system exception occurred
    */
    public int countByFeedback_id(long feedback_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the teilnote in the entity cache if it is enabled.
    *
    * @param teilnote the teilnote
    */
    public void cacheResult(
        de.hska.wi.awp.datasource.infosys.model.Teilnote teilnote);

    /**
    * Caches the teilnotes in the entity cache if it is enabled.
    *
    * @param teilnotes the teilnotes
    */
    public void cacheResult(
        java.util.List<de.hska.wi.awp.datasource.infosys.model.Teilnote> teilnotes);

    /**
    * Creates a new teilnote with the primary key. Does not add the teilnote to the database.
    *
    * @param id the primary key for the new teilnote
    * @return the new teilnote
    */
    public de.hska.wi.awp.datasource.infosys.model.Teilnote create(long id);

    /**
    * Removes the teilnote with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the teilnote
    * @return the teilnote that was removed
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchTeilnoteException if a teilnote with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Teilnote remove(long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchTeilnoteException;

    public de.hska.wi.awp.datasource.infosys.model.Teilnote updateImpl(
        de.hska.wi.awp.datasource.infosys.model.Teilnote teilnote)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the teilnote with the primary key or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchTeilnoteException} if it could not be found.
    *
    * @param id the primary key of the teilnote
    * @return the teilnote
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchTeilnoteException if a teilnote with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Teilnote findByPrimaryKey(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchTeilnoteException;

    /**
    * Returns the teilnote with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the teilnote
    * @return the teilnote, or <code>null</code> if a teilnote with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Teilnote fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the teilnotes.
    *
    * @return the teilnotes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Teilnote> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the teilnotes.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.TeilnoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of teilnotes
    * @param end the upper bound of the range of teilnotes (not inclusive)
    * @return the range of teilnotes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Teilnote> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the teilnotes.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.TeilnoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of teilnotes
    * @param end the upper bound of the range of teilnotes (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of teilnotes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Teilnote> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the teilnotes from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of teilnotes.
    *
    * @return the number of teilnotes
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
