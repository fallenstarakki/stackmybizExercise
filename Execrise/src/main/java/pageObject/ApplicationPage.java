package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ApplicationPage {
	public WebDriver driver;
	private By Name=By.cssSelector("[id=job-name]");
	private By Email=By.cssSelector("[id=job-email]");
	private By File=By.cssSelector("[id=job-file]");
	private By JobMessage=By.cssSelector("[id=job-message]");
	private By Submit=By.cssSelector("[type=submit]");
	
	public ApplicationPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getName() {
		return driver.findElement(Name);
}
	public WebElement getEmail() {
		return driver.findElement(Email);
		
	}
	
	public WebElement getFile() {
		return driver.findElement(File);
		
	}
	public WebElement getJobMessage() {
		return driver.findElement(JobMessage);
		
	}
	public WebElement getsubmit() {
		return driver.findElement(Submit);
		
	}

	
	
}
