package de.hska.wi.awp.datasource.infosys.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import de.hska.wi.awp.datasource.infosys.model.Allgemeines;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Allgemeines in entity cache.
 *
 * @author Daniel Storch
 * @see Allgemeines
 * @generated
 */
public class AllgemeinesCacheModel implements CacheModel<Allgemeines>,
    Externalizable {
    public long id;
    public long statusbericht_id;
    public String probleme_risiken;
    public String massnahmen;
    public String situation;
    public String gruende;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(13);

        sb.append("{id=");
        sb.append(id);
        sb.append(", statusbericht_id=");
        sb.append(statusbericht_id);
        sb.append(", probleme_risiken=");
        sb.append(probleme_risiken);
        sb.append(", massnahmen=");
        sb.append(massnahmen);
        sb.append(", situation=");
        sb.append(situation);
        sb.append(", gruende=");
        sb.append(gruende);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Allgemeines toEntityModel() {
        AllgemeinesImpl allgemeinesImpl = new AllgemeinesImpl();

        allgemeinesImpl.setId(id);
        allgemeinesImpl.setStatusbericht_id(statusbericht_id);

        if (probleme_risiken == null) {
            allgemeinesImpl.setProbleme_risiken(StringPool.BLANK);
        } else {
            allgemeinesImpl.setProbleme_risiken(probleme_risiken);
        }

        if (massnahmen == null) {
            allgemeinesImpl.setMassnahmen(StringPool.BLANK);
        } else {
            allgemeinesImpl.setMassnahmen(massnahmen);
        }

        if (situation == null) {
            allgemeinesImpl.setSituation(StringPool.BLANK);
        } else {
            allgemeinesImpl.setSituation(situation);
        }

        if (gruende == null) {
            allgemeinesImpl.setGruende(StringPool.BLANK);
        } else {
            allgemeinesImpl.setGruende(gruende);
        }

        allgemeinesImpl.resetOriginalValues();

        return allgemeinesImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        id = objectInput.readLong();
        statusbericht_id = objectInput.readLong();
        probleme_risiken = objectInput.readUTF();
        massnahmen = objectInput.readUTF();
        situation = objectInput.readUTF();
        gruende = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(id);
        objectOutput.writeLong(statusbericht_id);

        if (probleme_risiken == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(probleme_risiken);
        }

        if (massnahmen == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(massnahmen);
        }

        if (situation == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(situation);
        }

        if (gruende == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(gruende);
        }
    }
}
