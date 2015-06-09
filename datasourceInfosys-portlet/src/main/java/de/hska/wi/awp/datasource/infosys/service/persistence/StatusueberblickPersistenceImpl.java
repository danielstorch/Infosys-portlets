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

import de.hska.wi.awp.datasource.infosys.NoSuchStatusueberblickException;
import de.hska.wi.awp.datasource.infosys.model.Statusueberblick;
import de.hska.wi.awp.datasource.infosys.model.impl.StatusueberblickImpl;
import de.hska.wi.awp.datasource.infosys.model.impl.StatusueberblickModelImpl;
import de.hska.wi.awp.datasource.infosys.service.persistence.StatusueberblickPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the statusueberblick service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Daniel Storch
 * @see StatusueberblickPersistence
 * @see StatusueberblickUtil
 * @generated
 */
public class StatusueberblickPersistenceImpl extends BasePersistenceImpl<Statusueberblick>
    implements StatusueberblickPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link StatusueberblickUtil} to access the statusueberblick persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = StatusueberblickImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(StatusueberblickModelImpl.ENTITY_CACHE_ENABLED,
            StatusueberblickModelImpl.FINDER_CACHE_ENABLED,
            StatusueberblickImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(StatusueberblickModelImpl.ENTITY_CACHE_ENABLED,
            StatusueberblickModelImpl.FINDER_CACHE_ENABLED,
            StatusueberblickImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(StatusueberblickModelImpl.ENTITY_CACHE_ENABLED,
            StatusueberblickModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_STATUSUEBERBLICK = "SELECT statusueberblick FROM Statusueberblick statusueberblick";
    private static final String _SQL_COUNT_STATUSUEBERBLICK = "SELECT COUNT(statusueberblick) FROM Statusueberblick statusueberblick";
    private static final String _ORDER_BY_ENTITY_ALIAS = "statusueberblick.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Statusueberblick exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(StatusueberblickPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "id"
            });
    private static Statusueberblick _nullStatusueberblick = new StatusueberblickImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Statusueberblick> toCacheModel() {
                return _nullStatusueberblickCacheModel;
            }
        };

    private static CacheModel<Statusueberblick> _nullStatusueberblickCacheModel = new CacheModel<Statusueberblick>() {
            @Override
            public Statusueberblick toEntityModel() {
                return _nullStatusueberblick;
            }
        };

    public StatusueberblickPersistenceImpl() {
        setModelClass(Statusueberblick.class);
    }

    /**
     * Caches the statusueberblick in the entity cache if it is enabled.
     *
     * @param statusueberblick the statusueberblick
     */
    @Override
    public void cacheResult(Statusueberblick statusueberblick) {
        EntityCacheUtil.putResult(StatusueberblickModelImpl.ENTITY_CACHE_ENABLED,
            StatusueberblickImpl.class, statusueberblick.getPrimaryKey(),
            statusueberblick);

        statusueberblick.resetOriginalValues();
    }

    /**
     * Caches the statusueberblicks in the entity cache if it is enabled.
     *
     * @param statusueberblicks the statusueberblicks
     */
    @Override
    public void cacheResult(List<Statusueberblick> statusueberblicks) {
        for (Statusueberblick statusueberblick : statusueberblicks) {
            if (EntityCacheUtil.getResult(
                        StatusueberblickModelImpl.ENTITY_CACHE_ENABLED,
                        StatusueberblickImpl.class,
                        statusueberblick.getPrimaryKey()) == null) {
                cacheResult(statusueberblick);
            } else {
                statusueberblick.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all statusueberblicks.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(StatusueberblickImpl.class.getName());
        }

        EntityCacheUtil.clearCache(StatusueberblickImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the statusueberblick.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Statusueberblick statusueberblick) {
        EntityCacheUtil.removeResult(StatusueberblickModelImpl.ENTITY_CACHE_ENABLED,
            StatusueberblickImpl.class, statusueberblick.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Statusueberblick> statusueberblicks) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Statusueberblick statusueberblick : statusueberblicks) {
            EntityCacheUtil.removeResult(StatusueberblickModelImpl.ENTITY_CACHE_ENABLED,
                StatusueberblickImpl.class, statusueberblick.getPrimaryKey());
        }
    }

    /**
     * Creates a new statusueberblick with the primary key. Does not add the statusueberblick to the database.
     *
     * @param id the primary key for the new statusueberblick
     * @return the new statusueberblick
     */
    @Override
    public Statusueberblick create(long id) {
        Statusueberblick statusueberblick = new StatusueberblickImpl();

        statusueberblick.setNew(true);
        statusueberblick.setPrimaryKey(id);

        return statusueberblick;
    }

    /**
     * Removes the statusueberblick with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the statusueberblick
     * @return the statusueberblick that was removed
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusueberblickException if a statusueberblick with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusueberblick remove(long id)
        throws NoSuchStatusueberblickException, SystemException {
        return remove((Serializable) id);
    }

    /**
     * Removes the statusueberblick with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the statusueberblick
     * @return the statusueberblick that was removed
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusueberblickException if a statusueberblick with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusueberblick remove(Serializable primaryKey)
        throws NoSuchStatusueberblickException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Statusueberblick statusueberblick = (Statusueberblick) session.get(StatusueberblickImpl.class,
                    primaryKey);

            if (statusueberblick == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchStatusueberblickException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(statusueberblick);
        } catch (NoSuchStatusueberblickException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Statusueberblick removeImpl(Statusueberblick statusueberblick)
        throws SystemException {
        statusueberblick = toUnwrappedModel(statusueberblick);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(statusueberblick)) {
                statusueberblick = (Statusueberblick) session.get(StatusueberblickImpl.class,
                        statusueberblick.getPrimaryKeyObj());
            }

            if (statusueberblick != null) {
                session.delete(statusueberblick);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (statusueberblick != null) {
            clearCache(statusueberblick);
        }

        return statusueberblick;
    }

    @Override
    public Statusueberblick updateImpl(
        de.hska.wi.awp.datasource.infosys.model.Statusueberblick statusueberblick)
        throws SystemException {
        statusueberblick = toUnwrappedModel(statusueberblick);

        boolean isNew = statusueberblick.isNew();

        Session session = null;

        try {
            session = openSession();

            if (statusueberblick.isNew()) {
                session.save(statusueberblick);

                statusueberblick.setNew(false);
            } else {
                session.merge(statusueberblick);
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

        EntityCacheUtil.putResult(StatusueberblickModelImpl.ENTITY_CACHE_ENABLED,
            StatusueberblickImpl.class, statusueberblick.getPrimaryKey(),
            statusueberblick);

        return statusueberblick;
    }

    protected Statusueberblick toUnwrappedModel(
        Statusueberblick statusueberblick) {
        if (statusueberblick instanceof StatusueberblickImpl) {
            return statusueberblick;
        }

        StatusueberblickImpl statusueberblickImpl = new StatusueberblickImpl();

        statusueberblickImpl.setNew(statusueberblick.isNew());
        statusueberblickImpl.setPrimaryKey(statusueberblick.getPrimaryKey());

        statusueberblickImpl.setId(statusueberblick.getId());
        statusueberblickImpl.setStatusbericht_id(statusueberblick.getStatusbericht_id());
        statusueberblickImpl.setQualitaet_status(statusueberblick.getQualitaet_status());
        statusueberblickImpl.setQualitaet_text(statusueberblick.getQualitaet_text());
        statusueberblickImpl.setKosten_text(statusueberblick.getKosten_text());
        statusueberblickImpl.setKosten_status(statusueberblick.getKosten_status());
        statusueberblickImpl.setAufwand_status(statusueberblick.getAufwand_status());
        statusueberblickImpl.setAufwand_text(statusueberblick.getAufwand_text());
        statusueberblickImpl.setTermine_status(statusueberblick.getTermine_status());
        statusueberblickImpl.setTermine_text(statusueberblick.getTermine_text());

        return statusueberblickImpl;
    }

    /**
     * Returns the statusueberblick with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the statusueberblick
     * @return the statusueberblick
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusueberblickException if a statusueberblick with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusueberblick findByPrimaryKey(Serializable primaryKey)
        throws NoSuchStatusueberblickException, SystemException {
        Statusueberblick statusueberblick = fetchByPrimaryKey(primaryKey);

        if (statusueberblick == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchStatusueberblickException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return statusueberblick;
    }

    /**
     * Returns the statusueberblick with the primary key or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchStatusueberblickException} if it could not be found.
     *
     * @param id the primary key of the statusueberblick
     * @return the statusueberblick
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusueberblickException if a statusueberblick with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusueberblick findByPrimaryKey(long id)
        throws NoSuchStatusueberblickException, SystemException {
        return findByPrimaryKey((Serializable) id);
    }

    /**
     * Returns the statusueberblick with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the statusueberblick
     * @return the statusueberblick, or <code>null</code> if a statusueberblick with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusueberblick fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Statusueberblick statusueberblick = (Statusueberblick) EntityCacheUtil.getResult(StatusueberblickModelImpl.ENTITY_CACHE_ENABLED,
                StatusueberblickImpl.class, primaryKey);

        if (statusueberblick == _nullStatusueberblick) {
            return null;
        }

        if (statusueberblick == null) {
            Session session = null;

            try {
                session = openSession();

                statusueberblick = (Statusueberblick) session.get(StatusueberblickImpl.class,
                        primaryKey);

                if (statusueberblick != null) {
                    cacheResult(statusueberblick);
                } else {
                    EntityCacheUtil.putResult(StatusueberblickModelImpl.ENTITY_CACHE_ENABLED,
                        StatusueberblickImpl.class, primaryKey,
                        _nullStatusueberblick);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(StatusueberblickModelImpl.ENTITY_CACHE_ENABLED,
                    StatusueberblickImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return statusueberblick;
    }

    /**
     * Returns the statusueberblick with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the statusueberblick
     * @return the statusueberblick, or <code>null</code> if a statusueberblick with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusueberblick fetchByPrimaryKey(long id)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) id);
    }

    /**
     * Returns all the statusueberblicks.
     *
     * @return the statusueberblicks
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Statusueberblick> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the statusueberblicks.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.StatusueberblickModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of statusueberblicks
     * @param end the upper bound of the range of statusueberblicks (not inclusive)
     * @return the range of statusueberblicks
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Statusueberblick> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the statusueberblicks.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.StatusueberblickModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of statusueberblicks
     * @param end the upper bound of the range of statusueberblicks (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of statusueberblicks
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Statusueberblick> findAll(int start, int end,
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

        List<Statusueberblick> list = (List<Statusueberblick>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_STATUSUEBERBLICK);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_STATUSUEBERBLICK;

                if (pagination) {
                    sql = sql.concat(StatusueberblickModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Statusueberblick>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Statusueberblick>(list);
                } else {
                    list = (List<Statusueberblick>) QueryUtil.list(q,
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
     * Removes all the statusueberblicks from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Statusueberblick statusueberblick : findAll()) {
            remove(statusueberblick);
        }
    }

    /**
     * Returns the number of statusueberblicks.
     *
     * @return the number of statusueberblicks
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

                Query q = session.createQuery(_SQL_COUNT_STATUSUEBERBLICK);

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
     * Initializes the statusueberblick persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.de.hska.wi.awp.datasource.infosys.model.Statusueberblick")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Statusueberblick>> listenersList = new ArrayList<ModelListener<Statusueberblick>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Statusueberblick>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(StatusueberblickImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
