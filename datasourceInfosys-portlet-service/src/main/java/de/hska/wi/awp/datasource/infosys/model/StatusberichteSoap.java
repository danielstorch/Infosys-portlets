package de.hska.wi.awp.datasource.infosys.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link de.hska.wi.awp.datasource.infosys.service.http.StatusberichteServiceSoap}.
 *
 * @author Daniel Storch
 * @see de.hska.wi.awp.datasource.infosys.service.http.StatusberichteServiceSoap
 * @generated
 */
public class StatusberichteSoap implements Serializable {
    private long _id;
    private long _project_id;
    private Date _datum;
    private int _kalenderwoche;

    public StatusberichteSoap() {
    }

    public static StatusberichteSoap toSoapModel(Statusberichte model) {
        StatusberichteSoap soapModel = new StatusberichteSoap();

        soapModel.setId(model.getId());
        soapModel.setProject_id(model.getProject_id());
        soapModel.setDatum(model.getDatum());
        soapModel.setKalenderwoche(model.getKalenderwoche());

        return soapModel;
    }

    public static StatusberichteSoap[] toSoapModels(Statusberichte[] models) {
        StatusberichteSoap[] soapModels = new StatusberichteSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static StatusberichteSoap[][] toSoapModels(Statusberichte[][] models) {
        StatusberichteSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new StatusberichteSoap[models.length][models[0].length];
        } else {
            soapModels = new StatusberichteSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static StatusberichteSoap[] toSoapModels(List<Statusberichte> models) {
        List<StatusberichteSoap> soapModels = new ArrayList<StatusberichteSoap>(models.size());

        for (Statusberichte model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new StatusberichteSoap[soapModels.size()]);
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

    public long getProject_id() {
        return _project_id;
    }

    public void setProject_id(long project_id) {
        _project_id = project_id;
    }

    public Date getDatum() {
        return _datum;
    }

    public void setDatum(Date datum) {
        _datum = datum;
    }

    public int getKalenderwoche() {
        return _kalenderwoche;
    }

    public void setKalenderwoche(int kalenderwoche) {
        _kalenderwoche = kalenderwoche;
    }
}
