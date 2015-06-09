package de.hska.wi.awp.datasource.infosys.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import de.hska.wi.awp.datasource.infosys.model.Geplante_arbeit;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Geplante_arbeit in entity cache.
 *
 * @author Daniel Storch
 * @see Geplante_arbeit
 * @generated
 */
public class Geplante_arbeitCacheModel implements CacheModel<Geplante_arbeit>,
    Externalizable {
    public long id;
    public long statusbericht_id;
    public long verantwortlicher;
    public String arbeit;
    public long bis_wann;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(11);

        sb.append("{id=");
        sb.append(id);
        sb.append(", statusbericht_id=");
        sb.append(statusbericht_id);
        sb.append(", verantwortlicher=");
        sb.append(verantwortlicher);
        sb.append(", arbeit=");
        sb.append(arbeit);
        sb.append(", bis_wann=");
        sb.append(bis_wann);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Geplante_arbeit toEntityModel() {
        Geplante_arbeitImpl geplante_arbeitImpl = new Geplante_arbeitImpl();

        geplante_arbeitImpl.setId(id);
        geplante_arbeitImpl.setStatusbericht_id(statusbericht_id);
        geplante_arbeitImpl.setVerantwortlicher(verantwortlicher);

        if (arbeit == null) {
            geplante_arbeitImpl.setArbeit(StringPool.BLANK);
        } else {
            geplante_arbeitImpl.setArbeit(arbeit);
        }

        if (bis_wann == Long.MIN_VALUE) {
            geplante_arbeitImpl.setBis_wann(null);
        } else {
            geplante_arbeitImpl.setBis_wann(new Date(bis_wann));
        }

        geplante_arbeitImpl.resetOriginalValues();

        return geplante_arbeitImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        id = objectInput.readLong();
        statusbericht_id = objectInput.readLong();
        verantwortlicher = objectInput.readLong();
        arbeit = objectInput.readUTF();
        bis_wann = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(id);
        objectOutput.writeLong(statusbericht_id);
        objectOutput.writeLong(verantwortlicher);

        if (arbeit == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(arbeit);
        }

        objectOutput.writeLong(bis_wann);
    }
}
