package executetext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;
import pom.GoogleLoginPage;
		public class TestGoogleSite {
		public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Automation\\MyFirstMaven\\folder\\chromedriver\\chromedriver.exe"); 
		//Set the Webdriver(chrome driver)
		WebDriver driver = new ChromeDriver();
		// Get Site URL 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		//Get company-branding at Login page
		WebElement image = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]"));
		//Applied the condition through if else statement 
		if(image.isDisplayed()) {
				System.out.println("company-branding available");
			}
		else {
			System.out.println("company-branding missing");
			Thread.sleep(2000);}
		
		//Get orangehrm-logo at Login page
				WebElement Oranghrlogo = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[2]/img"));
				//Applied the condition through if else statement 
				if(Oranghrlogo.isDisplayed()) {
						System.out.println("orangehrm-logo available");
					}
				else {
					System.out.println(" orangehrm-logo missing");}
		// Get Page heading(Login)
		String text = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/h5")).getText();
		String ActualText = "Login";
		String ExpectedText= text;
		Assert.assertEquals(ExpectedText, ActualText);
		//Applied the condition through if else statement
		if(ExpectedText==text) {
			System.out.println("Your Expected Heading is = "+text);}
		else {
			System.out.println("Your Expected Heading is incorrect");}
		Thread.sleep(2000);
		// Get UserName_Label(Username)
				String Username = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]"
						+ "/form/div[1]/div/div[1]/label")).getText();
				String ActualLabel = "Username";
				String ExpectedLabel= Username;
				Assert.assertEquals(ExpectedLabel, ActualLabel);
				
				//Applied the condition through if else statement
				if(ExpectedLabel==Username) {
					System.out.println("Your Expected Label is = "+Username);}
				else {
					System.out.println("Your Expected Label is incorrect");
					Thread.sleep(3000);}
				
				// Get UserName_Label(Username)
				String password = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]"
						+ "/form/div[2]/div/div[1]/label")).getText();
				String ActualPassword = "Password";
				String ExpectedPassword= password;
				Assert.assertEquals(ExpectedPassword, ActualPassword);
				
				//Applied the condition through if else statement
				if(ExpectedPassword==password) {
					System.out.println("Your Expected Label is = "+password);}
				else {
					System.out.println("Your Expected Label is incorrect");}
				Thread.sleep(3000);
		//Create Object 
		GoogleLoginPage LoginPage = new GoogleLoginPage(driver);
		LoginPage.username.sendKeys("Admin");
		LoginPage.password.sendKeys("admin123");
		LoginPage.clickButton.click();
		Thread.sleep(3000);
		driver.close();
		

		
	}

}
