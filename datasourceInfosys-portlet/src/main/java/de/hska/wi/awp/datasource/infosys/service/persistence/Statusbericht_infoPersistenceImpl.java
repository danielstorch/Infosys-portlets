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

import de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_infoException;
import de.hska.wi.awp.datasource.infosys.model.Statusbericht_info;
import de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_infoImpl;
import de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_infoModelImpl;
import de.hska.wi.awp.datasource.infosys.service.persistence.Statusbericht_infoPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the statusbericht_info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Daniel Storch
 * @see Statusbericht_infoPersistence
 * @see Statusbericht_infoUtil
 * @generated
 */
public class Statusbericht_infoPersistenceImpl extends BasePersistenceImpl<Statusbericht_info>
    implements Statusbericht_infoPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link Statusbericht_infoUtil} to access the statusbericht_info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = Statusbericht_infoImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Statusbericht_infoModelImpl.ENTITY_CACHE_ENABLED,
            Statusbericht_infoModelImpl.FINDER_CACHE_ENABLED,
            Statusbericht_infoImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Statusbericht_infoModelImpl.ENTITY_CACHE_ENABLED,
            Statusbericht_infoModelImpl.FINDER_CACHE_ENABLED,
            Statusbericht_infoImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Statusbericht_infoModelImpl.ENTITY_CACHE_ENABLED,
            Statusbericht_infoModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_FETCH_BY_STATUSBERICHT_ID = new FinderPath(Statusbericht_infoModelImpl.ENTITY_CACHE_ENABLED,
            Statusbericht_infoModelImpl.FINDER_CACHE_ENABLED,
            Statusbericht_infoImpl.class, FINDER_CLASS_NAME_ENTITY,
            "fetchByStatusbericht_id", new String[] { Long.class.getName() },
            Statusbericht_infoModelImpl.STATUSBERICHT_ID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_STATUSBERICHT_ID = new FinderPath(Statusbericht_infoModelImpl.ENTITY_CACHE_ENABLED,
            Statusbericht_infoModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByStatusbericht_id", new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_STATUSBERICHT_ID_STATUSBERICHT_ID_2 =
        "statusbericht_info.statusbericht_id = ?";
    private static final String _SQL_SELECT_STATUSBERICHT_INFO = "SELECT statusbericht_info FROM Statusbericht_info statusbericht_info";
    private static final String _SQL_SELECT_STATUSBERICHT_INFO_WHERE = "SELECT statusbericht_info FROM Statusbericht_info statusbericht_info WHERE ";
    private static final String _SQL_COUNT_STATUSBERICHT_INFO = "SELECT COUNT(statusbericht_info) FROM Statusbericht_info statusbericht_info";
    private static final String _SQL_COUNT_STATUSBERICHT_INFO_WHERE = "SELECT COUNT(statusbericht_info) FROM Statusbericht_info statusbericht_info WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "statusbericht_info.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Statusbericht_info exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Statusbericht_info exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(Statusbericht_infoPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "id"
            });
    private static Statusbericht_info _nullStatusbericht_info = new Statusbericht_infoImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Statusbericht_info> toCacheModel() {
                return _nullStatusbericht_infoCacheModel;
            }
        };

    private static CacheModel<Statusbericht_info> _nullStatusbericht_infoCacheModel =
        new CacheModel<Statusbericht_info>() {
            @Override
            public Statusbericht_info toEntityModel() {
                return _nullStatusbericht_info;
            }
        };

    public Statusbericht_infoPersistenceImpl() {
        setModelClass(Statusbericht_info.class);
    }

    /**
     * Returns the statusbericht_info where statusbericht_id = &#63; or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_infoException} if it could not be found.
     *
     * @param statusbericht_id the statusbericht_id
     * @return the matching statusbericht_info
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_infoException if a matching statusbericht_info could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusbericht_info findByStatusbericht_id(long statusbericht_id)
        throws NoSuchStatusbericht_infoException, SystemException {
        Statusbericht_info statusbericht_info = fetchByStatusbericht_id(statusbericht_id);

        if (statusbericht_info == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("statusbericht_id=");
            msg.append(statusbericht_id);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchStatusbericht_infoException(msg.toString());
        }

        return statusbericht_info;
    }

    /**
     * Returns the statusbericht_info where statusbericht_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param statusbericht_id the statusbericht_id
     * @return the matching statusbericht_info, or <code>null</code> if a matching statusbericht_info could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusbericht_info fetchByStatusbericht_id(long statusbericht_id)
        throws SystemException {
        return fetchByStatusbericht_id(statusbericht_id, true);
    }

    /**
     * Returns the statusbericht_info where statusbericht_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param statusbericht_id the statusbericht_id
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching statusbericht_info, or <code>null</code> if a matching statusbericht_info could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusbericht_info fetchByStatusbericht_id(long statusbericht_id,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { statusbericht_id };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_STATUSBERICHT_ID,
                    finderArgs, this);
        }

        if (result instanceof Statusbericht_info) {
            Statusbericht_info statusbericht_info = (Statusbericht_info) result;

            if ((statusbericht_id != statusbericht_info.getStatusbericht_id())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_STATUSBERICHT_INFO_WHERE);

            query.append(_FINDER_COLUMN_STATUSBERICHT_ID_STATUSBERICHT_ID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(statusbericht_id);

                List<Statusbericht_info> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_STATUSBERICHT_ID,
                        finderArgs, list);
                } else {
                    if ((list.size() > 1) && _log.isWarnEnabled()) {
                        _log.warn(
                            "Statusbericht_infoPersistenceImpl.fetchByStatusbericht_id(long, boolean) with parameters (" +
                            StringUtil.merge(finderArgs) +
                            ") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
                    }

                    Statusbericht_info statusbericht_info = list.get(0);

                    result = statusbericht_info;

                    cacheResult(statusbericht_info);

                    if ((statusbericht_info.getStatusbericht_id() != statusbericht_id)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_STATUSBERICHT_ID,
                            finderArgs, statusbericht_info);
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
            return (Statusbericht_info) result;
        }
    }

    /**
     * Removes the statusbericht_info where statusbericht_id = &#63; from the database.
     *
     * @param statusbericht_id the statusbericht_id
     * @return the statusbericht_info that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusbericht_info removeByStatusbericht_id(long statusbericht_id)
        throws NoSuchStatusbericht_infoException, SystemException {
        Statusbericht_info statusbericht_info = findByStatusbericht_id(statusbericht_id);

        return remove(statusbericht_info);
    }

    /**
     * Returns the number of statusbericht_infos where statusbericht_id = &#63;.
     *
     * @param statusbericht_id the statusbericht_id
     * @return the number of matching statusbericht_infos
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

            query.append(_SQL_COUNT_STATUSBERICHT_INFO_WHERE);

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
     * Caches the statusbericht_info in the entity cache if it is enabled.
     *
     * @param statusbericht_info the statusbericht_info
     */
    @Override
    public void cacheResult(Statusbericht_info statusbericht_info) {
        EntityCacheUtil.putResult(Statusbericht_infoModelImpl.ENTITY_CACHE_ENABLED,
            Statusbericht_infoImpl.class, statusbericht_info.getPrimaryKey(),
            statusbericht_info);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_STATUSBERICHT_ID,
            new Object[] { statusbericht_info.getStatusbericht_id() },
            statusbericht_info);

        statusbericht_info.resetOriginalValues();
    }

    /**
     * Caches the statusbericht_infos in the entity cache if it is enabled.
     *
     * @param statusbericht_infos the statusbericht_infos
     */
    @Override
    public void cacheResult(List<Statusbericht_info> statusbericht_infos) {
        for (Statusbericht_info statusbericht_info : statusbericht_infos) {
            if (EntityCacheUtil.getResult(
                        Statusbericht_infoModelImpl.ENTITY_CACHE_ENABLED,
                        Statusbericht_infoImpl.class,
                        statusbericht_info.getPrimaryKey()) == null) {
                cacheResult(statusbericht_info);
            } else {
                statusbericht_info.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all statusbericht_infos.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(Statusbericht_infoImpl.class.getName());
        }

        EntityCacheUtil.clearCache(Statusbericht_infoImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the statusbericht_info.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Statusbericht_info statusbericht_info) {
        EntityCacheUtil.removeResult(Statusbericht_infoModelImpl.ENTITY_CACHE_ENABLED,
            Statusbericht_infoImpl.class, statusbericht_info.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(statusbericht_info);
    }

    @Override
    public void clearCache(List<Statusbericht_info> statusbericht_infos) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Statusbericht_info statusbericht_info : statusbericht_infos) {
            EntityCacheUtil.removeResult(Statusbericht_infoModelImpl.ENTITY_CACHE_ENABLED,
                Statusbericht_infoImpl.class, statusbericht_info.getPrimaryKey());

            clearUniqueFindersCache(statusbericht_info);
        }
    }

    protected void cacheUniqueFindersCache(
        Statusbericht_info statusbericht_info) {
        if (statusbericht_info.isNew()) {
            Object[] args = new Object[] {
                    statusbericht_info.getStatusbericht_id()
                };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_STATUSBERICHT_ID,
                args, Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_STATUSBERICHT_ID,
                args, statusbericht_info);
        } else {
            Statusbericht_infoModelImpl statusbericht_infoModelImpl = (Statusbericht_infoModelImpl) statusbericht_info;

            if ((statusbericht_infoModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_STATUSBERICHT_ID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        statusbericht_info.getStatusbericht_id()
                    };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_STATUSBERICHT_ID,
                    args, Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_STATUSBERICHT_ID,
                    args, statusbericht_info);
            }
        }
    }

    protected void clearUniqueFindersCache(
        Statusbericht_info statusbericht_info) {
        Statusbericht_infoModelImpl statusbericht_infoModelImpl = (Statusbericht_infoModelImpl) statusbericht_info;

        Object[] args = new Object[] { statusbericht_info.getStatusbericht_id() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATUSBERICHT_ID, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_STATUSBERICHT_ID, args);

        if ((statusbericht_infoModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_STATUSBERICHT_ID.getColumnBitmask()) != 0) {
            args = new Object[] {
                    statusbericht_infoModelImpl.getOriginalStatusbericht_id()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATUSBERICHT_ID,
                args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_STATUSBERICHT_ID,
                args);
        }
    }

    /**
     * Creates a new statusbericht_info with the primary key. Does not add the statusbericht_info to the database.
     *
     * @param id the primary key for the new statusbericht_info
     * @return the new statusbericht_info
     */
    @Override
    public Statusbericht_info create(long id) {
        Statusbericht_info statusbericht_info = new Statusbericht_infoImpl();

        statusbericht_info.setNew(true);
        statusbericht_info.setPrimaryKey(id);

        return statusbericht_info;
    }

    /**
     * Removes the statusbericht_info with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the statusbericht_info
     * @return the statusbericht_info that was removed
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_infoException if a statusbericht_info with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusbericht_info remove(long id)
        throws NoSuchStatusbericht_infoException, SystemException {
        return remove((Serializable) id);
    }

    /**
     * Removes the statusbericht_info with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the statusbericht_info
     * @return the statusbericht_info that was removed
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_infoException if a statusbericht_info with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusbericht_info remove(Serializable primaryKey)
        throws NoSuchStatusbericht_infoException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Statusbericht_info statusbericht_info = (Statusbericht_info) session.get(Statusbericht_infoImpl.class,
                    primaryKey);

            if (statusbericht_info == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchStatusbericht_infoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(statusbericht_info);
        } catch (NoSuchStatusbericht_infoException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Statusbericht_info removeImpl(
        Statusbericht_info statusbericht_info) throws SystemException {
        statusbericht_info = toUnwrappedModel(statusbericht_info);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(statusbericht_info)) {
                statusbericht_info = (Statusbericht_info) session.get(Statusbericht_infoImpl.class,
                        statusbericht_info.getPrimaryKeyObj());
            }

            if (statusbericht_info != null) {
                session.delete(statusbericht_info);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (statusbericht_info != null) {
            clearCache(statusbericht_info);
        }

        return statusbericht_info;
    }

    @Override
    public Statusbericht_info updateImpl(
        de.hska.wi.awp.datasource.infosys.model.Statusbericht_info statusbericht_info)
        throws SystemException {
        statusbericht_info = toUnwrappedModel(statusbericht_info);

        boolean isNew = statusbericht_info.isNew();

        Session session = null;

        try {
            session = openSession();

            if (statusbericht_info.isNew()) {
                session.save(statusbericht_info);

                statusbericht_info.setNew(false);
            } else {
                session.merge(statusbericht_info);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !Statusbericht_infoModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(Statusbericht_infoModelImpl.ENTITY_CACHE_ENABLED,
            Statusbericht_infoImpl.class, statusbericht_info.getPrimaryKey(),
            statusbericht_info);

        clearUniqueFindersCache(statusbericht_info);
        cacheUniqueFindersCache(statusbericht_info);

        return statusbericht_info;
    }

    protected Statusbericht_info toUnwrappedModel(
        Statusbericht_info statusbericht_info) {
        if (statusbericht_info instanceof Statusbericht_infoImpl) {
            return statusbericht_info;
        }

        Statusbericht_infoImpl statusbericht_infoImpl = new Statusbericht_infoImpl();

        statusbericht_infoImpl.setNew(statusbericht_info.isNew());
        statusbericht_infoImpl.setPrimaryKey(statusbericht_info.getPrimaryKey());

        statusbericht_infoImpl.setId(statusbericht_info.getId());
        statusbericht_infoImpl.setBemerkung(statusbericht_info.getBemerkung());
        statusbericht_infoImpl.setStatus(statusbericht_info.getStatus());
        statusbericht_infoImpl.setStatusbericht_id(statusbericht_info.getStatusbericht_id());
        statusbericht_infoImpl.setStatusbericht_info_punkt_id(statusbericht_info.getStatusbericht_info_punkt_id());

        return statusbericht_infoImpl;
    }

    /**
     * Returns the statusbericht_info with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the statusbericht_info
     * @return the statusbericht_info
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_infoException if a statusbericht_info with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusbericht_info findByPrimaryKey(Serializable primaryKey)
        throws NoSuchStatusbericht_infoException, SystemException {
        Statusbericht_info statusbericht_info = fetchByPrimaryKey(primaryKey);

        if (statusbericht_info == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchStatusbericht_infoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return statusbericht_info;
    }

    /**
     * Returns the statusbericht_info with the primary key or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_infoException} if it could not be found.
     *
     * @param id the primary key of the statusbericht_info
     * @return the statusbericht_info
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_infoException if a statusbericht_info with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusbericht_info findByPrimaryKey(long id)
        throws NoSuchStatusbericht_infoException, SystemException {
        return findByPrimaryKey((Serializable) id);
    }

    /**
     * Returns the statusbericht_info with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the statusbericht_info
     * @return the statusbericht_info, or <code>null</code> if a statusbericht_info with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusbericht_info fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Statusbericht_info statusbericht_info = (Statusbericht_info) EntityCacheUtil.getResult(Statusbericht_infoModelImpl.ENTITY_CACHE_ENABLED,
                Statusbericht_infoImpl.class, primaryKey);

        if (statusbericht_info == _nullStatusbericht_info) {
            return null;
        }

        if (statusbericht_info == null) {
            Session session = null;

            try {
                session = openSession();

                statusbericht_info = (Statusbericht_info) session.get(Statusbericht_infoImpl.class,
                        primaryKey);

                if (statusbericht_info != null) {
                    cacheResult(statusbericht_info);
                } else {
                    EntityCacheUtil.putResult(Statusbericht_infoModelImpl.ENTITY_CACHE_ENABLED,
                        Statusbericht_infoImpl.class, primaryKey,
                        _nullStatusbericht_info);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(Statusbericht_infoModelImpl.ENTITY_CACHE_ENABLED,
                    Statusbericht_infoImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return statusbericht_info;
    }

    /**
     * Returns the statusbericht_info with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the statusbericht_info
     * @return the statusbericht_info, or <code>null</code> if a statusbericht_info with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Statusbericht_info fetchByPrimaryKey(long id)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) id);
    }

    /**
     * Returns all the statusbericht_infos.
     *
     * @return the statusbericht_infos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Statusbericht_info> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the statusbericht_infos.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_infoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of statusbericht_infos
     * @param end the upper bound of the range of statusbericht_infos (not inclusive)
     * @return the range of statusbericht_infos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Statusbericht_info> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the statusbericht_infos.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_infoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of statusbericht_infos
     * @param end the upper bound of the range of statusbericht_infos (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of statusbericht_infos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Statusbericht_info> findAll(int start, int end,
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

        List<Statusbericht_info> list = (List<Statusbericht_info>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_STATUSBERICHT_INFO);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_STATUSBERICHT_INFO;

                if (pagination) {
                    sql = sql.concat(Statusbericht_infoModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Statusbericht_info>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Statusbericht_info>(list);
                } else {
                    list = (List<Statusbericht_info>) QueryUtil.list(q,
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
     * Removes all the statusbericht_infos from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Statusbericht_info statusbericht_info : findAll()) {
            remove(statusbericht_info);
        }
    }

    /**
     * Returns the number of statusbericht_infos.
     *
     * @return the number of statusbericht_infos
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

                Query q = session.createQuery(_SQL_COUNT_STATUSBERICHT_INFO);

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
     * Initializes the statusbericht_info persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.de.hska.wi.awp.datasource.infosys.model.Statusbericht_info")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Statusbericht_info>> listenersList = new ArrayList<ModelListener<Statusbericht_info>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Statusbericht_info>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(Statusbericht_infoImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
