package de.hska.wi.awp.datasource.infosys.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link de.hska.wi.awp.datasource.infosys.service.http.ProjectServiceSoap}.
 *
 * @author Daniel Storch
 * @see de.hska.wi.awp.datasource.infosys.service.http.ProjectServiceSoap
 * @generated
 */
public class ProjectSoap implements Serializable {
    private String _name;
    private String _projecthskaId;
    private long _id;

    public ProjectSoap() {
    }

    public static ProjectSoap toSoapModel(Project model) {
        ProjectSoap soapModel = new ProjectSoap();

        soapModel.setName(model.getName());
        soapModel.setProjecthskaId(model.getProjecthskaId());
        soapModel.setId(model.getId());

        return soapModel;
    }

    public static ProjectSoap[] toSoapModels(Project[] models) {
        ProjectSoap[] soapModels = new ProjectSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static ProjectSoap[][] toSoapModels(Project[][] models) {
        ProjectSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new ProjectSoap[models.length][models[0].length];
        } else {
            soapModels = new ProjectSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static ProjectSoap[] toSoapModels(List<Project> models) {
        List<ProjectSoap> soapModels = new ArrayList<ProjectSoap>(models.size());

        for (Project model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new ProjectSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _id;
    }

    public void setPrimaryKey(long pk) {
        setId(pk);
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getProjecthskaId() {
        return _projecthskaId;
    }

    public void setProjecthskaId(String projecthskaId) {
        _projecthskaId = projecthskaId;
    }

    public long getId() {
        return _id;
    }

    public void setId(long id) {
        _id = id;
    }
}
