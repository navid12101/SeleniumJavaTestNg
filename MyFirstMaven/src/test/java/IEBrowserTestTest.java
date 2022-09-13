import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class IEBrowserTestTest {
	
	
	WebDriver driver = null;
  @Test
  public void f() {
	  String Path = System.getProperty("user.dir");
	System.setProperty("webdriver.gecko.driver", Path+ "/folder/Geckdriver/geckodriver.exe");
	 driver = new FirefoxDriver();
	 }
  }

