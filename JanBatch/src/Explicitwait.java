import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Explicitwait {

	
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
	   
	    //explicit wait for search field
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchInput")));

	    driver.findElement(By.id("searchInput")).clear();     
	    driver.findElement(By.id("searchInput")).sendKeys("India");

	    driver.findElement(By.id("searchButton")).click();
	 
	  }

	  @AfterMethod
	  public void tearDown() throws Exception {
	    driver.quit();   
	  } 
}
