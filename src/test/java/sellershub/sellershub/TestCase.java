package sellershub.sellershub;


import static org.testng.Assert.assertEquals;

import java.util.Random;

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

import junit.framework.Assert;

public class TestCase extends generalMethods {
	
	Random randomGenerator = new Random();  
	int randomInt = randomGenerator.nextInt(1000); 
	String str1="selenium"+randomInt+"@gmail.com";
	
	
	@Test (priority=1)
	public void LoginTestCase() throws InterruptedException {
		navigateToUrl();
		Reporter.log("Navigate To URL<br>");
		Thread.sleep(3000);
		assertEquals("Sellers Hub",driver.getTitle());
		Reporter.log("verified Title with Sellers Hub<br>");
		Thread.sleep(3000);
		loginToTheWebsite(str1,"demo12345");
		Reporter.log("Login to Support@sellershub.io<br>");
		Thread.sleep(14000);
		logOut();
		Reporter.log("Log Out from sellershub<br>");
		//Thread.sleep(8000);
	}
	@Test (priority=0)
	public void RegistrationTestCase() throws InterruptedException {
		
		navigateToUrl();
		Thread.sleep(3000);
		assertEquals("Sellers Hub",driver.getTitle());
		Thread.sleep(3000);
		signUp();
		Reporter.log("Clicked on SignUp Button<br>");
		regFullName("test");
		regEmail(str1);
		System.out.print(str1);
		regPassword("demo123");
		dropDownCountry("India");
		regMobile("9407189578");
		CompanyName("test");
		VatNumber("12345");
		dropDownChannel();
		Thread.sleep(2000);
		dropDownCourier();//need to check
		Thread.sleep(2000);
		regOrdersPerMonth("100");
		regSKU("5") ;
		regPromoCode("ABCD");
		Reporter.log("All Details entered in registration form<br>");
		getStarted();
		Thread.sleep(10000);
		String str=driver.findElement(RegSuccessMessage).getText();
		Reporter.log("Registartion Working fine<br>");
		Reporter.log(str);
		
		Thread.sleep(10000);
	}
	@Test (priority=2)
	public void SalesOrderTestCase() throws InterruptedException {
		navigateToUrl();
		Thread.sleep(3000);
		assertEquals("Sellers Hub",driver.getTitle());
		Thread.sleep(3000);
		loginToTheWebsite("support@sellershub.io","demo12345");
		Thread.sleep(8000);
		salesOrderClick();
		Reporter.log("Redirecting to sales order page  <br>");
		Thread.sleep(5000);
		assertEquals(true,driver.findElement(SalesOrderProductImg).isDisplayed());
		//assertEquals(true,driver.findElement(productDate).isDisplayed());
		assertEquals(true,driver.findElement(channelOrderID).isDisplayed());
		assertEquals(true,driver.findElement(orderStatus).isDisplayed());
		assertEquals(true,driver.findElement(orderChannel).isDisplayed());
		assertEquals(true,driver.findElement(orderProductInformation).isDisplayed());
		assertEquals(true,driver.findElement(orderQty).isDisplayed());
		assertEquals(true,driver.findElement(orderShipCost).isDisplayed());
		assertEquals(true,driver.findElement(orderShipAddress).isDisplayed());
		assertEquals(true,driver.findElement(orderShipMethod).isDisplayed());
		Reporter.log("Verified with Order image, Order ID,Order Status,Channel, Product Information,qty, Ship Cost, ship address and shipmethod showing sales order page <br>");
		Thread.sleep(8000);
	}
	@Test (priority=3)
	public void CancelOrderTestCase() throws InterruptedException {
		navigateToUrl();
		Thread.sleep(3000);
		assertEquals("Sellers Hub",driver.getTitle());
		Thread.sleep(3000);
		//loginToTheWebsite("2358@kartzhub.com","fd3fgdf237D2fsdLdfd%&5fs4346");
		Thread.sleep(9000);
		salesOrderClick();
		Reporter.log("Redirecting to sales order page  <br>");
		Thread.sleep(4000);
		orderSelectClick();
		Thread.sleep(2000);
		Reporter.log("Selected one order <br>");
		actiontabbutton();
		Thread.sleep(2000);
		Reporter.log("Clicked on action button <br>");
		cancelorderbutton();
		Thread.sleep(2000);
		Reporter.log("Clicked on Cancel order link <br>");
		cancelreasonbutton();
		Reporter.log("Clicked on Cancel order link <br>");
		cancelreasonselectbutton();//need to check
		Reporter.log("Select cancel reason <br>");
		//cancelselectordersbutton();
		Thread.sleep(2000);
		Reporter.log("Clicked on cancel reason button <br>");
		//logOut();
	}
	@Test (priority=4)
	public void PrintLabelTestCase() throws InterruptedException {
		navigateToUrl();
		Thread.sleep(3000);
		assertEquals("Sellers Hub",driver.getTitle());
		Thread.sleep(3000);
	//loginToTheWebsite("support@sellershub.io","demo12345");
	Thread.sleep(8000);
		salesOrderClick();
		Reporter.log("navigate to sales order page <br>");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"salesTable\"]/tbody/tr[1]/td[3]")).click();
		Reporter.log("Select one order <br>");
	//	orderSelectClick();
		orderPrintLabelClick();
		Reporter.log("Click on print label <br>");
		Thread.sleep(8000);
		//logOut();
	}
	@Test (priority=5)
	public void OrderSummaryTestCase() throws InterruptedException {
		navigateToUrl();
		Thread.sleep(3000);
		assertEquals("Sellers Hub",driver.getTitle());
		Thread.sleep(6000);
		//loginToTheWebsite("support@sellershub.io","demo12345");
		warehouseManagementbutton();
		Thread.sleep(8000);
		//logOut();
	}
	@Test (priority=6)
	public void ExportOrderToCSVTestCase() throws InterruptedException {
		navigateToUrl();
		Thread.sleep(3000);
		assertEquals("Sellers Hub",driver.getTitle());
		Thread.sleep(6000);
		//loginToTheWebsite("support@sellershub.io","demo12345");
		salesOrderClick();
		Reporter.log("navigate to sales order page <br>");
		Thread.sleep(6000);
		orderSelectClick();
		Reporter.log("Select the order <br>");
		Thread.sleep(3000);
		actiontabbutton();
		Reporter.log("Click on actions <br>");
		exportOrdercsvbutton();
		Reporter.log("Click on export order CSV Link <br>");
		Thread.sleep(8000);
		//logOut();
	}
	@Test (priority=7)
	public void ViewOrderDetailsTestCase() throws InterruptedException {
		navigateToUrl();
		Thread.sleep(3000);
		assertEquals("Sellers Hub",driver.getTitle());
		Thread.sleep(8000);
		//loginToTheWebsite("support@sellershub.io","demo12345");
		salesOrderClick();
		Thread.sleep(6000);
		orderSelectClick();
		Thread.sleep(3000);
		actiontabbutton();
		viewOrderDetailsbutton();
		Thread.sleep(3000);
		assertEquals(true,driver.findElement(channelReferenceID).isDisplayed());
		assertEquals(true,driver.findElement(source).isDisplayed());
		assertEquals(true,driver.findElement(subSource).isDisplayed());
		assertEquals(true,driver.findElement(status).isDisplayed());
		assertEquals(true,driver.findElement(channelBuyerName).isDisplayed());
		assertEquals(true,driver.findElement(date).isDisplayed());
		assertEquals(true,driver.findElement(subSubTotal).isDisplayed());
		assertEquals(true,driver.findElement(shippingCost).isDisplayed());
		assertEquals(true,driver.findElement(tax).isDisplayed());
		assertEquals(true,driver.findElement(total).isDisplayed());
		assertEquals(true,driver.findElement(shippingAddress).isDisplayed());
		assertEquals(true,driver.findElement(billingAddress).isDisplayed());
		itemTabClick();
		assertEquals(true,driver.findElement(productDetails).isDisplayed());
		notesTabClick();
		assertEquals(true,driver.findElement(messages).isDisplayed());
		//logOut();
	}
	@Test (priority=8)
	public void EbayIntegrationTestCase() throws InterruptedException {
		navigateToUrl();
		Thread.sleep(3000);
		assertEquals("Sellers Hub",driver.getTitle());
		Thread.sleep(3000);
		loginToTheWebsite("support@sellershub.io","demo12345");
		Thread.sleep(3000);
		integrationClick();
		channelIntegrationClick();
		Thread.sleep(3000);
		addIntegrationClick();
		addMarketplaceClick();
		ebayIntegrationClick();
		ebayDetailsClick();
		Thread.sleep(3000);
		//ebayDialogClick();
		//Thread.sleep(5000);
		//logOut();
	}
	@Test (priority=9)
	public void EditPOTestCase() throws InterruptedException {
		navigateToUrl();
		Thread.sleep(3000);
		assertEquals("Sellers Hub",driver.getTitle());
		Thread.sleep(3000);
	    //loginToTheWebsite("support@sellershub.io","demo12345");
		Thread.sleep(3000);
		inventoryClick();
		purchaseorderClick();
		Thread.sleep(8000);
		//purchaseorderFillClick();
		//Thread.sleep(5000);
		//logOut();
	}
	
	@Test (priority=10)
	public void CreateOrderTestCase() throws InterruptedException {
		navigateToUrl();
		Thread.sleep(3000);
		assertEquals("Sellers Hub",driver.getTitle());
		Thread.sleep(3000);
		//loginToTheWebsite("support@sellershub.io","demo12345");
		Thread.sleep(5000);
		salesOrderClick();
		//createOrderClick();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id=\"sales_orders\"]/div/div/div/app-sales-orders/div[1]/div/div/div/div/div[2]/div[2]/div/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"created_order\"]/div/div/div/app-create-order/div[1]/div[1]/div/div/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"created_order\"]/div/div/div/app-create-order/div[1]/div[2]/div/div/div[2]/div[2]/button")).click();
		Thread.sleep(5000);
			
		
		
		//dropDownChannelCreateOrder();
		//generateOrderButtonclick();
		//assertEquals(true,driver.findElement(channel).isDisplayed());
		//assertEquals(true,driver.findElement(orderNo).isDisplayed());
		customerDetails("test","test@gmail.com","9999999999");
		billingShippingDetails("968","Terra Cotta Street","Maplebay","Minnesota","56736");
		assertEquals(true,driver.findElement(orderNo).isDisplayed());
		Thread.sleep(5000);
		//click on add products button
		driver.findElement(By.xpath("//*[@id=\"created_order\"]/div/div/div/app-create-order/div[1]/div[2]/div/div/div[3]/div[5]/div/div[2]/div[1]/div/div/button")).click();
		Thread.sleep(5000);
		//select check box
		driver.findElement(By.xpath("//*[@id=\"productstable\"]/tbody/tr[1]/td[1]/div")).click();
		//click on save button
		driver.findElement(By.xpath("//*[@id=\"products-modal\"]/div/div/div[3]/button[1]")).click();
		//enter shipping charge
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"created_order\"]/div/div/div/app-create-order/div[1]/div[2]/div/div/div[3]/div[6]/div[1]/div/div[2]/div[1]/input")).sendKeys("12");
		//Select Payment Method
		driver.findElement(By.xpath("//*[@id=\"created_order\"]/div/div/div/app-create-order/div[1]/div[2]/div/div/div[3]/div[6]/div[2]/div/div[2]/div[1]/select")).click();
		driver.findElement(By.xpath("//*[@id=\"created_order\"]/div/div/div/app-create-order/div[1]/div[2]/div/div/div[3]/div[6]/div[2]/div/div[2]/div[1]/select/option[2]")).click();
		
		// click on payment method radio button
		driver.findElement(By.xpath("//*[@id=\"created_order\"]/div/div/div/app-create-order/div[1]/div[2]/div/div/div[3]/div[6]/div[2]/div/div[2]/div[2]/div/div[1]/label")).click();
		Thread.sleep(5000);
		//click on create order button
		driver.findElement(By.xpath("//*[@id=\"created_order\"]/div/div/div/app-create-order/div[1]/div[2]/div/div/div[3]/div[7]/div/div/button[1]")).click();
		Thread.sleep(5000);
		// click on yes
		//driver.findElement(By.xpath("/html/body/div[4]/div/div[6]/button[1]")).click();
		Thread.sleep(5000);
		//String str=driver.findElement(By.xpath("//*[@id=\"swal2-html-container\"]")).getText();
		
		//assertEquals(str,"Order created successfully.");
	}
	
	@Test (priority=11)
	public void dashboard() throws InterruptedException
	{
		navigateToUrl();
		Thread.sleep(3000);
		assertEquals("Sellers Hub",driver.getTitle());
		Thread.sleep(3000);
		//loginToTheWebsite("support@sellershub.io","demo12345");
		Thread.sleep(9000);
		clickondashboard();
		assertEquals(true,driver.findElement(Dash_Revenue).isDisplayed());
		assertEquals(true,driver.findElement(Dash_SalesOrders).isDisplayed());
		assertEquals(true,driver.findElement(Dash_Unit_Solds).isDisplayed());
		assertEquals(true,driver.findElement(Dash_Low_Stock).isDisplayed());
		Thread.sleep(5000);
		//assertEquals(true,driver.findElement(Dash_Sales_by_channels).isDisplayed());
		//assertEquals(true,driver.findElement(Dash_Sales_by_countries).isDisplayed());
		//assertEquals(true,driver.findElement(Dash_Order_history_chart).isDisplayed());
		assertEquals(true,driver.findElement(Dash_Recent_Orders).isDisplayed());
		assertEquals(true,driver.findElement(Dash_Low_stock_products).isDisplayed());
		
	}

	@Test (priority=12)
	public void SalesByProdcut() throws InterruptedException
	{
		navigateToUrl();
		Thread.sleep(3000);
		assertEquals("Sellers Hub",driver.getTitle());
		Thread.sleep(3000);
		//loginToTheWebsite("support@sellershub.io","demo12345");
		Thread.sleep(9000);
		clickOnReportsMenu();
		clickOnSalesByProductReport();
		assertEquals(true,driver.findElement(SBP_Sales).isDisplayed());
		assertEquals(true,driver.findElement(SBP_ProductSales).isDisplayed());
		assertEquals(true,driver.findElement(SBP_TopProductSale).isDisplayed());
		assertEquals(true,driver.findElement(SBP_Units).isDisplayed());
		Thread.sleep(3000);
		assertEquals(true,driver.findElement(SBP_SKU).isDisplayed());
		assertEquals(true,driver.findElement(SBP_PageHeader).isDisplayed());
		Thread.sleep(3000);
		driver.findElement(SBP_download).click();
	}
	@Test (priority=13)
	public void LowStockReport() throws InterruptedException
	{
		navigateToUrl();
		Thread.sleep(3000);
		assertEquals("Sellers Hub",driver.getTitle());
		Thread.sleep(3000);
		//loginToTheWebsite("support@sellershub.io","demo12345");
		Thread.sleep(9000);
		clickOnReportsMenu();
		clickOnLowStockReport();
		Thread.sleep(3000);
		assertEquals(true,driver.findElement(LSR_SKU).isDisplayed());
		assertEquals(true,driver.findElement(LSR_PageHeader).isDisplayed());
		Thread.sleep(3000);
		driver.findElement(LSR_PageHeader).click();
	}
	
	@Test (priority=14)
	public void StockValueReport() throws InterruptedException
	{
		navigateToUrl();
		Thread.sleep(3000);
		assertEquals("Sellers Hub",driver.getTitle());
		Thread.sleep(3000);
		//loginToTheWebsite("support@sellershub.io","demo12345");
		Thread.sleep(9000);
		clickOnReportsMenu();
		clickOnStockValueReport();
		Thread.sleep(3000);
		assertEquals(true,driver.findElement(SVR_SKU).isDisplayed());
		assertEquals(true,driver.findElement(SVR_Header).isDisplayed());
		Thread.sleep(6000);
		driver.findElement(SVR_Download).click();
	}
	
	@Test(priority=15)
	public void OrderHistoryReport() throws InterruptedException
	{
		navigateToUrl();
		Thread.sleep(3000);
		assertEquals("Sellers Hub",driver.getTitle());
		Thread.sleep(3000);
		//loginToTheWebsite("support@sellershub.io","demo12345");
		
			Thread.sleep(9000);
			clickOnReportsMenu();
			clickOnOrderHistoryReport();
			assertEquals(true,driver.findElement(OHR_TotalOrderValue).isDisplayed());
			assertEquals(true,driver.findElement(OHR_TotalUnits).isDisplayed());
			assertEquals(true,driver.findElement(OHR_NumberOfOrders).isDisplayed());
			assertEquals(true,driver.findElement(OHR_TotalCustomers).isDisplayed());
			Thread.sleep(3000);
			assertEquals(true,driver.findElement(OHR_Date).isDisplayed());
			assertEquals(true,driver.findElement(OHR_Header).isDisplayed());
			Thread.sleep(6000);
			driver.findElement(OHR_Download).click();
		
	}
	
