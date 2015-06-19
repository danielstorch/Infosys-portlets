package de.hska.wi.awp.datasource.infosys.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import de.hska.wi.awp.datasource.infosys.service.BewertungskriteriumLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.BewertungskriteriumServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.ClpSerializer;
import de.hska.wi.awp.datasource.infosys.service.FeedbackLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.FeedbackServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.ProjectLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.ProjectServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.RolleLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.RolleServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.Statusbericht_detailLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.Statusbericht_detailServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.Statusbericht_detail_punktLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.Statusbericht_detail_punktServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.Statusbericht_geplante_arbeitLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.Statusbericht_geplante_arbeitServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.Statusbericht_infoLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.Statusbericht_infoServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.Statusbericht_info_punktLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.Statusbericht_info_punktServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.StatusberichteLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.StatusberichteServiceUtil;
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
            BewertungskriteriumLocalServiceUtil.clearService();

            BewertungskriteriumServiceUtil.clearService();
            FeedbackLocalServiceUtil.clearService();

            FeedbackServiceUtil.clearService();
            ProjectLocalServiceUtil.clearService();

            ProjectServiceUtil.clearService();
            RolleLocalServiceUtil.clearService();

            RolleServiceUtil.clearService();
            Statusbericht_detailLocalServiceUtil.clearService();

            Statusbericht_detailServiceUtil.clearService();
            Statusbericht_detail_punktLocalServiceUtil.clearService();

            Statusbericht_detail_punktServiceUtil.clearService();
            Statusbericht_geplante_arbeitLocalServiceUtil.clearService();

            Statusbericht_geplante_arbeitServiceUtil.clearService();
            Statusbericht_infoLocalServiceUtil.clearService();

            Statusbericht_infoServiceUtil.clearService();
            Statusbericht_info_punktLocalServiceUtil.clearService();

            Statusbericht_info_punktServiceUtil.clearService();
            StatusberichteLocalServiceUtil.clearService();

            StatusberichteServiceUtil.clearService();
            StudentLocalServiceUtil.clearService();

            StudentServiceUtil.clearService();
            Teilnote_feedbackLocalServiceUtil.clearService();

            Teilnote_feedbackServiceUtil.clearService();
        }
    }
}
