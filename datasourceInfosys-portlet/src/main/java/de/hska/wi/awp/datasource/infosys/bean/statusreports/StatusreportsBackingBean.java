package de.hska.wi.awp.datasource.infosys.bean.statusreports;

import java.io.IOException;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import org.primefaces.model.DefaultStreamedContent;

import com.itextpdf.text.DocumentException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import de.hska.wi.awp.datasource.infosys.bean.statusreports.pdf.StatusreportsToPDF;
import de.hska.wi.awp.datasource.infosys.model.Statusberichte;
import de.hska.wi.awp.datasource.infosys.service.StatusberichteLocalServiceUtil;

/**
 * Portlet implementation class Statusreports
 */

@ManagedBean(name = "statusreportsBackingBean")
@RequestScoped
public class StatusreportsBackingBean implements Serializable {

	/**
	 * Serializable
	 */
	private static final long serialVersionUID = -3571598645294714047L;

	public void init() {
		// viewTemplate = getInitParameter("view-template");
	}

	@ManagedProperty(name = "statusreportsModelBean", value = "#{statusreportsModelBean}")
	private StatusreportsModelBean statusreportsModelBean;

	/**
     * Invoking the method which creates the StatusreportPDF
     */
	public DefaultStreamedContent getStatusreportsPDF(long berichtid)
			throws IOException, DocumentException, SystemException,
			PortalException {
		
		Statusberichte bericht = StatusberichteLocalServiceUtil
				.getStatusberichte(berichtid);
		return StatusreportsToPDF.CreateStatusreportPDF(bericht);
	}

	// Getter/Setter
	public StatusreportsModelBean getStatusreportsModelBean() {
		return statusreportsModelBean;
	}

	public void setStatusreportsModelBean(
			StatusreportsModelBean statusreportsModelBean) {
		this.statusreportsModelBean = statusreportsModelBean;
	}

}
