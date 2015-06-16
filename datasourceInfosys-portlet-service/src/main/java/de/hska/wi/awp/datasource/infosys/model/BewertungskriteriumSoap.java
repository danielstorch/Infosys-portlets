package de.hska.wi.awp.datasource.infosys.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link de.hska.wi.awp.datasource.infosys.service.http.BewertungskriteriumServiceSoap}.
 *
 * @author Daniel Storch
 * @see de.hska.wi.awp.datasource.infosys.service.http.BewertungskriteriumServiceSoap
 * @generated
 */
public class BewertungskriteriumSoap implements Serializable {
    private long _id;
    private String _name;
    private String _beschreibung;
    private int _gewichtung;

    public BewertungskriteriumSoap() {
    }

    public static BewertungskriteriumSoap toSoapModel(Bewertungskriterium model) {
        BewertungskriteriumSoap soapModel = new BewertungskriteriumSoap();

        soapModel.setId(model.getId());
        soapModel.setName(model.getName());
        soapModel.setBeschreibung(model.getBeschreibung());
        soapModel.setGewichtung(model.getGewichtung());

        return soapModel;
    }

    public static BewertungskriteriumSoap[] toSoapModels(
        Bewertungskriterium[] models) {
        BewertungskriteriumSoap[] soapModels = new BewertungskriteriumSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static BewertungskriteriumSoap[][] toSoapModels(
        Bewertungskriterium[][] models) {
        BewertungskriteriumSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new BewertungskriteriumSoap[models.length][models[0].length];
        } else {
            soapModels = new BewertungskriteriumSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static BewertungskriteriumSoap[] toSoapModels(
        List<Bewertungskriterium> models) {
        List<BewertungskriteriumSoap> soapModels = new ArrayList<BewertungskriteriumSoap>(models.size());

        for (Bewertungskriterium model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new BewertungskriteriumSoap[soapModels.size()]);
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

    public String getBeschreibung() {
        return _beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        _beschreibung = beschreibung;
    }

    public int getGewichtung() {
        return _gewichtung;
    }

    public void setGewichtung(int gewichtung) {
        _gewichtung = gewichtung;
    }
}
