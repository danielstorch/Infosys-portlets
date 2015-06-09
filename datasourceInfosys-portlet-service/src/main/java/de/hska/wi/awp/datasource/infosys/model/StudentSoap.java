package de.hska.wi.awp.datasource.infosys.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link de.hska.wi.awp.datasource.infosys.service.http.StudentServiceSoap}.
 *
 * @author Daniel Storch
 * @see de.hska.wi.awp.datasource.infosys.service.http.StudentServiceSoap
 * @generated
 */
public class StudentSoap implements Serializable {
    private String _firstName;
    private String _lastName;
    private long _id;
    private long _project_id;
    private String _studenthskaId;
    private long _matnr;
    private long _role;

    public StudentSoap() {
    }

    public static StudentSoap toSoapModel(Student model) {
        StudentSoap soapModel = new StudentSoap();

        soapModel.setFirstName(model.getFirstName());
        soapModel.setLastName(model.getLastName());
        soapModel.setId(model.getId());
        soapModel.setProject_id(model.getProject_id());
        soapModel.setStudenthskaId(model.getStudenthskaId());
        soapModel.setMatnr(model.getMatnr());
        soapModel.setRole(model.getRole());

        return soapModel;
    }

    public static StudentSoap[] toSoapModels(Student[] models) {
        StudentSoap[] soapModels = new StudentSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static StudentSoap[][] toSoapModels(Student[][] models) {
        StudentSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new StudentSoap[models.length][models[0].length];
        } else {
            soapModels = new StudentSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static StudentSoap[] toSoapModels(List<Student> models) {
        List<StudentSoap> soapModels = new ArrayList<StudentSoap>(models.size());

        for (Student model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new StudentSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _id;
    }

    public void setPrimaryKey(long pk) {
        setId(pk);
    }

    public String getFirstName() {
        return _firstName;
    }

    public void setFirstName(String firstName) {
        _firstName = firstName;
    }

    public String getLastName() {
        return _lastName;
    }

    public void setLastName(String lastName) {
        _lastName = lastName;
    }

    public long getId() {
        return _id;
    }

    public void setId(long id) {
        _id = id;
    }

    public long getProject_id() {
        return _project_id;
    }

    public void setProject_id(long project_id) {
        _project_id = project_id;
    }

    public String getStudenthskaId() {
        return _studenthskaId;
    }

    public void setStudenthskaId(String studenthskaId) {
        _studenthskaId = studenthskaId;
    }

    public long getMatnr() {
        return _matnr;
    }

    public void setMatnr(long matnr) {
        _matnr = matnr;
    }

    public long getRole() {
        return _role;
    }

    public void setRole(long role) {
        _role = role;
    }
}
