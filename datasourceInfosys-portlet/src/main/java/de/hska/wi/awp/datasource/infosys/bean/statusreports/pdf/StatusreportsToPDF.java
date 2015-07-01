package de.hska.wi.awp.datasource.infosys.bean.statusreports.pdf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.primefaces.model.DefaultStreamedContent;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail;
import de.hska.wi.awp.datasource.infosys.model.Statusbericht_geplante_arbeit;
import de.hska.wi.awp.datasource.infosys.model.Statusbericht_info;
import de.hska.wi.awp.datasource.infosys.model.Statusberichte;
import de.hska.wi.awp.datasource.infosys.service.ProjectLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.Statusbericht_detailLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.Statusbericht_detail_punktLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.Statusbericht_geplante_arbeitLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.Statusbericht_infoLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.Statusbericht_info_punktLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.StudentLocalServiceUtil;

/**
 * @author Michael Lautenschlaeger
 */

public class StatusreportsToPDF {
	/**
	 * This method creates the whole Statusreport PDF
	 * 
	 * @throws SystemException
	 * @throws PortalException
	 */
	public static DefaultStreamedContent CreateStatusreportPDF(
			Statusberichte bericht) throws IOException, DocumentException,
			PortalException, SystemException {

		// various fonts
		BaseFont bf_helv = BaseFont.createFont(BaseFont.HELVETICA, "Cp1252",
				false);
		Font titleFont = new Font(bf_helv, 22, Font.BOLD);
		Font subTitleFont = new Font(bf_helv, 16);

		// PDF File name
		String fileName = "Statusreport.pdf";
		File pdfFile = new File(fileName);
		OutputStream file = new FileOutputStream(pdfFile);

		// Creates document and PdfWriter
		Document document = new Document();
		PdfWriter writer = PdfWriter.getInstance(document, file);

		document.open();

		// FrontPage
		// Title of the Page
		String frontPageTitleString = "Statusreport der Gruppe "
				+ ProjectLocalServiceUtil.getProject(bericht.getProject_id())
						.getProjecthskaId() + " der Kalenderwoche "
				+ bericht.getKalenderwoche();
		Paragraph frontPageParagrahTitle = new Paragraph(frontPageTitleString,
				titleFont);
		frontPageParagrahTitle.setAlignment(Element.ALIGN_CENTER);
		document.add(frontPageParagrahTitle);

		// NewLine
		Paragraph newLine = new Paragraph(" ");
		document.add(newLine);

		String OverviewTitle = "Satusüberblick";
		Paragraph subtitleoverview = new Paragraph(OverviewTitle, subTitleFont);
		document.add(subtitleoverview);
		document.add(newLine);
		// Document information
		document.addAuthor("InfoSysStatusreportPortlet");
		document.addCreationDate();
		document.addTitle("Statusreport PDF");

		// TblStatusoverview
		PdfPTable pdfTableOverview = new PdfPTable(3);
		for (Statusbericht_info i : Statusbericht_infoLocalServiceUtil
				.findByStatusbericht_id(bericht.getId())) {

			PdfPCell cellcharacteristic = new PdfPCell(new Phrase(
					Statusbericht_info_punktLocalServiceUtil
							.getStatusbericht_info_punkt(
									i.getStatusbericht_info_punkt_id())
							.getName()));

			String status;
			if (i.getStatus() == 1)
				status = "im plan";
			else if (i.getStatus() == 0)
				status = "kritisch";
			else
				status = "sehr kritisch";

			PdfPCell cellstatus = new PdfPCell(new Phrase(status));
			PdfPCell cellbemerkung = new PdfPCell(new Phrase(i.getBemerkung()));

			pdfTableOverview.addCell(cellcharacteristic);
			pdfTableOverview.addCell(cellstatus);
			pdfTableOverview.addCell(cellbemerkung);
		}
		document.add(pdfTableOverview);

		// TblGeneral
		PdfPTable pdfTableGeneral = new PdfPTable(2);
		for (Statusbericht_detail d : Statusbericht_detailLocalServiceUtil
				.findByStatusbericht_id(bericht.getId())) {

			PdfPCell cellcharacteristic = new PdfPCell(new Phrase(
					Statusbericht_detail_punktLocalServiceUtil
							.getStatusbericht_detail_punkt(
									d.getStatusbericht_detail_punkt_id())
							.getName()));
			PdfPCell cellbemerkung = new PdfPCell(new Phrase(d.getText()));

			pdfTableGeneral.addCell(cellcharacteristic);
			pdfTableGeneral.addCell(cellbemerkung);
		}
		document.add(newLine);

		String GeneralTitle = "Allgemeines";
		Paragraph subtitlegeneral = new Paragraph(GeneralTitle, subTitleFont);
		document.add(subtitlegeneral);
		document.add(newLine);
		document.add(pdfTableGeneral);

		// TblPlannedWork
		PdfPTable pdfTablePlannedWork = new PdfPTable(3);
		for (Statusbericht_geplante_arbeit ga : Statusbericht_geplante_arbeitLocalServiceUtil
				.findByStatusbericht_id(bericht.getId())) {
			PdfPCell cellworker = new PdfPCell(new Phrase(
					StudentLocalServiceUtil
							.getStudent(ga.getVerantwortlicher())
							.getFirstName()
							+ " "
							+ StudentLocalServiceUtil.getStudent(
									ga.getVerantwortlicher()).getLastName()));
			PdfPCell cellplannedwork = new PdfPCell(new Phrase(
					ga.getAktivitaet()));
			PdfPCell celluntil = new PdfPCell(new Phrase(ga.getBis_wann()
					.toString()));

			pdfTablePlannedWork.addCell(cellworker);
			pdfTablePlannedWork.addCell(cellplannedwork);
			pdfTablePlannedWork.addCell(celluntil);
		}

		String WorkTitle = "Geplante Arbeiten";
		Paragraph subtitlework = new Paragraph(WorkTitle, subTitleFont);
		document.add(subtitlework);
		document.add(newLine);
		document.add(pdfTablePlannedWork);

		document.close();
		file.close();

		return new DefaultStreamedContent(new FileInputStream(pdfFile),
				"application/pdf", fileName);
	}
}