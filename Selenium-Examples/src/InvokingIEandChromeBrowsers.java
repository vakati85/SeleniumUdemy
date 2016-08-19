import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InvokingIEandChromeBrowsers {

	public static void main(String[] args) {
		// Invoking chrome browser 
		//System.setProperty("webdriver.chrome.driver","C:/Program Files/chromedriver.exe"); 
		//WebDriver driver=new ChromeDriver();    // this line launch chrome browser
		//driver.get("http://www.google.com");
		
		//Invoking FF browser
		//WebDriver driverF = new FirefoxDriver();
		//System.out.println ("executing value");
		//driverF.get("https://www.facebook.com");
		
		//Invoking IE browser
		System.setProperty("webdriver.ie.driver","C:/Program Files/IEDriverServer.exe"); 
		WebDriver driver=new InternetExplorerDriver();   
		driver.get("http://www.google.com");

	}

}
