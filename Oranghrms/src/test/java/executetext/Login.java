package executetext;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.AssertJUnit;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Login {
	WebDriver driver = null;
	WebElement element = null ;
	//**************BeforeTest for Setup *****************************************
	@BeforeTest
	public void setup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Get Base******************************************* URL 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	//********Get A_Company_BImage and Apply The Check Using IF_Else**************
	@Test(priority=1)
	public void A_company_bImage(){
		// Explicit Wait *********************************** For waiting 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='company-branding']")));
		WebElement image = driver.findElement(By.xpath("//img[@alt='company-branding']"));

		if(image.isDisplayed()) {
			System.out.println("Company-Branding Available");
		}
		else {
			System.out.println("Company-Branding Missing");

		}
	}
	//************************Get Orangehrm-Logo at Login page********************
	@Test(priority=2)
	public void B_OrangHRM_Logo() 
	{
		WebElement Oranghrlogo = driver.findElement(By.xpath("// img[@alt='orangehrm-logo']"));
		//Applied the condition through if else statement 
		if(Oranghrlogo.isDisplayed()) {
			System.out.println("OrangeHRM-Logo is Available");
		}
		else {
			System.out.println("OrangeHRM-Logo is Missing");}
		}

	//**********************Get Page Heading Login**********************************
	@Test(priority=3)
	public void Page_Heading()

	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));	
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[normalize-space()='Login']")));

		String text = driver.findElement(By.xpath("//h5[normalize-space()='Login']")).getText();
		String ActualText = "Login";
		String ExpectedText= text;
		AssertJUnit.assertEquals(ExpectedText, ActualText);
		//Applied the condition through if else statement
		if(ExpectedText==text) {
			System.out.println("Your Expected Heading is = "+text);}
		else {
			System.out.println("Your Expected Heading is incorrect");}
	}

	// ***********************Get UserName_Label(Username)*************************
	@Test(priority=4)
	public void Username() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("// label[@class='oxd-label']")));
		String Username = driver.findElement(By.xpath("// label[@class='oxd-label']")).getText();
		String ActualLabel = "Username";
		String ExpectedLabel= Username;
		AssertJUnit.assertEquals(ExpectedLabel, ActualLabel);

		//Applied condition through if else statement
		if(ExpectedLabel==Username) {
			System.out.println("Your Expected Label is = "+Username);}
		else {
			System.out.println("Your Expected Label is incorrect");
		}

	}
	
	// ********************************Get Lebel Password*************************

	@Test(priority=5)
	public void Password() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[normalize-space()='Password']")));

		String password = driver.findElement(By.xpath("//label[normalize-space()='Password']")).getText();
		String ActualPassword = "Password";
		String ExpectedPassword= password;
		AssertJUnit.assertEquals(ExpectedPassword, ActualPassword);

		//Applied the condition through if else statement
		if(ExpectedPassword==password) {
			System.out.println("Your Expected Label is = "+password);}
		else {
			System.out.println("Your Expected Label is incorrect");}}

	// ****************************Get Login Button Label*************************

	@Test(priority=6)
	public void Login_Button() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//Button[normalize-space()='Login']")));

		String Btnlogin = driver.findElement(By.xpath("//Button[normalize-space()='Login']")).getText();
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
	//***********************Click at Linkedin link*******************************
	@Test(priority=7)
	public void Linkedin() throws InterruptedException
	{
		driver.findElement(By.xpath("(//*[name()='svg'][@role='presentation'])[1]")).click();
	}
	//***********************Click at Facebook link********************************
	@Test(priority=8)
	public void Facebook() throws InterruptedException
	{
		driver.findElement(By.xpath("(//*[name()='path'][@class='st0'])[2]")).click(); 
	}
	//	//***********************Click at Twitter link******************************
	@Test(priority=9)
	public void Twitter()
	{
		driver.findElement(By.xpath("(//*[name()='path'][@class='st0'])[3]")).click();
	}

	//***********************Click at Youtube link***********************************
	@Test(priority=10)
	public void Youtube() throws InterruptedException{
		driver.findElement(By.xpath("(//*[name()='path'][@class='st0'])[4]")).click();

	}
	//***********************Click at Youtube link***********************************
	@Test(priority=11)
	public void login()  {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");

		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@AfterTest
	public void teardown() 
	{
		driver.close();
		driver.quit();

	}}




