import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class muruga {


		private static Object timeunit;
		private static Object seconds;

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub	System.setProperty("webdriver.gecko.driver","/usr/bin/geckodriver");
			// TODO Auto-generated method stub
			WebDriver driver = new FirefoxDriver();
		String a = "https://www.google.com";
		
			
	        //Launch the Online Store 
			driver.get(a);
			Thread.sleep(6000);
			driver.findElement(By.id("lst-ib")).sendKeys("amy");
			Thread.sleep(6000);
			driver.findElement(By.xpath("//b[normalize-space()=' jackson']")).click();
			
			
			
			
			
			
			if(driver.getPageSource().contains("gopi")) {
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
		

		
			// TODO Auto-generated method stub
	
		}

}
