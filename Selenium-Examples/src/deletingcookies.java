import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.os.WindowsUtils;

public class deletingcookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WindowsUtils.tryToKillByName("notepad.exe");kills all duplicates by this name
		FirefoxProfile prof = new FirefoxProfile();
		prof.setAcceptUntrustedCertificates(false);
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		Set<Cookie> abc= driver.manage().getCookies();
		System.out.println(abc.size());
	    driver.manage().deleteAllCookies();
	    Set<Cookie> abcd = driver.manage().getCookies();
	    System.out.println(abcd.size());
	    
	    

	}

}
