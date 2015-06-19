package de.hska.wi.awp.datasource.infosys.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Statusbericht_detail_punkt service. Represents a row in the &quot;datasourceInfosys_Statusbericht_detail_punkt&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_detail_punktModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_detail_punktImpl}.
 * </p>
 *
 * @author Daniel Storch
 * @see Statusbericht_detail_punkt
 * @see de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_detail_punktImpl
 * @see de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_detail_punktModelImpl
 * @generated
 */
public interface Statusbericht_detail_punktModel extends BaseModel<Statusbericht_detail_punkt> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a statusbericht_detail_punkt model instance should use the {@link Statusbericht_detail_punkt} interface instead.
     */

    /**
     * Returns the primary key of this statusbericht_detail_punkt.
     *
     * @return the primary key of this statusbericht_detail_punkt
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this statusbericht_detail_punkt.
     *
     * @param primaryKey the primary key of this statusbericht_detail_punkt
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the ID of this statusbericht_detail_punkt.
     *
     * @return the ID of this statusbericht_detail_punkt
     */
    public long getId();

    /**
     * Sets the ID of this statusbericht_detail_punkt.
     *
     * @param id the ID of this statusbericht_detail_punkt
     */
    public void setId(long id);

    /**
     * Returns the name of this statusbericht_detail_punkt.
     *
     * @return the name of this statusbericht_detail_punkt
     */
    @AutoEscape
    public String getName();

    /**
     * Sets the name of this statusbericht_detail_punkt.
     *
     * @param name the name of this statusbericht_detail_punkt
     */
    public void setName(String name);

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
        de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail_punkt statusbericht_detail_punkt);

    @Override
    public int hashCode();

    @Override
    public CacheModel<de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail_punkt> toCacheModel();

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail_punkt toEscapedModel();

    @Override
    public de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail_punkt toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}