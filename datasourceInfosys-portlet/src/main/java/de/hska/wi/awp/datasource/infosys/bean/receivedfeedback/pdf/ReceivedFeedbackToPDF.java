package de.hska.wi.awp.datasource.infosys.bean.receivedfeedback.pdf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import org.primefaces.model.DefaultStreamedContent;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfName;
import com.itextpdf.text.pdf.PdfNumber;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPage;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfWriter;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import de.hska.wi.awp.datasource.infosys.model.Bewertungskriterium;
import de.hska.wi.awp.datasource.infosys.model.Feedback;
import de.hska.wi.awp.datasource.infosys.model.Project;
import de.hska.wi.awp.datasource.infosys.model.Student;
import de.hska.wi.awp.datasource.infosys.model.Teilnote_feedback;
import de.hska.wi.awp.datasource.infosys.service.BewertungskriteriumLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.FeedbackLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.StudentLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.service.Teilnote_feedbackLocalServiceUtil;

/**
 * @author Daniel Storch
 */
public class ReceivedFeedbackToPDF {

	/**
     * Logger Util
     */	
	private static final Log log = LogFactoryUtil.getLog(ReceivedFeedbackToPDF.class);
	
	/**
	 * This method creates the whole Feedback PDF
	 */
	public static DefaultStreamedContent CreateFeedbackPDF(int roundNr, Project project) throws IOException, DocumentException {
		log.debug("BEGIN: CreateFeedbackPDF");
		
		// various fonts
        BaseFont bf_helv = BaseFont.createFont(BaseFont.HELVETICA, "Cp1252", false);
        Font titleFont = new Font(bf_helv, 22,Font.BOLD);
        Font subTitleFont = new Font(bf_helv, 16);
        Font headerCellFont = new Font(bf_helv, 10,Font.BOLD);
        Font cellFont = new Font(bf_helv, 10);
        
        // PDF File name
		String fileName = project.getProjecthskaId() + "Feedback.pdf";
		File pdfFile = new File(fileName);
		OutputStream file = new FileOutputStream(pdfFile);
	     
		// Creates document and PdfWriter
	    Document document = new Document();
	    PdfWriter writer = PdfWriter.getInstance(document, file);
        Rotate rotation = new Rotate();
        //Sets pageEvent so we are able to rotate some pages to LandScape
        writer.setPageEvent(rotation);

        document.open();
        
        //FrontPage
        //Title of the Page
        String frontPageTitleString = "Feedback zu allen Teilnehmern des Projekts " + project.getProjecthskaId();
        Paragraph frontPageParagrahTitle = new Paragraph(frontPageTitleString ,titleFont);
        frontPageParagrahTitle.setAlignment(Element.ALIGN_CENTER);
        document.add(frontPageParagrahTitle);
        
        //NewLine
        Paragraph newLine = new Paragraph(" ");
        document.add(newLine);
        
        //SubTitle with Roundnumber of the Feedback
        String frontPageSubTitleString = "Runde: " + roundNr;
        Paragraph frontPageSubTitle = new Paragraph(frontPageSubTitleString ,subTitleFont);
        frontPageSubTitle.setAlignment(Element.ALIGN_CENTER);
        document.add(frontPageSubTitle);
        
        //Sets image of the FrontPage
        if(Image.getInstance(ReceivedFeedbackToPDF.class.getResource("logo_hska.png")) != null) {
        	Image imgHSKA = Image.getInstance(ReceivedFeedbackToPDF.class.getResource("logo_hska.png"));
            imgHSKA.scaleAbsolute(230, 75);
            imgHSKA.setAbsolutePosition(70,(PageSize.A4.getHeight() - imgHSKA.getScaledHeight()) / 2);
            document.add(imgHSKA);
        }

        if(Image.getInstance(ReceivedFeedbackToPDF.class.getResource("logo_HWB.png")) != null) {
        	Image imgHWB = Image.getInstance(ReceivedFeedbackToPDF.class.getResource("logo_HWB.png"));
            imgHWB.scaleAbsolute(230, 200);
            imgHWB.setAbsolutePosition(PageSize.A4.getWidth() - 300,(PageSize.A4.getHeight() - imgHWB.getScaledHeight()) / 2);
            document.add(imgHWB);
        }
        
        //Document information
        document.addAuthor("Daniel Storch");
        document.addCreationDate();
        document.addTitle("Feedback PDF");
        
        
        //Get all students of selected project
        List<Student> studentsOfGroupe = StudentLocalServiceUtil.findByProjectId(project.getPrimaryKey());
        List<Bewertungskriterium> allBewertungskriterium = BewertungskriteriumLocalServiceUtil.getAllBewertungskriterium();
		for(int j = 0; j < studentsOfGroupe.size(); j++) {
			//New pgae for every student and rotate it to Landscape
			document.setPageSize(PageSize.A4.rotate());
			document.newPage();
			rotation.setRotation(PdfPage.LANDSCAPE);
			
			//Student Name
			String studentName = studentsOfGroupe.get(j).getFirstName() + " " + studentsOfGroupe.get(j).getLastName();
			Paragraph studentNameTitle = new Paragraph(studentName ,titleFont);
			studentNameTitle.setAlignment(Element.ALIGN_CENTER);
	        document.add(studentNameTitle);
	        
	        //NewLine
	        document.add(newLine);
	        
	        List<Feedback> allFeedbacksOfStudent = FeedbackLocalServiceUtil.findByStudent_idAndFeedback_runden_nr(studentsOfGroupe.get(j).getPrimaryKey(), roundNr);
	        
	        //Comment Table
	        PdfPTable pdfTableComment = new PdfPTable(2);
	        
	        //Header cell for the beitrag comments
	        PdfPCell cell = new PdfPCell(new Phrase("Beitrag Kommentar", headerCellFont));
    		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
    		pdfTableComment.addCell(cell);
    		
    		//Header celle for the Kompetenz comments
    		cell = new PdfPCell(new Phrase("Kompetenz Kommentar", headerCellFont));
    		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
    		pdfTableComment.addCell(cell);
    		
	        //Table for all the criteria values
	        PdfPTable pdfTableBewertung = new PdfPTable(allBewertungskriterium.size() + 2);
	        
	        //Header celle for Eigenbewertung
	        cell = new PdfPCell(new Phrase("Eigenbewertung", headerCellFont));
    		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
    		pdfTableBewertung.addCell(cell);
    		
    		//Header celle for Beitrag
    		cell = new PdfPCell(new Phrase("Beitrag", headerCellFont));
    		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
    		pdfTableBewertung.addCell(cell);
	        
    		//Average contribution of the student
			Paragraph averageContribution = new Paragraph("Durchschnittlicher Beitrag: " + Integer.toString(FeedbackLocalServiceUtil.averageContributionOfStudent(studentsOfGroupe.get(j).getId(), roundNr)));
			averageContribution.setAlignment(Element.ALIGN_CENTER);
	        document.add(averageContribution);
	        document.add(newLine);
	        
    		//Header cellen for all the criteria
	        for(int x = 0; x < allBewertungskriterium.size(); x++) {
        		cell = new PdfPCell(new Phrase(allBewertungskriterium.get(x).getName(), headerCellFont));
        		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        		pdfTableBewertung.addCell(cell);
        	}
	        
	        //Fills the Table for the criteria of the Feedback
	        for(int i = 0; i < allFeedbacksOfStudent.size(); i++) {
	        	long feedback_id = allFeedbacksOfStudent.get(i).getPrimaryKey();
	        	
	        	cell = new PdfPCell(new Phrase(allFeedbacksOfStudent.get(i).getKommentar_beitrag(), cellFont));
         		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
         		pdfTableComment.addCell(cell);
         		
         		cell = new PdfPCell(new Phrase(allFeedbacksOfStudent.get(i).getKommentar_kompetenzen(), cellFont));
         		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
         		pdfTableComment.addCell(cell);
         		
	        	//Checks for the feedback self given by the Student
	        	String eigenbewertung = allFeedbacksOfStudent.get(i).getEigenbewertung();
	        	if(eigenbewertung.endsWith("r")) {
	        		eigenbewertung = "x";
	        	}else {
	        		eigenbewertung = "";
	        	}
	        	cell = new PdfPCell(new Phrase(eigenbewertung, cellFont));
         		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
         		pdfTableBewertung.addCell(cell);
         		
         		String beitrag = Integer.toString(allFeedbacksOfStudent.get(i).getBeitrag());
         		cell = new PdfPCell(new Phrase(beitrag));
         		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
         		pdfTableBewertung.addCell(cell);
         		
	        	 for(int x = 0; x < allBewertungskriterium.size(); x++) {
	         		long bewertungskriterium_id = allBewertungskriterium.get(x).getPrimaryKey();
	         		Teilnote_feedback teilnote = Teilnote_feedbackLocalServiceUtil.findByFeedback_idAndBewertungskriterium_id(feedback_id, bewertungskriterium_id);
	         		//TODO derzeit arbeiten wir nur mit gemockten daten, daher gibt es nicht für jeden stundenten eine teilnote. Muss abgefangen werden.
	         		String feedbackValue = "leer";
	         		if(teilnote != null) {
	         			feedbackValue = Integer.toString(teilnote.getNote());
	         		}
	         		cell = new PdfPCell(new Phrase(feedbackValue, cellFont));
	         		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	         		pdfTableBewertung.addCell(cell);
	         	}
	        }
	        //Adds the criteria table to the document
	        document.add(pdfTableBewertung);
	        
	        //Title for the comment table
			Paragraph commentTitle = new Paragraph("Kommentare" ,subTitleFont);
			commentTitle.setAlignment(Element.ALIGN_CENTER);
	        document.add(commentTitle);
	        document.add(newLine);
	        
	        //Adds the comment table
	        document.add(pdfTableComment);
		}
        document.close();
        file.close();

        log.debug("END: CreateFeedbackPDF");
        
        return new DefaultStreamedContent(new FileInputStream(pdfFile), "application/pdf", fileName);
	}
	 
	 //Inne Class which makes it possible to rotate pages
	 public static class Rotate extends PdfPageEventHelper {
	        protected PdfNumber rotation = PdfPage.PORTRAIT;
	        public void setRotation(PdfNumber rotation) {
	            this.rotation = rotation;
	        }
	        
	        public void onEndPage(PdfWriter writer, Document document) {
	            writer.addPageDictEntry(PdfName.ROTATE, rotation);
	        }
	 }
}
