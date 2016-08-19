import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Ieandchromebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.ie.driver","C:/Program Files/IEDriverServer.exe");//this will launch ie same way chrome//
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.qaclickacademy.com");
		
		
	}
	
	

}
