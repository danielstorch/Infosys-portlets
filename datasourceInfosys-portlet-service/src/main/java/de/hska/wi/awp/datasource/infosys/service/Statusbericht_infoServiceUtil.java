package de.hska.wi.awp.datasource.infosys.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for Statusbericht_info. This utility wraps
 * {@link de.hska.wi.awp.datasource.infosys.service.impl.Statusbericht_infoServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Daniel Storch
 * @see Statusbericht_infoService
 * @see de.hska.wi.awp.datasource.infosys.service.base.Statusbericht_infoServiceBaseImpl
 * @see de.hska.wi.awp.datasource.infosys.service.impl.Statusbericht_infoServiceImpl
 * @generated
 */
public class Statusbericht_infoServiceUtil {
    private static Statusbericht_infoService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link de.hska.wi.awp.datasource.infosys.service.impl.Statusbericht_infoServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

    public static Statusbericht_infoService getService() {
        if (_service == null) {
            InvokableService invokableService = (InvokableService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    Statusbericht_infoService.class.getName());

            if (invokableService instanceof Statusbericht_infoService) {
                _service = (Statusbericht_infoService) invokableService;
            } else {
                _service = new Statusbericht_infoServiceClp(invokableService);
            }

            ReferenceRegistry.registerReference(Statusbericht_infoServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(Statusbericht_infoService service) {
    }
}
