package de.hska.wi.awp.datasource.infosys.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
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
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_info_punktException;
import de.hska.wi.awp.datasource.infosys.model.Statusbericht_info_punkt;
import de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_info_punktImpl;
import de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_info_punktModelImpl;
import de.hska.wi.awp.datasource.infosys.service.persistence.Statusbericht_info_punktPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the statusbericht_info_punkt service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Daniel Storch
 * @see Statusbericht_info_punktPersistence
 * @see Statusbericht_info_punktUtil
 * @generated
 */
public class Statusbericht_info_punktPersistenceImpl extends BasePersistenceImpl<Statusbericht_info_punkt>
    implements Statusbericht_info_punktPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link Statusbericht_info_punktUtil} to access the statusbericht_info_punkt persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = Statusbericht_info_punktImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Statusbericht_info_punktModelImpl.ENTITY_CACHE_ENABLED,
            Statusbericht_info_punktModelImpl.FINDER_CACHE_ENABLED,
            Statusbericht_info_punktImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Statusbericht_info_punktModelImpl.ENTITY_CACHE_ENABLED,
            Statusbericht_info_punktModelImpl.FINDER_CACHE_ENABLED,
            Statusbericht_info_punktImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Statusbericht_info_punktModelImpl.ENTITY_CACHE_ENABLED,
            Statusbericht_info_punktModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_STATUSBERICHT_INFO_PUNKT = "SELECT statusbericht_info_punkt FROM Statusbericht_info_punkt statusbericht_info_punkt";
    private static final String _SQL_COUNT_STATUSBERICHT_INFO_PUNKT = "SELECT COUNT(statusbericht_info_punkt) FROM Statusbericht_info_punkt statusbericht_info_punkt";
    private static final String _ORDER_BY_ENTITY_ALIAS = "statusbericht_info_punkt.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Statusbericht_info_punkt exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(Statusbericht_info_punktPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "id"
            });
    private static Statusbericht_info_punkt _nullStatusbericht_info_punkt = new Statusbericht_info_punktImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Statusbericht_info_punkt> toCacheModel() {
                return _nullStatusbericht_info_punktCacheModel;
            }
        };

    private static CacheModel<Statusbericht_info_punkt> _nullStatusbericht_info_punktCacheModel =
        new CacheModel<Statusbericht_info_punkt>() {
            @Override
            public Statusbericht_info_punkt toEntityModel() {
                return _nullStatusbericht_info_punkt;
            }
        };

    public Statusbericht_info_punktPersistenceImpl() {
        setModelClass(Statusbericht_info_punkt.class);
    }

    /**
     * Caches the statusbericht_info_punkt in the entity cache if it is enabled.
     *
     * @param statusbericht_info_punkt the statusbericht_info_punkt
     */
    @Override
    public void cacheResult(Statusbericht_info_punkt statusbericht_info_punkt) {
        EntityCacheUtil.putResult(Statusbericht_info_punktModelImpl.ENTITY_CACHE_ENABLED,
            Statusbericht_info_punktImpl.class,
            statusbericht_info_punkt.getPrimaryKey(), statusbericht_info_punkt);

        statusbericht_info_punkt.resetOriginalValues();
    }

    /**
     * Caches the statusbericht_info_punkts in the entity cache if it is enabled.
     *
     * @param statusbericht_info_punkts the statusbericht_info_punkts
     */
    @Override
    public void cacheResult(
        List<Statusbericht_info_punkt> statusbericht_info_punkts) {
        for (Statusbericht_info_punkt statusbericht_info_punkt : statusbericht_info_punkts) {
            if (EntityCacheUtil.getResult(
                        Statusbericht_info_punktModelImpl.ENTITY_CACHE_ENABLED,
                        Statusbericht_info_punktImpl.class,
                        statusbericht_info_punkt.getPrimaryKey()) == null) {
                cacheResult(statusbericht_info_punkt);
            } else {
                statusbericht_info_punkt.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all statusbericht_info_punkts.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(Statusbericht_info_punktImpl.class.getName());
        }

        EntityCacheUtil.clearCache(Statusbericht_info_punktImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the statusbericht_info_punkt.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Statusbericht_info_punkt statusbericht_info_punkt) {
        EntityCacheUtil.removeResult(Statusbericht_info_punktModelImpl.ENTITY_CACHE_ENABLED,
            Statusbericht_info_punktImpl.class,
            statusbericht_info_punkt.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(
        List<Statusbericht_info_punkt> statusbericht_info_punkts) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Statusbericht_info_punkt statusbericht_info_punkt : statusbericht_info_punkts) {
            EntityCacheUtil.removeResult(Statusbericht_info_punktModelImpl.ENTITY_CACHE_ENABLED,
                Statusbericht_info_punktImpl.class,
                statusbericht_info_punkt.getPrimaryKey());
        }
    }

    /**
     * Creates a new statusbericht_info_punkt with the primary key. Does not add the statusbericht_info_punkt to the database.
     *
     * @param id the primary key for the new statusbericht_info_punkt
     * @return the new statusbericht_info_punkt
     */
    @Override
    public Statusbericht_info_punkt create(long id) {
        Statusbericht_info_punkt statusbericht_info_punkt = new Statusbericht_info_punktImpl();

        statusbericht_info_punkt.setNew(true);
        statusbericht_info_punkt.setPrimaryKey(id);

        return statusbericht_info_punkt;
    }

    /**
     * Removes the statusbericht_info_punkt with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the statusbericht_info_punkt
     * @return the statusbericht_info_punkt that was removed
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_info_punktException if a statusbericht_info_punkt with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusbericht_info_punkt remove(long id)
        throws NoSuchStatusbericht_info_punktException, SystemException {
        return remove((Serializable) id);
    }

    /**
     * Removes the statusbericht_info_punkt with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the statusbericht_info_punkt
     * @return the statusbericht_info_punkt that was removed
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_info_punktException if a statusbericht_info_punkt with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusbericht_info_punkt remove(Serializable primaryKey)
        throws NoSuchStatusbericht_info_punktException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Statusbericht_info_punkt statusbericht_info_punkt = (Statusbericht_info_punkt) session.get(Statusbericht_info_punktImpl.class,
                    primaryKey);

            if (statusbericht_info_punkt == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchStatusbericht_info_punktException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(statusbericht_info_punkt);
        } catch (NoSuchStatusbericht_info_punktException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Statusbericht_info_punkt removeImpl(
        Statusbericht_info_punkt statusbericht_info_punkt)
        throws SystemException {
        statusbericht_info_punkt = toUnwrappedModel(statusbericht_info_punkt);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(statusbericht_info_punkt)) {
                statusbericht_info_punkt = (Statusbericht_info_punkt) session.get(Statusbericht_info_punktImpl.class,
                        statusbericht_info_punkt.getPrimaryKeyObj());
            }

            if (statusbericht_info_punkt != null) {
                session.delete(statusbericht_info_punkt);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (statusbericht_info_punkt != null) {
            clearCache(statusbericht_info_punkt);
        }

        return statusbericht_info_punkt;
    }

    @Override
    public Statusbericht_info_punkt updateImpl(
        de.hska.wi.awp.datasource.infosys.model.Statusbericht_info_punkt statusbericht_info_punkt)
        throws SystemException {
        statusbericht_info_punkt = toUnwrappedModel(statusbericht_info_punkt);

        boolean isNew = statusbericht_info_punkt.isNew();

        Session session = null;

        try {
            session = openSession();

            if (statusbericht_info_punkt.isNew()) {
                session.save(statusbericht_info_punkt);

                statusbericht_info_punkt.setNew(false);
            } else {
                session.merge(statusbericht_info_punkt);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(Statusbericht_info_punktModelImpl.ENTITY_CACHE_ENABLED,
            Statusbericht_info_punktImpl.class,
            statusbericht_info_punkt.getPrimaryKey(), statusbericht_info_punkt);

        return statusbericht_info_punkt;
    }

    protected Statusbericht_info_punkt toUnwrappedModel(
        Statusbericht_info_punkt statusbericht_info_punkt) {
        if (statusbericht_info_punkt instanceof Statusbericht_info_punktImpl) {
            return statusbericht_info_punkt;
        }

        Statusbericht_info_punktImpl statusbericht_info_punktImpl = new Statusbericht_info_punktImpl();

        statusbericht_info_punktImpl.setNew(statusbericht_info_punkt.isNew());
        statusbericht_info_punktImpl.setPrimaryKey(statusbericht_info_punkt.getPrimaryKey());

        statusbericht_info_punktImpl.setId(statusbericht_info_punkt.getId());
        statusbericht_info_punktImpl.setName(statusbericht_info_punkt.getName());

        return statusbericht_info_punktImpl;
    }

    /**
     * Returns the statusbericht_info_punkt with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the statusbericht_info_punkt
     * @return the statusbericht_info_punkt
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_info_punktException if a statusbericht_info_punkt with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusbericht_info_punkt findByPrimaryKey(Serializable primaryKey)
        throws NoSuchStatusbericht_info_punktException, SystemException {
        Statusbericht_info_punkt statusbericht_info_punkt = fetchByPrimaryKey(primaryKey);

        if (statusbericht_info_punkt == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchStatusbericht_info_punktException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return statusbericht_info_punkt;
    }

    /**
     * Returns the statusbericht_info_punkt with the primary key or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_info_punktException} if it could not be found.
     *
     * @param id the primary key of the statusbericht_info_punkt
     * @return the statusbericht_info_punkt
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_info_punktException if a statusbericht_info_punkt with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusbericht_info_punkt findByPrimaryKey(long id)
        throws NoSuchStatusbericht_info_punktException, SystemException {
        return findByPrimaryKey((Serializable) id);
    }

    /**
     * Returns the statusbericht_info_punkt with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the statusbericht_info_punkt
     * @return the statusbericht_info_punkt, or <code>null</code> if a statusbericht_info_punkt with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusbericht_info_punkt fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Statusbericht_info_punkt statusbericht_info_punkt = (Statusbericht_info_punkt) EntityCacheUtil.getResult(Statusbericht_info_punktModelImpl.ENTITY_CACHE_ENABLED,
                Statusbericht_info_punktImpl.class, primaryKey);

        if (statusbericht_info_punkt == _nullStatusbericht_info_punkt) {
            return null;
        }

        if (statusbericht_info_punkt == null) {
            Session session = null;

            try {
                session = openSession();

                statusbericht_info_punkt = (Statusbericht_info_punkt) session.get(Statusbericht_info_punktImpl.class,
                        primaryKey);

                if (statusbericht_info_punkt != null) {
                    cacheResult(statusbericht_info_punkt);
                } else {
                    EntityCacheUtil.putResult(Statusbericht_info_punktModelImpl.ENTITY_CACHE_ENABLED,
                        Statusbericht_info_punktImpl.class, primaryKey,
                        _nullStatusbericht_info_punkt);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(Statusbericht_info_punktModelImpl.ENTITY_CACHE_ENABLED,
                    Statusbericht_info_punktImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return statusbericht_info_punkt;
    }

    /**
     * Returns the statusbericht_info_punkt with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the statusbericht_info_punkt
     * @return the statusbericht_info_punkt, or <code>null</code> if a statusbericht_info_punkt with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusbericht_info_punkt fetchByPrimaryKey(long id)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) id);
    }

    /**
     * Returns all the statusbericht_info_punkts.
     *
     * @return the statusbericht_info_punkts
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Statusbericht_info_punkt> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the statusbericht_info_punkts.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_info_punktModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of statusbericht_info_punkts
     * @param end the upper bound of the range of statusbericht_info_punkts (not inclusive)
     * @return the range of statusbericht_info_punkts
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Statusbericht_info_punkt> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the statusbericht_info_punkts.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_info_punktModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of statusbericht_info_punkts
     * @param end the upper bound of the range of statusbericht_info_punkts (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of statusbericht_info_punkts
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Statusbericht_info_punkt> findAll(int start, int end,
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

        List<Statusbericht_info_punkt> list = (List<Statusbericht_info_punkt>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_STATUSBERICHT_INFO_PUNKT);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_STATUSBERICHT_INFO_PUNKT;

                if (pagination) {
                    sql = sql.concat(Statusbericht_info_punktModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Statusbericht_info_punkt>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Statusbericht_info_punkt>(list);
                } else {
                    list = (List<Statusbericht_info_punkt>) QueryUtil.list(q,
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
     * Removes all the statusbericht_info_punkts from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Statusbericht_info_punkt statusbericht_info_punkt : findAll()) {
            remove(statusbericht_info_punkt);
        }
    }

    /**
     * Returns the number of statusbericht_info_punkts.
     *
     * @return the number of statusbericht_info_punkts
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

                Query q = session.createQuery(_SQL_COUNT_STATUSBERICHT_INFO_PUNKT);

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
     * Initializes the statusbericht_info_punkt persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.de.hska.wi.awp.datasource.infosys.model.Statusbericht_info_punkt")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Statusbericht_info_punkt>> listenersList = new ArrayList<ModelListener<Statusbericht_info_punkt>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Statusbericht_info_punkt>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(Statusbericht_info_punktImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
