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

import de.hska.wi.awp.datasource.infosys.NoSuchStatusberichteException;
import de.hska.wi.awp.datasource.infosys.model.Statusberichte;
import de.hska.wi.awp.datasource.infosys.model.impl.StatusberichteImpl;
import de.hska.wi.awp.datasource.infosys.model.impl.StatusberichteModelImpl;
import de.hska.wi.awp.datasource.infosys.service.persistence.StatusberichtePersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the statusberichte service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Daniel Storch
 * @see StatusberichtePersistence
 * @see StatusberichteUtil
 * @generated
 */
public class StatusberichtePersistenceImpl extends BasePersistenceImpl<Statusberichte>
    implements StatusberichtePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link StatusberichteUtil} to access the statusberichte persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = StatusberichteImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(StatusberichteModelImpl.ENTITY_CACHE_ENABLED,
            StatusberichteModelImpl.FINDER_CACHE_ENABLED,
            StatusberichteImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(StatusberichteModelImpl.ENTITY_CACHE_ENABLED,
            StatusberichteModelImpl.FINDER_CACHE_ENABLED,
            StatusberichteImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(StatusberichteModelImpl.ENTITY_CACHE_ENABLED,
            StatusberichteModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PROJECT_ID =
        new FinderPath(StatusberichteModelImpl.ENTITY_CACHE_ENABLED,
            StatusberichteModelImpl.FINDER_CACHE_ENABLED,
            StatusberichteImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByProject_id",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROJECT_ID =
        new FinderPath(StatusberichteModelImpl.ENTITY_CACHE_ENABLED,
            StatusberichteModelImpl.FINDER_CACHE_ENABLED,
            StatusberichteImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByProject_id",
            new String[] { Long.class.getName() },
            StatusberichteModelImpl.PROJECT_ID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_PROJECT_ID = new FinderPath(StatusberichteModelImpl.ENTITY_CACHE_ENABLED,
            StatusberichteModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByProject_id",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_PROJECT_ID_PROJECT_ID_2 = "statusberichte.project_id = ?";
    private static final String _SQL_SELECT_STATUSBERICHTE = "SELECT statusberichte FROM Statusberichte statusberichte";
    private static final String _SQL_SELECT_STATUSBERICHTE_WHERE = "SELECT statusberichte FROM Statusberichte statusberichte WHERE ";
    private static final String _SQL_COUNT_STATUSBERICHTE = "SELECT COUNT(statusberichte) FROM Statusberichte statusberichte";
    private static final String _SQL_COUNT_STATUSBERICHTE_WHERE = "SELECT COUNT(statusberichte) FROM Statusberichte statusberichte WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "statusberichte.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Statusberichte exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Statusberichte exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(StatusberichtePersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "id"
            });
    private static Statusberichte _nullStatusberichte = new StatusberichteImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Statusberichte> toCacheModel() {
                return _nullStatusberichteCacheModel;
            }
        };

    private static CacheModel<Statusberichte> _nullStatusberichteCacheModel = new CacheModel<Statusberichte>() {
            @Override
            public Statusberichte toEntityModel() {
                return _nullStatusberichte;
            }
        };

    public StatusberichtePersistenceImpl() {
        setModelClass(Statusberichte.class);
    }

    /**
     * Returns all the statusberichtes where project_id = &#63;.
     *
     * @param project_id the project_id
     * @return the matching statusberichtes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Statusberichte> findByProject_id(long project_id)
        throws SystemException {
        return findByProject_id(project_id, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<Statusberichte> findByProject_id(long project_id, int start,
        int end) throws SystemException {
        return findByProject_id(project_id, start, end, null);
    }

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
    @Override
    public List<Statusberichte> findByProject_id(long project_id, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROJECT_ID;
            finderArgs = new Object[] { project_id };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PROJECT_ID;
            finderArgs = new Object[] { project_id, start, end, orderByComparator };
        }

        List<Statusberichte> list = (List<Statusberichte>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Statusberichte statusberichte : list) {
                if ((project_id != statusberichte.getProject_id())) {
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

            query.append(_SQL_SELECT_STATUSBERICHTE_WHERE);

            query.append(_FINDER_COLUMN_PROJECT_ID_PROJECT_ID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(StatusberichteModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(project_id);

                if (!pagination) {
                    list = (List<Statusberichte>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Statusberichte>(list);
                } else {
                    list = (List<Statusberichte>) QueryUtil.list(q,
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
     * Returns the first statusberichte in the ordered set where project_id = &#63;.
     *
     * @param project_id the project_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching statusberichte
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusberichteException if a matching statusberichte could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusberichte findByProject_id_First(long project_id,
        OrderByComparator orderByComparator)
        throws NoSuchStatusberichteException, SystemException {
        Statusberichte statusberichte = fetchByProject_id_First(project_id,
                orderByComparator);

        if (statusberichte != null) {
            return statusberichte;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("project_id=");
        msg.append(project_id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchStatusberichteException(msg.toString());
    }

    /**
     * Returns the first statusberichte in the ordered set where project_id = &#63;.
     *
     * @param project_id the project_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching statusberichte, or <code>null</code> if a matching statusberichte could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusberichte fetchByProject_id_First(long project_id,
        OrderByComparator orderByComparator) throws SystemException {
        List<Statusberichte> list = findByProject_id(project_id, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last statusberichte in the ordered set where project_id = &#63;.
     *
     * @param project_id the project_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching statusberichte
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusberichteException if a matching statusberichte could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusberichte findByProject_id_Last(long project_id,
        OrderByComparator orderByComparator)
        throws NoSuchStatusberichteException, SystemException {
        Statusberichte statusberichte = fetchByProject_id_Last(project_id,
                orderByComparator);

        if (statusberichte != null) {
            return statusberichte;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("project_id=");
        msg.append(project_id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchStatusberichteException(msg.toString());
    }

    /**
     * Returns the last statusberichte in the ordered set where project_id = &#63;.
     *
     * @param project_id the project_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching statusberichte, or <code>null</code> if a matching statusberichte could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusberichte fetchByProject_id_Last(long project_id,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByProject_id(project_id);

        if (count == 0) {
            return null;
        }

        List<Statusberichte> list = findByProject_id(project_id, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public Statusberichte[] findByProject_id_PrevAndNext(long id,
        long project_id, OrderByComparator orderByComparator)
        throws NoSuchStatusberichteException, SystemException {
        Statusberichte statusberichte = findByPrimaryKey(id);

        Session session = null;

        try {
            session = openSession();

            Statusberichte[] array = new StatusberichteImpl[3];

            array[0] = getByProject_id_PrevAndNext(session, statusberichte,
                    project_id, orderByComparator, true);

            array[1] = statusberichte;

            array[2] = getByProject_id_PrevAndNext(session, statusberichte,
                    project_id, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Statusberichte getByProject_id_PrevAndNext(Session session,
        Statusberichte statusberichte, long project_id,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_STATUSBERICHTE_WHERE);

        query.append(_FINDER_COLUMN_PROJECT_ID_PROJECT_ID_2);

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
            query.append(StatusberichteModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(project_id);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(statusberichte);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Statusberichte> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the statusberichtes where project_id = &#63; from the database.
     *
     * @param project_id the project_id
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByProject_id(long project_id) throws SystemException {
        for (Statusberichte statusberichte : findByProject_id(project_id,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(statusberichte);
        }
    }

    /**
     * Returns the number of statusberichtes where project_id = &#63;.
     *
     * @param project_id the project_id
     * @return the number of matching statusberichtes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByProject_id(long project_id) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_PROJECT_ID;

        Object[] finderArgs = new Object[] { project_id };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_STATUSBERICHTE_WHERE);

            query.append(_FINDER_COLUMN_PROJECT_ID_PROJECT_ID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(project_id);

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
     * Caches the statusberichte in the entity cache if it is enabled.
     *
     * @param statusberichte the statusberichte
     */
    @Override
    public void cacheResult(Statusberichte statusberichte) {
        EntityCacheUtil.putResult(StatusberichteModelImpl.ENTITY_CACHE_ENABLED,
            StatusberichteImpl.class, statusberichte.getPrimaryKey(),
            statusberichte);

        statusberichte.resetOriginalValues();
    }

    /**
     * Caches the statusberichtes in the entity cache if it is enabled.
     *
     * @param statusberichtes the statusberichtes
     */
    @Override
    public void cacheResult(List<Statusberichte> statusberichtes) {
        for (Statusberichte statusberichte : statusberichtes) {
            if (EntityCacheUtil.getResult(
                        StatusberichteModelImpl.ENTITY_CACHE_ENABLED,
                        StatusberichteImpl.class, statusberichte.getPrimaryKey()) == null) {
                cacheResult(statusberichte);
            } else {
                statusberichte.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all statusberichtes.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(StatusberichteImpl.class.getName());
        }

        EntityCacheUtil.clearCache(StatusberichteImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the statusberichte.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Statusberichte statusberichte) {
        EntityCacheUtil.removeResult(StatusberichteModelImpl.ENTITY_CACHE_ENABLED,
            StatusberichteImpl.class, statusberichte.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Statusberichte> statusberichtes) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Statusberichte statusberichte : statusberichtes) {
            EntityCacheUtil.removeResult(StatusberichteModelImpl.ENTITY_CACHE_ENABLED,
                StatusberichteImpl.class, statusberichte.getPrimaryKey());
        }
    }

    /**
     * Creates a new statusberichte with the primary key. Does not add the statusberichte to the database.
     *
     * @param id the primary key for the new statusberichte
     * @return the new statusberichte
     */
    @Override
    public Statusberichte create(long id) {
        Statusberichte statusberichte = new StatusberichteImpl();

        statusberichte.setNew(true);
        statusberichte.setPrimaryKey(id);

        return statusberichte;
    }

    /**
     * Removes the statusberichte with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the statusberichte
     * @return the statusberichte that was removed
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusberichteException if a statusberichte with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusberichte remove(long id)
        throws NoSuchStatusberichteException, SystemException {
        return remove((Serializable) id);
    }

    /**
     * Removes the statusberichte with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the statusberichte
     * @return the statusberichte that was removed
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusberichteException if a statusberichte with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusberichte remove(Serializable primaryKey)
        throws NoSuchStatusberichteException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Statusberichte statusberichte = (Statusberichte) session.get(StatusberichteImpl.class,
                    primaryKey);

            if (statusberichte == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchStatusberichteException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(statusberichte);
        } catch (NoSuchStatusberichteException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Statusberichte removeImpl(Statusberichte statusberichte)
        throws SystemException {
        statusberichte = toUnwrappedModel(statusberichte);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(statusberichte)) {
                statusberichte = (Statusberichte) session.get(StatusberichteImpl.class,
                        statusberichte.getPrimaryKeyObj());
            }

            if (statusberichte != null) {
                session.delete(statusberichte);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (statusberichte != null) {
            clearCache(statusberichte);
        }

        return statusberichte;
    }

    @Override
    public Statusberichte updateImpl(
        de.hska.wi.awp.datasource.infosys.model.Statusberichte statusberichte)
        throws SystemException {
        statusberichte = toUnwrappedModel(statusberichte);

        boolean isNew = statusberichte.isNew();

        StatusberichteModelImpl statusberichteModelImpl = (StatusberichteModelImpl) statusberichte;

        Session session = null;

        try {
            session = openSession();

            if (statusberichte.isNew()) {
                session.save(statusberichte);

                statusberichte.setNew(false);
            } else {
                session.merge(statusberichte);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !StatusberichteModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((statusberichteModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROJECT_ID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        statusberichteModelImpl.getOriginalProject_id()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PROJECT_ID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROJECT_ID,
                    args);

                args = new Object[] { statusberichteModelImpl.getProject_id() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PROJECT_ID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROJECT_ID,
                    args);
            }
        }

        EntityCacheUtil.putResult(StatusberichteModelImpl.ENTITY_CACHE_ENABLED,
            StatusberichteImpl.class, statusberichte.getPrimaryKey(),
            statusberichte);

        return statusberichte;
    }

    protected Statusberichte toUnwrappedModel(Statusberichte statusberichte) {
        if (statusberichte instanceof StatusberichteImpl) {
            return statusberichte;
        }

        StatusberichteImpl statusberichteImpl = new StatusberichteImpl();

        statusberichteImpl.setNew(statusberichte.isNew());
        statusberichteImpl.setPrimaryKey(statusberichte.getPrimaryKey());

        statusberichteImpl.setId(statusberichte.getId());
        statusberichteImpl.setProject_id(statusberichte.getProject_id());
        statusberichteImpl.setDatum(statusberichte.getDatum());
        statusberichteImpl.setKalenderwoche(statusberichte.getKalenderwoche());

        return statusberichteImpl;
    }

    /**
     * Returns the statusberichte with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the statusberichte
     * @return the statusberichte
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusberichteException if a statusberichte with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusberichte findByPrimaryKey(Serializable primaryKey)
        throws NoSuchStatusberichteException, SystemException {
        Statusberichte statusberichte = fetchByPrimaryKey(primaryKey);

        if (statusberichte == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchStatusberichteException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return statusberichte;
    }

    /**
     * Returns the statusberichte with the primary key or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchStatusberichteException} if it could not be found.
     *
     * @param id the primary key of the statusberichte
     * @return the statusberichte
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusberichteException if a statusberichte with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusberichte findByPrimaryKey(long id)
        throws NoSuchStatusberichteException, SystemException {
        return findByPrimaryKey((Serializable) id);
    }

    /**
     * Returns the statusberichte with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the statusberichte
     * @return the statusberichte, or <code>null</code> if a statusberichte with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusberichte fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Statusberichte statusberichte = (Statusberichte) EntityCacheUtil.getResult(StatusberichteModelImpl.ENTITY_CACHE_ENABLED,
                StatusberichteImpl.class, primaryKey);

        if (statusberichte == _nullStatusberichte) {
            return null;
        }

        if (statusberichte == null) {
            Session session = null;

            try {
                session = openSession();

                statusberichte = (Statusberichte) session.get(StatusberichteImpl.class,
                        primaryKey);

                if (statusberichte != null) {
                    cacheResult(statusberichte);
                } else {
                    EntityCacheUtil.putResult(StatusberichteModelImpl.ENTITY_CACHE_ENABLED,
                        StatusberichteImpl.class, primaryKey,
                        _nullStatusberichte);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(StatusberichteModelImpl.ENTITY_CACHE_ENABLED,
                    StatusberichteImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return statusberichte;
    }

    /**
     * Returns the statusberichte with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the statusberichte
     * @return the statusberichte, or <code>null</code> if a statusberichte with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusberichte fetchByPrimaryKey(long id) throws SystemException {
        return fetchByPrimaryKey((Serializable) id);
    }

    /**
     * Returns all the statusberichtes.
     *
     * @return the statusberichtes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Statusberichte> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<Statusberichte> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

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
    @Override
    public List<Statusberichte> findAll(int start, int end,
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

        List<Statusberichte> list = (List<Statusberichte>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_STATUSBERICHTE);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_STATUSBERICHTE;

                if (pagination) {
                    sql = sql.concat(StatusberichteModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Statusberichte>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Statusberichte>(list);
                } else {
                    list = (List<Statusberichte>) QueryUtil.list(q,
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
     * Removes all the statusberichtes from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Statusberichte statusberichte : findAll()) {
            remove(statusberichte);
        }
    }

    /**
     * Returns the number of statusberichtes.
     *
     * @return the number of statusberichtes
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

                Query q = session.createQuery(_SQL_COUNT_STATUSBERICHTE);

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
     * Initializes the statusberichte persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.de.hska.wi.awp.datasource.infosys.model.Statusberichte")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Statusberichte>> listenersList = new ArrayList<ModelListener<Statusberichte>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Statusberichte>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(StatusberichteImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
