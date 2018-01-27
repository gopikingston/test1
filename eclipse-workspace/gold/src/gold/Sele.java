package gold;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/gopinath/Downloads//chromedriver");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		WebDriver driver=new ChromeDriver(options);
		driver.get("www.google.com");


	}

}
