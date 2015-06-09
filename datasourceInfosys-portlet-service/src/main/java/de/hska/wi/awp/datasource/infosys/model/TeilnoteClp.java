package de.hska.wi.awp.datasource.infosys.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import de.hska.wi.awp.datasource.infosys.service.ClpSerializer;
import de.hska.wi.awp.datasource.infosys.service.TeilnoteLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class TeilnoteClp extends BaseModelImpl<Teilnote> implements Teilnote {
    private long _id;
    private long _feedback_id;
    private int _note;
    private long _kategorie;
    private BaseModel<?> _teilnoteRemoteModel;
    private Class<?> _clpSerializerClass = de.hska.wi.awp.datasource.infosys.service.ClpSerializer.class;

    public TeilnoteClp() {
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

    @Override
    public long getId() {
        return _id;
    }

    @Override
    public void setId(long id) {
        _id = id;

        if (_teilnoteRemoteModel != null) {
            try {
                Class<?> clazz = _teilnoteRemoteModel.getClass();

                Method method = clazz.getMethod("setId", long.class);

                method.invoke(_teilnoteRemoteModel, id);
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

        if (_teilnoteRemoteModel != null) {
            try {
                Class<?> clazz = _teilnoteRemoteModel.getClass();

                Method method = clazz.getMethod("setFeedback_id", long.class);

                method.invoke(_teilnoteRemoteModel, feedback_id);
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

        if (_teilnoteRemoteModel != null) {
            try {
                Class<?> clazz = _teilnoteRemoteModel.getClass();

                Method method = clazz.getMethod("setNote", int.class);

                method.invoke(_teilnoteRemoteModel, note);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getKategorie() {
        return _kategorie;
    }

    @Override
    public void setKategorie(long kategorie) {
        _kategorie = kategorie;

        if (_teilnoteRemoteModel != null) {
            try {
                Class<?> clazz = _teilnoteRemoteModel.getClass();

                Method method = clazz.getMethod("setKategorie", long.class);

                method.invoke(_teilnoteRemoteModel, kategorie);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getTeilnoteRemoteModel() {
        return _teilnoteRemoteModel;
    }

    public void setTeilnoteRemoteModel(BaseModel<?> teilnoteRemoteModel) {
        _teilnoteRemoteModel = teilnoteRemoteModel;
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

        Class<?> remoteModelClass = _teilnoteRemoteModel.getClass();

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

        Object returnValue = method.invoke(_teilnoteRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            TeilnoteLocalServiceUtil.addTeilnote(this);
        } else {
            TeilnoteLocalServiceUtil.updateTeilnote(this);
        }
    }

    @Override
    public Teilnote toEscapedModel() {
        return (Teilnote) ProxyUtil.newProxyInstance(Teilnote.class.getClassLoader(),
            new Class[] { Teilnote.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        TeilnoteClp clone = new TeilnoteClp();

        clone.setId(getId());
        clone.setFeedback_id(getFeedback_id());
        clone.setNote(getNote());
        clone.setKategorie(getKategorie());

        return clone;
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

        if (!(obj instanceof TeilnoteClp)) {
            return false;
        }

        TeilnoteClp teilnote = (TeilnoteClp) obj;

        long primaryKey = teilnote.getPrimaryKey();

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
