package de.hska.wi.awp.datasource.infosys.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Statusbericht_geplante_arbeitService}.
 *
 * @author Daniel Storch
 * @see Statusbericht_geplante_arbeitService
 * @generated
 */
public class Statusbericht_geplante_arbeitServiceWrapper
    implements Statusbericht_geplante_arbeitService,
        ServiceWrapper<Statusbericht_geplante_arbeitService> {
    private Statusbericht_geplante_arbeitService _statusbericht_geplante_arbeitService;

    public Statusbericht_geplante_arbeitServiceWrapper(
        Statusbericht_geplante_arbeitService statusbericht_geplante_arbeitService) {
        _statusbericht_geplante_arbeitService = statusbericht_geplante_arbeitService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _statusbericht_geplante_arbeitService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _statusbericht_geplante_arbeitService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _statusbericht_geplante_arbeitService.invokeMethod(name,
            parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Statusbericht_geplante_arbeitService getWrappedStatusbericht_geplante_arbeitService() {
        return _statusbericht_geplante_arbeitService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedStatusbericht_geplante_arbeitService(
        Statusbericht_geplante_arbeitService statusbericht_geplante_arbeitService) {
        _statusbericht_geplante_arbeitService = statusbericht_geplante_arbeitService;
    }

    @Override
    public Statusbericht_geplante_arbeitService getWrappedService() {
        return _statusbericht_geplante_arbeitService;
    }

    @Override
    public void setWrappedService(
        Statusbericht_geplante_arbeitService statusbericht_geplante_arbeitService) {
        _statusbericht_geplante_arbeitService = statusbericht_geplante_arbeitService;
    }
}
