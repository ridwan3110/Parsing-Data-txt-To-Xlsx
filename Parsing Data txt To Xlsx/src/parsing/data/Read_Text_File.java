/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parsing.data;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Drawing;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Picture;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.CellUtil;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author kiwong
 */
public class Read_Text_File {
     public static void main(String[] args) {
         GetallTxtFile();
       getValues();
       
    }

    public static ArrayList<String> getValues() {
        FileInputStream stream = null;
        try {
            stream = new FileInputStream("/home/kiwong/b.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
       
        
        
       //baca file 
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
         
         
         String strLine;
        
         
      
             
             //create xl template
             Workbook wb = new XSSFWorkbook();
             Sheet sheet = wb.createSheet("BNI");
             XSSFFont font = (XSSFFont) wb.createFont();
             font.setBold(true);
             
        //judul
             org.apache.poi.ss.usermodel.Cell celllenght = sheet.createRow(3).createCell(2);
             //celllenght.setCellValue("LENGHT"); //lenght
             Row rowheader = sheet.getRow(3);
             
              org.apache.poi.ss.usermodel.Cell cell0 = rowheader.getCell(0);
             if (cell0 == null) {
                 cell0 = rowheader.createCell(0);
             }
             cell0.setCellValue("Transcode");
             int widthUnits0 = 20*1000;
            sheet.setColumnWidth(0, widthUnits0);
             
             
             org.apache.poi.ss.usermodel.Cell cell1 = rowheader.getCell(1);
             if (cell1 == null) {
                 cell1 = rowheader.createCell(1);
             }
             cell1.setCellValue("LENGHT");
             int widthUnits = 20*150;
            sheet.setColumnWidth(1, widthUnits);
             
             org.apache.poi.ss.usermodel.Cell cell2 = rowheader.getCell(2);
             if (cell2 == null) {
                 cell2 = rowheader.createCell(2);
             }
             cell2.setCellValue("Record Indicator");
            sheet.setColumnWidth(2, widthUnits);
            
              org.apache.poi.ss.usermodel.Cell cell3 = rowheader.getCell(3);
             if (cell3 == null) {
                 cell3 = rowheader.createCell(3);
             }
             cell3.setCellValue("Transtype");
             sheet.setColumnWidth(3, widthUnits);
        
        org.apache.poi.ss.usermodel.Cell cell4 = rowheader.getCell(4);
             if (cell4 == null) {
                 cell4 = rowheader.createCell(4);
             }
             cell4.setCellValue("CAN");
              int widthUnits4 = 20*250;
             sheet.setColumnWidth(4, widthUnits4);
             
             
             
              org.apache.poi.ss.usermodel.Cell cell5 = rowheader.getCell(5);
             if (cell5 == null) {
                 cell5 = rowheader.createCell(5);
             }
             cell5.setCellValue("Transheader");
              int widthUnits5 = 20*250;
             sheet.setColumnWidth(5, widthUnits5);
             
             
             org.apache.poi.ss.usermodel.Cell cell6 = rowheader.getCell(6);
             if (cell6 == null) {
                 cell6 = rowheader.createCell(6);
             }
             cell6.setCellValue("TRP");
              int widthUnits6 = 20*150;
             sheet.setColumnWidth(6, widthUnits6);
        
             
             
               org.apache.poi.ss.usermodel.Cell cell7 = rowheader.getCell(7);
             if (cell7 == null) {
                 cell7 = rowheader.createCell(7);
             }
             cell7.setCellValue("Debit Option");
              int widthUnits7 = 20*150;
             sheet.setColumnWidth(7, widthUnits7);
             
             
               org.apache.poi.ss.usermodel.Cell cell8 = rowheader.getCell(8);
             if (cell8 == null) {
                 cell8 = rowheader.createCell(8);
             }
             cell8.setCellValue("Purse Before Balance");
              int widthUnits8 = 20*250;
             sheet.setColumnWidth(8, widthUnits8);
             
             
             
             org.apache.poi.ss.usermodel.Cell cell9 = rowheader.getCell(9);
             if (cell9 == null) {
                 cell9 = rowheader.createCell(9);
             }
             cell9.setCellValue("Purse Balance");
              int widthUnits9 = 20*150;
             sheet.setColumnWidth(9, widthUnits9);
             
             
             
             org.apache.poi.ss.usermodel.Cell cell10 = rowheader.getCell(10);
             if (cell10 == null) {
                 cell10 = rowheader.createCell(10);
             }
             cell10.setCellValue("Counter Data");
              int widthUnits10 = 20*250;
             sheet.setColumnWidth(10, widthUnits10);
             
             
             
              org.apache.poi.ss.usermodel.Cell cell11 = rowheader.getCell(11);
             if (cell11 == null) {
                 cell11 = rowheader.createCell(11);
             }
             cell11.setCellValue("Signed Cert");
              int widthUnits11 = 20*250;
             sheet.setColumnWidth(11, widthUnits11);
             
             
               org.apache.poi.ss.usermodel.Cell cell12 = rowheader.getCell(12);
             if (cell12 == null) {
                 cell12 = rowheader.createCell(12);
             }
             cell12.setCellValue("Settlement");
              int widthUnits12 = 20*150;
             sheet.setColumnWidth(12, widthUnits12);
             
             
              org.apache.poi.ss.usermodel.Cell cell13 = rowheader.getCell(13);
             if (cell13 == null) {
                 cell13 = rowheader.createCell(13);
             }
             cell13.setCellValue("Remarsk");
              int widthUnits13 = 20*150;
             sheet.setColumnWidth(13, widthUnits13);
             
             
              org.apache.poi.ss.usermodel.Cell cell14 = rowheader.getCell(14);
             if (cell14 == null) {
                 cell14 = rowheader.createCell(14);
             }
             cell14.setCellValue("Invoice Receive");
              int widthUnits14 = 20*150;
             sheet.setColumnWidth(14, widthUnits14);
             
             
             org.apache.poi.ss.usermodel.Cell cell15 = rowheader.getCell(15);
             if (cell15 == null) {
                 cell15 = rowheader.createCell(15);
             }
             cell15.setCellValue("Saldo Sebelum");
              int widthUnits15 = 20*150;
             sheet.setColumnWidth(15, widthUnits15);
             
             org.apache.poi.ss.usermodel.Cell cell16 = rowheader.getCell(16);
             if (cell16 == null) {
                 cell16 = rowheader.createCell(16);
             }
             cell16.setCellValue("Saldo Sesudah");
              int widthUnits16 = 20*150;
             sheet.setColumnWidth(16, widthUnits16);
             
             
                org.apache.poi.ss.usermodel.Cell cell17 = rowheader.getCell(17);
             if (cell17 == null) {
                 cell17 = rowheader.createCell(17);
             }
             cell17.setCellValue("Amount");
              int widthUnits17 = 20*150;
             sheet.setColumnWidth(17, widthUnits17);
             
             //loop isi
        
        ArrayList<String> lines = new ArrayList<String>();
         
        int line = 3;
        try {
            
            int lengght, Saldo_sebelum, Saldo_sesudah, Amount;
             String Recordindicator,Transtype,transcode,CAN,Transheader, TRP,Debit_Option, PURSEBB, PURSEB, Counter_Data, Signedcert, Settlement, Remarsk;
            while ((strLine = reader.readLine()) != null) {
                
                line ++;
                strLine=strLine.trim();
                if (strLine.length()>91){
                     String valid = strLine.substring(91,93);
                    transcode = strLine.substring(0,104);
                     lengght = strLine.length();
                Recordindicator = strLine.substring(0,1);
                Transtype = strLine.substring(1,3);
                CAN = strLine.substring(3,19);
                Transheader = strLine.substring(19,35);
                TRP = strLine.substring(35,43);
                 Debit_Option = strLine.substring(43,45);
                 PURSEBB = strLine.substring(45,51);
                 PURSEB = strLine.substring(51,57);
                 Counter_Data = strLine.substring(57,73);
                 Signedcert = strLine.substring(73,89);
                 Settlement = strLine.substring(89,91);
                 Remarsk = strLine.substring(91,104);
                 Saldo_sebelum = Integer.parseInt(PURSEBB, 16);
                 Saldo_sesudah = Integer.parseInt(PURSEB, 16);
                 Amount = Saldo_sebelum-Saldo_sesudah;
                lines.add(transcode+"|"+lengght+"|"+Recordindicator+"|"+Transtype+"|"+line+"|"+CAN+"|"+Transheader+"|"+TRP+"|"+Debit_Option
                +"|"+PURSEBB+"|"+PURSEB+"|"+Counter_Data+"|"+Signedcert+"|"+Settlement+"|"+Remarsk+"|"+Saldo_sebelum+"|"+Saldo_sesudah+"|"+Amount);
                
                
                  //Isi
              org.apache.poi.ss.usermodel.Cell cellisi = sheet.createRow(line).createCell(1);
             //celllenght.setCellValue("LENGHT"); //lenght
             Row rowheaderisi = sheet.getRow(line);
             org.apache.poi.ss.usermodel.Cell cell1isi = rowheaderisi.getCell(1);
             if (cell1isi == null) {
                 cell1isi = rowheaderisi.createCell(1);
             }
             cell1isi.setCellValue(lengght);
             
             
             
             org.apache.poi.ss.usermodel.Cell cellisi2 = rowheaderisi.getCell(2);
             if (cellisi2 == null) {
                 cellisi2 = rowheaderisi.createCell(2);
             }
             cellisi2.setCellValue(Recordindicator);
                
              org.apache.poi.ss.usermodel.Cell cellisi3 = rowheaderisi.getCell(3);
             if (cellisi3 == null) {
                 cellisi3 = rowheaderisi.createCell(3);
             }
             cellisi3.setCellValue(Transtype);
             
             
             org.apache.poi.ss.usermodel.Cell cellisi0 = rowheaderisi.getCell(0);
             if (cellisi0 == null) {
                 cellisi0 = rowheaderisi.createCell(0);
             }
             cellisi0.setCellValue(transcode);
             
             
             
             org.apache.poi.ss.usermodel.Cell cellisi4 = rowheaderisi.getCell(4);
             if (cellisi4 == null) {
                 cellisi4 = rowheaderisi.createCell(4);
             }
             cellisi4.setCellValue(CAN);
             
             
             
               org.apache.poi.ss.usermodel.Cell cellisi5 = rowheaderisi.getCell(5);
             if (cellisi5 == null) {
                 cellisi5 = rowheaderisi.createCell(5);
             }
             cellisi5.setCellValue(Transheader);
             
             
             
               org.apache.poi.ss.usermodel.Cell cellisi6 = rowheaderisi.getCell(6);
             if (cellisi6 == null) {
                 cellisi6 = rowheaderisi.createCell(6);
             }
             cellisi6.setCellValue(TRP);
                
                  org.apache.poi.ss.usermodel.Cell cellisi7 = rowheaderisi.getCell(7);
             if (cellisi7 == null) {
                 cellisi7 = rowheaderisi.createCell(7);
             }
             cellisi7.setCellValue(Debit_Option);
                
               org.apache.poi.ss.usermodel.Cell cellisi8 = rowheaderisi.getCell(8);
             if (cellisi8 == null) {
                 cellisi8 = rowheaderisi.createCell(8);
             }
             cellisi8.setCellValue(PURSEBB);
             
                
               org.apache.poi.ss.usermodel.Cell cellisi9 = rowheaderisi.getCell(9);
             if (cellisi9 == null) {
                 cellisi9 = rowheaderisi.createCell(9);
             }
             cellisi9.setCellValue(PURSEB);
             
             
               org.apache.poi.ss.usermodel.Cell cellisi10 = rowheaderisi.getCell(10);
             if (cellisi10 == null) {
                 cellisi10 = rowheaderisi.createCell(10);
             }
             cellisi10.setCellValue(Counter_Data);
             
             
             
             org.apache.poi.ss.usermodel.Cell cellisi11 = rowheaderisi.getCell(11);
             if (cellisi11 == null) {
                 cellisi11 = rowheaderisi.createCell(11);
             }
             cellisi11.setCellValue(Signedcert);
             
             
             
             org.apache.poi.ss.usermodel.Cell cellisi12 = rowheaderisi.getCell(12);
             if (cellisi12 == null) {
                 cellisi12 = rowheaderisi.createCell(12);
             }
             cellisi12.setCellValue(Settlement);
             
             
             
              org.apache.poi.ss.usermodel.Cell cellisi13 = rowheaderisi.getCell(13);
             if (cellisi13 == null) {
                 cellisi13 = rowheaderisi.createCell(13);
             }
             cellisi13.setCellValue(Remarsk);
             
             
             org.apache.poi.ss.usermodel.Cell cellisi15 = rowheaderisi.getCell(15);
             if (cellisi15 == null) {
                 cellisi15 = rowheaderisi.createCell(15);
             }
             cellisi15.setCellValue(Saldo_sebelum);
             
             
              org.apache.poi.ss.usermodel.Cell cellisi16 = rowheaderisi.getCell(16);
             if (cellisi16 == null) {
                 cellisi16 = rowheaderisi.createCell(16);
             }
             cellisi16.setCellValue(Saldo_sesudah);
             
             
             org.apache.poi.ss.usermodel.Cell cellisi17 = rowheaderisi.getCell(17);
             if (cellisi17 == null) {
                 cellisi17 = rowheaderisi.createCell(17);
             }
             cellisi17.setCellValue(Amount);
                    
                }else {
                    line = line-1;
                }
                
              
                
                
               
                
              
                
               
             
                
            }
            
            /*
           
             
        
             
             
            
             */
             
             //Write the Excel file
             FileOutputStream fileOut = null;
             fileOut = new FileOutputStream("/home/kiwong/tes.xlsx");
             //JOptionPane.showMessageDialog(null, "Ok");
             wb.write(fileOut);
             fileOut.close();
             JOptionPane.showMessageDialog(null, "File Berhasil Dibuat"); 
            

           
                
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            reader.close();
        } catch (IOException e) {
           e.printStackTrace();
        }
        return lines;
    }
    
    
    
    
    
    
    
    
    
    //master create File
     public static void createfile() {
    
         try {
             InputStream inputStreamimage = null;
             //List<TroubleEtModel> etModelsReport = troubleETDao.getEtModelsReport(txt_tglawal.getDate(), txt_akhir.getDate(), a);
             
             
             Workbook wb = new XSSFWorkbook();
             Sheet sheet = wb.createSheet("Form Aduan Permintaan dan Perbaikan Barang");
             XSSFFont font = (XSSFFont) wb.createFont();
             font.setBold(true);
             
             
        
             //judul
             org.apache.poi.ss.usermodel.Cell celllenght = sheet.createRow(2).createCell(2);
             //celllenght.setCellValue("LENGHT"); //lenght
             Row rowheader = sheet.getRow(2);
             org.apache.poi.ss.usermodel.Cell cell1 = rowheader.getCell(1);
             if (cell1 == null) {
                 cell1 = rowheader.createCell(1);
             }
             cell1.setCellValue("LENGHT");
             int widthUnits = 20*150;
            sheet.setColumnWidth(1, widthUnits);
             
             org.apache.poi.ss.usermodel.Cell cell2 = rowheader.getCell(2);
             if (cell2 == null) {
                 cell2 = rowheader.createCell(2);
             }
             cell2.setCellValue("Record Indicator");
            sheet.setColumnWidth(2, widthUnits);
             
              org.apache.poi.ss.usermodel.Cell cell3 = rowheader.getCell(3);
             if (cell3 == null) {
                 cell3 = rowheader.createCell(3);
             }
             cell3.setCellValue("Transtype");
             sheet.setColumnWidth(3, widthUnits);
             
             //Isi
             
             
             
             //Write the Excel file
             FileOutputStream fileOut = null;
             fileOut = new FileOutputStream("/home/kiwong/tes.xlsx");
             //JOptionPane.showMessageDialog(null, "Ok");
             wb.write(fileOut);
             fileOut.close();
             JOptionPane.showMessageDialog(null, "File Berhasil Dibuat");
            // inputStreamimage.close();
         } catch (IOException ex) {
             Logger.getLogger(Read_Text_File.class.getName()).log(Level.SEVERE, null, ex);
         }
        }
     
     
     
     
     
      public static void GetallTxtFile(){
           PrintStream printStream;
        String content = null;
        try {
            printStream = new PrintStream(new FileOutputStream("/home/kiwong/b.txt"));
            System.setOut(printStream);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Read_Text_File.class.getName()).log(Level.SEVERE, null, ex);
        }
         File folder = new File("/home/kiwong/bak");
         File[] listOfFiles = folder.listFiles();
         for (int i = 0; i < listOfFiles.length; i++) {
             File file = listOfFiles[i];
             if (file.isFile() && file.getName().endsWith(".bak")) {
                 try {
                     content = FileUtils.readFileToString(file);
                 } catch (IOException ex) {
                     Logger.getLogger(Read_Text_File.class.getName()).log(Level.SEVERE, null, ex);
                 }
                 System.out.println(content);
             }
         }
            
        }
     
     
     
     
      }
