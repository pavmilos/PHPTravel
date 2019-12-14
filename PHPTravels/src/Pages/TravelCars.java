package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TravelCars extends BasicPage {

	public TravelCars(WebDriver driver) {
		super(driver);
	}

	private By cars = By.cssSelector(".xcrud-row");
	private List<WebElement> listCars = driver.findElements(this.cars);
	private By orders = By.cssSelector(".form-control.input-sm");

	public boolean isCars10() {
		boolean cars1 = false;
		WebElement cars = driver.findElement(this.cars);
		if (listCars.size() == 10) {
			cars1 = true;
		}
		return cars1;
	}

	public boolean isOrdersMoreThen50() {
		boolean orders = false;
		int sumOrder = 0;
		WebElement orderNumbr = driver.findElement(this.orders);
		List<WebElement> cars = driver.findElements(this.orders);
		for (int i = 0; i < cars.size(); i++) {
			String str = cars.get(i).getAttribute("value");
			int number = Integer.valueOf(str);
			sumOrder += number;
		}
		if (sumOrder > 50) {
			orders = true;
		}
		return orders;
	}

}
