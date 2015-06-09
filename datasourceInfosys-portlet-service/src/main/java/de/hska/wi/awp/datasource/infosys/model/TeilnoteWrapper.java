package de.hska.wi.awp.datasource.infosys.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Teilnote}.
 * </p>
 *
 * @author Daniel Storch
 * @see Teilnote
 * @generated
 */
public class TeilnoteWrapper implements Teilnote, ModelWrapper<Teilnote> {
    private Teilnote _teilnote;

    public TeilnoteWrapper(Teilnote teilnote) {
        _teilnote = teilnote;
    }

    @Override
    public Class<?> getModelClass() {
        return Teilnote.class;
    }

    @Override
    public String getModelClassName() {
        return Teilnote.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("feedback_id", getFeedback_id());
        attributes.put("note", getNote());
        attributes.put("kategorie", getKategorie());

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

        Long kategorie = (Long) attributes.get("kategorie");

        if (kategorie != null) {
            setKategorie(kategorie);
        }
    }

    /**
    * Returns the primary key of this teilnote.
    *
    * @return the primary key of this teilnote
    */
    @Override
    public long getPrimaryKey() {
        return _teilnote.getPrimaryKey();
    }

    /**
    * Sets the primary key of this teilnote.
    *
    * @param primaryKey the primary key of this teilnote
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _teilnote.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the ID of this teilnote.
    *
    * @return the ID of this teilnote
    */
    @Override
    public long getId() {
        return _teilnote.getId();
    }

    /**
    * Sets the ID of this teilnote.
    *
    * @param id the ID of this teilnote
    */
    @Override
    public void setId(long id) {
        _teilnote.setId(id);
    }

    /**
    * Returns the feedback_id of this teilnote.
    *
    * @return the feedback_id of this teilnote
    */
    @Override
    public long getFeedback_id() {
        return _teilnote.getFeedback_id();
    }

    /**
    * Sets the feedback_id of this teilnote.
    *
    * @param feedback_id the feedback_id of this teilnote
    */
    @Override
    public void setFeedback_id(long feedback_id) {
        _teilnote.setFeedback_id(feedback_id);
    }

    /**
    * Returns the note of this teilnote.
    *
    * @return the note of this teilnote
    */
    @Override
    public int getNote() {
        return _teilnote.getNote();
    }

    /**
    * Sets the note of this teilnote.
    *
    * @param note the note of this teilnote
    */
    @Override
    public void setNote(int note) {
        _teilnote.setNote(note);
    }

    /**
    * Returns the kategorie of this teilnote.
    *
    * @return the kategorie of this teilnote
    */
    @Override
    public long getKategorie() {
        return _teilnote.getKategorie();
    }

    /**
    * Sets the kategorie of this teilnote.
    *
    * @param kategorie the kategorie of this teilnote
    */
    @Override
    public void setKategorie(long kategorie) {
        _teilnote.setKategorie(kategorie);
    }

    @Override
    public boolean isNew() {
        return _teilnote.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _teilnote.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _teilnote.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _teilnote.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _teilnote.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _teilnote.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _teilnote.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _teilnote.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _teilnote.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _teilnote.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _teilnote.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new TeilnoteWrapper((Teilnote) _teilnote.clone());
    }

    @Override
    public int compareTo(
        de.hska.wi.awp.datasource.infosys.model.Teilnote teilnote) {
        return _teilnote.compareTo(teilnote);
    }

    @Override
    public int hashCode() {
        return _teilnote.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<de.hska.wi.awp.datasource.infosys.model.Teilnote> toCacheModel() {
        return _teilnote.toCacheModel();
    }

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Teilnote toEscapedModel() {
        return new TeilnoteWrapper(_teilnote.toEscapedModel());
    }

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Teilnote toUnescapedModel() {
        return new TeilnoteWrapper(_teilnote.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _teilnote.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _teilnote.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _teilnote.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof TeilnoteWrapper)) {
            return false;
        }

        TeilnoteWrapper teilnoteWrapper = (TeilnoteWrapper) obj;

        if (Validator.equals(_teilnote, teilnoteWrapper._teilnote)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Teilnote getWrappedTeilnote() {
        return _teilnote;
    }

    @Override
    public Teilnote getWrappedModel() {
        return _teilnote;
    }

    @Override
    public void resetOriginalValues() {
        _teilnote.resetOriginalValues();
    }
}
