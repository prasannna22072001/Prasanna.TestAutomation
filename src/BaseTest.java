import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	
public static WebDriver driver;
	
	//@BeforeMethod(alwaysRun=true)
	public static WebDriver startDriver(String link) {
		driver = new ChromeDriver();
		driver.get("https://testpages.eviltester.com/styled/"+link+"");
		driver.manage().window().maximize();
		return driver;
	}

public static void waitForElementToAppear(WebElement findBy) {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(findBy));

		}
}
