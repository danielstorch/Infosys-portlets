package de.hska.wi.awp.datasource.infosys.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Teilnote_feedback}.
 * </p>
 *
 * @author Daniel Storch
 * @see Teilnote_feedback
 * @generated
 */
public class Teilnote_feedbackWrapper implements Teilnote_feedback,
    ModelWrapper<Teilnote_feedback> {
    private Teilnote_feedback _teilnote_feedback;

    public Teilnote_feedbackWrapper(Teilnote_feedback teilnote_feedback) {
        _teilnote_feedback = teilnote_feedback;
    }

    @Override
    public Class<?> getModelClass() {
        return Teilnote_feedback.class;
    }

    @Override
    public String getModelClassName() {
        return Teilnote_feedback.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("feedback_id", getFeedback_id());
        attributes.put("note", getNote());
        attributes.put("bewertungskriterium_id", getBewertungskriterium_id());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        Long feedback_id = (Long) attributes.get("feedback_id");

        if (feedback_id != null) {
            setFeedback_id(feedback_id);
        }

        Integer note = (Integer) attributes.get("note");

        if (note != null) {
            setNote(note);
        }

        Long bewertungskriterium_id = (Long) attributes.get(
                "bewertungskriterium_id");

        if (bewertungskriterium_id != null) {
            setBewertungskriterium_id(bewertungskriterium_id);
        }
    }

    /**
    * Returns the primary key of this teilnote_feedback.
    *
    * @return the primary key of this teilnote_feedback
    */
    @Override
    public long getPrimaryKey() {
        return _teilnote_feedback.getPrimaryKey();
    }

    /**
    * Sets the primary key of this teilnote_feedback.
    *
    * @param primaryKey the primary key of this teilnote_feedback
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _teilnote_feedback.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the ID of this teilnote_feedback.
    *
    * @return the ID of this teilnote_feedback
    */
    @Override
    public long getId() {
        return _teilnote_feedback.getId();
    }

    /**
    * Sets the ID of this teilnote_feedback.
    *
    * @param id the ID of this teilnote_feedback
    */
    @Override
    public void setId(long id) {
        _teilnote_feedback.setId(id);
    }

    /**
    * Returns the feedback_id of this teilnote_feedback.
    *
    * @return the feedback_id of this teilnote_feedback
    */
    @Override
    public long getFeedback_id() {
        return _teilnote_feedback.getFeedback_id();
    }

    /**
    * Sets the feedback_id of this teilnote_feedback.
    *
    * @param feedback_id the feedback_id of this teilnote_feedback
    */
    @Override
    public void setFeedback_id(long feedback_id) {
        _teilnote_feedback.setFeedback_id(feedback_id);
    }

    /**
    * Returns the note of this teilnote_feedback.
    *
    * @return the note of this teilnote_feedback
    */
    @Override
    public int getNote() {
        return _teilnote_feedback.getNote();
    }

    /**
    * Sets the note of this teilnote_feedback.
    *
    * @param note the note of this teilnote_feedback
    */
    @Override
    public void setNote(int note) {
        _teilnote_feedback.setNote(note);
    }

    /**
    * Returns the bewertungskriterium_id of this teilnote_feedback.
    *
    * @return the bewertungskriterium_id of this teilnote_feedback
    */
    @Override
    public long getBewertungskriterium_id() {
        return _teilnote_feedback.getBewertungskriterium_id();
    }

    /**
    * Sets the bewertungskriterium_id of this teilnote_feedback.
    *
    * @param bewertungskriterium_id the bewertungskriterium_id of this teilnote_feedback
    */
    @Override
    public void setBewertungskriterium_id(long bewertungskriterium_id) {
        _teilnote_feedback.setBewertungskriterium_id(bewertungskriterium_id);
    }

    @Override
    public boolean isNew() {
        return _teilnote_feedback.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _teilnote_feedback.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _teilnote_feedback.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _teilnote_feedback.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _teilnote_feedback.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _teilnote_feedback.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _teilnote_feedback.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _teilnote_feedback.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _teilnote_feedback.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _teilnote_feedback.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _teilnote_feedback.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new Teilnote_feedbackWrapper((Teilnote_feedback) _teilnote_feedback.clone());
    }

    @Override
    public int compareTo(
        de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback teilnote_feedback) {
        return _teilnote_feedback.compareTo(teilnote_feedback);
    }

    @Override
    public int hashCode() {
        return _teilnote_feedback.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback> toCacheModel() {
        return _teilnote_feedback.toCacheModel();
    }

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback toEscapedModel() {
        return new Teilnote_feedbackWrapper(_teilnote_feedback.toEscapedModel());
    }

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback toUnescapedModel() {
        return new Teilnote_feedbackWrapper(_teilnote_feedback.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _teilnote_feedback.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _teilnote_feedback.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _teilnote_feedback.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Teilnote_feedbackWrapper)) {
            return false;
        }

        Teilnote_feedbackWrapper teilnote_feedbackWrapper = (Teilnote_feedbackWrapper) obj;

        if (Validator.equals(_teilnote_feedback,
                    teilnote_feedbackWrapper._teilnote_feedback)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Teilnote_feedback getWrappedTeilnote_feedback() {
        return _teilnote_feedback;
    }

    @Override
    public Teilnote_feedback getWrappedModel() {
        return _teilnote_feedback;
    }

    @Override
    public void resetOriginalValues() {
        _teilnote_feedback.resetOriginalValues();
    }
}
