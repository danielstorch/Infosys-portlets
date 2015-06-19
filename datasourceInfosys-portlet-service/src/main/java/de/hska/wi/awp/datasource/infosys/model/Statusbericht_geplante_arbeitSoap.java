package de.hska.wi.awp.datasource.infosys.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link de.hska.wi.awp.datasource.infosys.service.http.Statusbericht_geplante_arbeitServiceSoap}.
 *
 * @author Daniel Storch
 * @see de.hska.wi.awp.datasource.infosys.service.http.Statusbericht_geplante_arbeitServiceSoap
 * @generated
 */
public class Statusbericht_geplante_arbeitSoap implements Serializable {
    private long _id;
    private String _aktivitaet;
    private Date _bis_wann;
    private long _statusbericht_id;
    private long _verantwortlicher;

    public Statusbericht_geplante_arbeitSoap() {
    }

    public static Statusbericht_geplante_arbeitSoap toSoapModel(
        Statusbericht_geplante_arbeit model) {
        Statusbericht_geplante_arbeitSoap soapModel = new Statusbericht_geplante_arbeitSoap();

        soapModel.setId(model.getId());
        soapModel.setAktivitaet(model.getAktivitaet());
        soapModel.setBis_wann(model.getBis_wann());
        soapModel.setStatusbericht_id(model.getStatusbericht_id());
        soapModel.setVerantwortlicher(model.getVerantwortlicher());

        return soapModel;
    }

    public static Statusbericht_geplante_arbeitSoap[] toSoapModels(
        Statusbericht_geplante_arbeit[] models) {
        Statusbericht_geplante_arbeitSoap[] soapModels = new Statusbericht_geplante_arbeitSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static Statusbericht_geplante_arbeitSoap[][] toSoapModels(
        Statusbericht_geplante_arbeit[][] models) {
        Statusbericht_geplante_arbeitSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new Statusbericht_geplante_arbeitSoap[models.length][models[0].length];
        } else {
            soapModels = new Statusbericht_geplante_arbeitSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static Statusbericht_geplante_arbeitSoap[] toSoapModels(
        List<Statusbericht_geplante_arbeit> models) {
        List<Statusbericht_geplante_arbeitSoap> soapModels = new ArrayList<Statusbericht_geplante_arbeitSoap>(models.size());

        for (Statusbericht_geplante_arbeit model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new Statusbericht_geplante_arbeitSoap[soapModels.size()]);
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

    public String getAktivitaet() {
        return _aktivitaet;
    }

    public void setAktivitaet(String aktivitaet) {
        _aktivitaet = aktivitaet;
    }

    public Date getBis_wann() {
        return _bis_wann;
    }

    public void setBis_wann(Date bis_wann) {
        _bis_wann = bis_wann;
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
}
