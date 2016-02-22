import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Explicitwaitthree {

	private static WebDriver driver;

    @BeforeClass
    public static void startSelenium(){
        driver = new FirefoxDriver();
    }

    @Test
    public void useInBuiltExpectedConditions(){
        driver.get("http://compendiumdev.co.uk/selenium/calculate.php");
        new WebDriverWait(driver,10).until(ExpectedConditions.titleContains("Selenium"));
    }
}
