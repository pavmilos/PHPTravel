package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.TravelCustomer;

public class TravelCustomerTest extends TestLogin {
	private String baseURL = "https://www.phptravels.net/admin";

	@Test
	public void extras() throws InterruptedException {
		driver.get("https://www.phptravels.net/admin/accounts/customers/");
		Thread.sleep(2000);
		TravelCustomer tc = new TravelCustomer(driver);
		tc.clickEdit();
		Thread.sleep(3000);
		tc.clearFirstNumber();
		Thread.sleep(3000);
		tc.setFirstName("Ime");
		Thread.sleep(3000);
		tc.clearLastName();
		Thread.sleep(3000);
		tc.setLastName("Prezime");
		Thread.sleep(3000);
		tc.clearAddress();
		Thread.sleep(3000);
		tc.setAddress("Adresa");
		Thread.sleep(3000);
		tc.clearNumber();
		Thread.sleep(3000);
		tc.setNumber("123456789");
		Thread.sleep(3000);
		tc.getCountry();
		Thread.sleep(3000);
		tc.getStatus();
		Thread.sleep(3000);
		tc.clearEmail();
		Thread.sleep(3000);
		tc.setEmail("com@com.com");
		Thread.sleep(3000);
		tc.clickNewsLetter();
		tc.clickSubmit();
		Thread.sleep(3000);
		tc.clickSearch();
		Thread.sleep(3000);
		tc.setCeck("Ime");
		Thread.sleep(3000);
		tc.clickGo();
		Assert.assertFalse(tc.getCustomer().getText().contains("Ime"));

	}

}
