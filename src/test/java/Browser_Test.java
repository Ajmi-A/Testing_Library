import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import junit.framework.Assert;



public class Browser_Test {


public static void main(String[] args) throws InterruptedException {
	
	String projectPath = System.getProperty("user.dir");
	System.out.println(projectPath);
	
	//System.setProperty("webdriver.gecko.driver", projectPath+"/drivers/geckodriver/geckodriver.exe");
	//WebDriver driver = new FirefoxDriver();
	
	System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://localhost/ADM_automated/student/login.php");
	driver.findElement(By.name("un")).sendKeys("sankar");
	driver.findElement(By.name("pass")).sendKeys("sankar");
	driver.findElement(By.name("sub")).click();
	//navigating to another page
	
	//driver.findElement(By.xpath("//input[@class='black_ar' and @id='type']")).click();

	
	
	//driver.findElement(By.xpath(

	//"/html/body[@class='nav-md']//nav/ul[@class='nav navbar-navnavbar-right']/li[1]/a[@href='javascript:;']"))
	//.click();

	//driver.findElement(By.xpath(

	//"/html/body[@class='nav-md']//nav/ul[@class='nav navbar-navnavbar-right']//ul[@class='dropdown-menu dropdown-usermenu pull-right']//a[@href='s_logout.php']"))

	//.click();

	driver.get("http://localhost/ADM_automated/student/search_books.php");
	//String at = driver.getTitle();
	//String et = "student login";
	//Assert.assertTrue(false);
	//driver.get("http://localhost/ADM_automated/student/search_books.php");
	
	//driver.findElement(By.name("key")).sendKeys("wings of fire");
	
	//WebElement element = driver.findElement(By.id("example"));
   // String text = element.getText();
    
	
	//WebElement textBox = driver.findElement(By.name("key"));
	
	//textBox.sendKeys("Automation Step by Step");
	
	//Thread.sleep(3000);
	
	driver.close();
	//driver.quit();
	
}

}