package stepdefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClass {
	
	public WebDriver driver;
	
	//Declaration
	@FindBy(name="user-name")private WebElement user;
	@FindBy(name="password")private WebElement passwd;
	@FindBy(name="login-button")private WebElement clickbtn;

	//Initialization
	public POMClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	public void login(String uname,String pass) {
		user.sendKeys(uname);
		passwd.sendKeys(pass);
		clickbtn.click();
	}
}