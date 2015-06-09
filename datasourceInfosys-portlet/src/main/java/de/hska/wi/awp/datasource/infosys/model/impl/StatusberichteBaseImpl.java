package de.hska.wi.awp.datasource.infosys.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import de.hska.wi.awp.datasource.infosys.model.Statusberichte;
import de.hska.wi.awp.datasource.infosys.service.StatusberichteLocalServiceUtil;

/**
 * The extended model base implementation for the Statusberichte service. Represents a row in the &quot;datasourceInfosys_Statusberichte&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link StatusberichteImpl}.
 * </p>
 *
 * @author Daniel Storch
 * @see StatusberichteImpl
 * @see de.hska.wi.awp.datasource.infosys.model.Statusberichte
 * @generated
 */
public abstract class StatusberichteBaseImpl extends StatusberichteModelImpl
    implements Statusberichte {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a statusberichte model instance should use the {@link Statusberichte} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            StatusberichteLocalServiceUtil.addStatusberichte(this);
        } else {
            StatusberichteLocalServiceUtil.updateStatusberichte(this);
        }
    }
}
