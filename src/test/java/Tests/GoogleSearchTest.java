package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.GoogleSearchPage;

public class GoogleSearchTest {
	private static WebDriver driver= null;
 public static void main(String[] args) {
	 googleSearch();

}
 public static void googleSearch() {
	   String projectPath = System.getProperty("user.dir");

	   System.setProperty("webdriver.chrome.driver",projectPath+"/Drivers/chromedriver/chromedriver.exe");
	    driver = new ChromeDriver();
	   
	   //goto google.com

		driver.get("http://localhost/ADM_automated/student/login.php");
		
		driver.findElement(By.name("un")).sendKeys("sankar");
		driver.findElement(By.name("pass")).sendKeys("sankar");
		driver.findElement(By.name("sub")).click();
		driver.get("http://localhost/ADM_automated/student/search_books.php");

		
		//navigating to another page
		//driver.findElement(By.xpath("//input[@name='key']")).click();
        //driver.findElement(By.xpath("//button[@name='sub']")).click();
		//driver.get("http://localhost/ADM_automated/student/search_books.php");
         
	  
	   //enter text in search box
		  //driver.findElement(By.name("q")).sendKeys("Automation step by step");
		
	   
	   //GoogleSearchPage.textbox_search(driver).sendKeys("Animal Farm");
		 
	   
	   //click on search button
       // driver.findElement(By.name("btnK")).click();
       // driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
       // WebElement textbox = driver.findElement(By.name("q"));
       // textbox.sendKeys(Keys.RETURN);
       // GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
        //close browsers
        driver.close();
        System.out.println("Test completed successfully");
 }

}
