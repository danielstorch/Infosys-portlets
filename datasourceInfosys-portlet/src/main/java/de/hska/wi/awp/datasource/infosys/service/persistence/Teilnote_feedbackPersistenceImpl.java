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

import de.hska.wi.awp.datasource.infosys.NoSuchTeilnote_feedbackException;
import de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback;
import de.hska.wi.awp.datasource.infosys.model.impl.Teilnote_feedbackImpl;
import de.hska.wi.awp.datasource.infosys.model.impl.Teilnote_feedbackModelImpl;
import de.hska.wi.awp.datasource.infosys.service.persistence.Teilnote_feedbackPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the teilnote_feedback service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Daniel Storch
 * @see Teilnote_feedbackPersistence
 * @see Teilnote_feedbackUtil
 * @generated
 */
public class Teilnote_feedbackPersistenceImpl extends BasePersistenceImpl<Teilnote_feedback>
    implements Teilnote_feedbackPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link Teilnote_feedbackUtil} to access the teilnote_feedback persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = Teilnote_feedbackImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Teilnote_feedbackModelImpl.ENTITY_CACHE_ENABLED,
            Teilnote_feedbackModelImpl.FINDER_CACHE_ENABLED,
            Teilnote_feedbackImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Teilnote_feedbackModelImpl.ENTITY_CACHE_ENABLED,
            Teilnote_feedbackModelImpl.FINDER_CACHE_ENABLED,
            Teilnote_feedbackImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Teilnote_feedbackModelImpl.ENTITY_CACHE_ENABLED,
            Teilnote_feedbackModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FEEDBACK_ID =
        new FinderPath(Teilnote_feedbackModelImpl.ENTITY_CACHE_ENABLED,
            Teilnote_feedbackModelImpl.FINDER_CACHE_ENABLED,
            Teilnote_feedbackImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByFeedback_id",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FEEDBACK_ID =
        new FinderPath(Teilnote_feedbackModelImpl.ENTITY_CACHE_ENABLED,
            Teilnote_feedbackModelImpl.FINDER_CACHE_ENABLED,
            Teilnote_feedbackImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByFeedback_id",
            new String[] { Long.class.getName() },
            Teilnote_feedbackModelImpl.FEEDBACK_ID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_FEEDBACK_ID = new FinderPath(Teilnote_feedbackModelImpl.ENTITY_CACHE_ENABLED,
            Teilnote_feedbackModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByFeedback_id",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_FEEDBACK_ID_FEEDBACK_ID_2 = "teilnote_feedback.feedback_id = ?";
    private static final String _SQL_SELECT_TEILNOTE_FEEDBACK = "SELECT teilnote_feedback FROM Teilnote_feedback teilnote_feedback";
    private static final String _SQL_SELECT_TEILNOTE_FEEDBACK_WHERE = "SELECT teilnote_feedback FROM Teilnote_feedback teilnote_feedback WHERE ";
    private static final String _SQL_COUNT_TEILNOTE_FEEDBACK = "SELECT COUNT(teilnote_feedback) FROM Teilnote_feedback teilnote_feedback";
    private static final String _SQL_COUNT_TEILNOTE_FEEDBACK_WHERE = "SELECT COUNT(teilnote_feedback) FROM Teilnote_feedback teilnote_feedback WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "teilnote_feedback.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Teilnote_feedback exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Teilnote_feedback exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(Teilnote_feedbackPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "id"
            });
    private static Teilnote_feedback _nullTeilnote_feedback = new Teilnote_feedbackImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Teilnote_feedback> toCacheModel() {
                return _nullTeilnote_feedbackCacheModel;
            }
        };

    private static CacheModel<Teilnote_feedback> _nullTeilnote_feedbackCacheModel =
        new CacheModel<Teilnote_feedback>() {
            @Override
            public Teilnote_feedback toEntityModel() {
                return _nullTeilnote_feedback;
            }
        };

    public Teilnote_feedbackPersistenceImpl() {
        setModelClass(Teilnote_feedback.class);
    }

    /**
     * Returns all the teilnote_feedbacks where feedback_id = &#63;.
     *
     * @param feedback_id the feedback_id
     * @return the matching teilnote_feedbacks
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Teilnote_feedback> findByFeedback_id(long feedback_id)
        throws SystemException {
        return findByFeedback_id(feedback_id, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    @Override
    public List<Teilnote_feedback> findByFeedback_id(long feedback_id,
        int start, int end) throws SystemException {
        return findByFeedback_id(feedback_id, start, end, null);
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
    @Override
    public List<Teilnote_feedback> findByFeedback_id(long feedback_id,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FEEDBACK_ID;
            finderArgs = new Object[] { feedback_id };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FEEDBACK_ID;
            finderArgs = new Object[] { feedback_id, start, end, orderByComparator };
        }

        List<Teilnote_feedback> list = (List<Teilnote_feedback>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Teilnote_feedback teilnote_feedback : list) {
                if ((feedback_id != teilnote_feedback.getFeedback_id())) {
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

            query.append(_SQL_SELECT_TEILNOTE_FEEDBACK_WHERE);

            query.append(_FINDER_COLUMN_FEEDBACK_ID_FEEDBACK_ID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(Teilnote_feedbackModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(feedback_id);

                if (!pagination) {
                    list = (List<Teilnote_feedback>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Teilnote_feedback>(list);
                } else {
                    list = (List<Teilnote_feedback>) QueryUtil.list(q,
                            getDialect(), start, end);
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
     * Returns the first teilnote_feedback in the ordered set where feedback_id = &#63;.
     *
     * @param feedback_id the feedback_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching teilnote_feedback
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchTeilnote_feedbackException if a matching teilnote_feedback could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Teilnote_feedback findByFeedback_id_First(long feedback_id,
        OrderByComparator orderByComparator)
        throws NoSuchTeilnote_feedbackException, SystemException {
        Teilnote_feedback teilnote_feedback = fetchByFeedback_id_First(feedback_id,
                orderByComparator);

        if (teilnote_feedback != null) {
            return teilnote_feedback;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("feedback_id=");
        msg.append(feedback_id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchTeilnote_feedbackException(msg.toString());
    }

    /**
     * Returns the first teilnote_feedback in the ordered set where feedback_id = &#63;.
     *
     * @param feedback_id the feedback_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching teilnote_feedback, or <code>null</code> if a matching teilnote_feedback could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Teilnote_feedback fetchByFeedback_id_First(long feedback_id,
        OrderByComparator orderByComparator) throws SystemException {
        List<Teilnote_feedback> list = findByFeedback_id(feedback_id, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Teilnote_feedback findByFeedback_id_Last(long feedback_id,
        OrderByComparator orderByComparator)
        throws NoSuchTeilnote_feedbackException, SystemException {
        Teilnote_feedback teilnote_feedback = fetchByFeedback_id_Last(feedback_id,
                orderByComparator);

        if (teilnote_feedback != null) {
            return teilnote_feedback;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("feedback_id=");
        msg.append(feedback_id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchTeilnote_feedbackException(msg.toString());
    }

    /**
     * Returns the last teilnote_feedback in the ordered set where feedback_id = &#63;.
     *
     * @param feedback_id the feedback_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching teilnote_feedback, or <code>null</code> if a matching teilnote_feedback could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Teilnote_feedback fetchByFeedback_id_Last(long feedback_id,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByFeedback_id(feedback_id);

        if (count == 0) {
            return null;
        }

        List<Teilnote_feedback> list = findByFeedback_id(feedback_id,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Teilnote_feedback[] findByFeedback_id_PrevAndNext(long id,
        long feedback_id, OrderByComparator orderByComparator)
        throws NoSuchTeilnote_feedbackException, SystemException {
        Teilnote_feedback teilnote_feedback = findByPrimaryKey(id);

        Session session = null;

        try {
            session = openSession();

            Teilnote_feedback[] array = new Teilnote_feedbackImpl[3];

            array[0] = getByFeedback_id_PrevAndNext(session, teilnote_feedback,
                    feedback_id, orderByComparator, true);

            array[1] = teilnote_feedback;

            array[2] = getByFeedback_id_PrevAndNext(session, teilnote_feedback,
                    feedback_id, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Teilnote_feedback getByFeedback_id_PrevAndNext(Session session,
        Teilnote_feedback teilnote_feedback, long feedback_id,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_TEILNOTE_FEEDBACK_WHERE);

        query.append(_FINDER_COLUMN_FEEDBACK_ID_FEEDBACK_ID_2);

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
            query.append(Teilnote_feedbackModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(feedback_id);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(teilnote_feedback);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Teilnote_feedback> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the teilnote_feedbacks where feedback_id = &#63; from the database.
     *
     * @param feedback_id the feedback_id
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByFeedback_id(long feedback_id) throws SystemException {
        for (Teilnote_feedback teilnote_feedback : findByFeedback_id(
                feedback_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(teilnote_feedback);
        }
    }

    /**
     * Returns the number of teilnote_feedbacks where feedback_id = &#63;.
     *
     * @param feedback_id the feedback_id
     * @return the number of matching teilnote_feedbacks
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByFeedback_id(long feedback_id) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_FEEDBACK_ID;

        Object[] finderArgs = new Object[] { feedback_id };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_TEILNOTE_FEEDBACK_WHERE);

            query.append(_FINDER_COLUMN_FEEDBACK_ID_FEEDBACK_ID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(feedback_id);

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
     * Caches the teilnote_feedback in the entity cache if it is enabled.
     *
     * @param teilnote_feedback the teilnote_feedback
     */
    @Override
    public void cacheResult(Teilnote_feedback teilnote_feedback) {
        EntityCacheUtil.putResult(Teilnote_feedbackModelImpl.ENTITY_CACHE_ENABLED,
            Teilnote_feedbackImpl.class, teilnote_feedback.getPrimaryKey(),
            teilnote_feedback);

        teilnote_feedback.resetOriginalValues();
    }

    /**
     * Caches the teilnote_feedbacks in the entity cache if it is enabled.
     *
     * @param teilnote_feedbacks the teilnote_feedbacks
     */
    @Override
    public void cacheResult(List<Teilnote_feedback> teilnote_feedbacks) {
        for (Teilnote_feedback teilnote_feedback : teilnote_feedbacks) {
            if (EntityCacheUtil.getResult(
                        Teilnote_feedbackModelImpl.ENTITY_CACHE_ENABLED,
                        Teilnote_feedbackImpl.class,
                        teilnote_feedback.getPrimaryKey()) == null) {
                cacheResult(teilnote_feedback);
            } else {
                teilnote_feedback.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all teilnote_feedbacks.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(Teilnote_feedbackImpl.class.getName());
        }

        EntityCacheUtil.clearCache(Teilnote_feedbackImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the teilnote_feedback.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Teilnote_feedback teilnote_feedback) {
        EntityCacheUtil.removeResult(Teilnote_feedbackModelImpl.ENTITY_CACHE_ENABLED,
            Teilnote_feedbackImpl.class, teilnote_feedback.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Teilnote_feedback> teilnote_feedbacks) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Teilnote_feedback teilnote_feedback : teilnote_feedbacks) {
            EntityCacheUtil.removeResult(Teilnote_feedbackModelImpl.ENTITY_CACHE_ENABLED,
                Teilnote_feedbackImpl.class, teilnote_feedback.getPrimaryKey());
        }
    }

    /**
     * Creates a new teilnote_feedback with the primary key. Does not add the teilnote_feedback to the database.
     *
     * @param id the primary key for the new teilnote_feedback
     * @return the new teilnote_feedback
     */
    @Override
    public Teilnote_feedback create(long id) {
        Teilnote_feedback teilnote_feedback = new Teilnote_feedbackImpl();

        teilnote_feedback.setNew(true);
        teilnote_feedback.setPrimaryKey(id);

        return teilnote_feedback;
    }

    /**
     * Removes the teilnote_feedback with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the teilnote_feedback
     * @return the teilnote_feedback that was removed
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchTeilnote_feedbackException if a teilnote_feedback with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Teilnote_feedback remove(long id)
        throws NoSuchTeilnote_feedbackException, SystemException {
        return remove((Serializable) id);
    }

    /**
     * Removes the teilnote_feedback with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the teilnote_feedback
     * @return the teilnote_feedback that was removed
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchTeilnote_feedbackException if a teilnote_feedback with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Teilnote_feedback remove(Serializable primaryKey)
        throws NoSuchTeilnote_feedbackException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Teilnote_feedback teilnote_feedback = (Teilnote_feedback) session.get(Teilnote_feedbackImpl.class,
                    primaryKey);

            if (teilnote_feedback == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchTeilnote_feedbackException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(teilnote_feedback);
        } catch (NoSuchTeilnote_feedbackException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Teilnote_feedback removeImpl(Teilnote_feedback teilnote_feedback)
        throws SystemException {
        teilnote_feedback = toUnwrappedModel(teilnote_feedback);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(teilnote_feedback)) {
                teilnote_feedback = (Teilnote_feedback) session.get(Teilnote_feedbackImpl.class,
                        teilnote_feedback.getPrimaryKeyObj());
            }

            if (teilnote_feedback != null) {
                session.delete(teilnote_feedback);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (teilnote_feedback != null) {
            clearCache(teilnote_feedback);
        }

        return teilnote_feedback;
    }

    @Override
    public Teilnote_feedback updateImpl(
        de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback teilnote_feedback)
        throws SystemException {
        teilnote_feedback = toUnwrappedModel(teilnote_feedback);

        boolean isNew = teilnote_feedback.isNew();

        Teilnote_feedbackModelImpl teilnote_feedbackModelImpl = (Teilnote_feedbackModelImpl) teilnote_feedback;

        Session session = null;

        try {
            session = openSession();

            if (teilnote_feedback.isNew()) {
                session.save(teilnote_feedback);

                teilnote_feedback.setNew(false);
            } else {
                session.merge(teilnote_feedback);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !Teilnote_feedbackModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((teilnote_feedbackModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FEEDBACK_ID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        teilnote_feedbackModelImpl.getOriginalFeedback_id()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FEEDBACK_ID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FEEDBACK_ID,
                    args);

                args = new Object[] { teilnote_feedbackModelImpl.getFeedback_id() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FEEDBACK_ID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FEEDBACK_ID,
                    args);
            }
        }

        EntityCacheUtil.putResult(Teilnote_feedbackModelImpl.ENTITY_CACHE_ENABLED,
            Teilnote_feedbackImpl.class, teilnote_feedback.getPrimaryKey(),
            teilnote_feedback);

        return teilnote_feedback;
    }

    protected Teilnote_feedback toUnwrappedModel(
        Teilnote_feedback teilnote_feedback) {
        if (teilnote_feedback instanceof Teilnote_feedbackImpl) {
            return teilnote_feedback;
        }

        Teilnote_feedbackImpl teilnote_feedbackImpl = new Teilnote_feedbackImpl();

        teilnote_feedbackImpl.setNew(teilnote_feedback.isNew());
        teilnote_feedbackImpl.setPrimaryKey(teilnote_feedback.getPrimaryKey());

        teilnote_feedbackImpl.setId(teilnote_feedback.getId());
        teilnote_feedbackImpl.setFeedback_id(teilnote_feedback.getFeedback_id());
        teilnote_feedbackImpl.setNote(teilnote_feedback.getNote());
        teilnote_feedbackImpl.setBewertungskriterium_id(teilnote_feedback.getBewertungskriterium_id());

        return teilnote_feedbackImpl;
    }

    /**
     * Returns the teilnote_feedback with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the teilnote_feedback
     * @return the teilnote_feedback
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchTeilnote_feedbackException if a teilnote_feedback with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Teilnote_feedback findByPrimaryKey(Serializable primaryKey)
        throws NoSuchTeilnote_feedbackException, SystemException {
        Teilnote_feedback teilnote_feedback = fetchByPrimaryKey(primaryKey);

        if (teilnote_feedback == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchTeilnote_feedbackException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return teilnote_feedback;
    }

    /**
     * Returns the teilnote_feedback with the primary key or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchTeilnote_feedbackException} if it could not be found.
     *
     * @param id the primary key of the teilnote_feedback
     * @return the teilnote_feedback
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchTeilnote_feedbackException if a teilnote_feedback with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Teilnote_feedback findByPrimaryKey(long id)
        throws NoSuchTeilnote_feedbackException, SystemException {
        return findByPrimaryKey((Serializable) id);
    }

    /**
     * Returns the teilnote_feedback with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the teilnote_feedback
     * @return the teilnote_feedback, or <code>null</code> if a teilnote_feedback with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Teilnote_feedback fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Teilnote_feedback teilnote_feedback = (Teilnote_feedback) EntityCacheUtil.getResult(Teilnote_feedbackModelImpl.ENTITY_CACHE_ENABLED,
                Teilnote_feedbackImpl.class, primaryKey);

        if (teilnote_feedback == _nullTeilnote_feedback) {
            return null;
        }

        if (teilnote_feedback == null) {
            Session session = null;

            try {
                session = openSession();

                teilnote_feedback = (Teilnote_feedback) session.get(Teilnote_feedbackImpl.class,
                        primaryKey);

                if (teilnote_feedback != null) {
                    cacheResult(teilnote_feedback);
                } else {
                    EntityCacheUtil.putResult(Teilnote_feedbackModelImpl.ENTITY_CACHE_ENABLED,
                        Teilnote_feedbackImpl.class, primaryKey,
                        _nullTeilnote_feedback);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(Teilnote_feedbackModelImpl.ENTITY_CACHE_ENABLED,
                    Teilnote_feedbackImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return teilnote_feedback;
    }

    /**
     * Returns the teilnote_feedback with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the teilnote_feedback
     * @return the teilnote_feedback, or <code>null</code> if a teilnote_feedback with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Teilnote_feedback fetchByPrimaryKey(long id)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) id);
    }

    /**
     * Returns all the teilnote_feedbacks.
     *
     * @return the teilnote_feedbacks
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Teilnote_feedback> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Teilnote_feedback> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<Teilnote_feedback> findAll(int start, int end,
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

        List<Teilnote_feedback> list = (List<Teilnote_feedback>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_TEILNOTE_FEEDBACK);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_TEILNOTE_FEEDBACK;

                if (pagination) {
                    sql = sql.concat(Teilnote_feedbackModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Teilnote_feedback>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Teilnote_feedback>(list);
                } else {
                    list = (List<Teilnote_feedback>) QueryUtil.list(q,
                            getDialect(), start, end);
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
     * Removes all the teilnote_feedbacks from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Teilnote_feedback teilnote_feedback : findAll()) {
            remove(teilnote_feedback);
        }
    }

    /**
     * Returns the number of teilnote_feedbacks.
     *
     * @return the number of teilnote_feedbacks
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

                Query q = session.createQuery(_SQL_COUNT_TEILNOTE_FEEDBACK);

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
     * Initializes the teilnote_feedback persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Teilnote_feedback>> listenersList = new ArrayList<ModelListener<Teilnote_feedback>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Teilnote_feedback>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(Teilnote_feedbackImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
