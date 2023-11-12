import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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

}
