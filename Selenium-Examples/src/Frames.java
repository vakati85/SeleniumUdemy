import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://fantasycricket.dream11.com/in/");
		driver.manage().window().maximize();
		WebDriverWait wd=new WebDriverWait(driver,7);
		int number = switchtoFrame(driver,By.xpath("html/body/div[1]/div/div[5]"));
	     driver.switchTo().frame(number);
		driver.findElement(By.xpath("html/body/div[1]/div/div[5]")).click();
		
		
	}
		
		public static int switchtoFrame(WebDriver driver,By by){
			int i;
		int count=	driver.findElements(By.tagName("iFrame")).size();
		for(i =0;i<count;i++){
			driver.switchTo().frame(i);
			int count1=driver.findElements(by).size();
			if(count1>0){
				driver.findElement(by).click();
				break;
			}
			else{
				System.out.println("continue looping");
			}
			
		}
		driver.switchTo().defaultContent();
		return i;
		
		}

	}

