package de.hska.wi.awp.datasource.infosys.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import de.hska.wi.awp.datasource.infosys.service.ClpSerializer;
import de.hska.wi.awp.datasource.infosys.service.Statusbericht_info_punktLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class Statusbericht_info_punktClp extends BaseModelImpl<Statusbericht_info_punkt>
    implements Statusbericht_info_punkt {
    private long _id;
    private String _name;
    private BaseModel<?> _statusbericht_info_punktRemoteModel;
    private Class<?> _clpSerializerClass = de.hska.wi.awp.datasource.infosys.service.ClpSerializer.class;

    public Statusbericht_info_punktClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Statusbericht_info_punkt.class;
    }

    @Override
    public String getModelClassName() {
        return Statusbericht_info_punkt.class.getName();
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
        attributes.put("name", getName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }
    }

    @Override
    public long getId() {
        return _id;
    }

    @Override
    public void setId(long id) {
        _id = id;

        if (_statusbericht_info_punktRemoteModel != null) {
            try {
                Class<?> clazz = _statusbericht_info_punktRemoteModel.getClass();

                Method method = clazz.getMethod("setId", long.class);

                method.invoke(_statusbericht_info_punktRemoteModel, id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public void setName(String name) {
        _name = name;

        if (_statusbericht_info_punktRemoteModel != null) {
            try {
                Class<?> clazz = _statusbericht_info_punktRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_statusbericht_info_punktRemoteModel, name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getStatusbericht_info_punktRemoteModel() {
        return _statusbericht_info_punktRemoteModel;
    }

    public void setStatusbericht_info_punktRemoteModel(
        BaseModel<?> statusbericht_info_punktRemoteModel) {
        _statusbericht_info_punktRemoteModel = statusbericht_info_punktRemoteModel;
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

        Class<?> remoteModelClass = _statusbericht_info_punktRemoteModel.getClass();

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

        Object returnValue = method.invoke(_statusbericht_info_punktRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            Statusbericht_info_punktLocalServiceUtil.addStatusbericht_info_punkt(this);
        } else {
            Statusbericht_info_punktLocalServiceUtil.updateStatusbericht_info_punkt(this);
        }
    }

    @Override
    public Statusbericht_info_punkt toEscapedModel() {
        return (Statusbericht_info_punkt) ProxyUtil.newProxyInstance(Statusbericht_info_punkt.class.getClassLoader(),
            new Class[] { Statusbericht_info_punkt.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        Statusbericht_info_punktClp clone = new Statusbericht_info_punktClp();

        clone.setId(getId());
        clone.setName(getName());

        return clone;
    }

    @Override
    public int compareTo(Statusbericht_info_punkt statusbericht_info_punkt) {
        long primaryKey = statusbericht_info_punkt.getPrimaryKey();

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

        if (!(obj instanceof Statusbericht_info_punktClp)) {
            return false;
        }

        Statusbericht_info_punktClp statusbericht_info_punkt = (Statusbericht_info_punktClp) obj;

        long primaryKey = statusbericht_info_punkt.getPrimaryKey();

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
        StringBundler sb = new StringBundler(5);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", name=");
        sb.append(getName());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(10);

        sb.append("<model><model-name>");
        sb.append(
            "de.hska.wi.awp.datasource.infosys.model.Statusbericht_info_punkt");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
