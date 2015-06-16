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

import de.hska.wi.awp.datasource.infosys.NoSuchTeilnote_feedbackException;
import de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback;
import de.hska.wi.awp.datasource.infosys.model.impl.Teilnote_feedbackImpl;
import de.hska.wi.awp.datasource.infosys.model.impl.Teilnote_feedbackModelImpl;
import de.hska.wi.awp.datasource.infosys.service.persistence.Teilnote_feedbackPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the teilnote_feedback service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Daniel Storch
 * @see Teilnote_feedbackPersistence
 * @see Teilnote_feedbackUtil
 * @generated
 */
public class Teilnote_feedbackPersistenceImpl extends BasePersistenceImpl<Teilnote_feedback>
    implements Teilnote_feedbackPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link Teilnote_feedbackUtil} to access the teilnote_feedback persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = Teilnote_feedbackImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Teilnote_feedbackModelImpl.ENTITY_CACHE_ENABLED,
            Teilnote_feedbackModelImpl.FINDER_CACHE_ENABLED,
            Teilnote_feedbackImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Teilnote_feedbackModelImpl.ENTITY_CACHE_ENABLED,
            Teilnote_feedbackModelImpl.FINDER_CACHE_ENABLED,
            Teilnote_feedbackImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Teilnote_feedbackModelImpl.ENTITY_CACHE_ENABLED,
            Teilnote_feedbackModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_FETCH_BY_FEEDBACK_IDANDBEWERTUNGSKRITERIUM_ID =
        new FinderPath(Teilnote_feedbackModelImpl.ENTITY_CACHE_ENABLED,
            Teilnote_feedbackModelImpl.FINDER_CACHE_ENABLED,
            Teilnote_feedbackImpl.class, FINDER_CLASS_NAME_ENTITY,
            "fetchByFeedback_idAndBewertungskriterium_id",
            new String[] { Long.class.getName(), Long.class.getName() },
            Teilnote_feedbackModelImpl.FEEDBACK_ID_COLUMN_BITMASK |
            Teilnote_feedbackModelImpl.BEWERTUNGSKRITERIUM_ID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_FEEDBACK_IDANDBEWERTUNGSKRITERIUM_ID =
        new FinderPath(Teilnote_feedbackModelImpl.ENTITY_CACHE_ENABLED,
            Teilnote_feedbackModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByFeedback_idAndBewertungskriterium_id",
            new String[] { Long.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_FEEDBACK_IDANDBEWERTUNGSKRITERIUM_ID_FEEDBACK_ID_2 =
        "teilnote_feedback.feedback_id = ? AND ";
    private static final String _FINDER_COLUMN_FEEDBACK_IDANDBEWERTUNGSKRITERIUM_ID_BEWERTUNGSKRITERIUM_ID_2 =
        "teilnote_feedback.bewertungskriterium_id = ?";
    private static final String _SQL_SELECT_TEILNOTE_FEEDBACK = "SELECT teilnote_feedback FROM Teilnote_feedback teilnote_feedback";
    private static final String _SQL_SELECT_TEILNOTE_FEEDBACK_WHERE = "SELECT teilnote_feedback FROM Teilnote_feedback teilnote_feedback WHERE ";
    private static final String _SQL_COUNT_TEILNOTE_FEEDBACK = "SELECT COUNT(teilnote_feedback) FROM Teilnote_feedback teilnote_feedback";
    private static final String _SQL_COUNT_TEILNOTE_FEEDBACK_WHERE = "SELECT COUNT(teilnote_feedback) FROM Teilnote_feedback teilnote_feedback WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "teilnote_feedback.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Teilnote_feedback exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Teilnote_feedback exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(Teilnote_feedbackPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "id"
            });
    private static Teilnote_feedback _nullTeilnote_feedback = new Teilnote_feedbackImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Teilnote_feedback> toCacheModel() {
                return _nullTeilnote_feedbackCacheModel;
            }
        };

    private static CacheModel<Teilnote_feedback> _nullTeilnote_feedbackCacheModel =
        new CacheModel<Teilnote_feedback>() {
            @Override
            public Teilnote_feedback toEntityModel() {
                return _nullTeilnote_feedback;
            }
        };

    public Teilnote_feedbackPersistenceImpl() {
        setModelClass(Teilnote_feedback.class);
    }

    /**
     * Returns the teilnote_feedback where feedback_id = &#63; and bewertungskriterium_id = &#63; or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchTeilnote_feedbackException} if it could not be found.
     *
     * @param feedback_id the feedback_id
     * @param bewertungskriterium_id the bewertungskriterium_id
     * @return the matching teilnote_feedback
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchTeilnote_feedbackException if a matching teilnote_feedback could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Teilnote_feedback findByFeedback_idAndBewertungskriterium_id(
        long feedback_id, long bewertungskriterium_id)
        throws NoSuchTeilnote_feedbackException, SystemException {
        Teilnote_feedback teilnote_feedback = fetchByFeedback_idAndBewertungskriterium_id(feedback_id,
                bewertungskriterium_id);

        if (teilnote_feedback == null) {
            StringBundler msg = new StringBundler(6);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("feedback_id=");
            msg.append(feedback_id);

            msg.append(", bewertungskriterium_id=");
            msg.append(bewertungskriterium_id);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchTeilnote_feedbackException(msg.toString());
        }

        return teilnote_feedback;
    }

    /**
     * Returns the teilnote_feedback where feedback_id = &#63; and bewertungskriterium_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param feedback_id the feedback_id
     * @param bewertungskriterium_id the bewertungskriterium_id
     * @return the matching teilnote_feedback, or <code>null</code> if a matching teilnote_feedback could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Teilnote_feedback fetchByFeedback_idAndBewertungskriterium_id(
        long feedback_id, long bewertungskriterium_id)
        throws SystemException {
        return fetchByFeedback_idAndBewertungskriterium_id(feedback_id,
            bewertungskriterium_id, true);
    }

    /**
     * Returns the teilnote_feedback where feedback_id = &#63; and bewertungskriterium_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param feedback_id the feedback_id
     * @param bewertungskriterium_id the bewertungskriterium_id
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching teilnote_feedback, or <code>null</code> if a matching teilnote_feedback could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Teilnote_feedback fetchByFeedback_idAndBewertungskriterium_id(
        long feedback_id, long bewertungskriterium_id, boolean retrieveFromCache)
        throws SystemException {
        Object[] finderArgs = new Object[] { feedback_id, bewertungskriterium_id };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_FEEDBACK_IDANDBEWERTUNGSKRITERIUM_ID,
                    finderArgs, this);
        }

        if (result instanceof Teilnote_feedback) {
            Teilnote_feedback teilnote_feedback = (Teilnote_feedback) result;

            if ((feedback_id != teilnote_feedback.getFeedback_id()) ||
                    (bewertungskriterium_id != teilnote_feedback.getBewertungskriterium_id())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(4);

            query.append(_SQL_SELECT_TEILNOTE_FEEDBACK_WHERE);

            query.append(_FINDER_COLUMN_FEEDBACK_IDANDBEWERTUNGSKRITERIUM_ID_FEEDBACK_ID_2);

            query.append(_FINDER_COLUMN_FEEDBACK_IDANDBEWERTUNGSKRITERIUM_ID_BEWERTUNGSKRITERIUM_ID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(feedback_id);

                qPos.add(bewertungskriterium_id);

                List<Teilnote_feedback> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FEEDBACK_IDANDBEWERTUNGSKRITERIUM_ID,
                        finderArgs, list);
                } else {
                    if ((list.size() > 1) && _log.isWarnEnabled()) {
                        _log.warn(
                            "Teilnote_feedbackPersistenceImpl.fetchByFeedback_idAndBewertungskriterium_id(long, long, boolean) with parameters (" +
                            StringUtil.merge(finderArgs) +
                            ") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
                    }

                    Teilnote_feedback teilnote_feedback = list.get(0);

                    result = teilnote_feedback;

                    cacheResult(teilnote_feedback);

                    if ((teilnote_feedback.getFeedback_id() != feedback_id) ||
                            (teilnote_feedback.getBewertungskriterium_id() != bewertungskriterium_id)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FEEDBACK_IDANDBEWERTUNGSKRITERIUM_ID,
                            finderArgs, teilnote_feedback);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_FEEDBACK_IDANDBEWERTUNGSKRITERIUM_ID,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (Teilnote_feedback) result;
        }
    }

    /**
     * Removes the teilnote_feedback where feedback_id = &#63; and bewertungskriterium_id = &#63; from the database.
     *
     * @param feedback_id the feedback_id
     * @param bewertungskriterium_id the bewertungskriterium_id
     * @return the teilnote_feedback that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Teilnote_feedback removeByFeedback_idAndBewertungskriterium_id(
        long feedback_id, long bewertungskriterium_id)
        throws NoSuchTeilnote_feedbackException, SystemException {
        Teilnote_feedback teilnote_feedback = findByFeedback_idAndBewertungskriterium_id(feedback_id,
                bewertungskriterium_id);

        return remove(teilnote_feedback);
    }

    /**
     * Returns the number of teilnote_feedbacks where feedback_id = &#63; and bewertungskriterium_id = &#63;.
     *
     * @param feedback_id the feedback_id
     * @param bewertungskriterium_id the bewertungskriterium_id
     * @return the number of matching teilnote_feedbacks
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByFeedback_idAndBewertungskriterium_id(long feedback_id,
        long bewertungskriterium_id) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_FEEDBACK_IDANDBEWERTUNGSKRITERIUM_ID;

        Object[] finderArgs = new Object[] { feedback_id, bewertungskriterium_id };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_TEILNOTE_FEEDBACK_WHERE);

            query.append(_FINDER_COLUMN_FEEDBACK_IDANDBEWERTUNGSKRITERIUM_ID_FEEDBACK_ID_2);

            query.append(_FINDER_COLUMN_FEEDBACK_IDANDBEWERTUNGSKRITERIUM_ID_BEWERTUNGSKRITERIUM_ID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(feedback_id);

                qPos.add(bewertungskriterium_id);

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
     * Caches the teilnote_feedback in the entity cache if it is enabled.
     *
     * @param teilnote_feedback the teilnote_feedback
     */
    @Override
    public void cacheResult(Teilnote_feedback teilnote_feedback) {
        EntityCacheUtil.putResult(Teilnote_feedbackModelImpl.ENTITY_CACHE_ENABLED,
            Teilnote_feedbackImpl.class, teilnote_feedback.getPrimaryKey(),
            teilnote_feedback);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FEEDBACK_IDANDBEWERTUNGSKRITERIUM_ID,
            new Object[] {
                teilnote_feedback.getFeedback_id(),
                teilnote_feedback.getBewertungskriterium_id()
            }, teilnote_feedback);

        teilnote_feedback.resetOriginalValues();
    }

    /**
     * Caches the teilnote_feedbacks in the entity cache if it is enabled.
     *
     * @param teilnote_feedbacks the teilnote_feedbacks
     */
    @Override
    public void cacheResult(List<Teilnote_feedback> teilnote_feedbacks) {
        for (Teilnote_feedback teilnote_feedback : teilnote_feedbacks) {
            if (EntityCacheUtil.getResult(
                        Teilnote_feedbackModelImpl.ENTITY_CACHE_ENABLED,
                        Teilnote_feedbackImpl.class,
                        teilnote_feedback.getPrimaryKey()) == null) {
                cacheResult(teilnote_feedback);
            } else {
                teilnote_feedback.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all teilnote_feedbacks.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(Teilnote_feedbackImpl.class.getName());
        }

        EntityCacheUtil.clearCache(Teilnote_feedbackImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the teilnote_feedback.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Teilnote_feedback teilnote_feedback) {
        EntityCacheUtil.removeResult(Teilnote_feedbackModelImpl.ENTITY_CACHE_ENABLED,
            Teilnote_feedbackImpl.class, teilnote_feedback.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(teilnote_feedback);
    }

    @Override
    public void clearCache(List<Teilnote_feedback> teilnote_feedbacks) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Teilnote_feedback teilnote_feedback : teilnote_feedbacks) {
            EntityCacheUtil.removeResult(Teilnote_feedbackModelImpl.ENTITY_CACHE_ENABLED,
                Teilnote_feedbackImpl.class, teilnote_feedback.getPrimaryKey());

            clearUniqueFindersCache(teilnote_feedback);
        }
    }

    protected void cacheUniqueFindersCache(Teilnote_feedback teilnote_feedback) {
        if (teilnote_feedback.isNew()) {
            Object[] args = new Object[] {
                    teilnote_feedback.getFeedback_id(),
                    teilnote_feedback.getBewertungskriterium_id()
                };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FEEDBACK_IDANDBEWERTUNGSKRITERIUM_ID,
                args, Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FEEDBACK_IDANDBEWERTUNGSKRITERIUM_ID,
                args, teilnote_feedback);
        } else {
            Teilnote_feedbackModelImpl teilnote_feedbackModelImpl = (Teilnote_feedbackModelImpl) teilnote_feedback;

            if ((teilnote_feedbackModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_FEEDBACK_IDANDBEWERTUNGSKRITERIUM_ID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        teilnote_feedback.getFeedback_id(),
                        teilnote_feedback.getBewertungskriterium_id()
                    };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FEEDBACK_IDANDBEWERTUNGSKRITERIUM_ID,
                    args, Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FEEDBACK_IDANDBEWERTUNGSKRITERIUM_ID,
                    args, teilnote_feedback);
            }
        }
    }

    protected void clearUniqueFindersCache(Teilnote_feedback teilnote_feedback) {
        Teilnote_feedbackModelImpl teilnote_feedbackModelImpl = (Teilnote_feedbackModelImpl) teilnote_feedback;

        Object[] args = new Object[] {
                teilnote_feedback.getFeedback_id(),
                teilnote_feedback.getBewertungskriterium_id()
            };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FEEDBACK_IDANDBEWERTUNGSKRITERIUM_ID,
            args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_FEEDBACK_IDANDBEWERTUNGSKRITERIUM_ID,
            args);

        if ((teilnote_feedbackModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_FEEDBACK_IDANDBEWERTUNGSKRITERIUM_ID.getColumnBitmask()) != 0) {
            args = new Object[] {
                    teilnote_feedbackModelImpl.getOriginalFeedback_id(),
                    teilnote_feedbackModelImpl.getOriginalBewertungskriterium_id()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FEEDBACK_IDANDBEWERTUNGSKRITERIUM_ID,
                args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_FEEDBACK_IDANDBEWERTUNGSKRITERIUM_ID,
                args);
        }
    }

    /**
     * Creates a new teilnote_feedback with the primary key. Does not add the teilnote_feedback to the database.
     *
     * @param id the primary key for the new teilnote_feedback
     * @return the new teilnote_feedback
     */
    @Override
    public Teilnote_feedback create(long id) {
        Teilnote_feedback teilnote_feedback = new Teilnote_feedbackImpl();

        teilnote_feedback.setNew(true);
        teilnote_feedback.setPrimaryKey(id);

        return teilnote_feedback;
    }

    /**
     * Removes the teilnote_feedback with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the teilnote_feedback
     * @return the teilnote_feedback that was removed
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchTeilnote_feedbackException if a teilnote_feedback with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Teilnote_feedback remove(long id)
        throws NoSuchTeilnote_feedbackException, SystemException {
        return remove((Serializable) id);
    }

    /**
     * Removes the teilnote_feedback with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the teilnote_feedback
     * @return the teilnote_feedback that was removed
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchTeilnote_feedbackException if a teilnote_feedback with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Teilnote_feedback remove(Serializable primaryKey)
        throws NoSuchTeilnote_feedbackException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Teilnote_feedback teilnote_feedback = (Teilnote_feedback) session.get(Teilnote_feedbackImpl.class,
                    primaryKey);

            if (teilnote_feedback == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchTeilnote_feedbackException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(teilnote_feedback);
        } catch (NoSuchTeilnote_feedbackException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Teilnote_feedback removeImpl(Teilnote_feedback teilnote_feedback)
        throws SystemException {
        teilnote_feedback = toUnwrappedModel(teilnote_feedback);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(teilnote_feedback)) {
                teilnote_feedback = (Teilnote_feedback) session.get(Teilnote_feedbackImpl.class,
                        teilnote_feedback.getPrimaryKeyObj());
            }

            if (teilnote_feedback != null) {
                session.delete(teilnote_feedback);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (teilnote_feedback != null) {
            clearCache(teilnote_feedback);
        }

        return teilnote_feedback;
    }

    @Override
    public Teilnote_feedback updateImpl(
        de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback teilnote_feedback)
        throws SystemException {
        teilnote_feedback = toUnwrappedModel(teilnote_feedback);

        boolean isNew = teilnote_feedback.isNew();

        Session session = null;

        try {
            session = openSession();

            if (teilnote_feedback.isNew()) {
                session.save(teilnote_feedback);

                teilnote_feedback.setNew(false);
            } else {
                session.merge(teilnote_feedback);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !Teilnote_feedbackModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(Teilnote_feedbackModelImpl.ENTITY_CACHE_ENABLED,
            Teilnote_feedbackImpl.class, teilnote_feedback.getPrimaryKey(),
            teilnote_feedback);

        clearUniqueFindersCache(teilnote_feedback);
        cacheUniqueFindersCache(teilnote_feedback);

        return teilnote_feedback;
    }

    protected Teilnote_feedback toUnwrappedModel(
        Teilnote_feedback teilnote_feedback) {
        if (teilnote_feedback instanceof Teilnote_feedbackImpl) {
            return teilnote_feedback;
        }

        Teilnote_feedbackImpl teilnote_feedbackImpl = new Teilnote_feedbackImpl();

        teilnote_feedbackImpl.setNew(teilnote_feedback.isNew());
        teilnote_feedbackImpl.setPrimaryKey(teilnote_feedback.getPrimaryKey());

        teilnote_feedbackImpl.setId(teilnote_feedback.getId());
        teilnote_feedbackImpl.setFeedback_id(teilnote_feedback.getFeedback_id());
        teilnote_feedbackImpl.setNote(teilnote_feedback.getNote());
        teilnote_feedbackImpl.setBewertungskriterium_id(teilnote_feedback.getBewertungskriterium_id());

        return teilnote_feedbackImpl;
    }

    /**
     * Returns the teilnote_feedback with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the teilnote_feedback
     * @return the teilnote_feedback
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchTeilnote_feedbackException if a teilnote_feedback with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Teilnote_feedback findByPrimaryKey(Serializable primaryKey)
        throws NoSuchTeilnote_feedbackException, SystemException {
        Teilnote_feedback teilnote_feedback = fetchByPrimaryKey(primaryKey);

        if (teilnote_feedback == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchTeilnote_feedbackException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return teilnote_feedback;
    }

    /**
     * Returns the teilnote_feedback with the primary key or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchTeilnote_feedbackException} if it could not be found.
     *
     * @param id the primary key of the teilnote_feedback
     * @return the teilnote_feedback
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchTeilnote_feedbackException if a teilnote_feedback with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Teilnote_feedback findByPrimaryKey(long id)
        throws NoSuchTeilnote_feedbackException, SystemException {
        return findByPrimaryKey((Serializable) id);
    }

    /**
     * Returns the teilnote_feedback with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the teilnote_feedback
     * @return the teilnote_feedback, or <code>null</code> if a teilnote_feedback with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Teilnote_feedback fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Teilnote_feedback teilnote_feedback = (Teilnote_feedback) EntityCacheUtil.getResult(Teilnote_feedbackModelImpl.ENTITY_CACHE_ENABLED,
                Teilnote_feedbackImpl.class, primaryKey);

        if (teilnote_feedback == _nullTeilnote_feedback) {
            return null;
        }

        if (teilnote_feedback == null) {
            Session session = null;

            try {
                session = openSession();

                teilnote_feedback = (Teilnote_feedback) session.get(Teilnote_feedbackImpl.class,
                        primaryKey);

                if (teilnote_feedback != null) {
                    cacheResult(teilnote_feedback);
                } else {
                    EntityCacheUtil.putResult(Teilnote_feedbackModelImpl.ENTITY_CACHE_ENABLED,
                        Teilnote_feedbackImpl.class, primaryKey,
                        _nullTeilnote_feedback);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(Teilnote_feedbackModelImpl.ENTITY_CACHE_ENABLED,
                    Teilnote_feedbackImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return teilnote_feedback;
    }

    /**
     * Returns the teilnote_feedback with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the teilnote_feedback
     * @return the teilnote_feedback, or <code>null</code> if a teilnote_feedback with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Teilnote_feedback fetchByPrimaryKey(long id)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) id);
    }

    /**
     * Returns all the teilnote_feedbacks.
     *
     * @return the teilnote_feedbacks
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Teilnote_feedback> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the teilnote_feedbacks.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Teilnote_feedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of teilnote_feedbacks
     * @param end the upper bound of the range of teilnote_feedbacks (not inclusive)
     * @return the range of teilnote_feedbacks
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Teilnote_feedback> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the teilnote_feedbacks.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Teilnote_feedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of teilnote_feedbacks
     * @param end the upper bound of the range of teilnote_feedbacks (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of teilnote_feedbacks
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Teilnote_feedback> findAll(int start, int end,
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

        List<Teilnote_feedback> list = (List<Teilnote_feedback>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_TEILNOTE_FEEDBACK);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_TEILNOTE_FEEDBACK;

                if (pagination) {
                    sql = sql.concat(Teilnote_feedbackModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Teilnote_feedback>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Teilnote_feedback>(list);
                } else {
                    list = (List<Teilnote_feedback>) QueryUtil.list(q,
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
     * Removes all the teilnote_feedbacks from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Teilnote_feedback teilnote_feedback : findAll()) {
            remove(teilnote_feedback);
        }
    }

    /**
     * Returns the number of teilnote_feedbacks.
     *
     * @return the number of teilnote_feedbacks
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

                Query q = session.createQuery(_SQL_COUNT_TEILNOTE_FEEDBACK);

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
     * Initializes the teilnote_feedback persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Teilnote_feedback>> listenersList = new ArrayList<ModelListener<Teilnote_feedback>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Teilnote_feedback>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(Teilnote_feedbackImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
