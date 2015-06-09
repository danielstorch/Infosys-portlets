package de.hska.wi.awp.datasource.infosys.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import de.hska.wi.awp.datasource.infosys.model.Feedback;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Feedback in entity cache.
 *
 * @author Daniel Storch
 * @see Feedback
 * @generated
 */
public class FeedbackCacheModel implements CacheModel<Feedback>, Externalizable {
    public long id;
    public long student_id;
    public int feedback_runden_nr;
    public String eigenbewertung;
    public String kommentar_kompetenzen;
    public String kommentar_beitrag;
    public int beitrag;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(15);

        sb.append("{id=");
        sb.append(id);
        sb.append(", student_id=");
        sb.append(student_id);
        sb.append(", feedback_runden_nr=");
        sb.append(feedback_runden_nr);
        sb.append(", eigenbewertung=");
        sb.append(eigenbewertung);
        sb.append(", kommentar_kompetenzen=");
        sb.append(kommentar_kompetenzen);
        sb.append(", kommentar_beitrag=");
        sb.append(kommentar_beitrag);
        sb.append(", beitrag=");
        sb.append(beitrag);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Feedback toEntityModel() {
        FeedbackImpl feedbackImpl = new FeedbackImpl();

        feedbackImpl.setId(id);
        feedbackImpl.setStudent_id(student_id);
        feedbackImpl.setFeedback_runden_nr(feedback_runden_nr);

        if (eigenbewertung == null) {
            feedbackImpl.setEigenbewertung(StringPool.BLANK);
        } else {
            feedbackImpl.setEigenbewertung(eigenbewertung);
        }

        if (kommentar_kompetenzen == null) {
            feedbackImpl.setKommentar_kompetenzen(StringPool.BLANK);
        } else {
            feedbackImpl.setKommentar_kompetenzen(kommentar_kompetenzen);
        }

        if (kommentar_beitrag == null) {
            feedbackImpl.setKommentar_beitrag(StringPool.BLANK);
        } else {
            feedbackImpl.setKommentar_beitrag(kommentar_beitrag);
        }

        feedbackImpl.setBeitrag(beitrag);

        feedbackImpl.resetOriginalValues();

        return feedbackImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        id = objectInput.readLong();
        student_id = objectInput.readLong();
        feedback_runden_nr = objectInput.readInt();
        eigenbewertung = objectInput.readUTF();
        kommentar_kompetenzen = objectInput.readUTF();
        kommentar_beitrag = objectInput.readUTF();
        beitrag = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(id);
        objectOutput.writeLong(student_id);
        objectOutput.writeInt(feedback_runden_nr);

        if (eigenbewertung == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(eigenbewertung);
        }

        if (kommentar_kompetenzen == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(kommentar_kompetenzen);
        }

        if (kommentar_beitrag == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(kommentar_beitrag);
        }

        objectOutput.writeInt(beitrag);
    }
}
