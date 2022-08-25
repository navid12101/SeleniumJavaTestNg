package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleLoginPage {
	public GoogleLoginPage(WebDriver driver ) {
	PageFactory.initElements(driver, this);
	}
	@FindBy(name="username")
	public WebElement username;
	@FindBy(name="password")
	public WebElement password;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	public WebElement clickButton;
	

}
