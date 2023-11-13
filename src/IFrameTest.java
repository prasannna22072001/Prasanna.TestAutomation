import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IFrameTest extends BaseTest{

	public static void main(String[] args) {

		
		WebDriver driver = startDriver("iframes-test.html");
		
		WebElement fElement = driver.findElement(By.id("thedynamichtml"));
		driver.switchTo().frame(fElement);
		
		String tString = driver.findElement(By.id("iframe33")).getText();
		System.out.println(tString);

	}

}
