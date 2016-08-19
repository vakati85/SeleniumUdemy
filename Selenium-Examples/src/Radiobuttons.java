import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radiobuttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         WebDriver driver=new FirefoxDriver();
	
         driver.get("http://www.echoecho.com/htmlforms10.htm");
        // driver.findElement(By.xpath("//input[@value='Cheese']")).click();
        // System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).size());//we use findelements if we have more than one item by xpath//
         //we can use size only if we use findelements only// 
         
         int count =driver.findElements(By.xpath("//input[@name='group1']")).size();
         for(int i=0;i<count;i++){
        	 //System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"));//
        	  String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
        	  if(text.equals("Cheese")){
        		  
        		  driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
        	  }
        	 
         }
	}

}
