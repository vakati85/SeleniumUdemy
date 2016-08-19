import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		System.out.println(driver.switchTo().alert().getText());
		//above statement gives the text before accepting the pop up...
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();we use this if we don't want to accept the pop up..accept() is for clicking yes..//
		

	}

}
