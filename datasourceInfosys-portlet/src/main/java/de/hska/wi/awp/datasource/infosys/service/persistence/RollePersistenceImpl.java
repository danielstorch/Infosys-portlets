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

import de.hska.wi.awp.datasource.infosys.NoSuchRolleException;
import de.hska.wi.awp.datasource.infosys.model.Rolle;
import de.hska.wi.awp.datasource.infosys.model.impl.RolleImpl;
import de.hska.wi.awp.datasource.infosys.model.impl.RolleModelImpl;
import de.hska.wi.awp.datasource.infosys.service.persistence.RollePersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the rolle service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Daniel Storch
 * @see RollePersistence
 * @see RolleUtil
 * @generated
 */
public class RollePersistenceImpl extends BasePersistenceImpl<Rolle>
    implements RollePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link RolleUtil} to access the rolle persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = RolleImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RolleModelImpl.ENTITY_CACHE_ENABLED,
            RolleModelImpl.FINDER_CACHE_ENABLED, RolleImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RolleModelImpl.ENTITY_CACHE_ENABLED,
            RolleModelImpl.FINDER_CACHE_ENABLED, RolleImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RolleModelImpl.ENTITY_CACHE_ENABLED,
            RolleModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_ROLLE = "SELECT rolle FROM Rolle rolle";
    private static final String _SQL_COUNT_ROLLE = "SELECT COUNT(rolle) FROM Rolle rolle";
    private static final String _ORDER_BY_ENTITY_ALIAS = "rolle.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Rolle exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(RollePersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "id"
            });
    private static Rolle _nullRolle = new RolleImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Rolle> toCacheModel() {
                return _nullRolleCacheModel;
            }
        };

    private static CacheModel<Rolle> _nullRolleCacheModel = new CacheModel<Rolle>() {
            @Override
            public Rolle toEntityModel() {
                return _nullRolle;
            }
        };

    public RollePersistenceImpl() {
        setModelClass(Rolle.class);
    }

    /**
     * Caches the rolle in the entity cache if it is enabled.
     *
     * @param rolle the rolle
     */
    @Override
    public void cacheResult(Rolle rolle) {
        EntityCacheUtil.putResult(RolleModelImpl.ENTITY_CACHE_ENABLED,
            RolleImpl.class, rolle.getPrimaryKey(), rolle);

        rolle.resetOriginalValues();
    }

    /**
     * Caches the rolles in the entity cache if it is enabled.
     *
     * @param rolles the rolles
     */
    @Override
    public void cacheResult(List<Rolle> rolles) {
        for (Rolle rolle : rolles) {
            if (EntityCacheUtil.getResult(RolleModelImpl.ENTITY_CACHE_ENABLED,
                        RolleImpl.class, rolle.getPrimaryKey()) == null) {
                cacheResult(rolle);
            } else {
                rolle.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all rolles.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(RolleImpl.class.getName());
        }

        EntityCacheUtil.clearCache(RolleImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the rolle.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Rolle rolle) {
        EntityCacheUtil.removeResult(RolleModelImpl.ENTITY_CACHE_ENABLED,
            RolleImpl.class, rolle.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Rolle> rolles) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Rolle rolle : rolles) {
            EntityCacheUtil.removeResult(RolleModelImpl.ENTITY_CACHE_ENABLED,
                RolleImpl.class, rolle.getPrimaryKey());
        }
    }

    /**
     * Creates a new rolle with the primary key. Does not add the rolle to the database.
     *
     * @param id the primary key for the new rolle
     * @return the new rolle
     */
    @Override
    public Rolle create(long id) {
        Rolle rolle = new RolleImpl();

        rolle.setNew(true);
        rolle.setPrimaryKey(id);

        return rolle;
    }

    /**
     * Removes the rolle with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the rolle
     * @return the rolle that was removed
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchRolleException if a rolle with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Rolle remove(long id) throws NoSuchRolleException, SystemException {
        return remove((Serializable) id);
    }

    /**
     * Removes the rolle with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the rolle
     * @return the rolle that was removed
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchRolleException if a rolle with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Rolle remove(Serializable primaryKey)
        throws NoSuchRolleException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Rolle rolle = (Rolle) session.get(RolleImpl.class, primaryKey);

            if (rolle == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchRolleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(rolle);
        } catch (NoSuchRolleException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Rolle removeImpl(Rolle rolle) throws SystemException {
        rolle = toUnwrappedModel(rolle);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(rolle)) {
                rolle = (Rolle) session.get(RolleImpl.class,
                        rolle.getPrimaryKeyObj());
            }

            if (rolle != null) {
                session.delete(rolle);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (rolle != null) {
            clearCache(rolle);
        }

        return rolle;
    }

    @Override
    public Rolle updateImpl(de.hska.wi.awp.datasource.infosys.model.Rolle rolle)
        throws SystemException {
        rolle = toUnwrappedModel(rolle);

        boolean isNew = rolle.isNew();

        Session session = null;

        try {
            session = openSession();

            if (rolle.isNew()) {
                session.save(rolle);

                rolle.setNew(false);
            } else {
                session.merge(rolle);
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

        EntityCacheUtil.putResult(RolleModelImpl.ENTITY_CACHE_ENABLED,
            RolleImpl.class, rolle.getPrimaryKey(), rolle);

        return rolle;
    }

    protected Rolle toUnwrappedModel(Rolle rolle) {
        if (rolle instanceof RolleImpl) {
            return rolle;
        }

        RolleImpl rolleImpl = new RolleImpl();

        rolleImpl.setNew(rolle.isNew());
        rolleImpl.setPrimaryKey(rolle.getPrimaryKey());

        rolleImpl.setId(rolle.getId());
        rolleImpl.setShortName(rolle.getShortName());
        rolleImpl.setName(rolle.getName());

        return rolleImpl;
    }

    /**
     * Returns the rolle with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the rolle
     * @return the rolle
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchRolleException if a rolle with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Rolle findByPrimaryKey(Serializable primaryKey)
        throws NoSuchRolleException, SystemException {
        Rolle rolle = fetchByPrimaryKey(primaryKey);

        if (rolle == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchRolleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return rolle;
    }

    /**
     * Returns the rolle with the primary key or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchRolleException} if it could not be found.
     *
     * @param id the primary key of the rolle
     * @return the rolle
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchRolleException if a rolle with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Rolle findByPrimaryKey(long id)
        throws NoSuchRolleException, SystemException {
        return findByPrimaryKey((Serializable) id);
    }

    /**
     * Returns the rolle with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the rolle
     * @return the rolle, or <code>null</code> if a rolle with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Rolle fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Rolle rolle = (Rolle) EntityCacheUtil.getResult(RolleModelImpl.ENTITY_CACHE_ENABLED,
                RolleImpl.class, primaryKey);

        if (rolle == _nullRolle) {
            return null;
        }

        if (rolle == null) {
            Session session = null;

            try {
                session = openSession();

                rolle = (Rolle) session.get(RolleImpl.class, primaryKey);

                if (rolle != null) {
                    cacheResult(rolle);
                } else {
                    EntityCacheUtil.putResult(RolleModelImpl.ENTITY_CACHE_ENABLED,
                        RolleImpl.class, primaryKey, _nullRolle);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(RolleModelImpl.ENTITY_CACHE_ENABLED,
                    RolleImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return rolle;
    }

    /**
     * Returns the rolle with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the rolle
     * @return the rolle, or <code>null</code> if a rolle with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Rolle fetchByPrimaryKey(long id) throws SystemException {
        return fetchByPrimaryKey((Serializable) id);
    }

    /**
     * Returns all the rolles.
     *
     * @return the rolles
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Rolle> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the rolles.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.RolleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of rolles
     * @param end the upper bound of the range of rolles (not inclusive)
     * @return the range of rolles
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Rolle> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the rolles.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.RolleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of rolles
     * @param end the upper bound of the range of rolles (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of rolles
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Rolle> findAll(int start, int end,
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

        List<Rolle> list = (List<Rolle>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ROLLE);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ROLLE;

                if (pagination) {
                    sql = sql.concat(RolleModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Rolle>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Rolle>(list);
                } else {
                    list = (List<Rolle>) QueryUtil.list(q, getDialect(), start,
                            end);
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
     * Removes all the rolles from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Rolle rolle : findAll()) {
            remove(rolle);
        }
    }

    /**
     * Returns the number of rolles.
     *
     * @return the number of rolles
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

                Query q = session.createQuery(_SQL_COUNT_ROLLE);

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
     * Initializes the rolle persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.de.hska.wi.awp.datasource.infosys.model.Rolle")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Rolle>> listenersList = new ArrayList<ModelListener<Rolle>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Rolle>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(RolleImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
