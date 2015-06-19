package de.hska.wi.awp.datasource.infosys.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link de.hska.wi.awp.datasource.infosys.service.http.Statusbericht_detailServiceSoap}.
 *
 * @author Daniel Storch
 * @see de.hska.wi.awp.datasource.infosys.service.http.Statusbericht_detailServiceSoap
 * @generated
 */
public class Statusbericht_detailSoap implements Serializable {
    private long _id;
    private String _text;
    private long _statusbericht_id;
    private long _statusbericht_detail_punkt_id;

    public Statusbericht_detailSoap() {
    }

    public static Statusbericht_detailSoap toSoapModel(
        Statusbericht_detail model) {
        Statusbericht_detailSoap soapModel = new Statusbericht_detailSoap();

        soapModel.setId(model.getId());
        soapModel.setText(model.getText());
        soapModel.setStatusbericht_id(model.getStatusbericht_id());
        soapModel.setStatusbericht_detail_punkt_id(model.getStatusbericht_detail_punkt_id());

        return soapModel;
    }

    public static Statusbericht_detailSoap[] toSoapModels(
        Statusbericht_detail[] models) {
        Statusbericht_detailSoap[] soapModels = new Statusbericht_detailSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static Statusbericht_detailSoap[][] toSoapModels(
        Statusbericht_detail[][] models) {
        Statusbericht_detailSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new Statusbericht_detailSoap[models.length][models[0].length];
        } else {
            soapModels = new Statusbericht_detailSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static Statusbericht_detailSoap[] toSoapModels(
        List<Statusbericht_detail> models) {
        List<Statusbericht_detailSoap> soapModels = new ArrayList<Statusbericht_detailSoap>(models.size());

        for (Statusbericht_detail model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new Statusbericht_detailSoap[soapModels.size()]);
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

    public String getText() {
        return _text;
    }

    public void setText(String text) {
        _text = text;
    }

    public long getStatusbericht_id() {
        return _statusbericht_id;
    }

    public void setStatusbericht_id(long statusbericht_id) {
        _statusbericht_id = statusbericht_id;
    }

    public long getStatusbericht_detail_punkt_id() {
        return _statusbericht_detail_punkt_id;
    }

    public void setStatusbericht_detail_punkt_id(
        long statusbericht_detail_punkt_id) {
        _statusbericht_detail_punkt_id = statusbericht_detail_punkt_id;
    }
}
