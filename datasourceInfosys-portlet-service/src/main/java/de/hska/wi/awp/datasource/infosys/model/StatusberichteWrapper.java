package de.hska.wi.awp.datasource.infosys.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Statusberichte}.
 * </p>
 *
 * @author Daniel Storch
 * @see Statusberichte
 * @generated
 */
public class StatusberichteWrapper implements Statusberichte,
    ModelWrapper<Statusberichte> {
    private Statusberichte _statusberichte;

    public StatusberichteWrapper(Statusberichte statusberichte) {
        _statusberichte = statusberichte;
    }

    @Override
    public Class<?> getModelClass() {
        return Statusberichte.class;
    }

    @Override
    public String getModelClassName() {
        return Statusberichte.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("project_id", getProject_id());
        attributes.put("datum", getDatum());
        attributes.put("kalenderwoche", getKalenderwoche());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        Long project_id = (Long) attributes.get("project_id");

        if (project_id != null) {
            setProject_id(project_id);
        }

        Date datum = (Date) attributes.get("datum");

        if (datum != null) {
            setDatum(datum);
        }

        Integer kalenderwoche = (Integer) attributes.get("kalenderwoche");

        if (kalenderwoche != null) {
            setKalenderwoche(kalenderwoche);
        }
    }

    /**
    * Returns the primary key of this statusberichte.
    *
    * @return the primary key of this statusberichte
    */
    @Override
    public long getPrimaryKey() {
        return _statusberichte.getPrimaryKey();
    }

    /**
    * Sets the primary key of this statusberichte.
    *
    * @param primaryKey the primary key of this statusberichte
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _statusberichte.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the ID of this statusberichte.
    *
    * @return the ID of this statusberichte
    */
    @Override
    public long getId() {
        return _statusberichte.getId();
    }

    /**
    * Sets the ID of this statusberichte.
    *
    * @param id the ID of this statusberichte
    */
    @Override
    public void setId(long id) {
        _statusberichte.setId(id);
    }

    /**
    * Returns the project_id of this statusberichte.
    *
    * @return the project_id of this statusberichte
    */
    @Override
    public long getProject_id() {
        return _statusberichte.getProject_id();
    }

    /**
    * Sets the project_id of this statusberichte.
    *
    * @param project_id the project_id of this statusberichte
    */
    @Override
    public void setProject_id(long project_id) {
        _statusberichte.setProject_id(project_id);
    }

    /**
    * Returns the datum of this statusberichte.
    *
    * @return the datum of this statusberichte
    */
    @Override
    public java.util.Date getDatum() {
        return _statusberichte.getDatum();
    }

    /**
    * Sets the datum of this statusberichte.
    *
    * @param datum the datum of this statusberichte
    */
    @Override
    public void setDatum(java.util.Date datum) {
        _statusberichte.setDatum(datum);
    }

    /**
    * Returns the kalenderwoche of this statusberichte.
    *
    * @return the kalenderwoche of this statusberichte
    */
    @Override
    public int getKalenderwoche() {
        return _statusberichte.getKalenderwoche();
    }

    /**
    * Sets the kalenderwoche of this statusberichte.
    *
    * @param kalenderwoche the kalenderwoche of this statusberichte
    */
    @Override
    public void setKalenderwoche(int kalenderwoche) {
        _statusberichte.setKalenderwoche(kalenderwoche);
    }

    @Override
    public boolean isNew() {
        return _statusberichte.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _statusberichte.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _statusberichte.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _statusberichte.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _statusberichte.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _statusberichte.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _statusberichte.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _statusberichte.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _statusberichte.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _statusberichte.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _statusberichte.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new StatusberichteWrapper((Statusberichte) _statusberichte.clone());
    }

    @Override
    public int compareTo(
        de.hska.wi.awp.datasource.infosys.model.Statusberichte statusberichte) {
        return _statusberichte.compareTo(statusberichte);
    }

    @Override
    public int hashCode() {
        return _statusberichte.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<de.hska.wi.awp.datasource.infosys.model.Statusberichte> toCacheModel() {
        return _statusberichte.toCacheModel();
    }

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusberichte toEscapedModel() {
        return new StatusberichteWrapper(_statusberichte.toEscapedModel());
    }

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusberichte toUnescapedModel() {
        return new StatusberichteWrapper(_statusberichte.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _statusberichte.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _statusberichte.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _statusberichte.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof StatusberichteWrapper)) {
            return false;
        }

        StatusberichteWrapper statusberichteWrapper = (StatusberichteWrapper) obj;

        if (Validator.equals(_statusberichte,
                    statusberichteWrapper._statusberichte)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Statusberichte getWrappedStatusberichte() {
        return _statusberichte;
    }

    @Override
    public Statusberichte getWrappedModel() {
        return _statusberichte;
    }

    @Override
    public void resetOriginalValues() {
        _statusberichte.resetOriginalValues();
    }
}
