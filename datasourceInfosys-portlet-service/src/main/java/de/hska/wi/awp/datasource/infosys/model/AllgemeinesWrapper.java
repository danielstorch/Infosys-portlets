package de.hska.wi.awp.datasource.infosys.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Allgemeines}.
 * </p>
 *
 * @author Daniel Storch
 * @see Allgemeines
 * @generated
 */
public class AllgemeinesWrapper implements Allgemeines,
    ModelWrapper<Allgemeines> {
    private Allgemeines _allgemeines;

    public AllgemeinesWrapper(Allgemeines allgemeines) {
        _allgemeines = allgemeines;
    }

    @Override
    public Class<?> getModelClass() {
        return Allgemeines.class;
    }

    @Override
    public String getModelClassName() {
        return Allgemeines.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("statusbericht_id", getStatusbericht_id());
        attributes.put("probleme_risiken", getProbleme_risiken());
        attributes.put("massnahmen", getMassnahmen());
        attributes.put("situation", getSituation());
        attributes.put("gruende", getGruende());

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

        String probleme_risiken = (String) attributes.get("probleme_risiken");

        if (probleme_risiken != null) {
            setProbleme_risiken(probleme_risiken);
        }

        String massnahmen = (String) attributes.get("massnahmen");

        if (massnahmen != null) {
            setMassnahmen(massnahmen);
        }

        String situation = (String) attributes.get("situation");

        if (situation != null) {
            setSituation(situation);
        }

        String gruende = (String) attributes.get("gruende");

        if (gruende != null) {
            setGruende(gruende);
        }
    }

    /**
    * Returns the primary key of this allgemeines.
    *
    * @return the primary key of this allgemeines
    */
    @Override
    public long getPrimaryKey() {
        return _allgemeines.getPrimaryKey();
    }

    /**
    * Sets the primary key of this allgemeines.
    *
    * @param primaryKey the primary key of this allgemeines
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _allgemeines.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the ID of this allgemeines.
    *
    * @return the ID of this allgemeines
    */
    @Override
    public long getId() {
        return _allgemeines.getId();
    }

    /**
    * Sets the ID of this allgemeines.
    *
    * @param id the ID of this allgemeines
    */
    @Override
    public void setId(long id) {
        _allgemeines.setId(id);
    }

    /**
    * Returns the statusbericht_id of this allgemeines.
    *
    * @return the statusbericht_id of this allgemeines
    */
    @Override
    public long getStatusbericht_id() {
        return _allgemeines.getStatusbericht_id();
    }

    /**
    * Sets the statusbericht_id of this allgemeines.
    *
    * @param statusbericht_id the statusbericht_id of this allgemeines
    */
    @Override
    public void setStatusbericht_id(long statusbericht_id) {
        _allgemeines.setStatusbericht_id(statusbericht_id);
    }

    /**
    * Returns the probleme_risiken of this allgemeines.
    *
    * @return the probleme_risiken of this allgemeines
    */
    @Override
    public java.lang.String getProbleme_risiken() {
        return _allgemeines.getProbleme_risiken();
    }

    /**
    * Sets the probleme_risiken of this allgemeines.
    *
    * @param probleme_risiken the probleme_risiken of this allgemeines
    */
    @Override
    public void setProbleme_risiken(java.lang.String probleme_risiken) {
        _allgemeines.setProbleme_risiken(probleme_risiken);
    }

    /**
    * Returns the massnahmen of this allgemeines.
    *
    * @return the massnahmen of this allgemeines
    */
    @Override
    public java.lang.String getMassnahmen() {
        return _allgemeines.getMassnahmen();
    }

    /**
    * Sets the massnahmen of this allgemeines.
    *
    * @param massnahmen the massnahmen of this allgemeines
    */
    @Override
    public void setMassnahmen(java.lang.String massnahmen) {
        _allgemeines.setMassnahmen(massnahmen);
    }

    /**
    * Returns the situation of this allgemeines.
    *
    * @return the situation of this allgemeines
    */
    @Override
    public java.lang.String getSituation() {
        return _allgemeines.getSituation();
    }

    /**
    * Sets the situation of this allgemeines.
    *
    * @param situation the situation of this allgemeines
    */
    @Override
    public void setSituation(java.lang.String situation) {
        _allgemeines.setSituation(situation);
    }

    /**
    * Returns the gruende of this allgemeines.
    *
    * @return the gruende of this allgemeines
    */
    @Override
    public java.lang.String getGruende() {
        return _allgemeines.getGruende();
    }

    /**
    * Sets the gruende of this allgemeines.
    *
    * @param gruende the gruende of this allgemeines
    */
    @Override
    public void setGruende(java.lang.String gruende) {
        _allgemeines.setGruende(gruende);
    }

    @Override
    public boolean isNew() {
        return _allgemeines.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _allgemeines.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _allgemeines.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _allgemeines.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _allgemeines.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _allgemeines.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _allgemeines.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _allgemeines.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _allgemeines.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _allgemeines.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _allgemeines.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new AllgemeinesWrapper((Allgemeines) _allgemeines.clone());
    }

    @Override
    public int compareTo(
        de.hska.wi.awp.datasource.infosys.model.Allgemeines allgemeines) {
        return _allgemeines.compareTo(allgemeines);
    }

    @Override
    public int hashCode() {
        return _allgemeines.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<de.hska.wi.awp.datasource.infosys.model.Allgemeines> toCacheModel() {
        return _allgemeines.toCacheModel();
    }

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Allgemeines toEscapedModel() {
        return new AllgemeinesWrapper(_allgemeines.toEscapedModel());
    }

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Allgemeines toUnescapedModel() {
        return new AllgemeinesWrapper(_allgemeines.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _allgemeines.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _allgemeines.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _allgemeines.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof AllgemeinesWrapper)) {
            return false;
        }

        AllgemeinesWrapper allgemeinesWrapper = (AllgemeinesWrapper) obj;

        if (Validator.equals(_allgemeines, allgemeinesWrapper._allgemeines)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Allgemeines getWrappedAllgemeines() {
        return _allgemeines;
    }

    @Override
    public Allgemeines getWrappedModel() {
        return _allgemeines;
    }

    @Override
    public void resetOriginalValues() {
        _allgemeines.resetOriginalValues();
    }
}
