package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TravelsCarsExtras extends BasicPage {

	public TravelsCarsExtras(WebDriver driver) {
		super(driver);
	}

	private By add = By.cssSelector("a.btn.btn-success.xcrud-action");
	private By name = By.cssSelector("input.xcrud-input.form-control ");
	private By price = By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[4]/div/input");
	private By status = By.cssSelector("select.xcrud-input.form-control");
	private By save = By.cssSelector("a.btn.btn-primary.xcrud-action");
	private By cars = By.cssSelector("tr.xcrud-row.xcrud-row-0");
	
	
	
	public void clickAdd() {
		this.driver.findElement(this.add).click();
	}
	public void setName(String name) {
		this.driver.findElement(this.name).sendKeys(name);
	}
	public void setPrice(String price) {
		this.driver.findElement(this.price).sendKeys(price);
	}
	public void clickOnSave() {
		this.driver.findElement(this.save).click();
	}
	
	public void clickOnUpload() {
		WebElement uploadPicture = driver.findElement(By.name("xcrud-attach"));
		uploadPicture.sendKeys("C:\\ECLP stari\\ppic.png");
	}
	public void clickStatus() {
		WebElement selectStatus = driver.findElement(this.status);
		Select statusi = new Select(selectStatus);
		statusi.selectByVisibleText("No");
	}
	public WebElement getRow() {
		return this.driver.findElement(this.cars);
	}
	

}