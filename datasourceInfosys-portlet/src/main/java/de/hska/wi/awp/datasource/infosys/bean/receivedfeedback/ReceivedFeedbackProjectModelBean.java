package de.hska.wi.awp.datasource.infosys.bean.receivedfeedback;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.PieChartModel;

import de.hska.wi.awp.datasource.infosys.model.Project;
import de.hska.wi.awp.datasource.infosys.service.FeedbackLocalServiceUtil;

@ManagedBean(name = "receivedFeedbackProjectModelBean")
@SessionScoped
public class ReceivedFeedbackProjectModelBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8317788674222552215L;
	private Project selectedProject;
	private PieChartModel contributionChartModel;
	private int feedbackRoundNr = 1;
	
	private PieChartModel initBarModel() {
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

	public PieChartModel getContributionChartModel() {
		return initBarModel();
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
