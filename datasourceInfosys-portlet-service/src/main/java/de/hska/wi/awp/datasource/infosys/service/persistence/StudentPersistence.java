package de.hska.wi.awp.datasource.infosys.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import de.hska.wi.awp.datasource.infosys.model.Student;

/**
 * The persistence interface for the student service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Daniel Storch
 * @see StudentPersistenceImpl
 * @see StudentUtil
 * @generated
 */
public interface StudentPersistence extends BasePersistence<Student> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link StudentUtil} to access the student persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns the student where studenthskaId = &#63; or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchStudentException} if it could not be found.
    *
    * @param studenthskaId the studenthska ID
    * @return the matching student
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchStudentException if a matching student could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Student findByStudenthskaId(
        java.lang.String studenthskaId)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchStudentException;

    /**
    * Returns the student where studenthskaId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param studenthskaId the studenthska ID
    * @return the matching student, or <code>null</code> if a matching student could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Student fetchByStudenthskaId(
        java.lang.String studenthskaId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the student where studenthskaId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param studenthskaId the studenthska ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching student, or <code>null</code> if a matching student could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Student fetchByStudenthskaId(
        java.lang.String studenthskaId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the student where studenthskaId = &#63; from the database.
    *
    * @param studenthskaId the studenthska ID
    * @return the student that was removed
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Student removeByStudenthskaId(
        java.lang.String studenthskaId)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchStudentException;

    /**
    * Returns the number of students where studenthskaId = &#63;.
    *
    * @param studenthskaId the studenthska ID
    * @return the number of matching students
    * @throws SystemException if a system exception occurred
    */
    public int countByStudenthskaId(java.lang.String studenthskaId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the students where project_id = &#63;.
    *
    * @param project_id the project_id
    * @return the matching students
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Student> findByProject_id(
        long project_id)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Student> findByProject_id(
        long project_id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Student> findByProject_id(
        long project_id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first student in the ordered set where project_id = &#63;.
    *
    * @param project_id the project_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching student
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchStudentException if a matching student could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Student findByProject_id_First(
        long project_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchStudentException;

    /**
    * Returns the first student in the ordered set where project_id = &#63;.
    *
    * @param project_id the project_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching student, or <code>null</code> if a matching student could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Student fetchByProject_id_First(
        long project_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last student in the ordered set where project_id = &#63;.
    *
    * @param project_id the project_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching student
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchStudentException if a matching student could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Student findByProject_id_Last(
        long project_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchStudentException;

    /**
    * Returns the last student in the ordered set where project_id = &#63;.
    *
    * @param project_id the project_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching student, or <code>null</code> if a matching student could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Student fetchByProject_id_Last(
        long project_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public de.hska.wi.awp.datasource.infosys.model.Student[] findByProject_id_PrevAndNext(
        long id, long project_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchStudentException;

    /**
    * Removes all the students where project_id = &#63; from the database.
    *
    * @param project_id the project_id
    * @throws SystemException if a system exception occurred
    */
    public void removeByProject_id(long project_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of students where project_id = &#63;.
    *
    * @param project_id the project_id
    * @return the number of matching students
    * @throws SystemException if a system exception occurred
    */
    public int countByProject_id(long project_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the student in the entity cache if it is enabled.
    *
    * @param student the student
    */
    public void cacheResult(
        de.hska.wi.awp.datasource.infosys.model.Student student);

    /**
    * Caches the students in the entity cache if it is enabled.
    *
    * @param students the students
    */
    public void cacheResult(
        java.util.List<de.hska.wi.awp.datasource.infosys.model.Student> students);

    /**
    * Creates a new student with the primary key. Does not add the student to the database.
    *
    * @param id the primary key for the new student
    * @return the new student
    */
    public de.hska.wi.awp.datasource.infosys.model.Student create(long id);

    /**
    * Removes the student with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the student
    * @return the student that was removed
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchStudentException if a student with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Student remove(long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchStudentException;

    public de.hska.wi.awp.datasource.infosys.model.Student updateImpl(
        de.hska.wi.awp.datasource.infosys.model.Student student)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the student with the primary key or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchStudentException} if it could not be found.
    *
    * @param id the primary key of the student
    * @return the student
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchStudentException if a student with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Student findByPrimaryKey(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchStudentException;

    /**
    * Returns the student with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the student
    * @return the student, or <code>null</code> if a student with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Student fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the students.
    *
    * @return the students
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Student> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Student> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Student> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the students from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of students.
    *
    * @return the number of students
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
