package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TravelsLogin extends BasicPage {
	
	private By email = By.name("email");
	private By pass = By.name("password");
	private By remeberMe = By.className("checkbox");
	private By forgetPass = By.cssSelector(".forget-password a");
	private By login = By.cssSelector("button.btn");
	
	public TravelsLogin(WebDriver driver) {
		super(driver);
	}
	
	public void setEmail(String email) {
		this.driver.findElement(this.email).sendKeys(email);
	}
	
	public void setPass(String password) {
		this.driver.findElement(this.pass).sendKeys(password);
	}
	
	public void clickOnLoginBtn() {
		this.driver.findElement(this.login).click();
	}
	
	public void clickOnRemember() {
		this.driver.findElement(this.remeberMe).click();
	}
	public void clickOnForget() {
		this.driver.findElement(this.forgetPass).click();
	}

}
