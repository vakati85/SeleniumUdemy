import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handlingmultiplewindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		try {
			WebDriver driver = new FirefoxDriver();
	         driver.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default");
	         driver.findElement(By.xpath(".//*[@id='wrapper']/div[2]/div/div[1]/p/a")).click();
	         System.out.println(driver.getTitle());
	         Set<String> ids=driver.getWindowHandles();
	         Iterator<String> it = ids.iterator();
	         String parentid=it.next();
	         String childid=it.next();
	         driver.switchTo().window(childid);
	         System.out.println(driver.getTitle());
	         driver.switchTo().window(parentid);
	         System.out.println(driver.getTitle());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}	

}
