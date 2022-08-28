package executetext;

import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.GoogleLoginPage;
		public class TestGoogleSite {
		public static void main(String[]args) throws InterruptedException {
			WebElement image = null;
		
		System.setProperty("webdriver.chrome.driver", "F:\\Automation\\MyFirstMaven\\folder\\chromedriver\\chromedriver.exe"); 
		//*******************************Set the Webdriver(chrome driver)************************
		WebDriver driver = new ChromeDriver();
		// Get Site URL 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		//***************************Get company-branding image at Login page***********************
//		WebElement image = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]"));
//		//Applied the condition through if else statement 
//		if(image.isDisplayed()) {
//				System.out.println("company-branding available");
//			}
//		else {
//			System.out.println("company-branding missing");
//			Thread.sleep(2000);}
		
		//**************************Get Orangehrm-Logo at Login page******************************
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
		AssertJUnit.assertEquals(ExpectedText, ActualText);
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
				AssertJUnit.assertEquals(ExpectedLabel, ActualLabel);
				
				//Applied the condition through if else statement
				if(ExpectedLabel==Username) {
					System.out.println("Your Expected Label is = "+Username);}
				else {
					System.out.println("Your Expected Label is incorrect");
					Thread.sleep(3000);}
				
				// Get Password_Label(Password)
				String password = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]"
						+ "/form/div[2]/div/div[1]/label")).getText();
				String ActualPassword = "Password";
				String ExpectedPassword= password;
				AssertJUnit.assertEquals(ExpectedPassword, ActualPassword);
				
				//Applied the condition through if else statement
				if(ExpectedPassword==password) {
					System.out.println("Your Expected Label is = "+password);}
				else {
					System.out.println("Your Expected Label is incorrect");}
				Thread.sleep(3000);
				//Get LoginButton_Label(Login)
				String Btnlogin = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/"
						+ "div/div[2]/div[2]/form/div[3]/button")).getText();
				String ActualBtnLabel = "Login";
				String ExpectedBtnLabel= Btnlogin;
				AssertJUnit.assertEquals(ExpectedBtnLabel, ActualBtnLabel);
				
				//Applied the condition through if else statement
				if(ExpectedBtnLabel==Btnlogin) {
					System.out.println("Your Expected Label is = "+Btnlogin);}
				else {
					System.out.println("Your Expected Label is incorrect");}
//				Thread.sleep(3000);
//				//***********************Click at Linkedin link****************
//				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/"
//						+ "div/div[2]/div[3]/div[1]/a[1]")).click();
//				Thread.sleep(2000);
//				//***********************Click at Facebook link****************
//				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/"
//						+ "div/div[2]/div[3]/div[1]/a[2]")).click();
//				Thread.sleep(2000);
//				//***********************Click at Twitter link****************
//				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/"
//						+ "div/div[2]/div[3]/div[1]/a[3]")).click();
//				Thread.sleep(2000);
//				//***********************Click at Youtube link****************
//				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/"
//						+ "div/div[2]/div[3]/div[1]/a[4]")).click();
				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]")).click();
				Thread.sleep(2000);
		//Create Object 
				GoogleLoginPage LoginPage = new GoogleLoginPage(driver);
				LoginPage.username.sendKeys("Admin");
				LoginPage.password.sendKeys("admin123");
				LoginPage.clickButton.click();
				LoginPage.image.isDisplayed();
				
				if(image.isDisplayed()) {
					System.out.println("company-branding available");
				}
			else {
				System.out.println("company-branding missing");}
				
				Thread.sleep(3000);
				driver.close();
		

		
	

}}
