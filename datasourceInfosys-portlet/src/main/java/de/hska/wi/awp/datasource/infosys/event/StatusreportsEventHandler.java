package de.hska.wi.awp.datasource.infosys.event;

import java.io.Serializable;

import javax.el.ELContext;
import javax.el.ValueExpression;
import javax.faces.context.FacesContext;
import javax.portlet.Event;
import javax.portlet.faces.BridgeEventHandler;
import javax.portlet.faces.event.EventNavigationResult;

import com.liferay.faces.bridge.event.EventPayloadWrapper;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import de.hska.wi.awp.datasource.infosys.bean.statusreports.StatusreportsModelBean;
import de.hska.wi.awp.datasource.infosys.model.Project;
import de.hska.wi.awp.datasource.infosys.model.Student;
import de.hska.wi.awp.datasource.infosys.service.ProjectLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.StudentLocalServiceUtil;

public class StatusreportsEventHandler implements BridgeEventHandler {
	@Override
	public EventNavigationResult handleEvent(FacesContext facesContext, Event event) {
		 EventNavigationResult eventNavigationResult = null;
         String eventQName = event.getQName().toString();

         System.out.println("Eventhandler statusreports wurde aufgerufen");
         
         if (eventQName.equals("{http://liferay.com/events}ipc.studentSelected")) {
             System.out.print("EVENT RECIVED STUDENT");
             
             Serializable value = event.getValue();
             
            if (value instanceof EventPayloadWrapper) {
 				value = ((EventPayloadWrapper) value).getWrapped();
 			}

 			String studenthskaId = (String) value;
 			Student student = StudentLocalServiceUtil.findByStudenthskaId(studenthskaId);
 			
 			Project project = null;
			try {
				project = ProjectLocalServiceUtil.getProject(student.getProject_id());
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
 			
 			StatusreportsModelBean statusreportsModelBean = getStatusreportsModelBean(facesContext);
 			statusreportsModelBean.setSelectedProject(project);
 			
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

 			String projecthskaId = (String) value;
 			
 			System.out.println("Event received statusreport  " + projecthskaId);
 			StatusreportsModelBean statusreportsModelBean = getStatusreportsModelBean(facesContext);
 			statusreportsModelBean.setSelectedProject(ProjectLocalServiceUtil.findByProjecthskaId(projecthskaId));

 			String fromAction = null;
 			String outcome = "ipc.projectSelected";
 			eventNavigationResult = new EventNavigationResult(fromAction, outcome);
         }
         return eventNavigationResult;
	}
	
	protected StatusreportsModelBean getStatusreportsModelBean(FacesContext facesContext) {
		String elExpression = "#{statusreportsModelBean}";
		ELContext elContext = facesContext.getELContext();
		ValueExpression valueExpression = facesContext.getApplication().getExpressionFactory().createValueExpression(
				elContext, elExpression, StatusreportsModelBean.class);

		return (StatusreportsModelBean) valueExpression.getValue(elContext);
	}
}
