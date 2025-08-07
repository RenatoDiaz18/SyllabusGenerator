/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Clases.Desempeño;
import Clases.Semana;
import Clases.Silabo;
import Clases.Unidad;
import static Data.Data.*;
import ClasesSoporte.HabilidadRequerida;
import Paneles.JPGestionUnidades;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.UnitValue;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import prototipo.JFPrincipal;

/**
 *
 * @author USUARIO11
 */
public class CrearSilabo {
    private Silabo Silabus;
    private List<Desempeño> desem = new ArrayList<>();
     
    public CrearSilabo(Silabo silabo) {
        Silabus = silabo;
        desem = silabo.getDesempeños();
    }
    
    
    public void Crear(){
        File fichero = new File("Estru.pdf");
        try {
            PdfWriter pdfWriter = new PdfWriter(fichero);
            PdfDocument pdfdocument = new PdfDocument(pdfWriter);
            Document document = new Document(pdfdocument);
       try {
    ImageData imageData = ImageDataFactory.create("src/img/EscudoPedro.jpeg");
    Image escudoPedro = new Image(imageData).scaleToFit(60, 60);

    ImageData imageData2 = ImageDataFactory.create("src/img/EscudoFacfym.jpeg");
    Image escudoFACYM = new Image(imageData2).scaleToFit(60, 60);

   float ancho[] = {1,4,1};
   Table tablaInicial = new Table(ancho);
   tablaInicial.setWidth(UnitValue.createPercentValue(100));
        // Celda izquierda (logo universidad)
        tablaInicial.addCell(new Cell().add(escudoPedro)
                .setTextAlignment(TextAlignment.CENTER)
                .setBorder(Border.NO_BORDER));

        // Celda central (texto institucional)
        Paragraph textoCentral = new Paragraph("UNIVERSIDAD NACIONAL “PEDRO RUIZ GALLO”\n"
                + "Facultad de Ciencias Físicas y Matemáticas\n"
                + "ESCUELA PROFESIONAL DE INGENIERÍA EN COMPUTACIÓN E INFORMÁTICA\n"
                + "Departamento Académico de Computación y Electrónica")
                .setTextAlignment(TextAlignment.CENTER)
                .setFontSize(12)
                .setBold();
        tablaInicial.addCell(new Cell().add(textoCentral)
                .setTextAlignment(TextAlignment.CENTER)
                .setBorder(Border.NO_BORDER));

        // Celda derecha (logo facultad)
        tablaInicial.addCell(new Cell().add(escudoFACYM)
                .setTextAlignment(TextAlignment.CENTER)
                .setBorder(Border.NO_BORDER));
    
    // Aquí puedes añadir el código para agregarlos al documento PDF, por ejemplo:
    document.add(tablaInicial);

} catch (MalformedURLException e) {
    System.err.println("La ruta a la imagen es incorrecta: " + e.getMessage());
} catch (IOException e) {
    System.err.println("Error al leer la imagen: " + e.getMessage());
}    
    
            Paragraph p = new Paragraph("\nI. INFORMACIÓN GENERAL");
            p.setFontSize(11); 
            p.setBold();
            p.setPaddingBottom(-5); 
            document.add(p);
            
            p = new Paragraph("1.1.  Programación de Estudios   :" +Silabus.getEscuelaProfesional());
            p.setTextAlignment(TextAlignment.LEFT);
            p.setFontSize(10); 
            p.setPaddingLeft(20);
            p.setPaddingBottom(-25); 
            document.add(p);
            
            p = new Paragraph("\n1.2.  Escuela Profesional             :" + Silabus.getEscuelaProfesional());
            p.setTextAlignment(TextAlignment.LEFT);
            p.setFontSize(10); 
            p.setPaddingLeft(20);
            p.setPaddingBottom(-25);
            document.add(p);
            
            p = new Paragraph("\n1.3.  Modalidad                            :" +Silabus.getModalidad());
            p.setTextAlignment(TextAlignment.LEFT);
            p.setFontSize(10); 
            p.setPaddingLeft(20);
            p.setPaddingBottom(-25);
            document.add(p);
            
            p = new Paragraph("\n1.4.  Curso                                   :" + Silabus.getCurso());
            p.setTextAlignment(TextAlignment.LEFT);
            p.setFontSize(10); 
            p.setPaddingLeft(20);
            p.setPaddingBottom(-25);
            document.add(p);
            
            p = new Paragraph("\n1.4.  Prerequisitos                        :" + "Falta esto xddddd");
            p.setTextAlignment(TextAlignment.LEFT);
            p.setFontSize(10); 
            p.setPaddingLeft(20);
            p.setPaddingBottom(-25);
            document.add(p);
            
            p = new Paragraph("\n1.4.  Codigo                                 :" +Silabus.getCodigoCurso());
            p.setTextAlignment(TextAlignment.LEFT);
            p.setFontSize(10); 
            p.setPaddingLeft(20);
            p.setPaddingBottom(-25);
            document.add(p);
            
            p = new Paragraph("\n1.4. Periodo Academico              :" + "   III ciclo");
            p.setTextAlignment(TextAlignment.LEFT);
            p.setFontSize(10); 
            p.setPaddingLeft(20);
            p.setPaddingBottom(-25);
            document.add(p);
            
            p = new Paragraph("\n1.4.  Credito                           :"+ Silabus.getCreditos());
            p.setTextAlignment(TextAlignment.LEFT);
            p.setFontSize(10); 
            p.setPaddingLeft(20);
            p.setPaddingBottom(-25);
            document.add(p);
           
            p = new Paragraph("\n1.4.  Horas Semanales                    :" + Silabus.getHorasSemanales());
            p.setTextAlignment(TextAlignment.LEFT);
            p.setFontSize(10); 
            p.setPaddingLeft(20);
            p.setPaddingBottom(-25);
            document.add(p);
            
            p = new Paragraph("\n1.4.  Teoria                   :" + Silabus.getHorasTeoricas());
            p.setTextAlignment(TextAlignment.LEFT);
            p.setFontSize(10); 
            p.setPaddingLeft(40);
            p.setPaddingBottom(-25);
            document.add(p); 
            
            p = new Paragraph("\n1.4.  Practica                   :" + Silabus.getHorasPracticas());
            p.setTextAlignment(TextAlignment.LEFT);
            p.setFontSize(10); 
            p.setPaddingLeft(40);
            p.setPaddingBottom(-25);
            document.add(p); 
            
            
            p = new Paragraph("\n1.4.  Duración                  :" +Silabus.getDuracion());
            p.setTextAlignment(TextAlignment.LEFT);
            p.setFontSize(10); 
            p.setPaddingLeft(20);
            p.setPaddingBottom(-25);
            document.add(p);
            
            p = new Paragraph("\n     Fecha Inicio                  :" +Silabus.getInicioDuracion());
            p.setTextAlignment(TextAlignment.LEFT);
            p.setFontSize(10); 
            p.setPaddingLeft(20);
            p.setPaddingBottom(-10);
            document.add(p);
            
            p = new Paragraph("     Fecha de Término             :" +Silabus.getFinalDuracion());
            p.setTextAlignment(TextAlignment.LEFT);
            p.setFontSize(10); 
            p.setPaddingLeft(20);
            p.setPaddingBottom(-20);
            document.add(p);
            
            p = new Paragraph("\n     Docente                  :" + docenteLogged.getUserName());
            p.setTextAlignment(TextAlignment.LEFT);
            p.setFontSize(10); 
            p.setPaddingLeft(20);
            p.setPaddingBottom(-25);
            document.add(p);
            
            p = new Paragraph("\n" +docenteLogged.getCorreo());
            p.setTextAlignment(TextAlignment.LEFT);
            p.setFontSize(10); 
            p.setPaddingLeft(110);
            p.setPaddingBottom(-25);
            document.add(p);
            
            p = new Paragraph("\nII. SUMILLA");
            p.setFontSize(11); 
            p.setBold();
            p.setPaddingBottom(-15); 
            document.add(p);
            
            p = new Paragraph(Silabus.getSumilla());
            p.setTextAlignment(TextAlignment.JUSTIFIED_ALL);
            p.setTextAlignment(TextAlignment.LEFT);
            p.setFontSize(10); 
            p.setPaddingLeft(20);
            p.setPaddingBottom(-20);
            document.add(p);
            
            p = new Paragraph("\nIII. COMPETENCIA PROFESIONAL");
            p.setFontSize(11); 
            p.setBold();
            p.setPaddingBottom(-10); 
            document.add(p);
            
            p = new Paragraph(Silabus.getCompetenciasProf());
            p.setTextAlignment(TextAlignment.LEFT);
            p.setFontSize(10); 
            p.setPaddingLeft(20);
            p.setPaddingBottom(0); 
            document.add(p);
            
            p = new Paragraph("\nIV.  CAPACIDAD DEL CURSO");
            p.setFontSize(11); 
            p.setBold();
            p.setPaddingBottom(-10); 
            document.add(p);
            
            p = new Paragraph(Silabus.getCapacidadCurso());
            p.setTextAlignment(TextAlignment.LEFT);
            p.setFontSize(10); 
            p.setPaddingLeft(20);
            p.setPaddingBottom(-25); 
            document.add(p);
           
            
            p = new Paragraph("\nV.  DESEMPEÑO DE LAS UNIDADES DIDÁCTICAS");
            p.setFontSize(11); 
            p.setBold();
            p.setPaddingBottom(-10); 
            document.add(p);
           
            int i=1;
            for (Desempeño desempeño : desem) {
            p= new Paragraph("D" + String.valueOf(i) +": " + desempeño.getDescripcion());
            p.setTextAlignment(TextAlignment.LEFT);
            p.setFontSize(10); 
            p.setPaddingLeft(20);
            p.setPaddingBottom(0);
            p.setBold();
            document.add(p);   
            i++;
            }
            p = new Paragraph("\nVI.  PROGRAMA DE CONTENIDOS");
            p.setFontSize(11); 
            p.setBold();
            p.setMarginTop(200);
            document.add(p);
            
            i =1;
            int n= 0;
            
            for (Unidad unis: Silabus.getUnidades()) {
            String numero = cambiarNumero(i);
            
            float[] ancho = {2,2,2,2,2,2};
            Table tabla = new Table(ancho);
            tabla.setWidth(UnitValue.createPercentValue(100));
            p = new Paragraph("UNIDAD " + numero + ": " + unis.getNombreUnidad());
            p.setTextAlignment(TextAlignment.CENTER);
            p.setBold();
            
            tabla.addCell(new Cell(1,6).add(p).setBackgroundColor(com.itextpdf.kernel.colors.ColorConstants.LIGHT_GRAY));
            
            p = new Paragraph("Desempeño");
            p.setBold();
            p.setTextAlignment(TextAlignment.CENTER);
            tabla.addCell(new Cell().add(p).setBackgroundColor(com.itextpdf.kernel.colors.ColorConstants.LIGHT_GRAY));
            
            p = new Paragraph("Habilidad Requeridas");
            p.setBold();
            p.setTextAlignment(TextAlignment.CENTER);
            tabla.addCell(new Cell().add(p).setBackgroundColor(com.itextpdf.kernel.colors.ColorConstants.LIGHT_GRAY));
            
            p = new Paragraph("Semana(Fecha)");
            p.setBold();
            p.setTextAlignment(TextAlignment.CENTER);
            tabla.addCell(new Cell().add(p).setBackgroundColor(com.itextpdf.kernel.colors.ColorConstants.LIGHT_GRAY));
            
            p = new Paragraph("Conocimiento");
            p.setBold();
            p.setTextAlignment(TextAlignment.CENTER);
            tabla.addCell(new Cell().add(p).setBackgroundColor(com.itextpdf.kernel.colors.ColorConstants.LIGHT_GRAY));
            
            p = new Paragraph("Actividades");
            p.setBold();
            p.setTextAlignment(TextAlignment.CENTER);
            tabla.addCell(new Cell().add(p).setBackgroundColor(com.itextpdf.kernel.colors.ColorConstants.LIGHT_GRAY));
            
            p = new Paragraph("Evidencias de Aprendizajes");
            p.setBold();
            p.setTextAlignment(TextAlignment.CENTER);
            tabla.addCell(new Cell().add(p).setBackgroundColor(com.itextpdf.kernel.colors.ColorConstants.LIGHT_GRAY));
            
            
            p = new Paragraph(unis.getDesempeño());
            p.setBold();
            p.setTextAlignment(TextAlignment.CENTER);
            tabla.addCell(new Cell(unis.getSemanas().size(),1).add(p));
            
            int m = 0;
            int j= 0;
            int l = 0;
            for (HabilidadRequerida habilidad : unis.getHabilidades()) {    
            p = new Paragraph(habilidad.getDescripcion());
            p.setBold();
            p.setTextAlignment(TextAlignment.CENTER);
            tabla.addCell(new Cell((habilidad.getRango().getSemanaFin() - habilidad.getRango().getSemanaInicio()), 1).add(p));
            
           for (int k = 0 ; k < (habilidad.getRango().getSemanaFin() - habilidad.getRango().getSemanaInicio()) ; k++) {
            p = new Paragraph("semana " + (n+1));
            p.setBold();
            p.setTextAlignment(TextAlignment.CENTER);
            tabla.addCell(new Cell().add(p));
            
            p = new Paragraph(unis.getSemanas().get(m).getConocimientos());
            p.setBold();
            p.setTextAlignment(TextAlignment.CENTER);
            tabla.addCell(new Cell().add(p));
            
            p = new Paragraph(unis.getSemanas().get(m).getActividades());
            p.setBold();
            p.setTextAlignment(TextAlignment.CENTER);
            tabla.addCell(new Cell().add(p));
            if (!(m < unis.getEvidencias().get(j).getRango().getSemanaFin() && m > unis.getEvidencias().get(j).getRango().getSemanaInicio())){
            p = new Paragraph(unis.getEvidencias().get(j).getDescripcion());
            p.setBold();
            p.setTextAlignment(TextAlignment.CENTER);
            tabla.addCell(new Cell((unis.getEvidencias().get(l).getRango().getSemanaFin() - unis.getEvidencias().get(l).getRango().getSemanaInicio()),1).add(p));
             l++;
             j = l-1;
               }
            n++;
            m++;
               }
            }
            tabla.setMarginBottom(20);
            document.add(tabla);
            i++;
            }
            
            
            //Sistema de EVALUACIONES
            p = new Paragraph("\nVII.  SISTEMA DE EVALUACIÓN");
            p.setFontSize(11); 
            p.setBold();
            p.setPaddingBottom(0); 
            document.add(p);
            
            float []anchoSE ={2,2,2,2};
            Table tablaSE = new Table(anchoSE);
            tablaSE.setWidth(UnitValue.createPercentValue(100));
            
            p = new Paragraph("Desempeño");
            p.setBold();
            tablaSE.addHeaderCell(new Cell().add(p).setBackgroundColor(com.itextpdf.kernel.colors.ColorConstants.LIGHT_GRAY));
            
            p = new Paragraph("Habilidades Requeridas");
            p.setBold();
            tablaSE.addHeaderCell(new Cell().add(p).setBackgroundColor(com.itextpdf.kernel.colors.ColorConstants.LIGHT_GRAY));
            
            p = new Paragraph("Evidencias de Aprendizajes");
            p.setBold();
            tablaSE.addHeaderCell(new Cell().add(p).setBackgroundColor(com.itextpdf.kernel.colors.ColorConstants.LIGHT_GRAY));
            
            p = new Paragraph("Instrumentos de Evaluación");
            p.setBold();
            tablaSE.addHeaderCell(new Cell().add(p).setBackgroundColor(com.itextpdf.kernel.colors.ColorConstants.LIGHT_GRAY));
            
            for (Unidad unis : Silabus.getUnidades()) {
            p = new Paragraph(unis.getDesempeño());
            p.setBold();
            p.setTextAlignment(TextAlignment.CENTER);
            tablaSE.addCell(new Cell(unis.getSemanas().size(),1).add(p));
      
            int z = 0;
            for (HabilidadRequerida habilidad : unis.getHabilidades()) {
            p = new Paragraph(habilidad.getDescripcion());
            p.setBold();
            p.setTextAlignment(TextAlignment.CENTER);
            tablaSE.addCell(new Cell(habilidad.getRango().getSemanaFin() - habilidad.getRango().getSemanaInicio(),1).add(p));
            for (int j = 0; j < (habilidad.getRango().getSemanaFin() - habilidad.getRango().getSemanaInicio()); j++) {
                p = new Paragraph("Hola tengo Hambre");
                p.setBold();
                p.setTextAlignment(TextAlignment.CENTER);
                tablaSE.addCell(new Cell().add(p));
                 
                p = new Paragraph("HOLA TENGO MUCHA HAMBRE");
                p.setBold();
                p.setTextAlignment(TextAlignment.CENTER);
                tablaSE.addCell(new Cell().add(p));
                z++;
                } 
            } 
            }
             document.add(tablaSE);

            //Sistema de Calificaciones
            p = new Paragraph("\nVII.  SISTEMA DE CALIFICACIÓN");
            p.setFontSize(11); 
            p.setBold();
            p.setPaddingBottom(0); 
            document.add(p);
            
            
            p = new Paragraph();
            float[] anchoSistemaDeCalificaciòn = {4,2,2,2};
            
            Table tablaSC = new Table(anchoSistemaDeCalificaciòn);
            tablaSC.setWidth(UnitValue.createPercentValue(100));
            
            p = new Paragraph("Evidencia de Aprendizaje");
            p.setBold();
            tablaSC.addHeaderCell(new Cell().add(p).setBackgroundColor(com.itextpdf.kernel.colors.ColorConstants.LIGHT_GRAY));
            
            p = new Paragraph("Sigla");
            p.setBold();
            tablaSC.addHeaderCell(new Cell().add(p).setBackgroundColor(com.itextpdf.kernel.colors.ColorConstants.LIGHT_GRAY));      
            
            p = new Paragraph("Peso");
            p.setBold();
            tablaSC.addHeaderCell(new Cell().add(p).setBackgroundColor(com.itextpdf.kernel.colors.ColorConstants.LIGHT_GRAY));
            
            p = new Paragraph("Cronograma");
            p.setBold();
            tablaSC.addHeaderCell(new Cell().add(p).setBackgroundColor(com.itextpdf.kernel.colors.ColorConstants.LIGHT_GRAY));
            document.add(tablaSC);
            
            //METODOLOGÌA
            p = new Paragraph("\nIX.  METODOLOGÍA DE ENSEÑANZA - APRENDIZAJE Y ACTIVIDADES DE INVESTIGACIÓN\n FORMATIVA");
            p.setFontSize(11); 
            p.setBold();
            p.setPaddingBottom(0); 
            document.add(p);
            
            //ACTIVIDADES
            
            p = new Paragraph("\nX.  ACTIVIDADES DE TUTORÍA:ÁREA ACADÉMICA ");
            p.setFontSize(11); 
            p.setBold();
            p.setPaddingBottom(0); 
            document.add(p);
            
            //REFERENCIAS
            p = new Paragraph("\nXI. REFERENCIAS ");            
            p.setFontSize(11); 
            p.setBold();
            p.setPaddingBottom(0); 
            document.add(p);
            
            
            document.close();
            pdfdocument.close();
            
            JOptionPane.showMessageDialog(null,"PDF creado");
        } catch (FileNotFoundException ex) {
          System.out.println(ex.getMessage()); 
          Logger.getLogger(JFPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private String cambiarNumero(int numero){
        switch (numero) {
            case 1:
                return "I";
            case 2:
                return "II";    
            case 3:
                return "III";    
            case 4:
                return "IV";    
            case 5:
                return "V";    
        }
        
      return "";  
    }
    
}
