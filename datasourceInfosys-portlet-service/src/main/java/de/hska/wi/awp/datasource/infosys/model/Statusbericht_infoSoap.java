package de.hska.wi.awp.datasource.infosys.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link de.hska.wi.awp.datasource.infosys.service.http.Statusbericht_infoServiceSoap}.
 *
 * @author Daniel Storch
 * @see de.hska.wi.awp.datasource.infosys.service.http.Statusbericht_infoServiceSoap
 * @generated
 */
public class Statusbericht_infoSoap implements Serializable {
    private long _id;
    private String _bemerkung;
    private int _status;
    private long _statusbericht_id;
    private long _statusbericht_info_punkt_id;

    public Statusbericht_infoSoap() {
    }

    public static Statusbericht_infoSoap toSoapModel(Statusbericht_info model) {
        Statusbericht_infoSoap soapModel = new Statusbericht_infoSoap();

        soapModel.setId(model.getId());
        soapModel.setBemerkung(model.getBemerkung());
        soapModel.setStatus(model.getStatus());
        soapModel.setStatusbericht_id(model.getStatusbericht_id());
        soapModel.setStatusbericht_info_punkt_id(model.getStatusbericht_info_punkt_id());

        return soapModel;
    }

    public static Statusbericht_infoSoap[] toSoapModels(
        Statusbericht_info[] models) {
        Statusbericht_infoSoap[] soapModels = new Statusbericht_infoSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static Statusbericht_infoSoap[][] toSoapModels(
        Statusbericht_info[][] models) {
        Statusbericht_infoSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new Statusbericht_infoSoap[models.length][models[0].length];
        } else {
            soapModels = new Statusbericht_infoSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static Statusbericht_infoSoap[] toSoapModels(
        List<Statusbericht_info> models) {
        List<Statusbericht_infoSoap> soapModels = new ArrayList<Statusbericht_infoSoap>(models.size());

        for (Statusbericht_info model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new Statusbericht_infoSoap[soapModels.size()]);
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

    public String getBemerkung() {
        return _bemerkung;
    }

    public void setBemerkung(String bemerkung) {
        _bemerkung = bemerkung;
    }

    public int getStatus() {
        return _status;
    }

    public void setStatus(int status) {
        _status = status;
    }

    public long getStatusbericht_id() {
        return _statusbericht_id;
    }

    public void setStatusbericht_id(long statusbericht_id) {
        _statusbericht_id = statusbericht_id;
    }

    public long getStatusbericht_info_punkt_id() {
        return _statusbericht_info_punkt_id;
    }

    public void setStatusbericht_info_punkt_id(long statusbericht_info_punkt_id) {
        _statusbericht_info_punkt_id = statusbericht_info_punkt_id;
    }
}
