import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firepathfirebugforfirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.yahoo.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
	}

}
