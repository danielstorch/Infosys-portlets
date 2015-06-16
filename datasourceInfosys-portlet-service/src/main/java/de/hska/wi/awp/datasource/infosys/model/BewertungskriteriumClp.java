package de.hska.wi.awp.datasource.infosys.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import de.hska.wi.awp.datasource.infosys.service.BewertungskriteriumLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class BewertungskriteriumClp extends BaseModelImpl<Bewertungskriterium>
    implements Bewertungskriterium {
    private long _id;
    private String _name;
    private String _beschreibung;
    private int _gewichtung;
    private BaseModel<?> _bewertungskriteriumRemoteModel;
    private Class<?> _clpSerializerClass = de.hska.wi.awp.datasource.infosys.service.ClpSerializer.class;

    public BewertungskriteriumClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Bewertungskriterium.class;
    }

    @Override
    public String getModelClassName() {
        return Bewertungskriterium.class.getName();
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
        attributes.put("beschreibung", getBeschreibung());
        attributes.put("gewichtung", getGewichtung());

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

        String beschreibung = (String) attributes.get("beschreibung");

        if (beschreibung != null) {
            setBeschreibung(beschreibung);
        }

        Integer gewichtung = (Integer) attributes.get("gewichtung");

        if (gewichtung != null) {
            setGewichtung(gewichtung);
        }
    }

    @Override
    public long getId() {
        return _id;
    }

    @Override
    public void setId(long id) {
        _id = id;

        if (_bewertungskriteriumRemoteModel != null) {
            try {
                Class<?> clazz = _bewertungskriteriumRemoteModel.getClass();

                Method method = clazz.getMethod("setId", long.class);

                method.invoke(_bewertungskriteriumRemoteModel, id);
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

        if (_bewertungskriteriumRemoteModel != null) {
            try {
                Class<?> clazz = _bewertungskriteriumRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_bewertungskriteriumRemoteModel, name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getBeschreibung() {
        return _beschreibung;
    }

    @Override
    public void setBeschreibung(String beschreibung) {
        _beschreibung = beschreibung;

        if (_bewertungskriteriumRemoteModel != null) {
            try {
                Class<?> clazz = _bewertungskriteriumRemoteModel.getClass();

                Method method = clazz.getMethod("setBeschreibung", String.class);

                method.invoke(_bewertungskriteriumRemoteModel, beschreibung);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getGewichtung() {
        return _gewichtung;
    }

    @Override
    public void setGewichtung(int gewichtung) {
        _gewichtung = gewichtung;

        if (_bewertungskriteriumRemoteModel != null) {
            try {
                Class<?> clazz = _bewertungskriteriumRemoteModel.getClass();

                Method method = clazz.getMethod("setGewichtung", int.class);

                method.invoke(_bewertungskriteriumRemoteModel, gewichtung);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getBewertungskriteriumRemoteModel() {
        return _bewertungskriteriumRemoteModel;
    }

    public void setBewertungskriteriumRemoteModel(
        BaseModel<?> bewertungskriteriumRemoteModel) {
        _bewertungskriteriumRemoteModel = bewertungskriteriumRemoteModel;
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

        Class<?> remoteModelClass = _bewertungskriteriumRemoteModel.getClass();

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

        Object returnValue = method.invoke(_bewertungskriteriumRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            BewertungskriteriumLocalServiceUtil.addBewertungskriterium(this);
        } else {
            BewertungskriteriumLocalServiceUtil.updateBewertungskriterium(this);
        }
    }

    @Override
    public Bewertungskriterium toEscapedModel() {
        return (Bewertungskriterium) ProxyUtil.newProxyInstance(Bewertungskriterium.class.getClassLoader(),
            new Class[] { Bewertungskriterium.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        BewertungskriteriumClp clone = new BewertungskriteriumClp();

        clone.setId(getId());
        clone.setName(getName());
        clone.setBeschreibung(getBeschreibung());
        clone.setGewichtung(getGewichtung());

        return clone;
    }

    @Override
    public int compareTo(Bewertungskriterium bewertungskriterium) {
        long primaryKey = bewertungskriterium.getPrimaryKey();

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

        if (!(obj instanceof BewertungskriteriumClp)) {
            return false;
        }

        BewertungskriteriumClp bewertungskriterium = (BewertungskriteriumClp) obj;

        long primaryKey = bewertungskriterium.getPrimaryKey();

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
        sb.append(", name=");
        sb.append(getName());
        sb.append(", beschreibung=");
        sb.append(getBeschreibung());
        sb.append(", gewichtung=");
        sb.append(getGewichtung());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("de.hska.wi.awp.datasource.infosys.model.Bewertungskriterium");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>beschreibung</column-name><column-value><![CDATA[");
        sb.append(getBeschreibung());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>gewichtung</column-name><column-value><![CDATA[");
        sb.append(getGewichtung());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