//orders
	
	@Test (priority=16)
	public void OrderSummaryPage() throws InterruptedException
	{
		navigateToUrl();
		Thread.sleep(3000);
		assertEquals("Sellers Hub",driver.getTitle());
		Thread.sleep(3000);
		//loginToTheWebsite("support@sellershub.io","demo12345");
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
	
	@Test (priority=17)
	public void SalesOrderPage() throws InterruptedException
	{
		navigateToUrl();
		System.out.print("sales order page\n");
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
	
	@Test (priority=18)
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
	
	@Test (priority=19)
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
	
	@Test (priority=20)
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
	
	//Listings
	
	@Test (priority=21)
	public void WaitingToListPage() throws InterruptedException 
	{
		navigateToUrl();
		Thread.sleep(3000);
		assertEquals("Sellers Hub",driver.getTitle());
		Thread.sleep(3000);
		//loginToTheWebsite("support@sellershub.io","demo12345");
		Thread.sleep(8000);
		ClickOnListings();
		Thread.sleep(3000);
		ClickOnWaitingToList();
		Thread.sleep(3000);
		assertEquals(true,driver.findElement(By.xpath("//*[@id=\"waiting_to_list\"]/div/div/div/app-waiting-to-list/div[1]/div/div/div/div/div[2]/table/thead/th[2]")).isDisplayed());
	}
	@Test (priority=22)
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
	@Test (priority=23)
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
	@Test (priority=24)
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
	@Test (priority=25)
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
	
	//Inventory
	
	@Test (priority=26)
	public void addproduct() throws InterruptedException
	{
		navigateToUrl();
		Thread.sleep(3000);
		assertEquals("Sellers Hub",driver.getTitle());
		Thread.sleep(3000);
		//loginToTheWebsite("support@sellershub.io","demo12345");
		Thread.sleep(8000);
		
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
	
	@Test (priority=27)
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

	@Test (priority=28)
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

	@Test (priority=29)
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

	@Test (priority=30)
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

	@Test (priority=31)
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
	
	//Warehouse Management
	
	@Test (priority=32)
	public void WareHousesPage() throws InterruptedException
	{
		navigateToUrl();
		Thread.sleep(10000);
		assertEquals("Sellers Hub",driver.getTitle());
		Thread.sleep(10000);
		//loginToTheWebsite("support@sellershub.io","demo12345");
		Thread.sleep(45000);
		ClickOnWarehouseManagement();
		Thread.sleep(10000);
		ClickOnWarehouses();
		Thread.sleep(10000);
		assertEquals(true,driver.findElement(By.xpath("//*[@id=\"warehouses\"]/div/div/div/app-warehouses/div[1]/div/div/div/div/div[2]/table/thead/th[1]/text()")).isDisplayed());
		
	}
    @Test (priority=33)
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
    
    @Test (priority=34)
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
