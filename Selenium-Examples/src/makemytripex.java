import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class makemytripex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.expedia.com/");
		driver.findElement(By.xpath(".//*[@id='tab-flight-tab']")).click();
		driver.findElement(By.xpath(".//*[@id='flight-type-one-way-label']")).click();
		driver.findElement(By.xpath(".//*[@id='flight-origin']")).click();
		driver.findElement(By.xpath(".//*[@id='flight-origin']")).sendKeys("PHL");
		driver.findElement(By.xpath(".//*[@id='flight-destination']")).click();
		driver.findElement(By.xpath(".//*[@id='flight-destination']")).sendKeys("MIA");
		driver.findElement(By.xpath(".//*[@id='flight-departing']")).click();
		Thread.sleep(3000L);
		driver.findElement(By.xpath(".//*[@id='flight-departing-wrapper']/div/div/div[1]/table/tbody/tr[5]/td[3]/a")).click();
		Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='flight-adults']")));
		dropdown.selectByValue("2");
		Select dropdown1 = new Select(driver.findElement(By.xpath(".//*[@id='flight-children']")));
		dropdown1.selectByValue("2");
		Select dropdown2 = new Select(driver.findElement(By.xpath(".//*[@id='flight-age-select-1']")));
		dropdown2.selectByIndex(7);
		Select dropdown3 = new Select(driver.findElement(By.xpath(".//*[@id='flight-age-select-2']")));
		dropdown3.selectByIndex(5);
		driver.findElement(By.xpath(".//*[@id='advanced-options']")).click();
		driver.findElement(By.xpath(".//*[@id='advanced-flight-refundable-label']")).isSelected();
		Select dropdown4=new Select(driver.findElement(By.xpath(".//*[@id='flight-advanced-preferred-airline']")));
		dropdown4.selectByVisibleText("Delta");
		Select dropdown5 = new Select(driver.findElement(By.xpath(".//*[@id='flight-advanced-preferred-class']")));
		dropdown5.selectByIndex(1);
		driver.findElement(By.xpath(".//*[@id='search-button']")).click();
	
		//suppose if we have - and + button to change the option then we use following synax
		/*int i=0;

while(i<5)

{

driver.findElement(By.xpath(".//*[@id='adult_count']/a[2]")).click();

i++;
}
}*/
}
}