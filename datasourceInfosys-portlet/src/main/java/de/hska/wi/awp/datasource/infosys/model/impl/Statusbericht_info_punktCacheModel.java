package de.hska.wi.awp.datasource.infosys.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import de.hska.wi.awp.datasource.infosys.model.Statusbericht_info_punkt;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Statusbericht_info_punkt in entity cache.
 *
 * @author Daniel Storch
 * @see Statusbericht_info_punkt
 * @generated
 */
public class Statusbericht_info_punktCacheModel implements CacheModel<Statusbericht_info_punkt>,
    Externalizable {
    public long id;
    public String name;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{id=");
        sb.append(id);
        sb.append(", name=");
        sb.append(name);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Statusbericht_info_punkt toEntityModel() {
        Statusbericht_info_punktImpl statusbericht_info_punktImpl = new Statusbericht_info_punktImpl();

        statusbericht_info_punktImpl.setId(id);

        if (name == null) {
            statusbericht_info_punktImpl.setName(StringPool.BLANK);
        } else {
            statusbericht_info_punktImpl.setName(name);
        }

        statusbericht_info_punktImpl.resetOriginalValues();

        return statusbericht_info_punktImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        id = objectInput.readLong();
        name = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(id);

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }
    }
}
