package de.hska.wi.awp.datasource.infosys.event;

import java.io.Serializable;
import java.util.List;

import javax.el.ELContext;
import javax.el.ValueExpression;
import javax.faces.context.FacesContext;
import javax.portlet.Event;
import javax.portlet.EventResponse;
import javax.portlet.faces.BridgeEventHandler;
import javax.portlet.faces.event.EventNavigationResult;

import com.liferay.faces.bridge.event.EventPayloadWrapper;

import de.hska.wi.awp.datasource.infosys.bean.navigation.NavigationBackingBean;
import de.hska.wi.awp.datasource.infosys.bean.receivedfeedback.ReceivedFeedbackModelBean;
import de.hska.wi.awp.datasource.infosys.model.Feedback;
import de.hska.wi.awp.datasource.infosys.model.Student;
import de.hska.wi.awp.datasource.infosys.service.FeedbackLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.StudentLocalServiceUtil;

public class ReceivedFeedbackEventHandler implements BridgeEventHandler{

	@Override
	public EventNavigationResult handleEvent(FacesContext facesContext, Event event) {
		 EventNavigationResult eventNavigationResult = null;
         String eventQName = event.getQName().toString();

         if (eventQName.equals("{http://liferay.com/events}ipc.studentSelected")) {
             System.out.print("EVENT RECIVED STUDENT");
             
             Serializable value = event.getValue();
             
            if (value instanceof EventPayloadWrapper) {
 				value = ((EventPayloadWrapper) value).getWrapped();
 			}

 			String hskaId = (String) value;
 			ReceivedFeedbackModelBean receivedFeedbackModelBean = getReceivedFeedbackModelBean(facesContext);
 			receivedFeedbackModelBean.setStudent(StudentLocalServiceUtil.findByStudenthskaId(hskaId));

 			String fromAction = null;
 			String outcome = "ipc.studentSelected";
 			eventNavigationResult = new EventNavigationResult(fromAction, outcome);
             
         }

         if(eventQName.equals("{http://liferay.com/events}ipc.projectSelected")) {
        	 System.out.print("EVENT RECIVED PROJECT");
             
             Serializable value = event.getValue();
             
            if (value instanceof EventPayloadWrapper) {
 				value = ((EventPayloadWrapper) value).getWrapped();
 			}

 			String hskaId = (String) value;
 			ReceivedFeedbackModelBean receivedFeedbackModelBean = getReceivedFeedbackModelBean(facesContext);
 			receivedFeedbackModelBean.setStudent(null);

 			String fromAction = null;
 			String outcome = "ipc.projectSelected";
 			eventNavigationResult = new EventNavigationResult(fromAction, outcome);
         }
         
         return eventNavigationResult;
	}
	
	protected ReceivedFeedbackModelBean getReceivedFeedbackModelBean(FacesContext facesContext) {
		String elExpression = "#{receivedFeedbackModelBean}";
		ELContext elContext = facesContext.getELContext();
		ValueExpression valueExpression = facesContext.getApplication().getExpressionFactory().createValueExpression(
				elContext, elExpression, ReceivedFeedbackModelBean.class);

		return (ReceivedFeedbackModelBean) valueExpression.getValue(elContext);
	}
}