package de.hska.wi.awp.datasource.infosys.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import de.hska.wi.awp.datasource.infosys.model.Statusbericht_info;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Statusbericht_info in entity cache.
 *
 * @author Daniel Storch
 * @see Statusbericht_info
 * @generated
 */
public class Statusbericht_infoCacheModel implements CacheModel<Statusbericht_info>,
    Externalizable {
    public long id;
    public String bemerkung;
    public int status;
    public long statusbericht_id;
    public long statusbericht_info_punkt_id;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(11);

        sb.append("{id=");
        sb.append(id);
        sb.append(", bemerkung=");
        sb.append(bemerkung);
        sb.append(", status=");
        sb.append(status);
        sb.append(", statusbericht_id=");
        sb.append(statusbericht_id);
        sb.append(", statusbericht_info_punkt_id=");
        sb.append(statusbericht_info_punkt_id);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Statusbericht_info toEntityModel() {
        Statusbericht_infoImpl statusbericht_infoImpl = new Statusbericht_infoImpl();

        statusbericht_infoImpl.setId(id);

        if (bemerkung == null) {
            statusbericht_infoImpl.setBemerkung(StringPool.BLANK);
        } else {
            statusbericht_infoImpl.setBemerkung(bemerkung);
        }

        statusbericht_infoImpl.setStatus(status);
        statusbericht_infoImpl.setStatusbericht_id(statusbericht_id);
        statusbericht_infoImpl.setStatusbericht_info_punkt_id(statusbericht_info_punkt_id);

        statusbericht_infoImpl.resetOriginalValues();

        return statusbericht_infoImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        id = objectInput.readLong();
        bemerkung = objectInput.readUTF();
        status = objectInput.readInt();
        statusbericht_id = objectInput.readLong();
        statusbericht_info_punkt_id = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(id);

        if (bemerkung == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(bemerkung);
        }

        objectOutput.writeInt(status);
        objectOutput.writeLong(statusbericht_id);
        objectOutput.writeLong(statusbericht_info_punkt_id);
    }
}
