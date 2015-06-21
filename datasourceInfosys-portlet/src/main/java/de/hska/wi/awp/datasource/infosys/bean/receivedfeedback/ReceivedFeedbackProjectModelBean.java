package de.hska.wi.awp.datasource.infosys.bean.receivedfeedback;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.model.chart.PieChartModel;

import com.liferay.faces.util.logging.Logger;
import com.liferay.faces.util.logging.LoggerFactory;

import de.hska.wi.awp.datasource.infosys.model.Project;
import de.hska.wi.awp.datasource.infosys.service.FeedbackLocalServiceUtil;

/**
 * ProjectModelBean
 * Creates the PieChart of the average contribution
 * Retains the selected project of the Navigation-Portlet
 * Retains the currently chosen round number
 * 
 * @author Daniel Storch
 */
@ManagedBean(name = "receivedFeedbackProjectModelBean")
@SessionScoped
public class ReceivedFeedbackProjectModelBean implements Serializable{

	/**
	 * Serializable
	 */
	private static final long serialVersionUID = 8317788674222552215L;
	
	/**
     * Logger Util
     */	
	private static final Logger logger = LoggerFactory.getLogger(ReceivedFeedbackProjectModelBean.class);
	
	/**
	 * This is the selected Porject from the NavigationPortlet
	 * The ReceivedFeedbackEventHandler sets this attribute when retrieving an Event
	 */
	private Project selectedProject;
	
	/**
	 * This PieCharModel is currently not used
	 * We use the getter to invoke the method initBarModel()
	 */
	private PieChartModel contributionChartModel;
	
	/**
	 * Retains the chosen round number from the p:selectOneMenu in the receivedFeedbackProject.xhtml
	 * Default round number 1 is set
	 */
	private int feedbackRoundNr = 1;
	
	/**
	 * Creates the PieCharModel
	 * average contribution of all Students from the selected Project
	 */
	private PieChartModel initPieChartModel() {
		PieChartModel contributionChartModel = new PieChartModel();
	    contributionChartModel.setShowDataLabels(true);
	    contributionChartModel.setLegendPosition("w");
	    contributionChartModel.setFill(false);
	        
        LinkedHashMap<String,Integer> contribution = new LinkedHashMap();
        if(this.selectedProject != null) {
        	contribution = FeedbackLocalServiceUtil.averageContributionOfPorject(this.selectedProject.getId(),feedbackRoundNr);
        }
        
        for (Entry<String, Integer> entry : contribution.entrySet()) {
        	contributionChartModel.set(entry.getKey(), entry.getValue());
        }
	    
	    return contributionChartModel;
    }

	public Project getSelectedProject() {
		return selectedProject;
	}

	public void setSelectedProject(Project selectedProject) {
		this.selectedProject = selectedProject;
	}

	/**
	 * gets the PieCharModel
	 */
	public PieChartModel getContributionChartModel() {
		return initPieChartModel();
	}

	public void setContributionChartModel(PieChartModel contributionChartModel) {
		this.contributionChartModel = contributionChartModel;
	}

	public int getFeedbackRoundNr() {
		return feedbackRoundNr;
	}

	public void setFeedbackRoundNr(int feedbackRoundNr) {
		this.feedbackRoundNr = feedbackRoundNr;
	}
}
