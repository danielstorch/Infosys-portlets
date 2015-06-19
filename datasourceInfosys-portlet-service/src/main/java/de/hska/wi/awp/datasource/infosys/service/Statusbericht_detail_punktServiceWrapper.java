package de.hska.wi.awp.datasource.infosys.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Statusbericht_detail_punktService}.
 *
 * @author Daniel Storch
 * @see Statusbericht_detail_punktService
 * @generated
 */
public class Statusbericht_detail_punktServiceWrapper
    implements Statusbericht_detail_punktService,
        ServiceWrapper<Statusbericht_detail_punktService> {
    private Statusbericht_detail_punktService _statusbericht_detail_punktService;

    public Statusbericht_detail_punktServiceWrapper(
        Statusbericht_detail_punktService statusbericht_detail_punktService) {
        _statusbericht_detail_punktService = statusbericht_detail_punktService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _statusbericht_detail_punktService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _statusbericht_detail_punktService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _statusbericht_detail_punktService.invokeMethod(name,
            parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Statusbericht_detail_punktService getWrappedStatusbericht_detail_punktService() {
        return _statusbericht_detail_punktService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedStatusbericht_detail_punktService(
        Statusbericht_detail_punktService statusbericht_detail_punktService) {
        _statusbericht_detail_punktService = statusbericht_detail_punktService;
    }

    @Override
    public Statusbericht_detail_punktService getWrappedService() {
        return _statusbericht_detail_punktService;
    }

    @Override
    public void setWrappedService(
        Statusbericht_detail_punktService statusbericht_detail_punktService) {
        _statusbericht_detail_punktService = statusbericht_detail_punktService;
    }
}
