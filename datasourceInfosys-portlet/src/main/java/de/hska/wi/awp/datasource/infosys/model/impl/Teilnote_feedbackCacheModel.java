package de.hska.wi.awp.datasource.infosys.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Teilnote_feedback in entity cache.
 *
 * @author Daniel Storch
 * @see Teilnote_feedback
 * @generated
 */
public class Teilnote_feedbackCacheModel implements CacheModel<Teilnote_feedback>,
    Externalizable {
    public long id;
    public long feedback_id;
    public int note;
    public long bewertungskriterium_id;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{id=");
        sb.append(id);
        sb.append(", feedback_id=");
        sb.append(feedback_id);
        sb.append(", note=");
        sb.append(note);
        sb.append(", bewertungskriterium_id=");
        sb.append(bewertungskriterium_id);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Teilnote_feedback toEntityModel() {
        Teilnote_feedbackImpl teilnote_feedbackImpl = new Teilnote_feedbackImpl();

        teilnote_feedbackImpl.setId(id);
        teilnote_feedbackImpl.setFeedback_id(feedback_id);
        teilnote_feedbackImpl.setNote(note);
        teilnote_feedbackImpl.setBewertungskriterium_id(bewertungskriterium_id);

        teilnote_feedbackImpl.resetOriginalValues();

        return teilnote_feedbackImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        id = objectInput.readLong();
        feedback_id = objectInput.readLong();
        note = objectInput.readInt();
        bewertungskriterium_id = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(id);
        objectOutput.writeLong(feedback_id);
        objectOutput.writeInt(note);
        objectOutput.writeLong(bewertungskriterium_id);
    }
}
