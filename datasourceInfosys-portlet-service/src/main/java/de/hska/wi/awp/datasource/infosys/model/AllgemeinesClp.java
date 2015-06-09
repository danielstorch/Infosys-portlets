package de.hska.wi.awp.datasource.infosys.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import de.hska.wi.awp.datasource.infosys.service.AllgemeinesLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class AllgemeinesClp extends BaseModelImpl<Allgemeines>
    implements Allgemeines {
    private long _id;
    private long _statusbricht_id;
    private String _probleme_risiken;
    private String _massnahmen;
    private String _situation;
    private String _gruende;
    private BaseModel<?> _allgemeinesRemoteModel;
    private Class<?> _clpSerializerClass = de.hska.wi.awp.datasource.infosys.service.ClpSerializer.class;

    public AllgemeinesClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Allgemeines.class;
    }

    @Override
    public String getModelClassName() {
        return Allgemeines.class.getName();
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
        attributes.put("statusbricht_id", getStatusbricht_id());
        attributes.put("probleme_risiken", getProbleme_risiken());
        attributes.put("massnahmen", getMassnahmen());
        attributes.put("situation", getSituation());
        attributes.put("gruende", getGruende());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        Long statusbricht_id = (Long) attributes.get("statusbricht_id");

        if (statusbricht_id != null) {
            setStatusbricht_id(statusbricht_id);
        }

        String probleme_risiken = (String) attributes.get("probleme_risiken");

        if (probleme_risiken != null) {
            setProbleme_risiken(probleme_risiken);
        }

        String massnahmen = (String) attributes.get("massnahmen");

        if (massnahmen != null) {
            setMassnahmen(massnahmen);
        }

        String situation = (String) attributes.get("situation");

        if (situation != null) {
            setSituation(situation);
        }

        String gruende = (String) attributes.get("gruende");

        if (gruende != null) {
            setGruende(gruende);
        }
    }

    @Override
    public long getId() {
        return _id;
    }

    @Override
    public void setId(long id) {
        _id = id;

        if (_allgemeinesRemoteModel != null) {
            try {
                Class<?> clazz = _allgemeinesRemoteModel.getClass();

                Method method = clazz.getMethod("setId", long.class);

                method.invoke(_allgemeinesRemoteModel, id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getStatusbricht_id() {
        return _statusbricht_id;
    }

    @Override
    public void setStatusbricht_id(long statusbricht_id) {
        _statusbricht_id = statusbricht_id;

        if (_allgemeinesRemoteModel != null) {
            try {
                Class<?> clazz = _allgemeinesRemoteModel.getClass();

                Method method = clazz.getMethod("setStatusbricht_id", long.class);

                method.invoke(_allgemeinesRemoteModel, statusbricht_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getProbleme_risiken() {
        return _probleme_risiken;
    }

    @Override
    public void setProbleme_risiken(String probleme_risiken) {
        _probleme_risiken = probleme_risiken;

        if (_allgemeinesRemoteModel != null) {
            try {
                Class<?> clazz = _allgemeinesRemoteModel.getClass();

                Method method = clazz.getMethod("setProbleme_risiken",
                        String.class);

                method.invoke(_allgemeinesRemoteModel, probleme_risiken);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getMassnahmen() {
        return _massnahmen;
    }

    @Override
    public void setMassnahmen(String massnahmen) {
        _massnahmen = massnahmen;

        if (_allgemeinesRemoteModel != null) {
            try {
                Class<?> clazz = _allgemeinesRemoteModel.getClass();

                Method method = clazz.getMethod("setMassnahmen", String.class);

                method.invoke(_allgemeinesRemoteModel, massnahmen);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getSituation() {
        return _situation;
    }

    @Override
    public void setSituation(String situation) {
        _situation = situation;

        if (_allgemeinesRemoteModel != null) {
            try {
                Class<?> clazz = _allgemeinesRemoteModel.getClass();

                Method method = clazz.getMethod("setSituation", String.class);

                method.invoke(_allgemeinesRemoteModel, situation);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getGruende() {
        return _gruende;
    }

    @Override
    public void setGruende(String gruende) {
        _gruende = gruende;

        if (_allgemeinesRemoteModel != null) {
            try {
                Class<?> clazz = _allgemeinesRemoteModel.getClass();

                Method method = clazz.getMethod("setGruende", String.class);

                method.invoke(_allgemeinesRemoteModel, gruende);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getAllgemeinesRemoteModel() {
        return _allgemeinesRemoteModel;
    }

    public void setAllgemeinesRemoteModel(BaseModel<?> allgemeinesRemoteModel) {
        _allgemeinesRemoteModel = allgemeinesRemoteModel;
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

        Class<?> remoteModelClass = _allgemeinesRemoteModel.getClass();

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

        Object returnValue = method.invoke(_allgemeinesRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            AllgemeinesLocalServiceUtil.addAllgemeines(this);
        } else {
            AllgemeinesLocalServiceUtil.updateAllgemeines(this);
        }
    }

    @Override
    public Allgemeines toEscapedModel() {
        return (Allgemeines) ProxyUtil.newProxyInstance(Allgemeines.class.getClassLoader(),
            new Class[] { Allgemeines.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        AllgemeinesClp clone = new AllgemeinesClp();

        clone.setId(getId());
        clone.setStatusbricht_id(getStatusbricht_id());
        clone.setProbleme_risiken(getProbleme_risiken());
        clone.setMassnahmen(getMassnahmen());
        clone.setSituation(getSituation());
        clone.setGruende(getGruende());

        return clone;
    }

    @Override
    public int compareTo(Allgemeines allgemeines) {
        long primaryKey = allgemeines.getPrimaryKey();

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

        if (!(obj instanceof AllgemeinesClp)) {
            return false;
        }

        AllgemeinesClp allgemeines = (AllgemeinesClp) obj;

        long primaryKey = allgemeines.getPrimaryKey();

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
        StringBundler sb = new StringBundler(13);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", statusbricht_id=");
        sb.append(getStatusbricht_id());
        sb.append(", probleme_risiken=");
        sb.append(getProbleme_risiken());
        sb.append(", massnahmen=");
        sb.append(getMassnahmen());
        sb.append(", situation=");
        sb.append(getSituation());
        sb.append(", gruende=");
        sb.append(getGruende());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(22);

        sb.append("<model><model-name>");
        sb.append("de.hska.wi.awp.datasource.infosys.model.Allgemeines");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>statusbricht_id</column-name><column-value><![CDATA[");
        sb.append(getStatusbricht_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>probleme_risiken</column-name><column-value><![CDATA[");
        sb.append(getProbleme_risiken());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>massnahmen</column-name><column-value><![CDATA[");
        sb.append(getMassnahmen());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>situation</column-name><column-value><![CDATA[");
        sb.append(getSituation());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>gruende</column-name><column-value><![CDATA[");
        sb.append(getGruende());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
