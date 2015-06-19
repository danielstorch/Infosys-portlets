package de.hska.wi.awp.datasource.infosys.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Statusbericht_detail service. Represents a row in the &quot;datasourceInfosys_Statusbericht_detail&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_detailModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_detailImpl}.
 * </p>
 *
 * @author Daniel Storch
 * @see Statusbericht_detail
 * @see de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_detailImpl
 * @see de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_detailModelImpl
 * @generated
 */
public interface Statusbericht_detailModel extends BaseModel<Statusbericht_detail> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a statusbericht_detail model instance should use the {@link Statusbericht_detail} interface instead.
     */

    /**
     * Returns the primary key of this statusbericht_detail.
     *
     * @return the primary key of this statusbericht_detail
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this statusbericht_detail.
     *
     * @param primaryKey the primary key of this statusbericht_detail
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the ID of this statusbericht_detail.
     *
     * @return the ID of this statusbericht_detail
     */
    public long getId();

    /**
     * Sets the ID of this statusbericht_detail.
     *
     * @param id the ID of this statusbericht_detail
     */
    public void setId(long id);

    /**
     * Returns the text of this statusbericht_detail.
     *
     * @return the text of this statusbericht_detail
     */
    @AutoEscape
    public String getText();

    /**
     * Sets the text of this statusbericht_detail.
     *
     * @param text the text of this statusbericht_detail
     */
    public void setText(String text);

    /**
     * Returns the statusbericht_id of this statusbericht_detail.
     *
     * @return the statusbericht_id of this statusbericht_detail
     */
    public long getStatusbericht_id();

    /**
     * Sets the statusbericht_id of this statusbericht_detail.
     *
     * @param statusbericht_id the statusbericht_id of this statusbericht_detail
     */
    public void setStatusbericht_id(long statusbericht_id);

    /**
     * Returns the statusbericht_detail_punkt_id of this statusbericht_detail.
     *
     * @return the statusbericht_detail_punkt_id of this statusbericht_detail
     */
    public long getStatusbericht_detail_punkt_id();

    /**
     * Sets the statusbericht_detail_punkt_id of this statusbericht_detail.
     *
     * @param statusbericht_detail_punkt_id the statusbericht_detail_punkt_id of this statusbericht_detail
     */
    public void setStatusbericht_detail_punkt_id(
        long statusbericht_detail_punkt_id);

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
        de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail statusbericht_detail);

    @Override
    public int hashCode();

    @Override
    public CacheModel<de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail> toCacheModel();

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail toEscapedModel();

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
