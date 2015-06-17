package de.hska.wi.awp.datasource.infosys.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link de.hska.wi.awp.datasource.infosys.service.http.RolleServiceSoap}.
 *
 * @author Daniel Storch
 * @see de.hska.wi.awp.datasource.infosys.service.http.RolleServiceSoap
 * @generated
 */
public class RolleSoap implements Serializable {
    private long _id;
    private String _shortName;
    private String _name;

    public RolleSoap() {
    }

    public static RolleSoap toSoapModel(Rolle model) {
        RolleSoap soapModel = new RolleSoap();

        soapModel.setId(model.getId());
        soapModel.setShortName(model.getShortName());
        soapModel.setName(model.getName());

        return soapModel;
    }

    public static RolleSoap[] toSoapModels(Rolle[] models) {
        RolleSoap[] soapModels = new RolleSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static RolleSoap[][] toSoapModels(Rolle[][] models) {
        RolleSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new RolleSoap[models.length][models[0].length];
        } else {
            soapModels = new RolleSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static RolleSoap[] toSoapModels(List<Rolle> models) {
        List<RolleSoap> soapModels = new ArrayList<RolleSoap>(models.size());

        for (Rolle model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new RolleSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _id;
    }

    public void setPrimaryKey(long pk) {
        setId(pk);
    }

    public long getId() {
        return _id;
    }

    public void setId(long id) {
        _id = id;
    }

    public String getShortName() {
        return _shortName;
    }

    public void setShortName(String shortName) {
        _shortName = shortName;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }
}
