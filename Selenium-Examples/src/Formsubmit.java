import javax.servlet.ServletContextEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Formsubmit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com/");
		/*driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();*/ 
		// dynamic dropdowns which means the selections keeps on changing//
		
		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Adult']")));
		dropdown.selectByVisibleText("4 Adults");
		dropdown.selectByValue("6");
		dropdown.selectByIndex(7);
		//static dropdowns  means the selection will be fixed and selected from fixed pattern//
		 System.out.println(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
	    driver.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
	    System.out.println(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
	    driver.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
	    System.out.println(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
	}
//isselected() is used to know whether check button is checked r not only if the code  is present in the web page
}
