package de.hska.wi.awp.datasource.infosys.model;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Teilnote service. Represents a row in the &quot;datasourceInfosys_Teilnote&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link de.hska.wi.awp.datasource.infosys.model.impl.TeilnoteModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link de.hska.wi.awp.datasource.infosys.model.impl.TeilnoteImpl}.
 * </p>
 *
 * @author Daniel Storch
 * @see Teilnote
 * @see de.hska.wi.awp.datasource.infosys.model.impl.TeilnoteImpl
 * @see de.hska.wi.awp.datasource.infosys.model.impl.TeilnoteModelImpl
 * @generated
 */
public interface TeilnoteModel extends BaseModel<Teilnote> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a teilnote model instance should use the {@link Teilnote} interface instead.
     */

    /**
     * Returns the primary key of this teilnote.
     *
     * @return the primary key of this teilnote
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this teilnote.
     *
     * @param primaryKey the primary key of this teilnote
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the ID of this teilnote.
     *
     * @return the ID of this teilnote
     */
    public long getId();

    /**
     * Sets the ID of this teilnote.
     *
     * @param id the ID of this teilnote
     */
    public void setId(long id);

    /**
     * Returns the feedback_id of this teilnote.
     *
     * @return the feedback_id of this teilnote
     */
    public long getFeedback_id();

    /**
     * Sets the feedback_id of this teilnote.
     *
     * @param feedback_id the feedback_id of this teilnote
     */
    public void setFeedback_id(long feedback_id);

    /**
     * Returns the note of this teilnote.
     *
     * @return the note of this teilnote
     */
    public int getNote();

    /**
     * Sets the note of this teilnote.
     *
     * @param note the note of this teilnote
     */
    public void setNote(int note);

    /**
     * Returns the kategorie of this teilnote.
     *
     * @return the kategorie of this teilnote
     */
    public long getKategorie();

    /**
     * Sets the kategorie of this teilnote.
     *
     * @param kategorie the kategorie of this teilnote
     */
    public void setKategorie(long kategorie);

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
        de.hska.wi.awp.datasource.infosys.model.Teilnote teilnote);

    @Override
    public int hashCode();

    @Override
    public CacheModel<de.hska.wi.awp.datasource.infosys.model.Teilnote> toCacheModel();

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Teilnote toEscapedModel();

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Teilnote toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
