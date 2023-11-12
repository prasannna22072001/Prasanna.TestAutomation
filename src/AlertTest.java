import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertTest extends BaseTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				
			
		WebDriver driver =startDriver("alerts/alert-test.html");
		
		 driver.findElement(By.id("alertexamples")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String textString = driver.findElement(By.id("alertexplanation")).getText();
		System.out.println(textString);
		
		
		Thread.sleep(2000);
		for(int i =0; i<=1; i++) {
		
		driver.findElement(By.id("confirmexample")).click();
		Alert alert2 = driver.switchTo().alert();
		
		if(i == 0) {
		alert2.accept();
		}else {
			alert2.dismiss();
		}
		
		String bString = driver.findElement(By.id("confirmreturn")).getText();
		System.out.println(bString);
		
		}
		
		
		Thread.sleep(2000);
		driver.findElement(By.id("promptexample")).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].value = 'YourText';", alert);
        
        String gString = driver.findElement(By.id("promptreturn")).getText();
        System.out.println(gString);
	}

}
