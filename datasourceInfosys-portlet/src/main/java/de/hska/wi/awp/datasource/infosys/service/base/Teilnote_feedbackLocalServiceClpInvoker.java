package de.hska.wi.awp.datasource.infosys.service.base;

import de.hska.wi.awp.datasource.infosys.service.Teilnote_feedbackLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Daniel Storch
 * @generated
 */
public class Teilnote_feedbackLocalServiceClpInvoker {
    private String _methodName0;
    private String[] _methodParameterTypes0;
    private String _methodName1;
    private String[] _methodParameterTypes1;
    private String _methodName2;
    private String[] _methodParameterTypes2;
    private String _methodName3;
    private String[] _methodParameterTypes3;
    private String _methodName4;
    private String[] _methodParameterTypes4;
    private String _methodName5;
    private String[] _methodParameterTypes5;
    private String _methodName6;
    private String[] _methodParameterTypes6;
    private String _methodName7;
    private String[] _methodParameterTypes7;
    private String _methodName8;
    private String[] _methodParameterTypes8;
    private String _methodName9;
    private String[] _methodParameterTypes9;
    private String _methodName10;
    private String[] _methodParameterTypes10;
    private String _methodName11;
    private String[] _methodParameterTypes11;
    private String _methodName12;
    private String[] _methodParameterTypes12;
    private String _methodName13;
    private String[] _methodParameterTypes13;
    private String _methodName14;
    private String[] _methodParameterTypes14;
    private String _methodName15;
    private String[] _methodParameterTypes15;
    private String _methodName76;
    private String[] _methodParameterTypes76;
    private String _methodName77;
    private String[] _methodParameterTypes77;
    private String _methodName82;
    private String[] _methodParameterTypes82;

    public Teilnote_feedbackLocalServiceClpInvoker() {
        _methodName0 = "addTeilnote_feedback";

        _methodParameterTypes0 = new String[] {
                "de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback"
            };

        _methodName1 = "createTeilnote_feedback";

        _methodParameterTypes1 = new String[] { "long" };

        _methodName2 = "deleteTeilnote_feedback";

        _methodParameterTypes2 = new String[] { "long" };

        _methodName3 = "deleteTeilnote_feedback";

        _methodParameterTypes3 = new String[] {
                "de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback"
            };

        _methodName4 = "dynamicQuery";

        _methodParameterTypes4 = new String[] {  };

        _methodName5 = "dynamicQuery";

        _methodParameterTypes5 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName6 = "dynamicQuery";

        _methodParameterTypes6 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
            };

        _methodName7 = "dynamicQuery";

        _methodParameterTypes7 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
                "com.liferay.portal.kernel.util.OrderByComparator"
            };

        _methodName8 = "dynamicQueryCount";

        _methodParameterTypes8 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName9 = "dynamicQueryCount";

        _methodParameterTypes9 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery",
                "com.liferay.portal.kernel.dao.orm.Projection"
            };

        _methodName10 = "fetchTeilnote_feedback";

        _methodParameterTypes10 = new String[] { "long" };

        _methodName11 = "getTeilnote_feedback";

        _methodParameterTypes11 = new String[] { "long" };

        _methodName12 = "getPersistedModel";

        _methodParameterTypes12 = new String[] { "java.io.Serializable" };

        _methodName13 = "getTeilnote_feedbacks";

        _methodParameterTypes13 = new String[] { "int", "int" };

        _methodName14 = "getTeilnote_feedbacksCount";

        _methodParameterTypes14 = new String[] {  };

        _methodName15 = "updateTeilnote_feedback";

        _methodParameterTypes15 = new String[] {
                "de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback"
            };

        _methodName76 = "getBeanIdentifier";

        _methodParameterTypes76 = new String[] {  };

        _methodName77 = "setBeanIdentifier";

        _methodParameterTypes77 = new String[] { "java.lang.String" };

        _methodName82 = "findByFeedback_id";

        _methodParameterTypes82 = new String[] { "long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return Teilnote_feedbackLocalServiceUtil.addTeilnote_feedback((de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return Teilnote_feedbackLocalServiceUtil.createTeilnote_feedback(((Long) arguments[0]).longValue());
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return Teilnote_feedbackLocalServiceUtil.deleteTeilnote_feedback(((Long) arguments[0]).longValue());
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return Teilnote_feedbackLocalServiceUtil.deleteTeilnote_feedback((de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return Teilnote_feedbackLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return Teilnote_feedbackLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return Teilnote_feedbackLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return Teilnote_feedbackLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return Teilnote_feedbackLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return Teilnote_feedbackLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                (com.liferay.portal.kernel.dao.orm.Projection) arguments[1]);
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return Teilnote_feedbackLocalServiceUtil.fetchTeilnote_feedback(((Long) arguments[0]).longValue());
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return Teilnote_feedbackLocalServiceUtil.getTeilnote_feedback(((Long) arguments[0]).longValue());
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return Teilnote_feedbackLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return Teilnote_feedbackLocalServiceUtil.getTeilnote_feedbacks(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return Teilnote_feedbackLocalServiceUtil.getTeilnote_feedbacksCount();
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return Teilnote_feedbackLocalServiceUtil.updateTeilnote_feedback((de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback) arguments[0]);
        }

        if (_methodName76.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes76, parameterTypes)) {
            return Teilnote_feedbackLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName77.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes77, parameterTypes)) {
            Teilnote_feedbackLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName82.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes82, parameterTypes)) {
            return Teilnote_feedbackLocalServiceUtil.findByFeedback_id(((Long) arguments[0]).longValue());
        }

        throw new UnsupportedOperationException();
    }
}
