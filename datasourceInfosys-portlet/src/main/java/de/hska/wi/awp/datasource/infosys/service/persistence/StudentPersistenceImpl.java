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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import de.hska.wi.awp.datasource.infosys.NoSuchStudentException;
import de.hska.wi.awp.datasource.infosys.model.Student;
import de.hska.wi.awp.datasource.infosys.model.impl.StudentImpl;
import de.hska.wi.awp.datasource.infosys.model.impl.StudentModelImpl;
import de.hska.wi.awp.datasource.infosys.service.persistence.StudentPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the student service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Daniel Storch
 * @see StudentPersistence
 * @see StudentUtil
 * @generated
 */
public class StudentPersistenceImpl extends BasePersistenceImpl<Student>
    implements StudentPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link StudentUtil} to access the student persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = StudentImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(StudentModelImpl.ENTITY_CACHE_ENABLED,
            StudentModelImpl.FINDER_CACHE_ENABLED, StudentImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(StudentModelImpl.ENTITY_CACHE_ENABLED,
            StudentModelImpl.FINDER_CACHE_ENABLED, StudentImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(StudentModelImpl.ENTITY_CACHE_ENABLED,
            StudentModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_FETCH_BY_STUDENTHSKAID = new FinderPath(StudentModelImpl.ENTITY_CACHE_ENABLED,
            StudentModelImpl.FINDER_CACHE_ENABLED, StudentImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByStudenthskaId",
            new String[] { String.class.getName() },
            StudentModelImpl.STUDENTHSKAID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_STUDENTHSKAID = new FinderPath(StudentModelImpl.ENTITY_CACHE_ENABLED,
            StudentModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByStudenthskaId",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_STUDENTHSKAID_STUDENTHSKAID_1 = "student.studenthskaId IS NULL";
    private static final String _FINDER_COLUMN_STUDENTHSKAID_STUDENTHSKAID_2 = "student.studenthskaId = ?";
    private static final String _FINDER_COLUMN_STUDENTHSKAID_STUDENTHSKAID_3 = "(student.studenthskaId IS NULL OR student.studenthskaId = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PROJECT_ID =
        new FinderPath(StudentModelImpl.ENTITY_CACHE_ENABLED,
            StudentModelImpl.FINDER_CACHE_ENABLED, StudentImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByProject_id",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROJECT_ID =
        new FinderPath(StudentModelImpl.ENTITY_CACHE_ENABLED,
            StudentModelImpl.FINDER_CACHE_ENABLED, StudentImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByProject_id",
            new String[] { Long.class.getName() },
            StudentModelImpl.PROJECT_ID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_PROJECT_ID = new FinderPath(StudentModelImpl.ENTITY_CACHE_ENABLED,
            StudentModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByProject_id",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_PROJECT_ID_PROJECT_ID_2 = "student.project_id = ?";
    private static final String _SQL_SELECT_STUDENT = "SELECT student FROM Student student";
    private static final String _SQL_SELECT_STUDENT_WHERE = "SELECT student FROM Student student WHERE ";
    private static final String _SQL_COUNT_STUDENT = "SELECT COUNT(student) FROM Student student";
    private static final String _SQL_COUNT_STUDENT_WHERE = "SELECT COUNT(student) FROM Student student WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "student.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Student exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Student exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(StudentPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "id"
            });
    private static Student _nullStudent = new StudentImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Student> toCacheModel() {
                return _nullStudentCacheModel;
            }
        };

    private static CacheModel<Student> _nullStudentCacheModel = new CacheModel<Student>() {
            @Override
            public Student toEntityModel() {
                return _nullStudent;
            }
        };

    public StudentPersistenceImpl() {
        setModelClass(Student.class);
    }

    /**
     * Returns the student where studenthskaId = &#63; or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchStudentException} if it could not be found.
     *
     * @param studenthskaId the studenthska ID
     * @return the matching student
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchStudentException if a matching student could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Student findByStudenthskaId(String studenthskaId)
        throws NoSuchStudentException, SystemException {
        Student student = fetchByStudenthskaId(studenthskaId);

        if (student == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("studenthskaId=");
            msg.append(studenthskaId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchStudentException(msg.toString());
        }

        return student;
    }

    /**
     * Returns the student where studenthskaId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param studenthskaId the studenthska ID
     * @return the matching student, or <code>null</code> if a matching student could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Student fetchByStudenthskaId(String studenthskaId)
        throws SystemException {
        return fetchByStudenthskaId(studenthskaId, true);
    }

    /**
     * Returns the student where studenthskaId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param studenthskaId the studenthska ID
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching student, or <code>null</code> if a matching student could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Student fetchByStudenthskaId(String studenthskaId,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { studenthskaId };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_STUDENTHSKAID,
                    finderArgs, this);
        }

        if (result instanceof Student) {
            Student student = (Student) result;

            if (!Validator.equals(studenthskaId, student.getStudenthskaId())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_STUDENT_WHERE);

            boolean bindStudenthskaId = false;

            if (studenthskaId == null) {
                query.append(_FINDER_COLUMN_STUDENTHSKAID_STUDENTHSKAID_1);
            } else if (studenthskaId.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_STUDENTHSKAID_STUDENTHSKAID_3);
            } else {
                bindStudenthskaId = true;

                query.append(_FINDER_COLUMN_STUDENTHSKAID_STUDENTHSKAID_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindStudenthskaId) {
                    qPos.add(studenthskaId);
                }

                List<Student> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_STUDENTHSKAID,
                        finderArgs, list);
                } else {
                    if ((list.size() > 1) && _log.isWarnEnabled()) {
                        _log.warn(
                            "StudentPersistenceImpl.fetchByStudenthskaId(String, boolean) with parameters (" +
                            StringUtil.merge(finderArgs) +
                            ") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
                    }

                    Student student = list.get(0);

                    result = student;

                    cacheResult(student);

                    if ((student.getStudenthskaId() == null) ||
                            !student.getStudenthskaId().equals(studenthskaId)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_STUDENTHSKAID,
                            finderArgs, student);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_STUDENTHSKAID,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (Student) result;
        }
    }

    /**
     * Removes the student where studenthskaId = &#63; from the database.
     *
     * @param studenthskaId the studenthska ID
     * @return the student that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Student removeByStudenthskaId(String studenthskaId)
        throws NoSuchStudentException, SystemException {
        Student student = findByStudenthskaId(studenthskaId);

        return remove(student);
    }

    /**
     * Returns the number of students where studenthskaId = &#63;.
     *
     * @param studenthskaId the studenthska ID
     * @return the number of matching students
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByStudenthskaId(String studenthskaId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_STUDENTHSKAID;

        Object[] finderArgs = new Object[] { studenthskaId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_STUDENT_WHERE);

            boolean bindStudenthskaId = false;

            if (studenthskaId == null) {
                query.append(_FINDER_COLUMN_STUDENTHSKAID_STUDENTHSKAID_1);
            } else if (studenthskaId.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_STUDENTHSKAID_STUDENTHSKAID_3);
            } else {
                bindStudenthskaId = true;

                query.append(_FINDER_COLUMN_STUDENTHSKAID_STUDENTHSKAID_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindStudenthskaId) {
                    qPos.add(studenthskaId);
                }

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
     * Returns all the students where project_id = &#63;.
     *
     * @param project_id the project_id
     * @return the matching students
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Student> findByProject_id(long project_id)
        throws SystemException {
        return findByProject_id(project_id, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the students where project_id = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param project_id the project_id
     * @param start the lower bound of the range of students
     * @param end the upper bound of the range of students (not inclusive)
     * @return the range of matching students
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Student> findByProject_id(long project_id, int start, int end)
        throws SystemException {
        return findByProject_id(project_id, start, end, null);
    }

    /**
     * Returns an ordered range of all the students where project_id = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param project_id the project_id
     * @param start the lower bound of the range of students
     * @param end the upper bound of the range of students (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching students
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Student> findByProject_id(long project_id, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROJECT_ID;
            finderArgs = new Object[] { project_id };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PROJECT_ID;
            finderArgs = new Object[] { project_id, start, end, orderByComparator };
        }

        List<Student> list = (List<Student>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Student student : list) {
                if ((project_id != student.getProject_id())) {
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

            query.append(_SQL_SELECT_STUDENT_WHERE);

            query.append(_FINDER_COLUMN_PROJECT_ID_PROJECT_ID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(StudentModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(project_id);

                if (!pagination) {
                    list = (List<Student>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Student>(list);
                } else {
                    list = (List<Student>) QueryUtil.list(q, getDialect(),
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
     * Returns the first student in the ordered set where project_id = &#63;.
     *
     * @param project_id the project_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching student
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchStudentException if a matching student could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Student findByProject_id_First(long project_id,
        OrderByComparator orderByComparator)
        throws NoSuchStudentException, SystemException {
        Student student = fetchByProject_id_First(project_id, orderByComparator);

        if (student != null) {
            return student;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("project_id=");
        msg.append(project_id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchStudentException(msg.toString());
    }

    /**
     * Returns the first student in the ordered set where project_id = &#63;.
     *
     * @param project_id the project_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching student, or <code>null</code> if a matching student could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Student fetchByProject_id_First(long project_id,
        OrderByComparator orderByComparator) throws SystemException {
        List<Student> list = findByProject_id(project_id, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last student in the ordered set where project_id = &#63;.
     *
     * @param project_id the project_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching student
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchStudentException if a matching student could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Student findByProject_id_Last(long project_id,
        OrderByComparator orderByComparator)
        throws NoSuchStudentException, SystemException {
        Student student = fetchByProject_id_Last(project_id, orderByComparator);

        if (student != null) {
            return student;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("project_id=");
        msg.append(project_id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchStudentException(msg.toString());
    }

    /**
     * Returns the last student in the ordered set where project_id = &#63;.
     *
     * @param project_id the project_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching student, or <code>null</code> if a matching student could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Student fetchByProject_id_Last(long project_id,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByProject_id(project_id);

        if (count == 0) {
            return null;
        }

        List<Student> list = findByProject_id(project_id, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the students before and after the current student in the ordered set where project_id = &#63;.
     *
     * @param id the primary key of the current student
     * @param project_id the project_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next student
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchStudentException if a student with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Student[] findByProject_id_PrevAndNext(long id, long project_id,
        OrderByComparator orderByComparator)
        throws NoSuchStudentException, SystemException {
        Student student = findByPrimaryKey(id);

        Session session = null;

        try {
            session = openSession();

            Student[] array = new StudentImpl[3];

            array[0] = getByProject_id_PrevAndNext(session, student,
                    project_id, orderByComparator, true);

            array[1] = student;

            array[2] = getByProject_id_PrevAndNext(session, student,
                    project_id, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Student getByProject_id_PrevAndNext(Session session,
        Student student, long project_id, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_STUDENT_WHERE);

        query.append(_FINDER_COLUMN_PROJECT_ID_PROJECT_ID_2);

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
            query.append(StudentModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(project_id);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(student);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Student> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the students where project_id = &#63; from the database.
     *
     * @param project_id the project_id
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByProject_id(long project_id) throws SystemException {
        for (Student student : findByProject_id(project_id, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(student);
        }
    }

    /**
     * Returns the number of students where project_id = &#63;.
     *
     * @param project_id the project_id
     * @return the number of matching students
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByProject_id(long project_id) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_PROJECT_ID;

        Object[] finderArgs = new Object[] { project_id };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_STUDENT_WHERE);

            query.append(_FINDER_COLUMN_PROJECT_ID_PROJECT_ID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(project_id);

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
     * Caches the student in the entity cache if it is enabled.
     *
     * @param student the student
     */
    @Override
    public void cacheResult(Student student) {
        EntityCacheUtil.putResult(StudentModelImpl.ENTITY_CACHE_ENABLED,
            StudentImpl.class, student.getPrimaryKey(), student);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_STUDENTHSKAID,
            new Object[] { student.getStudenthskaId() }, student);

        student.resetOriginalValues();
    }

    /**
     * Caches the students in the entity cache if it is enabled.
     *
     * @param students the students
     */
    @Override
    public void cacheResult(List<Student> students) {
        for (Student student : students) {
            if (EntityCacheUtil.getResult(
                        StudentModelImpl.ENTITY_CACHE_ENABLED,
                        StudentImpl.class, student.getPrimaryKey()) == null) {
                cacheResult(student);
            } else {
                student.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all students.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(StudentImpl.class.getName());
        }

        EntityCacheUtil.clearCache(StudentImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the student.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Student student) {
        EntityCacheUtil.removeResult(StudentModelImpl.ENTITY_CACHE_ENABLED,
            StudentImpl.class, student.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(student);
    }

    @Override
    public void clearCache(List<Student> students) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Student student : students) {
            EntityCacheUtil.removeResult(StudentModelImpl.ENTITY_CACHE_ENABLED,
                StudentImpl.class, student.getPrimaryKey());

            clearUniqueFindersCache(student);
        }
    }

    protected void cacheUniqueFindersCache(Student student) {
        if (student.isNew()) {
            Object[] args = new Object[] { student.getStudenthskaId() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_STUDENTHSKAID, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_STUDENTHSKAID, args,
                student);
        } else {
            StudentModelImpl studentModelImpl = (StudentModelImpl) student;

            if ((studentModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_STUDENTHSKAID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { student.getStudenthskaId() };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_STUDENTHSKAID,
                    args, Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_STUDENTHSKAID,
                    args, student);
            }
        }
    }

    protected void clearUniqueFindersCache(Student student) {
        StudentModelImpl studentModelImpl = (StudentModelImpl) student;

        Object[] args = new Object[] { student.getStudenthskaId() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STUDENTHSKAID, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_STUDENTHSKAID, args);

        if ((studentModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_STUDENTHSKAID.getColumnBitmask()) != 0) {
            args = new Object[] { studentModelImpl.getOriginalStudenthskaId() };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STUDENTHSKAID,
                args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_STUDENTHSKAID,
                args);
        }
    }

    /**
     * Creates a new student with the primary key. Does not add the student to the database.
     *
     * @param id the primary key for the new student
     * @return the new student
     */
    @Override
    public Student create(long id) {
        Student student = new StudentImpl();

        student.setNew(true);
        student.setPrimaryKey(id);

        return student;
    }

    /**
     * Removes the student with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the student
     * @return the student that was removed
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchStudentException if a student with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Student remove(long id)
        throws NoSuchStudentException, SystemException {
        return remove((Serializable) id);
    }

    /**
     * Removes the student with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the student
     * @return the student that was removed
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchStudentException if a student with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Student remove(Serializable primaryKey)
        throws NoSuchStudentException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Student student = (Student) session.get(StudentImpl.class,
                    primaryKey);

            if (student == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchStudentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(student);
        } catch (NoSuchStudentException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Student removeImpl(Student student) throws SystemException {
        student = toUnwrappedModel(student);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(student)) {
                student = (Student) session.get(StudentImpl.class,
                        student.getPrimaryKeyObj());
            }

            if (student != null) {
                session.delete(student);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (student != null) {
            clearCache(student);
        }

        return student;
    }

    @Override
    public Student updateImpl(
        de.hska.wi.awp.datasource.infosys.model.Student student)
        throws SystemException {
        student = toUnwrappedModel(student);

        boolean isNew = student.isNew();

        StudentModelImpl studentModelImpl = (StudentModelImpl) student;

        Session session = null;

        try {
            session = openSession();

            if (student.isNew()) {
                session.save(student);

                student.setNew(false);
            } else {
                session.merge(student);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !StudentModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((studentModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROJECT_ID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        studentModelImpl.getOriginalProject_id()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PROJECT_ID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROJECT_ID,
                    args);

                args = new Object[] { studentModelImpl.getProject_id() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PROJECT_ID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROJECT_ID,
                    args);
            }
        }

        EntityCacheUtil.putResult(StudentModelImpl.ENTITY_CACHE_ENABLED,
            StudentImpl.class, student.getPrimaryKey(), student);

        clearUniqueFindersCache(student);
        cacheUniqueFindersCache(student);

        return student;
    }

    protected Student toUnwrappedModel(Student student) {
        if (student instanceof StudentImpl) {
            return student;
        }

        StudentImpl studentImpl = new StudentImpl();

        studentImpl.setNew(student.isNew());
        studentImpl.setPrimaryKey(student.getPrimaryKey());

        studentImpl.setFirstName(student.getFirstName());
        studentImpl.setLastName(student.getLastName());
        studentImpl.setId(student.getId());
        studentImpl.setProject_id(student.getProject_id());
        studentImpl.setStudenthskaId(student.getStudenthskaId());
        studentImpl.setMatnr(student.getMatnr());
        studentImpl.setRole(student.getRole());

        return studentImpl;
    }

    /**
     * Returns the student with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the student
     * @return the student
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchStudentException if a student with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Student findByPrimaryKey(Serializable primaryKey)
        throws NoSuchStudentException, SystemException {
        Student student = fetchByPrimaryKey(primaryKey);

        if (student == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchStudentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return student;
    }

    /**
     * Returns the student with the primary key or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchStudentException} if it could not be found.
     *
     * @param id the primary key of the student
     * @return the student
     * @throws de.hska.wi.awp.datasource.infosys.NoSuchStudentException if a student with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Student findByPrimaryKey(long id)
        throws NoSuchStudentException, SystemException {
        return findByPrimaryKey((Serializable) id);
    }

    /**
     * Returns the student with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the student
     * @return the student, or <code>null</code> if a student with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Student fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Student student = (Student) EntityCacheUtil.getResult(StudentModelImpl.ENTITY_CACHE_ENABLED,
                StudentImpl.class, primaryKey);

        if (student == _nullStudent) {
            return null;
        }

        if (student == null) {
            Session session = null;

            try {
                session = openSession();

                student = (Student) session.get(StudentImpl.class, primaryKey);

                if (student != null) {
                    cacheResult(student);
                } else {
                    EntityCacheUtil.putResult(StudentModelImpl.ENTITY_CACHE_ENABLED,
                        StudentImpl.class, primaryKey, _nullStudent);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(StudentModelImpl.ENTITY_CACHE_ENABLED,
                    StudentImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return student;
    }

    /**
     * Returns the student with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the student
     * @return the student, or <code>null</code> if a student with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Student fetchByPrimaryKey(long id) throws SystemException {
        return fetchByPrimaryKey((Serializable) id);
    }

    /**
     * Returns all the students.
     *
     * @return the students
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Student> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the students.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of students
     * @param end the upper bound of the range of students (not inclusive)
     * @return the range of students
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Student> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the students.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of students
     * @param end the upper bound of the range of students (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of students
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Student> findAll(int start, int end,
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

        List<Student> list = (List<Student>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_STUDENT);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_STUDENT;

                if (pagination) {
                    sql = sql.concat(StudentModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Student>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Student>(list);
                } else {
                    list = (List<Student>) QueryUtil.list(q, getDialect(),
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
     * Removes all the students from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Student student : findAll()) {
            remove(student);
        }
    }

    /**
     * Returns the number of students.
     *
     * @return the number of students
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

                Query q = session.createQuery(_SQL_COUNT_STUDENT);

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
     * Initializes the student persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.de.hska.wi.awp.datasource.infosys.model.Student")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Student>> listenersList = new ArrayList<ModelListener<Student>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Student>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(StudentImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
