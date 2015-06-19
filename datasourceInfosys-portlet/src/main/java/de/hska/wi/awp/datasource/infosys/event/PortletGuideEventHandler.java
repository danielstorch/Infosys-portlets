package de.hska.wi.awp.datasource.infosys.event;

import java.io.Serializable;

import javax.el.ELContext;
import javax.el.ValueExpression;
import javax.faces.context.FacesContext;
import javax.portlet.Event;
import javax.portlet.faces.BridgeEventHandler;
import javax.portlet.faces.event.EventNavigationResult;

import com.liferay.faces.bridge.event.EventPayloadWrapper;

import de.hska.wi.awp.datasource.infosys.bean.portletGuide.PortletGuideProjectModelBean;
import de.hska.wi.awp.datasource.infosys.bean.portletGuide.PortletGuideStudentModelBean;
import de.hska.wi.awp.datasource.infosys.service.ProjectLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.StudentLocalServiceUtil;

public class PortletGuideEventHandler implements BridgeEventHandler{

	@Override
	public EventNavigationResult handleEvent(FacesContext facesContext, Event event) {
		 EventNavigationResult eventNavigationResult = null;
         String eventQName = event.getQName().toString();

         if (eventQName.equals("{http://liferay.com/events}ipc.studentSelected")) {
        	 
             Serializable value = event.getValue();
             
            if (value instanceof EventPayloadWrapper) {
 				value = ((EventPayloadWrapper) value).getWrapped();
 			}

 			String studenthskaId = (String) value;
 			
 			PortletGuideStudentModelBean portletGuideStudentModelBean = getPortletGuideStudentModelBean(facesContext);
 			portletGuideStudentModelBean.setSelectedStudent(StudentLocalServiceUtil.findByStudenthskaId(studenthskaId));
 			
 			PortletGuideProjectModelBean portletGuideProjectModelBean = getPortletGuideProjectModelBean(facesContext);
 			portletGuideProjectModelBean.setSelectedProject(null);

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
 			
 			PortletGuideStudentModelBean portletGuideStudentModelBean = getPortletGuideStudentModelBean(facesContext);
 			portletGuideStudentModelBean.setSelectedStudent(null);
 			
 			PortletGuideProjectModelBean portletGuideProjectModelBean = getPortletGuideProjectModelBean(facesContext);
 			portletGuideProjectModelBean.setSelectedProject(ProjectLocalServiceUtil.findByProjecthskaId(projecthskaId));

 			String fromAction = null;
 			String outcome = "ipc.projectSelected";
 			eventNavigationResult = new EventNavigationResult(fromAction, outcome);
         }
         
         return eventNavigationResult;
	}
	
	protected PortletGuideStudentModelBean getPortletGuideStudentModelBean(FacesContext facesContext) {
		String elExpression = "#{portletGuideStudentModelBean}";
		ELContext elContext = facesContext.getELContext();
		ValueExpression valueExpression = facesContext.getApplication().getExpressionFactory().createValueExpression(
				elContext, elExpression, PortletGuideStudentModelBean.class);

		return (PortletGuideStudentModelBean) valueExpression.getValue(elContext);
	}
	
	protected PortletGuideProjectModelBean getPortletGuideProjectModelBean(FacesContext facesContext) {
		String elExpression = "#{portletGuideProjectModelBean}";
		ELContext elContext = facesContext.getELContext();
		ValueExpression valueExpression = facesContext.getApplication().getExpressionFactory().createValueExpression(
				elContext, elExpression, PortletGuideProjectModelBean.class);

		return (PortletGuideProjectModelBean) valueExpression.getValue(elContext);
	}
}