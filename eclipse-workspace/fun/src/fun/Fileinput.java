package fun;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Fileinput {
	public static <WebElements> void main(String[] args) throws IOException {
		FileInputStream aut = new FileInputStream("/home/gopinath/Untitled 1.xlsx");
		XSSFWorkbook wo = new XSSFWorkbook(aut);
	     XSSFSheet sheet = wo.getSheetAt(0);
	     sheet.getRow(1).createCell(1).setCellValue("gyh");
	     FileOutputStream output=new FileOutputStream("/home/gopinath/Untitled 1.xlsx");
	     wo.write(output);
	     wo.close();
	     
}
}