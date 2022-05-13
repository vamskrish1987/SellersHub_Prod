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
public class Inventory extends generalMethods {
	
	@Test (priority=0)
	public void addproduct() throws InterruptedException
	{
		navigateToUrl();
		Thread.sleep(3000);
		assertEquals("Sellers Hub",driver.getTitle());
		Thread.sleep(3000);
		loginToTheWebsite("support@sellershub.io","demo12345");
		Thread.sleep(8000);
		try {
			ClickOnInventory();
			Thread.sleep(3000);
			ClickOnProducts();
			Thread.sleep(3000);
			ClickOnAddProductButton();
			Thread.sleep(3000);
			FilltheProductDetails();
			Thread.sleep(3000);
			FilltheSKUPriceQuantity();
			Thread.sleep(3000);
			SelectVariation();
			Thread.sleep(3000);
			UploadProductImage();
			Thread.sleep(3000);
			FillTheAttributes();
			Thread.sleep(3000);
			FillTheSupplier();
			
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
	}
	
	@Test (priority=1)
	public void productspage() throws InterruptedException
	{
		navigateToUrl();
		Thread.sleep(3000);
		assertEquals("Sellers Hub",driver.getTitle());
		Thread.sleep(3000);
		//loginToTheWebsite("support@sellershub.io","demo12345");
		Thread.sleep(8000);
		try {
			ClickOnInventory();
			Thread.sleep(3000);
			ClickOnProducts();
			Thread.sleep(3000);
			assertEquals(true,driver.findElement(By.xpath("//*[@id=\"products\"]/div/div/div/app-products/div[1]/div/div/div/div/div[3]/table/tbody/tr[1]/td[3]")).isDisplayed());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	@Test (priority=2)
	public void Categories() throws InterruptedException
	{
		navigateToUrl();
		Thread.sleep(3000);
		assertEquals("Sellers Hub",driver.getTitle());
		Thread.sleep(3000);
		//loginToTheWebsite("support@sellershub.io","demo12345");
		Thread.sleep(8000);
		try {
			ClickOnInventory();
			Thread.sleep(3000);
			ClickOnCategories();
			Thread.sleep(3000);
			assertEquals(true,driver.findElement(By.xpath("//*[@id=\"category\"]/div/div/div/app-category/div[1]/div/div/div[1]/div/div/div/button")).isDisplayed());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	@Test (priority=4)
	public void ChannelProducts() throws InterruptedException
	{
		navigateToUrl();
		Thread.sleep(3000);
		assertEquals("Sellers Hub",driver.getTitle());
		Thread.sleep(3000);
		//loginToTheWebsite("support@sellershub.io","demo12345");
		Thread.sleep(8000);
		try {
			ClickOnInventory();
			Thread.sleep(3000);
			ClickOnChannelProducts();
			Thread.sleep(3000);
			assertEquals(true,driver.findElement(By.xpath("//*[@id=\"channel_products\"]/div/div/div/app-channel-products/div[1]/div/div/div/div/div[1]/div/div/div[5]/button")).isDisplayed());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	@Test (priority=3)
	public void StockViewPage() throws InterruptedException
	{
		navigateToUrl();
		Thread.sleep(3000);
		assertEquals("Sellers Hub",driver.getTitle());
		Thread.sleep(3000);
		//loginToTheWebsite("support@sellershub.io","demo12345");
		Thread.sleep(8000);
		try {
			ClickOnInventory();
			Thread.sleep(3000);
			ClickOnStockViewPage();
			Thread.sleep(3000);
			assertEquals(true,driver.findElement(By.xpath("//*[@id=\"stock_view\"]/div/div/div/app-stock-overview/div[1]/div/div/div/div/div[2]/table/tbody/tr[1]/td[1]")).isDisplayed());
			assertEquals(true,driver.findElement(By.xpath("//*[@id=\"stock_view\"]/div/div/div/app-stock-overview/div[1]/div/div/div/div/div[2]/table/tbody/tr[1]/td[2]")).isDisplayed());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	@Test (priority=5)
	public void PurchaseOrdersPage() throws InterruptedException
	{
		navigateToUrl();
		Thread.sleep(3000);
		assertEquals("Sellers Hub",driver.getTitle());
		Thread.sleep(3000);
		//loginToTheWebsite("support@sellershub.io","demo12345");
		Thread.sleep(8000);
		try {
			ClickOnInventory();
			Thread.sleep(3000);
			ClickOnPurchaseOrdersPage();
			Thread.sleep(3000);
			assertEquals(true,driver.findElement(CreatePurchaseOrderButton).isDisplayed());
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
