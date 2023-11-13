import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FramesTest extends BaseTest{

	public static void main(String[] args) {

		

		WebDriver driver=startDriver("frames/frames-test.html");
		
		
		WebElement frElement = driver.findElement(By.xpath("//frame[@name='left']"));
		driver.switchTo().frame(frElement);
		
		//waitForElementToAppear(driver.findElement(By.cssSelector("#left0")));
		WebElement element = driver.findElement(By.cssSelector("#left15"));
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].scrollIntoView();", element);
		
		//if we want to access outside webelement or another frame element we have to come outside of that particular frame. Then only we access
		driver.switchTo().defaultContent();

		WebElement frElement2 = driver.findElement(By.xpath("//frame[@name='right']"));
		driver.switchTo().frame(frElement2);
		
		WebElement element2 = driver.findElement(By.cssSelector("#right20"));
		jsExecutor.executeScript("arguments[0].scrollIntoView();", element2);
		

	}

}
