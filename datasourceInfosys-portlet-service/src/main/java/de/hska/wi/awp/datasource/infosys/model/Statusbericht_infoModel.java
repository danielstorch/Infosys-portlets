package de.hska.wi.awp.datasource.infosys.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Statusbericht_info service. Represents a row in the &quot;datasourceInfosys_Statusbericht_info&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_infoModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_infoImpl}.
 * </p>
 *
 * @author Daniel Storch
 * @see Statusbericht_info
 * @see de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_infoImpl
 * @see de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_infoModelImpl
 * @generated
 */
public interface Statusbericht_infoModel extends BaseModel<Statusbericht_info> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a statusbericht_info model instance should use the {@link Statusbericht_info} interface instead.
     */

    /**
     * Returns the primary key of this statusbericht_info.
     *
     * @return the primary key of this statusbericht_info
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this statusbericht_info.
     *
     * @param primaryKey the primary key of this statusbericht_info
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the ID of this statusbericht_info.
     *
     * @return the ID of this statusbericht_info
     */
    public long getId();

    /**
     * Sets the ID of this statusbericht_info.
     *
     * @param id the ID of this statusbericht_info
     */
    public void setId(long id);

    /**
     * Returns the bemerkung of this statusbericht_info.
     *
     * @return the bemerkung of this statusbericht_info
     */
    @AutoEscape
    public String getBemerkung();

    /**
     * Sets the bemerkung of this statusbericht_info.
     *
     * @param bemerkung the bemerkung of this statusbericht_info
     */
    public void setBemerkung(String bemerkung);

    /**
     * Returns the status of this statusbericht_info.
     *
     * @return the status of this statusbericht_info
     */
    public int getStatus();

    /**
     * Sets the status of this statusbericht_info.
     *
     * @param status the status of this statusbericht_info
     */
    public void setStatus(int status);

    /**
     * Returns the statusbericht_id of this statusbericht_info.
     *
     * @return the statusbericht_id of this statusbericht_info
     */
    public long getStatusbericht_id();

    /**
     * Sets the statusbericht_id of this statusbericht_info.
     *
     * @param statusbericht_id the statusbericht_id of this statusbericht_info
     */
    public void setStatusbericht_id(long statusbericht_id);

    /**
     * Returns the statusbericht_info_punkt_id of this statusbericht_info.
     *
     * @return the statusbericht_info_punkt_id of this statusbericht_info
     */
    public long getStatusbericht_info_punkt_id();

    /**
     * Sets the statusbericht_info_punkt_id of this statusbericht_info.
     *
     * @param statusbericht_info_punkt_id the statusbericht_info_punkt_id of this statusbericht_info
     */
    public void setStatusbericht_info_punkt_id(long statusbericht_info_punkt_id);

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
        de.hska.wi.awp.datasource.infosys.model.Statusbericht_info statusbericht_info);

    @Override
    public int hashCode();

    @Override
    public CacheModel<de.hska.wi.awp.datasource.infosys.model.Statusbericht_info> toCacheModel();

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_info toEscapedModel();

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_info toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}