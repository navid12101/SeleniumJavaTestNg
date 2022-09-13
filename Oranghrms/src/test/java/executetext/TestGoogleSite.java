package executetext;

import org.testng.AssertJUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pom.GoogleLoginPage;
public class TestGoogleSite {

	WebDriver driver = null ;
	//public static void main(String[]args) throws InterruptedException {

	@BeforeTest
	public void Test() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "F:\\Automation\\MyFirstMaven\\folder\\chromedriver\\chromedriver.exe"); 
		//*******************************Set the Webdriver(chrome driver)************************
		WebDriver driver = new ChromeDriver();
		// Get Site URL 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);}
	//**************************Get company-branding at Login page******************************



	@Test(priority=1)
	public void Company_Branding_Image() {
		WebElement image = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img"));

		if(image.isDisplayed()) {
			System.out.println("Company-Branding Available");
		}
		else {
			System.out.println("Company-Branding Missing");}}
	//**************************Get Orangehrm-Logo at Login page******************************
	@Test(priority=2)
	public void OrangHRM_Logo() {WebElement Oranghrlogo = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[2]/img"));
	//Applied the condition through if else statement 
	if(Oranghrlogo.isDisplayed()) {
		System.out.println("OrangeHRM-Logo is Available");
	}
	else {
		System.out.println("OrangeHRM-Logo is Missing");}}

	// Get Page heading(Login)
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
			System.out.println("Your Expected Heading is incorrect");}
		Thread.sleep(2000);}
	// Get UserName_Label(Username)
	@Test(priority=4)
	public void Username() throws InterruptedException
	{
		String Username = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]"
				+ "/form/div[1]/div/div[1]/label")).getText();
		String ActualLabel = "Username";
		String ExpectedLabel= Username;
		AssertJUnit.assertEquals(ExpectedLabel, ActualLabel);

		//Applied the condition through if else statement
		if(ExpectedLabel==Username) {
			System.out.println("Your Expected Label is = "+Username);}
		else {
			System.out.println("Your Expected Label is incorrect");}
		Thread.sleep(3000);}

	// Get Password_Label(Password)
	@Test(priority=5)
	public void Password() throws InterruptedException
	{
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
		Thread.sleep(3000);}
	//Get LoginButton_Label(Login)
	@Test(priority=6)
	public void Login_Button() throws InterruptedException {
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
		Thread.sleep(3000);}
	//				//***********************Click at Linkedin link****************
	@Test(priority=7)
	public void Linkedin() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/"
				+ "div/div[2]/div[3]/div[1]/a[1]")).click();
		Thread.sleep(2000);}
	//				//***********************Click at Facebook link****************
	@Test(priority=8)
	public void Facebook() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/"
				+ "div/div[2]/div[3]/div[1]/a[2]")).click(); 
		Thread.sleep(2000);}
	//				//***********************Click at Twitter link****************
	@Test(priority=9)
	public void Twitter()
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[4]")).click();
	}

	//				//***********************Click at Youtube link****************
	@Test(priority=10)
	public void Youtube(){
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[4]")).click();	
	}
	@Test(priority=11)
	public void search() {

		GoogleLoginPage LoginPage = new GoogleLoginPage(driver );
		LoginPage.username("Admin");
		LoginPage.password("admin123");
		LoginPage.Button();

	}
}













