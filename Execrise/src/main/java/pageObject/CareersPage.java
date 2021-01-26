package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CareersPage {
	public WebDriver driver;
	private By careers=By.cssSelector("a.nav-link.nav-close");
private	By ApplyQa=By.cssSelector("h6.mb-0");
	
	public CareersPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		
	}

	public WebElement Career() {
		return driver.findElement(careers);
}
	public WebElement Apply() {
		return driver.findElement(ApplyQa);
		
	}

	
}
