package de.hska.wi.awp.datasource.infosys.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Statusbericht_detail_punkt}.
 * </p>
 *
 * @author Daniel Storch
 * @see Statusbericht_detail_punkt
 * @generated
 */
public class Statusbericht_detail_punktWrapper
    implements Statusbericht_detail_punkt,
        ModelWrapper<Statusbericht_detail_punkt> {
    private Statusbericht_detail_punkt _statusbericht_detail_punkt;

    public Statusbericht_detail_punktWrapper(
        Statusbericht_detail_punkt statusbericht_detail_punkt) {
        _statusbericht_detail_punkt = statusbericht_detail_punkt;
    }

    @Override
    public Class<?> getModelClass() {
        return Statusbericht_detail_punkt.class;
    }

    @Override
    public String getModelClassName() {
        return Statusbericht_detail_punkt.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("name", getName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }
    }

    /**
    * Returns the primary key of this statusbericht_detail_punkt.
    *
    * @return the primary key of this statusbericht_detail_punkt
    */
    @Override
    public long getPrimaryKey() {
        return _statusbericht_detail_punkt.getPrimaryKey();
    }

    /**
    * Sets the primary key of this statusbericht_detail_punkt.
    *
    * @param primaryKey the primary key of this statusbericht_detail_punkt
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _statusbericht_detail_punkt.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the ID of this statusbericht_detail_punkt.
    *
    * @return the ID of this statusbericht_detail_punkt
    */
    @Override
    public long getId() {
        return _statusbericht_detail_punkt.getId();
    }

    /**
    * Sets the ID of this statusbericht_detail_punkt.
    *
    * @param id the ID of this statusbericht_detail_punkt
    */
    @Override
    public void setId(long id) {
        _statusbericht_detail_punkt.setId(id);
    }

    /**
    * Returns the name of this statusbericht_detail_punkt.
    *
    * @return the name of this statusbericht_detail_punkt
    */
    @Override
    public java.lang.String getName() {
        return _statusbericht_detail_punkt.getName();
    }

    /**
    * Sets the name of this statusbericht_detail_punkt.
    *
    * @param name the name of this statusbericht_detail_punkt
    */
    @Override
    public void setName(java.lang.String name) {
        _statusbericht_detail_punkt.setName(name);
    }

    @Override
    public boolean isNew() {
        return _statusbericht_detail_punkt.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _statusbericht_detail_punkt.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _statusbericht_detail_punkt.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _statusbericht_detail_punkt.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _statusbericht_detail_punkt.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _statusbericht_detail_punkt.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _statusbericht_detail_punkt.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _statusbericht_detail_punkt.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _statusbericht_detail_punkt.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _statusbericht_detail_punkt.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _statusbericht_detail_punkt.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new Statusbericht_detail_punktWrapper((Statusbericht_detail_punkt) _statusbericht_detail_punkt.clone());
    }

    @Override
    public int compareTo(
        de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail_punkt statusbericht_detail_punkt) {
        return _statusbericht_detail_punkt.compareTo(statusbericht_detail_punkt);
    }

    @Override
    public int hashCode() {
        return _statusbericht_detail_punkt.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail_punkt> toCacheModel() {
        return _statusbericht_detail_punkt.toCacheModel();
    }

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail_punkt toEscapedModel() {
        return new Statusbericht_detail_punktWrapper(_statusbericht_detail_punkt.toEscapedModel());
    }

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail_punkt toUnescapedModel() {
        return new Statusbericht_detail_punktWrapper(_statusbericht_detail_punkt.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _statusbericht_detail_punkt.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _statusbericht_detail_punkt.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _statusbericht_detail_punkt.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Statusbericht_detail_punktWrapper)) {
            return false;
        }

        Statusbericht_detail_punktWrapper statusbericht_detail_punktWrapper = (Statusbericht_detail_punktWrapper) obj;

        if (Validator.equals(_statusbericht_detail_punkt,
                    statusbericht_detail_punktWrapper._statusbericht_detail_punkt)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Statusbericht_detail_punkt getWrappedStatusbericht_detail_punkt() {
        return _statusbericht_detail_punkt;
    }

    @Override
    public Statusbericht_detail_punkt getWrappedModel() {
        return _statusbericht_detail_punkt;
    }

    @Override
    public void resetOriginalValues() {
        _statusbericht_detail_punkt.resetOriginalValues();
    }
}
