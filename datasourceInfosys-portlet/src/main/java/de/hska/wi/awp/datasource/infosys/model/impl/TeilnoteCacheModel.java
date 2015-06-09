package de.hska.wi.awp.datasource.infosys.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import de.hska.wi.awp.datasource.infosys.model.Teilnote;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Teilnote in entity cache.
 *
 * @author Daniel Storch
 * @see Teilnote
 * @generated
 */
public class TeilnoteCacheModel implements CacheModel<Teilnote>, Externalizable {
    public long id;
    public long feedback_id;
    public int note;
    public long kategorie;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{id=");
        sb.append(id);
        sb.append(", feedback_id=");
        sb.append(feedback_id);
        sb.append(", note=");
        sb.append(note);
        sb.append(", kategorie=");
        sb.append(kategorie);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Teilnote toEntityModel() {
        TeilnoteImpl teilnoteImpl = new TeilnoteImpl();

        teilnoteImpl.setId(id);
        teilnoteImpl.setFeedback_id(feedback_id);
        teilnoteImpl.setNote(note);
        teilnoteImpl.setKategorie(kategorie);

        teilnoteImpl.resetOriginalValues();

        return teilnoteImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        id = objectInput.readLong();
        feedback_id = objectInput.readLong();
        note = objectInput.readInt();
        kategorie = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(id);
        objectOutput.writeLong(feedback_id);
        objectOutput.writeInt(note);
        objectOutput.writeLong(kategorie);
    }
}
