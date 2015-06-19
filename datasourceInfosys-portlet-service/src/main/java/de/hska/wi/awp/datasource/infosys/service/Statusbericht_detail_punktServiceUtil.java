package de.hska.wi.awp.datasource.infosys.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for Statusbericht_detail_punkt. This utility wraps
 * {@link de.hska.wi.awp.datasource.infosys.service.impl.Statusbericht_detail_punktServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Daniel Storch
 * @see Statusbericht_detail_punktService
 * @see de.hska.wi.awp.datasource.infosys.service.base.Statusbericht_detail_punktServiceBaseImpl
 * @see de.hska.wi.awp.datasource.infosys.service.impl.Statusbericht_detail_punktServiceImpl
 * @generated
 */
public class Statusbericht_detail_punktServiceUtil {
    private static Statusbericht_detail_punktService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link de.hska.wi.awp.datasource.infosys.service.impl.Statusbericht_detail_punktServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

    public static Statusbericht_detail_punktService getService() {
        if (_service == null) {
            InvokableService invokableService = (InvokableService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    Statusbericht_detail_punktService.class.getName());

            if (invokableService instanceof Statusbericht_detail_punktService) {
                _service = (Statusbericht_detail_punktService) invokableService;
            } else {
                _service = new Statusbericht_detail_punktServiceClp(invokableService);
            }

            ReferenceRegistry.registerReference(Statusbericht_detail_punktServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(Statusbericht_detail_punktService service) {
    }
}
