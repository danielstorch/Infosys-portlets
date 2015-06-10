package de.hska.wi.awp.datasource.infosys.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import de.hska.wi.awp.datasource.infosys.NoSuchFeedbackException;
import de.hska.wi.awp.datasource.infosys.model.Feedback;
import de.hska.wi.awp.datasource.infosys.model.impl.FeedbackImpl;
import de.hska.wi.awp.datasource.infosys.model.impl.FeedbackModelImpl;
import de.hska.wi.awp.datasource.infosys.service.persistence.FeedbackPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the feedback service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Daniel Storch
 * @see FeedbackPersistence
 * @see FeedbackUtil
 * @generated
 */
public class FeedbackPersistenceImpl extends BasePersistenceImpl<Feedback>
    implements FeedbackPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link FeedbackUtil} to access the feedback persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = FeedbackImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FeedbackModelImpl.ENTITY_CACHE_ENABLED,
            FeedbackModelImpl.FINDER_CACHE_ENABLED, FeedbackImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FeedbackModelImpl.ENTITY_CACHE_ENABLED,
            FeedbackModelImpl.FINDER_CACHE_ENABLED, FeedbackImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FeedbackModelImpl.ENTITY_CACHE_ENABLED,
            FeedbackModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STUDENT_ID =
        new FinderPath(FeedbackModelImpl.ENTITY_CACHE_ENABLED,
            FeedbackModelImpl.FINDER_CACHE_ENABLED, FeedbackImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByStudent_id",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STUDENT_ID =
        new FinderPath(FeedbackModelImpl.ENTITY_CACHE_ENABLED,
            FeedbackModelImpl.FINDER_CACHE_ENABLED, FeedbackImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByStudent_id",
            new String[] { Long.class.getName() },
            FeedbackModelImpl.STUDENT_ID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_STUDENT_ID = new FinderPath(FeedbackModelImpl.ENTITY_CACHE_ENABLED,
            FeedbackModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByStudent_id",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_STUDENT_ID_STUDENT_ID_2 = "feedback.student_id = ?";
    private static final String _SQL_SELECT_FEEDBACK = "SELECT feedback FROM Feedback feedback";
    private static final String _SQL_SELECT_FEEDBACK_WHERE = "SELECT feedback FROM Feedback feedback WHERE ";
    private static final String _SQL_COUNT_FEEDBACK = "SELECT COUNT(feedback) FROM Feedback feedback";
    private static final String _SQL_COUNT_FEEDBACK_WHERE = "SELECT COUNT(feedback) FROM Feedback feedback WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "feedback.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Feedback exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Feedback exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(FeedbackPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "id"
            });
    private static Feedback _nullFeedback = new FeedbackImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Feedback> toCacheModel() {
                return _nullFeedbackCacheModel;
            }
        };

    private static CacheModel<Feedback> _nullFeedbackCacheModel = new CacheModel<Feedback>() {
            @Override
            public Feedback toEntityModel() {
                return _nullFeedback;
            }
        };

    public FeedbackPersistenceImpl() {
        setModelClass(Feedback.class);
    }

    /**
     * Returns all the feedbacks where student_id = &#63;.
     *
     * @param student_id the student_id
     * @return the matching feedbacks
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Feedback> findByStudent_id(long student_id)
        throws SystemException {
        return findByStudent_id(student_id, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<Feedback> findByStudent_id(long student_id, int start, int end)
        throws SystemException {
        return findByStudent_id(student_id, start, end, null);
    }

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
    @Override
    public List<Feedback> findByStudent_id(long student_id, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STUDENT_ID;
            finderArgs = new Object[] { student_id };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_STUDENT_ID;
            finderArgs = new Object[] { student_id, start, end, orderByComparator };
        }

        List<Feedback> list = (List<Feedback>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Feedback feedback : list) {
                if ((student_id != feedback.getStudent_id())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_FEEDBACK_WHERE);

            query.append(_FINDER_COLUMN_STUDENT_ID_STUDENT_ID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(FeedbackModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(student_id);

                if (!pagination) {
                    list = (List<Feedback>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Feedback>(list);
                } else {
                    list = (List<Feedback>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first feedback in the ordered set where student_id = &#63;.
     *
     * @param student_id the student_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching feedback
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchFeedbackException if a matching feedback could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Feedback findByStudent_id_First(long student_id,
        OrderByComparator orderByComparator)
        throws NoSuchFeedbackException, SystemException {
        Feedback feedback = fetchByStudent_id_First(student_id,
                orderByComparator);

        if (feedback != null) {
            return feedback;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("student_id=");
        msg.append(student_id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFeedbackException(msg.toString());
    }

    /**
     * Returns the first feedback in the ordered set where student_id = &#63;.
     *
     * @param student_id the student_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching feedback, or <code>null</code> if a matching feedback could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Feedback fetchByStudent_id_First(long student_id,
        OrderByComparator orderByComparator) throws SystemException {
        List<Feedback> list = findByStudent_id(student_id, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last feedback in the ordered set where student_id = &#63;.
     *
     * @param student_id the student_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching feedback
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchFeedbackException if a matching feedback could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Feedback findByStudent_id_Last(long student_id,
        OrderByComparator orderByComparator)
        throws NoSuchFeedbackException, SystemException {
        Feedback feedback = fetchByStudent_id_Last(student_id, orderByComparator);

        if (feedback != null) {
            return feedback;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("student_id=");
        msg.append(student_id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFeedbackException(msg.toString());
    }

    /**
     * Returns the last feedback in the ordered set where student_id = &#63;.
     *
     * @param student_id the student_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching feedback, or <code>null</code> if a matching feedback could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Feedback fetchByStudent_id_Last(long student_id,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByStudent_id(student_id);

        if (count == 0) {
            return null;
        }

        List<Feedback> list = findByStudent_id(student_id, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public Feedback[] findByStudent_id_PrevAndNext(long id, long student_id,
        OrderByComparator orderByComparator)
        throws NoSuchFeedbackException, SystemException {
        Feedback feedback = findByPrimaryKey(id);

        Session session = null;

        try {
            session = openSession();

            Feedback[] array = new FeedbackImpl[3];

            array[0] = getByStudent_id_PrevAndNext(session, feedback,
                    student_id, orderByComparator, true);

            array[1] = feedback;

            array[2] = getByStudent_id_PrevAndNext(session, feedback,
                    student_id, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Feedback getByStudent_id_PrevAndNext(Session session,
        Feedback feedback, long student_id,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_FEEDBACK_WHERE);

        query.append(_FINDER_COLUMN_STUDENT_ID_STUDENT_ID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(FeedbackModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(student_id);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(feedback);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Feedback> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the feedbacks where student_id = &#63; from the database.
     *
     * @param student_id the student_id
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByStudent_id(long student_id) throws SystemException {
        for (Feedback feedback : findByStudent_id(student_id,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(feedback);
        }
    }

    /**
     * Returns the number of feedbacks where student_id = &#63;.
     *
     * @param student_id the student_id
     * @return the number of matching feedbacks
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByStudent_id(long student_id) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_STUDENT_ID;

        Object[] finderArgs = new Object[] { student_id };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_FEEDBACK_WHERE);

            query.append(_FINDER_COLUMN_STUDENT_ID_STUDENT_ID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(student_id);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the feedback in the entity cache if it is enabled.
     *
     * @param feedback the feedback
     */
    @Override
    public void cacheResult(Feedback feedback) {
        EntityCacheUtil.putResult(FeedbackModelImpl.ENTITY_CACHE_ENABLED,
            FeedbackImpl.class, feedback.getPrimaryKey(), feedback);

        feedback.resetOriginalValues();
    }

    /**
     * Caches the feedbacks in the entity cache if it is enabled.
     *
     * @param feedbacks the feedbacks
     */
    @Override
    public void cacheResult(List<Feedback> feedbacks) {
        for (Feedback feedback : feedbacks) {
            if (EntityCacheUtil.getResult(
                        FeedbackModelImpl.ENTITY_CACHE_ENABLED,
                        FeedbackImpl.class, feedback.getPrimaryKey()) == null) {
                cacheResult(feedback);
            } else {
                feedback.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all feedbacks.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(FeedbackImpl.class.getName());
        }

        EntityCacheUtil.clearCache(FeedbackImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the feedback.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Feedback feedback) {
        EntityCacheUtil.removeResult(FeedbackModelImpl.ENTITY_CACHE_ENABLED,
            FeedbackImpl.class, feedback.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Feedback> feedbacks) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Feedback feedback : feedbacks) {
            EntityCacheUtil.removeResult(FeedbackModelImpl.ENTITY_CACHE_ENABLED,
                FeedbackImpl.class, feedback.getPrimaryKey());
        }
    }

    /**
     * Creates a new feedback with the primary key. Does not add the feedback to the database.
     *
     * @param id the primary key for the new feedback
     * @return the new feedback
     */
    @Override
    public Feedback create(long id) {
        Feedback feedback = new FeedbackImpl();

        feedback.setNew(true);
        feedback.setPrimaryKey(id);

        return feedback;
    }

    /**
     * Removes the feedback with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the feedback
     * @return the feedback that was removed
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchFeedbackException if a feedback with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Feedback remove(long id)
        throws NoSuchFeedbackException, SystemException {
        return remove((Serializable) id);
    }

    /**
     * Removes the feedback with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the feedback
     * @return the feedback that was removed
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchFeedbackException if a feedback with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Feedback remove(Serializable primaryKey)
        throws NoSuchFeedbackException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Feedback feedback = (Feedback) session.get(FeedbackImpl.class,
                    primaryKey);

            if (feedback == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchFeedbackException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(feedback);
        } catch (NoSuchFeedbackException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Feedback removeImpl(Feedback feedback) throws SystemException {
        feedback = toUnwrappedModel(feedback);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(feedback)) {
                feedback = (Feedback) session.get(FeedbackImpl.class,
                        feedback.getPrimaryKeyObj());
            }

            if (feedback != null) {
                session.delete(feedback);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (feedback != null) {
            clearCache(feedback);
        }

        return feedback;
    }

    @Override
    public Feedback updateImpl(
        de.hska.wi.awp.datasource.infosys.model.Feedback feedback)
        throws SystemException {
        feedback = toUnwrappedModel(feedback);

        boolean isNew = feedback.isNew();

        FeedbackModelImpl feedbackModelImpl = (FeedbackModelImpl) feedback;

        Session session = null;

        try {
            session = openSession();

            if (feedback.isNew()) {
                session.save(feedback);

                feedback.setNew(false);
            } else {
                session.merge(feedback);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !FeedbackModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((feedbackModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STUDENT_ID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        feedbackModelImpl.getOriginalStudent_id()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STUDENT_ID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STUDENT_ID,
                    args);

                args = new Object[] { feedbackModelImpl.getStudent_id() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STUDENT_ID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STUDENT_ID,
                    args);
            }
        }

        EntityCacheUtil.putResult(FeedbackModelImpl.ENTITY_CACHE_ENABLED,
            FeedbackImpl.class, feedback.getPrimaryKey(), feedback);

        return feedback;
    }

    protected Feedback toUnwrappedModel(Feedback feedback) {
        if (feedback instanceof FeedbackImpl) {
            return feedback;
        }

        FeedbackImpl feedbackImpl = new FeedbackImpl();

        feedbackImpl.setNew(feedback.isNew());
        feedbackImpl.setPrimaryKey(feedback.getPrimaryKey());

        feedbackImpl.setId(feedback.getId());
        feedbackImpl.setStudent_id(feedback.getStudent_id());
        feedbackImpl.setFeedback_runden_nr(feedback.getFeedback_runden_nr());
        feedbackImpl.setEigenbewertung(feedback.getEigenbewertung());
        feedbackImpl.setKommentar_kompetenzen(feedback.getKommentar_kompetenzen());
        feedbackImpl.setKommentar_beitrag(feedback.getKommentar_beitrag());
        feedbackImpl.setBeitrag(feedback.getBeitrag());

        return feedbackImpl;
    }

    /**
     * Returns the feedback with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the feedback
     * @return the feedback
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchFeedbackException if a feedback with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Feedback findByPrimaryKey(Serializable primaryKey)
        throws NoSuchFeedbackException, SystemException {
        Feedback feedback = fetchByPrimaryKey(primaryKey);

        if (feedback == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchFeedbackException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return feedback;
    }

    /**
     * Returns the feedback with the primary key or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchFeedbackException} if it could not be found.
     *
     * @param id the primary key of the feedback
     * @return the feedback
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchFeedbackException if a feedback with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Feedback findByPrimaryKey(long id)
        throws NoSuchFeedbackException, SystemException {
        return findByPrimaryKey((Serializable) id);
    }

    /**
     * Returns the feedback with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the feedback
     * @return the feedback, or <code>null</code> if a feedback with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Feedback fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Feedback feedback = (Feedback) EntityCacheUtil.getResult(FeedbackModelImpl.ENTITY_CACHE_ENABLED,
                FeedbackImpl.class, primaryKey);

        if (feedback == _nullFeedback) {
            return null;
        }

        if (feedback == null) {
            Session session = null;

            try {
                session = openSession();

                feedback = (Feedback) session.get(FeedbackImpl.class, primaryKey);

                if (feedback != null) {
                    cacheResult(feedback);
                } else {
                    EntityCacheUtil.putResult(FeedbackModelImpl.ENTITY_CACHE_ENABLED,
                        FeedbackImpl.class, primaryKey, _nullFeedback);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(FeedbackModelImpl.ENTITY_CACHE_ENABLED,
                    FeedbackImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return feedback;
    }

    /**
     * Returns the feedback with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the feedback
     * @return the feedback, or <code>null</code> if a feedback with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Feedback fetchByPrimaryKey(long id) throws SystemException {
        return fetchByPrimaryKey((Serializable) id);
    }

    /**
     * Returns all the feedbacks.
     *
     * @return the feedbacks
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Feedback> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Feedback> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<Feedback> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<Feedback> list = (List<Feedback>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_FEEDBACK);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_FEEDBACK;

                if (pagination) {
                    sql = sql.concat(FeedbackModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Feedback>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Feedback>(list);
                } else {
                    list = (List<Feedback>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the feedbacks from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Feedback feedback : findAll()) {
            remove(feedback);
        }
    }

    /**
     * Returns the number of feedbacks.
     *
     * @return the number of feedbacks
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_FEEDBACK);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    @Override
    protected Set<String> getBadColumnNames() {
        return _badColumnNames;
    }

    /**
     * Initializes the feedback persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.de.hska.wi.awp.datasource.infosys.model.Feedback")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Feedback>> listenersList = new ArrayList<ModelListener<Feedback>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Feedback>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(FeedbackImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
