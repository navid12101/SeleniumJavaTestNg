package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import junit.framework.Assert;

public class GoogleLoginPage {

	WebElement driver ;
	public GoogleLoginPage(WebDriver driver2 ) {


		PageFactory.initElements(driver, this);
	}
	By name = By.name("username");
	public void username(String input) {
		driver.findElement(name).sendKeys("input");
	}
	By password = By.name("password");
	public void password(String input) {
		driver.findElement(password).sendKeys("input");
	}
	By Button = By.xpath("//*[@id=\\\"app\\\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	public void Button() {
		driver.findElement(Button).click();
	}

}		

//	@FindBy(name="username")
//	public WebElement username;
//	@FindBy(name="password")
//	public WebElement password;
//	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
//	public WebElement clickButton;
//	












