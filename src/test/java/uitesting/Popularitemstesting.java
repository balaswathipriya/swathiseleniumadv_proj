package uitesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objrep.Homepage;
import testbase.Browser;




public class Popularitemstesting extends Browser {
	//public static WebDriver driver ;
	static Homepage hp;
	
	
	@BeforeMethod
	public static void luncb() throws Exception {
		Browser.invokebrowser();
		
	}
	
	
	  @AfterMethod public static void closeb() {
		  driver.close();
	  
	  
	  }
	 
	
	//public static void main (String[] args) throws Exception {
	@Test
	
	public static void m() throws Exception {
		Thread.sleep(10000);
		
		 hp = new Homepage(driver);
		hp.popular_item().click();
		int itemsize=hp.popular_block().findElements(By.tagName("div")).size();
		System.out.println(itemsize);
		}
	
	
	@Test
	public static void poitext() {
		
		
		 hp = new Homepage(driver);
		Homepage.popular_item().click();
		
		String acttbtext=hp.tablet_text().getText();
		if(acttbtext.contains("HP ELITEPAD")) {
			System.out.println("test pass");
		}else {
			System.out.println("test fail");
		}
		String actlptext=hp.laptop_text().getText();
		if(actlptext.contains("HP ELITEBOOK")) {
			System.out.println("testpass");
		}else {
			System.out.println("test fail");
		}
		String actsptext= hp.speaker_text().getText();
		if(actsptext.contains("HP ROAR PLUS")) {
			System.out.println("test pass");
		}else {
			System.out.println("test fail");
		}
		
		
		
		
		
	}
		
		
}