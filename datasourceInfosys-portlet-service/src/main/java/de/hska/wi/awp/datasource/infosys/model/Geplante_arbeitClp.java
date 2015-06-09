package de.hska.wi.awp.datasource.infosys.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import de.hska.wi.awp.datasource.infosys.service.ClpSerializer;
import de.hska.wi.awp.datasource.infosys.service.Geplante_arbeitLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class Geplante_arbeitClp extends BaseModelImpl<Geplante_arbeit>
    implements Geplante_arbeit {
    private long _id;
    private long _statusbericht_id;
    private long _verantwortlicher;
    private String _arbeit;
    private Date _bis_wann;
    private BaseModel<?> _geplante_arbeitRemoteModel;
    private Class<?> _clpSerializerClass = de.hska.wi.awp.datasource.infosys.service.ClpSerializer.class;

    public Geplante_arbeitClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Geplante_arbeit.class;
    }

    @Override
    public String getModelClassName() {
        return Geplante_arbeit.class.getName();
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
        attributes.put("statusbericht_id", getStatusbericht_id());
        attributes.put("verantwortlicher", getVerantwortlicher());
        attributes.put("arbeit", getArbeit());
        attributes.put("bis_wann", getBis_wann());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        Long statusbericht_id = (Long) attributes.get("statusbericht_id");

        if (statusbericht_id != null) {
            setStatusbericht_id(statusbericht_id);
        }

        Long verantwortlicher = (Long) attributes.get("verantwortlicher");

        if (verantwortlicher != null) {
            setVerantwortlicher(verantwortlicher);
        }

        String arbeit = (String) attributes.get("arbeit");

        if (arbeit != null) {
            setArbeit(arbeit);
        }

        Date bis_wann = (Date) attributes.get("bis_wann");

        if (bis_wann != null) {
            setBis_wann(bis_wann);
        }
    }

    @Override
    public long getId() {
        return _id;
    }

    @Override
    public void setId(long id) {
        _id = id;

        if (_geplante_arbeitRemoteModel != null) {
            try {
                Class<?> clazz = _geplante_arbeitRemoteModel.getClass();

                Method method = clazz.getMethod("setId", long.class);

                method.invoke(_geplante_arbeitRemoteModel, id);
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

        if (_geplante_arbeitRemoteModel != null) {
            try {
                Class<?> clazz = _geplante_arbeitRemoteModel.getClass();

                Method method = clazz.getMethod("setStatusbericht_id",
                        long.class);

                method.invoke(_geplante_arbeitRemoteModel, statusbericht_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getVerantwortlicher() {
        return _verantwortlicher;
    }

    @Override
    public void setVerantwortlicher(long verantwortlicher) {
        _verantwortlicher = verantwortlicher;

        if (_geplante_arbeitRemoteModel != null) {
            try {
                Class<?> clazz = _geplante_arbeitRemoteModel.getClass();

                Method method = clazz.getMethod("setVerantwortlicher",
                        long.class);

                method.invoke(_geplante_arbeitRemoteModel, verantwortlicher);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getArbeit() {
        return _arbeit;
    }

    @Override
    public void setArbeit(String arbeit) {
        _arbeit = arbeit;

        if (_geplante_arbeitRemoteModel != null) {
            try {
                Class<?> clazz = _geplante_arbeitRemoteModel.getClass();

                Method method = clazz.getMethod("setArbeit", String.class);

                method.invoke(_geplante_arbeitRemoteModel, arbeit);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getBis_wann() {
        return _bis_wann;
    }

    @Override
    public void setBis_wann(Date bis_wann) {
        _bis_wann = bis_wann;

        if (_geplante_arbeitRemoteModel != null) {
            try {
                Class<?> clazz = _geplante_arbeitRemoteModel.getClass();

                Method method = clazz.getMethod("setBis_wann", Date.class);

                method.invoke(_geplante_arbeitRemoteModel, bis_wann);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getGeplante_arbeitRemoteModel() {
        return _geplante_arbeitRemoteModel;
    }

    public void setGeplante_arbeitRemoteModel(
        BaseModel<?> geplante_arbeitRemoteModel) {
        _geplante_arbeitRemoteModel = geplante_arbeitRemoteModel;
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

        Class<?> remoteModelClass = _geplante_arbeitRemoteModel.getClass();

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

        Object returnValue = method.invoke(_geplante_arbeitRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            Geplante_arbeitLocalServiceUtil.addGeplante_arbeit(this);
        } else {
            Geplante_arbeitLocalServiceUtil.updateGeplante_arbeit(this);
        }
    }

    @Override
    public Geplante_arbeit toEscapedModel() {
        return (Geplante_arbeit) ProxyUtil.newProxyInstance(Geplante_arbeit.class.getClassLoader(),
            new Class[] { Geplante_arbeit.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        Geplante_arbeitClp clone = new Geplante_arbeitClp();

        clone.setId(getId());
        clone.setStatusbericht_id(getStatusbericht_id());
        clone.setVerantwortlicher(getVerantwortlicher());
        clone.setArbeit(getArbeit());
        clone.setBis_wann(getBis_wann());

        return clone;
    }

    @Override
    public int compareTo(Geplante_arbeit geplante_arbeit) {
        long primaryKey = geplante_arbeit.getPrimaryKey();

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

        if (!(obj instanceof Geplante_arbeitClp)) {
            return false;
        }

        Geplante_arbeitClp geplante_arbeit = (Geplante_arbeitClp) obj;

        long primaryKey = geplante_arbeit.getPrimaryKey();

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
        sb.append(", statusbericht_id=");
        sb.append(getStatusbericht_id());
        sb.append(", verantwortlicher=");
        sb.append(getVerantwortlicher());
        sb.append(", arbeit=");
        sb.append(getArbeit());
        sb.append(", bis_wann=");
        sb.append(getBis_wann());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(19);

        sb.append("<model><model-name>");
        sb.append("de.hska.wi.awp.datasource.infosys.model.Geplante_arbeit");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>statusbericht_id</column-name><column-value><![CDATA[");
        sb.append(getStatusbericht_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>verantwortlicher</column-name><column-value><![CDATA[");
        sb.append(getVerantwortlicher());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>arbeit</column-name><column-value><![CDATA[");
        sb.append(getArbeit());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>bis_wann</column-name><column-value><![CDATA[");
        sb.append(getBis_wann());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
