package de.hska.wi.awp.datasource.infosys.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link de.hska.wi.awp.datasource.infosys.service.http.StatusueberblickServiceSoap}.
 *
 * @author Daniel Storch
 * @see de.hska.wi.awp.datasource.infosys.service.http.StatusueberblickServiceSoap
 * @generated
 */
public class StatusueberblickSoap implements Serializable {
    private long _id;
    private long _statusbericht_id;
    private String _qualitaet_status;
    private String _qualitaet_text;
    private String _kosten_text;
    private String _kosten_status;
    private String _aufwand_status;
    private String _aufwand_text;
    private String _termine_status;
    private String _termine_text;

    public StatusueberblickSoap() {
    }

    public static StatusueberblickSoap toSoapModel(Statusueberblick model) {
        StatusueberblickSoap soapModel = new StatusueberblickSoap();

        soapModel.setId(model.getId());
        soapModel.setStatusbericht_id(model.getStatusbericht_id());
        soapModel.setQualitaet_status(model.getQualitaet_status());
        soapModel.setQualitaet_text(model.getQualitaet_text());
        soapModel.setKosten_text(model.getKosten_text());
        soapModel.setKosten_status(model.getKosten_status());
        soapModel.setAufwand_status(model.getAufwand_status());
        soapModel.setAufwand_text(model.getAufwand_text());
        soapModel.setTermine_status(model.getTermine_status());
        soapModel.setTermine_text(model.getTermine_text());

        return soapModel;
    }

    public static StatusueberblickSoap[] toSoapModels(Statusueberblick[] models) {
        StatusueberblickSoap[] soapModels = new StatusueberblickSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static StatusueberblickSoap[][] toSoapModels(
        Statusueberblick[][] models) {
        StatusueberblickSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new StatusueberblickSoap[models.length][models[0].length];
        } else {
            soapModels = new StatusueberblickSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static StatusueberblickSoap[] toSoapModels(
        List<Statusueberblick> models) {
        List<StatusueberblickSoap> soapModels = new ArrayList<StatusueberblickSoap>(models.size());

        for (Statusueberblick model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new StatusueberblickSoap[soapModels.size()]);
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

    public String getQualitaet_status() {
        return _qualitaet_status;
    }

    public void setQualitaet_status(String qualitaet_status) {
        _qualitaet_status = qualitaet_status;
    }

    public String getQualitaet_text() {
        return _qualitaet_text;
    }

    public void setQualitaet_text(String qualitaet_text) {
        _qualitaet_text = qualitaet_text;
    }

    public String getKosten_text() {
        return _kosten_text;
    }

    public void setKosten_text(String kosten_text) {
        _kosten_text = kosten_text;
    }

    public String getKosten_status() {
        return _kosten_status;
    }

    public void setKosten_status(String kosten_status) {
        _kosten_status = kosten_status;
    }

    public String getAufwand_status() {
        return _aufwand_status;
    }

    public void setAufwand_status(String aufwand_status) {
        _aufwand_status = aufwand_status;
    }

    public String getAufwand_text() {
        return _aufwand_text;
    }

    public void setAufwand_text(String aufwand_text) {
        _aufwand_text = aufwand_text;
    }

    public String getTermine_status() {
        return _termine_status;
    }

    public void setTermine_status(String termine_status) {
        _termine_status = termine_status;
    }

    public String getTermine_text() {
        return _termine_text;
    }

    public void setTermine_text(String termine_text) {
        _termine_text = termine_text;
    }
}
