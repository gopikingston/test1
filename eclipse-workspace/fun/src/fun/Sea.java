package fun;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Sea {

	public static <WebElements> void main(String[] args) throws IOException, EncryptedDocumentException, InvalidFormatException, InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "/home/gopinath/Downloads//chromedriver");
        ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://jira.urjanet.net/browse/");
		
		
}}
