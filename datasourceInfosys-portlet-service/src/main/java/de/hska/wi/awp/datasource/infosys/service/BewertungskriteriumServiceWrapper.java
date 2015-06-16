package de.hska.wi.awp.datasource.infosys.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BewertungskriteriumService}.
 *
 * @author Daniel Storch
 * @see BewertungskriteriumService
 * @generated
 */
public class BewertungskriteriumServiceWrapper
    implements BewertungskriteriumService,
        ServiceWrapper<BewertungskriteriumService> {
    private BewertungskriteriumService _bewertungskriteriumService;

    public BewertungskriteriumServiceWrapper(
        BewertungskriteriumService bewertungskriteriumService) {
        _bewertungskriteriumService = bewertungskriteriumService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _bewertungskriteriumService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _bewertungskriteriumService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _bewertungskriteriumService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public BewertungskriteriumService getWrappedBewertungskriteriumService() {
        return _bewertungskriteriumService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedBewertungskriteriumService(
        BewertungskriteriumService bewertungskriteriumService) {
        _bewertungskriteriumService = bewertungskriteriumService;
    }

    @Override
    public BewertungskriteriumService getWrappedService() {
        return _bewertungskriteriumService;
    }

    @Override
    public void setWrappedService(
        BewertungskriteriumService bewertungskriteriumService) {
        _bewertungskriteriumService = bewertungskriteriumService;
    }
}
