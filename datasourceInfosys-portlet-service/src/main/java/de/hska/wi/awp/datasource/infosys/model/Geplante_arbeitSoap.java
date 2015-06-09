package de.hska.wi.awp.datasource.infosys.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link de.hska.wi.awp.datasource.infosys.service.http.Geplante_arbeitServiceSoap}.
 *
 * @author Daniel Storch
 * @see de.hska.wi.awp.datasource.infosys.service.http.Geplante_arbeitServiceSoap
 * @generated
 */
public class Geplante_arbeitSoap implements Serializable {
    private long _id;
    private long _statusbericht_id;
    private long _verantwortlicher;
    private String _arbeit;
    private Date _bis_wann;

    public Geplante_arbeitSoap() {
    }

    public static Geplante_arbeitSoap toSoapModel(Geplante_arbeit model) {
        Geplante_arbeitSoap soapModel = new Geplante_arbeitSoap();

        soapModel.setId(model.getId());
        soapModel.setStatusbericht_id(model.getStatusbericht_id());
        soapModel.setVerantwortlicher(model.getVerantwortlicher());
        soapModel.setArbeit(model.getArbeit());
        soapModel.setBis_wann(model.getBis_wann());

        return soapModel;
    }

    public static Geplante_arbeitSoap[] toSoapModels(Geplante_arbeit[] models) {
        Geplante_arbeitSoap[] soapModels = new Geplante_arbeitSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static Geplante_arbeitSoap[][] toSoapModels(
        Geplante_arbeit[][] models) {
        Geplante_arbeitSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new Geplante_arbeitSoap[models.length][models[0].length];
        } else {
            soapModels = new Geplante_arbeitSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static Geplante_arbeitSoap[] toSoapModels(
        List<Geplante_arbeit> models) {
        List<Geplante_arbeitSoap> soapModels = new ArrayList<Geplante_arbeitSoap>(models.size());

        for (Geplante_arbeit model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new Geplante_arbeitSoap[soapModels.size()]);
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

    public long getStatusbericht_id() {
        return _statusbericht_id;
    }

    public void setStatusbericht_id(long statusbericht_id) {
        _statusbericht_id = statusbericht_id;
    }

    public long getVerantwortlicher() {
        return _verantwortlicher;
    }

    public void setVerantwortlicher(long verantwortlicher) {
        _verantwortlicher = verantwortlicher;
    }

    public String getArbeit() {
        return _arbeit;
    }

    public void setArbeit(String arbeit) {
        _arbeit = arbeit;
    }

    public Date getBis_wann() {
        return _bis_wann;
    }

    public void setBis_wann(Date bis_wann) {
        _bis_wann = bis_wann;
    }
}
