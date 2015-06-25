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

import de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_detailException;
import de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail;
import de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_detailImpl;
import de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_detailModelImpl;
import de.hska.wi.awp.datasource.infosys.service.persistence.Statusbericht_detailPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the statusbericht_detail service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Daniel Storch
 * @see Statusbericht_detailPersistence
 * @see Statusbericht_detailUtil
 * @generated
 */
public class Statusbericht_detailPersistenceImpl extends BasePersistenceImpl<Statusbericht_detail>
    implements Statusbericht_detailPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link Statusbericht_detailUtil} to access the statusbericht_detail persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = Statusbericht_detailImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Statusbericht_detailModelImpl.ENTITY_CACHE_ENABLED,
            Statusbericht_detailModelImpl.FINDER_CACHE_ENABLED,
            Statusbericht_detailImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Statusbericht_detailModelImpl.ENTITY_CACHE_ENABLED,
            Statusbericht_detailModelImpl.FINDER_CACHE_ENABLED,
            Statusbericht_detailImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Statusbericht_detailModelImpl.ENTITY_CACHE_ENABLED,
            Statusbericht_detailModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUSBERICHT_ID =
        new FinderPath(Statusbericht_detailModelImpl.ENTITY_CACHE_ENABLED,
            Statusbericht_detailModelImpl.FINDER_CACHE_ENABLED,
            Statusbericht_detailImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByStatusbericht_id",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUSBERICHT_ID =
        new FinderPath(Statusbericht_detailModelImpl.ENTITY_CACHE_ENABLED,
            Statusbericht_detailModelImpl.FINDER_CACHE_ENABLED,
            Statusbericht_detailImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findByStatusbericht_id", new String[] { Long.class.getName() },
            Statusbericht_detailModelImpl.STATUSBERICHT_ID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_STATUSBERICHT_ID = new FinderPath(Statusbericht_detailModelImpl.ENTITY_CACHE_ENABLED,
            Statusbericht_detailModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByStatusbericht_id", new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_STATUSBERICHT_ID_STATUSBERICHT_ID_2 =
        "statusbericht_detail.statusbericht_id = ?";
    private static final String _SQL_SELECT_STATUSBERICHT_DETAIL = "SELECT statusbericht_detail FROM Statusbericht_detail statusbericht_detail";
    private static final String _SQL_SELECT_STATUSBERICHT_DETAIL_WHERE = "SELECT statusbericht_detail FROM Statusbericht_detail statusbericht_detail WHERE ";
    private static final String _SQL_COUNT_STATUSBERICHT_DETAIL = "SELECT COUNT(statusbericht_detail) FROM Statusbericht_detail statusbericht_detail";
    private static final String _SQL_COUNT_STATUSBERICHT_DETAIL_WHERE = "SELECT COUNT(statusbericht_detail) FROM Statusbericht_detail statusbericht_detail WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "statusbericht_detail.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Statusbericht_detail exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Statusbericht_detail exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(Statusbericht_detailPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "id", "text"
            });
    private static Statusbericht_detail _nullStatusbericht_detail = new Statusbericht_detailImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Statusbericht_detail> toCacheModel() {
                return _nullStatusbericht_detailCacheModel;
            }
        };

    private static CacheModel<Statusbericht_detail> _nullStatusbericht_detailCacheModel =
        new CacheModel<Statusbericht_detail>() {
            @Override
            public Statusbericht_detail toEntityModel() {
                return _nullStatusbericht_detail;
            }
        };

    public Statusbericht_detailPersistenceImpl() {
        setModelClass(Statusbericht_detail.class);
    }

    /**
     * Returns all the statusbericht_details where statusbericht_id = &#63;.
     *
     * @param statusbericht_id the statusbericht_id
     * @return the matching statusbericht_details
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Statusbericht_detail> findByStatusbericht_id(
        long statusbericht_id) throws SystemException {
        return findByStatusbericht_id(statusbericht_id, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the statusbericht_details where statusbericht_id = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_detailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param statusbericht_id the statusbericht_id
     * @param start the lower bound of the range of statusbericht_details
     * @param end the upper bound of the range of statusbericht_details (not inclusive)
     * @return the range of matching statusbericht_details
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Statusbericht_detail> findByStatusbericht_id(
        long statusbericht_id, int start, int end) throws SystemException {
        return findByStatusbericht_id(statusbericht_id, start, end, null);
    }

    /**
     * Returns an ordered range of all the statusbericht_details where statusbericht_id = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_detailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param statusbericht_id the statusbericht_id
     * @param start the lower bound of the range of statusbericht_details
     * @param end the upper bound of the range of statusbericht_details (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching statusbericht_details
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Statusbericht_detail> findByStatusbericht_id(
        long statusbericht_id, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUSBERICHT_ID;
            finderArgs = new Object[] { statusbericht_id };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUSBERICHT_ID;
            finderArgs = new Object[] {
                    statusbericht_id,
                    
                    start, end, orderByComparator
                };
        }

        List<Statusbericht_detail> list = (List<Statusbericht_detail>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Statusbericht_detail statusbericht_detail : list) {
                if ((statusbericht_id != statusbericht_detail.getStatusbericht_id())) {
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

            query.append(_SQL_SELECT_STATUSBERICHT_DETAIL_WHERE);

            query.append(_FINDER_COLUMN_STATUSBERICHT_ID_STATUSBERICHT_ID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(Statusbericht_detailModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(statusbericht_id);

                if (!pagination) {
                    list = (List<Statusbericht_detail>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Statusbericht_detail>(list);
                } else {
                    list = (List<Statusbericht_detail>) QueryUtil.list(q,
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
     * Returns the first statusbericht_detail in the ordered set where statusbericht_id = &#63;.
     *
     * @param statusbericht_id the statusbericht_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching statusbericht_detail
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_detailException if a matching statusbericht_detail could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusbericht_detail findByStatusbericht_id_First(
        long statusbericht_id, OrderByComparator orderByComparator)
        throws NoSuchStatusbericht_detailException, SystemException {
        Statusbericht_detail statusbericht_detail = fetchByStatusbericht_id_First(statusbericht_id,
                orderByComparator);

        if (statusbericht_detail != null) {
            return statusbericht_detail;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("statusbericht_id=");
        msg.append(statusbericht_id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchStatusbericht_detailException(msg.toString());
    }

    /**
     * Returns the first statusbericht_detail in the ordered set where statusbericht_id = &#63;.
     *
     * @param statusbericht_id the statusbericht_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching statusbericht_detail, or <code>null</code> if a matching statusbericht_detail could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusbericht_detail fetchByStatusbericht_id_First(
        long statusbericht_id, OrderByComparator orderByComparator)
        throws SystemException {
        List<Statusbericht_detail> list = findByStatusbericht_id(statusbericht_id,
                0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last statusbericht_detail in the ordered set where statusbericht_id = &#63;.
     *
     * @param statusbericht_id the statusbericht_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching statusbericht_detail
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_detailException if a matching statusbericht_detail could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusbericht_detail findByStatusbericht_id_Last(
        long statusbericht_id, OrderByComparator orderByComparator)
        throws NoSuchStatusbericht_detailException, SystemException {
        Statusbericht_detail statusbericht_detail = fetchByStatusbericht_id_Last(statusbericht_id,
                orderByComparator);

        if (statusbericht_detail != null) {
            return statusbericht_detail;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("statusbericht_id=");
        msg.append(statusbericht_id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchStatusbericht_detailException(msg.toString());
    }

    /**
     * Returns the last statusbericht_detail in the ordered set where statusbericht_id = &#63;.
     *
     * @param statusbericht_id the statusbericht_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching statusbericht_detail, or <code>null</code> if a matching statusbericht_detail could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusbericht_detail fetchByStatusbericht_id_Last(
        long statusbericht_id, OrderByComparator orderByComparator)
        throws SystemException {
        int count = countByStatusbericht_id(statusbericht_id);

        if (count == 0) {
            return null;
        }

        List<Statusbericht_detail> list = findByStatusbericht_id(statusbericht_id,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the statusbericht_details before and after the current statusbericht_detail in the ordered set where statusbericht_id = &#63;.
     *
     * @param id the primary key of the current statusbericht_detail
     * @param statusbericht_id the statusbericht_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next statusbericht_detail
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_detailException if a statusbericht_detail with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusbericht_detail[] findByStatusbericht_id_PrevAndNext(long id,
        long statusbericht_id, OrderByComparator orderByComparator)
        throws NoSuchStatusbericht_detailException, SystemException {
        Statusbericht_detail statusbericht_detail = findByPrimaryKey(id);

        Session session = null;

        try {
            session = openSession();

            Statusbericht_detail[] array = new Statusbericht_detailImpl[3];

            array[0] = getByStatusbericht_id_PrevAndNext(session,
                    statusbericht_detail, statusbericht_id, orderByComparator,
                    true);

            array[1] = statusbericht_detail;

            array[2] = getByStatusbericht_id_PrevAndNext(session,
                    statusbericht_detail, statusbericht_id, orderByComparator,
                    false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Statusbericht_detail getByStatusbericht_id_PrevAndNext(
        Session session, Statusbericht_detail statusbericht_detail,
        long statusbericht_id, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_STATUSBERICHT_DETAIL_WHERE);

        query.append(_FINDER_COLUMN_STATUSBERICHT_ID_STATUSBERICHT_ID_2);

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
            query.append(Statusbericht_detailModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(statusbericht_id);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(statusbericht_detail);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Statusbericht_detail> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the statusbericht_details where statusbericht_id = &#63; from the database.
     *
     * @param statusbericht_id the statusbericht_id
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByStatusbericht_id(long statusbericht_id)
        throws SystemException {
        for (Statusbericht_detail statusbericht_detail : findByStatusbericht_id(
                statusbericht_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(statusbericht_detail);
        }
    }

    /**
     * Returns the number of statusbericht_details where statusbericht_id = &#63;.
     *
     * @param statusbericht_id the statusbericht_id
     * @return the number of matching statusbericht_details
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByStatusbericht_id(long statusbericht_id)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_STATUSBERICHT_ID;

        Object[] finderArgs = new Object[] { statusbericht_id };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_STATUSBERICHT_DETAIL_WHERE);

            query.append(_FINDER_COLUMN_STATUSBERICHT_ID_STATUSBERICHT_ID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(statusbericht_id);

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
     * Caches the statusbericht_detail in the entity cache if it is enabled.
     *
     * @param statusbericht_detail the statusbericht_detail
     */
    @Override
    public void cacheResult(Statusbericht_detail statusbericht_detail) {
        EntityCacheUtil.putResult(Statusbericht_detailModelImpl.ENTITY_CACHE_ENABLED,
            Statusbericht_detailImpl.class,
            statusbericht_detail.getPrimaryKey(), statusbericht_detail);

        statusbericht_detail.resetOriginalValues();
    }

    /**
     * Caches the statusbericht_details in the entity cache if it is enabled.
     *
     * @param statusbericht_details the statusbericht_details
     */
    @Override
    public void cacheResult(List<Statusbericht_detail> statusbericht_details) {
        for (Statusbericht_detail statusbericht_detail : statusbericht_details) {
            if (EntityCacheUtil.getResult(
                        Statusbericht_detailModelImpl.ENTITY_CACHE_ENABLED,
                        Statusbericht_detailImpl.class,
                        statusbericht_detail.getPrimaryKey()) == null) {
                cacheResult(statusbericht_detail);
            } else {
                statusbericht_detail.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all statusbericht_details.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(Statusbericht_detailImpl.class.getName());
        }

        EntityCacheUtil.clearCache(Statusbericht_detailImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the statusbericht_detail.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Statusbericht_detail statusbericht_detail) {
        EntityCacheUtil.removeResult(Statusbericht_detailModelImpl.ENTITY_CACHE_ENABLED,
            Statusbericht_detailImpl.class, statusbericht_detail.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Statusbericht_detail> statusbericht_details) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Statusbericht_detail statusbericht_detail : statusbericht_details) {
            EntityCacheUtil.removeResult(Statusbericht_detailModelImpl.ENTITY_CACHE_ENABLED,
                Statusbericht_detailImpl.class,
                statusbericht_detail.getPrimaryKey());
        }
    }

    /**
     * Creates a new statusbericht_detail with the primary key. Does not add the statusbericht_detail to the database.
     *
     * @param id the primary key for the new statusbericht_detail
     * @return the new statusbericht_detail
     */
    @Override
    public Statusbericht_detail create(long id) {
        Statusbericht_detail statusbericht_detail = new Statusbericht_detailImpl();

        statusbericht_detail.setNew(true);
        statusbericht_detail.setPrimaryKey(id);

        return statusbericht_detail;
    }

    /**
     * Removes the statusbericht_detail with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the statusbericht_detail
     * @return the statusbericht_detail that was removed
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_detailException if a statusbericht_detail with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusbericht_detail remove(long id)
        throws NoSuchStatusbericht_detailException, SystemException {
        return remove((Serializable) id);
    }

    /**
     * Removes the statusbericht_detail with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the statusbericht_detail
     * @return the statusbericht_detail that was removed
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_detailException if a statusbericht_detail with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusbericht_detail remove(Serializable primaryKey)
        throws NoSuchStatusbericht_detailException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Statusbericht_detail statusbericht_detail = (Statusbericht_detail) session.get(Statusbericht_detailImpl.class,
                    primaryKey);

            if (statusbericht_detail == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchStatusbericht_detailException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(statusbericht_detail);
        } catch (NoSuchStatusbericht_detailException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Statusbericht_detail removeImpl(
        Statusbericht_detail statusbericht_detail) throws SystemException {
        statusbericht_detail = toUnwrappedModel(statusbericht_detail);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(statusbericht_detail)) {
                statusbericht_detail = (Statusbericht_detail) session.get(Statusbericht_detailImpl.class,
                        statusbericht_detail.getPrimaryKeyObj());
            }

            if (statusbericht_detail != null) {
                session.delete(statusbericht_detail);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (statusbericht_detail != null) {
            clearCache(statusbericht_detail);
        }

        return statusbericht_detail;
    }

    @Override
    public Statusbericht_detail updateImpl(
        de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail statusbericht_detail)
        throws SystemException {
        statusbericht_detail = toUnwrappedModel(statusbericht_detail);

        boolean isNew = statusbericht_detail.isNew();

        Statusbericht_detailModelImpl statusbericht_detailModelImpl = (Statusbericht_detailModelImpl) statusbericht_detail;

        Session session = null;

        try {
            session = openSession();

            if (statusbericht_detail.isNew()) {
                session.save(statusbericht_detail);

                statusbericht_detail.setNew(false);
            } else {
                session.merge(statusbericht_detail);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !Statusbericht_detailModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((statusbericht_detailModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUSBERICHT_ID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        statusbericht_detailModelImpl.getOriginalStatusbericht_id()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATUSBERICHT_ID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUSBERICHT_ID,
                    args);

                args = new Object[] {
                        statusbericht_detailModelImpl.getStatusbericht_id()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATUSBERICHT_ID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUSBERICHT_ID,
                    args);
            }
        }

        EntityCacheUtil.putResult(Statusbericht_detailModelImpl.ENTITY_CACHE_ENABLED,
            Statusbericht_detailImpl.class,
            statusbericht_detail.getPrimaryKey(), statusbericht_detail);

        return statusbericht_detail;
    }

    protected Statusbericht_detail toUnwrappedModel(
        Statusbericht_detail statusbericht_detail) {
        if (statusbericht_detail instanceof Statusbericht_detailImpl) {
            return statusbericht_detail;
        }

        Statusbericht_detailImpl statusbericht_detailImpl = new Statusbericht_detailImpl();

        statusbericht_detailImpl.setNew(statusbericht_detail.isNew());
        statusbericht_detailImpl.setPrimaryKey(statusbericht_detail.getPrimaryKey());

        statusbericht_detailImpl.setId(statusbericht_detail.getId());
        statusbericht_detailImpl.setText(statusbericht_detail.getText());
        statusbericht_detailImpl.setStatusbericht_id(statusbericht_detail.getStatusbericht_id());
        statusbericht_detailImpl.setStatusbericht_detail_punkt_id(statusbericht_detail.getStatusbericht_detail_punkt_id());

        return statusbericht_detailImpl;
    }

    /**
     * Returns the statusbericht_detail with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the statusbericht_detail
     * @return the statusbericht_detail
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_detailException if a statusbericht_detail with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusbericht_detail findByPrimaryKey(Serializable primaryKey)
        throws NoSuchStatusbericht_detailException, SystemException {
        Statusbericht_detail statusbericht_detail = fetchByPrimaryKey(primaryKey);

        if (statusbericht_detail == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchStatusbericht_detailException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return statusbericht_detail;
    }

    /**
     * Returns the statusbericht_detail with the primary key or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_detailException} if it could not be found.
     *
     * @param id the primary key of the statusbericht_detail
     * @return the statusbericht_detail
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_detailException if a statusbericht_detail with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusbericht_detail findByPrimaryKey(long id)
        throws NoSuchStatusbericht_detailException, SystemException {
        return findByPrimaryKey((Serializable) id);
    }

    /**
     * Returns the statusbericht_detail with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the statusbericht_detail
     * @return the statusbericht_detail, or <code>null</code> if a statusbericht_detail with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusbericht_detail fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Statusbericht_detail statusbericht_detail = (Statusbericht_detail) EntityCacheUtil.getResult(Statusbericht_detailModelImpl.ENTITY_CACHE_ENABLED,
                Statusbericht_detailImpl.class, primaryKey);

        if (statusbericht_detail == _nullStatusbericht_detail) {
            return null;
        }

        if (statusbericht_detail == null) {
            Session session = null;

            try {
                session = openSession();

                statusbericht_detail = (Statusbericht_detail) session.get(Statusbericht_detailImpl.class,
                        primaryKey);

                if (statusbericht_detail != null) {
                    cacheResult(statusbericht_detail);
                } else {
                    EntityCacheUtil.putResult(Statusbericht_detailModelImpl.ENTITY_CACHE_ENABLED,
                        Statusbericht_detailImpl.class, primaryKey,
                        _nullStatusbericht_detail);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(Statusbericht_detailModelImpl.ENTITY_CACHE_ENABLED,
                    Statusbericht_detailImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return statusbericht_detail;
    }

    /**
     * Returns the statusbericht_detail with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the statusbericht_detail
     * @return the statusbericht_detail, or <code>null</code> if a statusbericht_detail with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusbericht_detail fetchByPrimaryKey(long id)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) id);
    }

    /**
     * Returns all the statusbericht_details.
     *
     * @return the statusbericht_details
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Statusbericht_detail> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the statusbericht_details.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_detailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of statusbericht_details
     * @param end the upper bound of the range of statusbericht_details (not inclusive)
     * @return the range of statusbericht_details
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Statusbericht_detail> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the statusbericht_details.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_detailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of statusbericht_details
     * @param end the upper bound of the range of statusbericht_details (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of statusbericht_details
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Statusbericht_detail> findAll(int start, int end,
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

        List<Statusbericht_detail> list = (List<Statusbericht_detail>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_STATUSBERICHT_DETAIL);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_STATUSBERICHT_DETAIL;

                if (pagination) {
                    sql = sql.concat(Statusbericht_detailModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Statusbericht_detail>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Statusbericht_detail>(list);
                } else {
                    list = (List<Statusbericht_detail>) QueryUtil.list(q,
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
     * Removes all the statusbericht_details from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Statusbericht_detail statusbericht_detail : findAll()) {
            remove(statusbericht_detail);
        }
    }

    /**
     * Returns the number of statusbericht_details.
     *
     * @return the number of statusbericht_details
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

                Query q = session.createQuery(_SQL_COUNT_STATUSBERICHT_DETAIL);

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
     * Initializes the statusbericht_detail persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Statusbericht_detail>> listenersList = new ArrayList<ModelListener<Statusbericht_detail>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Statusbericht_detail>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(Statusbericht_detailImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
