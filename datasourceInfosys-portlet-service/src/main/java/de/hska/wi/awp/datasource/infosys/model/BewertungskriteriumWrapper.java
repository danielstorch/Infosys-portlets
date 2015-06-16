package de.hska.wi.awp.datasource.infosys.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Bewertungskriterium}.
 * </p>
 *
 * @author Daniel Storch
 * @see Bewertungskriterium
 * @generated
 */
public class BewertungskriteriumWrapper implements Bewertungskriterium,
    ModelWrapper<Bewertungskriterium> {
    private Bewertungskriterium _bewertungskriterium;

    public BewertungskriteriumWrapper(Bewertungskriterium bewertungskriterium) {
        _bewertungskriterium = bewertungskriterium;
    }

    @Override
    public Class<?> getModelClass() {
        return Bewertungskriterium.class;
    }

    @Override
    public String getModelClassName() {
        return Bewertungskriterium.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("name", getName());
        attributes.put("beschreibung", getBeschreibung());
        attributes.put("gewichtung", getGewichtung());

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

        String beschreibung = (String) attributes.get("beschreibung");

        if (beschreibung != null) {
            setBeschreibung(beschreibung);
        }

        Integer gewichtung = (Integer) attributes.get("gewichtung");

        if (gewichtung != null) {
            setGewichtung(gewichtung);
        }
    }

    /**
    * Returns the primary key of this bewertungskriterium.
    *
    * @return the primary key of this bewertungskriterium
    */
    @Override
    public long getPrimaryKey() {
        return _bewertungskriterium.getPrimaryKey();
    }

    /**
    * Sets the primary key of this bewertungskriterium.
    *
    * @param primaryKey the primary key of this bewertungskriterium
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _bewertungskriterium.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the ID of this bewertungskriterium.
    *
    * @return the ID of this bewertungskriterium
    */
    @Override
    public long getId() {
        return _bewertungskriterium.getId();
    }

    /**
    * Sets the ID of this bewertungskriterium.
    *
    * @param id the ID of this bewertungskriterium
    */
    @Override
    public void setId(long id) {
        _bewertungskriterium.setId(id);
    }

    /**
    * Returns the name of this bewertungskriterium.
    *
    * @return the name of this bewertungskriterium
    */
    @Override
    public java.lang.String getName() {
        return _bewertungskriterium.getName();
    }

    /**
    * Sets the name of this bewertungskriterium.
    *
    * @param name the name of this bewertungskriterium
    */
    @Override
    public void setName(java.lang.String name) {
        _bewertungskriterium.setName(name);
    }

    /**
    * Returns the beschreibung of this bewertungskriterium.
    *
    * @return the beschreibung of this bewertungskriterium
    */
    @Override
    public java.lang.String getBeschreibung() {
        return _bewertungskriterium.getBeschreibung();
    }

    /**
    * Sets the beschreibung of this bewertungskriterium.
    *
    * @param beschreibung the beschreibung of this bewertungskriterium
    */
    @Override
    public void setBeschreibung(java.lang.String beschreibung) {
        _bewertungskriterium.setBeschreibung(beschreibung);
    }

    /**
    * Returns the gewichtung of this bewertungskriterium.
    *
    * @return the gewichtung of this bewertungskriterium
    */
    @Override
    public int getGewichtung() {
        return _bewertungskriterium.getGewichtung();
    }

    /**
    * Sets the gewichtung of this bewertungskriterium.
    *
    * @param gewichtung the gewichtung of this bewertungskriterium
    */
    @Override
    public void setGewichtung(int gewichtung) {
        _bewertungskriterium.setGewichtung(gewichtung);
    }

    @Override
    public boolean isNew() {
        return _bewertungskriterium.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _bewertungskriterium.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _bewertungskriterium.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _bewertungskriterium.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _bewertungskriterium.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _bewertungskriterium.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _bewertungskriterium.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _bewertungskriterium.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _bewertungskriterium.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _bewertungskriterium.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _bewertungskriterium.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new BewertungskriteriumWrapper((Bewertungskriterium) _bewertungskriterium.clone());
    }

    @Override
    public int compareTo(
        de.hska.wi.awp.datasource.infosys.model.Bewertungskriterium bewertungskriterium) {
        return _bewertungskriterium.compareTo(bewertungskriterium);
    }

    @Override
    public int hashCode() {
        return _bewertungskriterium.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<de.hska.wi.awp.datasource.infosys.model.Bewertungskriterium> toCacheModel() {
        return _bewertungskriterium.toCacheModel();
    }

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Bewertungskriterium toEscapedModel() {
        return new BewertungskriteriumWrapper(_bewertungskriterium.toEscapedModel());
    }

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Bewertungskriterium toUnescapedModel() {
        return new BewertungskriteriumWrapper(_bewertungskriterium.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _bewertungskriterium.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _bewertungskriterium.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _bewertungskriterium.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof BewertungskriteriumWrapper)) {
            return false;
        }

        BewertungskriteriumWrapper bewertungskriteriumWrapper = (BewertungskriteriumWrapper) obj;

        if (Validator.equals(_bewertungskriterium,
                    bewertungskriteriumWrapper._bewertungskriterium)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Bewertungskriterium getWrappedBewertungskriterium() {
        return _bewertungskriterium;
    }

    @Override
    public Bewertungskriterium getWrappedModel() {
        return _bewertungskriterium;
    }

    @Override
    public void resetOriginalValues() {
        _bewertungskriterium.resetOriginalValues();
    }
}
