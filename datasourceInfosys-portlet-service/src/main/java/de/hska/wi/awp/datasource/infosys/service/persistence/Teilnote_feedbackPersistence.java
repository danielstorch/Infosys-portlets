package de.hska.wi.awp.datasource.infosys.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback;

/**
 * The persistence interface for the teilnote_feedback service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Daniel Storch
 * @see Teilnote_feedbackPersistenceImpl
 * @see Teilnote_feedbackUtil
 * @generated
 */
public interface Teilnote_feedbackPersistence extends BasePersistence<Teilnote_feedback> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link Teilnote_feedbackUtil} to access the teilnote_feedback persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns the teilnote_feedback where feedback_id = &#63; and bewertungskriterium_id = &#63; or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchTeilnote_feedbackException} if it could not be found.
    *
    * @param feedback_id the feedback_id
    * @param bewertungskriterium_id the bewertungskriterium_id
    * @return the matching teilnote_feedback
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchTeilnote_feedbackException if a matching teilnote_feedback could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback findByFeedback_idAndBewertungskriterium_id(
        long feedback_id, long bewertungskriterium_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchTeilnote_feedbackException;

    /**
    * Returns the teilnote_feedback where feedback_id = &#63; and bewertungskriterium_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param feedback_id the feedback_id
    * @param bewertungskriterium_id the bewertungskriterium_id
    * @return the matching teilnote_feedback, or <code>null</code> if a matching teilnote_feedback could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback fetchByFeedback_idAndBewertungskriterium_id(
        long feedback_id, long bewertungskriterium_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the teilnote_feedback where feedback_id = &#63; and bewertungskriterium_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param feedback_id the feedback_id
    * @param bewertungskriterium_id the bewertungskriterium_id
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching teilnote_feedback, or <code>null</code> if a matching teilnote_feedback could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback fetchByFeedback_idAndBewertungskriterium_id(
        long feedback_id, long bewertungskriterium_id, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the teilnote_feedback where feedback_id = &#63; and bewertungskriterium_id = &#63; from the database.
    *
    * @param feedback_id the feedback_id
    * @param bewertungskriterium_id the bewertungskriterium_id
    * @return the teilnote_feedback that was removed
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback removeByFeedback_idAndBewertungskriterium_id(
        long feedback_id, long bewertungskriterium_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchTeilnote_feedbackException;

    /**
    * Returns the number of teilnote_feedbacks where feedback_id = &#63; and bewertungskriterium_id = &#63;.
    *
    * @param feedback_id the feedback_id
    * @param bewertungskriterium_id the bewertungskriterium_id
    * @return the number of matching teilnote_feedbacks
    * @throws SystemException if a system exception occurred
    */
    public int countByFeedback_idAndBewertungskriterium_id(long feedback_id,
        long bewertungskriterium_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the teilnote_feedback in the entity cache if it is enabled.
    *
    * @param teilnote_feedback the teilnote_feedback
    */
    public void cacheResult(
        de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback teilnote_feedback);

    /**
    * Caches the teilnote_feedbacks in the entity cache if it is enabled.
    *
    * @param teilnote_feedbacks the teilnote_feedbacks
    */
    public void cacheResult(
        java.util.List<de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback> teilnote_feedbacks);

    /**
    * Creates a new teilnote_feedback with the primary key. Does not add the teilnote_feedback to the database.
    *
    * @param id the primary key for the new teilnote_feedback
    * @return the new teilnote_feedback
    */
    public de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback create(
        long id);

    /**
    * Removes the teilnote_feedback with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the teilnote_feedback
    * @return the teilnote_feedback that was removed
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchTeilnote_feedbackException if a teilnote_feedback with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback remove(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchTeilnote_feedbackException;

    public de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback updateImpl(
        de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback teilnote_feedback)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the teilnote_feedback with the primary key or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchTeilnote_feedbackException} if it could not be found.
    *
    * @param id the primary key of the teilnote_feedback
    * @return the teilnote_feedback
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchTeilnote_feedbackException if a teilnote_feedback with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback findByPrimaryKey(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchTeilnote_feedbackException;

    /**
    * Returns the teilnote_feedback with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the teilnote_feedback
    * @return the teilnote_feedback, or <code>null</code> if a teilnote_feedback with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the teilnote_feedbacks.
    *
    * @return the teilnote_feedbacks
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the teilnote_feedbacks.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Teilnote_feedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of teilnote_feedbacks
    * @param end the upper bound of the range of teilnote_feedbacks (not inclusive)
    * @return the range of teilnote_feedbacks
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the teilnote_feedbacks.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Teilnote_feedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of teilnote_feedbacks
    * @param end the upper bound of the range of teilnote_feedbacks (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of teilnote_feedbacks
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the teilnote_feedbacks from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of teilnote_feedbacks.
    *
    * @return the number of teilnote_feedbacks
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
