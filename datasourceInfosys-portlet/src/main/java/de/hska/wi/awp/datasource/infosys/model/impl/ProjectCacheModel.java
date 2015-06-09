package de.hska.wi.awp.datasource.infosys.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import de.hska.wi.awp.datasource.infosys.model.Project;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Project in entity cache.
 *
 * @author Daniel Storch
 * @see Project
 * @generated
 */
public class ProjectCacheModel implements CacheModel<Project>, Externalizable {
    public String name;
    public String projecthskaId;
    public long id;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{name=");
        sb.append(name);
        sb.append(", projecthskaId=");
        sb.append(projecthskaId);
        sb.append(", id=");
        sb.append(id);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Project toEntityModel() {
        ProjectImpl projectImpl = new ProjectImpl();

        if (name == null) {
            projectImpl.setName(StringPool.BLANK);
        } else {
            projectImpl.setName(name);
        }

        if (projecthskaId == null) {
            projectImpl.setProjecthskaId(StringPool.BLANK);
        } else {
            projectImpl.setProjecthskaId(projecthskaId);
        }

        projectImpl.setId(id);

        projectImpl.resetOriginalValues();

        return projectImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        name = objectInput.readUTF();
        projecthskaId = objectInput.readUTF();
        id = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        if (projecthskaId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(projecthskaId);
        }

        objectOutput.writeLong(id);
    }
}
