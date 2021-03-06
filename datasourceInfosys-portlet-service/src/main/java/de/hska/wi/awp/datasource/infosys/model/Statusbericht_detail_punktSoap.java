package de.hska.wi.awp.datasource.infosys.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link de.hska.wi.awp.datasource.infosys.service.http.Statusbericht_detail_punktServiceSoap}.
 *
 * @author Daniel Storch
 * @see de.hska.wi.awp.datasource.infosys.service.http.Statusbericht_detail_punktServiceSoap
 * @generated
 */
public class Statusbericht_detail_punktSoap implements Serializable {
    private long _id;
    private String _name;

    public Statusbericht_detail_punktSoap() {
    }

    public static Statusbericht_detail_punktSoap toSoapModel(
        Statusbericht_detail_punkt model) {
        Statusbericht_detail_punktSoap soapModel = new Statusbericht_detail_punktSoap();

        soapModel.setId(model.getId());
        soapModel.setName(model.getName());

        return soapModel;
    }

    public static Statusbericht_detail_punktSoap[] toSoapModels(
        Statusbericht_detail_punkt[] models) {
        Statusbericht_detail_punktSoap[] soapModels = new Statusbericht_detail_punktSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static Statusbericht_detail_punktSoap[][] toSoapModels(
        Statusbericht_detail_punkt[][] models) {
        Statusbericht_detail_punktSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new Statusbericht_detail_punktSoap[models.length][models[0].length];
        } else {
            soapModels = new Statusbericht_detail_punktSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static Statusbericht_detail_punktSoap[] toSoapModels(
        List<Statusbericht_detail_punkt> models) {
        List<Statusbericht_detail_punktSoap> soapModels = new ArrayList<Statusbericht_detail_punktSoap>(models.size());

        for (Statusbericht_detail_punkt model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new Statusbericht_detail_punktSoap[soapModels.size()]);
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

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }
}
