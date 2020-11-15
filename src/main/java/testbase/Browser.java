package testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import commonmethods.Propfile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser { 
	 public static WebDriver driver;
	 
	 
		public static void invokebrowser() throws Exception {
			 String url=Propfile.getpropvalue("url");
			 //System.out.println(url);
			String browser = Propfile.getpropvalue("browser");
			
			//String browser="chrome";
			if(browser.equalsIgnoreCase("chrome")) {
				
				WebDriverManager.chromedriver().setup();
				 driver= new ChromeDriver();
				
			} else if(browser.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			
		 driver= new FirefoxDriver();
			
		} else if(browser.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.iedriver().setup();
			
			 driver= new InternetExplorerDriver();
		}
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			driver.get(url);
			} 
		
}


		
		
	


