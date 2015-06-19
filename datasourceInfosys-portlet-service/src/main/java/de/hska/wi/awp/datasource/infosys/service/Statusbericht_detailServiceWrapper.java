package de.hska.wi.awp.datasource.infosys.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Statusbericht_detailService}.
 *
 * @author Daniel Storch
 * @see Statusbericht_detailService
 * @generated
 */
public class Statusbericht_detailServiceWrapper
    implements Statusbericht_detailService,
        ServiceWrapper<Statusbericht_detailService> {
    private Statusbericht_detailService _statusbericht_detailService;

    public Statusbericht_detailServiceWrapper(
        Statusbericht_detailService statusbericht_detailService) {
        _statusbericht_detailService = statusbericht_detailService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _statusbericht_detailService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _statusbericht_detailService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _statusbericht_detailService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Statusbericht_detailService getWrappedStatusbericht_detailService() {
        return _statusbericht_detailService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedStatusbericht_detailService(
        Statusbericht_detailService statusbericht_detailService) {
        _statusbericht_detailService = statusbericht_detailService;
    }

    @Override
    public Statusbericht_detailService getWrappedService() {
        return _statusbericht_detailService;
    }

    @Override
    public void setWrappedService(
        Statusbericht_detailService statusbericht_detailService) {
        _statusbericht_detailService = statusbericht_detailService;
    }
}
