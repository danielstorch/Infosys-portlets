package de.hska.wi.awp.datasource.infosys.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import de.hska.wi.awp.datasource.infosys.model.Rolle;
import de.hska.wi.awp.datasource.infosys.model.RolleModel;
import de.hska.wi.awp.datasource.infosys.model.RolleSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Rolle service. Represents a row in the &quot;datasourceInfosys_Rolle&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link de.hska.wi.awp.datasource.infosys.model.RolleModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link RolleImpl}.
 * </p>
 *
 * @author Daniel Storch
 * @see RolleImpl
 * @see de.hska.wi.awp.datasource.infosys.model.Rolle
 * @see de.hska.wi.awp.datasource.infosys.model.RolleModel
 * @generated
 */
@JSON(strict = true)
public class RolleModelImpl extends BaseModelImpl<Rolle> implements RolleModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a rolle model instance should use the {@link de.hska.wi.awp.datasource.infosys.model.Rolle} interface instead.
     */
    public static final String TABLE_NAME = "datasourceInfosys_Rolle";
    public static final Object[][] TABLE_COLUMNS = {
            { "id_", Types.BIGINT },
            { "shortName", Types.VARCHAR },
            { "name", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table datasourceInfosys_Rolle (id_ LONG not null primary key,shortName VARCHAR(75) null,name VARCHAR(75) null)";
    public static final String TABLE_SQL_DROP = "drop table datasourceInfosys_Rolle";
    public static final String ORDER_BY_JPQL = " ORDER BY rolle.id ASC";
    public static final String ORDER_BY_SQL = " ORDER BY datasourceInfosys_Rolle.id_ ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.de.hska.wi.awp.datasource.infosys.model.Rolle"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.de.hska.wi.awp.datasource.infosys.model.Rolle"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.de.hska.wi.awp.datasource.infosys.model.Rolle"));
    private static ClassLoader _classLoader = Rolle.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] { Rolle.class };
    private long _id;
    private String _shortName;
    private String _name;
    private Rolle _escapedModel;

    public RolleModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static Rolle toModel(RolleSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        Rolle model = new RolleImpl();

        model.setId(soapModel.getId());
        model.setShortName(soapModel.getShortName());
        model.setName(soapModel.getName());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<Rolle> toModels(RolleSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<Rolle> models = new ArrayList<Rolle>(soapModels.length);

        for (RolleSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
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
    public Class<?> getModelClass() {
        return Rolle.class;
    }

    @Override
    public String getModelClassName() {
        return Rolle.class.getName();
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

    @JSON
    @Override
    public long getId() {
        return _id;
    }

    @Override
    public void setId(long id) {
        _id = id;
    }

    @JSON
    @Override
    public String getShortName() {
        if (_shortName == null) {
            return StringPool.BLANK;
        } else {
            return _shortName;
        }
    }

    @Override
    public void setShortName(String shortName) {
        _shortName = shortName;
    }

    @JSON
    @Override
    public String getName() {
        if (_name == null) {
            return StringPool.BLANK;
        } else {
            return _name;
        }
    }

    @Override
    public void setName(String name) {
        _name = name;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            Rolle.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public Rolle toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (Rolle) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        RolleImpl rolleImpl = new RolleImpl();

        rolleImpl.setId(getId());
        rolleImpl.setShortName(getShortName());
        rolleImpl.setName(getName());

        rolleImpl.resetOriginalValues();

        return rolleImpl;
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

        if (!(obj instanceof Rolle)) {
            return false;
        }

        Rolle rolle = (Rolle) obj;

        long primaryKey = rolle.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
    }

    @Override
    public CacheModel<Rolle> toCacheModel() {
        RolleCacheModel rolleCacheModel = new RolleCacheModel();

        rolleCacheModel.id = getId();

        rolleCacheModel.shortName = getShortName();

        String shortName = rolleCacheModel.shortName;

        if ((shortName != null) && (shortName.length() == 0)) {
            rolleCacheModel.shortName = null;
        }

        rolleCacheModel.name = getName();

        String name = rolleCacheModel.name;

        if ((name != null) && (name.length() == 0)) {
            rolleCacheModel.name = null;
        }

        return rolleCacheModel;
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
