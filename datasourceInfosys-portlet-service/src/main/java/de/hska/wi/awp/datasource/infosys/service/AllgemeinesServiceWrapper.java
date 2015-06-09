package de.hska.wi.awp.datasource.infosys.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AllgemeinesService}.
 *
 * @author Daniel Storch
 * @see AllgemeinesService
 * @generated
 */
public class AllgemeinesServiceWrapper implements AllgemeinesService,
    ServiceWrapper<AllgemeinesService> {
    private AllgemeinesService _allgemeinesService;

    public AllgemeinesServiceWrapper(AllgemeinesService allgemeinesService) {
        _allgemeinesService = allgemeinesService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _allgemeinesService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _allgemeinesService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _allgemeinesService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public AllgemeinesService getWrappedAllgemeinesService() {
        return _allgemeinesService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedAllgemeinesService(
        AllgemeinesService allgemeinesService) {
        _allgemeinesService = allgemeinesService;
    }

    @Override
    public AllgemeinesService getWrappedService() {
        return _allgemeinesService;
    }

    @Override
    public void setWrappedService(AllgemeinesService allgemeinesService) {
        _allgemeinesService = allgemeinesService;
    }
}
