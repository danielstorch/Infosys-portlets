package de.hska.wi.awp.datasource.infosys.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import de.hska.wi.awp.datasource.infosys.service.ClpSerializer;
import de.hska.wi.awp.datasource.infosys.service.StatusueberblickLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class StatusueberblickClp extends BaseModelImpl<Statusueberblick>
    implements Statusueberblick {
    private long _id;
    private long _statusbericht_id;
    private String _qualitaet_status;
    private String _qualitaet_text;
    private String _kosten_text;
    private String _kosten_status;
    private String _aufwand_status;
    private String _aufwand_text;
    private String _termine_status;
    private String _termine_text;
    private BaseModel<?> _statusueberblickRemoteModel;
    private Class<?> _clpSerializerClass = de.hska.wi.awp.datasource.infosys.service.ClpSerializer.class;

    public StatusueberblickClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Statusueberblick.class;
    }

    @Override
    public String getModelClassName() {
        return Statusueberblick.class.getName();
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
        attributes.put("qualitaet_status", getQualitaet_status());
        attributes.put("qualitaet_text", getQualitaet_text());
        attributes.put("kosten_text", getKosten_text());
        attributes.put("kosten_status", getKosten_status());
        attributes.put("aufwand_status", getAufwand_status());
        attributes.put("aufwand_text", getAufwand_text());
        attributes.put("termine_status", getTermine_status());
        attributes.put("termine_text", getTermine_text());

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

        String qualitaet_status = (String) attributes.get("qualitaet_status");

        if (qualitaet_status != null) {
            setQualitaet_status(qualitaet_status);
        }

        String qualitaet_text = (String) attributes.get("qualitaet_text");

        if (qualitaet_text != null) {
            setQualitaet_text(qualitaet_text);
        }

        String kosten_text = (String) attributes.get("kosten_text");

        if (kosten_text != null) {
            setKosten_text(kosten_text);
        }

        String kosten_status = (String) attributes.get("kosten_status");

        if (kosten_status != null) {
            setKosten_status(kosten_status);
        }

        String aufwand_status = (String) attributes.get("aufwand_status");

        if (aufwand_status != null) {
            setAufwand_status(aufwand_status);
        }

        String aufwand_text = (String) attributes.get("aufwand_text");

        if (aufwand_text != null) {
            setAufwand_text(aufwand_text);
        }

        String termine_status = (String) attributes.get("termine_status");

        if (termine_status != null) {
            setTermine_status(termine_status);
        }

        String termine_text = (String) attributes.get("termine_text");

        if (termine_text != null) {
            setTermine_text(termine_text);
        }
    }

    @Override
    public long getId() {
        return _id;
    }

    @Override
    public void setId(long id) {
        _id = id;

        if (_statusueberblickRemoteModel != null) {
            try {
                Class<?> clazz = _statusueberblickRemoteModel.getClass();

                Method method = clazz.getMethod("setId", long.class);

                method.invoke(_statusueberblickRemoteModel, id);
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

        if (_statusueberblickRemoteModel != null) {
            try {
                Class<?> clazz = _statusueberblickRemoteModel.getClass();

                Method method = clazz.getMethod("setStatusbericht_id",
                        long.class);

                method.invoke(_statusueberblickRemoteModel, statusbericht_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getQualitaet_status() {
        return _qualitaet_status;
    }

    @Override
    public void setQualitaet_status(String qualitaet_status) {
        _qualitaet_status = qualitaet_status;

        if (_statusueberblickRemoteModel != null) {
            try {
                Class<?> clazz = _statusueberblickRemoteModel.getClass();

                Method method = clazz.getMethod("setQualitaet_status",
                        String.class);

                method.invoke(_statusueberblickRemoteModel, qualitaet_status);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getQualitaet_text() {
        return _qualitaet_text;
    }

    @Override
    public void setQualitaet_text(String qualitaet_text) {
        _qualitaet_text = qualitaet_text;

        if (_statusueberblickRemoteModel != null) {
            try {
                Class<?> clazz = _statusueberblickRemoteModel.getClass();

                Method method = clazz.getMethod("setQualitaet_text",
                        String.class);

                method.invoke(_statusueberblickRemoteModel, qualitaet_text);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getKosten_text() {
        return _kosten_text;
    }

    @Override
    public void setKosten_text(String kosten_text) {
        _kosten_text = kosten_text;

        if (_statusueberblickRemoteModel != null) {
            try {
                Class<?> clazz = _statusueberblickRemoteModel.getClass();

                Method method = clazz.getMethod("setKosten_text", String.class);

                method.invoke(_statusueberblickRemoteModel, kosten_text);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getKosten_status() {
        return _kosten_status;
    }

    @Override
    public void setKosten_status(String kosten_status) {
        _kosten_status = kosten_status;

        if (_statusueberblickRemoteModel != null) {
            try {
                Class<?> clazz = _statusueberblickRemoteModel.getClass();

                Method method = clazz.getMethod("setKosten_status", String.class);

                method.invoke(_statusueberblickRemoteModel, kosten_status);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getAufwand_status() {
        return _aufwand_status;
    }

    @Override
    public void setAufwand_status(String aufwand_status) {
        _aufwand_status = aufwand_status;

        if (_statusueberblickRemoteModel != null) {
            try {
                Class<?> clazz = _statusueberblickRemoteModel.getClass();

                Method method = clazz.getMethod("setAufwand_status",
                        String.class);

                method.invoke(_statusueberblickRemoteModel, aufwand_status);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getAufwand_text() {
        return _aufwand_text;
    }

    @Override
    public void setAufwand_text(String aufwand_text) {
        _aufwand_text = aufwand_text;

        if (_statusueberblickRemoteModel != null) {
            try {
                Class<?> clazz = _statusueberblickRemoteModel.getClass();

                Method method = clazz.getMethod("setAufwand_text", String.class);

                method.invoke(_statusueberblickRemoteModel, aufwand_text);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getTermine_status() {
        return _termine_status;
    }

    @Override
    public void setTermine_status(String termine_status) {
        _termine_status = termine_status;

        if (_statusueberblickRemoteModel != null) {
            try {
                Class<?> clazz = _statusueberblickRemoteModel.getClass();

                Method method = clazz.getMethod("setTermine_status",
                        String.class);

                method.invoke(_statusueberblickRemoteModel, termine_status);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getTermine_text() {
        return _termine_text;
    }

    @Override
    public void setTermine_text(String termine_text) {
        _termine_text = termine_text;

        if (_statusueberblickRemoteModel != null) {
            try {
                Class<?> clazz = _statusueberblickRemoteModel.getClass();

                Method method = clazz.getMethod("setTermine_text", String.class);

                method.invoke(_statusueberblickRemoteModel, termine_text);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getStatusueberblickRemoteModel() {
        return _statusueberblickRemoteModel;
    }

    public void setStatusueberblickRemoteModel(
        BaseModel<?> statusueberblickRemoteModel) {
        _statusueberblickRemoteModel = statusueberblickRemoteModel;
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

        Class<?> remoteModelClass = _statusueberblickRemoteModel.getClass();

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

        Object returnValue = method.invoke(_statusueberblickRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            StatusueberblickLocalServiceUtil.addStatusueberblick(this);
        } else {
            StatusueberblickLocalServiceUtil.updateStatusueberblick(this);
        }
    }

    @Override
    public Statusueberblick toEscapedModel() {
        return (Statusueberblick) ProxyUtil.newProxyInstance(Statusueberblick.class.getClassLoader(),
            new Class[] { Statusueberblick.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        StatusueberblickClp clone = new StatusueberblickClp();

        clone.setId(getId());
        clone.setStatusbericht_id(getStatusbericht_id());
        clone.setQualitaet_status(getQualitaet_status());
        clone.setQualitaet_text(getQualitaet_text());
        clone.setKosten_text(getKosten_text());
        clone.setKosten_status(getKosten_status());
        clone.setAufwand_status(getAufwand_status());
        clone.setAufwand_text(getAufwand_text());
        clone.setTermine_status(getTermine_status());
        clone.setTermine_text(getTermine_text());

        return clone;
    }

    @Override
    public int compareTo(Statusueberblick statusueberblick) {
        long primaryKey = statusueberblick.getPrimaryKey();

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

        if (!(obj instanceof StatusueberblickClp)) {
            return false;
        }

        StatusueberblickClp statusueberblick = (StatusueberblickClp) obj;

        long primaryKey = statusueberblick.getPrimaryKey();

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
        StringBundler sb = new StringBundler(21);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", statusbericht_id=");
        sb.append(getStatusbericht_id());
        sb.append(", qualitaet_status=");
        sb.append(getQualitaet_status());
        sb.append(", qualitaet_text=");
        sb.append(getQualitaet_text());
        sb.append(", kosten_text=");
        sb.append(getKosten_text());
        sb.append(", kosten_status=");
        sb.append(getKosten_status());
        sb.append(", aufwand_status=");
        sb.append(getAufwand_status());
        sb.append(", aufwand_text=");
        sb.append(getAufwand_text());
        sb.append(", termine_status=");
        sb.append(getTermine_status());
        sb.append(", termine_text=");
        sb.append(getTermine_text());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(34);

        sb.append("<model><model-name>");
        sb.append("de.hska.wi.awp.datasource.infosys.model.Statusueberblick");
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
            "<column><column-name>qualitaet_status</column-name><column-value><![CDATA[");
        sb.append(getQualitaet_status());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>qualitaet_text</column-name><column-value><![CDATA[");
        sb.append(getQualitaet_text());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>kosten_text</column-name><column-value><![CDATA[");
        sb.append(getKosten_text());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>kosten_status</column-name><column-value><![CDATA[");
        sb.append(getKosten_status());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>aufwand_status</column-name><column-value><![CDATA[");
        sb.append(getAufwand_status());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>aufwand_text</column-name><column-value><![CDATA[");
        sb.append(getAufwand_text());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>termine_status</column-name><column-value><![CDATA[");
        sb.append(getTermine_status());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>termine_text</column-name><column-value><![CDATA[");
        sb.append(getTermine_text());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
