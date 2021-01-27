package resource;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.ApplicationPage;
import pageObject.CareersPage;






public class Homepage extends base {
	public static Logger log =LogManager.getLogger(base.class.getName());
	@Test(dataProvider="getData")
	
	public void basePageNavigation(String Name,String Email,String File,String jobmessage) throws IOException{
		log.info("Driver is initialize");
		driver=initialize();
		driver.get(prop.getProperty("url"));
		CareersPage cp = new CareersPage(driver);
		cp.Career().click();
		cp.Apply().click();
		
		ApplicationPage ap=new ApplicationPage(driver);
		ap.getName().sendKeys(Name);
		ap.getEmail().sendKeys(Email);
		ap.getFile().sendKeys(File);
		ap.getJobMessage().sendKeys(jobmessage);
		ap.getsubmit().click();
			 Alert alert = driver.switchTo().alert();		
	        String alertMessage= driver.switchTo().alert().getText();		
	        		
	        // Displaying alert message		
	        System.out.println(alertMessage);
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		// Row stands for how many different data types test should run
		//coloumn stands for how many values per each test
		
		// Array size is 2
		// 0,1
		Object[][] data=new Object[2][4];
		//0th row
		data[0][0]="Akash Kumar";
		data[0][1]="akash22031997@gmail.com";
		data[0][2]="F:\\selenium project\\e2e framework\\execrise2\\uploadfile\\resume .doc";
		data[0][3]="lets see";
		//1st row
		data[1][0]="Akash Kumar";
		data[1][1]="akash22031997@gmail.com";
		data[1][2]= "F:\\selenium project\\e2e framework\\execrise2\\uploadfile\\Resume .pdf";
		data[1][3]="lets see";
		return data;	
		
	}

}
