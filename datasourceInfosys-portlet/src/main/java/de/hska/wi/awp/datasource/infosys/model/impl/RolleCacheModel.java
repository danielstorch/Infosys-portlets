package de.hska.wi.awp.datasource.infosys.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import de.hska.wi.awp.datasource.infosys.model.Rolle;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Rolle in entity cache.
 *
 * @author Daniel Storch
 * @see Rolle
 * @generated
 */
public class RolleCacheModel implements CacheModel<Rolle>, Externalizable {
    public long id;
    public String shortName;
    public String name;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{id=");
        sb.append(id);
        sb.append(", shortName=");
        sb.append(shortName);
        sb.append(", name=");
        sb.append(name);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Rolle toEntityModel() {
        RolleImpl rolleImpl = new RolleImpl();

        rolleImpl.setId(id);

        if (shortName == null) {
            rolleImpl.setShortName(StringPool.BLANK);
        } else {
            rolleImpl.setShortName(shortName);
        }

        if (name == null) {
            rolleImpl.setName(StringPool.BLANK);
        } else {
            rolleImpl.setName(name);
        }

        rolleImpl.resetOriginalValues();

        return rolleImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        id = objectInput.readLong();
        shortName = objectInput.readUTF();
        name = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(id);

        if (shortName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(shortName);
        }

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }
    }
}
