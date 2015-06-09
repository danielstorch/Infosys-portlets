package de.hska.wi.awp.datasource.infosys.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TeilnoteService}.
 *
 * @author Daniel Storch
 * @see TeilnoteService
 * @generated
 */
public class TeilnoteServiceWrapper implements TeilnoteService,
    ServiceWrapper<TeilnoteService> {
    private TeilnoteService _teilnoteService;

    public TeilnoteServiceWrapper(TeilnoteService teilnoteService) {
        _teilnoteService = teilnoteService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _teilnoteService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _teilnoteService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _teilnoteService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public TeilnoteService getWrappedTeilnoteService() {
        return _teilnoteService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedTeilnoteService(TeilnoteService teilnoteService) {
        _teilnoteService = teilnoteService;
    }

    @Override
    public TeilnoteService getWrappedService() {
        return _teilnoteService;
    }

    @Override
    public void setWrappedService(TeilnoteService teilnoteService) {
        _teilnoteService = teilnoteService;
    }
}
