package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPageObjects {
	
	WebDriver driver = null;
	
	By textbox_search = By.id("key");
	By button_serach = By.name("sub");
	
	public GoogleSearchPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setTextInSerchBox() {
		  driver.findElement(By.name("key")).sendKeys("Animal Farm");

	}
	
	public void clickSearchButton() {
		driver.findElement(button_serach).sendKeys(Keys.RETURN);
	}

}