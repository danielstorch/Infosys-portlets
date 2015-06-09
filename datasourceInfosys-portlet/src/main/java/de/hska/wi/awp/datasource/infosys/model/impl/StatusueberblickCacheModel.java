package de.hska.wi.awp.datasource.infosys.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import de.hska.wi.awp.datasource.infosys.model.Statusueberblick;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Statusueberblick in entity cache.
 *
 * @author Daniel Storch
 * @see Statusueberblick
 * @generated
 */
public class StatusueberblickCacheModel implements CacheModel<Statusueberblick>,
    Externalizable {
    public long id;
    public long statusbericht_id;
    public String qualitaet_status;
    public String qualitaet_text;
    public String kosten_text;
    public String kosten_status;
    public String aufwand_status;
    public String aufwand_text;
    public String termine_status;
    public String termine_text;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(21);

        sb.append("{id=");
        sb.append(id);
        sb.append(", statusbericht_id=");
        sb.append(statusbericht_id);
        sb.append(", qualitaet_status=");
        sb.append(qualitaet_status);
        sb.append(", qualitaet_text=");
        sb.append(qualitaet_text);
        sb.append(", kosten_text=");
        sb.append(kosten_text);
        sb.append(", kosten_status=");
        sb.append(kosten_status);
        sb.append(", aufwand_status=");
        sb.append(aufwand_status);
        sb.append(", aufwand_text=");
        sb.append(aufwand_text);
        sb.append(", termine_status=");
        sb.append(termine_status);
        sb.append(", termine_text=");
        sb.append(termine_text);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Statusueberblick toEntityModel() {
        StatusueberblickImpl statusueberblickImpl = new StatusueberblickImpl();

        statusueberblickImpl.setId(id);
        statusueberblickImpl.setStatusbericht_id(statusbericht_id);

        if (qualitaet_status == null) {
            statusueberblickImpl.setQualitaet_status(StringPool.BLANK);
        } else {
            statusueberblickImpl.setQualitaet_status(qualitaet_status);
        }

        if (qualitaet_text == null) {
            statusueberblickImpl.setQualitaet_text(StringPool.BLANK);
        } else {
            statusueberblickImpl.setQualitaet_text(qualitaet_text);
        }

        if (kosten_text == null) {
            statusueberblickImpl.setKosten_text(StringPool.BLANK);
        } else {
            statusueberblickImpl.setKosten_text(kosten_text);
        }

        if (kosten_status == null) {
            statusueberblickImpl.setKosten_status(StringPool.BLANK);
        } else {
            statusueberblickImpl.setKosten_status(kosten_status);
        }

        if (aufwand_status == null) {
            statusueberblickImpl.setAufwand_status(StringPool.BLANK);
        } else {
            statusueberblickImpl.setAufwand_status(aufwand_status);
        }

        if (aufwand_text == null) {
            statusueberblickImpl.setAufwand_text(StringPool.BLANK);
        } else {
            statusueberblickImpl.setAufwand_text(aufwand_text);
        }

        if (termine_status == null) {
            statusueberblickImpl.setTermine_status(StringPool.BLANK);
        } else {
            statusueberblickImpl.setTermine_status(termine_status);
        }

        if (termine_text == null) {
            statusueberblickImpl.setTermine_text(StringPool.BLANK);
        } else {
            statusueberblickImpl.setTermine_text(termine_text);
        }

        statusueberblickImpl.resetOriginalValues();

        return statusueberblickImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        id = objectInput.readLong();
        statusbericht_id = objectInput.readLong();
        qualitaet_status = objectInput.readUTF();
        qualitaet_text = objectInput.readUTF();
        kosten_text = objectInput.readUTF();
        kosten_status = objectInput.readUTF();
        aufwand_status = objectInput.readUTF();
        aufwand_text = objectInput.readUTF();
        termine_status = objectInput.readUTF();
        termine_text = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(id);
        objectOutput.writeLong(statusbericht_id);

        if (qualitaet_status == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(qualitaet_status);
        }

        if (qualitaet_text == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(qualitaet_text);
        }

        if (kosten_text == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(kosten_text);
        }

        if (kosten_status == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(kosten_status);
        }

        if (aufwand_status == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(aufwand_status);
        }

        if (aufwand_text == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(aufwand_text);
        }

        if (termine_status == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(termine_status);
        }

        if (termine_text == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(termine_text);
        }
    }
}
