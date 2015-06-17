package de.hska.wi.awp.datasource.infosys.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RolleService}.
 *
 * @author Daniel Storch
 * @see RolleService
 * @generated
 */
public class RolleServiceWrapper implements RolleService,
    ServiceWrapper<RolleService> {
    private RolleService _rolleService;

    public RolleServiceWrapper(RolleService rolleService) {
        _rolleService = rolleService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _rolleService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _rolleService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _rolleService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public RolleService getWrappedRolleService() {
        return _rolleService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedRolleService(RolleService rolleService) {
        _rolleService = rolleService;
    }

    @Override
    public RolleService getWrappedService() {
        return _rolleService;
    }

    @Override
    public void setWrappedService(RolleService rolleService) {
        _rolleService = rolleService;
    }
}
