package de.hska.wi.awp.datasource.infosys.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import de.hska.wi.awp.datasource.infosys.model.Statusueberblick;
import de.hska.wi.awp.datasource.infosys.model.StatusueberblickModel;
import de.hska.wi.awp.datasource.infosys.model.StatusueberblickSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Statusueberblick service. Represents a row in the &quot;datasourceInfosys_Statusueberblick&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link de.hska.wi.awp.datasource.infosys.model.StatusueberblickModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link StatusueberblickImpl}.
 * </p>
 *
 * @author Daniel Storch
 * @see StatusueberblickImpl
 * @see de.hska.wi.awp.datasource.infosys.model.Statusueberblick
 * @see de.hska.wi.awp.datasource.infosys.model.StatusueberblickModel
 * @generated
 */
@JSON(strict = true)
public class StatusueberblickModelImpl extends BaseModelImpl<Statusueberblick>
    implements StatusueberblickModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a statusueberblick model instance should use the {@link de.hska.wi.awp.datasource.infosys.model.Statusueberblick} interface instead.
     */
    public static final String TABLE_NAME = "datasourceInfosys_Statusueberblick";
    public static final Object[][] TABLE_COLUMNS = {
            { "id_", Types.BIGINT },
            { "statusbericht_id", Types.BIGINT },
            { "qualitaet_status", Types.VARCHAR },
            { "qualitaet_text", Types.VARCHAR },
            { "kosten_text", Types.VARCHAR },
            { "kosten_status", Types.VARCHAR },
            { "aufwand_status", Types.VARCHAR },
            { "aufwand_text", Types.VARCHAR },
            { "termine_status", Types.VARCHAR },
            { "termine_text", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table datasourceInfosys_Statusueberblick (id_ LONG not null primary key,statusbericht_id LONG,qualitaet_status VARCHAR(75) null,qualitaet_text VARCHAR(75) null,kosten_text VARCHAR(75) null,kosten_status VARCHAR(75) null,aufwand_status VARCHAR(75) null,aufwand_text VARCHAR(75) null,termine_status VARCHAR(75) null,termine_text VARCHAR(75) null)";
    public static final String TABLE_SQL_DROP = "drop table datasourceInfosys_Statusueberblick";
    public static final String ORDER_BY_JPQL = " ORDER BY statusueberblick.id ASC";
    public static final String ORDER_BY_SQL = " ORDER BY datasourceInfosys_Statusueberblick.id_ ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.de.hska.wi.awp.datasource.infosys.model.Statusueberblick"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.de.hska.wi.awp.datasource.infosys.model.Statusueberblick"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.de.hska.wi.awp.datasource.infosys.model.Statusueberblick"));
    private static ClassLoader _classLoader = Statusueberblick.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            Statusueberblick.class
        };
    private long _id;
    private long _statusbericht_id;
    private String _qualitaet_status;
    private String _qualitaet_text;
    private String _kosten_text;
    private String _kosten_status;
    private String _aufwand_status;
    private String _aufwand_text;
    private String _termine_status;
    private String _termine_text;
    private Statusueberblick _escapedModel;

    public StatusueberblickModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static Statusueberblick toModel(StatusueberblickSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        Statusueberblick model = new StatusueberblickImpl();

        model.setId(soapModel.getId());
        model.setStatusbericht_id(soapModel.getStatusbericht_id());
        model.setQualitaet_status(soapModel.getQualitaet_status());
        model.setQualitaet_text(soapModel.getQualitaet_text());
        model.setKosten_text(soapModel.getKosten_text());
        model.setKosten_status(soapModel.getKosten_status());
        model.setAufwand_status(soapModel.getAufwand_status());
        model.setAufwand_text(soapModel.getAufwand_text());
        model.setTermine_status(soapModel.getTermine_status());
        model.setTermine_text(soapModel.getTermine_text());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<Statusueberblick> toModels(
        StatusueberblickSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<Statusueberblick> models = new ArrayList<Statusueberblick>(soapModels.length);

        for (StatusueberblickSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public long getPrimaryKey() {
        return _id;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return Statusueberblick.class;
    }

    @Override
    public String getModelClassName() {
        return Statusueberblick.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("statusbericht_id", getStatusbericht_id());
        attributes.put("qualitaet_status", getQualitaet_status());
        attributes.put("qualitaet_text", getQualitaet_text());
        attributes.put("kosten_text", getKosten_text());
        attributes.put("kosten_status", getKosten_status());
        attributes.put("aufwand_status", getAufwand_status());
        attributes.put("aufwand_text", getAufwand_text());
        attributes.put("termine_status", getTermine_status());
        attributes.put("termine_text", getTermine_text());

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

        String qualitaet_status = (String) attributes.get("qualitaet_status");

        if (qualitaet_status != null) {
            setQualitaet_status(qualitaet_status);
        }

        String qualitaet_text = (String) attributes.get("qualitaet_text");

        if (qualitaet_text != null) {
            setQualitaet_text(qualitaet_text);
        }

        String kosten_text = (String) attributes.get("kosten_text");

        if (kosten_text != null) {
            setKosten_text(kosten_text);
        }

        String kosten_status = (String) attributes.get("kosten_status");

        if (kosten_status != null) {
            setKosten_status(kosten_status);
        }

        String aufwand_status = (String) attributes.get("aufwand_status");

        if (aufwand_status != null) {
            setAufwand_status(aufwand_status);
        }

        String aufwand_text = (String) attributes.get("aufwand_text");

        if (aufwand_text != null) {
            setAufwand_text(aufwand_text);
        }

        String termine_status = (String) attributes.get("termine_status");

        if (termine_status != null) {
            setTermine_status(termine_status);
        }

        String termine_text = (String) attributes.get("termine_text");

        if (termine_text != null) {
            setTermine_text(termine_text);
        }
    }

    @JSON
    @Override
    public long getId() {
        return _id;
    }

    @Override
    public void setId(long id) {
        _id = id;
    }

    @JSON
    @Override
    public long getStatusbericht_id() {
        return _statusbericht_id;
    }

    @Override
    public void setStatusbericht_id(long statusbericht_id) {
        _statusbericht_id = statusbericht_id;
    }

    @JSON
    @Override
    public String getQualitaet_status() {
        if (_qualitaet_status == null) {
            return StringPool.BLANK;
        } else {
            return _qualitaet_status;
        }
    }

    @Override
    public void setQualitaet_status(String qualitaet_status) {
        _qualitaet_status = qualitaet_status;
    }

    @JSON
    @Override
    public String getQualitaet_text() {
        if (_qualitaet_text == null) {
            return StringPool.BLANK;
        } else {
            return _qualitaet_text;
        }
    }

    @Override
    public void setQualitaet_text(String qualitaet_text) {
        _qualitaet_text = qualitaet_text;
    }

    @JSON
    @Override
    public String getKosten_text() {
        if (_kosten_text == null) {
            return StringPool.BLANK;
        } else {
            return _kosten_text;
        }
    }

    @Override
    public void setKosten_text(String kosten_text) {
        _kosten_text = kosten_text;
    }

    @JSON
    @Override
    public String getKosten_status() {
        if (_kosten_status == null) {
            return StringPool.BLANK;
        } else {
            return _kosten_status;
        }
    }

    @Override
    public void setKosten_status(String kosten_status) {
        _kosten_status = kosten_status;
    }

    @JSON
    @Override
    public String getAufwand_status() {
        if (_aufwand_status == null) {
            return StringPool.BLANK;
        } else {
            return _aufwand_status;
        }
    }

    @Override
    public void setAufwand_status(String aufwand_status) {
        _aufwand_status = aufwand_status;
    }

    @JSON
    @Override
    public String getAufwand_text() {
        if (_aufwand_text == null) {
            return StringPool.BLANK;
        } else {
            return _aufwand_text;
        }
    }

    @Override
    public void setAufwand_text(String aufwand_text) {
        _aufwand_text = aufwand_text;
    }

    @JSON
    @Override
    public String getTermine_status() {
        if (_termine_status == null) {
            return StringPool.BLANK;
        } else {
            return _termine_status;
        }
    }

    @Override
    public void setTermine_status(String termine_status) {
        _termine_status = termine_status;
    }

    @JSON
    @Override
    public String getTermine_text() {
        if (_termine_text == null) {
            return StringPool.BLANK;
        } else {
            return _termine_text;
        }
    }

    @Override
    public void setTermine_text(String termine_text) {
        _termine_text = termine_text;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            Statusueberblick.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public Statusueberblick toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (Statusueberblick) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        StatusueberblickImpl statusueberblickImpl = new StatusueberblickImpl();

        statusueberblickImpl.setId(getId());
        statusueberblickImpl.setStatusbericht_id(getStatusbericht_id());
        statusueberblickImpl.setQualitaet_status(getQualitaet_status());
        statusueberblickImpl.setQualitaet_text(getQualitaet_text());
        statusueberblickImpl.setKosten_text(getKosten_text());
        statusueberblickImpl.setKosten_status(getKosten_status());
        statusueberblickImpl.setAufwand_status(getAufwand_status());
        statusueberblickImpl.setAufwand_text(getAufwand_text());
        statusueberblickImpl.setTermine_status(getTermine_status());
        statusueberblickImpl.setTermine_text(getTermine_text());

        statusueberblickImpl.resetOriginalValues();

        return statusueberblickImpl;
    }

    @Override
    public int compareTo(Statusueberblick statusueberblick) {
        long primaryKey = statusueberblick.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Statusueberblick)) {
            return false;
        }

        Statusueberblick statusueberblick = (Statusueberblick) obj;

        long primaryKey = statusueberblick.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
    }

    @Override
    public CacheModel<Statusueberblick> toCacheModel() {
        StatusueberblickCacheModel statusueberblickCacheModel = new StatusueberblickCacheModel();

        statusueberblickCacheModel.id = getId();

        statusueberblickCacheModel.statusbericht_id = getStatusbericht_id();

        statusueberblickCacheModel.qualitaet_status = getQualitaet_status();

        String qualitaet_status = statusueberblickCacheModel.qualitaet_status;

        if ((qualitaet_status != null) && (qualitaet_status.length() == 0)) {
            statusueberblickCacheModel.qualitaet_status = null;
        }

        statusueberblickCacheModel.qualitaet_text = getQualitaet_text();

        String qualitaet_text = statusueberblickCacheModel.qualitaet_text;

        if ((qualitaet_text != null) && (qualitaet_text.length() == 0)) {
            statusueberblickCacheModel.qualitaet_text = null;
        }

        statusueberblickCacheModel.kosten_text = getKosten_text();

        String kosten_text = statusueberblickCacheModel.kosten_text;

        if ((kosten_text != null) && (kosten_text.length() == 0)) {
            statusueberblickCacheModel.kosten_text = null;
        }

        statusueberblickCacheModel.kosten_status = getKosten_status();

        String kosten_status = statusueberblickCacheModel.kosten_status;

        if ((kosten_status != null) && (kosten_status.length() == 0)) {
            statusueberblickCacheModel.kosten_status = null;
        }

        statusueberblickCacheModel.aufwand_status = getAufwand_status();

        String aufwand_status = statusueberblickCacheModel.aufwand_status;

        if ((aufwand_status != null) && (aufwand_status.length() == 0)) {
            statusueberblickCacheModel.aufwand_status = null;
        }

        statusueberblickCacheModel.aufwand_text = getAufwand_text();

        String aufwand_text = statusueberblickCacheModel.aufwand_text;

        if ((aufwand_text != null) && (aufwand_text.length() == 0)) {
            statusueberblickCacheModel.aufwand_text = null;
        }

        statusueberblickCacheModel.termine_status = getTermine_status();

        String termine_status = statusueberblickCacheModel.termine_status;

        if ((termine_status != null) && (termine_status.length() == 0)) {
            statusueberblickCacheModel.termine_status = null;
        }

        statusueberblickCacheModel.termine_text = getTermine_text();

        String termine_text = statusueberblickCacheModel.termine_text;

        if ((termine_text != null) && (termine_text.length() == 0)) {
            statusueberblickCacheModel.termine_text = null;
        }

        return statusueberblickCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(21);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", statusbericht_id=");
        sb.append(getStatusbericht_id());
        sb.append(", qualitaet_status=");
        sb.append(getQualitaet_status());
        sb.append(", qualitaet_text=");
        sb.append(getQualitaet_text());
        sb.append(", kosten_text=");
        sb.append(getKosten_text());
        sb.append(", kosten_status=");
        sb.append(getKosten_status());
        sb.append(", aufwand_status=");
        sb.append(getAufwand_status());
        sb.append(", aufwand_text=");
        sb.append(getAufwand_text());
        sb.append(", termine_status=");
        sb.append(getTermine_status());
        sb.append(", termine_text=");
        sb.append(getTermine_text());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(34);

        sb.append("<model><model-name>");
        sb.append("de.hska.wi.awp.datasource.infosys.model.Statusueberblick");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>statusbericht_id</column-name><column-value><![CDATA[");
        sb.append(getStatusbericht_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>qualitaet_status</column-name><column-value><![CDATA[");
        sb.append(getQualitaet_status());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>qualitaet_text</column-name><column-value><![CDATA[");
        sb.append(getQualitaet_text());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>kosten_text</column-name><column-value><![CDATA[");
        sb.append(getKosten_text());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>kosten_status</column-name><column-value><![CDATA[");
        sb.append(getKosten_status());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>aufwand_status</column-name><column-value><![CDATA[");
        sb.append(getAufwand_status());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>aufwand_text</column-name><column-value><![CDATA[");
        sb.append(getAufwand_text());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>termine_status</column-name><column-value><![CDATA[");
        sb.append(getTermine_status());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>termine_text</column-name><column-value><![CDATA[");
        sb.append(getTermine_text());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
