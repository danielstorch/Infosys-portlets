package de.hska.wi.awp.datasource.infosys.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Teilnote_feedbackService}.
 *
 * @author Daniel Storch
 * @see Teilnote_feedbackService
 * @generated
 */
public class Teilnote_feedbackServiceWrapper implements Teilnote_feedbackService,
    ServiceWrapper<Teilnote_feedbackService> {
    private Teilnote_feedbackService _teilnote_feedbackService;

    public Teilnote_feedbackServiceWrapper(
        Teilnote_feedbackService teilnote_feedbackService) {
        _teilnote_feedbackService = teilnote_feedbackService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _teilnote_feedbackService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _teilnote_feedbackService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _teilnote_feedbackService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Teilnote_feedbackService getWrappedTeilnote_feedbackService() {
        return _teilnote_feedbackService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedTeilnote_feedbackService(
        Teilnote_feedbackService teilnote_feedbackService) {
        _teilnote_feedbackService = teilnote_feedbackService;
    }

    @Override
    public Teilnote_feedbackService getWrappedService() {
        return _teilnote_feedbackService;
    }

    @Override
    public void setWrappedService(
        Teilnote_feedbackService teilnote_feedbackService) {
        _teilnote_feedbackService = teilnote_feedbackService;
    }
}
