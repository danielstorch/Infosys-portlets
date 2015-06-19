package de.hska.wi.awp.datasource.infosys.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import de.hska.wi.awp.datasource.infosys.service.ClpSerializer;
import de.hska.wi.awp.datasource.infosys.service.Statusbericht_infoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class Statusbericht_infoClp extends BaseModelImpl<Statusbericht_info>
    implements Statusbericht_info {
    private long _id;
    private String _bemerkung;
    private int _status;
    private long _statusbericht_id;
    private long _statusbericht_info_punkt_id;
    private BaseModel<?> _statusbericht_infoRemoteModel;
    private Class<?> _clpSerializerClass = de.hska.wi.awp.datasource.infosys.service.ClpSerializer.class;

    public Statusbericht_infoClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Statusbericht_info.class;
    }

    @Override
    public String getModelClassName() {
        return Statusbericht_info.class.getName();
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
        attributes.put("bemerkung", getBemerkung());
        attributes.put("status", getStatus());
        attributes.put("statusbericht_id", getStatusbericht_id());
        attributes.put("statusbericht_info_punkt_id",
            getStatusbericht_info_punkt_id());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        String bemerkung = (String) attributes.get("bemerkung");

        if (bemerkung != null) {
            setBemerkung(bemerkung);
        }

        Integer status = (Integer) attributes.get("status");

        if (status != null) {
            setStatus(status);
        }

        Long statusbericht_id = (Long) attributes.get("statusbericht_id");

        if (statusbericht_id != null) {
            setStatusbericht_id(statusbericht_id);
        }

        Long statusbericht_info_punkt_id = (Long) attributes.get(
                "statusbericht_info_punkt_id");

        if (statusbericht_info_punkt_id != null) {
            setStatusbericht_info_punkt_id(statusbericht_info_punkt_id);
        }
    }

    @Override
    public long getId() {
        return _id;
    }

    @Override
    public void setId(long id) {
        _id = id;

        if (_statusbericht_infoRemoteModel != null) {
            try {
                Class<?> clazz = _statusbericht_infoRemoteModel.getClass();

                Method method = clazz.getMethod("setId", long.class);

                method.invoke(_statusbericht_infoRemoteModel, id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getBemerkung() {
        return _bemerkung;
    }

    @Override
    public void setBemerkung(String bemerkung) {
        _bemerkung = bemerkung;

        if (_statusbericht_infoRemoteModel != null) {
            try {
                Class<?> clazz = _statusbericht_infoRemoteModel.getClass();

                Method method = clazz.getMethod("setBemerkung", String.class);

                method.invoke(_statusbericht_infoRemoteModel, bemerkung);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStatus() {
        return _status;
    }

    @Override
    public void setStatus(int status) {
        _status = status;

        if (_statusbericht_infoRemoteModel != null) {
            try {
                Class<?> clazz = _statusbericht_infoRemoteModel.getClass();

                Method method = clazz.getMethod("setStatus", int.class);

                method.invoke(_statusbericht_infoRemoteModel, status);
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

        if (_statusbericht_infoRemoteModel != null) {
            try {
                Class<?> clazz = _statusbericht_infoRemoteModel.getClass();

                Method method = clazz.getMethod("setStatusbericht_id",
                        long.class);

                method.invoke(_statusbericht_infoRemoteModel, statusbericht_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getStatusbericht_info_punkt_id() {
        return _statusbericht_info_punkt_id;
    }

    @Override
    public void setStatusbericht_info_punkt_id(long statusbericht_info_punkt_id) {
        _statusbericht_info_punkt_id = statusbericht_info_punkt_id;

        if (_statusbericht_infoRemoteModel != null) {
            try {
                Class<?> clazz = _statusbericht_infoRemoteModel.getClass();

                Method method = clazz.getMethod("setStatusbericht_info_punkt_id",
                        long.class);

                method.invoke(_statusbericht_infoRemoteModel,
                    statusbericht_info_punkt_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getStatusbericht_infoRemoteModel() {
        return _statusbericht_infoRemoteModel;
    }

    public void setStatusbericht_infoRemoteModel(
        BaseModel<?> statusbericht_infoRemoteModel) {
        _statusbericht_infoRemoteModel = statusbericht_infoRemoteModel;
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

        Class<?> remoteModelClass = _statusbericht_infoRemoteModel.getClass();

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

        Object returnValue = method.invoke(_statusbericht_infoRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            Statusbericht_infoLocalServiceUtil.addStatusbericht_info(this);
        } else {
            Statusbericht_infoLocalServiceUtil.updateStatusbericht_info(this);
        }
    }

    @Override
    public Statusbericht_info toEscapedModel() {
        return (Statusbericht_info) ProxyUtil.newProxyInstance(Statusbericht_info.class.getClassLoader(),
            new Class[] { Statusbericht_info.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        Statusbericht_infoClp clone = new Statusbericht_infoClp();

        clone.setId(getId());
        clone.setBemerkung(getBemerkung());
        clone.setStatus(getStatus());
        clone.setStatusbericht_id(getStatusbericht_id());
        clone.setStatusbericht_info_punkt_id(getStatusbericht_info_punkt_id());

        return clone;
    }

    @Override
    public int compareTo(Statusbericht_info statusbericht_info) {
        long primaryKey = statusbericht_info.getPrimaryKey();

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

        if (!(obj instanceof Statusbericht_infoClp)) {
            return false;
        }

        Statusbericht_infoClp statusbericht_info = (Statusbericht_infoClp) obj;

        long primaryKey = statusbericht_info.getPrimaryKey();

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
        StringBundler sb = new StringBundler(11);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", bemerkung=");
        sb.append(getBemerkung());
        sb.append(", status=");
        sb.append(getStatus());
        sb.append(", statusbericht_id=");
        sb.append(getStatusbericht_id());
        sb.append(", statusbericht_info_punkt_id=");
        sb.append(getStatusbericht_info_punkt_id());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(19);

        sb.append("<model><model-name>");
        sb.append("de.hska.wi.awp.datasource.infosys.model.Statusbericht_info");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>bemerkung</column-name><column-value><![CDATA[");
        sb.append(getBemerkung());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>status</column-name><column-value><![CDATA[");
        sb.append(getStatus());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>statusbericht_id</column-name><column-value><![CDATA[");
        sb.append(getStatusbericht_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>statusbericht_info_punkt_id</column-name><column-value><![CDATA[");
        sb.append(getStatusbericht_info_punkt_id());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
