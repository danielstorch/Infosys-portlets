package de.hska.wi.awp.datasource.infosys.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import de.hska.wi.awp.datasource.infosys.service.ClpSerializer;
import de.hska.wi.awp.datasource.infosys.service.RolleLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class RolleClp extends BaseModelImpl<Rolle> implements Rolle {
    private long _id;
    private String _shortName;
    private String _name;
    private BaseModel<?> _rolleRemoteModel;
    private Class<?> _clpSerializerClass = de.hska.wi.awp.datasource.infosys.service.ClpSerializer.class;

    public RolleClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Rolle.class;
    }

    @Override
    public String getModelClassName() {
        return Rolle.class.getName();
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
        attributes.put("shortName", getShortName());
        attributes.put("name", getName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        String shortName = (String) attributes.get("shortName");

        if (shortName != null) {
            setShortName(shortName);
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

        if (_rolleRemoteModel != null) {
            try {
                Class<?> clazz = _rolleRemoteModel.getClass();

                Method method = clazz.getMethod("setId", long.class);

                method.invoke(_rolleRemoteModel, id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getShortName() {
        return _shortName;
    }

    @Override
    public void setShortName(String shortName) {
        _shortName = shortName;

        if (_rolleRemoteModel != null) {
            try {
                Class<?> clazz = _rolleRemoteModel.getClass();

                Method method = clazz.getMethod("setShortName", String.class);

                method.invoke(_rolleRemoteModel, shortName);
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

        if (_rolleRemoteModel != null) {
            try {
                Class<?> clazz = _rolleRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_rolleRemoteModel, name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getRolleRemoteModel() {
        return _rolleRemoteModel;
    }

    public void setRolleRemoteModel(BaseModel<?> rolleRemoteModel) {
        _rolleRemoteModel = rolleRemoteModel;
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

        Class<?> remoteModelClass = _rolleRemoteModel.getClass();

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

        Object returnValue = method.invoke(_rolleRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            RolleLocalServiceUtil.addRolle(this);
        } else {
            RolleLocalServiceUtil.updateRolle(this);
        }
    }

    @Override
    public Rolle toEscapedModel() {
        return (Rolle) ProxyUtil.newProxyInstance(Rolle.class.getClassLoader(),
            new Class[] { Rolle.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        RolleClp clone = new RolleClp();

        clone.setId(getId());
        clone.setShortName(getShortName());
        clone.setName(getName());

        return clone;
    }

    @Override
    public int compareTo(Rolle rolle) {
        long primaryKey = rolle.getPrimaryKey();

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

        if (!(obj instanceof RolleClp)) {
            return false;
        }

        RolleClp rolle = (RolleClp) obj;

        long primaryKey = rolle.getPrimaryKey();

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
        StringBundler sb = new StringBundler(7);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", shortName=");
        sb.append(getShortName());
        sb.append(", name=");
        sb.append(getName());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append("de.hska.wi.awp.datasource.infosys.model.Rolle");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>shortName</column-name><column-value><![CDATA[");
        sb.append(getShortName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
