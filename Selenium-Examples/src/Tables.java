import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.espncricinfo.com/england-v-sri-lanka-2016/engine/match/913619.html");
		WebElement table=driver.findElement(By.xpath("//table[@class='batting-table innings']"));
		//finding no.of rows 
		List<WebElement>noofrows=table.findElements(By.tagName("tr"));
		 System.out.println("no of rows" + noofrows.size());
		 //finding no of columns
		 int i=0;
		 for(WebElement eachrow : noofrows){
			List<WebElement>eachcolumn=eachrow.findElements(By.tagName("td"));
			i++;
			System.out.println("no. of columns in " + i + "th rows are" + eachcolumn.size());
			//finding cellvalues
			//for(WebElement text:eachcolumn){
				//System.out.println(text.getText());
			//}
		 }
	}

}
