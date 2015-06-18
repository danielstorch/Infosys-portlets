package de.hska.wi.awp.datasource.infosys.model;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Teilnote_feedback service. Represents a row in the &quot;datasourceInfosys_Teilnote_feedback&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link de.hska.wi.awp.datasource.infosys.model.impl.Teilnote_feedbackModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link de.hska.wi.awp.datasource.infosys.model.impl.Teilnote_feedbackImpl}.
 * </p>
 *
 * @author Daniel Storch
 * @see Teilnote_feedback
 * @see de.hska.wi.awp.datasource.infosys.model.impl.Teilnote_feedbackImpl
 * @see de.hska.wi.awp.datasource.infosys.model.impl.Teilnote_feedbackModelImpl
 * @generated
 */
public interface Teilnote_feedbackModel extends BaseModel<Teilnote_feedback> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a teilnote_feedback model instance should use the {@link Teilnote_feedback} interface instead.
     */

    /**
     * Returns the primary key of this teilnote_feedback.
     *
     * @return the primary key of this teilnote_feedback
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this teilnote_feedback.
     *
     * @param primaryKey the primary key of this teilnote_feedback
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the ID of this teilnote_feedback.
     *
     * @return the ID of this teilnote_feedback
     */
    public long getId();

    /**
     * Sets the ID of this teilnote_feedback.
     *
     * @param id the ID of this teilnote_feedback
     */
    public void setId(long id);

    /**
     * Returns the feedback_id of this teilnote_feedback.
     *
     * @return the feedback_id of this teilnote_feedback
     */
    public long getFeedback_id();

    /**
     * Sets the feedback_id of this teilnote_feedback.
     *
     * @param feedback_id the feedback_id of this teilnote_feedback
     */
    public void setFeedback_id(long feedback_id);

    /**
     * Returns the note of this teilnote_feedback.
     *
     * @return the note of this teilnote_feedback
     */
    public int getNote();

    /**
     * Sets the note of this teilnote_feedback.
     *
     * @param note the note of this teilnote_feedback
     */
    public void setNote(int note);

    /**
     * Returns the bewertungskriterium_id of this teilnote_feedback.
     *
     * @return the bewertungskriterium_id of this teilnote_feedback
     */
    public long getBewertungskriterium_id();

    /**
     * Sets the bewertungskriterium_id of this teilnote_feedback.
     *
     * @param bewertungskriterium_id the bewertungskriterium_id of this teilnote_feedback
     */
    public void setBewertungskriterium_id(long bewertungskriterium_id);

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
        de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback teilnote_feedback);

    @Override
    public int hashCode();

    @Override
    public CacheModel<de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback> toCacheModel();

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback toEscapedModel();

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}