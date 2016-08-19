import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firepathex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		
		WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.yahoo.com");
		//driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div/div/div[2]/ul/li[1]/a")).click();//
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("vakati85@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("abcdefg");
		//driver.findElement(By.className(className));//
		driver.findElement(By.linkText("Forgot account?")).click();
		//driver.findElement(By.partialLinkText("forget anything like user id or password use this partial link")).click();//
		driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[3]/label/input")).click();
		
		
	}

}
