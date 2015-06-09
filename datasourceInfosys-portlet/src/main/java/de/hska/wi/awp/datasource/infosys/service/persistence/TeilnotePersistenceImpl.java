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
    private static final String _SQL_SELECT_TEILNOTE = "SELECT teilnote FROM Teilnote teilnote";
    private static final String _SQL_COUNT_TEILNOTE = "SELECT COUNT(teilnote) FROM Teilnote teilnote";
    private static final String _ORDER_BY_ENTITY_ALIAS = "teilnote.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Teilnote exists with the primary key ";
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

        if (isNew) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
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
