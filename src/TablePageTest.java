import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TablePageTest extends BaseTest{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver =startDriver("tag/table.html");
		List <String> nList;
		String[] perlu = {"Alan","Prasanna","Bob"};
		
		
		
		for(int i=1;i<=2;i++) {
			
		if(i==1)	{
			System.out.println("***************Names*****************");
		}else {
			System.out.println("**************Amount****************");
		}
		List <WebElement> names= driver.findElements(By.xpath("//tr/td["+i+"]"));
		nList = names.stream().map(a->a.getText()).collect(Collectors.toList());
		nList.forEach(q->System.out.println(q));
		
		
//		//finding values in a table ( by using list)
//		
//		boolean b = nList.contains(perlu[i]);
//		System.out.println(b);
//				
		}
		
		
		List <WebElement> namm = driver.findElements(By.xpath("//tr/td[2]"));
		WebElement g= namm.stream().filter(f->f.getText().equalsIgnoreCase("42")).findFirst().orElse(null);
		String n2 = g.findElement(By.xpath("parent::tr/td[1]")).getText();
		System.out.println(n2);
	}

}
