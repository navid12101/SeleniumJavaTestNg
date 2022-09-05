package oranghrms;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.time.Duration;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	WebDriver driver = null;


	@BeforeTest
	public void setup() throws InterruptedException {

		//String Path = System.getProperty("user.dir");
		//System.setProperty("webdriver.driver.chromedriver", Path+ "/folder//Oranghrms/Chrome/chromedriver");
		//Launch Chrome********************************************** Browser 
		System.setProperty("webdriver.chrome.driver", "F:\\Automation\\MyFirstMaven\\folder\\chromedriver\\chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Get Base******************************************* URL 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img")));
	}
	//Get A_Company_BImage ************************and Apply The Check Using IF_Else
	@Test(priority=1)
	public void A_company_bImage() throws InterruptedException {

		WebElement image = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img"));

		if(image.isDisplayed()) {
			System.out.println("Company-Branding Available");
		}
		else {
			System.out.println("Company-Branding Missing");

		}
	}
	//**************************Get Orangehrm-Logo at Login page******************************
	@Test(priority=2)
	public void B_OrangHRM_Logo() throws InterruptedException 
	{
		WebElement Oranghrlogo = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[2]/img"));
		//Applied the condition through if else statement 
		if(Oranghrlogo.isDisplayed()) {
			System.out.println("OrangeHRM-Logo is Available");
		}
		else {
			System.out.println("OrangeHRM-Logo is Missing");}
		//Thread.sleep(2000);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));	WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/h5")));
	}
//	
//
//	// *************************************************Get Page heading(Login)********************
	@Test(priority=3)
	public void Page_Heading() throws InterruptedException
	{
		String text = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/h5")).getText();
		String ActualText = "Login";
		String ExpectedText= text;
		AssertJUnit.assertEquals(ExpectedText, ActualText);
		//Applied the condition through if else statement
		if(ExpectedText==text) {
			System.out.println("Your Expected Heading is = "+text);}
		else {
			System.out.println("Your Expected Heading is incorrect");}}
		//Thread.sleep(2000);
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[1]/label")));
//	}
		
//	// *******************************************Get UserName_Label(Username)*************************
	@Test(priority=4)
	public void Username() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[1]/label")));
		String Username = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[1]/label")).getText();
		String ActualLabel = "Username";
		String ExpectedLabel= Username;
		AssertJUnit.assertEquals(ExpectedLabel, ActualLabel);

		//Applied the condition through if else statement
		if(ExpectedLabel==Username) {
			System.out.println("Your Expected Label is = "+Username);}
		else {
			System.out.println("Your Expected Label is incorrect");
			}
	
		}
//
//	// Get Password_Label(Password)
	@Test(priority=5)
	public void Password() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[1]/label")));
		
		String password = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]"
				+ "/form/div[2]/div/div[1]/label")).getText();
		String ActualPassword = "Password";
		String ExpectedPassword= password;
		AssertJUnit.assertEquals(ExpectedPassword, ActualPassword);

		//Applied the condition through if else statement
		if(ExpectedPassword==password) {
			System.out.println("Your Expected Label is = "+password);}
		else {
			System.out.println("Your Expected Label is incorrect");}}
		
//	//Get LoginButton_Label(Login)
	@Test(priority=6)
	public void Login_Button() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")));
		
		String Btnlogin = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).getText();
		String ActualBtnLabel = "Login";
		String ExpectedBtnLabel= Btnlogin;
		AssertJUnit.assertEquals(ExpectedBtnLabel, ActualBtnLabel);

		//Applied the condition through if else statement
		if(ExpectedBtnLabel==Btnlogin) {
			System.out.println("Your Expected Label is = "+Btnlogin);}
		else {
			System.out.println("Your Expected Label is incorrect");
			}
	}
//	//			//***********************Click at Linkedin link****************
	@Test(priority=7)
	public void Linkedin() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/"
				+ "div/div[2]/div[3]/div[1]/a[1]")).click();
		}
	//***********************Click at Facebook link****************
	@Test(priority=8)
	public void Facebook() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/"
				+ "div/div[2]/div[3]/div[1]/a[2]")).click(); 
		}
//	//***********************Click at Twitter link****************
	@Test(priority=9)
	public void Twitter()
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[4]")).click();
	}

//	//***********************Click at Youtube link****************
	@Test(priority=10)
	public void Youtube() throws InterruptedException{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[4]")).click();
		
	}
	@Test(priority=11)
	public void login() throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}

	@AfterTest
	public void teardown() 
	{
		driver.close();
		driver.quit();

}}




