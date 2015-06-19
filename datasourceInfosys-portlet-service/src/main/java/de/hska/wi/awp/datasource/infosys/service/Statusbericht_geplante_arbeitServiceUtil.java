package de.hska.wi.awp.datasource.infosys.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for Statusbericht_geplante_arbeit. This utility wraps
 * {@link de.hska.wi.awp.datasource.infosys.service.impl.Statusbericht_geplante_arbeitServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Daniel Storch
 * @see Statusbericht_geplante_arbeitService
 * @see de.hska.wi.awp.datasource.infosys.service.base.Statusbericht_geplante_arbeitServiceBaseImpl
 * @see de.hska.wi.awp.datasource.infosys.service.impl.Statusbericht_geplante_arbeitServiceImpl
 * @generated
 */
public class Statusbericht_geplante_arbeitServiceUtil {
    private static Statusbericht_geplante_arbeitService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link de.hska.wi.awp.datasource.infosys.service.impl.Statusbericht_geplante_arbeitServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

    public static Statusbericht_geplante_arbeitService getService() {
        if (_service == null) {
            InvokableService invokableService = (InvokableService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    Statusbericht_geplante_arbeitService.class.getName());

            if (invokableService instanceof Statusbericht_geplante_arbeitService) {
                _service = (Statusbericht_geplante_arbeitService) invokableService;
            } else {
                _service = new Statusbericht_geplante_arbeitServiceClp(invokableService);
            }

            ReferenceRegistry.registerReference(Statusbericht_geplante_arbeitServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(Statusbericht_geplante_arbeitService service) {
    }
}
