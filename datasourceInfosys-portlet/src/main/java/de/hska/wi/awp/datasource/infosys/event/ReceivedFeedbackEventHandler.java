package de.hska.wi.awp.datasource.infosys.event;

import java.io.Serializable;

import javax.el.ELContext;
import javax.el.ValueExpression;
import javax.faces.context.FacesContext;
import javax.portlet.Event;
import javax.portlet.faces.BridgeEventHandler;
import javax.portlet.faces.event.EventNavigationResult;

import com.liferay.faces.bridge.event.EventPayloadWrapper;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import de.hska.wi.awp.datasource.infosys.bean.receivedfeedback.ReceivedFeedbackProjectModelBean;
import de.hska.wi.awp.datasource.infosys.bean.receivedfeedback.ReceivedFeedbackStudentModelBean;
import de.hska.wi.awp.datasource.infosys.service.ProjectLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.StudentLocalServiceUtil;

/**
 * EventHandler of the receivedFeedback-Portlet
 * @author Daniel Storch
 */
public class ReceivedFeedbackEventHandler implements BridgeEventHandler{

	/**
     * Logger Util
     */	
	private static final Log log = LogFactoryUtil.getLog(ReceivedFeedbackEventHandler.class);
	
	/**
	 * Handles the retrieved Event
	 * Either student event ipc.studentSelected or project event ipc.projectSelected
	 */
	@Override
	public EventNavigationResult handleEvent(FacesContext facesContext, Event event) {
		log.debug("BEGIN: handleEvent");
		
		 EventNavigationResult eventNavigationResult = null;
         String eventQName = event.getQName().toString();

         if (eventQName.equals("{http://liferay.com/events}ipc.studentSelected")) {
             System.out.print("EVENT RECIVED STUDENT");
             
             Serializable value = event.getValue();
             
            if (value instanceof EventPayloadWrapper) {
 				value = ((EventPayloadWrapper) value).getWrapped();
 			}

            //Finds the Student object and sets it in the StudentModelBean
            //Sets the Porject null in the ProjectModelBean
            //This way we can choose between the views in one portlet
 			String studenthskaId = (String) value;
 			ReceivedFeedbackStudentModelBean receivedFeedbackStudentModelBean = getReceivedFeedbackStudentModelBean(facesContext);
 			receivedFeedbackStudentModelBean.setSelectedStudent(StudentLocalServiceUtil.findByStudenthskaId(studenthskaId));
 			
 			ReceivedFeedbackProjectModelBean receivedFeedbackProjectModelBean = getReceivedFeedbackProjectModelBean(facesContext);
 			receivedFeedbackProjectModelBean.setSelectedProject(null);

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

            //Finds the Project object and sets it in the ProjectModelBean
            //Sets the Student null in the StudentModelBean
            //This way we can choose between the views in one portlet
 			String projecthskaId = (String) value;
 			ReceivedFeedbackStudentModelBean receivedFeedbackStudentModelBean = getReceivedFeedbackStudentModelBean(facesContext);
 			receivedFeedbackStudentModelBean.setSelectedStudent(null);
 			
 			ReceivedFeedbackProjectModelBean receivedFeedbackProjectModelBean = getReceivedFeedbackProjectModelBean(facesContext);
 			receivedFeedbackProjectModelBean.setSelectedProject(ProjectLocalServiceUtil.findByProjecthskaId(projecthskaId));

 			String fromAction = null;
 			String outcome = "ipc.projectSelected";
 			eventNavigationResult = new EventNavigationResult(fromAction, outcome);
         }
         
         log.debug("END: handleEvent");
         return eventNavigationResult;
	}
	
	/**
	 * Gets the ReceivedFeedbackStudentModelBean
	 */
	protected ReceivedFeedbackStudentModelBean getReceivedFeedbackStudentModelBean(FacesContext facesContext) {
		String elExpression = "#{receivedFeedbackStudentModelBean}";
		ELContext elContext = facesContext.getELContext();
		ValueExpression valueExpression = facesContext.getApplication().getExpressionFactory().createValueExpression(
				elContext, elExpression, ReceivedFeedbackStudentModelBean.class);

		return (ReceivedFeedbackStudentModelBean) valueExpression.getValue(elContext);
	}
	
	/**
	 * Gets the ReceivedFeedbackProjectModelBean
	 */
	protected ReceivedFeedbackProjectModelBean getReceivedFeedbackProjectModelBean(FacesContext facesContext) {
		String elExpression = "#{receivedFeedbackProjectModelBean}";
		ELContext elContext = facesContext.getELContext();
		ValueExpression valueExpression = facesContext.getApplication().getExpressionFactory().createValueExpression(
				elContext, elExpression, ReceivedFeedbackProjectModelBean.class);

		return (ReceivedFeedbackProjectModelBean) valueExpression.getValue(elContext);
	}
}