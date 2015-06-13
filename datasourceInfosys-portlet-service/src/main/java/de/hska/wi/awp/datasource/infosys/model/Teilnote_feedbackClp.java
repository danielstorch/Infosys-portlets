package de.hska.wi.awp.datasource.infosys.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import de.hska.wi.awp.datasource.infosys.service.ClpSerializer;
import de.hska.wi.awp.datasource.infosys.service.Teilnote_feedbackLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class Teilnote_feedbackClp extends BaseModelImpl<Teilnote_feedback>
    implements Teilnote_feedback {
    private long _id;
    private long _feedback_id;
    private int _note;
    private long _bewertungskriterium_id;
    private BaseModel<?> _teilnote_feedbackRemoteModel;
    private Class<?> _clpSerializerClass = de.hska.wi.awp.datasource.infosys.service.ClpSerializer.class;

    public Teilnote_feedbackClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Teilnote_feedback.class;
    }

    @Override
    public String getModelClassName() {
        return Teilnote_feedback.class.getName();
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
        attributes.put("feedback_id", getFeedback_id());
        attributes.put("note", getNote());
        attributes.put("bewertungskriterium_id", getBewertungskriterium_id());

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

        Long bewertungskriterium_id = (Long) attributes.get(
                "bewertungskriterium_id");

        if (bewertungskriterium_id != null) {
            setBewertungskriterium_id(bewertungskriterium_id);
        }
    }

    @Override
    public long getId() {
        return _id;
    }

    @Override
    public void setId(long id) {
        _id = id;

        if (_teilnote_feedbackRemoteModel != null) {
            try {
                Class<?> clazz = _teilnote_feedbackRemoteModel.getClass();

                Method method = clazz.getMethod("setId", long.class);

                method.invoke(_teilnote_feedbackRemoteModel, id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getFeedback_id() {
        return _feedback_id;
    }

    @Override
    public void setFeedback_id(long feedback_id) {
        _feedback_id = feedback_id;

        if (_teilnote_feedbackRemoteModel != null) {
            try {
                Class<?> clazz = _teilnote_feedbackRemoteModel.getClass();

                Method method = clazz.getMethod("setFeedback_id", long.class);

                method.invoke(_teilnote_feedbackRemoteModel, feedback_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getNote() {
        return _note;
    }

    @Override
    public void setNote(int note) {
        _note = note;

        if (_teilnote_feedbackRemoteModel != null) {
            try {
                Class<?> clazz = _teilnote_feedbackRemoteModel.getClass();

                Method method = clazz.getMethod("setNote", int.class);

                method.invoke(_teilnote_feedbackRemoteModel, note);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getBewertungskriterium_id() {
        return _bewertungskriterium_id;
    }

    @Override
    public void setBewertungskriterium_id(long bewertungskriterium_id) {
        _bewertungskriterium_id = bewertungskriterium_id;

        if (_teilnote_feedbackRemoteModel != null) {
            try {
                Class<?> clazz = _teilnote_feedbackRemoteModel.getClass();

                Method method = clazz.getMethod("setBewertungskriterium_id",
                        long.class);

                method.invoke(_teilnote_feedbackRemoteModel,
                    bewertungskriterium_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getTeilnote_feedbackRemoteModel() {
        return _teilnote_feedbackRemoteModel;
    }

    public void setTeilnote_feedbackRemoteModel(
        BaseModel<?> teilnote_feedbackRemoteModel) {
        _teilnote_feedbackRemoteModel = teilnote_feedbackRemoteModel;
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

        Class<?> remoteModelClass = _teilnote_feedbackRemoteModel.getClass();

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

        Object returnValue = method.invoke(_teilnote_feedbackRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            Teilnote_feedbackLocalServiceUtil.addTeilnote_feedback(this);
        } else {
            Teilnote_feedbackLocalServiceUtil.updateTeilnote_feedback(this);
        }
    }

    @Override
    public Teilnote_feedback toEscapedModel() {
        return (Teilnote_feedback) ProxyUtil.newProxyInstance(Teilnote_feedback.class.getClassLoader(),
            new Class[] { Teilnote_feedback.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        Teilnote_feedbackClp clone = new Teilnote_feedbackClp();

        clone.setId(getId());
        clone.setFeedback_id(getFeedback_id());
        clone.setNote(getNote());
        clone.setBewertungskriterium_id(getBewertungskriterium_id());

        return clone;
    }

    @Override
    public int compareTo(Teilnote_feedback teilnote_feedback) {
        long primaryKey = teilnote_feedback.getPrimaryKey();

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

        if (!(obj instanceof Teilnote_feedbackClp)) {
            return false;
        }

        Teilnote_feedbackClp teilnote_feedback = (Teilnote_feedbackClp) obj;

        long primaryKey = teilnote_feedback.getPrimaryKey();

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
        StringBundler sb = new StringBundler(9);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", feedback_id=");
        sb.append(getFeedback_id());
        sb.append(", note=");
        sb.append(getNote());
        sb.append(", bewertungskriterium_id=");
        sb.append(getBewertungskriterium_id());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback");
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
            "<column><column-name>bewertungskriterium_id</column-name><column-value><![CDATA[");
        sb.append(getBewertungskriterium_id());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
