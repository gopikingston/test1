package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TR {

	public static void main(String[] args)   {
		System.setProperty("webdriver.gecko.driver","/usr/bin/geckodriver");
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
        //Launch the Online Store 
		driver.get("http://www.facebook.com");
		
		
 
        // Print a Log In message to the screen
        System.out.println("Successfully opened the website www.Store.Demoqa.com");
    
        }

}