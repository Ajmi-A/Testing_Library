package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		googleSearchTest();
	}
	
	public static void googleSearchTest() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
		
		
		driver.get("http://localhost/ADM_automated/student/search_books.php");
		
		searchPageObj.setTextInSerchBox();
		
		searchPageObj.clickSearchButton();
		
		driver.close();
        System.out.println("Test completed successfully");

	}

}