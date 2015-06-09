package de.hska.wi.awp.datasource.infosys.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link de.hska.wi.awp.datasource.infosys.service.http.FeedbackServiceSoap}.
 *
 * @author Daniel Storch
 * @see de.hska.wi.awp.datasource.infosys.service.http.FeedbackServiceSoap
 * @generated
 */
public class FeedbackSoap implements Serializable {
    private long _id;
    private long _student_id;
    private int _feedback_runden_nr;
    private String _eigenbewertung;
    private String _kommentar_kompetenzen;
    private String _kommentar_beitrag;
    private int _beitrag;

    public FeedbackSoap() {
    }

    public static FeedbackSoap toSoapModel(Feedback model) {
        FeedbackSoap soapModel = new FeedbackSoap();

        soapModel.setId(model.getId());
        soapModel.setStudent_id(model.getStudent_id());
        soapModel.setFeedback_runden_nr(model.getFeedback_runden_nr());
        soapModel.setEigenbewertung(model.getEigenbewertung());
        soapModel.setKommentar_kompetenzen(model.getKommentar_kompetenzen());
        soapModel.setKommentar_beitrag(model.getKommentar_beitrag());
        soapModel.setBeitrag(model.getBeitrag());

        return soapModel;
    }

    public static FeedbackSoap[] toSoapModels(Feedback[] models) {
        FeedbackSoap[] soapModels = new FeedbackSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static FeedbackSoap[][] toSoapModels(Feedback[][] models) {
        FeedbackSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new FeedbackSoap[models.length][models[0].length];
        } else {
            soapModels = new FeedbackSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static FeedbackSoap[] toSoapModels(List<Feedback> models) {
        List<FeedbackSoap> soapModels = new ArrayList<FeedbackSoap>(models.size());

        for (Feedback model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new FeedbackSoap[soapModels.size()]);
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

    public long getStudent_id() {
        return _student_id;
    }

    public void setStudent_id(long student_id) {
        _student_id = student_id;
    }

    public int getFeedback_runden_nr() {
        return _feedback_runden_nr;
    }

    public void setFeedback_runden_nr(int feedback_runden_nr) {
        _feedback_runden_nr = feedback_runden_nr;
    }

    public String getEigenbewertung() {
        return _eigenbewertung;
    }

    public void setEigenbewertung(String eigenbewertung) {
        _eigenbewertung = eigenbewertung;
    }

    public String getKommentar_kompetenzen() {
        return _kommentar_kompetenzen;
    }

    public void setKommentar_kompetenzen(String kommentar_kompetenzen) {
        _kommentar_kompetenzen = kommentar_kompetenzen;
    }

    public String getKommentar_beitrag() {
        return _kommentar_beitrag;
    }

    public void setKommentar_beitrag(String kommentar_beitrag) {
        _kommentar_beitrag = kommentar_beitrag;
    }

    public int getBeitrag() {
        return _beitrag;
    }

    public void setBeitrag(int beitrag) {
        _beitrag = beitrag;
    }
}
