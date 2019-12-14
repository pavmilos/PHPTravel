package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.TravelCars;

public class TravelsCarsTest extends TestLogin {
	private String baseURL = "https://www.phptravels.net/admin";
	
	@Test
	public void checkCars() throws InterruptedException {
		driver.get("https://www.phptravels.net/admin/cars");
		Thread.sleep(2000);
		TravelCars tcp = new TravelCars(driver);
		tcp.isCars10();
		Assert.assertEquals(tcp.isCars10(), false);
		tcp.isOrdersMoreThen50();
		Assert.assertFalse(tcp.isOrdersMoreThen50());
	}
}
