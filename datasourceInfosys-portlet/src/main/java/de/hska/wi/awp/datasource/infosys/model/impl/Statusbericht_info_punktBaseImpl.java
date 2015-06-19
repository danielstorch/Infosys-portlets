package de.hska.wi.awp.datasource.infosys.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import de.hska.wi.awp.datasource.infosys.model.Statusbericht_info_punkt;
import de.hska.wi.awp.datasource.infosys.service.Statusbericht_info_punktLocalServiceUtil;

/**
 * The extended model base implementation for the Statusbericht_info_punkt service. Represents a row in the &quot;datasourceInfosys_Statusbericht_info_punkt&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link Statusbericht_info_punktImpl}.
 * </p>
 *
 * @author Daniel Storch
 * @see Statusbericht_info_punktImpl
 * @see de.hska.wi.awp.datasource.infosys.model.Statusbericht_info_punkt
 * @generated
 */
public abstract class Statusbericht_info_punktBaseImpl
    extends Statusbericht_info_punktModelImpl
    implements Statusbericht_info_punkt {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a statusbericht_info_punkt model instance should use the {@link Statusbericht_info_punkt} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            Statusbericht_info_punktLocalServiceUtil.addStatusbericht_info_punkt(this);
        } else {
            Statusbericht_info_punktLocalServiceUtil.updateStatusbericht_info_punkt(this);
        }
    }
}