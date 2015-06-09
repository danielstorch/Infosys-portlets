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

import de.hska.wi.awp.datasource.infosys.model.Feedback;
import de.hska.wi.awp.datasource.infosys.model.FeedbackModel;
import de.hska.wi.awp.datasource.infosys.model.FeedbackSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Feedback service. Represents a row in the &quot;datasourceInfosys_Feedback&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link de.hska.wi.awp.datasource.infosys.model.FeedbackModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FeedbackImpl}.
 * </p>
 *
 * @author Daniel Storch
 * @see FeedbackImpl
 * @see de.hska.wi.awp.datasource.infosys.model.Feedback
 * @see de.hska.wi.awp.datasource.infosys.model.FeedbackModel
 * @generated
 */
@JSON(strict = true)
public class FeedbackModelImpl extends BaseModelImpl<Feedback>
    implements FeedbackModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a feedback model instance should use the {@link de.hska.wi.awp.datasource.infosys.model.Feedback} interface instead.
     */
    public static final String TABLE_NAME = "datasourceInfosys_Feedback";
    public static final Object[][] TABLE_COLUMNS = {
            { "id_", Types.BIGINT },
            { "student_id", Types.BIGINT },
            { "feedback_runden_nr", Types.INTEGER },
            { "eigenbewertung", Types.VARCHAR },
            { "kommentar_kompetenzen", Types.VARCHAR },
            { "kommentar_beitrag", Types.VARCHAR },
            { "beitrag", Types.INTEGER }
        };
    public static final String TABLE_SQL_CREATE = "create table datasourceInfosys_Feedback (id_ LONG not null primary key,student_id LONG,feedback_runden_nr INTEGER,eigenbewertung VARCHAR(75) null,kommentar_kompetenzen VARCHAR(75) null,kommentar_beitrag VARCHAR(75) null,beitrag INTEGER)";
    public static final String TABLE_SQL_DROP = "drop table datasourceInfosys_Feedback";
    public static final String ORDER_BY_JPQL = " ORDER BY feedback.id ASC";
    public static final String ORDER_BY_SQL = " ORDER BY datasourceInfosys_Feedback.id_ ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.de.hska.wi.awp.datasource.infosys.model.Feedback"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.de.hska.wi.awp.datasource.infosys.model.Feedback"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.de.hska.wi.awp.datasource.infosys.model.Feedback"));
    private static ClassLoader _classLoader = Feedback.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            Feedback.class
        };
    private long _id;
    private long _student_id;
    private int _feedback_runden_nr;
    private String _eigenbewertung;
    private String _kommentar_kompetenzen;
    private String _kommentar_beitrag;
    private int _beitrag;
    private Feedback _escapedModel;

    public FeedbackModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static Feedback toModel(FeedbackSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        Feedback model = new FeedbackImpl();

        model.setId(soapModel.getId());
        model.setStudent_id(soapModel.getStudent_id());
        model.setFeedback_runden_nr(soapModel.getFeedback_runden_nr());
        model.setEigenbewertung(soapModel.getEigenbewertung());
        model.setKommentar_kompetenzen(soapModel.getKommentar_kompetenzen());
        model.setKommentar_beitrag(soapModel.getKommentar_beitrag());
        model.setBeitrag(soapModel.getBeitrag());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<Feedback> toModels(FeedbackSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<Feedback> models = new ArrayList<Feedback>(soapModels.length);

        for (FeedbackSoap soapModel : soapModels) {
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
        return Feedback.class;
    }

    @Override
    public String getModelClassName() {
        return Feedback.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("student_id", getStudent_id());
        attributes.put("feedback_runden_nr", getFeedback_runden_nr());
        attributes.put("eigenbewertung", getEigenbewertung());
        attributes.put("kommentar_kompetenzen", getKommentar_kompetenzen());
        attributes.put("kommentar_beitrag", getKommentar_beitrag());
        attributes.put("beitrag", getBeitrag());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        Long student_id = (Long) attributes.get("student_id");

        if (student_id != null) {
            setStudent_id(student_id);
        }

        Integer feedback_runden_nr = (Integer) attributes.get(
                "feedback_runden_nr");

        if (feedback_runden_nr != null) {
            setFeedback_runden_nr(feedback_runden_nr);
        }

        String eigenbewertung = (String) attributes.get("eigenbewertung");

        if (eigenbewertung != null) {
            setEigenbewertung(eigenbewertung);
        }

        String kommentar_kompetenzen = (String) attributes.get(
                "kommentar_kompetenzen");

        if (kommentar_kompetenzen != null) {
            setKommentar_kompetenzen(kommentar_kompetenzen);
        }

        String kommentar_beitrag = (String) attributes.get("kommentar_beitrag");

        if (kommentar_beitrag != null) {
            setKommentar_beitrag(kommentar_beitrag);
        }

        Integer beitrag = (Integer) attributes.get("beitrag");

        if (beitrag != null) {
            setBeitrag(beitrag);
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
    public long getStudent_id() {
        return _student_id;
    }

    @Override
    public void setStudent_id(long student_id) {
        _student_id = student_id;
    }

    @JSON
    @Override
    public int getFeedback_runden_nr() {
        return _feedback_runden_nr;
    }

    @Override
    public void setFeedback_runden_nr(int feedback_runden_nr) {
        _feedback_runden_nr = feedback_runden_nr;
    }

    @JSON
    @Override
    public String getEigenbewertung() {
        if (_eigenbewertung == null) {
            return StringPool.BLANK;
        } else {
            return _eigenbewertung;
        }
    }

    @Override
    public void setEigenbewertung(String eigenbewertung) {
        _eigenbewertung = eigenbewertung;
    }

    @JSON
    @Override
    public String getKommentar_kompetenzen() {
        if (_kommentar_kompetenzen == null) {
            return StringPool.BLANK;
        } else {
            return _kommentar_kompetenzen;
        }
    }

    @Override
    public void setKommentar_kompetenzen(String kommentar_kompetenzen) {
        _kommentar_kompetenzen = kommentar_kompetenzen;
    }

    @JSON
    @Override
    public String getKommentar_beitrag() {
        if (_kommentar_beitrag == null) {
            return StringPool.BLANK;
        } else {
            return _kommentar_beitrag;
        }
    }

    @Override
    public void setKommentar_beitrag(String kommentar_beitrag) {
        _kommentar_beitrag = kommentar_beitrag;
    }

    @JSON
    @Override
    public int getBeitrag() {
        return _beitrag;
    }

    @Override
    public void setBeitrag(int beitrag) {
        _beitrag = beitrag;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            Feedback.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public Feedback toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (Feedback) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        FeedbackImpl feedbackImpl = new FeedbackImpl();

        feedbackImpl.setId(getId());
        feedbackImpl.setStudent_id(getStudent_id());
        feedbackImpl.setFeedback_runden_nr(getFeedback_runden_nr());
        feedbackImpl.setEigenbewertung(getEigenbewertung());
        feedbackImpl.setKommentar_kompetenzen(getKommentar_kompetenzen());
        feedbackImpl.setKommentar_beitrag(getKommentar_beitrag());
        feedbackImpl.setBeitrag(getBeitrag());

        feedbackImpl.resetOriginalValues();

        return feedbackImpl;
    }

    @Override
    public int compareTo(Feedback feedback) {
        long primaryKey = feedback.getPrimaryKey();

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

        if (!(obj instanceof Feedback)) {
            return false;
        }

        Feedback feedback = (Feedback) obj;

        long primaryKey = feedback.getPrimaryKey();

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
    public CacheModel<Feedback> toCacheModel() {
        FeedbackCacheModel feedbackCacheModel = new FeedbackCacheModel();

        feedbackCacheModel.id = getId();

        feedbackCacheModel.student_id = getStudent_id();

        feedbackCacheModel.feedback_runden_nr = getFeedback_runden_nr();

        feedbackCacheModel.eigenbewertung = getEigenbewertung();

        String eigenbewertung = feedbackCacheModel.eigenbewertung;

        if ((eigenbewertung != null) && (eigenbewertung.length() == 0)) {
            feedbackCacheModel.eigenbewertung = null;
        }

        feedbackCacheModel.kommentar_kompetenzen = getKommentar_kompetenzen();

        String kommentar_kompetenzen = feedbackCacheModel.kommentar_kompetenzen;

        if ((kommentar_kompetenzen != null) &&
                (kommentar_kompetenzen.length() == 0)) {
            feedbackCacheModel.kommentar_kompetenzen = null;
        }

        feedbackCacheModel.kommentar_beitrag = getKommentar_beitrag();

        String kommentar_beitrag = feedbackCacheModel.kommentar_beitrag;

        if ((kommentar_beitrag != null) && (kommentar_beitrag.length() == 0)) {
            feedbackCacheModel.kommentar_beitrag = null;
        }

        feedbackCacheModel.beitrag = getBeitrag();

        return feedbackCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(15);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", student_id=");
        sb.append(getStudent_id());
        sb.append(", feedback_runden_nr=");
        sb.append(getFeedback_runden_nr());
        sb.append(", eigenbewertung=");
        sb.append(getEigenbewertung());
        sb.append(", kommentar_kompetenzen=");
        sb.append(getKommentar_kompetenzen());
        sb.append(", kommentar_beitrag=");
        sb.append(getKommentar_beitrag());
        sb.append(", beitrag=");
        sb.append(getBeitrag());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(25);

        sb.append("<model><model-name>");
        sb.append("de.hska.wi.awp.datasource.infosys.model.Feedback");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>student_id</column-name><column-value><![CDATA[");
        sb.append(getStudent_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>feedback_runden_nr</column-name><column-value><![CDATA[");
        sb.append(getFeedback_runden_nr());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>eigenbewertung</column-name><column-value><![CDATA[");
        sb.append(getEigenbewertung());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>kommentar_kompetenzen</column-name><column-value><![CDATA[");
        sb.append(getKommentar_kompetenzen());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>kommentar_beitrag</column-name><column-value><![CDATA[");
        sb.append(getKommentar_beitrag());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>beitrag</column-name><column-value><![CDATA[");
        sb.append(getBeitrag());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
