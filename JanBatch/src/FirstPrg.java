import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class FirstPrg {

	
		// TODO Auto-generated method stub
		private WebDriver driver;
		  private String baseUrl;  
		 
		  @BeforeMethod
		  public void setUp() throws Exception {
		    driver = new FirefoxDriver();
		    baseUrl = "http://www.wikipedia.org/";
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  }

		  @Test 
		  public void testUntitled() throws Exception {
		    driver.get(baseUrl + "/wiki/Main_Page");
		    driver.findElement(By.id("searchInput")).clear();
		    driver.findElement(By.id("searchInput")).sendKeys("India");
		    driver.findElement(By.id("searchButton")).click();
		  
		  }

		  @AfterMethod
		  public void tearDown() throws Exception {
		    driver.quit();   
		  } 
	}


