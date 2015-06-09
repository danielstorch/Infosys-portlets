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

import de.hska.wi.awp.datasource.infosys.NoSuchAllgemeinesException;
import de.hska.wi.awp.datasource.infosys.model.Allgemeines;
import de.hska.wi.awp.datasource.infosys.model.impl.AllgemeinesImpl;
import de.hska.wi.awp.datasource.infosys.model.impl.AllgemeinesModelImpl;
import de.hska.wi.awp.datasource.infosys.service.persistence.AllgemeinesPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the allgemeines service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Daniel Storch
 * @see AllgemeinesPersistence
 * @see AllgemeinesUtil
 * @generated
 */
public class AllgemeinesPersistenceImpl extends BasePersistenceImpl<Allgemeines>
    implements AllgemeinesPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link AllgemeinesUtil} to access the allgemeines persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = AllgemeinesImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AllgemeinesModelImpl.ENTITY_CACHE_ENABLED,
            AllgemeinesModelImpl.FINDER_CACHE_ENABLED, AllgemeinesImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AllgemeinesModelImpl.ENTITY_CACHE_ENABLED,
            AllgemeinesModelImpl.FINDER_CACHE_ENABLED, AllgemeinesImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AllgemeinesModelImpl.ENTITY_CACHE_ENABLED,
            AllgemeinesModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_ALLGEMEINES = "SELECT allgemeines FROM Allgemeines allgemeines";
    private static final String _SQL_COUNT_ALLGEMEINES = "SELECT COUNT(allgemeines) FROM Allgemeines allgemeines";
    private static final String _ORDER_BY_ENTITY_ALIAS = "allgemeines.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Allgemeines exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(AllgemeinesPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "id"
            });
    private static Allgemeines _nullAllgemeines = new AllgemeinesImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Allgemeines> toCacheModel() {
                return _nullAllgemeinesCacheModel;
            }
        };

    private static CacheModel<Allgemeines> _nullAllgemeinesCacheModel = new CacheModel<Allgemeines>() {
            @Override
            public Allgemeines toEntityModel() {
                return _nullAllgemeines;
            }
        };

    public AllgemeinesPersistenceImpl() {
        setModelClass(Allgemeines.class);
    }

    /**
     * Caches the allgemeines in the entity cache if it is enabled.
     *
     * @param allgemeines the allgemeines
     */
    @Override
    public void cacheResult(Allgemeines allgemeines) {
        EntityCacheUtil.putResult(AllgemeinesModelImpl.ENTITY_CACHE_ENABLED,
            AllgemeinesImpl.class, allgemeines.getPrimaryKey(), allgemeines);

        allgemeines.resetOriginalValues();
    }

    /**
     * Caches the allgemeineses in the entity cache if it is enabled.
     *
     * @param allgemeineses the allgemeineses
     */
    @Override
    public void cacheResult(List<Allgemeines> allgemeineses) {
        for (Allgemeines allgemeines : allgemeineses) {
            if (EntityCacheUtil.getResult(
                        AllgemeinesModelImpl.ENTITY_CACHE_ENABLED,
                        AllgemeinesImpl.class, allgemeines.getPrimaryKey()) == null) {
                cacheResult(allgemeines);
            } else {
                allgemeines.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all allgemeineses.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(AllgemeinesImpl.class.getName());
        }

        EntityCacheUtil.clearCache(AllgemeinesImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the allgemeines.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Allgemeines allgemeines) {
        EntityCacheUtil.removeResult(AllgemeinesModelImpl.ENTITY_CACHE_ENABLED,
            AllgemeinesImpl.class, allgemeines.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Allgemeines> allgemeineses) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Allgemeines allgemeines : allgemeineses) {
            EntityCacheUtil.removeResult(AllgemeinesModelImpl.ENTITY_CACHE_ENABLED,
                AllgemeinesImpl.class, allgemeines.getPrimaryKey());
        }
    }

    /**
     * Creates a new allgemeines with the primary key. Does not add the allgemeines to the database.
     *
     * @param id the primary key for the new allgemeines
     * @return the new allgemeines
     */
    @Override
    public Allgemeines create(long id) {
        Allgemeines allgemeines = new AllgemeinesImpl();

        allgemeines.setNew(true);
        allgemeines.setPrimaryKey(id);

        return allgemeines;
    }

    /**
     * Removes the allgemeines with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the allgemeines
     * @return the allgemeines that was removed
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchAllgemeinesException if a allgemeines with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Allgemeines remove(long id)
        throws NoSuchAllgemeinesException, SystemException {
        return remove((Serializable) id);
    }

    /**
     * Removes the allgemeines with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the allgemeines
     * @return the allgemeines that was removed
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchAllgemeinesException if a allgemeines with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Allgemeines remove(Serializable primaryKey)
        throws NoSuchAllgemeinesException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Allgemeines allgemeines = (Allgemeines) session.get(AllgemeinesImpl.class,
                    primaryKey);

            if (allgemeines == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchAllgemeinesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(allgemeines);
        } catch (NoSuchAllgemeinesException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Allgemeines removeImpl(Allgemeines allgemeines)
        throws SystemException {
        allgemeines = toUnwrappedModel(allgemeines);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(allgemeines)) {
                allgemeines = (Allgemeines) session.get(AllgemeinesImpl.class,
                        allgemeines.getPrimaryKeyObj());
            }

            if (allgemeines != null) {
                session.delete(allgemeines);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (allgemeines != null) {
            clearCache(allgemeines);
        }

        return allgemeines;
    }

    @Override
    public Allgemeines updateImpl(
        de.hska.wi.awp.datasource.infosys.model.Allgemeines allgemeines)
        throws SystemException {
        allgemeines = toUnwrappedModel(allgemeines);

        boolean isNew = allgemeines.isNew();

        Session session = null;

        try {
            session = openSession();

            if (allgemeines.isNew()) {
                session.save(allgemeines);

                allgemeines.setNew(false);
            } else {
                session.merge(allgemeines);
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

        EntityCacheUtil.putResult(AllgemeinesModelImpl.ENTITY_CACHE_ENABLED,
            AllgemeinesImpl.class, allgemeines.getPrimaryKey(), allgemeines);

        return allgemeines;
    }

    protected Allgemeines toUnwrappedModel(Allgemeines allgemeines) {
        if (allgemeines instanceof AllgemeinesImpl) {
            return allgemeines;
        }

        AllgemeinesImpl allgemeinesImpl = new AllgemeinesImpl();

        allgemeinesImpl.setNew(allgemeines.isNew());
        allgemeinesImpl.setPrimaryKey(allgemeines.getPrimaryKey());

        allgemeinesImpl.setId(allgemeines.getId());
        allgemeinesImpl.setStatusbricht_id(allgemeines.getStatusbricht_id());
        allgemeinesImpl.setProbleme_risiken(allgemeines.getProbleme_risiken());
        allgemeinesImpl.setMassnahmen(allgemeines.getMassnahmen());
        allgemeinesImpl.setSituation(allgemeines.getSituation());
        allgemeinesImpl.setGruende(allgemeines.getGruende());

        return allgemeinesImpl;
    }

    /**
     * Returns the allgemeines with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the allgemeines
     * @return the allgemeines
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchAllgemeinesException if a allgemeines with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Allgemeines findByPrimaryKey(Serializable primaryKey)
        throws NoSuchAllgemeinesException, SystemException {
        Allgemeines allgemeines = fetchByPrimaryKey(primaryKey);

        if (allgemeines == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchAllgemeinesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return allgemeines;
    }

    /**
     * Returns the allgemeines with the primary key or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchAllgemeinesException} if it could not be found.
     *
     * @param id the primary key of the allgemeines
     * @return the allgemeines
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchAllgemeinesException if a allgemeines with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Allgemeines findByPrimaryKey(long id)
        throws NoSuchAllgemeinesException, SystemException {
        return findByPrimaryKey((Serializable) id);
    }

    /**
     * Returns the allgemeines with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the allgemeines
     * @return the allgemeines, or <code>null</code> if a allgemeines with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Allgemeines fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Allgemeines allgemeines = (Allgemeines) EntityCacheUtil.getResult(AllgemeinesModelImpl.ENTITY_CACHE_ENABLED,
                AllgemeinesImpl.class, primaryKey);

        if (allgemeines == _nullAllgemeines) {
            return null;
        }

        if (allgemeines == null) {
            Session session = null;

            try {
                session = openSession();

                allgemeines = (Allgemeines) session.get(AllgemeinesImpl.class,
                        primaryKey);

                if (allgemeines != null) {
                    cacheResult(allgemeines);
                } else {
                    EntityCacheUtil.putResult(AllgemeinesModelImpl.ENTITY_CACHE_ENABLED,
                        AllgemeinesImpl.class, primaryKey, _nullAllgemeines);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(AllgemeinesModelImpl.ENTITY_CACHE_ENABLED,
                    AllgemeinesImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return allgemeines;
    }

    /**
     * Returns the allgemeines with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the allgemeines
     * @return the allgemeines, or <code>null</code> if a allgemeines with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Allgemeines fetchByPrimaryKey(long id) throws SystemException {
        return fetchByPrimaryKey((Serializable) id);
    }

    /**
     * Returns all the allgemeineses.
     *
     * @return the allgemeineses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Allgemeines> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the allgemeineses.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.AllgemeinesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of allgemeineses
     * @param end the upper bound of the range of allgemeineses (not inclusive)
     * @return the range of allgemeineses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Allgemeines> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the allgemeineses.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.AllgemeinesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of allgemeineses
     * @param end the upper bound of the range of allgemeineses (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of allgemeineses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Allgemeines> findAll(int start, int end,
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

        List<Allgemeines> list = (List<Allgemeines>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ALLGEMEINES);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ALLGEMEINES;

                if (pagination) {
                    sql = sql.concat(AllgemeinesModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Allgemeines>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Allgemeines>(list);
                } else {
                    list = (List<Allgemeines>) QueryUtil.list(q, getDialect(),
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
     * Removes all the allgemeineses from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Allgemeines allgemeines : findAll()) {
            remove(allgemeines);
        }
    }

    /**
     * Returns the number of allgemeineses.
     *
     * @return the number of allgemeineses
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

                Query q = session.createQuery(_SQL_COUNT_ALLGEMEINES);

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
     * Initializes the allgemeines persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.de.hska.wi.awp.datasource.infosys.model.Allgemeines")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Allgemeines>> listenersList = new ArrayList<ModelListener<Allgemeines>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Allgemeines>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(AllgemeinesImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
