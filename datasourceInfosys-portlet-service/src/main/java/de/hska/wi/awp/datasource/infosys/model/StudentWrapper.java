package de.hska.wi.awp.datasource.infosys.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Student}.
 * </p>
 *
 * @author Daniel Storch
 * @see Student
 * @generated
 */
public class StudentWrapper implements Student, ModelWrapper<Student> {
    private Student _student;

    public StudentWrapper(Student student) {
        _student = student;
    }

    @Override
    public Class<?> getModelClass() {
        return Student.class;
    }

    @Override
    public String getModelClassName() {
        return Student.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("firstName", getFirstName());
        attributes.put("lastName", getLastName());
        attributes.put("id", getId());
        attributes.put("project_id", getProject_id());
        attributes.put("studenthskaId", getStudenthskaId());
        attributes.put("matnr", getMatnr());
        attributes.put("role", getRole());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String firstName = (String) attributes.get("firstName");

        if (firstName != null) {
            setFirstName(firstName);
        }

        String lastName = (String) attributes.get("lastName");

        if (lastName != null) {
            setLastName(lastName);
        }

        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        Long project_id = (Long) attributes.get("project_id");

        if (project_id != null) {
            setProject_id(project_id);
        }

        String studenthskaId = (String) attributes.get("studenthskaId");

        if (studenthskaId != null) {
            setStudenthskaId(studenthskaId);
        }

        Long matnr = (Long) attributes.get("matnr");

        if (matnr != null) {
            setMatnr(matnr);
        }

        Long role = (Long) attributes.get("role");

        if (role != null) {
            setRole(role);
        }
    }

    /**
    * Returns the primary key of this student.
    *
    * @return the primary key of this student
    */
    @Override
    public long getPrimaryKey() {
        return _student.getPrimaryKey();
    }

    /**
    * Sets the primary key of this student.
    *
    * @param primaryKey the primary key of this student
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _student.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the first name of this student.
    *
    * @return the first name of this student
    */
    @Override
    public java.lang.String getFirstName() {
        return _student.getFirstName();
    }

    /**
    * Sets the first name of this student.
    *
    * @param firstName the first name of this student
    */
    @Override
    public void setFirstName(java.lang.String firstName) {
        _student.setFirstName(firstName);
    }

    /**
    * Returns the last name of this student.
    *
    * @return the last name of this student
    */
    @Override
    public java.lang.String getLastName() {
        return _student.getLastName();
    }

    /**
    * Sets the last name of this student.
    *
    * @param lastName the last name of this student
    */
    @Override
    public void setLastName(java.lang.String lastName) {
        _student.setLastName(lastName);
    }

    /**
    * Returns the ID of this student.
    *
    * @return the ID of this student
    */
    @Override
    public long getId() {
        return _student.getId();
    }

    /**
    * Sets the ID of this student.
    *
    * @param id the ID of this student
    */
    @Override
    public void setId(long id) {
        _student.setId(id);
    }

    /**
    * Returns the project_id of this student.
    *
    * @return the project_id of this student
    */
    @Override
    public long getProject_id() {
        return _student.getProject_id();
    }

    /**
    * Sets the project_id of this student.
    *
    * @param project_id the project_id of this student
    */
    @Override
    public void setProject_id(long project_id) {
        _student.setProject_id(project_id);
    }

    /**
    * Returns the studenthska ID of this student.
    *
    * @return the studenthska ID of this student
    */
    @Override
    public java.lang.String getStudenthskaId() {
        return _student.getStudenthskaId();
    }

    /**
    * Sets the studenthska ID of this student.
    *
    * @param studenthskaId the studenthska ID of this student
    */
    @Override
    public void setStudenthskaId(java.lang.String studenthskaId) {
        _student.setStudenthskaId(studenthskaId);
    }

    /**
    * Returns the matnr of this student.
    *
    * @return the matnr of this student
    */
    @Override
    public long getMatnr() {
        return _student.getMatnr();
    }

    /**
    * Sets the matnr of this student.
    *
    * @param matnr the matnr of this student
    */
    @Override
    public void setMatnr(long matnr) {
        _student.setMatnr(matnr);
    }

    /**
    * Returns the role of this student.
    *
    * @return the role of this student
    */
    @Override
    public long getRole() {
        return _student.getRole();
    }

    /**
    * Sets the role of this student.
    *
    * @param role the role of this student
    */
    @Override
    public void setRole(long role) {
        _student.setRole(role);
    }

    @Override
    public boolean isNew() {
        return _student.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _student.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _student.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _student.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _student.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _student.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _student.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _student.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _student.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _student.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _student.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new StudentWrapper((Student) _student.clone());
    }

    @Override
    public int compareTo(
        de.hska.wi.awp.datasource.infosys.model.Student student) {
        return _student.compareTo(student);
    }

    @Override
    public int hashCode() {
        return _student.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<de.hska.wi.awp.datasource.infosys.model.Student> toCacheModel() {
        return _student.toCacheModel();
    }

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Student toEscapedModel() {
        return new StudentWrapper(_student.toEscapedModel());
    }

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Student toUnescapedModel() {
        return new StudentWrapper(_student.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _student.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _student.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _student.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof StudentWrapper)) {
            return false;
        }

        StudentWrapper studentWrapper = (StudentWrapper) obj;

        if (Validator.equals(_student, studentWrapper._student)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Student getWrappedStudent() {
        return _student;
    }

    @Override
    public Student getWrappedModel() {
        return _student;
    }

    @Override
    public void resetOriginalValues() {
        _student.resetOriginalValues();
    }
}
