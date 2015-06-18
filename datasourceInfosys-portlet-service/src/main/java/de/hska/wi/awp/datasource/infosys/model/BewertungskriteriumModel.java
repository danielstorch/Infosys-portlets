package de.hska.wi.awp.datasource.infosys.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Bewertungskriterium service. Represents a row in the &quot;datasourceInfosys_Bewertungskriterium&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link de.hska.wi.awp.datasource.infosys.model.impl.BewertungskriteriumModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link de.hska.wi.awp.datasource.infosys.model.impl.BewertungskriteriumImpl}.
 * </p>
 *
 * @author Daniel Storch
 * @see Bewertungskriterium
 * @see de.hska.wi.awp.datasource.infosys.model.impl.BewertungskriteriumImpl
 * @see de.hska.wi.awp.datasource.infosys.model.impl.BewertungskriteriumModelImpl
 * @generated
 */
public interface BewertungskriteriumModel extends BaseModel<Bewertungskriterium> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a bewertungskriterium model instance should use the {@link Bewertungskriterium} interface instead.
     */

    /**
     * Returns the primary key of this bewertungskriterium.
     *
     * @return the primary key of this bewertungskriterium
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this bewertungskriterium.
     *
     * @param primaryKey the primary key of this bewertungskriterium
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the ID of this bewertungskriterium.
     *
     * @return the ID of this bewertungskriterium
     */
    public long getId();

    /**
     * Sets the ID of this bewertungskriterium.
     *
     * @param id the ID of this bewertungskriterium
     */
    public void setId(long id);

    /**
     * Returns the name of this bewertungskriterium.
     *
     * @return the name of this bewertungskriterium
     */
    @AutoEscape
    public String getName();

    /**
     * Sets the name of this bewertungskriterium.
     *
     * @param name the name of this bewertungskriterium
     */
    public void setName(String name);

    /**
     * Returns the beschreibung of this bewertungskriterium.
     *
     * @return the beschreibung of this bewertungskriterium
     */
    @AutoEscape
    public String getBeschreibung();

    /**
     * Sets the beschreibung of this bewertungskriterium.
     *
     * @param beschreibung the beschreibung of this bewertungskriterium
     */
    public void setBeschreibung(String beschreibung);

    /**
     * Returns the gewichtung of this bewertungskriterium.
     *
     * @return the gewichtung of this bewertungskriterium
     */
    public int getGewichtung();

    /**
     * Sets the gewichtung of this bewertungskriterium.
     *
     * @param gewichtung the gewichtung of this bewertungskriterium
     */
    public void setGewichtung(int gewichtung);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(
        de.hska.wi.awp.datasource.infosys.model.Bewertungskriterium bewertungskriterium);

    @Override
    public int hashCode();

    @Override
    public CacheModel<de.hska.wi.awp.datasource.infosys.model.Bewertungskriterium> toCacheModel();

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Bewertungskriterium toEscapedModel();

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Bewertungskriterium toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}