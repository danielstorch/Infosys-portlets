package de.hska.wi.awp.datasource.infosys.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link de.hska.wi.awp.datasource.infosys.service.http.TeilnoteServiceSoap}.
 *
 * @author Daniel Storch
 * @see de.hska.wi.awp.datasource.infosys.service.http.TeilnoteServiceSoap
 * @generated
 */
public class TeilnoteSoap implements Serializable {
    private long _id;
    private long _feedback_id;
    private int _note;
    private long _kategorie;

    public TeilnoteSoap() {
    }

    public static TeilnoteSoap toSoapModel(Teilnote model) {
        TeilnoteSoap soapModel = new TeilnoteSoap();

        soapModel.setId(model.getId());
        soapModel.setFeedback_id(model.getFeedback_id());
        soapModel.setNote(model.getNote());
        soapModel.setKategorie(model.getKategorie());

        return soapModel;
    }

    public static TeilnoteSoap[] toSoapModels(Teilnote[] models) {
        TeilnoteSoap[] soapModels = new TeilnoteSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static TeilnoteSoap[][] toSoapModels(Teilnote[][] models) {
        TeilnoteSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new TeilnoteSoap[models.length][models[0].length];
        } else {
            soapModels = new TeilnoteSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static TeilnoteSoap[] toSoapModels(List<Teilnote> models) {
        List<TeilnoteSoap> soapModels = new ArrayList<TeilnoteSoap>(models.size());

        for (Teilnote model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new TeilnoteSoap[soapModels.size()]);
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

    public long getFeedback_id() {
        return _feedback_id;
    }

    public void setFeedback_id(long feedback_id) {
        _feedback_id = feedback_id;
    }

    public int getNote() {
        return _note;
    }

    public void setNote(int note) {
        _note = note;
    }

    public long getKategorie() {
        return _kategorie;
    }

    public void setKategorie(long kategorie) {
        _kategorie = kategorie;
    }
}
