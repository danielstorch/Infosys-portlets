package de.hska.wi.awp.datasource.infosys.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail;
import de.hska.wi.awp.datasource.infosys.service.Statusbericht_detailLocalServiceUtil;

/**
 * The extended model base implementation for the Statusbericht_detail service. Represents a row in the &quot;datasourceInfosys_Statusbericht_detail&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link Statusbericht_detailImpl}.
 * </p>
 *
 * @author Daniel Storch
 * @see Statusbericht_detailImpl
 * @see de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail
 * @generated
 */
public abstract class Statusbericht_detailBaseImpl
    extends Statusbericht_detailModelImpl implements Statusbericht_detail {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a statusbericht_detail model instance should use the {@link Statusbericht_detail} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            Statusbericht_detailLocalServiceUtil.addStatusbericht_detail(this);
        } else {
            Statusbericht_detailLocalServiceUtil.updateStatusbericht_detail(this);
        }
    }
}