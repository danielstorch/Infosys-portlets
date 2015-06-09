package de.hska.wi.awp.datasource.infosys.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FeedbackService}.
 *
 * @author Daniel Storch
 * @see FeedbackService
 * @generated
 */
public class FeedbackServiceWrapper implements FeedbackService,
    ServiceWrapper<FeedbackService> {
    private FeedbackService _feedbackService;

    public FeedbackServiceWrapper(FeedbackService feedbackService) {
        _feedbackService = feedbackService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _feedbackService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _feedbackService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _feedbackService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public FeedbackService getWrappedFeedbackService() {
        return _feedbackService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedFeedbackService(FeedbackService feedbackService) {
        _feedbackService = feedbackService;
    }

    @Override
    public FeedbackService getWrappedService() {
        return _feedbackService;
    }

    @Override
    public void setWrappedService(FeedbackService feedbackService) {
        _feedbackService = feedbackService;
    }
}
