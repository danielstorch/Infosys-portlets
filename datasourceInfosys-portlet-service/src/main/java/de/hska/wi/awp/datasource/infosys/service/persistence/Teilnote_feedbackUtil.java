package de.hska.wi.awp.datasource.infosys.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback;

import java.util.List;

/**
 * The persistence utility for the teilnote_feedback service. This utility wraps {@link Teilnote_feedbackPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Daniel Storch
 * @see Teilnote_feedbackPersistence
 * @see Teilnote_feedbackPersistenceImpl
 * @generated
 */
public class Teilnote_feedbackUtil {
    private static Teilnote_feedbackPersistence _persistence;

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
    public static void clearCache(Teilnote_feedback teilnote_feedback) {
        getPersistence().clearCache(teilnote_feedback);
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
    public static List<Teilnote_feedback> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Teilnote_feedback> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Teilnote_feedback> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Teilnote_feedback update(Teilnote_feedback teilnote_feedback)
        throws SystemException {
        return getPersistence().update(teilnote_feedback);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Teilnote_feedback update(
        Teilnote_feedback teilnote_feedback, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(teilnote_feedback, serviceContext);
    }

    /**
    * Returns all the teilnote_feedbacks where feedback_id = &#63;.
    *
    * @param feedback_id the feedback_id
    * @return the matching teilnote_feedbacks
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback> findByFeedback_id(
        long feedback_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByFeedback_id(feedback_id);
    }

    /**
    * Returns a range of all the teilnote_feedbacks where feedback_id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Teilnote_feedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param feedback_id the feedback_id
    * @param start the lower bound of the range of teilnote_feedbacks
    * @param end the upper bound of the range of teilnote_feedbacks (not inclusive)
    * @return the range of matching teilnote_feedbacks
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback> findByFeedback_id(
        long feedback_id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByFeedback_id(feedback_id, start, end);
    }

    /**
    * Returns an ordered range of all the teilnote_feedbacks where feedback_id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Teilnote_feedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param feedback_id the feedback_id
    * @param start the lower bound of the range of teilnote_feedbacks
    * @param end the upper bound of the range of teilnote_feedbacks (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching teilnote_feedbacks
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback> findByFeedback_id(
        long feedback_id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByFeedback_id(feedback_id, start, end, orderByComparator);
    }

    /**
    * Returns the first teilnote_feedback in the ordered set where feedback_id = &#63;.
    *
    * @param feedback_id the feedback_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching teilnote_feedback
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchTeilnote_feedbackException if a matching teilnote_feedback could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback findByFeedback_id_First(
        long feedback_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchTeilnote_feedbackException {
        return getPersistence()
                   .findByFeedback_id_First(feedback_id, orderByComparator);
    }

    /**
    * Returns the first teilnote_feedback in the ordered set where feedback_id = &#63;.
    *
    * @param feedback_id the feedback_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching teilnote_feedback, or <code>null</code> if a matching teilnote_feedback could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback fetchByFeedback_id_First(
        long feedback_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByFeedback_id_First(feedback_id, orderByComparator);
    }

    /**
    * Returns the last teilnote_feedback in the ordered set where feedback_id = &#63;.
    *
    * @param feedback_id the feedback_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching teilnote_feedback
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchTeilnote_feedbackException if a matching teilnote_feedback could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback findByFeedback_id_Last(
        long feedback_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchTeilnote_feedbackException {
        return getPersistence()
                   .findByFeedback_id_Last(feedback_id, orderByComparator);
    }

    /**
    * Returns the last teilnote_feedback in the ordered set where feedback_id = &#63;.
    *
    * @param feedback_id the feedback_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching teilnote_feedback, or <code>null</code> if a matching teilnote_feedback could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback fetchByFeedback_id_Last(
        long feedback_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByFeedback_id_Last(feedback_id, orderByComparator);
    }

    /**
    * Returns the teilnote_feedbacks before and after the current teilnote_feedback in the ordered set where feedback_id = &#63;.
    *
    * @param id the primary key of the current teilnote_feedback
    * @param feedback_id the feedback_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next teilnote_feedback
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchTeilnote_feedbackException if a teilnote_feedback with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback[] findByFeedback_id_PrevAndNext(
        long id, long feedback_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchTeilnote_feedbackException {
        return getPersistence()
                   .findByFeedback_id_PrevAndNext(id, feedback_id,
            orderByComparator);
    }

    /**
    * Removes all the teilnote_feedbacks where feedback_id = &#63; from the database.
    *
    * @param feedback_id the feedback_id
    * @throws SystemException if a system exception occurred
    */
    public static void removeByFeedback_id(long feedback_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByFeedback_id(feedback_id);
    }

    /**
    * Returns the number of teilnote_feedbacks where feedback_id = &#63;.
    *
    * @param feedback_id the feedback_id
    * @return the number of matching teilnote_feedbacks
    * @throws SystemException if a system exception occurred
    */
    public static int countByFeedback_id(long feedback_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByFeedback_id(feedback_id);
    }

    /**
    * Caches the teilnote_feedback in the entity cache if it is enabled.
    *
    * @param teilnote_feedback the teilnote_feedback
    */
    public static void cacheResult(
        de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback teilnote_feedback) {
        getPersistence().cacheResult(teilnote_feedback);
    }

    /**
    * Caches the teilnote_feedbacks in the entity cache if it is enabled.
    *
    * @param teilnote_feedbacks the teilnote_feedbacks
    */
    public static void cacheResult(
        java.util.List<de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback> teilnote_feedbacks) {
        getPersistence().cacheResult(teilnote_feedbacks);
    }

    /**
    * Creates a new teilnote_feedback with the primary key. Does not add the teilnote_feedback to the database.
    *
    * @param id the primary key for the new teilnote_feedback
    * @return the new teilnote_feedback
    */
    public static de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback create(
        long id) {
        return getPersistence().create(id);
    }

    /**
    * Removes the teilnote_feedback with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the teilnote_feedback
    * @return the teilnote_feedback that was removed
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchTeilnote_feedbackException if a teilnote_feedback with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback remove(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchTeilnote_feedbackException {
        return getPersistence().remove(id);
    }

    public static de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback updateImpl(
        de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback teilnote_feedback)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(teilnote_feedback);
    }

    /**
    * Returns the teilnote_feedback with the primary key or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchTeilnote_feedbackException} if it could not be found.
    *
    * @param id the primary key of the teilnote_feedback
    * @return the teilnote_feedback
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchTeilnote_feedbackException if a teilnote_feedback with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback findByPrimaryKey(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchTeilnote_feedbackException {
        return getPersistence().findByPrimaryKey(id);
    }

    /**
    * Returns the teilnote_feedback with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the teilnote_feedback
    * @return the teilnote_feedback, or <code>null</code> if a teilnote_feedback with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(id);
    }

    /**
    * Returns all the teilnote_feedbacks.
    *
    * @return the teilnote_feedbacks
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

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
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the teilnote_feedbacks from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of teilnote_feedbacks.
    *
    * @return the number of teilnote_feedbacks
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static Teilnote_feedbackPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (Teilnote_feedbackPersistence) PortletBeanLocatorUtil.locate(de.hska.wi.awp.datasource.infosys.service.ClpSerializer.getServletContextName(),
                    Teilnote_feedbackPersistence.class.getName());

            ReferenceRegistry.registerReference(Teilnote_feedbackUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(Teilnote_feedbackPersistence persistence) {
    }
}
