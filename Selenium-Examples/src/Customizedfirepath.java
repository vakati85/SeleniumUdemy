import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Customizedfirepath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vakati85@gmail.com");  
	    driver.findElement(By.xpath("//input[@value='Log In']")).click();
		//syntax for customizeXpath : //Tagname[@Attribute='value']
	    
	   //syn for customizedxpath without tagname(if we have multiple tagnames we use this expression)://*[@Attribute='value']

	}

}
//xpath,id,name,class name,link text ,partially linktext.css selector etc are locators of firepath..