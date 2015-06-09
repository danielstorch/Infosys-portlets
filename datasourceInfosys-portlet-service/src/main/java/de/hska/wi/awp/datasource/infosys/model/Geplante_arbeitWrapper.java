package de.hska.wi.awp.datasource.infosys.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Geplante_arbeit}.
 * </p>
 *
 * @author Daniel Storch
 * @see Geplante_arbeit
 * @generated
 */
public class Geplante_arbeitWrapper implements Geplante_arbeit,
    ModelWrapper<Geplante_arbeit> {
    private Geplante_arbeit _geplante_arbeit;

    public Geplante_arbeitWrapper(Geplante_arbeit geplante_arbeit) {
        _geplante_arbeit = geplante_arbeit;
    }

    @Override
    public Class<?> getModelClass() {
        return Geplante_arbeit.class;
    }

    @Override
    public String getModelClassName() {
        return Geplante_arbeit.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("statusbericht_id", getStatusbericht_id());
        attributes.put("verantwortlicher", getVerantwortlicher());
        attributes.put("arbeit", getArbeit());
        attributes.put("bis_wann", getBis_wann());

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

        Long verantwortlicher = (Long) attributes.get("verantwortlicher");

        if (verantwortlicher != null) {
            setVerantwortlicher(verantwortlicher);
        }

        String arbeit = (String) attributes.get("arbeit");

        if (arbeit != null) {
            setArbeit(arbeit);
        }

        Date bis_wann = (Date) attributes.get("bis_wann");

        if (bis_wann != null) {
            setBis_wann(bis_wann);
        }
    }

    /**
    * Returns the primary key of this geplante_arbeit.
    *
    * @return the primary key of this geplante_arbeit
    */
    @Override
    public long getPrimaryKey() {
        return _geplante_arbeit.getPrimaryKey();
    }

    /**
    * Sets the primary key of this geplante_arbeit.
    *
    * @param primaryKey the primary key of this geplante_arbeit
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _geplante_arbeit.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the ID of this geplante_arbeit.
    *
    * @return the ID of this geplante_arbeit
    */
    @Override
    public long getId() {
        return _geplante_arbeit.getId();
    }

    /**
    * Sets the ID of this geplante_arbeit.
    *
    * @param id the ID of this geplante_arbeit
    */
    @Override
    public void setId(long id) {
        _geplante_arbeit.setId(id);
    }

    /**
    * Returns the statusbericht_id of this geplante_arbeit.
    *
    * @return the statusbericht_id of this geplante_arbeit
    */
    @Override
    public long getStatusbericht_id() {
        return _geplante_arbeit.getStatusbericht_id();
    }

    /**
    * Sets the statusbericht_id of this geplante_arbeit.
    *
    * @param statusbericht_id the statusbericht_id of this geplante_arbeit
    */
    @Override
    public void setStatusbericht_id(long statusbericht_id) {
        _geplante_arbeit.setStatusbericht_id(statusbericht_id);
    }

    /**
    * Returns the verantwortlicher of this geplante_arbeit.
    *
    * @return the verantwortlicher of this geplante_arbeit
    */
    @Override
    public long getVerantwortlicher() {
        return _geplante_arbeit.getVerantwortlicher();
    }

    /**
    * Sets the verantwortlicher of this geplante_arbeit.
    *
    * @param verantwortlicher the verantwortlicher of this geplante_arbeit
    */
    @Override
    public void setVerantwortlicher(long verantwortlicher) {
        _geplante_arbeit.setVerantwortlicher(verantwortlicher);
    }

    /**
    * Returns the arbeit of this geplante_arbeit.
    *
    * @return the arbeit of this geplante_arbeit
    */
    @Override
    public java.lang.String getArbeit() {
        return _geplante_arbeit.getArbeit();
    }

    /**
    * Sets the arbeit of this geplante_arbeit.
    *
    * @param arbeit the arbeit of this geplante_arbeit
    */
    @Override
    public void setArbeit(java.lang.String arbeit) {
        _geplante_arbeit.setArbeit(arbeit);
    }

    /**
    * Returns the bis_wann of this geplante_arbeit.
    *
    * @return the bis_wann of this geplante_arbeit
    */
    @Override
    public java.util.Date getBis_wann() {
        return _geplante_arbeit.getBis_wann();
    }

    /**
    * Sets the bis_wann of this geplante_arbeit.
    *
    * @param bis_wann the bis_wann of this geplante_arbeit
    */
    @Override
    public void setBis_wann(java.util.Date bis_wann) {
        _geplante_arbeit.setBis_wann(bis_wann);
    }

    @Override
    public boolean isNew() {
        return _geplante_arbeit.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _geplante_arbeit.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _geplante_arbeit.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _geplante_arbeit.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _geplante_arbeit.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _geplante_arbeit.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _geplante_arbeit.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _geplante_arbeit.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _geplante_arbeit.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _geplante_arbeit.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _geplante_arbeit.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new Geplante_arbeitWrapper((Geplante_arbeit) _geplante_arbeit.clone());
    }

    @Override
    public int compareTo(
        de.hska.wi.awp.datasource.infosys.model.Geplante_arbeit geplante_arbeit) {
        return _geplante_arbeit.compareTo(geplante_arbeit);
    }

    @Override
    public int hashCode() {
        return _geplante_arbeit.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<de.hska.wi.awp.datasource.infosys.model.Geplante_arbeit> toCacheModel() {
        return _geplante_arbeit.toCacheModel();
    }

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Geplante_arbeit toEscapedModel() {
        return new Geplante_arbeitWrapper(_geplante_arbeit.toEscapedModel());
    }

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Geplante_arbeit toUnescapedModel() {
        return new Geplante_arbeitWrapper(_geplante_arbeit.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _geplante_arbeit.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _geplante_arbeit.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _geplante_arbeit.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Geplante_arbeitWrapper)) {
            return false;
        }

        Geplante_arbeitWrapper geplante_arbeitWrapper = (Geplante_arbeitWrapper) obj;

        if (Validator.equals(_geplante_arbeit,
                    geplante_arbeitWrapper._geplante_arbeit)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Geplante_arbeit getWrappedGeplante_arbeit() {
        return _geplante_arbeit;
    }

    @Override
    public Geplante_arbeit getWrappedModel() {
        return _geplante_arbeit;
    }

    @Override
    public void resetOriginalValues() {
        _geplante_arbeit.resetOriginalValues();
    }
}
