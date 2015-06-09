package de.hska.wi.awp.datasource.infosys.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import de.hska.wi.awp.datasource.infosys.service.ClpSerializer;
import de.hska.wi.awp.datasource.infosys.service.FeedbackLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class FeedbackClp extends BaseModelImpl<Feedback> implements Feedback {
    private long _id;
    private long _student_id;
    private int _feedback_runden_nr;
    private String _eigenbewertung;
    private String _kommentar_kompetenzen;
    private String _kommentar_beitrag;
    private int _beitrag;
    private BaseModel<?> _feedbackRemoteModel;
    private Class<?> _clpSerializerClass = de.hska.wi.awp.datasource.infosys.service.ClpSerializer.class;

    public FeedbackClp() {
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

    @Override
    public long getId() {
        return _id;
    }

    @Override
    public void setId(long id) {
        _id = id;

        if (_feedbackRemoteModel != null) {
            try {
                Class<?> clazz = _feedbackRemoteModel.getClass();

                Method method = clazz.getMethod("setId", long.class);

                method.invoke(_feedbackRemoteModel, id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getStudent_id() {
        return _student_id;
    }

    @Override
    public void setStudent_id(long student_id) {
        _student_id = student_id;

        if (_feedbackRemoteModel != null) {
            try {
                Class<?> clazz = _feedbackRemoteModel.getClass();

                Method method = clazz.getMethod("setStudent_id", long.class);

                method.invoke(_feedbackRemoteModel, student_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getFeedback_runden_nr() {
        return _feedback_runden_nr;
    }

    @Override
    public void setFeedback_runden_nr(int feedback_runden_nr) {
        _feedback_runden_nr = feedback_runden_nr;

        if (_feedbackRemoteModel != null) {
            try {
                Class<?> clazz = _feedbackRemoteModel.getClass();

                Method method = clazz.getMethod("setFeedback_runden_nr",
                        int.class);

                method.invoke(_feedbackRemoteModel, feedback_runden_nr);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getEigenbewertung() {
        return _eigenbewertung;
    }

    @Override
    public void setEigenbewertung(String eigenbewertung) {
        _eigenbewertung = eigenbewertung;

        if (_feedbackRemoteModel != null) {
            try {
                Class<?> clazz = _feedbackRemoteModel.getClass();

                Method method = clazz.getMethod("setEigenbewertung",
                        String.class);

                method.invoke(_feedbackRemoteModel, eigenbewertung);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getKommentar_kompetenzen() {
        return _kommentar_kompetenzen;
    }

    @Override
    public void setKommentar_kompetenzen(String kommentar_kompetenzen) {
        _kommentar_kompetenzen = kommentar_kompetenzen;

        if (_feedbackRemoteModel != null) {
            try {
                Class<?> clazz = _feedbackRemoteModel.getClass();

                Method method = clazz.getMethod("setKommentar_kompetenzen",
                        String.class);

                method.invoke(_feedbackRemoteModel, kommentar_kompetenzen);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getKommentar_beitrag() {
        return _kommentar_beitrag;
    }

    @Override
    public void setKommentar_beitrag(String kommentar_beitrag) {
        _kommentar_beitrag = kommentar_beitrag;

        if (_feedbackRemoteModel != null) {
            try {
                Class<?> clazz = _feedbackRemoteModel.getClass();

                Method method = clazz.getMethod("setKommentar_beitrag",
                        String.class);

                method.invoke(_feedbackRemoteModel, kommentar_beitrag);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getBeitrag() {
        return _beitrag;
    }

    @Override
    public void setBeitrag(int beitrag) {
        _beitrag = beitrag;

        if (_feedbackRemoteModel != null) {
            try {
                Class<?> clazz = _feedbackRemoteModel.getClass();

                Method method = clazz.getMethod("setBeitrag", int.class);

                method.invoke(_feedbackRemoteModel, beitrag);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getFeedbackRemoteModel() {
        return _feedbackRemoteModel;
    }

    public void setFeedbackRemoteModel(BaseModel<?> feedbackRemoteModel) {
        _feedbackRemoteModel = feedbackRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _feedbackRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_feedbackRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            FeedbackLocalServiceUtil.addFeedback(this);
        } else {
            FeedbackLocalServiceUtil.updateFeedback(this);
        }
    }

    @Override
    public Feedback toEscapedModel() {
        return (Feedback) ProxyUtil.newProxyInstance(Feedback.class.getClassLoader(),
            new Class[] { Feedback.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        FeedbackClp clone = new FeedbackClp();

        clone.setId(getId());
        clone.setStudent_id(getStudent_id());
        clone.setFeedback_runden_nr(getFeedback_runden_nr());
        clone.setEigenbewertung(getEigenbewertung());
        clone.setKommentar_kompetenzen(getKommentar_kompetenzen());
        clone.setKommentar_beitrag(getKommentar_beitrag());
        clone.setBeitrag(getBeitrag());

        return clone;
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

        if (!(obj instanceof FeedbackClp)) {
            return false;
        }

        FeedbackClp feedback = (FeedbackClp) obj;

        long primaryKey = feedback.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
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
