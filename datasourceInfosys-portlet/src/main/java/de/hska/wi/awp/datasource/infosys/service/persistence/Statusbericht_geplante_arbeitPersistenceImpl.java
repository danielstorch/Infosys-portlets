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

import de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_geplante_arbeitException;
import de.hska.wi.awp.datasource.infosys.model.Statusbericht_geplante_arbeit;
import de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_geplante_arbeitImpl;
import de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_geplante_arbeitModelImpl;
import de.hska.wi.awp.datasource.infosys.service.persistence.Statusbericht_geplante_arbeitPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the statusbericht_geplante_arbeit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Daniel Storch
 * @see Statusbericht_geplante_arbeitPersistence
 * @see Statusbericht_geplante_arbeitUtil
 * @generated
 */
public class Statusbericht_geplante_arbeitPersistenceImpl
    extends BasePersistenceImpl<Statusbericht_geplante_arbeit>
    implements Statusbericht_geplante_arbeitPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link Statusbericht_geplante_arbeitUtil} to access the statusbericht_geplante_arbeit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = Statusbericht_geplante_arbeitImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Statusbericht_geplante_arbeitModelImpl.ENTITY_CACHE_ENABLED,
            Statusbericht_geplante_arbeitModelImpl.FINDER_CACHE_ENABLED,
            Statusbericht_geplante_arbeitImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Statusbericht_geplante_arbeitModelImpl.ENTITY_CACHE_ENABLED,
            Statusbericht_geplante_arbeitModelImpl.FINDER_CACHE_ENABLED,
            Statusbericht_geplante_arbeitImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Statusbericht_geplante_arbeitModelImpl.ENTITY_CACHE_ENABLED,
            Statusbericht_geplante_arbeitModelImpl.FINDER_CACHE_ENABLED,
            Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
            new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUSBERICHT_ID =
        new FinderPath(Statusbericht_geplante_arbeitModelImpl.ENTITY_CACHE_ENABLED,
            Statusbericht_geplante_arbeitModelImpl.FINDER_CACHE_ENABLED,
            Statusbericht_geplante_arbeitImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByStatusbericht_id",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUSBERICHT_ID =
        new FinderPath(Statusbericht_geplante_arbeitModelImpl.ENTITY_CACHE_ENABLED,
            Statusbericht_geplante_arbeitModelImpl.FINDER_CACHE_ENABLED,
            Statusbericht_geplante_arbeitImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findByStatusbericht_id", new String[] { Long.class.getName() },
            Statusbericht_geplante_arbeitModelImpl.STATUSBERICHT_ID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_STATUSBERICHT_ID = new FinderPath(Statusbericht_geplante_arbeitModelImpl.ENTITY_CACHE_ENABLED,
            Statusbericht_geplante_arbeitModelImpl.FINDER_CACHE_ENABLED,
            Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByStatusbericht_id", new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_STATUSBERICHT_ID_STATUSBERICHT_ID_2 =
        "statusbericht_geplante_arbeit.statusbericht_id = ?";
    private static final String _SQL_SELECT_STATUSBERICHT_GEPLANTE_ARBEIT = "SELECT statusbericht_geplante_arbeit FROM Statusbericht_geplante_arbeit statusbericht_geplante_arbeit";
    private static final String _SQL_SELECT_STATUSBERICHT_GEPLANTE_ARBEIT_WHERE = "SELECT statusbericht_geplante_arbeit FROM Statusbericht_geplante_arbeit statusbericht_geplante_arbeit WHERE ";
    private static final String _SQL_COUNT_STATUSBERICHT_GEPLANTE_ARBEIT = "SELECT COUNT(statusbericht_geplante_arbeit) FROM Statusbericht_geplante_arbeit statusbericht_geplante_arbeit";
    private static final String _SQL_COUNT_STATUSBERICHT_GEPLANTE_ARBEIT_WHERE = "SELECT COUNT(statusbericht_geplante_arbeit) FROM Statusbericht_geplante_arbeit statusbericht_geplante_arbeit WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "statusbericht_geplante_arbeit.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Statusbericht_geplante_arbeit exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Statusbericht_geplante_arbeit exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(Statusbericht_geplante_arbeitPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "id"
            });
    private static Statusbericht_geplante_arbeit _nullStatusbericht_geplante_arbeit =
        new Statusbericht_geplante_arbeitImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Statusbericht_geplante_arbeit> toCacheModel() {
                return _nullStatusbericht_geplante_arbeitCacheModel;
            }
        };

    private static CacheModel<Statusbericht_geplante_arbeit> _nullStatusbericht_geplante_arbeitCacheModel =
        new CacheModel<Statusbericht_geplante_arbeit>() {
            @Override
            public Statusbericht_geplante_arbeit toEntityModel() {
                return _nullStatusbericht_geplante_arbeit;
            }
        };

    public Statusbericht_geplante_arbeitPersistenceImpl() {
        setModelClass(Statusbericht_geplante_arbeit.class);
    }

    /**
     * Returns all the statusbericht_geplante_arbeits where statusbericht_id = &#63;.
     *
     * @param statusbericht_id the statusbericht_id
     * @return the matching statusbericht_geplante_arbeits
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Statusbericht_geplante_arbeit> findByStatusbericht_id(
        long statusbericht_id) throws SystemException {
        return findByStatusbericht_id(statusbericht_id, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the statusbericht_geplante_arbeits where statusbericht_id = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_geplante_arbeitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param statusbericht_id the statusbericht_id
     * @param start the lower bound of the range of statusbericht_geplante_arbeits
     * @param end the upper bound of the range of statusbericht_geplante_arbeits (not inclusive)
     * @return the range of matching statusbericht_geplante_arbeits
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Statusbericht_geplante_arbeit> findByStatusbericht_id(
        long statusbericht_id, int start, int end) throws SystemException {
        return findByStatusbericht_id(statusbericht_id, start, end, null);
    }

    /**
     * Returns an ordered range of all the statusbericht_geplante_arbeits where statusbericht_id = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_geplante_arbeitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param statusbericht_id the statusbericht_id
     * @param start the lower bound of the range of statusbericht_geplante_arbeits
     * @param end the upper bound of the range of statusbericht_geplante_arbeits (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching statusbericht_geplante_arbeits
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Statusbericht_geplante_arbeit> findByStatusbericht_id(
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

        List<Statusbericht_geplante_arbeit> list = (List<Statusbericht_geplante_arbeit>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Statusbericht_geplante_arbeit statusbericht_geplante_arbeit : list) {
                if ((statusbericht_id != statusbericht_geplante_arbeit.getStatusbericht_id())) {
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

            query.append(_SQL_SELECT_STATUSBERICHT_GEPLANTE_ARBEIT_WHERE);

            query.append(_FINDER_COLUMN_STATUSBERICHT_ID_STATUSBERICHT_ID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(Statusbericht_geplante_arbeitModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(statusbericht_id);

                if (!pagination) {
                    list = (List<Statusbericht_geplante_arbeit>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Statusbericht_geplante_arbeit>(list);
                } else {
                    list = (List<Statusbericht_geplante_arbeit>) QueryUtil.list(q,
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
     * Returns the first statusbericht_geplante_arbeit in the ordered set where statusbericht_id = &#63;.
     *
     * @param statusbericht_id the statusbericht_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching statusbericht_geplante_arbeit
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_geplante_arbeitException if a matching statusbericht_geplante_arbeit could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusbericht_geplante_arbeit findByStatusbericht_id_First(
        long statusbericht_id, OrderByComparator orderByComparator)
        throws NoSuchStatusbericht_geplante_arbeitException, SystemException {
        Statusbericht_geplante_arbeit statusbericht_geplante_arbeit = fetchByStatusbericht_id_First(statusbericht_id,
                orderByComparator);

        if (statusbericht_geplante_arbeit != null) {
            return statusbericht_geplante_arbeit;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("statusbericht_id=");
        msg.append(statusbericht_id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchStatusbericht_geplante_arbeitException(msg.toString());
    }

    /**
     * Returns the first statusbericht_geplante_arbeit in the ordered set where statusbericht_id = &#63;.
     *
     * @param statusbericht_id the statusbericht_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching statusbericht_geplante_arbeit, or <code>null</code> if a matching statusbericht_geplante_arbeit could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusbericht_geplante_arbeit fetchByStatusbericht_id_First(
        long statusbericht_id, OrderByComparator orderByComparator)
        throws SystemException {
        List<Statusbericht_geplante_arbeit> list = findByStatusbericht_id(statusbericht_id,
                0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last statusbericht_geplante_arbeit in the ordered set where statusbericht_id = &#63;.
     *
     * @param statusbericht_id the statusbericht_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching statusbericht_geplante_arbeit
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_geplante_arbeitException if a matching statusbericht_geplante_arbeit could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusbericht_geplante_arbeit findByStatusbericht_id_Last(
        long statusbericht_id, OrderByComparator orderByComparator)
        throws NoSuchStatusbericht_geplante_arbeitException, SystemException {
        Statusbericht_geplante_arbeit statusbericht_geplante_arbeit = fetchByStatusbericht_id_Last(statusbericht_id,
                orderByComparator);

        if (statusbericht_geplante_arbeit != null) {
            return statusbericht_geplante_arbeit;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("statusbericht_id=");
        msg.append(statusbericht_id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchStatusbericht_geplante_arbeitException(msg.toString());
    }

    /**
     * Returns the last statusbericht_geplante_arbeit in the ordered set where statusbericht_id = &#63;.
     *
     * @param statusbericht_id the statusbericht_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching statusbericht_geplante_arbeit, or <code>null</code> if a matching statusbericht_geplante_arbeit could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusbericht_geplante_arbeit fetchByStatusbericht_id_Last(
        long statusbericht_id, OrderByComparator orderByComparator)
        throws SystemException {
        int count = countByStatusbericht_id(statusbericht_id);

        if (count == 0) {
            return null;
        }

        List<Statusbericht_geplante_arbeit> list = findByStatusbericht_id(statusbericht_id,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the statusbericht_geplante_arbeits before and after the current statusbericht_geplante_arbeit in the ordered set where statusbericht_id = &#63;.
     *
     * @param id the primary key of the current statusbericht_geplante_arbeit
     * @param statusbericht_id the statusbericht_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next statusbericht_geplante_arbeit
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_geplante_arbeitException if a statusbericht_geplante_arbeit with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusbericht_geplante_arbeit[] findByStatusbericht_id_PrevAndNext(
        long id, long statusbericht_id, OrderByComparator orderByComparator)
        throws NoSuchStatusbericht_geplante_arbeitException, SystemException {
        Statusbericht_geplante_arbeit statusbericht_geplante_arbeit = findByPrimaryKey(id);

        Session session = null;

        try {
            session = openSession();

            Statusbericht_geplante_arbeit[] array = new Statusbericht_geplante_arbeitImpl[3];

            array[0] = getByStatusbericht_id_PrevAndNext(session,
                    statusbericht_geplante_arbeit, statusbericht_id,
                    orderByComparator, true);

            array[1] = statusbericht_geplante_arbeit;

            array[2] = getByStatusbericht_id_PrevAndNext(session,
                    statusbericht_geplante_arbeit, statusbericht_id,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Statusbericht_geplante_arbeit getByStatusbericht_id_PrevAndNext(
        Session session,
        Statusbericht_geplante_arbeit statusbericht_geplante_arbeit,
        long statusbericht_id, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_STATUSBERICHT_GEPLANTE_ARBEIT_WHERE);

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
            query.append(Statusbericht_geplante_arbeitModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(statusbericht_id);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(statusbericht_geplante_arbeit);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Statusbericht_geplante_arbeit> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the statusbericht_geplante_arbeits where statusbericht_id = &#63; from the database.
     *
     * @param statusbericht_id the statusbericht_id
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByStatusbericht_id(long statusbericht_id)
        throws SystemException {
        for (Statusbericht_geplante_arbeit statusbericht_geplante_arbeit : findByStatusbericht_id(
                statusbericht_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(statusbericht_geplante_arbeit);
        }
    }

    /**
     * Returns the number of statusbericht_geplante_arbeits where statusbericht_id = &#63;.
     *
     * @param statusbericht_id the statusbericht_id
     * @return the number of matching statusbericht_geplante_arbeits
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

            query.append(_SQL_COUNT_STATUSBERICHT_GEPLANTE_ARBEIT_WHERE);

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
     * Caches the statusbericht_geplante_arbeit in the entity cache if it is enabled.
     *
     * @param statusbericht_geplante_arbeit the statusbericht_geplante_arbeit
     */
    @Override
    public void cacheResult(
        Statusbericht_geplante_arbeit statusbericht_geplante_arbeit) {
        EntityCacheUtil.putResult(Statusbericht_geplante_arbeitModelImpl.ENTITY_CACHE_ENABLED,
            Statusbericht_geplante_arbeitImpl.class,
            statusbericht_geplante_arbeit.getPrimaryKey(),
            statusbericht_geplante_arbeit);

        statusbericht_geplante_arbeit.resetOriginalValues();
    }

    /**
     * Caches the statusbericht_geplante_arbeits in the entity cache if it is enabled.
     *
     * @param statusbericht_geplante_arbeits the statusbericht_geplante_arbeits
     */
    @Override
    public void cacheResult(
        List<Statusbericht_geplante_arbeit> statusbericht_geplante_arbeits) {
        for (Statusbericht_geplante_arbeit statusbericht_geplante_arbeit : statusbericht_geplante_arbeits) {
            if (EntityCacheUtil.getResult(
                        Statusbericht_geplante_arbeitModelImpl.ENTITY_CACHE_ENABLED,
                        Statusbericht_geplante_arbeitImpl.class,
                        statusbericht_geplante_arbeit.getPrimaryKey()) == null) {
                cacheResult(statusbericht_geplante_arbeit);
            } else {
                statusbericht_geplante_arbeit.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all statusbericht_geplante_arbeits.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(Statusbericht_geplante_arbeitImpl.class.getName());
        }

        EntityCacheUtil.clearCache(Statusbericht_geplante_arbeitImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the statusbericht_geplante_arbeit.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(
        Statusbericht_geplante_arbeit statusbericht_geplante_arbeit) {
        EntityCacheUtil.removeResult(Statusbericht_geplante_arbeitModelImpl.ENTITY_CACHE_ENABLED,
            Statusbericht_geplante_arbeitImpl.class,
            statusbericht_geplante_arbeit.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(
        List<Statusbericht_geplante_arbeit> statusbericht_geplante_arbeits) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Statusbericht_geplante_arbeit statusbericht_geplante_arbeit : statusbericht_geplante_arbeits) {
            EntityCacheUtil.removeResult(Statusbericht_geplante_arbeitModelImpl.ENTITY_CACHE_ENABLED,
                Statusbericht_geplante_arbeitImpl.class,
                statusbericht_geplante_arbeit.getPrimaryKey());
        }
    }

    /**
     * Creates a new statusbericht_geplante_arbeit with the primary key. Does not add the statusbericht_geplante_arbeit to the database.
     *
     * @param id the primary key for the new statusbericht_geplante_arbeit
     * @return the new statusbericht_geplante_arbeit
     */
    @Override
    public Statusbericht_geplante_arbeit create(long id) {
        Statusbericht_geplante_arbeit statusbericht_geplante_arbeit = new Statusbericht_geplante_arbeitImpl();

        statusbericht_geplante_arbeit.setNew(true);
        statusbericht_geplante_arbeit.setPrimaryKey(id);

        return statusbericht_geplante_arbeit;
    }

    /**
     * Removes the statusbericht_geplante_arbeit with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the statusbericht_geplante_arbeit
     * @return the statusbericht_geplante_arbeit that was removed
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_geplante_arbeitException if a statusbericht_geplante_arbeit with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusbericht_geplante_arbeit remove(long id)
        throws NoSuchStatusbericht_geplante_arbeitException, SystemException {
        return remove((Serializable) id);
    }

    /**
     * Removes the statusbericht_geplante_arbeit with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the statusbericht_geplante_arbeit
     * @return the statusbericht_geplante_arbeit that was removed
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_geplante_arbeitException if a statusbericht_geplante_arbeit with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusbericht_geplante_arbeit remove(Serializable primaryKey)
        throws NoSuchStatusbericht_geplante_arbeitException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Statusbericht_geplante_arbeit statusbericht_geplante_arbeit = (Statusbericht_geplante_arbeit) session.get(Statusbericht_geplante_arbeitImpl.class,
                    primaryKey);

            if (statusbericht_geplante_arbeit == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchStatusbericht_geplante_arbeitException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(statusbericht_geplante_arbeit);
        } catch (NoSuchStatusbericht_geplante_arbeitException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Statusbericht_geplante_arbeit removeImpl(
        Statusbericht_geplante_arbeit statusbericht_geplante_arbeit)
        throws SystemException {
        statusbericht_geplante_arbeit = toUnwrappedModel(statusbericht_geplante_arbeit);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(statusbericht_geplante_arbeit)) {
                statusbericht_geplante_arbeit = (Statusbericht_geplante_arbeit) session.get(Statusbericht_geplante_arbeitImpl.class,
                        statusbericht_geplante_arbeit.getPrimaryKeyObj());
            }

            if (statusbericht_geplante_arbeit != null) {
                session.delete(statusbericht_geplante_arbeit);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (statusbericht_geplante_arbeit != null) {
            clearCache(statusbericht_geplante_arbeit);
        }

        return statusbericht_geplante_arbeit;
    }

    @Override
    public Statusbericht_geplante_arbeit updateImpl(
        de.hska.wi.awp.datasource.infosys.model.Statusbericht_geplante_arbeit statusbericht_geplante_arbeit)
        throws SystemException {
        statusbericht_geplante_arbeit = toUnwrappedModel(statusbericht_geplante_arbeit);

        boolean isNew = statusbericht_geplante_arbeit.isNew();

        Statusbericht_geplante_arbeitModelImpl statusbericht_geplante_arbeitModelImpl =
            (Statusbericht_geplante_arbeitModelImpl) statusbericht_geplante_arbeit;

        Session session = null;

        try {
            session = openSession();

            if (statusbericht_geplante_arbeit.isNew()) {
                session.save(statusbericht_geplante_arbeit);

                statusbericht_geplante_arbeit.setNew(false);
            } else {
                session.merge(statusbericht_geplante_arbeit);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew ||
                !Statusbericht_geplante_arbeitModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((statusbericht_geplante_arbeitModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUSBERICHT_ID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        statusbericht_geplante_arbeitModelImpl.getOriginalStatusbericht_id()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATUSBERICHT_ID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUSBERICHT_ID,
                    args);

                args = new Object[] {
                        statusbericht_geplante_arbeitModelImpl.getStatusbericht_id()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATUSBERICHT_ID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUSBERICHT_ID,
                    args);
            }
        }

        EntityCacheUtil.putResult(Statusbericht_geplante_arbeitModelImpl.ENTITY_CACHE_ENABLED,
            Statusbericht_geplante_arbeitImpl.class,
            statusbericht_geplante_arbeit.getPrimaryKey(),
            statusbericht_geplante_arbeit);

        return statusbericht_geplante_arbeit;
    }

    protected Statusbericht_geplante_arbeit toUnwrappedModel(
        Statusbericht_geplante_arbeit statusbericht_geplante_arbeit) {
        if (statusbericht_geplante_arbeit instanceof Statusbericht_geplante_arbeitImpl) {
            return statusbericht_geplante_arbeit;
        }

        Statusbericht_geplante_arbeitImpl statusbericht_geplante_arbeitImpl = new Statusbericht_geplante_arbeitImpl();

        statusbericht_geplante_arbeitImpl.setNew(statusbericht_geplante_arbeit.isNew());
        statusbericht_geplante_arbeitImpl.setPrimaryKey(statusbericht_geplante_arbeit.getPrimaryKey());

        statusbericht_geplante_arbeitImpl.setId(statusbericht_geplante_arbeit.getId());
        statusbericht_geplante_arbeitImpl.setAktivitaet(statusbericht_geplante_arbeit.getAktivitaet());
        statusbericht_geplante_arbeitImpl.setBis_wann(statusbericht_geplante_arbeit.getBis_wann());
        statusbericht_geplante_arbeitImpl.setStatusbericht_id(statusbericht_geplante_arbeit.getStatusbericht_id());
        statusbericht_geplante_arbeitImpl.setVerantwortlicher(statusbericht_geplante_arbeit.getVerantwortlicher());

        return statusbericht_geplante_arbeitImpl;
    }

    /**
     * Returns the statusbericht_geplante_arbeit with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the statusbericht_geplante_arbeit
     * @return the statusbericht_geplante_arbeit
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_geplante_arbeitException if a statusbericht_geplante_arbeit with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusbericht_geplante_arbeit findByPrimaryKey(
        Serializable primaryKey)
        throws NoSuchStatusbericht_geplante_arbeitException, SystemException {
        Statusbericht_geplante_arbeit statusbericht_geplante_arbeit = fetchByPrimaryKey(primaryKey);

        if (statusbericht_geplante_arbeit == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchStatusbericht_geplante_arbeitException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return statusbericht_geplante_arbeit;
    }

    /**
     * Returns the statusbericht_geplante_arbeit with the primary key or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_geplante_arbeitException} if it could not be found.
     *
     * @param id the primary key of the statusbericht_geplante_arbeit
     * @return the statusbericht_geplante_arbeit
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_geplante_arbeitException if a statusbericht_geplante_arbeit with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusbericht_geplante_arbeit findByPrimaryKey(long id)
        throws NoSuchStatusbericht_geplante_arbeitException, SystemException {
        return findByPrimaryKey((Serializable) id);
    }

    /**
     * Returns the statusbericht_geplante_arbeit with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the statusbericht_geplante_arbeit
     * @return the statusbericht_geplante_arbeit, or <code>null</code> if a statusbericht_geplante_arbeit with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusbericht_geplante_arbeit fetchByPrimaryKey(
        Serializable primaryKey) throws SystemException {
        Statusbericht_geplante_arbeit statusbericht_geplante_arbeit = (Statusbericht_geplante_arbeit) EntityCacheUtil.getResult(Statusbericht_geplante_arbeitModelImpl.ENTITY_CACHE_ENABLED,
                Statusbericht_geplante_arbeitImpl.class, primaryKey);

        if (statusbericht_geplante_arbeit == _nullStatusbericht_geplante_arbeit) {
            return null;
        }

        if (statusbericht_geplante_arbeit == null) {
            Session session = null;

            try {
                session = openSession();

                statusbericht_geplante_arbeit = (Statusbericht_geplante_arbeit) session.get(Statusbericht_geplante_arbeitImpl.class,
                        primaryKey);

                if (statusbericht_geplante_arbeit != null) {
                    cacheResult(statusbericht_geplante_arbeit);
                } else {
                    EntityCacheUtil.putResult(Statusbericht_geplante_arbeitModelImpl.ENTITY_CACHE_ENABLED,
                        Statusbericht_geplante_arbeitImpl.class, primaryKey,
                        _nullStatusbericht_geplante_arbeit);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(Statusbericht_geplante_arbeitModelImpl.ENTITY_CACHE_ENABLED,
                    Statusbericht_geplante_arbeitImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return statusbericht_geplante_arbeit;
    }

    /**
     * Returns the statusbericht_geplante_arbeit with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the statusbericht_geplante_arbeit
     * @return the statusbericht_geplante_arbeit, or <code>null</code> if a statusbericht_geplante_arbeit with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusbericht_geplante_arbeit fetchByPrimaryKey(long id)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) id);
    }

    /**
     * Returns all the statusbericht_geplante_arbeits.
     *
     * @return the statusbericht_geplante_arbeits
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Statusbericht_geplante_arbeit> findAll()
        throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the statusbericht_geplante_arbeits.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_geplante_arbeitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of statusbericht_geplante_arbeits
     * @param end the upper bound of the range of statusbericht_geplante_arbeits (not inclusive)
     * @return the range of statusbericht_geplante_arbeits
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Statusbericht_geplante_arbeit> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the statusbericht_geplante_arbeits.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_geplante_arbeitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of statusbericht_geplante_arbeits
     * @param end the upper bound of the range of statusbericht_geplante_arbeits (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of statusbericht_geplante_arbeits
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Statusbericht_geplante_arbeit> findAll(int start, int end,
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

        List<Statusbericht_geplante_arbeit> list = (List<Statusbericht_geplante_arbeit>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_STATUSBERICHT_GEPLANTE_ARBEIT);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_STATUSBERICHT_GEPLANTE_ARBEIT;

                if (pagination) {
                    sql = sql.concat(Statusbericht_geplante_arbeitModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Statusbericht_geplante_arbeit>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Statusbericht_geplante_arbeit>(list);
                } else {
                    list = (List<Statusbericht_geplante_arbeit>) QueryUtil.list(q,
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
     * Removes all the statusbericht_geplante_arbeits from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Statusbericht_geplante_arbeit statusbericht_geplante_arbeit : findAll()) {
            remove(statusbericht_geplante_arbeit);
        }
    }

    /**
     * Returns the number of statusbericht_geplante_arbeits.
     *
     * @return the number of statusbericht_geplante_arbeits
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

                Query q = session.createQuery(_SQL_COUNT_STATUSBERICHT_GEPLANTE_ARBEIT);

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
     * Initializes the statusbericht_geplante_arbeit persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.de.hska.wi.awp.datasource.infosys.model.Statusbericht_geplante_arbeit")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Statusbericht_geplante_arbeit>> listenersList =
                    new ArrayList<ModelListener<Statusbericht_geplante_arbeit>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Statusbericht_geplante_arbeit>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(Statusbericht_geplante_arbeitImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
