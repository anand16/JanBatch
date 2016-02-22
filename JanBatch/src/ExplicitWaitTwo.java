import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ExplicitWaitTwo {

	WebDriver drv;
    @BeforeMethod
    public void setup() throws InterruptedException {

           // initializing drv variable using FirefoxDriver
           drv=new FirefoxDriver();
           // launching gmail.com on the browser
           drv.get("https://gmail.com");
           // maximized the browser window
           drv.manage().window().maximize();
           drv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test() throws InterruptedException {

           // saving the GUI element reference into a "username" variable of WebElement type
           WebElement username = drv.findElement(By.id("Email"));

           // entering username
           username.sendKeys("reach.seleniumprogramme");
        
           // clicking signin button
           drv.findElement(By.id("next")).click();

           // entering password
           drv.findElement(By.id("Passwd")).sendKeys("sssairam");
           
           drv.findElement(By.id("signIn")).click();

           // explicit wait - to wait for the compose button to be click-able
           WebDriverWait wait = new WebDriverWait(drv,30);

      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
           // click on the compose button as soon as the "compose" button is visible
    drv.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
    }

    @AfterMethod
    public void teardown() {
    // closes all the browser windows opened by web driver
     System.out.println("Hello Compose");
    }



}
