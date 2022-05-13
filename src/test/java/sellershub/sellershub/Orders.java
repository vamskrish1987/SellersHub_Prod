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
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Orders extends generalMethods{
	
	@Test (priority=0)
	public void OrderSummaryPage() throws InterruptedException
	{
		navigateToUrl();
		Thread.sleep(3000);
		assertEquals("Sellers Hub",driver.getTitle());
		Thread.sleep(3000);
		loginToTheWebsite("support@sellershub.io","demo12345");
		Reporter.log("Login into Sellershub.io");
		Thread.sleep(8000);
		ClickOnOrders();
		Reporter.log("Click On Orders menu");
		Thread.sleep(3000);
		ClickOnOrderSummaryPage();
		Reporter.log("Click On Orders Summary Page");
		Thread.sleep(3000);
		assertEquals(true,driver.findElement(By.xpath("//*[@id=\"order_summary\"]/div/div/div/app-order-summary/div/div/div/div/div/div[1]/div/h4")).isDisplayed());
		Reporter.log("Verify element visible");
	}
	
	@Test (priority=1)
	public void SalesOrderPage() throws InterruptedException
	{
		navigateToUrl();
		System.out.print("sales order page+++");
		Thread.sleep(3000);
		assertEquals("Sellers Hub",driver.getTitle());
		Thread.sleep(3000);
		//loginToTheWebsite("support@sellershub.io","demo12345");
		Thread.sleep(8000);
		ClickOnOrders();
		Thread.sleep(3000);
		ClickOnSalesOrderPage();
		Thread.sleep(3000);
		assertEquals(true,driver.findElement(By.xpath("//*[@id=\"salesTable\"]/tbody/tr[1]/td[3]/span")).isDisplayed());
		
	}
	
	@Test (priority=2)
	public void MCFOrdersPage() throws InterruptedException
	{
		navigateToUrl();
		Thread.sleep(3000);
		assertEquals("Sellers Hub",driver.getTitle());
		Thread.sleep(3000);
		//loginToTheWebsite("support@sellershub.io","demo12345");
		Thread.sleep(8000);
		ClickOnOrders();
		Thread.sleep(3000);
		ClickOnMCFOrdersPage();
		Thread.sleep(3000);
		assertEquals(true,driver.findElement(By.xpath("//*[@id=\"mcf_Orders\"]/div/div/div/app-mcf-orders/div[1]/div/div/div/div/div[1]/div[1]/h4")).isDisplayed());
		
	}
	
	@Test (priority=3)
	public void ShippedOrdersPage() throws InterruptedException
	{
		navigateToUrl();
		Thread.sleep(3000);
		assertEquals("Sellers Hub",driver.getTitle());
		Thread.sleep(3000);
		//loginToTheWebsite("support@sellershub.io","demo12345");
		Thread.sleep(8000);
		ClickOnOrders();
		Thread.sleep(3000);
		ClickOnShippedOrdersPage();
		Thread.sleep(3000);
		assertEquals(true,driver.findElement(By.xpath("//*[@id=\"shipped_Orders\"]/div/div/div/app-shipped-orders/div[1]/div/div/div/div/div[1]/div")).isDisplayed());
		
	}
	
	@Test (priority=4)
	public void CancelledOrdersPage() throws InterruptedException
	{
		navigateToUrl();
		Thread.sleep(3000);
		assertEquals("Sellers Hub",driver.getTitle());
		Thread.sleep(3000);
		//loginToTheWebsite("support@sellershub.io","demo12345");
		Thread.sleep(8000);
		ClickOnOrders();
		Thread.sleep(3000);
		ClickOnCancelledOrdersPage();
		Thread.sleep(3000);
		assertEquals(true,driver.findElement(By.xpath("//*[@id=\"cancelled_Orders\"]/div/div/div/app-cancelled-orders/div/div/div/div/div/div[1]/div")).isDisplayed());
		
	}
	
}
	


