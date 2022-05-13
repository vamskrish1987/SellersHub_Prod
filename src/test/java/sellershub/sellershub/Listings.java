package sellershub.sellershub;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Listings extends generalMethods
{  

	@Test (priority=1)
	public void WaitingToListPage() throws InterruptedException 
	{
		navigateToUrl();
		Thread.sleep(3000);
		assertEquals("Sellers Hub",driver.getTitle());
		Thread.sleep(3000);
		loginToTheWebsite("support@sellershub.io","demo12345");
		Thread.sleep(8000);
		ClickOnListings();
		Thread.sleep(3000);
		ClickOnWaitingToList();
		Thread.sleep(3000);
		assertEquals(true,driver.findElement(By.xpath("//*[@id=\"waiting_to_list\"]/div/div/div/app-waiting-to-list/div[1]/div/div/div/div/div[2]/table/thead/th[2]")).isDisplayed());
	}
	@Test (priority=2)
	public void ListingErrorsPage() throws InterruptedException 
	{
		navigateToUrl();
		Thread.sleep(3000);
		assertEquals("Sellers Hub",driver.getTitle());
		Thread.sleep(3000);
		//loginToTheWebsite("support@sellershub.io","demo12345");
		Thread.sleep(8000);
		ClickOnListings();
		Thread.sleep(3000);
		ClickOnListingErrors();
		Thread.sleep(3000);
		assertEquals(true,driver.findElement(By.xpath("//*[@id=\"lis_errors\"]/div/div/div/app-listing-errors/div[1]/div/div/div/div/div[2]/table/thead/th[2]")).isDisplayed());
	}
	@Test (priority=3)
	public void ListedProductsPage() throws InterruptedException 
	{
		navigateToUrl();
		Thread.sleep(3000);
		assertEquals("Sellers Hub",driver.getTitle());
		Thread.sleep(3000);
		//loginToTheWebsite("support@sellershub.io","demo12345");
		Thread.sleep(8000);
		ClickOnListings();
		Thread.sleep(3000);
		ClickOnListedProducts();
		Thread.sleep(3000);
		assertEquals(true,driver.findElement(By.xpath("//*[@id=\"listed_products\"]/div/div/div/app-listed-products/div[1]/div/div/div/div/div[3]/table/tbody/tr[1]/td[3]")).isDisplayed());
	}
	@Test (priority=4)
	public void ClosedProductsPage() throws InterruptedException 
	{
		navigateToUrl();
		Thread.sleep(3000);
		assertEquals("Sellers Hub",driver.getTitle());
		Thread.sleep(3000);
		//loginToTheWebsite("support@sellershub.io","demo12345");
		Thread.sleep(8000);
		ClickOnListings();
		Thread.sleep(3000);
		ClickOnClosedProducts();
		Thread.sleep(3000);
		assertEquals(true,driver.findElement(By.xpath("//*[@id=\"closed_products\"]/div/div/div/app-closed-products/div[1]/div/div/div/div/div[2]/table/thead/th[2]")).isDisplayed());
	}
	@Test (priority=5)
	public void ProductsInFBAPage() throws InterruptedException 
	{
		navigateToUrl();
		Thread.sleep(3000);
		assertEquals("Sellers Hub",driver.getTitle());
		Thread.sleep(3000);
		//loginToTheWebsite("support@sellershub.io","demo12345");
		Thread.sleep(8000);
		ClickOnListings();
		Thread.sleep(3000);
		ClickOnProductsInFBAPage();
		Thread.sleep(3000);
		assertEquals(true,driver.findElement(By.xpath("//*[@id=\"products_in_fba\"]/div/div/div/app-products-in-fba/div[1]/div/div/div/div/div[2]/table/tbody/tr[1]/td[2]")).isDisplayed());
	}
	
	
}
