package de.hska.wi.awp.datasource.infosys.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import de.hska.wi.awp.datasource.infosys.model.Feedback;

import java.util.List;

/**
 * The persistence utility for the feedback service. This utility wraps {@link FeedbackPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Daniel Storch
 * @see FeedbackPersistence
 * @see FeedbackPersistenceImpl
 * @generated
 */
public class FeedbackUtil {
    private static FeedbackPersistence _persistence;

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
    public static void clearCache(Feedback feedback) {
        getPersistence().clearCache(feedback);
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
    public static List<Feedback> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Feedback> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Feedback> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Feedback update(Feedback feedback) throws SystemException {
        return getPersistence().update(feedback);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Feedback update(Feedback feedback,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(feedback, serviceContext);
    }

    /**
    * Returns all the feedbacks where student_id = &#63; and feedback_runden_nr = &#63;.
    *
    * @param student_id the student_id
    * @param feedback_runden_nr the feedback_runden_nr
    * @return the matching feedbacks
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Feedback> findByStudent_idAndFeedback_runden_nr(
        long student_id, int feedback_runden_nr)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByStudent_idAndFeedback_runden_nr(student_id,
            feedback_runden_nr);
    }

    /**
    * Returns a range of all the feedbacks where student_id = &#63; and feedback_runden_nr = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param student_id the student_id
    * @param feedback_runden_nr the feedback_runden_nr
    * @param start the lower bound of the range of feedbacks
    * @param end the upper bound of the range of feedbacks (not inclusive)
    * @return the range of matching feedbacks
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Feedback> findByStudent_idAndFeedback_runden_nr(
        long student_id, int feedback_runden_nr, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByStudent_idAndFeedback_runden_nr(student_id,
            feedback_runden_nr, start, end);
    }

    /**
    * Returns an ordered range of all the feedbacks where student_id = &#63; and feedback_runden_nr = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param student_id the student_id
    * @param feedback_runden_nr the feedback_runden_nr
    * @param start the lower bound of the range of feedbacks
    * @param end the upper bound of the range of feedbacks (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching feedbacks
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Feedback> findByStudent_idAndFeedback_runden_nr(
        long student_id, int feedback_runden_nr, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByStudent_idAndFeedback_runden_nr(student_id,
            feedback_runden_nr, start, end, orderByComparator);
    }

    /**
    * Returns the first feedback in the ordered set where student_id = &#63; and feedback_runden_nr = &#63;.
    *
    * @param student_id the student_id
    * @param feedback_runden_nr the feedback_runden_nr
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching feedback
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchFeedbackException if a matching feedback could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Feedback findByStudent_idAndFeedback_runden_nr_First(
        long student_id, int feedback_runden_nr,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchFeedbackException {
        return getPersistence()
                   .findByStudent_idAndFeedback_runden_nr_First(student_id,
            feedback_runden_nr, orderByComparator);
    }

    /**
    * Returns the first feedback in the ordered set where student_id = &#63; and feedback_runden_nr = &#63;.
    *
    * @param student_id the student_id
    * @param feedback_runden_nr the feedback_runden_nr
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching feedback, or <code>null</code> if a matching feedback could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Feedback fetchByStudent_idAndFeedback_runden_nr_First(
        long student_id, int feedback_runden_nr,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByStudent_idAndFeedback_runden_nr_First(student_id,
            feedback_runden_nr, orderByComparator);
    }

    /**
    * Returns the last feedback in the ordered set where student_id = &#63; and feedback_runden_nr = &#63;.
    *
    * @param student_id the student_id
    * @param feedback_runden_nr the feedback_runden_nr
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching feedback
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchFeedbackException if a matching feedback could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Feedback findByStudent_idAndFeedback_runden_nr_Last(
        long student_id, int feedback_runden_nr,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchFeedbackException {
        return getPersistence()
                   .findByStudent_idAndFeedback_runden_nr_Last(student_id,
            feedback_runden_nr, orderByComparator);
    }

    /**
    * Returns the last feedback in the ordered set where student_id = &#63; and feedback_runden_nr = &#63;.
    *
    * @param student_id the student_id
    * @param feedback_runden_nr the feedback_runden_nr
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching feedback, or <code>null</code> if a matching feedback could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Feedback fetchByStudent_idAndFeedback_runden_nr_Last(
        long student_id, int feedback_runden_nr,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByStudent_idAndFeedback_runden_nr_Last(student_id,
            feedback_runden_nr, orderByComparator);
    }

    /**
    * Returns the feedbacks before and after the current feedback in the ordered set where student_id = &#63; and feedback_runden_nr = &#63;.
    *
    * @param id the primary key of the current feedback
    * @param student_id the student_id
    * @param feedback_runden_nr the feedback_runden_nr
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next feedback
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchFeedbackException if a feedback with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Feedback[] findByStudent_idAndFeedback_runden_nr_PrevAndNext(
        long id, long student_id, int feedback_runden_nr,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchFeedbackException {
        return getPersistence()
                   .findByStudent_idAndFeedback_runden_nr_PrevAndNext(id,
            student_id, feedback_runden_nr, orderByComparator);
    }

    /**
    * Removes all the feedbacks where student_id = &#63; and feedback_runden_nr = &#63; from the database.
    *
    * @param student_id the student_id
    * @param feedback_runden_nr the feedback_runden_nr
    * @throws SystemException if a system exception occurred
    */
    public static void removeByStudent_idAndFeedback_runden_nr(
        long student_id, int feedback_runden_nr)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence()
            .removeByStudent_idAndFeedback_runden_nr(student_id,
            feedback_runden_nr);
    }

    /**
    * Returns the number of feedbacks where student_id = &#63; and feedback_runden_nr = &#63;.
    *
    * @param student_id the student_id
    * @param feedback_runden_nr the feedback_runden_nr
    * @return the number of matching feedbacks
    * @throws SystemException if a system exception occurred
    */
    public static int countByStudent_idAndFeedback_runden_nr(long student_id,
        int feedback_runden_nr)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .countByStudent_idAndFeedback_runden_nr(student_id,
            feedback_runden_nr);
    }

