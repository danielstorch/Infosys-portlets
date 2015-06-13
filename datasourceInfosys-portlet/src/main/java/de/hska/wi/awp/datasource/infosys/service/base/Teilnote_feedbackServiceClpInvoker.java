package de.hska.wi.awp.datasource.infosys.service.base;

import de.hska.wi.awp.datasource.infosys.service.Teilnote_feedbackServiceUtil;

import java.util.Arrays;

/**
 * @author Daniel Storch
 * @generated
 */
public class Teilnote_feedbackServiceClpInvoker {
    private String _methodName60;
    private String[] _methodParameterTypes60;
    private String _methodName61;
    private String[] _methodParameterTypes61;

    public Teilnote_feedbackServiceClpInvoker() {
        _methodName60 = "getBeanIdentifier";

        _methodParameterTypes60 = new String[] {  };

        _methodName61 = "setBeanIdentifier";

        _methodParameterTypes61 = new String[] { "java.lang.String" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName60.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes60, parameterTypes)) {
            return Teilnote_feedbackServiceUtil.getBeanIdentifier();
        }

        if (_methodName61.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes61, parameterTypes)) {
            Teilnote_feedbackServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        throw new UnsupportedOperationException();
    }
}
