package de.hska.wi.awp.datasource.infosys.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail_punkt;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Statusbericht_detail_punkt in entity cache.
 *
 * @author Daniel Storch
 * @see Statusbericht_detail_punkt
 * @generated
 */
public class Statusbericht_detail_punktCacheModel implements CacheModel<Statusbericht_detail_punkt>,
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
    public Statusbericht_detail_punkt toEntityModel() {
        Statusbericht_detail_punktImpl statusbericht_detail_punktImpl = new Statusbericht_detail_punktImpl();

        statusbericht_detail_punktImpl.setId(id);

        if (name == null) {
            statusbericht_detail_punktImpl.setName(StringPool.BLANK);
        } else {
            statusbericht_detail_punktImpl.setName(name);
        }

        statusbericht_detail_punktImpl.resetOriginalValues();

        return statusbericht_detail_punktImpl;
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
