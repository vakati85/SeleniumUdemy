import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		//driver.findElement(By.xpath("input[class='.input_password']")).sendKeys("abcdefg");if we use this step it will give error//
		System.out.println(driver.getPageSource());
		//iframe=id
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("input[class='.input_password']")).sendKeys("abcdefg");

	}

}
