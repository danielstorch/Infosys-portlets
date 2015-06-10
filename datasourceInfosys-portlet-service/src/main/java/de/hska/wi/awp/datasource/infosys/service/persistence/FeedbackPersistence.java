package de.hska.wi.awp.datasource.infosys.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import de.hska.wi.awp.datasource.infosys.model.Feedback;

/**
 * The persistence interface for the feedback service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Daniel Storch
 * @see FeedbackPersistenceImpl
 * @see FeedbackUtil
 * @generated
 */
public interface FeedbackPersistence extends BasePersistence<Feedback> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link FeedbackUtil} to access the feedback persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the feedbacks where student_id = &#63;.
    *
    * @param student_id the student_id
    * @return the matching feedbacks
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Feedback> findByStudent_id(
        long student_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the feedbacks where student_id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param student_id the student_id
    * @param start the lower bound of the range of feedbacks
    * @param end the upper bound of the range of feedbacks (not inclusive)
    * @return the range of matching feedbacks
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Feedback> findByStudent_id(
        long student_id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the feedbacks where student_id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param student_id the student_id
    * @param start the lower bound of the range of feedbacks
    * @param end the upper bound of the range of feedbacks (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching feedbacks
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Feedback> findByStudent_id(
        long student_id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first feedback in the ordered set where student_id = &#63;.
    *
    * @param student_id the student_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching feedback
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchFeedbackException if a matching feedback could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Feedback findByStudent_id_First(
        long student_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchFeedbackException;

    /**
    * Returns the first feedback in the ordered set where student_id = &#63;.
    *
    * @param student_id the student_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching feedback, or <code>null</code> if a matching feedback could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Feedback fetchByStudent_id_First(
        long student_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last feedback in the ordered set where student_id = &#63;.
    *
    * @param student_id the student_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching feedback
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchFeedbackException if a matching feedback could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Feedback findByStudent_id_Last(
        long student_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchFeedbackException;

    /**
    * Returns the last feedback in the ordered set where student_id = &#63;.
    *
    * @param student_id the student_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching feedback, or <code>null</code> if a matching feedback could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Feedback fetchByStudent_id_Last(
        long student_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the feedbacks before and after the current feedback in the ordered set where student_id = &#63;.
    *
    * @param id the primary key of the current feedback
    * @param student_id the student_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next feedback
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchFeedbackException if a feedback with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Feedback[] findByStudent_id_PrevAndNext(
        long id, long student_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchFeedbackException;

    /**
    * Removes all the feedbacks where student_id = &#63; from the database.
    *
    * @param student_id the student_id
    * @throws SystemException if a system exception occurred
    */
    public void removeByStudent_id(long student_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of feedbacks where student_id = &#63;.
    *
    * @param student_id the student_id
    * @return the number of matching feedbacks
    * @throws SystemException if a system exception occurred
    */
    public int countByStudent_id(long student_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the feedback in the entity cache if it is enabled.
    *
    * @param feedback the feedback
    */
    public void cacheResult(
        de.hska.wi.awp.datasource.infosys.model.Feedback feedback);

    /**
    * Caches the feedbacks in the entity cache if it is enabled.
    *
    * @param feedbacks the feedbacks
    */
    public void cacheResult(
        java.util.List<de.hska.wi.awp.datasource.infosys.model.Feedback> feedbacks);

    /**
    * Creates a new feedback with the primary key. Does not add the feedback to the database.
    *
    * @param id the primary key for the new feedback
    * @return the new feedback
    */
    public de.hska.wi.awp.datasource.infosys.model.Feedback create(long id);

    /**
    * Removes the feedback with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the feedback
    * @return the feedback that was removed
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchFeedbackException if a feedback with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Feedback remove(long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchFeedbackException;

    public de.hska.wi.awp.datasource.infosys.model.Feedback updateImpl(
        de.hska.wi.awp.datasource.infosys.model.Feedback feedback)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the feedback with the primary key or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchFeedbackException} if it could not be found.
    *
    * @param id the primary key of the feedback
    * @return the feedback
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchFeedbackException if a feedback with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Feedback findByPrimaryKey(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchFeedbackException;

    /**
    * Returns the feedback with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the feedback
    * @return the feedback, or <code>null</code> if a feedback with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Feedback fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the feedbacks.
    *
    * @return the feedbacks
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Feedback> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the feedbacks.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of feedbacks
    * @param end the upper bound of the range of feedbacks (not inclusive)
    * @return the range of feedbacks
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Feedback> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the feedbacks.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of feedbacks
    * @param end the upper bound of the range of feedbacks (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of feedbacks
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Feedback> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the feedbacks from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of feedbacks.
    *
    * @return the number of feedbacks
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
