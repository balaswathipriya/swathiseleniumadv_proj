package uitesting;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonmethods.Exceldata;
import commonmethods.Extentreport;
import commonmethods.Schot;
import objrep.Homepage;
import testbase.Browser;

public class Popularlinktest extends Browser {
	
	 static Homepage hp;
	 
	 
	 @BeforeTest
	 public static void esetup() {
		 Extentreport.setup();
		 
		 
	 }
	@BeforeMethod
	public static void invokbro() throws Exception {
		Browser.invokebrowser();
		}
	
	@AfterMethod
	
	public static void closeb() {
		driver.close();
		
	}
	
	@Test
	
	public static void atablet() throws InterruptedException, IOException {
		Thread.sleep(5000);
		//WebDriverWait wait = new WebDriverWait(driver,20);
		 hp = new Homepage(driver);
		// wait.until(ExpectedConditions.elementToBeClickable(hp.popular_item()));
			hp.popular_item().click();
		
		 hp.tablet_link().click();
		 hp.table_dec_text().getText();
		 String actualtext_table=hp.table_dec_text().getText();
			System.out.println(actualtext_table);
			
			
			if(actualtext_table.contains(Exceldata.readdata(3,0))){
				
				System.out.println("test id pass");
				Exceldata.writedata(3, 1, "valid data");
				Extentreport.repopass();
				
			}else {
				Schot.screenshot();
				System.out.println("test id fail");
				Exceldata.writedata(3, 1, "invalid");
				Extentreport.repofail();
			}
		}
	
@Test
	
	public static void laptop() throws InterruptedException, IOException {
	Thread.sleep(5000);
	 hp = new Homepage(driver);
		hp.popular_item().click();
		
	hp.laptop_link().click();
	hp.laptop_dec_text().getText();
	String actualtext_laptop=(hp.laptop_dec_text().getText());
	System.out.println(actualtext_laptop);
	
	if(actualtext_laptop.contains(Exceldata.readdata(1,0))){
		
		System.out.println("test id pass");
		Exceldata.writedata(1, 1, "valid data");
		Extentreport.repopass();
		
		
	}else {
		Schot.screenshot();
		System.out.println("test id fail");
		Exceldata.writedata(3, 1, "invalid");
		Extentreport.repofail();
	}
	
	
	}

@Test

public static void spkr() throws InterruptedException, IOException {
	Thread.sleep(5000);
	 hp = new Homepage(driver);
		hp.popular_item().click();
	
    hp.speaker_link().click();
    String actualtext_speaker=hp.spe_dec_text().getText();
    System.out.println(hp.spe_dec_text().getText());
    
    
if(actualtext_speaker.contains(Exceldata.readdata(2,0))){
		
		System.out.println("test id pass");
		Exceldata.writedata(2, 1, "valid data");
		Extentreport.repopass();
		
		
	}else {
		Schot.screenshot();
		System.out.println("test id fail");
		Exceldata.writedata(2, 1, "invalid");
		Extentreport.repofail();
	}

}
}
