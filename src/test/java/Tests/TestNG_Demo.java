package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo {
   WebDriver driver= null;
   @BeforeTest
	public void setUpTest() {
		String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",projectPath+"/Drivers/chromedriver/chromedriver.exe");
		    driver = new ChromeDriver();

	}
	
	@Test
   public  void googleSearch() {
	   	   
	   //goto google.com
		
     driver.get("http://localhost/ADM_automated/student/login.php");
		
		driver.findElement(By.name("un")).sendKeys("sankar");
		driver.findElement(By.name("pass")).sendKeys("sankar");
		driver.findElement(By.name("sub")).click();
	}
	@Test
	
		   public  void googleSearch2() {
	
		
	   driver.get("http://localhost/ADM_automated/student/search_books.php");
	  
	   //enter text in search box
		  driver.findElement(By.name("key")).sendKeys("Animal Farm");
		
		  //click on search button
         // driver.findElement(By.name("btnK")).click();
         // driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
          WebElement textbox = driver.findElement(By.name("sub"));
          textbox.sendKeys(Keys.RETURN);
          
   }
	@AfterTest
   public void tearDownTest() {
	 //close browsers
       driver.close();
       driver.quit();
       System.out.println("Test completed successfully");
   }
}
