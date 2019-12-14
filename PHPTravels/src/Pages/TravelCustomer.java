package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TravelCustomer extends BasicPage {

	public TravelCustomer(WebDriver driver) {
		super(driver);
	}

	private By edit = By.cssSelector(".btn.btn-default.btn-xcrud.btn.btn-warning");
	private By firstName = By.name("fname");
	private By lastName = By.name("lname");
	private By email = By.name("email");
	private By number = By.name("mobile");
	private By address = By.name("address1");
	private By country = By.xpath("//*[@id=\"s2id_autogen1\"]/a/span[1]");
	private By ststus = By.cssSelector("select.form-control");
	private By newsletter = By.name("newssub");
	private By coutry1 = By.className("select2-input");
	private By submit = By.cssSelector("button.btn.btn-primary");
	private By search = By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[3]/a");
	private By putName = By.cssSelector(
			"#content > div.panel.panel-default > div.panel-body > div > div > div.xcrud-ajax > div.xcrud-nav > span.xcrud-search.form-inline > input");
	private By go = By.cssSelector("a.xcrud-action.btn.btn-primary");
	private By customer = By.cssSelector("tr.xcrud-row");

	public void setFirstName(String name) {
		this.driver.findElement(this.firstName).sendKeys(name);
	}

	public void setLastName(String fname) {
		this.driver.findElement(this.lastName).sendKeys(fname);
	}

	public void setEmail(String email) {
		this.driver.findElement(this.email).sendKeys(email);
	}

	public void setNumber(String number) {
		this.driver.findElement(this.number).sendKeys(number);
	}

	public void setAddress(String address) {
		this.driver.findElement(this.address).sendKeys(address);
	}

	public void getCountry() {
		this.driver.findElement(this.country).click();
		WebElement zemlja = driver.findElement(this.coutry1);
		zemlja.sendKeys("Argentina");
		zemlja.sendKeys(Keys.ENTER);

	}

	public void getStatus() {
		WebElement selectStatus = driver.findElement(this.ststus);
		Select status = new Select(selectStatus);
		status.selectByVisibleText("Enabled");
	}

	public void clickNewsLetter() {
		this.driver.findElement(this.newsletter).click();
	}

	public void clickEdit() {
		this.driver.findElement(this.edit).click();
	}

	public void clearAddress() {
		this.driver.findElement(this.address).clear();
	}

	public void clearLastName() {
		this.driver.findElement(this.lastName).clear();
	}

	public void clearEmail() {
		this.driver.findElement(this.email).clear();
	}

	public void clearNumber() {
		this.driver.findElement(this.number).clear();
	}

	public void clearFirstNumber() {
		this.driver.findElement(this.firstName).clear();
	}

	public void clickSubmit() {
		this.driver.findElement(this.submit).click();
	}

	public void clickSearch() {
		this.driver.findElement(this.search).click();
	}

	public void setCeck(String name) {
		this.driver.findElement(this.putName).sendKeys(name);
	}

	public void clickGo() {
		this.driver.findElement(this.go).click();
	}

	public WebElement getCustomer() {
		return this.driver.findElement(this.customer);
	}

}
