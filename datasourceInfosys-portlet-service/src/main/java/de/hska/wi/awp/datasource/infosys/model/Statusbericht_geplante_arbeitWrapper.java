package de.hska.wi.awp.datasource.infosys.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Statusbericht_geplante_arbeit}.
 * </p>
 *
 * @author Daniel Storch
 * @see Statusbericht_geplante_arbeit
 * @generated
 */
public class Statusbericht_geplante_arbeitWrapper
    implements Statusbericht_geplante_arbeit,
        ModelWrapper<Statusbericht_geplante_arbeit> {
    private Statusbericht_geplante_arbeit _statusbericht_geplante_arbeit;

    public Statusbericht_geplante_arbeitWrapper(
        Statusbericht_geplante_arbeit statusbericht_geplante_arbeit) {
        _statusbericht_geplante_arbeit = statusbericht_geplante_arbeit;
    }

    @Override
    public Class<?> getModelClass() {
        return Statusbericht_geplante_arbeit.class;
    }

    @Override
    public String getModelClassName() {
        return Statusbericht_geplante_arbeit.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("aktivitaet", getAktivitaet());
        attributes.put("bis_wann", getBis_wann());
        attributes.put("statusbericht_id", getStatusbericht_id());
        attributes.put("verantwortlicher", getVerantwortlicher());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        String aktivitaet = (String) attributes.get("aktivitaet");

        if (aktivitaet != null) {
            setAktivitaet(aktivitaet);
        }

        Date bis_wann = (Date) attributes.get("bis_wann");

        if (bis_wann != null) {
            setBis_wann(bis_wann);
        }

        Long statusbericht_id = (Long) attributes.get("statusbericht_id");

        if (statusbericht_id != null) {
            setStatusbericht_id(statusbericht_id);
        }

        Long verantwortlicher = (Long) attributes.get("verantwortlicher");

        if (verantwortlicher != null) {
            setVerantwortlicher(verantwortlicher);
        }
    }

    /**
    * Returns the primary key of this statusbericht_geplante_arbeit.
    *
    * @return the primary key of this statusbericht_geplante_arbeit
    */
    @Override
    public long getPrimaryKey() {
        return _statusbericht_geplante_arbeit.getPrimaryKey();
    }

    /**
    * Sets the primary key of this statusbericht_geplante_arbeit.
    *
    * @param primaryKey the primary key of this statusbericht_geplante_arbeit
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _statusbericht_geplante_arbeit.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the ID of this statusbericht_geplante_arbeit.
    *
    * @return the ID of this statusbericht_geplante_arbeit
    */
    @Override
    public long getId() {
        return _statusbericht_geplante_arbeit.getId();
    }

    /**
    * Sets the ID of this statusbericht_geplante_arbeit.
    *
    * @param id the ID of this statusbericht_geplante_arbeit
    */
    @Override
    public void setId(long id) {
        _statusbericht_geplante_arbeit.setId(id);
    }

    /**
    * Returns the aktivitaet of this statusbericht_geplante_arbeit.
    *
    * @return the aktivitaet of this statusbericht_geplante_arbeit
    */
    @Override
    public java.lang.String getAktivitaet() {
        return _statusbericht_geplante_arbeit.getAktivitaet();
    }

    /**
    * Sets the aktivitaet of this statusbericht_geplante_arbeit.
    *
    * @param aktivitaet the aktivitaet of this statusbericht_geplante_arbeit
    */
    @Override
    public void setAktivitaet(java.lang.String aktivitaet) {
        _statusbericht_geplante_arbeit.setAktivitaet(aktivitaet);
    }

    /**
    * Returns the bis_wann of this statusbericht_geplante_arbeit.
    *
    * @return the bis_wann of this statusbericht_geplante_arbeit
    */
    @Override
    public java.util.Date getBis_wann() {
        return _statusbericht_geplante_arbeit.getBis_wann();
    }

    /**
    * Sets the bis_wann of this statusbericht_geplante_arbeit.
    *
    * @param bis_wann the bis_wann of this statusbericht_geplante_arbeit
    */
    @Override
    public void setBis_wann(java.util.Date bis_wann) {
        _statusbericht_geplante_arbeit.setBis_wann(bis_wann);
    }

    /**
    * Returns the statusbericht_id of this statusbericht_geplante_arbeit.
    *
    * @return the statusbericht_id of this statusbericht_geplante_arbeit
    */
    @Override
    public long getStatusbericht_id() {
        return _statusbericht_geplante_arbeit.getStatusbericht_id();
    }

    /**
    * Sets the statusbericht_id of this statusbericht_geplante_arbeit.
    *
    * @param statusbericht_id the statusbericht_id of this statusbericht_geplante_arbeit
    */
    @Override
    public void setStatusbericht_id(long statusbericht_id) {
        _statusbericht_geplante_arbeit.setStatusbericht_id(statusbericht_id);
    }

    /**
    * Returns the verantwortlicher of this statusbericht_geplante_arbeit.
    *
    * @return the verantwortlicher of this statusbericht_geplante_arbeit
    */
    @Override
    public long getVerantwortlicher() {
        return _statusbericht_geplante_arbeit.getVerantwortlicher();
    }

    /**
    * Sets the verantwortlicher of this statusbericht_geplante_arbeit.
    *
    * @param verantwortlicher the verantwortlicher of this statusbericht_geplante_arbeit
    */
    @Override
    public void setVerantwortlicher(long verantwortlicher) {
        _statusbericht_geplante_arbeit.setVerantwortlicher(verantwortlicher);
    }

    @Override
    public boolean isNew() {
        return _statusbericht_geplante_arbeit.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _statusbericht_geplante_arbeit.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _statusbericht_geplante_arbeit.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _statusbericht_geplante_arbeit.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _statusbericht_geplante_arbeit.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _statusbericht_geplante_arbeit.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _statusbericht_geplante_arbeit.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _statusbericht_geplante_arbeit.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _statusbericht_geplante_arbeit.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _statusbericht_geplante_arbeit.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _statusbericht_geplante_arbeit.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new Statusbericht_geplante_arbeitWrapper((Statusbericht_geplante_arbeit) _statusbericht_geplante_arbeit.clone());
    }

    @Override
    public int compareTo(
        de.hska.wi.awp.datasource.infosys.model.Statusbericht_geplante_arbeit statusbericht_geplante_arbeit) {
        return _statusbericht_geplante_arbeit.compareTo(statusbericht_geplante_arbeit);
    }

    @Override
    public int hashCode() {
        return _statusbericht_geplante_arbeit.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<de.hska.wi.awp.datasource.infosys.model.Statusbericht_geplante_arbeit> toCacheModel() {
        return _statusbericht_geplante_arbeit.toCacheModel();
    }

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_geplante_arbeit toEscapedModel() {
        return new Statusbericht_geplante_arbeitWrapper(_statusbericht_geplante_arbeit.toEscapedModel());
    }

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_geplante_arbeit toUnescapedModel() {
        return new Statusbericht_geplante_arbeitWrapper(_statusbericht_geplante_arbeit.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _statusbericht_geplante_arbeit.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _statusbericht_geplante_arbeit.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _statusbericht_geplante_arbeit.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Statusbericht_geplante_arbeitWrapper)) {
            return false;
        }

        Statusbericht_geplante_arbeitWrapper statusbericht_geplante_arbeitWrapper =
            (Statusbericht_geplante_arbeitWrapper) obj;

        if (Validator.equals(_statusbericht_geplante_arbeit,
                    statusbericht_geplante_arbeitWrapper._statusbericht_geplante_arbeit)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Statusbericht_geplante_arbeit getWrappedStatusbericht_geplante_arbeit() {
        return _statusbericht_geplante_arbeit;
    }

    @Override
    public Statusbericht_geplante_arbeit getWrappedModel() {
        return _statusbericht_geplante_arbeit;
    }

    @Override
    public void resetOriginalValues() {
        _statusbericht_geplante_arbeit.resetOriginalValues();
    }
}
