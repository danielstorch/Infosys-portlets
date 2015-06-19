package de.hska.wi.awp.datasource.infosys.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Statusbericht_detail}.
 * </p>
 *
 * @author Daniel Storch
 * @see Statusbericht_detail
 * @generated
 */
public class Statusbericht_detailWrapper implements Statusbericht_detail,
    ModelWrapper<Statusbericht_detail> {
    private Statusbericht_detail _statusbericht_detail;

    public Statusbericht_detailWrapper(
        Statusbericht_detail statusbericht_detail) {
        _statusbericht_detail = statusbericht_detail;
    }

    @Override
    public Class<?> getModelClass() {
        return Statusbericht_detail.class;
    }

    @Override
    public String getModelClassName() {
        return Statusbericht_detail.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("text", getText());
        attributes.put("statusbericht_id", getStatusbericht_id());
        attributes.put("statusbericht_detail_punkt_id",
            getStatusbericht_detail_punkt_id());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        String text = (String) attributes.get("text");

        if (text != null) {
            setText(text);
        }

        Long statusbericht_id = (Long) attributes.get("statusbericht_id");

        if (statusbericht_id != null) {
            setStatusbericht_id(statusbericht_id);
        }

        Long statusbericht_detail_punkt_id = (Long) attributes.get(
                "statusbericht_detail_punkt_id");

        if (statusbericht_detail_punkt_id != null) {
            setStatusbericht_detail_punkt_id(statusbericht_detail_punkt_id);
        }
    }

    /**
    * Returns the primary key of this statusbericht_detail.
    *
    * @return the primary key of this statusbericht_detail
    */
    @Override
    public long getPrimaryKey() {
        return _statusbericht_detail.getPrimaryKey();
    }

    /**
    * Sets the primary key of this statusbericht_detail.
    *
    * @param primaryKey the primary key of this statusbericht_detail
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _statusbericht_detail.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the ID of this statusbericht_detail.
    *
    * @return the ID of this statusbericht_detail
    */
    @Override
    public long getId() {
        return _statusbericht_detail.getId();
    }

    /**
    * Sets the ID of this statusbericht_detail.
    *
    * @param id the ID of this statusbericht_detail
    */
    @Override
    public void setId(long id) {
        _statusbericht_detail.setId(id);
    }

    /**
    * Returns the text of this statusbericht_detail.
    *
    * @return the text of this statusbericht_detail
    */
    @Override
    public java.lang.String getText() {
        return _statusbericht_detail.getText();
    }

    /**
    * Sets the text of this statusbericht_detail.
    *
    * @param text the text of this statusbericht_detail
    */
    @Override
    public void setText(java.lang.String text) {
        _statusbericht_detail.setText(text);
    }

    /**
    * Returns the statusbericht_id of this statusbericht_detail.
    *
    * @return the statusbericht_id of this statusbericht_detail
    */
    @Override
    public long getStatusbericht_id() {
        return _statusbericht_detail.getStatusbericht_id();
    }

    /**
    * Sets the statusbericht_id of this statusbericht_detail.
    *
    * @param statusbericht_id the statusbericht_id of this statusbericht_detail
    */
    @Override
    public void setStatusbericht_id(long statusbericht_id) {
        _statusbericht_detail.setStatusbericht_id(statusbericht_id);
    }

    /**
    * Returns the statusbericht_detail_punkt_id of this statusbericht_detail.
    *
    * @return the statusbericht_detail_punkt_id of this statusbericht_detail
    */
    @Override
    public long getStatusbericht_detail_punkt_id() {
        return _statusbericht_detail.getStatusbericht_detail_punkt_id();
    }

    /**
    * Sets the statusbericht_detail_punkt_id of this statusbericht_detail.
    *
    * @param statusbericht_detail_punkt_id the statusbericht_detail_punkt_id of this statusbericht_detail
    */
    @Override
    public void setStatusbericht_detail_punkt_id(
        long statusbericht_detail_punkt_id) {
        _statusbericht_detail.setStatusbericht_detail_punkt_id(statusbericht_detail_punkt_id);
    }

    @Override
    public boolean isNew() {
        return _statusbericht_detail.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _statusbericht_detail.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _statusbericht_detail.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _statusbericht_detail.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _statusbericht_detail.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _statusbericht_detail.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _statusbericht_detail.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _statusbericht_detail.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _statusbericht_detail.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _statusbericht_detail.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _statusbericht_detail.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new Statusbericht_detailWrapper((Statusbericht_detail) _statusbericht_detail.clone());
    }

    @Override
    public int compareTo(
        de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail statusbericht_detail) {
        return _statusbericht_detail.compareTo(statusbericht_detail);
    }

    @Override
    public int hashCode() {
        return _statusbericht_detail.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail> toCacheModel() {
        return _statusbericht_detail.toCacheModel();
    }

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail toEscapedModel() {
        return new Statusbericht_detailWrapper(_statusbericht_detail.toEscapedModel());
    }

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail toUnescapedModel() {
        return new Statusbericht_detailWrapper(_statusbericht_detail.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _statusbericht_detail.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _statusbericht_detail.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _statusbericht_detail.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Statusbericht_detailWrapper)) {
            return false;
        }

        Statusbericht_detailWrapper statusbericht_detailWrapper = (Statusbericht_detailWrapper) obj;

        if (Validator.equals(_statusbericht_detail,
                    statusbericht_detailWrapper._statusbericht_detail)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Statusbericht_detail getWrappedStatusbericht_detail() {
        return _statusbericht_detail;
    }

    @Override
    public Statusbericht_detail getWrappedModel() {
        return _statusbericht_detail;
    }

    @Override
    public void resetOriginalValues() {
        _statusbericht_detail.resetOriginalValues();
    }
}
