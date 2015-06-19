package de.hska.wi.awp.datasource.infosys.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Statusbericht_detail in entity cache.
 *
 * @author Daniel Storch
 * @see Statusbericht_detail
 * @generated
 */
public class Statusbericht_detailCacheModel implements CacheModel<Statusbericht_detail>,
    Externalizable {
    public long id;
    public String text;
    public long statusbericht_id;
    public long statusbericht_detail_punkt_id;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{id=");
        sb.append(id);
        sb.append(", text=");
        sb.append(text);
        sb.append(", statusbericht_id=");
        sb.append(statusbericht_id);
        sb.append(", statusbericht_detail_punkt_id=");
        sb.append(statusbericht_detail_punkt_id);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Statusbericht_detail toEntityModel() {
        Statusbericht_detailImpl statusbericht_detailImpl = new Statusbericht_detailImpl();

        statusbericht_detailImpl.setId(id);

        if (text == null) {
            statusbericht_detailImpl.setText(StringPool.BLANK);
        } else {
            statusbericht_detailImpl.setText(text);
        }

        statusbericht_detailImpl.setStatusbericht_id(statusbericht_id);
        statusbericht_detailImpl.setStatusbericht_detail_punkt_id(statusbericht_detail_punkt_id);

        statusbericht_detailImpl.resetOriginalValues();

        return statusbericht_detailImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        id = objectInput.readLong();
        text = objectInput.readUTF();
        statusbericht_id = objectInput.readLong();
        statusbericht_detail_punkt_id = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(id);

        if (text == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(text);
        }

        objectOutput.writeLong(statusbericht_id);
        objectOutput.writeLong(statusbericht_detail_punkt_id);
    }
}
