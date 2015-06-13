package de.hska.wi.awp.datasource.infosys.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link de.hska.wi.awp.datasource.infosys.service.http.Teilnote_feedbackServiceSoap}.
 *
 * @author Daniel Storch
 * @see de.hska.wi.awp.datasource.infosys.service.http.Teilnote_feedbackServiceSoap
 * @generated
 */
public class Teilnote_feedbackSoap implements Serializable {
    private long _id;
    private long _feedback_id;
    private int _note;
    private long _bewertungskriterium_id;

    public Teilnote_feedbackSoap() {
    }

    public static Teilnote_feedbackSoap toSoapModel(Teilnote_feedback model) {
        Teilnote_feedbackSoap soapModel = new Teilnote_feedbackSoap();

        soapModel.setId(model.getId());
        soapModel.setFeedback_id(model.getFeedback_id());
        soapModel.setNote(model.getNote());
        soapModel.setBewertungskriterium_id(model.getBewertungskriterium_id());

        return soapModel;
    }

    public static Teilnote_feedbackSoap[] toSoapModels(
        Teilnote_feedback[] models) {
        Teilnote_feedbackSoap[] soapModels = new Teilnote_feedbackSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static Teilnote_feedbackSoap[][] toSoapModels(
        Teilnote_feedback[][] models) {
        Teilnote_feedbackSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new Teilnote_feedbackSoap[models.length][models[0].length];
        } else {
            soapModels = new Teilnote_feedbackSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static Teilnote_feedbackSoap[] toSoapModels(
        List<Teilnote_feedback> models) {
        List<Teilnote_feedbackSoap> soapModels = new ArrayList<Teilnote_feedbackSoap>(models.size());

        for (Teilnote_feedback model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new Teilnote_feedbackSoap[soapModels.size()]);
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

    public long getBewertungskriterium_id() {
        return _bewertungskriterium_id;
    }

    public void setBewertungskriterium_id(long bewertungskriterium_id) {
        _bewertungskriterium_id = bewertungskriterium_id;
    }
}
