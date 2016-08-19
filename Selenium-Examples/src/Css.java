import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//syntax for customized Css:  Tagname[Attribute='value']//
		//syntax if we have multiple tagnames:  [Attribute='value']//
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("[id='username']")).sendKeys("BABY");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("peepee");
		driver.findElement(By.xpath("//*[@id='Login']")).click();

	}

}

/* 1.verify in firebug before u run the script
   2.Css customized xpath
   3.identifing css with #id or .classname(spaces r replaced by . in classname..)
   
   4.find for unique attribute */