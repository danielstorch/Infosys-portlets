package de.hska.wi.awp.datasource.infosys.service.base;

import de.hska.wi.awp.datasource.infosys.service.Geplante_arbeitServiceUtil;

import java.util.Arrays;

/**
 * @author Daniel Storch
 * @generated
 */
public class Geplante_arbeitServiceClpInvoker {
    private String _methodName60;
    private String[] _methodParameterTypes60;
    private String _methodName61;
    private String[] _methodParameterTypes61;

    public Geplante_arbeitServiceClpInvoker() {
        _methodName60 = "getBeanIdentifier";

        _methodParameterTypes60 = new String[] {  };

        _methodName61 = "setBeanIdentifier";

        _methodParameterTypes61 = new String[] { "java.lang.String" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName60.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes60, parameterTypes)) {
            return Geplante_arbeitServiceUtil.getBeanIdentifier();
        }

        if (_methodName61.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes61, parameterTypes)) {
            Geplante_arbeitServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        throw new UnsupportedOperationException();
    }
}
