import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class formMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  WebDriver driver = new FirefoxDriver();
  driver.get("https://www.makemytrip.com/flights");
  System.out.println("Before clicking  the radio button");
  //isdisplayed is used to verify whether the particular object is visible or not//
  //where as isselected is used to select the radio buttons//
  System.out.println(driver.findElement(By.xpath("//a[@id='return_date_sec']")).isDisplayed());
  driver.findElement(By.xpath("//a[@id='multi_city_button']")).click();
  System.out.println("After clicking  the radio button");
  System.out.println(driver.findElement(By.xpath("//a[@id='return_date_sec']")).isDisplayed());
  //we have another method isEnabled() to enable any object in the web page//we have gettext() method to getthe text of particular object //
  System.out.println(driver.findElement(By.xpath("html/body/div[7]/div[2]/div/section[1]/div[3]/h3")).getText());
  int count = driver.findElements(By.xpath("//a[@id='mul_city_button']")).size();
  if(count==0) { 
	  System.out.println("verified");
  }/*we use this statement if the hidden button is not at all present in the page..means if we want to validate the object which is present 
  in the web page or code base .size is used to find the size of the xpath...means how many elements r present with the same xpath.. */
  
	}//we can use assert.asserttrue().....assert.assertfalse() r used for checking particular object automatically..and ended up with this 
	//boolean statement...depending on true r false..

}
