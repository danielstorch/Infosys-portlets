package de.hska.wi.awp.datasource.infosys.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Statusbericht_infoService}.
 *
 * @author Daniel Storch
 * @see Statusbericht_infoService
 * @generated
 */
public class Statusbericht_infoServiceWrapper
    implements Statusbericht_infoService,
        ServiceWrapper<Statusbericht_infoService> {
    private Statusbericht_infoService _statusbericht_infoService;

    public Statusbericht_infoServiceWrapper(
        Statusbericht_infoService statusbericht_infoService) {
        _statusbericht_infoService = statusbericht_infoService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _statusbericht_infoService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _statusbericht_infoService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _statusbericht_infoService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Statusbericht_infoService getWrappedStatusbericht_infoService() {
        return _statusbericht_infoService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedStatusbericht_infoService(
        Statusbericht_infoService statusbericht_infoService) {
        _statusbericht_infoService = statusbericht_infoService;
    }

    @Override
    public Statusbericht_infoService getWrappedService() {
        return _statusbericht_infoService;
    }

    @Override
    public void setWrappedService(
        Statusbericht_infoService statusbericht_infoService) {
        _statusbericht_infoService = statusbericht_infoService;
    }
}
