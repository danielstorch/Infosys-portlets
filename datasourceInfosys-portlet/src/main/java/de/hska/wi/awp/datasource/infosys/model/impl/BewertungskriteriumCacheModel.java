package de.hska.wi.awp.datasource.infosys.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import de.hska.wi.awp.datasource.infosys.model.Bewertungskriterium;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Bewertungskriterium in entity cache.
 *
 * @author Daniel Storch
 * @see Bewertungskriterium
 * @generated
 */
public class BewertungskriteriumCacheModel implements CacheModel<Bewertungskriterium>,
    Externalizable {
    public long id;
    public String name;
    public String beschreibung;
    public int gewichtung;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{id=");
        sb.append(id);
        sb.append(", name=");
        sb.append(name);
        sb.append(", beschreibung=");
        sb.append(beschreibung);
        sb.append(", gewichtung=");
        sb.append(gewichtung);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Bewertungskriterium toEntityModel() {
        BewertungskriteriumImpl bewertungskriteriumImpl = new BewertungskriteriumImpl();

        bewertungskriteriumImpl.setId(id);

        if (name == null) {
            bewertungskriteriumImpl.setName(StringPool.BLANK);
        } else {
            bewertungskriteriumImpl.setName(name);
        }

        if (beschreibung == null) {
            bewertungskriteriumImpl.setBeschreibung(StringPool.BLANK);
        } else {
            bewertungskriteriumImpl.setBeschreibung(beschreibung);
        }

        bewertungskriteriumImpl.setGewichtung(gewichtung);

        bewertungskriteriumImpl.resetOriginalValues();

        return bewertungskriteriumImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        id = objectInput.readLong();
        name = objectInput.readUTF();
        beschreibung = objectInput.readUTF();
        gewichtung = objectInput.readInt();
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

        if (beschreibung == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(beschreibung);
        }

        objectOutput.writeInt(gewichtung);
    }
}
