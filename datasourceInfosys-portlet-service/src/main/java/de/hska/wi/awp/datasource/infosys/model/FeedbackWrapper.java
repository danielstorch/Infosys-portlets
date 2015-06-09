package de.hska.wi.awp.datasource.infosys.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Feedback}.
 * </p>
 *
 * @author Daniel Storch
 * @see Feedback
 * @generated
 */
public class FeedbackWrapper implements Feedback, ModelWrapper<Feedback> {
    private Feedback _feedback;

    public FeedbackWrapper(Feedback feedback) {
        _feedback = feedback;
    }

    @Override
    public Class<?> getModelClass() {
        return Feedback.class;
    }

    @Override
    public String getModelClassName() {
        return Feedback.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("student_id", getStudent_id());
        attributes.put("feedback_runden_nr", getFeedback_runden_nr());
        attributes.put("eigenbewertung", getEigenbewertung());
        attributes.put("kommentar_kompetenzen", getKommentar_kompetenzen());
        attributes.put("kommentar_beitrag", getKommentar_beitrag());
        attributes.put("beitrag", getBeitrag());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        Long student_id = (Long) attributes.get("student_id");

        if (student_id != null) {
            setStudent_id(student_id);
        }

        Integer feedback_runden_nr = (Integer) attributes.get(
                "feedback_runden_nr");

        if (feedback_runden_nr != null) {
            setFeedback_runden_nr(feedback_runden_nr);
        }

        String eigenbewertung = (String) attributes.get("eigenbewertung");

        if (eigenbewertung != null) {
            setEigenbewertung(eigenbewertung);
        }

        String kommentar_kompetenzen = (String) attributes.get(
                "kommentar_kompetenzen");

        if (kommentar_kompetenzen != null) {
            setKommentar_kompetenzen(kommentar_kompetenzen);
        }

        String kommentar_beitrag = (String) attributes.get("kommentar_beitrag");

        if (kommentar_beitrag != null) {
            setKommentar_beitrag(kommentar_beitrag);
        }

        Integer beitrag = (Integer) attributes.get("beitrag");

        if (beitrag != null) {
            setBeitrag(beitrag);
        }
    }

    /**
    * Returns the primary key of this feedback.
    *
    * @return the primary key of this feedback
    */
    @Override
    public long getPrimaryKey() {
        return _feedback.getPrimaryKey();
    }

    /**
    * Sets the primary key of this feedback.
    *
    * @param primaryKey the primary key of this feedback
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _feedback.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the ID of this feedback.
    *
    * @return the ID of this feedback
    */
    @Override
    public long getId() {
        return _feedback.getId();
    }

    /**
    * Sets the ID of this feedback.
    *
    * @param id the ID of this feedback
    */
    @Override
    public void setId(long id) {
        _feedback.setId(id);
    }

    /**
    * Returns the student_id of this feedback.
    *
    * @return the student_id of this feedback
    */
    @Override
    public long getStudent_id() {
        return _feedback.getStudent_id();
    }

    /**
    * Sets the student_id of this feedback.
    *
    * @param student_id the student_id of this feedback
    */
    @Override
    public void setStudent_id(long student_id) {
        _feedback.setStudent_id(student_id);
    }

    /**
    * Returns the feedback_runden_nr of this feedback.
    *
    * @return the feedback_runden_nr of this feedback
    */
    @Override
    public int getFeedback_runden_nr() {
        return _feedback.getFeedback_runden_nr();
    }

    /**
    * Sets the feedback_runden_nr of this feedback.
    *
    * @param feedback_runden_nr the feedback_runden_nr of this feedback
    */
    @Override
    public void setFeedback_runden_nr(int feedback_runden_nr) {
        _feedback.setFeedback_runden_nr(feedback_runden_nr);
    }

    /**
    * Returns the eigenbewertung of this feedback.
    *
    * @return the eigenbewertung of this feedback
    */
    @Override
    public java.lang.String getEigenbewertung() {
        return _feedback.getEigenbewertung();
    }

    /**
    * Sets the eigenbewertung of this feedback.
    *
    * @param eigenbewertung the eigenbewertung of this feedback
    */
    @Override
    public void setEigenbewertung(java.lang.String eigenbewertung) {
        _feedback.setEigenbewertung(eigenbewertung);
    }

    /**
    * Returns the kommentar_kompetenzen of this feedback.
    *
    * @return the kommentar_kompetenzen of this feedback
    */
    @Override
    public java.lang.String getKommentar_kompetenzen() {
        return _feedback.getKommentar_kompetenzen();
    }

    /**
    * Sets the kommentar_kompetenzen of this feedback.
    *
    * @param kommentar_kompetenzen the kommentar_kompetenzen of this feedback
    */
    @Override
    public void setKommentar_kompetenzen(java.lang.String kommentar_kompetenzen) {
        _feedback.setKommentar_kompetenzen(kommentar_kompetenzen);
    }

    /**
    * Returns the kommentar_beitrag of this feedback.
    *
    * @return the kommentar_beitrag of this feedback
    */
    @Override
    public java.lang.String getKommentar_beitrag() {
        return _feedback.getKommentar_beitrag();
    }

    /**
    * Sets the kommentar_beitrag of this feedback.
    *
    * @param kommentar_beitrag the kommentar_beitrag of this feedback
    */
    @Override
    public void setKommentar_beitrag(java.lang.String kommentar_beitrag) {
        _feedback.setKommentar_beitrag(kommentar_beitrag);
    }

    /**
    * Returns the beitrag of this feedback.
    *
    * @return the beitrag of this feedback
    */
    @Override
    public int getBeitrag() {
        return _feedback.getBeitrag();
    }

    /**
    * Sets the beitrag of this feedback.
    *
    * @param beitrag the beitrag of this feedback
    */
    @Override
    public void setBeitrag(int beitrag) {
        _feedback.setBeitrag(beitrag);
    }

    @Override
    public boolean isNew() {
        return _feedback.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _feedback.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _feedback.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _feedback.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _feedback.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _feedback.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _feedback.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _feedback.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _feedback.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _feedback.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _feedback.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new FeedbackWrapper((Feedback) _feedback.clone());
    }

    @Override
    public int compareTo(
        de.hska.wi.awp.datasource.infosys.model.Feedback feedback) {
        return _feedback.compareTo(feedback);
    }

    @Override
    public int hashCode() {
        return _feedback.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<de.hska.wi.awp.datasource.infosys.model.Feedback> toCacheModel() {
        return _feedback.toCacheModel();
    }

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Feedback toEscapedModel() {
        return new FeedbackWrapper(_feedback.toEscapedModel());
    }

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Feedback toUnescapedModel() {
        return new FeedbackWrapper(_feedback.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _feedback.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _feedback.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _feedback.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof FeedbackWrapper)) {
            return false;
        }

        FeedbackWrapper feedbackWrapper = (FeedbackWrapper) obj;

        if (Validator.equals(_feedback, feedbackWrapper._feedback)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Feedback getWrappedFeedback() {
        return _feedback;
    }

    @Override
    public Feedback getWrappedModel() {
        return _feedback;
    }

    @Override
    public void resetOriginalValues() {
        _feedback.resetOriginalValues();
    }
}
