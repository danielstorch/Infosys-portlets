package de.hska.wi.awp.datasource.infosys.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Statusbericht_info_punktService}.
 *
 * @author Daniel Storch
 * @see Statusbericht_info_punktService
 * @generated
 */
public class Statusbericht_info_punktServiceWrapper
    implements Statusbericht_info_punktService,
        ServiceWrapper<Statusbericht_info_punktService> {
    private Statusbericht_info_punktService _statusbericht_info_punktService;

    public Statusbericht_info_punktServiceWrapper(
        Statusbericht_info_punktService statusbericht_info_punktService) {
        _statusbericht_info_punktService = statusbericht_info_punktService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _statusbericht_info_punktService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _statusbericht_info_punktService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _statusbericht_info_punktService.invokeMethod(name,
            parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Statusbericht_info_punktService getWrappedStatusbericht_info_punktService() {
        return _statusbericht_info_punktService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedStatusbericht_info_punktService(
        Statusbericht_info_punktService statusbericht_info_punktService) {
        _statusbericht_info_punktService = statusbericht_info_punktService;
    }

    @Override
    public Statusbericht_info_punktService getWrappedService() {
        return _statusbericht_info_punktService;
    }

    @Override
    public void setWrappedService(
        Statusbericht_info_punktService statusbericht_info_punktService) {
        _statusbericht_info_punktService = statusbericht_info_punktService;
    }
}
