package de.hska.wi.awp.datasource.infosys.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link StatusberichteService}.
 *
 * @author Daniel Storch
 * @see StatusberichteService
 * @generated
 */
public class StatusberichteServiceWrapper implements StatusberichteService,
    ServiceWrapper<StatusberichteService> {
    private StatusberichteService _statusberichteService;

    public StatusberichteServiceWrapper(
        StatusberichteService statusberichteService) {
        _statusberichteService = statusberichteService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _statusberichteService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _statusberichteService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _statusberichteService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public StatusberichteService getWrappedStatusberichteService() {
        return _statusberichteService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedStatusberichteService(
        StatusberichteService statusberichteService) {
        _statusberichteService = statusberichteService;
    }

    @Override
    public StatusberichteService getWrappedService() {
        return _statusberichteService;
    }

    @Override
    public void setWrappedService(StatusberichteService statusberichteService) {
        _statusberichteService = statusberichteService;
    }
}