    /**
    * Caches the feedback in the entity cache if it is enabled.
    *
    * @param feedback the feedback
    */
    public static void cacheResult(
        de.hska.wi.awp.datasource.infosys.model.Feedback feedback) {
        getPersistence().cacheResult(feedback);
    }

    /**
    * Caches the feedbacks in the entity cache if it is enabled.
    *
    * @param feedbacks the feedbacks
    */
    public static void cacheResult(
        java.util.List<de.hska.wi.awp.datasource.infosys.model.Feedback> feedbacks) {
        getPersistence().cacheResult(feedbacks);
    }

    /**
    * Creates a new feedback with the primary key. Does not add the feedback to the database.
    *
    * @param id the primary key for the new feedback
    * @return the new feedback
    */
    public static de.hska.wi.awp.datasource.infosys.model.Feedback create(
        long id) {
        return getPersistence().create(id);
    }

    /**
    * Removes the feedback with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the feedback
    * @return the feedback that was removed
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchFeedbackException if a feedback with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Feedback remove(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchFeedbackException {
        return getPersistence().remove(id);
    }

    public static de.hska.wi.awp.datasource.infosys.model.Feedback updateImpl(
        de.hska.wi.awp.datasource.infosys.model.Feedback feedback)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(feedback);
    }

    /**
    * Returns the feedback with the primary key or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchFeedbackException} if it could not be found.
    *
    * @param id the primary key of the feedback
    * @return the feedback
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchFeedbackException if a feedback with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Feedback findByPrimaryKey(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchFeedbackException {
        return getPersistence().findByPrimaryKey(id);
    }

    /**
    * Returns the feedback with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the feedback
    * @return the feedback, or <code>null</code> if a feedback with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Feedback fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(id);
    }

    /**
    * Returns all the feedbacks.
    *
    * @return the feedbacks
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Feedback> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

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
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Feedback> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Feedback> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the feedbacks from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of feedbacks.
    *
    * @return the number of feedbacks
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static FeedbackPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (FeedbackPersistence) PortletBeanLocatorUtil.locate(de.hska.wi.awp.datasource.infosys.service.ClpSerializer.getServletContextName(),
                    FeedbackPersistence.class.getName());

            ReferenceRegistry.registerReference(FeedbackUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(FeedbackPersistence persistence) {
    }
}
