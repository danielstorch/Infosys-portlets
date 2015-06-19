package de.hska.wi.awp.datasource.infosys.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import de.hska.wi.awp.datasource.infosys.model.Statusbericht_geplante_arbeit;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Statusbericht_geplante_arbeit in entity cache.
 *
 * @author Daniel Storch
 * @see Statusbericht_geplante_arbeit
 * @generated
 */
public class Statusbericht_geplante_arbeitCacheModel implements CacheModel<Statusbericht_geplante_arbeit>,
    Externalizable {
    public long id;
    public String aktivitaet;
    public long bis_wann;
    public long statusbericht_id;
    public long verantwortlicher;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(11);

        sb.append("{id=");
        sb.append(id);
        sb.append(", aktivitaet=");
        sb.append(aktivitaet);
        sb.append(", bis_wann=");
        sb.append(bis_wann);
        sb.append(", statusbericht_id=");
        sb.append(statusbericht_id);
        sb.append(", verantwortlicher=");
        sb.append(verantwortlicher);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Statusbericht_geplante_arbeit toEntityModel() {
        Statusbericht_geplante_arbeitImpl statusbericht_geplante_arbeitImpl = new Statusbericht_geplante_arbeitImpl();

        statusbericht_geplante_arbeitImpl.setId(id);

        if (aktivitaet == null) {
            statusbericht_geplante_arbeitImpl.setAktivitaet(StringPool.BLANK);
        } else {
            statusbericht_geplante_arbeitImpl.setAktivitaet(aktivitaet);
        }

        if (bis_wann == Long.MIN_VALUE) {
            statusbericht_geplante_arbeitImpl.setBis_wann(null);
        } else {
            statusbericht_geplante_arbeitImpl.setBis_wann(new Date(bis_wann));
        }

        statusbericht_geplante_arbeitImpl.setStatusbericht_id(statusbericht_id);
        statusbericht_geplante_arbeitImpl.setVerantwortlicher(verantwortlicher);

        statusbericht_geplante_arbeitImpl.resetOriginalValues();

        return statusbericht_geplante_arbeitImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        id = objectInput.readLong();
        aktivitaet = objectInput.readUTF();
        bis_wann = objectInput.readLong();
        statusbericht_id = objectInput.readLong();
        verantwortlicher = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(id);

        if (aktivitaet == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(aktivitaet);
        }

        objectOutput.writeLong(bis_wann);
        objectOutput.writeLong(statusbericht_id);
        objectOutput.writeLong(verantwortlicher);
    }
}
