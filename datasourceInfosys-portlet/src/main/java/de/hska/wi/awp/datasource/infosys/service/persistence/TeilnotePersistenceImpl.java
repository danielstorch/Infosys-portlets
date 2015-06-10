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

import de.hska.wi.awp.datasource.infosys.NoSuchTeilnoteException;
import de.hska.wi.awp.datasource.infosys.model.Teilnote;
import de.hska.wi.awp.datasource.infosys.model.impl.TeilnoteImpl;
import de.hska.wi.awp.datasource.infosys.model.impl.TeilnoteModelImpl;
import de.hska.wi.awp.datasource.infosys.service.persistence.TeilnotePersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the teilnote service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Daniel Storch
 * @see TeilnotePersistence
 * @see TeilnoteUtil
 * @generated
 */
public class TeilnotePersistenceImpl extends BasePersistenceImpl<Teilnote>
    implements TeilnotePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link TeilnoteUtil} to access the teilnote persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = TeilnoteImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TeilnoteModelImpl.ENTITY_CACHE_ENABLED,
            TeilnoteModelImpl.FINDER_CACHE_ENABLED, TeilnoteImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TeilnoteModelImpl.ENTITY_CACHE_ENABLED,
            TeilnoteModelImpl.FINDER_CACHE_ENABLED, TeilnoteImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TeilnoteModelImpl.ENTITY_CACHE_ENABLED,
            TeilnoteModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FEEDBACK_ID =
        new FinderPath(TeilnoteModelImpl.ENTITY_CACHE_ENABLED,
            TeilnoteModelImpl.FINDER_CACHE_ENABLED, TeilnoteImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByFeedback_id",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FEEDBACK_ID =
        new FinderPath(TeilnoteModelImpl.ENTITY_CACHE_ENABLED,
            TeilnoteModelImpl.FINDER_CACHE_ENABLED, TeilnoteImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByFeedback_id",
            new String[] { Long.class.getName() },
            TeilnoteModelImpl.FEEDBACK_ID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_FEEDBACK_ID = new FinderPath(TeilnoteModelImpl.ENTITY_CACHE_ENABLED,
            TeilnoteModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByFeedback_id",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_FEEDBACK_ID_FEEDBACK_ID_2 = "teilnote.feedback_id = ?";
    private static final String _SQL_SELECT_TEILNOTE = "SELECT teilnote FROM Teilnote teilnote";
    private static final String _SQL_SELECT_TEILNOTE_WHERE = "SELECT teilnote FROM Teilnote teilnote WHERE ";
    private static final String _SQL_COUNT_TEILNOTE = "SELECT COUNT(teilnote) FROM Teilnote teilnote";
    private static final String _SQL_COUNT_TEILNOTE_WHERE = "SELECT COUNT(teilnote) FROM Teilnote teilnote WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "teilnote.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Teilnote exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Teilnote exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(TeilnotePersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "id"
            });
    private static Teilnote _nullTeilnote = new TeilnoteImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Teilnote> toCacheModel() {
                return _nullTeilnoteCacheModel;
            }
        };

    private static CacheModel<Teilnote> _nullTeilnoteCacheModel = new CacheModel<Teilnote>() {
            @Override
            public Teilnote toEntityModel() {
                return _nullTeilnote;
            }
        };

    public TeilnotePersistenceImpl() {
        setModelClass(Teilnote.class);
    }

    /**
     * Returns all the teilnotes where feedback_id = &#63;.
     *
     * @param feedback_id the feedback_id
     * @return the matching teilnotes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Teilnote> findByFeedback_id(long feedback_id)
        throws SystemException {
        return findByFeedback_id(feedback_id, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<Teilnote> findByFeedback_id(long feedback_id, int start, int end)
        throws SystemException {
        return findByFeedback_id(feedback_id, start, end, null);
    }

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
    @Override
    public List<Teilnote> findByFeedback_id(long feedback_id, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
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

        List<Teilnote> list = (List<Teilnote>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Teilnote teilnote : list) {
                if ((feedback_id != teilnote.getFeedback_id())) {
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

            query.append(_SQL_SELECT_TEILNOTE_WHERE);

            query.append(_FINDER_COLUMN_FEEDBACK_ID_FEEDBACK_ID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(TeilnoteModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(feedback_id);

                if (!pagination) {
                    list = (List<Teilnote>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Teilnote>(list);
                } else {
                    list = (List<Teilnote>) QueryUtil.list(q, getDialect(),
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
     * Returns the first teilnote in the ordered set where feedback_id = &#63;.
     *
     * @param feedback_id the feedback_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching teilnote
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchTeilnoteException if a matching teilnote could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Teilnote findByFeedback_id_First(long feedback_id,
        OrderByComparator orderByComparator)
        throws NoSuchTeilnoteException, SystemException {
        Teilnote teilnote = fetchByFeedback_id_First(feedback_id,
                orderByComparator);

        if (teilnote != null) {
            return teilnote;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("feedback_id=");
        msg.append(feedback_id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchTeilnoteException(msg.toString());
    }

    /**
     * Returns the first teilnote in the ordered set where feedback_id = &#63;.
     *
     * @param feedback_id the feedback_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching teilnote, or <code>null</code> if a matching teilnote could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Teilnote fetchByFeedback_id_First(long feedback_id,
        OrderByComparator orderByComparator) throws SystemException {
        List<Teilnote> list = findByFeedback_id(feedback_id, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last teilnote in the ordered set where feedback_id = &#63;.
     *
     * @param feedback_id the feedback_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching teilnote
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchTeilnoteException if a matching teilnote could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Teilnote findByFeedback_id_Last(long feedback_id,
        OrderByComparator orderByComparator)
        throws NoSuchTeilnoteException, SystemException {
        Teilnote teilnote = fetchByFeedback_id_Last(feedback_id,
                orderByComparator);

        if (teilnote != null) {
            return teilnote;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("feedback_id=");
        msg.append(feedback_id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchTeilnoteException(msg.toString());
    }

    /**
     * Returns the last teilnote in the ordered set where feedback_id = &#63;.
     *
     * @param feedback_id the feedback_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching teilnote, or <code>null</code> if a matching teilnote could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Teilnote fetchByFeedback_id_Last(long feedback_id,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByFeedback_id(feedback_id);

        if (count == 0) {
            return null;
        }

        List<Teilnote> list = findByFeedback_id(feedback_id, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public Teilnote[] findByFeedback_id_PrevAndNext(long id, long feedback_id,
        OrderByComparator orderByComparator)
        throws NoSuchTeilnoteException, SystemException {
        Teilnote teilnote = findByPrimaryKey(id);

        Session session = null;

        try {
            session = openSession();

            Teilnote[] array = new TeilnoteImpl[3];

            array[0] = getByFeedback_id_PrevAndNext(session, teilnote,
                    feedback_id, orderByComparator, true);

            array[1] = teilnote;

            array[2] = getByFeedback_id_PrevAndNext(session, teilnote,
                    feedback_id, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Teilnote getByFeedback_id_PrevAndNext(Session session,
        Teilnote teilnote, long feedback_id,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_TEILNOTE_WHERE);

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
            query.append(TeilnoteModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(feedback_id);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(teilnote);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Teilnote> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the teilnotes where feedback_id = &#63; from the database.
     *
     * @param feedback_id the feedback_id
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByFeedback_id(long feedback_id) throws SystemException {
        for (Teilnote teilnote : findByFeedback_id(feedback_id,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(teilnote);
        }
    }

    /**
     * Returns the number of teilnotes where feedback_id = &#63;.
     *
     * @param feedback_id the feedback_id
     * @return the number of matching teilnotes
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

            query.append(_SQL_COUNT_TEILNOTE_WHERE);

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
     * Caches the teilnote in the entity cache if it is enabled.
     *
     * @param teilnote the teilnote
     */
    @Override
    public void cacheResult(Teilnote teilnote) {
        EntityCacheUtil.putResult(TeilnoteModelImpl.ENTITY_CACHE_ENABLED,
            TeilnoteImpl.class, teilnote.getPrimaryKey(), teilnote);

        teilnote.resetOriginalValues();
    }

    /**
     * Caches the teilnotes in the entity cache if it is enabled.
     *
     * @param teilnotes the teilnotes
     */
    @Override
    public void cacheResult(List<Teilnote> teilnotes) {
        for (Teilnote teilnote : teilnotes) {
            if (EntityCacheUtil.getResult(
                        TeilnoteModelImpl.ENTITY_CACHE_ENABLED,
                        TeilnoteImpl.class, teilnote.getPrimaryKey()) == null) {
                cacheResult(teilnote);
            } else {
                teilnote.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all teilnotes.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(TeilnoteImpl.class.getName());
        }

        EntityCacheUtil.clearCache(TeilnoteImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the teilnote.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Teilnote teilnote) {
        EntityCacheUtil.removeResult(TeilnoteModelImpl.ENTITY_CACHE_ENABLED,
            TeilnoteImpl.class, teilnote.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Teilnote> teilnotes) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Teilnote teilnote : teilnotes) {
            EntityCacheUtil.removeResult(TeilnoteModelImpl.ENTITY_CACHE_ENABLED,
                TeilnoteImpl.class, teilnote.getPrimaryKey());
        }
    }

    /**
     * Creates a new teilnote with the primary key. Does not add the teilnote to the database.
     *
     * @param id the primary key for the new teilnote
     * @return the new teilnote
     */
    @Override
    public Teilnote create(long id) {
        Teilnote teilnote = new TeilnoteImpl();

        teilnote.setNew(true);
        teilnote.setPrimaryKey(id);

        return teilnote;
    }

    /**
     * Removes the teilnote with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the teilnote
     * @return the teilnote that was removed
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchTeilnoteException if a teilnote with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Teilnote remove(long id)
        throws NoSuchTeilnoteException, SystemException {
        return remove((Serializable) id);
    }

    /**
     * Removes the teilnote with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the teilnote
     * @return the teilnote that was removed
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchTeilnoteException if a teilnote with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Teilnote remove(Serializable primaryKey)
        throws NoSuchTeilnoteException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Teilnote teilnote = (Teilnote) session.get(TeilnoteImpl.class,
                    primaryKey);

            if (teilnote == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchTeilnoteException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(teilnote);
        } catch (NoSuchTeilnoteException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Teilnote removeImpl(Teilnote teilnote) throws SystemException {
        teilnote = toUnwrappedModel(teilnote);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(teilnote)) {
                teilnote = (Teilnote) session.get(TeilnoteImpl.class,
                        teilnote.getPrimaryKeyObj());
            }

            if (teilnote != null) {
                session.delete(teilnote);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (teilnote != null) {
            clearCache(teilnote);
        }

        return teilnote;
    }

    @Override
    public Teilnote updateImpl(
        de.hska.wi.awp.datasource.infosys.model.Teilnote teilnote)
        throws SystemException {
        teilnote = toUnwrappedModel(teilnote);

        boolean isNew = teilnote.isNew();

        TeilnoteModelImpl teilnoteModelImpl = (TeilnoteModelImpl) teilnote;

        Session session = null;

        try {
            session = openSession();

            if (teilnote.isNew()) {
                session.save(teilnote);

                teilnote.setNew(false);
            } else {
                session.merge(teilnote);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !TeilnoteModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((teilnoteModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FEEDBACK_ID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        teilnoteModelImpl.getOriginalFeedback_id()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FEEDBACK_ID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FEEDBACK_ID,
                    args);

                args = new Object[] { teilnoteModelImpl.getFeedback_id() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FEEDBACK_ID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FEEDBACK_ID,
                    args);
            }
        }

        EntityCacheUtil.putResult(TeilnoteModelImpl.ENTITY_CACHE_ENABLED,
            TeilnoteImpl.class, teilnote.getPrimaryKey(), teilnote);

        return teilnote;
    }

    protected Teilnote toUnwrappedModel(Teilnote teilnote) {
        if (teilnote instanceof TeilnoteImpl) {
            return teilnote;
        }

        TeilnoteImpl teilnoteImpl = new TeilnoteImpl();

        teilnoteImpl.setNew(teilnote.isNew());
        teilnoteImpl.setPrimaryKey(teilnote.getPrimaryKey());

        teilnoteImpl.setId(teilnote.getId());
        teilnoteImpl.setFeedback_id(teilnote.getFeedback_id());
        teilnoteImpl.setNote(teilnote.getNote());
        teilnoteImpl.setKategorie(teilnote.getKategorie());

        return teilnoteImpl;
    }

    /**
     * Returns the teilnote with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the teilnote
     * @return the teilnote
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchTeilnoteException if a teilnote with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Teilnote findByPrimaryKey(Serializable primaryKey)
        throws NoSuchTeilnoteException, SystemException {
        Teilnote teilnote = fetchByPrimaryKey(primaryKey);

        if (teilnote == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchTeilnoteException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return teilnote;
    }

    /**
     * Returns the teilnote with the primary key or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchTeilnoteException} if it could not be found.
     *
     * @param id the primary key of the teilnote
     * @return the teilnote
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchTeilnoteException if a teilnote with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Teilnote findByPrimaryKey(long id)
        throws NoSuchTeilnoteException, SystemException {
        return findByPrimaryKey((Serializable) id);
    }

    /**
     * Returns the teilnote with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the teilnote
     * @return the teilnote, or <code>null</code> if a teilnote with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Teilnote fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Teilnote teilnote = (Teilnote) EntityCacheUtil.getResult(TeilnoteModelImpl.ENTITY_CACHE_ENABLED,
                TeilnoteImpl.class, primaryKey);

        if (teilnote == _nullTeilnote) {
            return null;
        }

        if (teilnote == null) {
            Session session = null;

            try {
                session = openSession();

                teilnote = (Teilnote) session.get(TeilnoteImpl.class, primaryKey);

                if (teilnote != null) {
                    cacheResult(teilnote);
                } else {
                    EntityCacheUtil.putResult(TeilnoteModelImpl.ENTITY_CACHE_ENABLED,
                        TeilnoteImpl.class, primaryKey, _nullTeilnote);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(TeilnoteModelImpl.ENTITY_CACHE_ENABLED,
                    TeilnoteImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return teilnote;
    }

    /**
     * Returns the teilnote with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the teilnote
     * @return the teilnote, or <code>null</code> if a teilnote with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Teilnote fetchByPrimaryKey(long id) throws SystemException {
        return fetchByPrimaryKey((Serializable) id);
    }

    /**
     * Returns all the teilnotes.
     *
     * @return the teilnotes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Teilnote> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<Teilnote> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

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
    @Override
    public List<Teilnote> findAll(int start, int end,
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

        List<Teilnote> list = (List<Teilnote>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_TEILNOTE);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_TEILNOTE;

                if (pagination) {
                    sql = sql.concat(TeilnoteModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Teilnote>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Teilnote>(list);
                } else {
                    list = (List<Teilnote>) QueryUtil.list(q, getDialect(),
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
     * Removes all the teilnotes from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Teilnote teilnote : findAll()) {
            remove(teilnote);
        }
    }

    /**
     * Returns the number of teilnotes.
     *
     * @return the number of teilnotes
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

                Query q = session.createQuery(_SQL_COUNT_TEILNOTE);

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
     * Initializes the teilnote persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.de.hska.wi.awp.datasource.infosys.model.Teilnote")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Teilnote>> listenersList = new ArrayList<ModelListener<Teilnote>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Teilnote>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(TeilnoteImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
