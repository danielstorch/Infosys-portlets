package de.hska.wi.awp.datasource.infosys.service.base;

import de.hska.wi.awp.datasource.infosys.service.StudentServiceUtil;

import java.util.Arrays;

/**
 * @author Daniel Storch
 * @generated
 */
public class StudentServiceClpInvoker {
    private String _methodName84;
    private String[] _methodParameterTypes84;
    private String _methodName85;
    private String[] _methodParameterTypes85;

    public StudentServiceClpInvoker() {
        _methodName84 = "getBeanIdentifier";

        _methodParameterTypes84 = new String[] {  };

        _methodName85 = "setBeanIdentifier";

        _methodParameterTypes85 = new String[] { "java.lang.String" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName84.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes84, parameterTypes)) {
            return StudentServiceUtil.getBeanIdentifier();
        }

        if (_methodName85.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes85, parameterTypes)) {
            StudentServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        throw new UnsupportedOperationException();
    }
}
