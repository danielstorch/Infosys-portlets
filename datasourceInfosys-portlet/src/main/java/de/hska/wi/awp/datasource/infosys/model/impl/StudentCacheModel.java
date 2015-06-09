package de.hska.wi.awp.datasource.infosys.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import de.hska.wi.awp.datasource.infosys.model.Student;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Student in entity cache.
 *
 * @author Daniel Storch
 * @see Student
 * @generated
 */
public class StudentCacheModel implements CacheModel<Student>, Externalizable {
    public String firstName;
    public String lastName;
    public long id;
    public long project_id;
    public String studenthskaId;
    public long matnr;
    public long role;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(15);

        sb.append("{firstName=");
        sb.append(firstName);
        sb.append(", lastName=");
        sb.append(lastName);
        sb.append(", id=");
        sb.append(id);
        sb.append(", project_id=");
        sb.append(project_id);
        sb.append(", studenthskaId=");
        sb.append(studenthskaId);
        sb.append(", matnr=");
        sb.append(matnr);
        sb.append(", role=");
        sb.append(role);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Student toEntityModel() {
        StudentImpl studentImpl = new StudentImpl();

        if (firstName == null) {
            studentImpl.setFirstName(StringPool.BLANK);
        } else {
            studentImpl.setFirstName(firstName);
        }

        if (lastName == null) {
            studentImpl.setLastName(StringPool.BLANK);
        } else {
            studentImpl.setLastName(lastName);
        }

        studentImpl.setId(id);
        studentImpl.setProject_id(project_id);

        if (studenthskaId == null) {
            studentImpl.setStudenthskaId(StringPool.BLANK);
        } else {
            studentImpl.setStudenthskaId(studenthskaId);
        }

        studentImpl.setMatnr(matnr);
        studentImpl.setRole(role);

        studentImpl.resetOriginalValues();

        return studentImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        firstName = objectInput.readUTF();
        lastName = objectInput.readUTF();
        id = objectInput.readLong();
        project_id = objectInput.readLong();
        studenthskaId = objectInput.readUTF();
        matnr = objectInput.readLong();
        role = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (firstName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(firstName);
        }

        if (lastName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(lastName);
        }

        objectOutput.writeLong(id);
        objectOutput.writeLong(project_id);

        if (studenthskaId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(studenthskaId);
        }

        objectOutput.writeLong(matnr);
        objectOutput.writeLong(role);
    }
}
