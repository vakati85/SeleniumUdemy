
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Nooflinkscountex {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.ebay.com/?clk_rvr_id=1063017798632&mpvc=");
		//System.out.println("No of links in web page");
		//System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement Footer = driver.findElement(By.xpath(".//*[@id='glbfooter']"));
		//System.out.println("No of links in footer");
		//System.out.println(Footer.findElements(By.tagName("a")).size());
		WebElement Col=driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		//System.out.println("No.of Links in Col");
		//System.out.println(Col.findElements(By.tagName("a")).size());
	    String Beforeclicking=null;
	    String Afterclicking;
		
		
		for(int i=0;i<Col.findElements(By.tagName("a")).size();i++){
			
			//System.out.println(Col.findElements(By.tagName("a")).get(i).getText());
			
			if(Col.findElements(By.tagName("a")).get(i).getText().contains("Learn to sell")){
				Beforeclicking=driver.getTitle();
				//System.out.println(driver.getTitle());
				Col.findElements(By.tagName("a")).get(i).click();
				break;
				}
			Afterclicking = driver.getTitle();
			if (Beforeclicking!=Afterclicking){
				if(driver.getPageSource().contains("Learn to sell"))
					System.out.println("Pass");
			}
			else{
				System.out.println("fail");
			}
		}
		//System.out.println(driver.getTitle());
	
		}
		
		
		
	


}


