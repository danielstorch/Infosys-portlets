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

import de.hska.wi.awp.datasource.infosys.NoSuchGeplante_arbeitException;
import de.hska.wi.awp.datasource.infosys.model.Geplante_arbeit;
import de.hska.wi.awp.datasource.infosys.model.impl.Geplante_arbeitImpl;
import de.hska.wi.awp.datasource.infosys.model.impl.Geplante_arbeitModelImpl;
import de.hska.wi.awp.datasource.infosys.service.persistence.Geplante_arbeitPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the geplante_arbeit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Daniel Storch
 * @see Geplante_arbeitPersistence
 * @see Geplante_arbeitUtil
 * @generated
 */
public class Geplante_arbeitPersistenceImpl extends BasePersistenceImpl<Geplante_arbeit>
    implements Geplante_arbeitPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link Geplante_arbeitUtil} to access the geplante_arbeit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = Geplante_arbeitImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Geplante_arbeitModelImpl.ENTITY_CACHE_ENABLED,
            Geplante_arbeitModelImpl.FINDER_CACHE_ENABLED,
            Geplante_arbeitImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Geplante_arbeitModelImpl.ENTITY_CACHE_ENABLED,
            Geplante_arbeitModelImpl.FINDER_CACHE_ENABLED,
            Geplante_arbeitImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Geplante_arbeitModelImpl.ENTITY_CACHE_ENABLED,
            Geplante_arbeitModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_FETCH_BY_STATUSBERICHT_ID = new FinderPath(Geplante_arbeitModelImpl.ENTITY_CACHE_ENABLED,
            Geplante_arbeitModelImpl.FINDER_CACHE_ENABLED,
            Geplante_arbeitImpl.class, FINDER_CLASS_NAME_ENTITY,
            "fetchByStatusbericht_id", new String[] { Long.class.getName() },
            Geplante_arbeitModelImpl.STATUSBERICHT_ID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_STATUSBERICHT_ID = new FinderPath(Geplante_arbeitModelImpl.ENTITY_CACHE_ENABLED,
            Geplante_arbeitModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByStatusbericht_id", new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_STATUSBERICHT_ID_STATUSBERICHT_ID_2 =
        "geplante_arbeit.statusbericht_id = ?";
    private static final String _SQL_SELECT_GEPLANTE_ARBEIT = "SELECT geplante_arbeit FROM Geplante_arbeit geplante_arbeit";
    private static final String _SQL_SELECT_GEPLANTE_ARBEIT_WHERE = "SELECT geplante_arbeit FROM Geplante_arbeit geplante_arbeit WHERE ";
    private static final String _SQL_COUNT_GEPLANTE_ARBEIT = "SELECT COUNT(geplante_arbeit) FROM Geplante_arbeit geplante_arbeit";
    private static final String _SQL_COUNT_GEPLANTE_ARBEIT_WHERE = "SELECT COUNT(geplante_arbeit) FROM Geplante_arbeit geplante_arbeit WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "geplante_arbeit.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Geplante_arbeit exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Geplante_arbeit exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(Geplante_arbeitPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "id"
            });
    private static Geplante_arbeit _nullGeplante_arbeit = new Geplante_arbeitImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Geplante_arbeit> toCacheModel() {
                return _nullGeplante_arbeitCacheModel;
            }
        };

    private static CacheModel<Geplante_arbeit> _nullGeplante_arbeitCacheModel = new CacheModel<Geplante_arbeit>() {
            @Override
            public Geplante_arbeit toEntityModel() {
                return _nullGeplante_arbeit;
            }
        };

    public Geplante_arbeitPersistenceImpl() {
        setModelClass(Geplante_arbeit.class);
    }

    /**
     * Returns the geplante_arbeit where statusbericht_id = &#63; or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchGeplante_arbeitException} if it could not be found.
     *
     * @param statusbericht_id the statusbericht_id
     * @return the matching geplante_arbeit
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchGeplante_arbeitException if a matching geplante_arbeit could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Geplante_arbeit findByStatusbericht_id(long statusbericht_id)
        throws NoSuchGeplante_arbeitException, SystemException {
        Geplante_arbeit geplante_arbeit = fetchByStatusbericht_id(statusbericht_id);

        if (geplante_arbeit == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("statusbericht_id=");
            msg.append(statusbericht_id);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchGeplante_arbeitException(msg.toString());
        }

        return geplante_arbeit;
    }

    /**
     * Returns the geplante_arbeit where statusbericht_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param statusbericht_id the statusbericht_id
     * @return the matching geplante_arbeit, or <code>null</code> if a matching geplante_arbeit could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Geplante_arbeit fetchByStatusbericht_id(long statusbericht_id)
        throws SystemException {
        return fetchByStatusbericht_id(statusbericht_id, true);
    }

    /**
     * Returns the geplante_arbeit where statusbericht_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param statusbericht_id the statusbericht_id
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching geplante_arbeit, or <code>null</code> if a matching geplante_arbeit could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Geplante_arbeit fetchByStatusbericht_id(long statusbericht_id,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { statusbericht_id };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_STATUSBERICHT_ID,
                    finderArgs, this);
        }

        if (result instanceof Geplante_arbeit) {
            Geplante_arbeit geplante_arbeit = (Geplante_arbeit) result;

            if ((statusbericht_id != geplante_arbeit.getStatusbericht_id())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_GEPLANTE_ARBEIT_WHERE);

            query.append(_FINDER_COLUMN_STATUSBERICHT_ID_STATUSBERICHT_ID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(statusbericht_id);

                List<Geplante_arbeit> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_STATUSBERICHT_ID,
                        finderArgs, list);
                } else {
                    if ((list.size() > 1) && _log.isWarnEnabled()) {
                        _log.warn(
                            "Geplante_arbeitPersistenceImpl.fetchByStatusbericht_id(long, boolean) with parameters (" +
                            StringUtil.merge(finderArgs) +
                            ") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
                    }

                    Geplante_arbeit geplante_arbeit = list.get(0);

                    result = geplante_arbeit;

                    cacheResult(geplante_arbeit);

                    if ((geplante_arbeit.getStatusbericht_id() != statusbericht_id)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_STATUSBERICHT_ID,
                            finderArgs, geplante_arbeit);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_STATUSBERICHT_ID,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (Geplante_arbeit) result;
        }
    }

    /**
     * Removes the geplante_arbeit where statusbericht_id = &#63; from the database.
     *
     * @param statusbericht_id the statusbericht_id
     * @return the geplante_arbeit that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Geplante_arbeit removeByStatusbericht_id(long statusbericht_id)
        throws NoSuchGeplante_arbeitException, SystemException {
        Geplante_arbeit geplante_arbeit = findByStatusbericht_id(statusbericht_id);

        return remove(geplante_arbeit);
    }

    /**
     * Returns the number of geplante_arbeits where statusbericht_id = &#63;.
     *
     * @param statusbericht_id the statusbericht_id
     * @return the number of matching geplante_arbeits
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

            query.append(_SQL_COUNT_GEPLANTE_ARBEIT_WHERE);

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
     * Caches the geplante_arbeit in the entity cache if it is enabled.
     *
     * @param geplante_arbeit the geplante_arbeit
     */
    @Override
    public void cacheResult(Geplante_arbeit geplante_arbeit) {
        EntityCacheUtil.putResult(Geplante_arbeitModelImpl.ENTITY_CACHE_ENABLED,
            Geplante_arbeitImpl.class, geplante_arbeit.getPrimaryKey(),
            geplante_arbeit);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_STATUSBERICHT_ID,
            new Object[] { geplante_arbeit.getStatusbericht_id() },
            geplante_arbeit);

        geplante_arbeit.resetOriginalValues();
    }

    /**
     * Caches the geplante_arbeits in the entity cache if it is enabled.
     *
     * @param geplante_arbeits the geplante_arbeits
     */
    @Override
    public void cacheResult(List<Geplante_arbeit> geplante_arbeits) {
        for (Geplante_arbeit geplante_arbeit : geplante_arbeits) {
            if (EntityCacheUtil.getResult(
                        Geplante_arbeitModelImpl.ENTITY_CACHE_ENABLED,
                        Geplante_arbeitImpl.class,
                        geplante_arbeit.getPrimaryKey()) == null) {
                cacheResult(geplante_arbeit);
            } else {
                geplante_arbeit.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all geplante_arbeits.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(Geplante_arbeitImpl.class.getName());
        }

        EntityCacheUtil.clearCache(Geplante_arbeitImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the geplante_arbeit.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Geplante_arbeit geplante_arbeit) {
        EntityCacheUtil.removeResult(Geplante_arbeitModelImpl.ENTITY_CACHE_ENABLED,
            Geplante_arbeitImpl.class, geplante_arbeit.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(geplante_arbeit);
    }

    @Override
    public void clearCache(List<Geplante_arbeit> geplante_arbeits) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Geplante_arbeit geplante_arbeit : geplante_arbeits) {
            EntityCacheUtil.removeResult(Geplante_arbeitModelImpl.ENTITY_CACHE_ENABLED,
                Geplante_arbeitImpl.class, geplante_arbeit.getPrimaryKey());

            clearUniqueFindersCache(geplante_arbeit);
        }
    }

    protected void cacheUniqueFindersCache(Geplante_arbeit geplante_arbeit) {
        if (geplante_arbeit.isNew()) {
            Object[] args = new Object[] { geplante_arbeit.getStatusbericht_id() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_STATUSBERICHT_ID,
                args, Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_STATUSBERICHT_ID,
                args, geplante_arbeit);
        } else {
            Geplante_arbeitModelImpl geplante_arbeitModelImpl = (Geplante_arbeitModelImpl) geplante_arbeit;

            if ((geplante_arbeitModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_STATUSBERICHT_ID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        geplante_arbeit.getStatusbericht_id()
                    };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_STATUSBERICHT_ID,
                    args, Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_STATUSBERICHT_ID,
                    args, geplante_arbeit);
            }
        }
    }

    protected void clearUniqueFindersCache(Geplante_arbeit geplante_arbeit) {
        Geplante_arbeitModelImpl geplante_arbeitModelImpl = (Geplante_arbeitModelImpl) geplante_arbeit;

        Object[] args = new Object[] { geplante_arbeit.getStatusbericht_id() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATUSBERICHT_ID, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_STATUSBERICHT_ID, args);

        if ((geplante_arbeitModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_STATUSBERICHT_ID.getColumnBitmask()) != 0) {
            args = new Object[] {
                    geplante_arbeitModelImpl.getOriginalStatusbericht_id()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATUSBERICHT_ID,
                args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_STATUSBERICHT_ID,
                args);
        }
    }

    /**
     * Creates a new geplante_arbeit with the primary key. Does not add the geplante_arbeit to the database.
     *
     * @param id the primary key for the new geplante_arbeit
     * @return the new geplante_arbeit
     */
    @Override
    public Geplante_arbeit create(long id) {
        Geplante_arbeit geplante_arbeit = new Geplante_arbeitImpl();

        geplante_arbeit.setNew(true);
        geplante_arbeit.setPrimaryKey(id);

        return geplante_arbeit;
    }

    /**
     * Removes the geplante_arbeit with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the geplante_arbeit
     * @return the geplante_arbeit that was removed
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchGeplante_arbeitException if a geplante_arbeit with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Geplante_arbeit remove(long id)
        throws NoSuchGeplante_arbeitException, SystemException {
        return remove((Serializable) id);
    }

    /**
     * Removes the geplante_arbeit with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the geplante_arbeit
     * @return the geplante_arbeit that was removed
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchGeplante_arbeitException if a geplante_arbeit with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Geplante_arbeit remove(Serializable primaryKey)
        throws NoSuchGeplante_arbeitException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Geplante_arbeit geplante_arbeit = (Geplante_arbeit) session.get(Geplante_arbeitImpl.class,
                    primaryKey);

            if (geplante_arbeit == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchGeplante_arbeitException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(geplante_arbeit);
        } catch (NoSuchGeplante_arbeitException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Geplante_arbeit removeImpl(Geplante_arbeit geplante_arbeit)
        throws SystemException {
        geplante_arbeit = toUnwrappedModel(geplante_arbeit);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(geplante_arbeit)) {
                geplante_arbeit = (Geplante_arbeit) session.get(Geplante_arbeitImpl.class,
                        geplante_arbeit.getPrimaryKeyObj());
            }

            if (geplante_arbeit != null) {
                session.delete(geplante_arbeit);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (geplante_arbeit != null) {
            clearCache(geplante_arbeit);
        }

        return geplante_arbeit;
    }

    @Override
    public Geplante_arbeit updateImpl(
        de.hska.wi.awp.datasource.infosys.model.Geplante_arbeit geplante_arbeit)
        throws SystemException {
        geplante_arbeit = toUnwrappedModel(geplante_arbeit);

        boolean isNew = geplante_arbeit.isNew();

        Session session = null;

        try {
            session = openSession();

            if (geplante_arbeit.isNew()) {
                session.save(geplante_arbeit);

                geplante_arbeit.setNew(false);
            } else {
                session.merge(geplante_arbeit);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !Geplante_arbeitModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(Geplante_arbeitModelImpl.ENTITY_CACHE_ENABLED,
            Geplante_arbeitImpl.class, geplante_arbeit.getPrimaryKey(),
            geplante_arbeit);

        clearUniqueFindersCache(geplante_arbeit);
        cacheUniqueFindersCache(geplante_arbeit);

        return geplante_arbeit;
    }

    protected Geplante_arbeit toUnwrappedModel(Geplante_arbeit geplante_arbeit) {
        if (geplante_arbeit instanceof Geplante_arbeitImpl) {
            return geplante_arbeit;
        }

        Geplante_arbeitImpl geplante_arbeitImpl = new Geplante_arbeitImpl();

        geplante_arbeitImpl.setNew(geplante_arbeit.isNew());
        geplante_arbeitImpl.setPrimaryKey(geplante_arbeit.getPrimaryKey());

        geplante_arbeitImpl.setId(geplante_arbeit.getId());
        geplante_arbeitImpl.setStatusbericht_id(geplante_arbeit.getStatusbericht_id());
        geplante_arbeitImpl.setVerantwortlicher(geplante_arbeit.getVerantwortlicher());
        geplante_arbeitImpl.setArbeit(geplante_arbeit.getArbeit());
        geplante_arbeitImpl.setBis_wann(geplante_arbeit.getBis_wann());

        return geplante_arbeitImpl;
    }

    /**
     * Returns the geplante_arbeit with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the geplante_arbeit
     * @return the geplante_arbeit
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchGeplante_arbeitException if a geplante_arbeit with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Geplante_arbeit findByPrimaryKey(Serializable primaryKey)
        throws NoSuchGeplante_arbeitException, SystemException {
        Geplante_arbeit geplante_arbeit = fetchByPrimaryKey(primaryKey);

        if (geplante_arbeit == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchGeplante_arbeitException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return geplante_arbeit;
    }

    /**
     * Returns the geplante_arbeit with the primary key or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchGeplante_arbeitException} if it could not be found.
     *
     * @param id the primary key of the geplante_arbeit
     * @return the geplante_arbeit
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchGeplante_arbeitException if a geplante_arbeit with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Geplante_arbeit findByPrimaryKey(long id)
        throws NoSuchGeplante_arbeitException, SystemException {
        return findByPrimaryKey((Serializable) id);
    }

    /**
     * Returns the geplante_arbeit with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the geplante_arbeit
     * @return the geplante_arbeit, or <code>null</code> if a geplante_arbeit with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Geplante_arbeit fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Geplante_arbeit geplante_arbeit = (Geplante_arbeit) EntityCacheUtil.getResult(Geplante_arbeitModelImpl.ENTITY_CACHE_ENABLED,
                Geplante_arbeitImpl.class, primaryKey);

        if (geplante_arbeit == _nullGeplante_arbeit) {
            return null;
        }

        if (geplante_arbeit == null) {
            Session session = null;

            try {
                session = openSession();

                geplante_arbeit = (Geplante_arbeit) session.get(Geplante_arbeitImpl.class,
                        primaryKey);

                if (geplante_arbeit != null) {
                    cacheResult(geplante_arbeit);
                } else {
                    EntityCacheUtil.putResult(Geplante_arbeitModelImpl.ENTITY_CACHE_ENABLED,
                        Geplante_arbeitImpl.class, primaryKey,
                        _nullGeplante_arbeit);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(Geplante_arbeitModelImpl.ENTITY_CACHE_ENABLED,
                    Geplante_arbeitImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return geplante_arbeit;
    }

    /**
     * Returns the geplante_arbeit with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the geplante_arbeit
     * @return the geplante_arbeit, or <code>null</code> if a geplante_arbeit with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Geplante_arbeit fetchByPrimaryKey(long id) throws SystemException {
        return fetchByPrimaryKey((Serializable) id);
    }

    /**
     * Returns all the geplante_arbeits.
     *
     * @return the geplante_arbeits
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Geplante_arbeit> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the geplante_arbeits.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Geplante_arbeitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of geplante_arbeits
     * @param end the upper bound of the range of geplante_arbeits (not inclusive)
     * @return the range of geplante_arbeits
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Geplante_arbeit> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the geplante_arbeits.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Geplante_arbeitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of geplante_arbeits
     * @param end the upper bound of the range of geplante_arbeits (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of geplante_arbeits
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Geplante_arbeit> findAll(int start, int end,
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

        List<Geplante_arbeit> list = (List<Geplante_arbeit>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_GEPLANTE_ARBEIT);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_GEPLANTE_ARBEIT;

                if (pagination) {
                    sql = sql.concat(Geplante_arbeitModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Geplante_arbeit>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Geplante_arbeit>(list);
                } else {
                    list = (List<Geplante_arbeit>) QueryUtil.list(q,
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
     * Removes all the geplante_arbeits from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Geplante_arbeit geplante_arbeit : findAll()) {
            remove(geplante_arbeit);
        }
    }

    /**
     * Returns the number of geplante_arbeits.
     *
     * @return the number of geplante_arbeits
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

                Query q = session.createQuery(_SQL_COUNT_GEPLANTE_ARBEIT);

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
     * Initializes the geplante_arbeit persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.de.hska.wi.awp.datasource.infosys.model.Geplante_arbeit")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Geplante_arbeit>> listenersList = new ArrayList<ModelListener<Geplante_arbeit>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Geplante_arbeit>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(Geplante_arbeitImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
