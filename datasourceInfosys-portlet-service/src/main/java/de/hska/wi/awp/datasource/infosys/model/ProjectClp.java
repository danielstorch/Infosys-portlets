package de.hska.wi.awp.datasource.infosys.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import de.hska.wi.awp.datasource.infosys.service.ClpSerializer;
import de.hska.wi.awp.datasource.infosys.service.ProjectLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class ProjectClp extends BaseModelImpl<Project> implements Project {
    private String _name;
    private String _projecthskaId;
    private long _id;
    private BaseModel<?> _projectRemoteModel;
    private Class<?> _clpSerializerClass = de.hska.wi.awp.datasource.infosys.service.ClpSerializer.class;

    public ProjectClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Project.class;
    }

    @Override
    public String getModelClassName() {
        return Project.class.getName();
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

        attributes.put("name", getName());
        attributes.put("projecthskaId", getProjecthskaId());
        attributes.put("id", getId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        String projecthskaId = (String) attributes.get("projecthskaId");

        if (projecthskaId != null) {
            setProjecthskaId(projecthskaId);
        }

        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }
    }

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public void setName(String name) {
        _name = name;

        if (_projectRemoteModel != null) {
            try {
                Class<?> clazz = _projectRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_projectRemoteModel, name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getProjecthskaId() {
        return _projecthskaId;
    }

    @Override
    public void setProjecthskaId(String projecthskaId) {
        _projecthskaId = projecthskaId;

        if (_projectRemoteModel != null) {
            try {
                Class<?> clazz = _projectRemoteModel.getClass();

                Method method = clazz.getMethod("setProjecthskaId", String.class);

                method.invoke(_projectRemoteModel, projecthskaId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getId() {
        return _id;
    }

    @Override
    public void setId(long id) {
        _id = id;

        if (_projectRemoteModel != null) {
            try {
                Class<?> clazz = _projectRemoteModel.getClass();

                Method method = clazz.getMethod("setId", long.class);

                method.invoke(_projectRemoteModel, id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getProjectRemoteModel() {
        return _projectRemoteModel;
    }

    public void setProjectRemoteModel(BaseModel<?> projectRemoteModel) {
        _projectRemoteModel = projectRemoteModel;
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

        Class<?> remoteModelClass = _projectRemoteModel.getClass();

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

        Object returnValue = method.invoke(_projectRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            ProjectLocalServiceUtil.addProject(this);
        } else {
            ProjectLocalServiceUtil.updateProject(this);
        }
    }

    @Override
    public Project toEscapedModel() {
        return (Project) ProxyUtil.newProxyInstance(Project.class.getClassLoader(),
            new Class[] { Project.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        ProjectClp clone = new ProjectClp();

        clone.setName(getName());
        clone.setProjecthskaId(getProjecthskaId());
        clone.setId(getId());

        return clone;
    }

    @Override
    public int compareTo(Project project) {
        long primaryKey = project.getPrimaryKey();

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

        if (!(obj instanceof ProjectClp)) {
            return false;
        }

        ProjectClp project = (ProjectClp) obj;

        long primaryKey = project.getPrimaryKey();

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

        sb.append("{name=");
        sb.append(getName());
        sb.append(", projecthskaId=");
        sb.append(getProjecthskaId());
        sb.append(", id=");
        sb.append(getId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append("de.hska.wi.awp.datasource.infosys.model.Project");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>projecthskaId</column-name><column-value><![CDATA[");
        sb.append(getProjecthskaId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
