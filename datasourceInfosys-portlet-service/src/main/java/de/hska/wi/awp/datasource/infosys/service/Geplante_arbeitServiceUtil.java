package de.hska.wi.awp.datasource.infosys.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for Geplante_arbeit. This utility wraps
 * {@link de.hska.wi.awp.datasource.infosys.service.impl.Geplante_arbeitServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Daniel Storch
 * @see Geplante_arbeitService
 * @see de.hska.wi.awp.datasource.infosys.service.base.Geplante_arbeitServiceBaseImpl
 * @see de.hska.wi.awp.datasource.infosys.service.impl.Geplante_arbeitServiceImpl
 * @generated
 */
public class Geplante_arbeitServiceUtil {
    private static Geplante_arbeitService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link de.hska.wi.awp.datasource.infosys.service.impl.Geplante_arbeitServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static void clearService() {
        _service = null;
    }

    public static Geplante_arbeitService getService() {
        if (_service == null) {
            InvokableService invokableService = (InvokableService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    Geplante_arbeitService.class.getName());

            if (invokableService instanceof Geplante_arbeitService) {
                _service = (Geplante_arbeitService) invokableService;
            } else {
                _service = new Geplante_arbeitServiceClp(invokableService);
            }

            ReferenceRegistry.registerReference(Geplante_arbeitServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(Geplante_arbeitService service) {
    }
}
