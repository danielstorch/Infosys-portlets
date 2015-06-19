package de.hska.wi.awp.datasource.infosys.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import de.hska.wi.awp.datasource.infosys.service.ClpSerializer;
import de.hska.wi.awp.datasource.infosys.service.Statusbericht_detailLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class Statusbericht_detailClp extends BaseModelImpl<Statusbericht_detail>
    implements Statusbericht_detail {
    private long _id;
    private String _text;
    private long _statusbericht_id;
    private long _statusbericht_detail_punkt_id;
    private BaseModel<?> _statusbericht_detailRemoteModel;
    private Class<?> _clpSerializerClass = de.hska.wi.awp.datasource.infosys.service.ClpSerializer.class;

    public Statusbericht_detailClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Statusbericht_detail.class;
    }

    @Override
    public String getModelClassName() {
        return Statusbericht_detail.class.getName();
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
        attributes.put("text", getText());
        attributes.put("statusbericht_id", getStatusbericht_id());
        attributes.put("statusbericht_detail_punkt_id",
            getStatusbericht_detail_punkt_id());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        String text = (String) attributes.get("text");

        if (text != null) {
            setText(text);
        }

        Long statusbericht_id = (Long) attributes.get("statusbericht_id");

        if (statusbericht_id != null) {
            setStatusbericht_id(statusbericht_id);
        }

        Long statusbericht_detail_punkt_id = (Long) attributes.get(
                "statusbericht_detail_punkt_id");

        if (statusbericht_detail_punkt_id != null) {
            setStatusbericht_detail_punkt_id(statusbericht_detail_punkt_id);
        }
    }

    @Override
    public long getId() {
        return _id;
    }

    @Override
    public void setId(long id) {
        _id = id;

        if (_statusbericht_detailRemoteModel != null) {
            try {
                Class<?> clazz = _statusbericht_detailRemoteModel.getClass();

                Method method = clazz.getMethod("setId", long.class);

                method.invoke(_statusbericht_detailRemoteModel, id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getText() {
        return _text;
    }

    @Override
    public void setText(String text) {
        _text = text;

        if (_statusbericht_detailRemoteModel != null) {
            try {
                Class<?> clazz = _statusbericht_detailRemoteModel.getClass();

                Method method = clazz.getMethod("setText", String.class);

                method.invoke(_statusbericht_detailRemoteModel, text);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getStatusbericht_id() {
        return _statusbericht_id;
    }

    @Override
    public void setStatusbericht_id(long statusbericht_id) {
        _statusbericht_id = statusbericht_id;

        if (_statusbericht_detailRemoteModel != null) {
            try {
                Class<?> clazz = _statusbericht_detailRemoteModel.getClass();

                Method method = clazz.getMethod("setStatusbericht_id",
                        long.class);

                method.invoke(_statusbericht_detailRemoteModel, statusbericht_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getStatusbericht_detail_punkt_id() {
        return _statusbericht_detail_punkt_id;
    }

    @Override
    public void setStatusbericht_detail_punkt_id(
        long statusbericht_detail_punkt_id) {
        _statusbericht_detail_punkt_id = statusbericht_detail_punkt_id;

        if (_statusbericht_detailRemoteModel != null) {
            try {
                Class<?> clazz = _statusbericht_detailRemoteModel.getClass();

                Method method = clazz.getMethod("setStatusbericht_detail_punkt_id",
                        long.class);

                method.invoke(_statusbericht_detailRemoteModel,
                    statusbericht_detail_punkt_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getStatusbericht_detailRemoteModel() {
        return _statusbericht_detailRemoteModel;
    }

    public void setStatusbericht_detailRemoteModel(
        BaseModel<?> statusbericht_detailRemoteModel) {
        _statusbericht_detailRemoteModel = statusbericht_detailRemoteModel;
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

        Class<?> remoteModelClass = _statusbericht_detailRemoteModel.getClass();

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

        Object returnValue = method.invoke(_statusbericht_detailRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            Statusbericht_detailLocalServiceUtil.addStatusbericht_detail(this);
        } else {
            Statusbericht_detailLocalServiceUtil.updateStatusbericht_detail(this);
        }
    }

    @Override
    public Statusbericht_detail toEscapedModel() {
        return (Statusbericht_detail) ProxyUtil.newProxyInstance(Statusbericht_detail.class.getClassLoader(),
            new Class[] { Statusbericht_detail.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        Statusbericht_detailClp clone = new Statusbericht_detailClp();

        clone.setId(getId());
        clone.setText(getText());
        clone.setStatusbericht_id(getStatusbericht_id());
        clone.setStatusbericht_detail_punkt_id(getStatusbericht_detail_punkt_id());

        return clone;
    }

    @Override
    public int compareTo(Statusbericht_detail statusbericht_detail) {
        long primaryKey = statusbericht_detail.getPrimaryKey();

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

        if (!(obj instanceof Statusbericht_detailClp)) {
            return false;
        }

        Statusbericht_detailClp statusbericht_detail = (Statusbericht_detailClp) obj;

        long primaryKey = statusbericht_detail.getPrimaryKey();

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
        sb.append(", text=");
        sb.append(getText());
        sb.append(", statusbericht_id=");
        sb.append(getStatusbericht_id());
        sb.append(", statusbericht_detail_punkt_id=");
        sb.append(getStatusbericht_detail_punkt_id());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append(
            "de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>text</column-name><column-value><![CDATA[");
        sb.append(getText());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>statusbericht_id</column-name><column-value><![CDATA[");
        sb.append(getStatusbericht_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>statusbericht_detail_punkt_id</column-name><column-value><![CDATA[");
        sb.append(getStatusbericht_detail_punkt_id());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
