package de.hska.wi.awp.datasource.infosys.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Statusbericht_info}.
 * </p>
 *
 * @author Daniel Storch
 * @see Statusbericht_info
 * @generated
 */
public class Statusbericht_infoWrapper implements Statusbericht_info,
    ModelWrapper<Statusbericht_info> {
    private Statusbericht_info _statusbericht_info;

    public Statusbericht_infoWrapper(Statusbericht_info statusbericht_info) {
        _statusbericht_info = statusbericht_info;
    }

    @Override
    public Class<?> getModelClass() {
        return Statusbericht_info.class;
    }

    @Override
    public String getModelClassName() {
        return Statusbericht_info.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("bemerkung", getBemerkung());
        attributes.put("status", getStatus());
        attributes.put("statusbericht_id", getStatusbericht_id());
        attributes.put("statusbericht_info_punkt_id",
            getStatusbericht_info_punkt_id());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        String bemerkung = (String) attributes.get("bemerkung");

        if (bemerkung != null) {
            setBemerkung(bemerkung);
        }

        Integer status = (Integer) attributes.get("status");

        if (status != null) {
            setStatus(status);
        }

        Long statusbericht_id = (Long) attributes.get("statusbericht_id");

        if (statusbericht_id != null) {
            setStatusbericht_id(statusbericht_id);
        }

        Long statusbericht_info_punkt_id = (Long) attributes.get(
                "statusbericht_info_punkt_id");

        if (statusbericht_info_punkt_id != null) {
            setStatusbericht_info_punkt_id(statusbericht_info_punkt_id);
        }
    }

    /**
    * Returns the primary key of this statusbericht_info.
    *
    * @return the primary key of this statusbericht_info
    */
    @Override
    public long getPrimaryKey() {
        return _statusbericht_info.getPrimaryKey();
    }

    /**
    * Sets the primary key of this statusbericht_info.
    *
    * @param primaryKey the primary key of this statusbericht_info
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _statusbericht_info.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the ID of this statusbericht_info.
    *
    * @return the ID of this statusbericht_info
    */
    @Override
    public long getId() {
        return _statusbericht_info.getId();
    }

    /**
    * Sets the ID of this statusbericht_info.
    *
    * @param id the ID of this statusbericht_info
    */
    @Override
    public void setId(long id) {
        _statusbericht_info.setId(id);
    }

    /**
    * Returns the bemerkung of this statusbericht_info.
    *
    * @return the bemerkung of this statusbericht_info
    */
    @Override
    public java.lang.String getBemerkung() {
        return _statusbericht_info.getBemerkung();
    }

    /**
    * Sets the bemerkung of this statusbericht_info.
    *
    * @param bemerkung the bemerkung of this statusbericht_info
    */
    @Override
    public void setBemerkung(java.lang.String bemerkung) {
        _statusbericht_info.setBemerkung(bemerkung);
    }

    /**
    * Returns the status of this statusbericht_info.
    *
    * @return the status of this statusbericht_info
    */
    @Override
    public int getStatus() {
        return _statusbericht_info.getStatus();
    }

    /**
    * Sets the status of this statusbericht_info.
    *
    * @param status the status of this statusbericht_info
    */
    @Override
    public void setStatus(int status) {
        _statusbericht_info.setStatus(status);
    }

    /**
    * Returns the statusbericht_id of this statusbericht_info.
    *
    * @return the statusbericht_id of this statusbericht_info
    */
    @Override
    public long getStatusbericht_id() {
        return _statusbericht_info.getStatusbericht_id();
    }

    /**
    * Sets the statusbericht_id of this statusbericht_info.
    *
    * @param statusbericht_id the statusbericht_id of this statusbericht_info
    */
    @Override
    public void setStatusbericht_id(long statusbericht_id) {
        _statusbericht_info.setStatusbericht_id(statusbericht_id);
    }

    /**
    * Returns the statusbericht_info_punkt_id of this statusbericht_info.
    *
    * @return the statusbericht_info_punkt_id of this statusbericht_info
    */
    @Override
    public long getStatusbericht_info_punkt_id() {
        return _statusbericht_info.getStatusbericht_info_punkt_id();
    }

    /**
    * Sets the statusbericht_info_punkt_id of this statusbericht_info.
    *
    * @param statusbericht_info_punkt_id the statusbericht_info_punkt_id of this statusbericht_info
    */
    @Override
    public void setStatusbericht_info_punkt_id(long statusbericht_info_punkt_id) {
        _statusbericht_info.setStatusbericht_info_punkt_id(statusbericht_info_punkt_id);
    }

    @Override
    public boolean isNew() {
        return _statusbericht_info.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _statusbericht_info.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _statusbericht_info.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _statusbericht_info.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _statusbericht_info.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _statusbericht_info.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _statusbericht_info.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _statusbericht_info.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _statusbericht_info.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _statusbericht_info.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _statusbericht_info.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new Statusbericht_infoWrapper((Statusbericht_info) _statusbericht_info.clone());
    }

    @Override
    public int compareTo(
        de.hska.wi.awp.datasource.infosys.model.Statusbericht_info statusbericht_info) {
        return _statusbericht_info.compareTo(statusbericht_info);
    }

    @Override
    public int hashCode() {
        return _statusbericht_info.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<de.hska.wi.awp.datasource.infosys.model.Statusbericht_info> toCacheModel() {
        return _statusbericht_info.toCacheModel();
    }

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_info toEscapedModel() {
        return new Statusbericht_infoWrapper(_statusbericht_info.toEscapedModel());
    }

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_info toUnescapedModel() {
        return new Statusbericht_infoWrapper(_statusbericht_info.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _statusbericht_info.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _statusbericht_info.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _statusbericht_info.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Statusbericht_infoWrapper)) {
            return false;
        }

        Statusbericht_infoWrapper statusbericht_infoWrapper = (Statusbericht_infoWrapper) obj;

        if (Validator.equals(_statusbericht_info,
                    statusbericht_infoWrapper._statusbericht_info)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Statusbericht_info getWrappedStatusbericht_info() {
        return _statusbericht_info;
    }

    @Override
    public Statusbericht_info getWrappedModel() {
        return _statusbericht_info;
    }

    @Override
    public void resetOriginalValues() {
        _statusbericht_info.resetOriginalValues();
    }
}
