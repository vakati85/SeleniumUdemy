import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		Actions abc = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']"));
		abc.moveToElement(element).build().perform();
		 driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']")).click();
		WebElement xyz = driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"));
		abc.keyDown(Keys.SHIFT).moveToElement(xyz).sendKeys("baby").build().perform();
		abc.contextClick(xyz).build().perform();
	}

}
