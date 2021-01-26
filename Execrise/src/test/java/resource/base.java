package resource;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	public WebDriver driver;
	public Properties prop;
	public WebDriver initialize() throws IOException {
		
	prop=new Properties();
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\resource\\data.properties");
	prop.load(fis);

	String browsername= prop.getProperty("browser");
	
	if(browsername.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium jars\\chrome\\chromedriver.exe");
		// Creating a object to instantiate the browser driver
		driver = new ChromeDriver();
		
	}
	else if(browsername.equals("firefox")){
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		driver=new FirefoxDriver();
		
	}
	else if(browsername.equals("IE")) {
		System.setProperty("webdriver.ie.driver", "D:\\IE Driver Server\\IEDriverServer.exe");           
	 driver=new InternetExplorerDriver();  
		
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	return driver; 
	

} 
	public String getScreenShotPath(String testCaseName) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		FileUtils.copyFile(source,new File(destinationFile));
		return destinationFile;


	}
}
