package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.TravelsCarsExtras;

public class TravelsCarsExtrasTest extends TestLogin {
private String baseURL = "https://www.phptravels.net/admin";
	
	@Test
	public void extras() throws InterruptedException {
		driver.get ("https://www.phptravels.net/admin/cars/extras");
		Thread.sleep(2000);
		TravelsCarsExtras tce = new TravelsCarsExtras(driver);
		tce.clickAdd();
		Thread.sleep(1000);
		tce.setName("Hyundai");
		Thread.sleep(1000);
		tce.setPrice("200");
		tce.clickStatus();
		Thread.sleep(1000);
		tce.clickOnUpload();
		Thread.sleep(3000);
		tce.clickOnSave();
		Thread.sleep(4000);
		
		Assert.assertTrue(tce.getRow().getText().contains("Hyundai"));
		Thread.sleep(2000);
		Assert.assertTrue(tce.getRow().getText().contains("200"));
	}

}