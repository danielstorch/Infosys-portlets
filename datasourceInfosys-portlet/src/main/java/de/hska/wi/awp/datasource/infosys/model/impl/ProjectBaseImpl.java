package de.hska.wi.awp.datasource.infosys.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import de.hska.wi.awp.datasource.infosys.model.Project;
import de.hska.wi.awp.datasource.infosys.service.ProjectLocalServiceUtil;

/**
 * The extended model base implementation for the Project service. Represents a row in the &quot;datasourceInfosys_Project&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ProjectImpl}.
 * </p>
 *
 * @author Daniel Storch
 * @see ProjectImpl
 * @see de.hska.wi.awp.datasource.infosys.model.Project
 * @generated
 */
public abstract class ProjectBaseImpl extends ProjectModelImpl
    implements Project {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a project model instance should use the {@link Project} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            ProjectLocalServiceUtil.addProject(this);
        } else {
            ProjectLocalServiceUtil.updateProject(this);
        }
    }
}
