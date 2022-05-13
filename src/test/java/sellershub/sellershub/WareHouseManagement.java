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

import junit.framework.Assert;

public class WareHouseManagement extends generalMethods 
{
	@Test (priority=0)
	public void WareHousesPage() throws InterruptedException
	{
		navigateToUrl();
		Thread.sleep(10000);
		assertEquals("Sellers Hub",driver.getTitle());
		Thread.sleep(10000);
		loginToTheWebsite("support@sellershub.io","demo12345");
		Thread.sleep(45000);
		ClickOnWarehouseManagement();
		Thread.sleep(10000);
		ClickOnWarehouses();
		Thread.sleep(10000);
		assertEquals(true,driver.findElement(By.xpath("//*[@id=\"warehouses\"]/div/div/div/app-warehouses/div[1]/div/div/div/div/div[2]/table/thead/th[1]/text()")).isDisplayed());
		
	}
    @Test (priority=1)
	public void CreateWareHouse() throws InterruptedException
	{
		navigateToUrl();
		Thread.sleep(10000);
		assertEquals("Sellers Hub",driver.getTitle());
		Thread.sleep(10000);
		//loginToTheWebsite("support@sellershub.io","demo12345");
		Thread.sleep(40000);
		ClickOnWarehouseManagement();
		Thread.sleep(10000);
		ClickOnWarehouses();
		Thread.sleep(10000);
		CreateNewWarehouse();
		Thread.sleep(10000);
		assertEquals(true,driver.findElement(CreateNewLocationE).isDisplayed());
		if(driver.findElement(CreateNewLocationE).isDisplayed() == true)
		{
			System.out.print("Warehouse Created Successfully\n");
		}
		
	}
    
    @Test (priority=2)
   	public void CreateLocation() throws InterruptedException
   	{
   		navigateToUrl();
   		Thread.sleep(10000);
   		assertEquals("Sellers Hub",driver.getTitle());
   		Thread.sleep(10000);
   		//loginToTheWebsite("support@sellershub.io","demo12345");
   		Thread.sleep(40000);
   		ClickOnWarehouseManagement();
   		Thread.sleep(10000);
   		ClickOnWarehouses();
   		Thread.sleep(10000);
   		CreateNewLocation();
   		Thread.sleep(10000);
   		if(driver.findElement(CreateNewLocationE).isDisplayed() == true)
		{
			System.out.print("WareHouse Location Created Successfully\n");
		}
   		
   	}
}
