package de.hska.wi.awp.datasource.infosys.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Statusueberblick}.
 * </p>
 *
 * @author Daniel Storch
 * @see Statusueberblick
 * @generated
 */
public class StatusueberblickWrapper implements Statusueberblick,
    ModelWrapper<Statusueberblick> {
    private Statusueberblick _statusueberblick;

    public StatusueberblickWrapper(Statusueberblick statusueberblick) {
        _statusueberblick = statusueberblick;
    }

    @Override
    public Class<?> getModelClass() {
        return Statusueberblick.class;
    }

    @Override
    public String getModelClassName() {
        return Statusueberblick.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("statusbericht_id", getStatusbericht_id());
        attributes.put("qualitaet_status", getQualitaet_status());
        attributes.put("qualitaet_text", getQualitaet_text());
        attributes.put("kosten_text", getKosten_text());
        attributes.put("kosten_status", getKosten_status());
        attributes.put("aufwand_status", getAufwand_status());
        attributes.put("aufwand_text", getAufwand_text());
        attributes.put("termine_status", getTermine_status());
        attributes.put("termine_text", getTermine_text());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        Long statusbericht_id = (Long) attributes.get("statusbericht_id");

        if (statusbericht_id != null) {
            setStatusbericht_id(statusbericht_id);
        }

        String qualitaet_status = (String) attributes.get("qualitaet_status");

        if (qualitaet_status != null) {
            setQualitaet_status(qualitaet_status);
        }

        String qualitaet_text = (String) attributes.get("qualitaet_text");

        if (qualitaet_text != null) {
            setQualitaet_text(qualitaet_text);
        }

        String kosten_text = (String) attributes.get("kosten_text");

        if (kosten_text != null) {
            setKosten_text(kosten_text);
        }

        String kosten_status = (String) attributes.get("kosten_status");

        if (kosten_status != null) {
            setKosten_status(kosten_status);
        }

        String aufwand_status = (String) attributes.get("aufwand_status");

        if (aufwand_status != null) {
            setAufwand_status(aufwand_status);
        }

        String aufwand_text = (String) attributes.get("aufwand_text");

        if (aufwand_text != null) {
            setAufwand_text(aufwand_text);
        }

        String termine_status = (String) attributes.get("termine_status");

        if (termine_status != null) {
            setTermine_status(termine_status);
        }

        String termine_text = (String) attributes.get("termine_text");

        if (termine_text != null) {
            setTermine_text(termine_text);
        }
    }

    /**
    * Returns the primary key of this statusueberblick.
    *
    * @return the primary key of this statusueberblick
    */
    @Override
    public long getPrimaryKey() {
        return _statusueberblick.getPrimaryKey();
    }

    /**
    * Sets the primary key of this statusueberblick.
    *
    * @param primaryKey the primary key of this statusueberblick
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _statusueberblick.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the ID of this statusueberblick.
    *
    * @return the ID of this statusueberblick
    */
    @Override
    public long getId() {
        return _statusueberblick.getId();
    }

    /**
    * Sets the ID of this statusueberblick.
    *
    * @param id the ID of this statusueberblick
    */
    @Override
    public void setId(long id) {
        _statusueberblick.setId(id);
    }

    /**
    * Returns the statusbericht_id of this statusueberblick.
    *
    * @return the statusbericht_id of this statusueberblick
    */
    @Override
    public long getStatusbericht_id() {
        return _statusueberblick.getStatusbericht_id();
    }

    /**
    * Sets the statusbericht_id of this statusueberblick.
    *
    * @param statusbericht_id the statusbericht_id of this statusueberblick
    */
    @Override
    public void setStatusbericht_id(long statusbericht_id) {
        _statusueberblick.setStatusbericht_id(statusbericht_id);
    }

    /**
    * Returns the qualitaet_status of this statusueberblick.
    *
    * @return the qualitaet_status of this statusueberblick
    */
    @Override
    public java.lang.String getQualitaet_status() {
        return _statusueberblick.getQualitaet_status();
    }

    /**
    * Sets the qualitaet_status of this statusueberblick.
    *
    * @param qualitaet_status the qualitaet_status of this statusueberblick
    */
    @Override
    public void setQualitaet_status(java.lang.String qualitaet_status) {
        _statusueberblick.setQualitaet_status(qualitaet_status);
    }

    /**
    * Returns the qualitaet_text of this statusueberblick.
    *
    * @return the qualitaet_text of this statusueberblick
    */
    @Override
    public java.lang.String getQualitaet_text() {
        return _statusueberblick.getQualitaet_text();
    }

    /**
    * Sets the qualitaet_text of this statusueberblick.
    *
    * @param qualitaet_text the qualitaet_text of this statusueberblick
    */
    @Override
    public void setQualitaet_text(java.lang.String qualitaet_text) {
        _statusueberblick.setQualitaet_text(qualitaet_text);
    }

    /**
    * Returns the kosten_text of this statusueberblick.
    *
    * @return the kosten_text of this statusueberblick
    */
    @Override
    public java.lang.String getKosten_text() {
        return _statusueberblick.getKosten_text();
    }

    /**
    * Sets the kosten_text of this statusueberblick.
    *
    * @param kosten_text the kosten_text of this statusueberblick
    */
    @Override
    public void setKosten_text(java.lang.String kosten_text) {
        _statusueberblick.setKosten_text(kosten_text);
    }

    /**
    * Returns the kosten_status of this statusueberblick.
    *
    * @return the kosten_status of this statusueberblick
    */
    @Override
    public java.lang.String getKosten_status() {
        return _statusueberblick.getKosten_status();
    }

    /**
    * Sets the kosten_status of this statusueberblick.
    *
    * @param kosten_status the kosten_status of this statusueberblick
    */
    @Override
    public void setKosten_status(java.lang.String kosten_status) {
        _statusueberblick.setKosten_status(kosten_status);
    }

    /**
    * Returns the aufwand_status of this statusueberblick.
    *
    * @return the aufwand_status of this statusueberblick
    */
    @Override
    public java.lang.String getAufwand_status() {
        return _statusueberblick.getAufwand_status();
    }

    /**
    * Sets the aufwand_status of this statusueberblick.
    *
    * @param aufwand_status the aufwand_status of this statusueberblick
    */
    @Override
    public void setAufwand_status(java.lang.String aufwand_status) {
        _statusueberblick.setAufwand_status(aufwand_status);
    }

    /**
    * Returns the aufwand_text of this statusueberblick.
    *
    * @return the aufwand_text of this statusueberblick
    */
    @Override
    public java.lang.String getAufwand_text() {
        return _statusueberblick.getAufwand_text();
    }

    /**
    * Sets the aufwand_text of this statusueberblick.
    *
    * @param aufwand_text the aufwand_text of this statusueberblick
    */
    @Override
    public void setAufwand_text(java.lang.String aufwand_text) {
        _statusueberblick.setAufwand_text(aufwand_text);
    }

    /**
    * Returns the termine_status of this statusueberblick.
    *
    * @return the termine_status of this statusueberblick
    */
    @Override
    public java.lang.String getTermine_status() {
        return _statusueberblick.getTermine_status();
    }

    /**
    * Sets the termine_status of this statusueberblick.
    *
    * @param termine_status the termine_status of this statusueberblick
    */
    @Override
    public void setTermine_status(java.lang.String termine_status) {
        _statusueberblick.setTermine_status(termine_status);
    }

    /**
    * Returns the termine_text of this statusueberblick.
    *
    * @return the termine_text of this statusueberblick
    */
    @Override
    public java.lang.String getTermine_text() {
        return _statusueberblick.getTermine_text();
    }

    /**
    * Sets the termine_text of this statusueberblick.
    *
    * @param termine_text the termine_text of this statusueberblick
    */
    @Override
    public void setTermine_text(java.lang.String termine_text) {
        _statusueberblick.setTermine_text(termine_text);
    }

    @Override
    public boolean isNew() {
        return _statusueberblick.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _statusueberblick.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _statusueberblick.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _statusueberblick.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _statusueberblick.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _statusueberblick.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _statusueberblick.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _statusueberblick.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _statusueberblick.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _statusueberblick.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _statusueberblick.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new StatusueberblickWrapper((Statusueberblick) _statusueberblick.clone());
    }

    @Override
    public int compareTo(
        de.hska.wi.awp.datasource.infosys.model.Statusueberblick statusueberblick) {
        return _statusueberblick.compareTo(statusueberblick);
    }

    @Override
    public int hashCode() {
        return _statusueberblick.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<de.hska.wi.awp.datasource.infosys.model.Statusueberblick> toCacheModel() {
        return _statusueberblick.toCacheModel();
    }

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusueberblick toEscapedModel() {
        return new StatusueberblickWrapper(_statusueberblick.toEscapedModel());
    }

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusueberblick toUnescapedModel() {
        return new StatusueberblickWrapper(_statusueberblick.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _statusueberblick.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _statusueberblick.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _statusueberblick.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof StatusueberblickWrapper)) {
            return false;
        }

        StatusueberblickWrapper statusueberblickWrapper = (StatusueberblickWrapper) obj;

        if (Validator.equals(_statusueberblick,
                    statusueberblickWrapper._statusueberblick)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Statusueberblick getWrappedStatusueberblick() {
        return _statusueberblick;
    }

    @Override
    public Statusueberblick getWrappedModel() {
        return _statusueberblick;
    }

    @Override
    public void resetOriginalValues() {
        _statusueberblick.resetOriginalValues();
    }
}
