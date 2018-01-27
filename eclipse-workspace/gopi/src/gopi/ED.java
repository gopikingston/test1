package gopi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class ED {
	public static void main(String[] args) throws IOException {
		File f = new File("/home/gopinath/t1");
		Scanner scan = new Scanner(f);
		scan.useDelimiter("[^A-Za-z]+");
		while(scan.hasNextLine()) {
		Pattern p = Pattern.compile("Account(.*?)>");//greping condition
	Matcher m = p.matcher(scan.nextLine());
 while (m.find()) {
		String group = m.group();//passing a matching value to group string
		String ouy = group.replaceAll("Account", "").replaceAll("Statement Date =", "").replaceAll("Invoice#((.*)),", "").replaceAll("\\.", "")
		.replaceAll("\\ ->", "").replaceAll("\\,", " ").replaceAll("\\] ->", "").replaceAll("\\(", "").replaceAll("\\)", "").replaceAll("-", " ");
		System.out.println(ouy);
		}//loop endings
	}}//loop end
}// end
	
	
	
