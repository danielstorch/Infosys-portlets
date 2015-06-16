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

import de.hska.wi.awp.datasource.infosys.NoSuchBewertungskriteriumException;
import de.hska.wi.awp.datasource.infosys.model.Bewertungskriterium;
import de.hska.wi.awp.datasource.infosys.model.impl.BewertungskriteriumImpl;
import de.hska.wi.awp.datasource.infosys.model.impl.BewertungskriteriumModelImpl;
import de.hska.wi.awp.datasource.infosys.service.persistence.BewertungskriteriumPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the bewertungskriterium service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Daniel Storch
 * @see BewertungskriteriumPersistence
 * @see BewertungskriteriumUtil
 * @generated
 */
public class BewertungskriteriumPersistenceImpl extends BasePersistenceImpl<Bewertungskriterium>
    implements BewertungskriteriumPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link BewertungskriteriumUtil} to access the bewertungskriterium persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = BewertungskriteriumImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BewertungskriteriumModelImpl.ENTITY_CACHE_ENABLED,
            BewertungskriteriumModelImpl.FINDER_CACHE_ENABLED,
            BewertungskriteriumImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BewertungskriteriumModelImpl.ENTITY_CACHE_ENABLED,
            BewertungskriteriumModelImpl.FINDER_CACHE_ENABLED,
            BewertungskriteriumImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BewertungskriteriumModelImpl.ENTITY_CACHE_ENABLED,
            BewertungskriteriumModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_BEWERTUNGSKRITERIUM = "SELECT bewertungskriterium FROM Bewertungskriterium bewertungskriterium";
    private static final String _SQL_COUNT_BEWERTUNGSKRITERIUM = "SELECT COUNT(bewertungskriterium) FROM Bewertungskriterium bewertungskriterium";
    private static final String _ORDER_BY_ENTITY_ALIAS = "bewertungskriterium.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Bewertungskriterium exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(BewertungskriteriumPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "id"
            });
    private static Bewertungskriterium _nullBewertungskriterium = new BewertungskriteriumImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Bewertungskriterium> toCacheModel() {
                return _nullBewertungskriteriumCacheModel;
            }
        };

    private static CacheModel<Bewertungskriterium> _nullBewertungskriteriumCacheModel =
        new CacheModel<Bewertungskriterium>() {
            @Override
            public Bewertungskriterium toEntityModel() {
                return _nullBewertungskriterium;
            }
        };

    public BewertungskriteriumPersistenceImpl() {
        setModelClass(Bewertungskriterium.class);
    }

    /**
     * Caches the bewertungskriterium in the entity cache if it is enabled.
     *
     * @param bewertungskriterium the bewertungskriterium
     */
    @Override
    public void cacheResult(Bewertungskriterium bewertungskriterium) {
        EntityCacheUtil.putResult(BewertungskriteriumModelImpl.ENTITY_CACHE_ENABLED,
            BewertungskriteriumImpl.class, bewertungskriterium.getPrimaryKey(),
            bewertungskriterium);

        bewertungskriterium.resetOriginalValues();
    }

    /**
     * Caches the bewertungskriteriums in the entity cache if it is enabled.
     *
     * @param bewertungskriteriums the bewertungskriteriums
     */
    @Override
    public void cacheResult(List<Bewertungskriterium> bewertungskriteriums) {
        for (Bewertungskriterium bewertungskriterium : bewertungskriteriums) {
            if (EntityCacheUtil.getResult(
                        BewertungskriteriumModelImpl.ENTITY_CACHE_ENABLED,
                        BewertungskriteriumImpl.class,
                        bewertungskriterium.getPrimaryKey()) == null) {
                cacheResult(bewertungskriterium);
            } else {
                bewertungskriterium.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all bewertungskriteriums.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(BewertungskriteriumImpl.class.getName());
        }

        EntityCacheUtil.clearCache(BewertungskriteriumImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the bewertungskriterium.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Bewertungskriterium bewertungskriterium) {
        EntityCacheUtil.removeResult(BewertungskriteriumModelImpl.ENTITY_CACHE_ENABLED,
            BewertungskriteriumImpl.class, bewertungskriterium.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Bewertungskriterium> bewertungskriteriums) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Bewertungskriterium bewertungskriterium : bewertungskriteriums) {
            EntityCacheUtil.removeResult(BewertungskriteriumModelImpl.ENTITY_CACHE_ENABLED,
                BewertungskriteriumImpl.class,
                bewertungskriterium.getPrimaryKey());
        }
    }

    /**
     * Creates a new bewertungskriterium with the primary key. Does not add the bewertungskriterium to the database.
     *
     * @param id the primary key for the new bewertungskriterium
     * @return the new bewertungskriterium
     */
    @Override
    public Bewertungskriterium create(long id) {
        Bewertungskriterium bewertungskriterium = new BewertungskriteriumImpl();

        bewertungskriterium.setNew(true);
        bewertungskriterium.setPrimaryKey(id);

        return bewertungskriterium;
    }

    /**
     * Removes the bewertungskriterium with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the bewertungskriterium
     * @return the bewertungskriterium that was removed
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchBewertungskriteriumException if a bewertungskriterium with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Bewertungskriterium remove(long id)
        throws NoSuchBewertungskriteriumException, SystemException {
        return remove((Serializable) id);
    }

    /**
     * Removes the bewertungskriterium with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the bewertungskriterium
     * @return the bewertungskriterium that was removed
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchBewertungskriteriumException if a bewertungskriterium with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Bewertungskriterium remove(Serializable primaryKey)
        throws NoSuchBewertungskriteriumException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Bewertungskriterium bewertungskriterium = (Bewertungskriterium) session.get(BewertungskriteriumImpl.class,
                    primaryKey);

            if (bewertungskriterium == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchBewertungskriteriumException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(bewertungskriterium);
        } catch (NoSuchBewertungskriteriumException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Bewertungskriterium removeImpl(
        Bewertungskriterium bewertungskriterium) throws SystemException {
        bewertungskriterium = toUnwrappedModel(bewertungskriterium);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(bewertungskriterium)) {
                bewertungskriterium = (Bewertungskriterium) session.get(BewertungskriteriumImpl.class,
                        bewertungskriterium.getPrimaryKeyObj());
            }

            if (bewertungskriterium != null) {
                session.delete(bewertungskriterium);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (bewertungskriterium != null) {
            clearCache(bewertungskriterium);
        }

        return bewertungskriterium;
    }

    @Override
    public Bewertungskriterium updateImpl(
        de.hska.wi.awp.datasource.infosys.model.Bewertungskriterium bewertungskriterium)
        throws SystemException {
        bewertungskriterium = toUnwrappedModel(bewertungskriterium);

        boolean isNew = bewertungskriterium.isNew();

        Session session = null;

        try {
            session = openSession();

            if (bewertungskriterium.isNew()) {
                session.save(bewertungskriterium);

                bewertungskriterium.setNew(false);
            } else {
                session.merge(bewertungskriterium);
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

        EntityCacheUtil.putResult(BewertungskriteriumModelImpl.ENTITY_CACHE_ENABLED,
            BewertungskriteriumImpl.class, bewertungskriterium.getPrimaryKey(),
            bewertungskriterium);

        return bewertungskriterium;
    }

    protected Bewertungskriterium toUnwrappedModel(
        Bewertungskriterium bewertungskriterium) {
        if (bewertungskriterium instanceof BewertungskriteriumImpl) {
            return bewertungskriterium;
        }

        BewertungskriteriumImpl bewertungskriteriumImpl = new BewertungskriteriumImpl();

        bewertungskriteriumImpl.setNew(bewertungskriterium.isNew());
        bewertungskriteriumImpl.setPrimaryKey(bewertungskriterium.getPrimaryKey());

        bewertungskriteriumImpl.setId(bewertungskriterium.getId());
        bewertungskriteriumImpl.setName(bewertungskriterium.getName());
        bewertungskriteriumImpl.setBeschreibung(bewertungskriterium.getBeschreibung());
        bewertungskriteriumImpl.setGewichtung(bewertungskriterium.getGewichtung());

        return bewertungskriteriumImpl;
    }

    /**
     * Returns the bewertungskriterium with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the bewertungskriterium
     * @return the bewertungskriterium
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchBewertungskriteriumException if a bewertungskriterium with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Bewertungskriterium findByPrimaryKey(Serializable primaryKey)
        throws NoSuchBewertungskriteriumException, SystemException {
        Bewertungskriterium bewertungskriterium = fetchByPrimaryKey(primaryKey);

        if (bewertungskriterium == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchBewertungskriteriumException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return bewertungskriterium;
    }

    /**
     * Returns the bewertungskriterium with the primary key or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchBewertungskriteriumException} if it could not be found.
     *
     * @param id the primary key of the bewertungskriterium
     * @return the bewertungskriterium
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchBewertungskriteriumException if a bewertungskriterium with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Bewertungskriterium findByPrimaryKey(long id)
        throws NoSuchBewertungskriteriumException, SystemException {
        return findByPrimaryKey((Serializable) id);
    }

    /**
     * Returns the bewertungskriterium with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the bewertungskriterium
     * @return the bewertungskriterium, or <code>null</code> if a bewertungskriterium with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Bewertungskriterium fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Bewertungskriterium bewertungskriterium = (Bewertungskriterium) EntityCacheUtil.getResult(BewertungskriteriumModelImpl.ENTITY_CACHE_ENABLED,
                BewertungskriteriumImpl.class, primaryKey);

        if (bewertungskriterium == _nullBewertungskriterium) {
            return null;
        }

        if (bewertungskriterium == null) {
            Session session = null;

            try {
                session = openSession();

                bewertungskriterium = (Bewertungskriterium) session.get(BewertungskriteriumImpl.class,
                        primaryKey);

                if (bewertungskriterium != null) {
                    cacheResult(bewertungskriterium);
                } else {
                    EntityCacheUtil.putResult(BewertungskriteriumModelImpl.ENTITY_CACHE_ENABLED,
                        BewertungskriteriumImpl.class, primaryKey,
                        _nullBewertungskriterium);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(BewertungskriteriumModelImpl.ENTITY_CACHE_ENABLED,
                    BewertungskriteriumImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return bewertungskriterium;
    }

    /**
     * Returns the bewertungskriterium with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the bewertungskriterium
     * @return the bewertungskriterium, or <code>null</code> if a bewertungskriterium with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Bewertungskriterium fetchByPrimaryKey(long id)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) id);
    }

    /**
     * Returns all the bewertungskriteriums.
     *
     * @return the bewertungskriteriums
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Bewertungskriterium> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the bewertungskriteriums.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.BewertungskriteriumModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of bewertungskriteriums
     * @param end the upper bound of the range of bewertungskriteriums (not inclusive)
     * @return the range of bewertungskriteriums
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Bewertungskriterium> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the bewertungskriteriums.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.BewertungskriteriumModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of bewertungskriteriums
     * @param end the upper bound of the range of bewertungskriteriums (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of bewertungskriteriums
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Bewertungskriterium> findAll(int start, int end,
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

        List<Bewertungskriterium> list = (List<Bewertungskriterium>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_BEWERTUNGSKRITERIUM);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_BEWERTUNGSKRITERIUM;

                if (pagination) {
                    sql = sql.concat(BewertungskriteriumModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Bewertungskriterium>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Bewertungskriterium>(list);
                } else {
                    list = (List<Bewertungskriterium>) QueryUtil.list(q,
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
     * Removes all the bewertungskriteriums from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Bewertungskriterium bewertungskriterium : findAll()) {
            remove(bewertungskriterium);
        }
    }

    /**
     * Returns the number of bewertungskriteriums.
     *
     * @return the number of bewertungskriteriums
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

                Query q = session.createQuery(_SQL_COUNT_BEWERTUNGSKRITERIUM);

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
     * Initializes the bewertungskriterium persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.de.hska.wi.awp.datasource.infosys.model.Bewertungskriterium")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Bewertungskriterium>> listenersList = new ArrayList<ModelListener<Bewertungskriterium>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Bewertungskriterium>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(BewertungskriteriumImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
