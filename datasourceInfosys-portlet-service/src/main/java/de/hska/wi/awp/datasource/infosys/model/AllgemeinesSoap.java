package de.hska.wi.awp.datasource.infosys.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link de.hska.wi.awp.datasource.infosys.service.http.AllgemeinesServiceSoap}.
 *
 * @author Daniel Storch
 * @see de.hska.wi.awp.datasource.infosys.service.http.AllgemeinesServiceSoap
 * @generated
 */
public class AllgemeinesSoap implements Serializable {
    private long _id;
    private long _statusbericht_id;
    private String _probleme_risiken;
    private String _massnahmen;
    private String _situation;
    private String _gruende;

    public AllgemeinesSoap() {
    }

    public static AllgemeinesSoap toSoapModel(Allgemeines model) {
        AllgemeinesSoap soapModel = new AllgemeinesSoap();

        soapModel.setId(model.getId());
        soapModel.setStatusbericht_id(model.getStatusbericht_id());
        soapModel.setProbleme_risiken(model.getProbleme_risiken());
        soapModel.setMassnahmen(model.getMassnahmen());
        soapModel.setSituation(model.getSituation());
        soapModel.setGruende(model.getGruende());

        return soapModel;
    }

    public static AllgemeinesSoap[] toSoapModels(Allgemeines[] models) {
        AllgemeinesSoap[] soapModels = new AllgemeinesSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static AllgemeinesSoap[][] toSoapModels(Allgemeines[][] models) {
        AllgemeinesSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new AllgemeinesSoap[models.length][models[0].length];
        } else {
            soapModels = new AllgemeinesSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static AllgemeinesSoap[] toSoapModels(List<Allgemeines> models) {
        List<AllgemeinesSoap> soapModels = new ArrayList<AllgemeinesSoap>(models.size());

        for (Allgemeines model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new AllgemeinesSoap[soapModels.size()]);
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

    public String getProbleme_risiken() {
        return _probleme_risiken;
    }

    public void setProbleme_risiken(String probleme_risiken) {
        _probleme_risiken = probleme_risiken;
    }

    public String getMassnahmen() {
        return _massnahmen;
    }

    public void setMassnahmen(String massnahmen) {
        _massnahmen = massnahmen;
    }

    public String getSituation() {
        return _situation;
    }

    public void setSituation(String situation) {
        _situation = situation;
    }

    public String getGruende() {
        return _gruende;
    }

    public void setGruende(String gruende) {
        _gruende = gruende;
    }
}
