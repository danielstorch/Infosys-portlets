package de.hska.wi.awp.datasource.infosys.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import de.hska.wi.awp.datasource.infosys.service.ClpSerializer;
import de.hska.wi.awp.datasource.infosys.service.Statusbericht_geplante_arbeitLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class Statusbericht_geplante_arbeitClp extends BaseModelImpl<Statusbericht_geplante_arbeit>
    implements Statusbericht_geplante_arbeit {
    private long _id;
    private String _aktivitaet;
    private Date _bis_wann;
    private long _statusbericht_id;
    private long _verantwortlicher;
    private BaseModel<?> _statusbericht_geplante_arbeitRemoteModel;
    private Class<?> _clpSerializerClass = de.hska.wi.awp.datasource.infosys.service.ClpSerializer.class;

    public Statusbericht_geplante_arbeitClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Statusbericht_geplante_arbeit.class;
    }

    @Override
    public String getModelClassName() {
        return Statusbericht_geplante_arbeit.class.getName();
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
        attributes.put("aktivitaet", getAktivitaet());
        attributes.put("bis_wann", getBis_wann());
        attributes.put("statusbericht_id", getStatusbericht_id());
        attributes.put("verantwortlicher", getVerantwortlicher());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        String aktivitaet = (String) attributes.get("aktivitaet");

        if (aktivitaet != null) {
            setAktivitaet(aktivitaet);
        }

        Date bis_wann = (Date) attributes.get("bis_wann");

        if (bis_wann != null) {
            setBis_wann(bis_wann);
        }

        Long statusbericht_id = (Long) attributes.get("statusbericht_id");

        if (statusbericht_id != null) {
            setStatusbericht_id(statusbericht_id);
        }

        Long verantwortlicher = (Long) attributes.get("verantwortlicher");

        if (verantwortlicher != null) {
            setVerantwortlicher(verantwortlicher);
        }
    }

    @Override
    public long getId() {
        return _id;
    }

    @Override
    public void setId(long id) {
        _id = id;

        if (_statusbericht_geplante_arbeitRemoteModel != null) {
            try {
                Class<?> clazz = _statusbericht_geplante_arbeitRemoteModel.getClass();

                Method method = clazz.getMethod("setId", long.class);

                method.invoke(_statusbericht_geplante_arbeitRemoteModel, id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getAktivitaet() {
        return _aktivitaet;
    }

    @Override
    public void setAktivitaet(String aktivitaet) {
        _aktivitaet = aktivitaet;

        if (_statusbericht_geplante_arbeitRemoteModel != null) {
            try {
                Class<?> clazz = _statusbericht_geplante_arbeitRemoteModel.getClass();

                Method method = clazz.getMethod("setAktivitaet", String.class);

                method.invoke(_statusbericht_geplante_arbeitRemoteModel,
                    aktivitaet);
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

        if (_statusbericht_geplante_arbeitRemoteModel != null) {
            try {
                Class<?> clazz = _statusbericht_geplante_arbeitRemoteModel.getClass();

                Method method = clazz.getMethod("setBis_wann", Date.class);

                method.invoke(_statusbericht_geplante_arbeitRemoteModel,
                    bis_wann);
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

        if (_statusbericht_geplante_arbeitRemoteModel != null) {
            try {
                Class<?> clazz = _statusbericht_geplante_arbeitRemoteModel.getClass();

                Method method = clazz.getMethod("setStatusbericht_id",
                        long.class);

                method.invoke(_statusbericht_geplante_arbeitRemoteModel,
                    statusbericht_id);
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

        if (_statusbericht_geplante_arbeitRemoteModel != null) {
            try {
                Class<?> clazz = _statusbericht_geplante_arbeitRemoteModel.getClass();

                Method method = clazz.getMethod("setVerantwortlicher",
                        long.class);

                method.invoke(_statusbericht_geplante_arbeitRemoteModel,
                    verantwortlicher);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getStatusbericht_geplante_arbeitRemoteModel() {
        return _statusbericht_geplante_arbeitRemoteModel;
    }

    public void setStatusbericht_geplante_arbeitRemoteModel(
        BaseModel<?> statusbericht_geplante_arbeitRemoteModel) {
        _statusbericht_geplante_arbeitRemoteModel = statusbericht_geplante_arbeitRemoteModel;
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

        Class<?> remoteModelClass = _statusbericht_geplante_arbeitRemoteModel.getClass();

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

        Object returnValue = method.invoke(_statusbericht_geplante_arbeitRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            Statusbericht_geplante_arbeitLocalServiceUtil.addStatusbericht_geplante_arbeit(this);
        } else {
            Statusbericht_geplante_arbeitLocalServiceUtil.updateStatusbericht_geplante_arbeit(this);
        }
    }

    @Override
    public Statusbericht_geplante_arbeit toEscapedModel() {
        return (Statusbericht_geplante_arbeit) ProxyUtil.newProxyInstance(Statusbericht_geplante_arbeit.class.getClassLoader(),
            new Class[] { Statusbericht_geplante_arbeit.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        Statusbericht_geplante_arbeitClp clone = new Statusbericht_geplante_arbeitClp();

        clone.setId(getId());
        clone.setAktivitaet(getAktivitaet());
        clone.setBis_wann(getBis_wann());
        clone.setStatusbericht_id(getStatusbericht_id());
        clone.setVerantwortlicher(getVerantwortlicher());

        return clone;
    }

    @Override
    public int compareTo(
        Statusbericht_geplante_arbeit statusbericht_geplante_arbeit) {
        long primaryKey = statusbericht_geplante_arbeit.getPrimaryKey();

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

        if (!(obj instanceof Statusbericht_geplante_arbeitClp)) {
            return false;
        }

        Statusbericht_geplante_arbeitClp statusbericht_geplante_arbeit = (Statusbericht_geplante_arbeitClp) obj;

        long primaryKey = statusbericht_geplante_arbeit.getPrimaryKey();

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
        sb.append(", aktivitaet=");
        sb.append(getAktivitaet());
        sb.append(", bis_wann=");
        sb.append(getBis_wann());
        sb.append(", statusbericht_id=");
        sb.append(getStatusbericht_id());
        sb.append(", verantwortlicher=");
        sb.append(getVerantwortlicher());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(19);

        sb.append("<model><model-name>");
        sb.append(
            "de.hska.wi.awp.datasource.infosys.model.Statusbericht_geplante_arbeit");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>aktivitaet</column-name><column-value><![CDATA[");
        sb.append(getAktivitaet());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>bis_wann</column-name><column-value><![CDATA[");
        sb.append(getBis_wann());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>statusbericht_id</column-name><column-value><![CDATA[");
        sb.append(getStatusbericht_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>verantwortlicher</column-name><column-value><![CDATA[");
        sb.append(getVerantwortlicher());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
