package de.hska.wi.awp.datasource.infosys.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Geplante_arbeitService}.
 *
 * @author Daniel Storch
 * @see Geplante_arbeitService
 * @generated
 */
public class Geplante_arbeitServiceWrapper implements Geplante_arbeitService,
    ServiceWrapper<Geplante_arbeitService> {
    private Geplante_arbeitService _geplante_arbeitService;

    public Geplante_arbeitServiceWrapper(
        Geplante_arbeitService geplante_arbeitService) {
        _geplante_arbeitService = geplante_arbeitService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _geplante_arbeitService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _geplante_arbeitService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _geplante_arbeitService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Geplante_arbeitService getWrappedGeplante_arbeitService() {
        return _geplante_arbeitService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedGeplante_arbeitService(
        Geplante_arbeitService geplante_arbeitService) {
        _geplante_arbeitService = geplante_arbeitService;
    }

    @Override
    public Geplante_arbeitService getWrappedService() {
        return _geplante_arbeitService;
    }

    @Override
    public void setWrappedService(Geplante_arbeitService geplante_arbeitService) {
        _geplante_arbeitService = geplante_arbeitService;
    }
}
