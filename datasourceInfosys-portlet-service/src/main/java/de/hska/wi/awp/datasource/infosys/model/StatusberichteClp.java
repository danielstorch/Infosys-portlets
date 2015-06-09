package de.hska.wi.awp.datasource.infosys.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import de.hska.wi.awp.datasource.infosys.service.ClpSerializer;
import de.hska.wi.awp.datasource.infosys.service.StatusberichteLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class StatusberichteClp extends BaseModelImpl<Statusberichte>
    implements Statusberichte {
    private long _id;
    private long _project_id;
    private Date _datum;
    private int _kalenderwoche;
    private BaseModel<?> _statusberichteRemoteModel;
    private Class<?> _clpSerializerClass = de.hska.wi.awp.datasource.infosys.service.ClpSerializer.class;

    public StatusberichteClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Statusberichte.class;
    }

    @Override
    public String getModelClassName() {
        return Statusberichte.class.getName();
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
        attributes.put("project_id", getProject_id());
        attributes.put("datum", getDatum());
        attributes.put("kalenderwoche", getKalenderwoche());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        Long project_id = (Long) attributes.get("project_id");

        if (project_id != null) {
            setProject_id(project_id);
        }

        Date datum = (Date) attributes.get("datum");

        if (datum != null) {
            setDatum(datum);
        }

        Integer kalenderwoche = (Integer) attributes.get("kalenderwoche");

        if (kalenderwoche != null) {
            setKalenderwoche(kalenderwoche);
        }
    }

    @Override
    public long getId() {
        return _id;
    }

    @Override
    public void setId(long id) {
        _id = id;

        if (_statusberichteRemoteModel != null) {
            try {
                Class<?> clazz = _statusberichteRemoteModel.getClass();

                Method method = clazz.getMethod("setId", long.class);

                method.invoke(_statusberichteRemoteModel, id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getProject_id() {
        return _project_id;
    }

    @Override
    public void setProject_id(long project_id) {
        _project_id = project_id;

        if (_statusberichteRemoteModel != null) {
            try {
                Class<?> clazz = _statusberichteRemoteModel.getClass();

                Method method = clazz.getMethod("setProject_id", long.class);

                method.invoke(_statusberichteRemoteModel, project_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getDatum() {
        return _datum;
    }

    @Override
    public void setDatum(Date datum) {
        _datum = datum;

        if (_statusberichteRemoteModel != null) {
            try {
                Class<?> clazz = _statusberichteRemoteModel.getClass();

                Method method = clazz.getMethod("setDatum", Date.class);

                method.invoke(_statusberichteRemoteModel, datum);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getKalenderwoche() {
        return _kalenderwoche;
    }

    @Override
    public void setKalenderwoche(int kalenderwoche) {
        _kalenderwoche = kalenderwoche;

        if (_statusberichteRemoteModel != null) {
            try {
                Class<?> clazz = _statusberichteRemoteModel.getClass();

                Method method = clazz.getMethod("setKalenderwoche", int.class);

                method.invoke(_statusberichteRemoteModel, kalenderwoche);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getStatusberichteRemoteModel() {
        return _statusberichteRemoteModel;
    }

    public void setStatusberichteRemoteModel(
        BaseModel<?> statusberichteRemoteModel) {
        _statusberichteRemoteModel = statusberichteRemoteModel;
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

        Class<?> remoteModelClass = _statusberichteRemoteModel.getClass();

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

        Object returnValue = method.invoke(_statusberichteRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            StatusberichteLocalServiceUtil.addStatusberichte(this);
        } else {
            StatusberichteLocalServiceUtil.updateStatusberichte(this);
        }
    }

    @Override
    public Statusberichte toEscapedModel() {
        return (Statusberichte) ProxyUtil.newProxyInstance(Statusberichte.class.getClassLoader(),
            new Class[] { Statusberichte.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        StatusberichteClp clone = new StatusberichteClp();

        clone.setId(getId());
        clone.setProject_id(getProject_id());
        clone.setDatum(getDatum());
        clone.setKalenderwoche(getKalenderwoche());

        return clone;
    }

    @Override
    public int compareTo(Statusberichte statusberichte) {
        long primaryKey = statusberichte.getPrimaryKey();

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

        if (!(obj instanceof StatusberichteClp)) {
            return false;
        }

        StatusberichteClp statusberichte = (StatusberichteClp) obj;

        long primaryKey = statusberichte.getPrimaryKey();

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
        sb.append(", project_id=");
        sb.append(getProject_id());
        sb.append(", datum=");
        sb.append(getDatum());
        sb.append(", kalenderwoche=");
        sb.append(getKalenderwoche());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("de.hska.wi.awp.datasource.infosys.model.Statusberichte");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>project_id</column-name><column-value><![CDATA[");
        sb.append(getProject_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>datum</column-name><column-value><![CDATA[");
        sb.append(getDatum());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>kalenderwoche</column-name><column-value><![CDATA[");
        sb.append(getKalenderwoche());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
