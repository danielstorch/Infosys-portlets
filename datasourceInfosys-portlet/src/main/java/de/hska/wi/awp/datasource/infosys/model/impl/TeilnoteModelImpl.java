package de.hska.wi.awp.datasource.infosys.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import de.hska.wi.awp.datasource.infosys.model.Teilnote;
import de.hska.wi.awp.datasource.infosys.model.TeilnoteModel;
import de.hska.wi.awp.datasource.infosys.model.TeilnoteSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Teilnote service. Represents a row in the &quot;datasourceInfosys_Teilnote&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link de.hska.wi.awp.datasource.infosys.model.TeilnoteModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TeilnoteImpl}.
 * </p>
 *
 * @author Daniel Storch
 * @see TeilnoteImpl
 * @see de.hska.wi.awp.datasource.infosys.model.Teilnote
 * @see de.hska.wi.awp.datasource.infosys.model.TeilnoteModel
 * @generated
 */
@JSON(strict = true)
public class TeilnoteModelImpl extends BaseModelImpl<Teilnote>
    implements TeilnoteModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a teilnote model instance should use the {@link de.hska.wi.awp.datasource.infosys.model.Teilnote} interface instead.
     */
    public static final String TABLE_NAME = "datasourceInfosys_Teilnote";
    public static final Object[][] TABLE_COLUMNS = {
            { "id_", Types.BIGINT },
            { "feedback_id", Types.BIGINT },
            { "note", Types.INTEGER },
            { "kategorie", Types.BIGINT }
        };
    public static final String TABLE_SQL_CREATE = "create table datasourceInfosys_Teilnote (id_ LONG not null primary key,feedback_id LONG,note INTEGER,kategorie LONG)";
    public static final String TABLE_SQL_DROP = "drop table datasourceInfosys_Teilnote";
    public static final String ORDER_BY_JPQL = " ORDER BY teilnote.id ASC";
    public static final String ORDER_BY_SQL = " ORDER BY datasourceInfosys_Teilnote.id_ ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.de.hska.wi.awp.datasource.infosys.model.Teilnote"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.de.hska.wi.awp.datasource.infosys.model.Teilnote"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.de.hska.wi.awp.datasource.infosys.model.Teilnote"),
            true);
    public static long FEEDBACK_ID_COLUMN_BITMASK = 1L;
    public static long ID_COLUMN_BITMASK = 2L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.de.hska.wi.awp.datasource.infosys.model.Teilnote"));
    private static ClassLoader _classLoader = Teilnote.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            Teilnote.class
        };
    private long _id;
    private long _feedback_id;
    private long _originalFeedback_id;
    private boolean _setOriginalFeedback_id;
    private int _note;
    private long _kategorie;
    private long _columnBitmask;
    private Teilnote _escapedModel;

    public TeilnoteModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static Teilnote toModel(TeilnoteSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        Teilnote model = new TeilnoteImpl();

        model.setId(soapModel.getId());
        model.setFeedback_id(soapModel.getFeedback_id());
        model.setNote(soapModel.getNote());
        model.setKategorie(soapModel.getKategorie());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<Teilnote> toModels(TeilnoteSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<Teilnote> models = new ArrayList<Teilnote>(soapModels.length);

        for (TeilnoteSoap soapModel : soapModels) {
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
        return Teilnote.class;
    }

    @Override
    public String getModelClassName() {
        return Teilnote.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("feedback_id", getFeedback_id());
        attributes.put("note", getNote());
        attributes.put("kategorie", getKategorie());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        Long feedback_id = (Long) attributes.get("feedback_id");

        if (feedback_id != null) {
            setFeedback_id(feedback_id);
        }

        Integer note = (Integer) attributes.get("note");

        if (note != null) {
            setNote(note);
        }

        Long kategorie = (Long) attributes.get("kategorie");

        if (kategorie != null) {
            setKategorie(kategorie);
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
    public long getFeedback_id() {
        return _feedback_id;
    }

    @Override
    public void setFeedback_id(long feedback_id) {
        _columnBitmask |= FEEDBACK_ID_COLUMN_BITMASK;

        if (!_setOriginalFeedback_id) {
            _setOriginalFeedback_id = true;

            _originalFeedback_id = _feedback_id;
        }

        _feedback_id = feedback_id;
    }

    public long getOriginalFeedback_id() {
        return _originalFeedback_id;
    }

    @JSON
    @Override
    public int getNote() {
        return _note;
    }

    @Override
    public void setNote(int note) {
        _note = note;
    }

    @JSON
    @Override
    public long getKategorie() {
        return _kategorie;
    }

    @Override
    public void setKategorie(long kategorie) {
        _kategorie = kategorie;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            Teilnote.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public Teilnote toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (Teilnote) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        TeilnoteImpl teilnoteImpl = new TeilnoteImpl();

        teilnoteImpl.setId(getId());
        teilnoteImpl.setFeedback_id(getFeedback_id());
        teilnoteImpl.setNote(getNote());
        teilnoteImpl.setKategorie(getKategorie());

        teilnoteImpl.resetOriginalValues();

        return teilnoteImpl;
    }

    @Override
    public int compareTo(Teilnote teilnote) {
        long primaryKey = teilnote.getPrimaryKey();

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

        if (!(obj instanceof Teilnote)) {
            return false;
        }

        Teilnote teilnote = (Teilnote) obj;

        long primaryKey = teilnote.getPrimaryKey();

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
        TeilnoteModelImpl teilnoteModelImpl = this;

        teilnoteModelImpl._originalFeedback_id = teilnoteModelImpl._feedback_id;

        teilnoteModelImpl._setOriginalFeedback_id = false;

        teilnoteModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<Teilnote> toCacheModel() {
        TeilnoteCacheModel teilnoteCacheModel = new TeilnoteCacheModel();

        teilnoteCacheModel.id = getId();

        teilnoteCacheModel.feedback_id = getFeedback_id();

        teilnoteCacheModel.note = getNote();

        teilnoteCacheModel.kategorie = getKategorie();

        return teilnoteCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", feedback_id=");
        sb.append(getFeedback_id());
        sb.append(", note=");
        sb.append(getNote());
        sb.append(", kategorie=");
        sb.append(getKategorie());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("de.hska.wi.awp.datasource.infosys.model.Teilnote");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>feedback_id</column-name><column-value><![CDATA[");
        sb.append(getFeedback_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>note</column-name><column-value><![CDATA[");
        sb.append(getNote());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>kategorie</column-name><column-value><![CDATA[");
        sb.append(getKategorie());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
