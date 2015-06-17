package de.hska.wi.awp.datasource.infosys.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import de.hska.wi.awp.datasource.infosys.service.AllgemeinesLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.AllgemeinesServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.BewertungskriteriumLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.BewertungskriteriumServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.ClpSerializer;
import de.hska.wi.awp.datasource.infosys.service.FeedbackLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.FeedbackServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.Geplante_arbeitLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.Geplante_arbeitServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.ProjectLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.ProjectServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.RolleLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.RolleServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.StatusberichteLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.StatusberichteServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.StatusueberblickLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.StatusueberblickServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.StudentLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.StudentServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.Teilnote_feedbackLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.Teilnote_feedbackServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            AllgemeinesLocalServiceUtil.clearService();

            AllgemeinesServiceUtil.clearService();
            BewertungskriteriumLocalServiceUtil.clearService();

            BewertungskriteriumServiceUtil.clearService();
            FeedbackLocalServiceUtil.clearService();

            FeedbackServiceUtil.clearService();
            Geplante_arbeitLocalServiceUtil.clearService();

            Geplante_arbeitServiceUtil.clearService();
            ProjectLocalServiceUtil.clearService();

            ProjectServiceUtil.clearService();
            RolleLocalServiceUtil.clearService();

            RolleServiceUtil.clearService();
            StatusberichteLocalServiceUtil.clearService();

            StatusberichteServiceUtil.clearService();
            StatusueberblickLocalServiceUtil.clearService();

            StatusueberblickServiceUtil.clearService();
            StudentLocalServiceUtil.clearService();

            StudentServiceUtil.clearService();
            Teilnote_feedbackLocalServiceUtil.clearService();

            Teilnote_feedbackServiceUtil.clearService();
        }
    }
}
