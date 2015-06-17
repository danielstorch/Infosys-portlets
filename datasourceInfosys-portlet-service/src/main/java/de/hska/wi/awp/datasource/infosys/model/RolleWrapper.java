package de.hska.wi.awp.datasource.infosys.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Rolle}.
 * </p>
 *
 * @author Daniel Storch
 * @see Rolle
 * @generated
 */
public class RolleWrapper implements Rolle, ModelWrapper<Rolle> {
    private Rolle _rolle;

    public RolleWrapper(Rolle rolle) {
        _rolle = rolle;
    }

    @Override
    public Class<?> getModelClass() {
        return Rolle.class;
    }

    @Override
    public String getModelClassName() {
        return Rolle.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("shortName", getShortName());
        attributes.put("name", getName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        String shortName = (String) attributes.get("shortName");

        if (shortName != null) {
            setShortName(shortName);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }
    }

    /**
    * Returns the primary key of this rolle.
    *
    * @return the primary key of this rolle
    */
    @Override
    public long getPrimaryKey() {
        return _rolle.getPrimaryKey();
    }

    /**
    * Sets the primary key of this rolle.
    *
    * @param primaryKey the primary key of this rolle
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _rolle.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the ID of this rolle.
    *
    * @return the ID of this rolle
    */
    @Override
    public long getId() {
        return _rolle.getId();
    }

    /**
    * Sets the ID of this rolle.
    *
    * @param id the ID of this rolle
    */
    @Override
    public void setId(long id) {
        _rolle.setId(id);
    }

    /**
    * Returns the short name of this rolle.
    *
    * @return the short name of this rolle
    */
    @Override
    public java.lang.String getShortName() {
        return _rolle.getShortName();
    }

    /**
    * Sets the short name of this rolle.
    *
    * @param shortName the short name of this rolle
    */
    @Override
    public void setShortName(java.lang.String shortName) {
        _rolle.setShortName(shortName);
    }

    /**
    * Returns the name of this rolle.
    *
    * @return the name of this rolle
    */
    @Override
    public java.lang.String getName() {
        return _rolle.getName();
    }

    /**
    * Sets the name of this rolle.
    *
    * @param name the name of this rolle
    */
    @Override
    public void setName(java.lang.String name) {
        _rolle.setName(name);
    }

    @Override
    public boolean isNew() {
        return _rolle.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _rolle.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _rolle.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _rolle.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _rolle.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _rolle.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _rolle.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _rolle.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _rolle.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _rolle.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _rolle.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new RolleWrapper((Rolle) _rolle.clone());
    }

    @Override
    public int compareTo(de.hska.wi.awp.datasource.infosys.model.Rolle rolle) {
        return _rolle.compareTo(rolle);
    }

    @Override
    public int hashCode() {
        return _rolle.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<de.hska.wi.awp.datasource.infosys.model.Rolle> toCacheModel() {
        return _rolle.toCacheModel();
    }

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Rolle toEscapedModel() {
        return new RolleWrapper(_rolle.toEscapedModel());
    }

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Rolle toUnescapedModel() {
        return new RolleWrapper(_rolle.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _rolle.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _rolle.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _rolle.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof RolleWrapper)) {
            return false;
        }

        RolleWrapper rolleWrapper = (RolleWrapper) obj;

        if (Validator.equals(_rolle, rolleWrapper._rolle)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Rolle getWrappedRolle() {
        return _rolle;
    }

    @Override
    public Rolle getWrappedModel() {
        return _rolle;
    }

    @Override
    public void resetOriginalValues() {
        _rolle.resetOriginalValues();
    }
}
