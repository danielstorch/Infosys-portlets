package de.hska.wi.awp.datasource.infosys.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Student service. Represents a row in the &quot;datasourceInfosys_Student&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link de.hska.wi.awp.datasource.infosys.model.impl.StudentModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link de.hska.wi.awp.datasource.infosys.model.impl.StudentImpl}.
 * </p>
 *
 * @author Daniel Storch
 * @see Student
 * @see de.hska.wi.awp.datasource.infosys.model.impl.StudentImpl
 * @see de.hska.wi.awp.datasource.infosys.model.impl.StudentModelImpl
 * @generated
 */
public interface StudentModel extends BaseModel<Student> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a student model instance should use the {@link Student} interface instead.
     */

    /**
     * Returns the primary key of this student.
     *
     * @return the primary key of this student
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this student.
     *
     * @param primaryKey the primary key of this student
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the first name of this student.
     *
     * @return the first name of this student
     */
    @AutoEscape
    public String getFirstName();

    /**
     * Sets the first name of this student.
     *
     * @param firstName the first name of this student
     */
    public void setFirstName(String firstName);

    /**
     * Returns the last name of this student.
     *
     * @return the last name of this student
     */
    @AutoEscape
    public String getLastName();

    /**
     * Sets the last name of this student.
     *
     * @param lastName the last name of this student
     */
    public void setLastName(String lastName);

    /**
     * Returns the ID of this student.
     *
     * @return the ID of this student
     */
    public long getId();

    /**
     * Sets the ID of this student.
     *
     * @param id the ID of this student
     */
    public void setId(long id);

    /**
     * Returns the project_id of this student.
     *
     * @return the project_id of this student
     */
    public long getProject_id();

    /**
     * Sets the project_id of this student.
     *
     * @param project_id the project_id of this student
     */
    public void setProject_id(long project_id);

    /**
     * Returns the studenthska ID of this student.
     *
     * @return the studenthska ID of this student
     */
    @AutoEscape
    public String getStudenthskaId();

    /**
     * Sets the studenthska ID of this student.
     *
     * @param studenthskaId the studenthska ID of this student
     */
    public void setStudenthskaId(String studenthskaId);

    /**
     * Returns the matnr of this student.
     *
     * @return the matnr of this student
     */
    public long getMatnr();

    /**
     * Sets the matnr of this student.
     *
     * @param matnr the matnr of this student
     */
    public void setMatnr(long matnr);

    /**
     * Returns the role of this student.
     *
     * @return the role of this student
     */
    public long getRole();

    /**
     * Sets the role of this student.
     *
     * @param role the role of this student
     */
    public void setRole(long role);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(
        de.hska.wi.awp.datasource.infosys.model.Student student);

    @Override
    public int hashCode();

    @Override
    public CacheModel<de.hska.wi.awp.datasource.infosys.model.Student> toCacheModel();

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Student toEscapedModel();

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Student toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
