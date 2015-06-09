package de.hska.wi.awp.datasource.infosys.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link StatusueberblickService}.
 *
 * @author Daniel Storch
 * @see StatusueberblickService
 * @generated
 */
public class StatusueberblickServiceWrapper implements StatusueberblickService,
    ServiceWrapper<StatusueberblickService> {
    private StatusueberblickService _statusueberblickService;

    public StatusueberblickServiceWrapper(
        StatusueberblickService statusueberblickService) {
        _statusueberblickService = statusueberblickService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _statusueberblickService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _statusueberblickService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _statusueberblickService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public StatusueberblickService getWrappedStatusueberblickService() {
        return _statusueberblickService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedStatusueberblickService(
        StatusueberblickService statusueberblickService) {
        _statusueberblickService = statusueberblickService;
    }

    @Override
    public StatusueberblickService getWrappedService() {
        return _statusueberblickService;
    }

    @Override
    public void setWrappedService(
        StatusueberblickService statusueberblickService) {
        _statusueberblickService = statusueberblickService;
    }
}
