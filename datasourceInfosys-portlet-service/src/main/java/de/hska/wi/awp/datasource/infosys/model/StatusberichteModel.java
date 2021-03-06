package de.hska.wi.awp.datasource.infosys.model;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Statusberichte service. Represents a row in the &quot;datasourceInfosys_Statusberichte&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link de.hska.wi.awp.datasource.infosys.model.impl.StatusberichteModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link de.hska.wi.awp.datasource.infosys.model.impl.StatusberichteImpl}.
 * </p>
 *
 * @author Daniel Storch
 * @see Statusberichte
 * @see de.hska.wi.awp.datasource.infosys.model.impl.StatusberichteImpl
 * @see de.hska.wi.awp.datasource.infosys.model.impl.StatusberichteModelImpl
 * @generated
 */
public interface StatusberichteModel extends BaseModel<Statusberichte> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a statusberichte model instance should use the {@link Statusberichte} interface instead.
     */

    /**
     * Returns the primary key of this statusberichte.
     *
     * @return the primary key of this statusberichte
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this statusberichte.
     *
     * @param primaryKey the primary key of this statusberichte
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the ID of this statusberichte.
     *
     * @return the ID of this statusberichte
     */
    public long getId();

    /**
     * Sets the ID of this statusberichte.
     *
     * @param id the ID of this statusberichte
     */
    public void setId(long id);

    /**
     * Returns the project_id of this statusberichte.
     *
     * @return the project_id of this statusberichte
     */
    public long getProject_id();

    /**
     * Sets the project_id of this statusberichte.
     *
     * @param project_id the project_id of this statusberichte
     */
    public void setProject_id(long project_id);

    /**
     * Returns the datum of this statusberichte.
     *
     * @return the datum of this statusberichte
     */
    public Date getDatum();

    /**
     * Sets the datum of this statusberichte.
     *
     * @param datum the datum of this statusberichte
     */
    public void setDatum(Date datum);

    /**
     * Returns the kalenderwoche of this statusberichte.
     *
     * @return the kalenderwoche of this statusberichte
     */
    public int getKalenderwoche();

    /**
     * Sets the kalenderwoche of this statusberichte.
     *
     * @param kalenderwoche the kalenderwoche of this statusberichte
     */
    public void setKalenderwoche(int kalenderwoche);

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
        de.hska.wi.awp.datasource.infosys.model.Statusberichte statusberichte);

    @Override
    public int hashCode();

    @Override
    public CacheModel<de.hska.wi.awp.datasource.infosys.model.Statusberichte> toCacheModel();

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusberichte toEscapedModel();

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusberichte toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
