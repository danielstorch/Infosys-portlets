package de.hska.wi.awp.datasource.infosys.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import de.hska.wi.awp.datasource.infosys.model.Student;

import java.util.List;

/**
 * The persistence utility for the student service. This utility wraps {@link StudentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Daniel Storch
 * @see StudentPersistence
 * @see StudentPersistenceImpl
 * @generated
 */
public class StudentUtil {
    private static StudentPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Student student) {
        getPersistence().clearCache(student);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Student> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Student> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Student> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Student update(Student student) throws SystemException {
        return getPersistence().update(student);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Student update(Student student, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(student, serviceContext);
    }

    /**
    * Returns the student where studenthskaId = &#63; or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchStudentException} if it could not be found.
    *
    * @param studenthskaId the studenthska ID
    * @return the matching student
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchStudentException if a matching student could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Student findByStudenthskaId(
        java.lang.String studenthskaId)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchStudentException {
        return getPersistence().findByStudenthskaId(studenthskaId);
    }

    /**
    * Returns the student where studenthskaId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param studenthskaId the studenthska ID
    * @return the matching student, or <code>null</code> if a matching student could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Student fetchByStudenthskaId(
        java.lang.String studenthskaId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByStudenthskaId(studenthskaId);
    }

    /**
    * Returns the student where studenthskaId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param studenthskaId the studenthska ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching student, or <code>null</code> if a matching student could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Student fetchByStudenthskaId(
        java.lang.String studenthskaId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByStudenthskaId(studenthskaId, retrieveFromCache);
    }

    /**
    * Removes the student where studenthskaId = &#63; from the database.
    *
    * @param studenthskaId the studenthska ID
    * @return the student that was removed
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Student removeByStudenthskaId(
        java.lang.String studenthskaId)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchStudentException {
        return getPersistence().removeByStudenthskaId(studenthskaId);
    }

    /**
    * Returns the number of students where studenthskaId = &#63;.
    *
    * @param studenthskaId the studenthska ID
    * @return the number of matching students
    * @throws SystemException if a system exception occurred
    */
    public static int countByStudenthskaId(java.lang.String studenthskaId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByStudenthskaId(studenthskaId);
    }

    /**
    * Returns all the students where project_id = &#63;.
    *
    * @param project_id the project_id
    * @return the matching students
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Student> findByProject_id(
        long project_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByProject_id(project_id);
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
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Student> findByProject_id(
        long project_id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByProject_id(project_id, start, end);
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
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Student> findByProject_id(
        long project_id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByProject_id(project_id, start, end, orderByComparator);
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
    public static de.hska.wi.awp.datasource.infosys.model.Student findByProject_id_First(
        long project_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchStudentException {
        return getPersistence()
                   .findByProject_id_First(project_id, orderByComparator);
    }

    /**
    * Returns the first student in the ordered set where project_id = &#63;.
    *
    * @param project_id the project_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching student, or <code>null</code> if a matching student could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Student fetchByProject_id_First(
        long project_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByProject_id_First(project_id, orderByComparator);
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
    public static de.hska.wi.awp.datasource.infosys.model.Student findByProject_id_Last(
        long project_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchStudentException {
        return getPersistence()
                   .findByProject_id_Last(project_id, orderByComparator);
    }

    /**
    * Returns the last student in the ordered set where project_id = &#63;.
    *
    * @param project_id the project_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching student, or <code>null</code> if a matching student could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Student fetchByProject_id_Last(
        long project_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByProject_id_Last(project_id, orderByComparator);
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
    public static de.hska.wi.awp.datasource.infosys.model.Student[] findByProject_id_PrevAndNext(
        long id, long project_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchStudentException {
        return getPersistence()
                   .findByProject_id_PrevAndNext(id, project_id,
            orderByComparator);
    }

    /**
    * Removes all the students where project_id = &#63; from the database.
    *
    * @param project_id the project_id
    * @throws SystemException if a system exception occurred
    */
    public static void removeByProject_id(long project_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByProject_id(project_id);
    }

    /**
    * Returns the number of students where project_id = &#63;.
    *
    * @param project_id the project_id
    * @return the number of matching students
    * @throws SystemException if a system exception occurred
    */
    public static int countByProject_id(long project_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByProject_id(project_id);
    }

    /**
    * Caches the student in the entity cache if it is enabled.
    *
    * @param student the student
    */
    public static void cacheResult(
        de.hska.wi.awp.datasource.infosys.model.Student student) {
        getPersistence().cacheResult(student);
    }

    /**
    * Caches the students in the entity cache if it is enabled.
    *
    * @param students the students
    */
    public static void cacheResult(
        java.util.List<de.hska.wi.awp.datasource.infosys.model.Student> students) {
        getPersistence().cacheResult(students);
    }

    /**
    * Creates a new student with the primary key. Does not add the student to the database.
    *
    * @param id the primary key for the new student
    * @return the new student
    */
    public static de.hska.wi.awp.datasource.infosys.model.Student create(
        long id) {
        return getPersistence().create(id);
    }

    /**
    * Removes the student with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the student
    * @return the student that was removed
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchStudentException if a student with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Student remove(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchStudentException {
        return getPersistence().remove(id);
    }

    public static de.hska.wi.awp.datasource.infosys.model.Student updateImpl(
        de.hska.wi.awp.datasource.infosys.model.Student student)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(student);
    }

    /**
    * Returns the student with the primary key or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchStudentException} if it could not be found.
    *
    * @param id the primary key of the student
    * @return the student
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchStudentException if a student with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Student findByPrimaryKey(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchStudentException {
        return getPersistence().findByPrimaryKey(id);
    }

    /**
    * Returns the student with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the student
    * @return the student, or <code>null</code> if a student with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Student fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(id);
    }

    /**
    * Returns all the students.
    *
    * @return the students
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Student> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Student> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
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
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Student> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the students from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of students.
    *
    * @return the number of students
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static StudentPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (StudentPersistence) PortletBeanLocatorUtil.locate(de.hska.wi.awp.datasource.infosys.service.ClpSerializer.getServletContextName(),
                    StudentPersistence.class.getName());

            ReferenceRegistry.registerReference(StudentUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(StudentPersistence persistence) {
    }
}
