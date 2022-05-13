package sellershub.sellershub;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class generalMethods {

	public WebDriver driver;

	By userName = By.xpath("//*[@id='loginform']//input[contains(@placeholder,'Username')]");
	By password = By.xpath("//*[@id='loginform']/div[2]/div/input");
	By loginButton = By.xpath("//*[@id='loginform']/div[4]/div/button");
	By signupButton = By.xpath("//*[text()='Sign Up']/..");
	By regFullName = By.xpath("//input[@id='name']");
	By regEmail = By.xpath("//input[@id='email']");
	By belowarrow = By.xpath("//*[@id=\"main-wrapper\"]/app-header/header/nav/div[2]/ul[2]/li[4]/a/span");
	By userNameDisplay = By.xpath("//*[@id=\"main-wrapper\"]/app-header/header/nav/div[2]/ul[2]/li[3]");
	By logOut = By.xpath("//a[@class='dropdown-item' and contains(text(),' Logout')]");
	By CompanyName= By.xpath("//*[@id=\"loginform\"]/div[4]/div/input");
	By VatNumber= By.xpath("//*[@id=\"loginform\"]/div[5]/div/input");
	By dropDownCountrySignup = By.xpath("//*[@id=\"loginform\"]/div[6]/select");
	//By dropDownCountrySignup=By.xpath("//*[@id=\"channel\"]/div/div[1]/span");
	By regPassword  = By.xpath("//*[@id='password']");
	By regMobile  = By.xpath("//*[@id=\"loginform\"]/div[3]/div[2]/div/input");
	By dropDownChannelSignup = By.xpath("//*[@id=\"channel\"]/div/div[1]/span"); 
	By dropDownCourierSignup = By.xpath("/html/body/app-root/app-registration/div[1]/div/div/div[1]/div[2]/form/div[8]/div/ng-multiselect-dropdown/div/div[1]/span");
	
	//By dropDownCourierSignup = By.xpath("//*[@id=\"channel\"]/div/div[1]/span/span[contains(text(), 'Select Couriers')]");
	By regOrdersPerMonth= By.xpath("//*[@id=\"loginform\"]/div[9]/div[1]/input");
	By regSKU= By.xpath("//*[@id=\"loginform\"]/div[9]/div[2]/input");
	By regPromoCode= By.xpath("//*[@id=\"loginform\"]/div[10]/input");
	
	By orderMenu = By.xpath("//span[text()='ORDERS ']");
	By salesMenu = By.xpath("//a[text()='SALES ORDERS']");
	By productImg = By.xpath("(//img[contains(@class,'img-responsive prod-img')])[1]");
	By SalesOrderProductImg = By.xpath("//*[@id=\"salesTable\"]/tbody/tr[1]/td[2]/div/a/img");
	By productDate = By.xpath("//*[@id='salesTable']/tbody/tr[1]/td[3]/text()[1]");
	By channelOrderID = By.xpath("//*[@id='salesTable']/tbody/tr[1]/td[3]/br[1]");
	By sellerHubOrderID = By.xpath("//*[@id='salesTable']/tbody/tr[1]/td[3]/span");
	By orderStatus = By.xpath("//*[@id='salesTable']/tbody/tr[1]/td[4]/span[1]");
	By orderChannel = By.xpath("//*[@id='salesTable']/tbody/tr[1]/td[5]/span");
	By orderProductInformation = By.xpath("//*[@id='salesTable']/tbody/tr[1]/td[6]/b");
	By orderQty = By.xpath("//*[@id='salesTable']/tbody/tr[1]/td[7]/span[1]");
	By orderShipCost = By.xpath("//*[@id='salesTable']/tbody/tr[1]/td[7]/span[2]");
	By orderShipAddress = By.xpath("//*[@id='salesTable']/tbody/tr[1]/td[8]/span[3]/text()");
	By orderShipMethod = By.xpath("//*[@id='salesTable']/tbody/tr[1]/td[8]/span[3]/span[3]");
	//By regOrdersPerMonth = By.xpath("//*[@id='loginform']/div[9]/div[1]/input");
	//By regSKU = By.xpath("//*[@id='loginform']/div[9]/div[2]/input");
	//By regPromoCode = By.xpath("//*[@id='loginform']/div[10]/input");
	By getstartedbutton = By.xpath("//*[@id='loginform']/div[11]/div/button");
	By RegSuccessMessage=By.xpath("//*[@id=\"search-modal\"]/div/div/div[2]/div");
	
	By actiontabbutton = By.xpath("//*[@id='sales_orders']/div/div/div/app-sales-orders/div[1]/div/div/div/div/div[3]/div[2]/div/button");
	
	
	By cancelorderbutton = By.xpath("//*[@id='sales_orders']/div/div/div/app-sales-orders/div[1]/div/div/div/div/div[3]/div[2]/div/div/a[7]");
	By orderSelect = By.xpath("//*[@id='salesTable']/tbody/tr[2]/td[2]/div/a/img");
	By cancelreasonbutton = By.xpath("//*[@id='cancelledReason']/div/div[1]/span");
	By cancelreasonselectbutton = By.xpath("//*[@id='cancelledReason']/div/div[2]/ul[2]/li[3]");
	By cancelselectordersbutton = By.xpath("//*[@id='action-modal']/div/div/div[3]/div/button[1]");
	By orderPrint = By.xpath("//*[@id='sales_orders']/div/div/div/app-sales-orders/div[1]/div/div/div/div/div[3]/div[1]/div[2]/button");
	By orderPrintLabel = By.xpath("//*[@id='sales_orders']/div/div/div/app-sales-orders/div[1]/div/div/div/div/div[3]/div[1]/div[2]/div/a[2]");
	By warehouseManagement = By.xpath("//*[@id='sidebarnav']/li[7]/a/span");
	By stockSummarybutton = By.xpath("//*[@id='sidebarnav']/li[7]/ul/li[2]/div/a");
	By exportOrdercsv = By.xpath("//*[@id='sales_orders']/div/div/div/app-sales-orders/div[1]/div/div/div/div/div[3]/div[2]/div/div/a[8]");
	By viewOrderDetails = By.xpath("//*[@id='sales_orders']/div/div/div/app-sales-orders/div[1]/div/div/div/div/div[3]/div[2]/div/div/a[4]");
	By source  = By.xpath("//*[@id='orderdetails']/div/form/div/div[2]/div[1]/div/div/input");
	By subSource   = By.xpath("//*[@id='orderdetails']/div/form/div/div[3]/div[1]/div/div/input");
	By status  = By.xpath("//*[@id='orderdetails']/div/form/div/div[4]/div[1]/div/div/input");
	By channelBuyerName  = By.xpath("//*[@id='orderdetails']/div/form/div/div[5]/div[1]/div/div/input");
	By channelReferenceID  = By.xpath("//*[@id='orderdetails']/div/form/div/div[1]/div[1]/div/div/input");
	By date  = By.xpath("//*[@id='orderdetails']/div/form/div/div[1]/div[2]/div/div/input");
	By subSubTotal  = By.xpath("//*[@id='orderdetails']/div/form/div/div[2]/div[2]/div/div/input");
	By shippingCost  = By.xpath("//*[@id='orderdetails']/div/form/div/div[3]/div[2]/div/div/input");
	By tax  = By.xpath("//*[@id='orderdetails']/div/form/div/div[4]/div[2]/div/div/input");
	By total  = By.xpath("//*[@id='orderdetails']/div/form/div/div[5]/div[2]/div/div/input");
	By shippingAddress  = By.xpath("//*[@id='orderdetails']/div/form/div/div[7]/div[2]/div/div/textarea");
	By billingAddress  = By.xpath("//*[@id='orderdetails']/div/form/div/div[7]/div[1]/div/div/textarea");
    By items = By.xpath("//*[@id='view_order']/div/div/div/app-view-order/div/div/div/ul/li[2]/a/span[2]");
    By productDetails = By.xpath("//*[@id='salesTable']");
    By notes = By.xpath("//*[@id='view_order']/div/div/div/app-view-order/div/div/div/ul/li[3]/a/span[1]");
    By messages = By.xpath("//*[@id='messages']");
    By integration = By.xpath("//*[@id='sidebarnav']/li[10]/a/span"); 
    By channelIntegration = By.xpath("//*[@id='sidebarnav']/li[10]/ul/li[1]/div/a");
    By addIntegration = By.xpath("//*[@id='channel_integration']/div/div/div/app-channel-integration/div/div[1]/div/div/div/div[1]/div[2]/div/div/button");
    By addMarketplace = By.xpath("//*[@id='channel_integration']/div/div/div/app-channel-integration/div/div[1]/div/div/div/div[1]/div[2]/div/div/div/a[1]");
    By ebayIntegration = By.xpath("//*[@id='market-places-modal']/div/div/div[2]/div[2]/div[1]/div/div/div[3]/button");
    By ebayName = By.xpath("//*[@id='channel_inte']/div/div/div/app-create-integrate/app-ebay-inte/div[1]/div[3]/div/div/div/div/div[2]/div[1]/div/input");
    By ebayMemberSince = By.xpath("//*[@id='channel_inte']/div/div/div/app-create-integrate/app-ebay-inte/div[1]/div[3]/div/div/div/div/div[2]/div[4]/div[1]/app-app-date-picker/div/div/input");
    By ebaySaveButton = By.xpath("//*[@id='channel_inte']/div/div/div/app-create-integrate/app-ebay-inte/div[1]/div[3]/div/div/div/div/div[1]/button");
    By ebayTokenGenerate = By.xpath("//*[@id='ebay-token-modal']/div/div/div[3]/button");
    By ebayUpdate = By.xpath("//*[@id='channel_inte']/div/div/div/app-create-integrate/app-ebay-inte/div[1]/div[3]/div/div/div/div/div[1]/button[2]");
    By ebayTestConnection = By.xpath("//*[@id='channel_inte']/div/div/div/app-create-integrate/app-ebay-inte/div[1]/div[3]/div/div/div/div/div[1]/button[3]");
    By ebayTestConnectionDialog = By.xpath("/html/body/div[4]/div/div[6]/button[1]");
    By ebayTestConnectionConfirmDialog = By.xpath("/html/body/div[4]/div/div[6]/button[1]");
    By allProducts = By.xpath("//*[@id='channel_inte']/div/div/div/app-create-integrate/app-ebay-inte/div[1]/div[3]/div/div/div/div/div[1]/button[5]");
    By allProductsDialog = By.xpath("/html/body/div[4]/div/div[6]/button[1]");
    By inventory = By.xpath("//*[@id='sidebarnav']/li[5]/a/span");
    By purchaseorder = By.xpath("//*[@id='sidebarnav']/li[5]/ul/li[5]/div/a");
    By editbutton = By.xpath("//*[@id='purchanse_orders']/div/div/div/app-purchase-orders/div[1]/div/div/div/div/div[2]/table/tbody/tr[1]/td[7]/button[1]/i");
    
    By supplier = By.xpath("//*[@id='supplier']/div/div[1]/span");
    By supplierchoose = By.xpath("//*[@id='supplier']/div/div[2]/ul[2]/li[1]/div");
    By warehouse = By.xpath("//*[@id='warehouse']/div/div[1]/span/span[1]");
    By ponumber = By.xpath("//*[@id='test-l-1']/form/div/div[2]/div[1]/div/input");
    By warehousechoose = By.xpath("//*[@id='warehouse']/div/div[2]/ul[2]/li[2]/div");
    By currency = By.xpath("//*[@id='curencies']/div/div[1]/span");
    By currencychoose = By.xpath("//*[@id='curencies']/div/div[2]/ul[2]/li[1]/div");
    By referencenumber = By.xpath("//*[@id='test-l-1']/form/div/div[2]/div[3]/div/input");
    By taxpercentage = By.xpath("//*[@id='test-l-1']/form/div/div[3]/div[1]/div/input");
    By stockrequireddate = By.xpath("//*[@id='test-l-1']/form/div/div[3]/div[2]/div/app-app-date-picker/div/div/input");
    By message = By.xpath("//*[@id='test-l-1']/form/div/div[4]/div/textarea");    
    By savencontinuebutton = By.xpath("//*[@id='test-l-1']/div/button");
    By addProductstoOrder = By.xpath("//*[@id='test-l-2']/div[1]/div/button");
    By productCheckbox = By.xpath("//*[@id='search-modal']/div/div/div[2]/div[1]/div/div[2]/table/tbody/tr[1]/td[1]/div/label/span");
    By productCheckboxsave = By.xpath("//*[@id='search-modal']/div/div/div[2]/div[2]/button[1]");
    By saveproducts = By.xpath("//*[@id='test-l-2']/div[3]/div[2]/div[2]/button");
    By sendemail = By.xpath("//*[@id='printableArea']/div/div[4]/div[3]/button[1]/span");    
    //By createOrder = By.xpath("//*[@id='sales_orders]/div/div/div/app-sales-orders/div[1]/div/div/div/div/div[2]/div[2]/div/button[1]");
    By createOrder= By.xpath("//*[@id=\"sales_orders\"]/div/div/div/app-sales-orders/div[1]/div/div/div/div/div[2]/div[2]/div/button[1]");
	By createOrderPage = By.xpath("//*[@id='created_order']/div/div/div/app-create-order/div[1]/div[1]/div/div/button");
	
	
	By channelMenu = By.xpath("//*[@id='channel_inte']/div/div/div/app-create-integrate/app-ebay-inte/div[1]/div[3]/div/div/div/div/div[1]/button[3]");
	By generateOrder = By.xpath("//*[@id='supplier']/div/div[1]/span");
	By generateOrder_f=By.xpath("//*[@id=\"created_order\"]/div/div/div/app-create-order/div[1]/div[2]/div/div/div[2]/div[2]/button");
	By channel = By.xpath("//*[@id='channel']/div/div[1]/span/span[1]/span/span");
	By orderNo = By.xpath("//*[@id='created_order']/div/div/div/app-create-order/div[1]/div[2]/div/div/div[3]/div[1]/div/div[2]/form/div[1]/div/div/label");
	By customerName = By.xpath("//*[@id='customerName']");
	By customerPhNo = By.xpath("//*[@id='customerPhone']");
	By customerEmail = By.xpath("//*[@id='customerEmail']");
	By addressLine1 = By.xpath("//*[@id='b_address_1']");
	By addressLine2 = By.xpath("//*[@id='b_address_2']");
	By city = By.xpath("//*[@id='b_city']");
	By county = By.xpath("//*[@id='b_state_country']");
	By postCode = By.xpath("//*[@id='b_postcode']");

	By addNewItem = By.xpath("//*[@id=created_order]/div/div/div/app-create-order/div[1]/div[2]/div/div/div[3]/div[5]/div/div[2]/div[1]/div/div/button"); 
	
	//Dashboard Page Elements
	 By dashboard=By.xpath("//*[@id=\"sidebarnav\"]/li[1]/a/span");
	 By Dash_Revenue=By.xpath("//*[@id=\"dashboard\"]/div/div/div/app-dashboard/div/div/div[1]/div/div/div/div[1]/div/div/h1");
	 By Dash_SalesOrders=By.xpath("//*[@id=\"dashboard\"]/div/div/div/app-dashboard/div/div/div[1]/div/div/div/div[2]/div/div/h1");
	 By Dash_Unit_Solds=By.xpath("//*[@id=\"dashboard\"]/div/div/div/app-dashboard/div/div/div[1]/div/div/div/div[3]/div/div/h1");
	 By Dash_Low_Stock=By.xpath("//*[@id=\"dashboard\"]/div/div/div/app-dashboard/div/div/div[1]/div/div/div/div[4]/div/div/h1");
	 By Dash_Sales_by_channels= By.xpath("//*[@id=\"morris-donut-chart\"]/svg/text[2]/tspan");
	 By Dash_Sales_by_countries= By.xpath("//*[@id=\"world-map-markers\"]/div/svg");
	 By Dash_Order_history_chart=By.xpath("//*[@id=\"morris-line-chart\"]/svg");
	 By Dash_Recent_Orders=By.xpath("//*[@id=\"dashboard\"]/div/div/div/app-dashboard/div/div/div[5]/div/div/div/table/tbody/tr[1]/td[1]");
     By Dash_Low_stock_products=By.xpath("//*[@id=\"dashboard\"]/div/div/div/app-dashboard/div/div/div[6]/div/div/div/table/tbody/tr[1]/td[1]");
     
     // Reports Section
     By ReportsMenu= By.xpath("//*[@id=\"sidebarnav\"]/li[3]/a/span");
     By Rep_Sales_By_Product=By.xpath("//*[@id=\"sidebarnav\"]/li[3]/ul/li[1]/div/a");
     By Rep_Low_Stock=By.xpath("//*[@id=\"sidebarnav\"]/li[3]/ul/li[2]/div/a");
     By Rep_Stock_Value_Report=By.xpath("//*[@id=\"sidebarnav\"]/li[3]/ul/li[3]/div/a");
     By Rep_Order_History=By.xpath("//*[@id=\"sidebarnav\"]/li[3]/ul/li[4]/div/a");
     
     // Sales By Product Page
     By SBP_Sales= By.xpath("//*[@id=\"sales_by_prod\"]/div/div/div/app-search-by-prod/div/div/div/div/div/div[3]/div[1]/div/div/h1");
     By SBP_ProductSales=By.xpath("//*[@id=\"sales_by_prod\"]/div/div/div/app-search-by-prod/div/div/div/div/div/div[3]/div[2]/div/div/h1");
     By SBP_TopProductSale=By.xpath("//*[@id=\"sales_by_prod\"]/div/div/div/app-search-by-prod/div/div/div/div/div/div[3]/div[3]/div/div/h1");
     By SBP_Units=By.xpath("//*[@id=\"sales_by_prod\"]/div/div/div/app-search-by-prod/div/div/div/div/div/div[3]/div[4]/div/div/h1");
     By SBP_SKU=By.xpath("//*[@id=\"sales_by_prod\"]/div/div/div/app-search-by-prod/div/div/div/div/div/div[5]/table/tbody/tr[1]/td[1]");
     By SBP_PageHeader=By.xpath("//*[@id=\"sales_by_prod\"]/div/div/div/app-search-by-prod/div/div/div/div/div/div[1]/div/h4");
     By SBP_download=By.xpath("//*[@id=\"sales_by_prod\"]/div/div/div/app-search-by-prod/div/div/div/div/div/div[2]/div[5]/button[3]");
     
     //Low Stock Report Page
     By LSR_SKU=By.xpath("//*[@id=\"low_stock\"]/div/div/div/app-lowstock/div/div/div/div/div[2]/table/tbody/tr[1]/td[2]");
     By LSR_PageHeader=By.xpath("//*[@id=\"low_stock\"]/div/div/div/app-lowstock/div/div/div/div/div[1]/div[1]/div/h4");
     By LSR_Download=By.xpath("//*[@id=\"low_stock\"]/div/div/div/app-lowstock/div/div/div/div/div[1]/div[2]/div/div/div[2]/button[3]");
     
     // Stock Value Report Page
     By SVR_SKU=By.xpath("//*[@id=\"stock_value_repo\"]/div/div/div/app-stock-value-repo/div/div/div/div/div/div[3]/table/tbody/tr[1]/td[1]");
     By SVR_Header=By.xpath("//*[@id=\"stock_value_repo\"]/div/div/div/app-stock-value-repo/div/div/div/div/div/div[1]/div/h4");
     By SVR_Download=By.xpath("//*[@id=\"stock_value_repo\"]/div/div/div/app-stock-value-repo/div/div/div/div/div/div[2]/div/div/div[2]/button[3]");
     
     //Order History Report Page
     By OHR_TotalOrderValue=By.xpath("//*[@id=\"order_history\"]/div/div/div/app-order-history/div/div/div/div/div/div[3]/div/div[1]/div/div/h1");
     By OHR_TotalUnits=By.xpath("//*[@id=\"order_history\"]/div/div/div/app-order-history/div/div/div/div/div/div[3]/div/div[2]/div/div/h1");
     By OHR_NumberOfOrders=By.xpath("//*[@id=\"order_history\"]/div/div/div/app-order-history/div/div/div/div/div/div[3]/div/div[3]/div/div/h1");
     By OHR_TotalCustomers=By.xpath("//*[@id=\"order_history\"]/div/div/div/app-order-history/div/div/div/div/div/div[3]/div/div[4]/div/div/h1");
     By OHR_Date=By.xpath("//*[@id=\"printabletable\"]/tbody/tr[1]/td[1]"); 
     By OHR_Header=By.xpath("//*[@id=\"order_history\"]/div/div/div/app-order-history/div/div/div/div/div/div[1]/div/h4");
     By OHR_Download=By.xpath("//*[@id=\"order_history\"]/div/div/div/app-order-history/div/div/div/div/div/div[2]/div[2]/div/button[3]");
     
     //Add Product Elements
     By ClickOnInventory=By.linkText("INVENTORY");
     By ClickOnProducts=By.linkText("PRODUCTS");
     By ClickOnAddProductButton=By.xpath("//*[@id=\"products\"]/div/div/div/app-products/div[1]/div/div/div/div/div[2]/div/div[7]/button");
     By SaveButtonInProductDetails=By.xpath("//*[@id=\"test-l-1\"]/div/button");
     
     
     //Categories
     By ClickOnCategories=By.linkText("CATEGORIES");
     
     //Channel Products Page
     By ClickOnChannelProducts=By.linkText("CHANNEL PRODUCTS");
     
     //Stock View Page
     By ClickOnStockViewPage=By.linkText("STOCK VIEW");
     
     //Purchase Orders Page
     By ClickOnPurchaseOrdersPage=By.linkText("PURCHASE ORDERS");
     By CreatePurchaseOrderButton=By.xpath("//*[@id=\"purchanse_orders\"]/div/div/div/app-purchase-orders/div[1]/div/div/div/div/div[1]/div/div/div[1]/button");
     
     //Orders
     //Order Summary
       By ClickOnOrders=By.linkText("ORDERS");
       By ClickOnOrderSummaryPage=By.linkText("ORDERS SUMMARY");
     
     //Sales Order Page
       By ClickOnSalesOrderPage=By.linkText("SALES ORDERS");
     
     //MCF Orders Page
       By ClickOnMCFOrdersPage=By.linkText("MCF ORDERS");
     
     //Shipped Orders Page
       By ClickOnShippedOrdersPage=By.linkText("SHIPPED ORDERS");
     
     
     //Cancelled Orders Page
       By ClickOnCancelledOrdersPage=By.linkText("CANCELLED ORDERS");
     
     
     //Listings
       
       By ClickOnListings=By.linkText("LISTINGS");
       By ClickOnWaitingToList=By.linkText("WAITING TO LIST");
       By ClickOnListingErrors=By.linkText("LISTING ERRORS");
       By ClickOnListedProducts=By.linkText("LISTED PRODUCTS");
       By ClickOnClosedProducts=By.linkText("CLOSED PRODUCTS ");
       By ClickOnProductsInFBAPage=By.linkText("PRODUCTS IN FBA");
       
       
       //Warehouse Management
      By ClickOnWarehouseManagement=By.linkText("WAREHOUSE MANAGEMENT");
      By ClickOnWarehouses=By.linkText("WAREHOUSES");
      By ClickOnNewButton=By.xpath("//*[@id=\"warehouses\"]/div/div/div/app-warehouses/div[1]/div/div/div/div/div[1]/div/div/div[1]/button");
      By WarehouseName=By.xpath("/html/body/app-root/app-admin/div/div/div/app-app-tabs/div/div/div/div/div/div/div[1]/div/div/div/app-warehouses/div[4]/div/div/div[2]/div/div/div/div/div/div[1]/div[1]/div[1]/div/input");
      By WarehouseCode=By.xpath("/html/body/app-root/app-admin/div/div/div/app-app-tabs/div/div/div/div/div/div/div[1]/div/div/div/app-warehouses/div[4]/div/div/div[2]/div/div/div/div/div/div[1]/div[1]/div[2]/div/input");
      By EmailAddress=By.xpath("/html/body/app-root/app-admin/div/div/div/app-app-tabs/div/div/div/div/div/div/div[1]/div/div/div/app-warehouses/div[4]/div/div/div[2]/div/div/div/div/div/div[1]/div[2]/div[1]/div/input");
      By ContactName=By.xpath("/html/body/app-root/app-admin/div/div/div/app-app-tabs/div/div/div/div/div/div/div[1]/div/div/div/app-warehouses/div[4]/div/div/div[2]/div/div/div/div/div/div[1]/div[2]/div[2]/div/input");
      By AddressLine1=By.xpath("/html/body/app-root/app-admin/div/div/div/app-app-tabs/div/div/div/div/div/div/div[1]/div/div/div/app-warehouses/div[4]/div/div/div[2]/div/div/div/div/div/div[1]/div[3]/div[1]/div/input");
      By AddressLine2=By.xpath("/html/body/app-root/app-admin/div/div/div/app-app-tabs/div/div/div/div/div/div/div[1]/div/div/div/app-warehouses/div[4]/div/div/div[2]/div/div/div/div/div/div[1]/div[3]/div[2]/div/input");
      By AddressLine3=By.xpath("/html/body/app-root/app-admin/div/div/div/app-app-tabs/div/div/div/div/div/div/div[1]/div/div/div/app-warehouses/div[4]/div/div/div[2]/div/div/div/div/div/div[1]/div[4]/div[1]/div/input");
      By WCity=By.xpath("/html/body/app-root/app-admin/div/div/div/app-app-tabs/div/div/div/div/div/div/div[1]/div/div/div/app-warehouses/div[4]/div/div/div[2]/div/div/div/div/div/div[1]/div[4]/div[2]/div/input");
      By WState=By.xpath("/html/body/app-root/app-admin/div/div/div/app-app-tabs/div/div/div/div/div/div/div[1]/div/div/div/app-warehouses/div[4]/div/div/div[2]/div/div/div/div/div/div[1]/div[5]/div[1]/div/input");
      By WCountry=By.xpath("//*[@id=\"select-type-basic\"]");
      By WCountrySelect=By.xpath("//*[@id=\"select-type-basic\"]/option[103]");
      By WPostCode=By.xpath("/html/body/app-root/app-admin/div/div/div/app-app-tabs/div/div/div/div/div/div/div[1]/div/div/div/app-warehouses/div[4]/div/div/div[2]/div/div/div/div/div/div[1]/div[6]/div[1]/div/input");
     
      By DefaultWarehouse=By.xpath("/html/body/app-root/app-admin/div/div/div/app-app-tabs/div/div/div/div/div/div/div[1]/div/div/div/app-warehouses/div[4]/div/div/div[2]/div/div/div/div/div/div[1]/div[6]/div[2]/div/input");
      By WSaveButton=By.xpath("/html/body/app-root/app-admin/div/div/div/app-app-tabs/div/div/div/div/div/div/div[1]/div/div/div/app-warehouses/div[4]/div/div/div[2]/div/div/div/div/div/div[1]/div[7]/button[1]");
      By WCloseButton=By.xpath("/html/body/app-root/app-admin/div/div/div/app-app-tabs/div/div/div/div/div/div/div[1]/div/div/div/app-warehouses/div[4]/div/div/div[2]/div/div/div/div/div/div[1]/div[7]/button[2]");
      
      By CreateNewLocationE=By.xpath("//*[@id=\"create-newwarehouse-modal\"]/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/button[1]");
      By WClickOnActions=By.xpath("//*[@id=\"warehouses\"]/div/div/div/app-warehouses/div[1]/div/div/div/div/div[2]/table/tbody/tr[1]/td[4]/div/button");
      By WClickOnEdit=By.xpath("//*[@id=\"warehouses\"]/div/div/div/app-warehouses/div[1]/div/div/div/div/div[2]/table/tbody/tr[1]/td[4]/div/div/a[1]");
      By WAisla=By.xpath("/html/body/app-root/app-admin/div/div/div/app-app-tabs/div/div/div/div/div/div/div[1]/div/div/div/app-warehouses/div[5]/div/div/div[2]/div[1]/div/div/div/div[1]/div[2]/div/input");
      By WBay=By.xpath("/html/body/app-root/app-admin/div/div/div/app-app-tabs/div/div/div/div/div/div/div[1]/div/div/div/app-warehouses/div[5]/div/div/div[2]/div[1]/div/div/div/div[2]/div[2]/div/input");
      By WShelf=By.xpath("/html/body/app-root/app-admin/div/div/div/app-app-tabs/div/div/div/div/div/div/div[1]/div/div/div/app-warehouses/div[5]/div/div/div[2]/div[1]/div/div/div/div[3]/div[2]/div/input");
      By WBin=By.xpath("/html/body/app-root/app-admin/div/div/div/app-app-tabs/div/div/div/div/div/div/div[1]/div/div/div/app-warehouses/div[5]/div/div/div[2]/div[1]/div/div/div/div[4]/div[2]/div/input");
      By WLocationDefault=By.xpath("/html/body/app-root/app-admin/div/div/div/app-app-tabs/div/div/div/div/div/div/div[1]/div/div/div/app-warehouses/div[5]/div/div/div[2]/div[1]/div/div/div/div[5]/div[2]/div/input");
      By WLocationSaveButton=By.xpath("//*[@id=\"create-newlocation-modal\"]/div/div/div[2]/div[2]/button[1]");
      By WLocationCloseButton=By.xpath("//*[@id=\"create-newlocation-modal\"]/div/div/div[2]/div[2]/button[2]");
      
      
      
      
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\sellershub\\driver\\new\\chromedriver.exe");
		driver= new ChromeDriver();	
		driver.manage().window().maximize();
	}
	public void navigateToUrl() {
		driver.get("https://login.sellershub.io/secure/login");
	}
	public void loginToTheWebsite(String username,String passWord) throws InterruptedException {
		driver.findElement(userName).click();
		driver.findElement(userName).sendKeys(username);							
		driver.findElement(password).sendKeys(passWord);
		driver.findElement(loginButton).click();
		Thread.sleep(8000);
	}



	public void signUp() {
		driver.findElement(signupButton).click();
	}

	public void regFullName(String fullName) {

		driver.findElement(regFullName).click();
		driver.findElement(regFullName).sendKeys(fullName);	
	}

	public void regEmail(String email) {

		driver.findElement(regEmail).click();
		driver.findElement(regEmail).sendKeys(email);	
	}

	public void dropDownCountry(String country) {

		Select dropDown = new Select(driver.findElement(dropDownCountrySignup));
		dropDown.selectByVisibleText(country);
	}

	public void VatNumber(String Vat)
	{
		driver.findElement(VatNumber).click();
		driver.findElement(VatNumber).sendKeys(Vat);	
	}
	
	public void CompanyName(String Cname)
	{
		driver.findElement(CompanyName).click();
		driver.findElement(CompanyName).sendKeys(Cname);	
	}
	
	public void regPassword(String password) {

		driver.findElement(regPassword).click();
		driver.findElement(regPassword).sendKeys(password);	
	}

	public void regMobile(String mobile) {

		driver.findElement(regMobile).click();
		driver.findElement(regMobile).sendKeys(mobile);	
	}

	public void dropDownChannelCreateOrder() {

		driver.findElement(dropDownChannelSignup).click();
		driver.findElement(By.xpath("(//input[@type='checkbox']/..)[2]")).click();//selecting 2nd element from the dropdownchannel
	}

	public void dropDownCourier() {

		driver.findElement(dropDownCourierSignup).click();
		driver.findElement(By.xpath("/html/body/app-root/app-registration/div[1]/div/div/div[1]/div[2]/form/div[8]/div/ng-multiselect-dropdown/div/div[2]/ul[1]/li[1]")).click();//selecting 2nd element from the dropdowncourier
		//*[@id="channel"]/div/div[2]/ul[1]/li[1]
		//*[@id="channel"]/div/div[2]/ul[1]/li[1]/div
		driver.findElement(dropDownCourierSignup).click();
	}

	public void regOrdersPerMonth(String orderspermonth) {

		driver.findElement(regOrdersPerMonth).click();
		driver.findElement(regOrdersPerMonth).sendKeys(orderspermonth);	
	}

	public void regSKU(String sku) {

		driver.findElement(regSKU).click();
		driver.findElement(regSKU).sendKeys(sku);	
	}

	public void regPromoCode(String promocode) {

		driver.findElement(regPromoCode).click();
		driver.findElement(regPromoCode).sendKeys(promocode);	
	}

	public void getStarted() {
		driver.findElement(getstartedbutton).click();
	}

	public void actiontabbutton() {
		driver.findElement(actiontabbutton).click();
	}

	public void cancelorderbutton() {
		driver.findElement(cancelorderbutton).click();
	}
	
	public void cancelreasonbutton() {
		driver.findElement(cancelreasonbutton).click();
	}
	
	public void cancelreasonselectbutton() {
		//driver.findElement(cancelreasonselectbutton).click();
		//driver.findElement(By.xpath("(//div[@class='modal-content']//h2[text()='Cancel orders']/following::input[@type='checkbox'])[1]")).click();//selecting 2nd element from the dropdownchannel
		//*[@id="cancelledReason"]/div/div[2]/ul[2]/li[1]/div
		driver.findElement(By.xpath("//*[@id=\"cancelledReason\"]/div/div[2]/ul[2]/li[1]/div")).click();
	}
	
	public void cancelselectordersbutton() {
		driver.findElement(cancelselectordersbutton).click();
	}
	

	public void logOut() {
		driver.findElement(belowarrow).click();
		driver.findElement(logOut).click();
	}
	public void salesOrderClick() {
		driver.findElement(orderMenu).click();
		driver.findElement(salesMenu).click();
	}
	
	
	public void orderSelectClick() {
		driver.findElement(orderSelect).click();
		/*WebElement orderSelect = driver.findElement((By.xpath("//*[@id='salesTable']/tbody/tr[1]/td[2]/div"))); 
		Actions act = new Actions(driver);
		act.moveToElement(orderSelect).click().build().perform();*/
	}
	public void orderPrintLabelClick() {
		driver.findElement(orderPrint).click();
		driver.findElement(orderPrintLabel).click();
	}
	
	public void warehouseManagementbutton() {
		driver.findElement(warehouseManagement).click();
		driver.findElement(stockSummarybutton).click();
	}
	
	public void exportOrdercsvbutton() {
		driver.findElement(exportOrdercsv).click();
		
	}
	public void viewOrderDetailsbutton() {
		driver.findElement(viewOrderDetails).click();
		
	}
	public void itemTabClick() {
		driver.findElement(items).click();
		
	}
	public void notesTabClick() {
		driver.findElement(notes).click();
		
	}
	public void integrationClick() {
		driver.findElement(integration).click();
		
	}
	public void channelIntegrationClick() {
		driver.findElement(channelIntegration).click();
		
	}
	public void addIntegrationClick() {
		driver.findElement(addIntegration).click();
		
	}
	public void addMarketplaceClick() {
		driver.findElement(addMarketplace).click();
		
	}
	public void ebayIntegrationClick() {
		driver.findElement(ebayIntegration).click();
		
	}
	public void ebayDetailsClick() throws InterruptedException {
		driver.findElement(ebayName).click();
		driver.findElement(ebayName).sendKeys("abcd");
		driver.findElement(ebayMemberSince).click();
		driver.findElement(ebayMemberSince).sendKeys("2022-04-06");
		driver.findElement(ebaySaveButton).click();
		Thread.sleep(3000);
		driver.findElement(ebayTokenGenerate).click();
		
	}
	public void ebayDialogClick() throws InterruptedException {
		driver.findElement(ebayUpdate).click();
		driver.findElement(ebayTestConnection).click();
		driver.findElement(ebayTestConnectionDialog).click();
		Thread.sleep(2000);
		driver.findElement(ebayTestConnectionConfirmDialog).click();
		Thread.sleep(2000);
		driver.findElement(allProducts).click();
		Thread.sleep(2000);
		driver.findElement(allProductsDialog).click();
		Thread.sleep(2000);
		
	}
	public void inventoryClick() {
		driver.findElement(inventory).click();
			
	}
	public void purchaseorderClick() throws InterruptedException {
		driver.findElement(purchaseorder).click();
		Thread.sleep(3000);
		driver.findElement(editbutton).click();	
		
	}
	public void purchaseorderFillClick() throws InterruptedException {
		driver.findElement(supplier).click();
		driver.findElement(supplierchoose).click();
		driver.findElement(warehouse).click();
		driver.findElement(warehousechoose).click();
		driver.findElement(ponumber).click();
		driver.findElement(ponumber).clear();
		driver.findElement(ponumber).sendKeys("12345");
		driver.findElement(currency).click();
		driver.findElement(currencychoose).click();
		driver.findElement(referencenumber).click();
		driver.findElement(referencenumber).sendKeys("12345");
		driver.findElement(taxpercentage).click();
		driver.findElement(taxpercentage).clear();
		driver.findElement(taxpercentage).sendKeys("18");
		driver.findElement(stockrequireddate).click();
		driver.findElement(stockrequireddate).sendKeys("6-4-2022");
		driver.findElement(message).click();
		driver.findElement(message).clear();
		driver.findElement(message).sendKeys("test purpose");
		driver.findElement(savencontinuebutton).click();
		driver.findElement(addProductstoOrder).click();
		Thread.sleep(100000);
		driver.findElement(productCheckbox).click();
		driver.findElement(productCheckboxsave).click();
		driver.findElement(saveproducts).click();
		driver.findElement(sendemail).click();
		
	}
	public void createOrderClick() {
		driver.findElement(createOrder).click();
		driver.findElement(createOrderPage).click();
	}
	public void dropDownChannel() {

		driver.findElement(dropDownChannelSignup).click();
		driver.findElement(By.xpath("//*[@id=\"channel\"]/div/div[2]/ul[1]/li[1]/div")).click();//selecting 2nd element from the dropdownchannel
		driver.findElement(dropDownChannelSignup).click();
		//*[@id="channel"]/div/div[2]/ul[2]/li[1]/div
		//*[@id="channel"]/div/div[2]/ul[1]/li[1]/div
	}
	
	public void generateOrderButtonclick() {

		driver.findElement(generateOrder_f).click();
	}
	public void customerDetails(String name, String email, String phno) {

		driver.findElement(customerName).click();
		driver.findElement(customerName).sendKeys(name);
		driver.findElement(customerEmail).click();
		driver.findElement(customerEmail).sendKeys(email);
		driver.findElement(customerPhNo).click();
		driver.findElement(customerPhNo).sendKeys(phno);
	

	}
	public void billingShippingDetails(String lineone, String linetwo, String city1, String county1 , String postalcode) {

		driver.findElement(addressLine1).sendKeys(lineone);
		driver.findElement(addressLine2).sendKeys(linetwo);
		driver.findElement(city).sendKeys(city1);
		driver.findElement(county).sendKeys(county1);
		driver.findElement(postCode).sendKeys(postalcode);

	}
	public void addNewItemButtonclick() {

		driver.findElement(addNewItem).click();
	}
	
	public void clickondashboard()
	{
		driver.findElement(dashboard).click();
	}
	
	public void clickOnReportsMenu()
	{
		driver.findElement(ReportsMenu).click();
	}
	

	public void clickOnSalesByProductReport()
	{
		driver.findElement(Rep_Sales_By_Product).click();
	}
	
	public void clickOnLowStockReport()
	{
		driver.findElement(Rep_Low_Stock).click();
	}
	public void clickOnStockValueReport()
	{
		driver.findElement(Rep_Stock_Value_Report).click();
	}
	
	public void clickOnOrderHistoryReport()
	{
		driver.findElement(Rep_Order_History).click();
	}
	
	
	//Add product 
	
	public void ClickOnInventory()
	{
		driver.findElement(ClickOnInventory).click();
	}
	
	public void ClickOnProducts()
	{
		driver.findElement(ClickOnProducts).click();
		
		
	}
	
	public void ClickOnAddProductButton()
	{
		driver.findElement(ClickOnAddProductButton).click();
	}
	
	public void FilltheProductDetails() throws InterruptedException
	{
		driver.findElement(By.name("title")).sendKeys("test");
		driver.findElement(By.name("productsummary")).sendKeys("test");
		driver.findElement(By.xpath("//*[@id=\"editor\"]/div/div/div")).sendKeys("test");
		driver.findElement(By.xpath("//*[@id=\"test-l-1\"]/form/div/div[3]/div[1]/label")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"test-l-1\"]/form/div/div[4]/div/div/input")).sendKeys("1234567890");
	    driver.findElement(By.cssSelector("#catgory .dropdown-btn > .ng-star-inserted")).click();
	    driver.findElement(By.cssSelector("#catgory .multiselect-item-checkbox:nth-child(1) > div")).click();
	    driver.findElement(By.cssSelector("#country .dropdown-btn")).click();
	    driver.findElement(By.cssSelector("#country .multiselect-item-checkbox:nth-child(2)")).click();
	    driver.findElement(By.cssSelector(".fa-calendar")).click();
	    driver.findElement(By.cssSelector(".ngb-dp-week:nth-child(6) > .ngb-dp-day:nth-child(2) > .btn-light")).click();
	    driver.findElement(By.cssSelector(".form-body > .row:nth-child(4)")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".form-body > .row:nth-child(4)"));
	      Actions builder = new Actions(driver);
	      builder.doubleClick(element).perform();
	    }
	    driver.findElement(SaveButtonInProductDetails).click();
	    
	}
	
	public void FilltheSKUPriceQuantity()
	{
		driver.findElement(By.name("sellingprice")).sendKeys("10");
	    driver.findElement(By.name("costprice")).sendKeys("10");
	    driver.findElement(By.name("taxrate")).click();
	    {
	      WebElement dropdown = driver.findElement(By.name("taxrate"));
	      dropdown.findElement(By.xpath("//option[. = 'test ( 25 )']")).click();
	    }
	    driver.findElement(By.name("recomRetailsPrice")).sendKeys("10");
	    driver.findElement(By.name("totlQty")).sendKeys("1");
	    driver.findElement(By.name("itemCond")).click();
	    {
	      WebElement dropdown = driver.findElement(By.name("itemCond"));
	      dropdown.findElement(By.xpath("//option[. = 'New/Brand New/New with box/New with tags']")).click();
	    }
	    driver.findElement(By.name("condNotes")).sendKeys("new");
	    driver.findElement(By.name("weightkg")).sendKeys("10");
	    driver.findElement(By.name("heightkg")).sendKeys("10");
	    driver.findElement(By.name("depth")).sendKeys("10");
	    driver.findElement(By.name("width")).sendKeys("10");
	    driver.findElement(By.cssSelector(".col-md-12:nth-child(8) > .text-right > .btn")).click();
	}
	
	public void SelectVariation()
	{
		driver.findElement(By.cssSelector(".form-group:nth-child(1) > .col-sm-9:nth-child(1) .custom-control-label")).click();
		driver.findElement(By.cssSelector(".ng-star-inserted:nth-child(2) > .text-right > .btn")).click();
	}
	
	public void UploadProductImage() throws InterruptedException
	{
		driver.findElement(By.cssSelector(".d-lg-block:nth-child(2)")).click();
	    driver.findElement(By.id("my-file")).sendKeys("C:\\Users\\Vamshi\\Desktop\\label.png");
	   // driver.findElement(By.cssSelector("td > .col-md-12 > .custom-control")).click();
	   // driver.findElement(By.cssSelector(".ng-star-inserted:nth-child(3) > .text-right > .btn")).click();
	   // driver.findElement(By.cssSelector(".ng-star-inserted:nth-child(1) > td:nth-child(2) > .form-control")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"test-l-4\"]/div[3]/div[2]/button")).click();
	}
	
	public void FillTheAttributes() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"test-l-5\"]/div[1]/table/tbody/tr[1]/td[2]/input")).sendKeys("test");
	    //driver.findElement(By.cssSelector("#test-l-5 .text-right > .btn")).click();
		  Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"test-l-5\"]/div[2]/div[2]/button")).click();
	}
	
	public void FillTheSupplier() throws InterruptedException
	{
		
	    driver.findElement(By.cssSelector("#Suppliers .dropdown-btn")).click();
	    driver.findElement(By.cssSelector("#Suppliers .item2 > .multiselect-item-checkbox:nth-child(1) > div")).click();
	    driver.findElement(By.cssSelector(".col-md-3 > .btn")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".col-md-3 > .btn"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.id("s-supplierSku0")).click();
	    driver.findElement(By.id("s-supplierSku0")).sendKeys("123");
	    driver.findElement(By.id("s-barcode0")).click();
	    driver.findElement(By.id("s-barcode0")).sendKeys("123456");
	    driver.findElement(By.id("s-cortonSize0")).click();
	    driver.findElement(By.id("s-cortonSize0")).sendKeys("1");
	    driver.findElement(By.id("s-palletQty0")).click();
	    driver.findElement(By.id("s-palletQty0")).sendKeys("1");
	    driver.findElement(By.id("s-leadTime0")).click();
	    driver.findElement(By.id("s-leadTime0")).sendKeys("1");
	    driver.findElement(By.id("s-purchasePrice0")).click();
	    driver.findElement(By.id("s-purchasePrice0")).sendKeys("10");
	    driver.findElement(By.id("s-vat0")).click();
	    {
	      WebElement element = driver.findElement(By.id("test-l-6-table"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).clickAndHold().perform();
	    }
	    {
	      WebElement element = driver.findElement(By.id("test-l-6-table"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.id("test-l-6-table"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).release().perform();
	    }
	    driver.findElement(By.id("s-vat0")).sendKeys("20");
	    driver.findElement(By.cssSelector("#s-currency0 .dropdown-multiselect__caret")).click();
	    driver.findElement(By.cssSelector("#s-currency0 .multiselect-item-checkbox:nth-child(3) > div")).click();
	    driver.findElement(By.id("s-minOrder0")).click();
	    driver.findElement(By.id("s-minOrder0")).sendKeys("1");
	    driver.findElement(By.id("s-packsize0")).click();
	    {
	      WebElement element = driver.findElement(By.id("test-l-6-table"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).clickAndHold().perform();
	    }
	    {
	      WebElement element = driver.findElement(By.id("test-l-6-table"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.id("test-l-6-table"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).release().perform();
	    }
	    driver.findElement(By.id("s-packsize0")).sendKeys("1");
	    driver.findElement(By.id("s-miscNotes0")).click();
	    driver.findElement(By.id("s-miscNotes0")).sendKeys("test");
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("#test-l-6 .text-right > .btn")).click();
	}
	
	public void ClickOnCategories()
	{
		driver.findElement(ClickOnCategories).click();
	}
	public void ClickOnChannelProducts()
	{
		driver.findElement(ClickOnChannelProducts).click();
	}
	
	
	public void ClickOnStockViewPage()
	{
		driver.findElement(ClickOnStockViewPage).click();
	}
	
	public void ClickOnPurchaseOrdersPage()
	{
		driver.findElement(ClickOnPurchaseOrdersPage).click();
	}
	
	public void ClickOnOrders()
	{
		driver.findElement(ClickOnOrders).click();
	}
	public void ClickOnOrderSummaryPage()
	{
		driver.findElement(ClickOnOrderSummaryPage).click();
	}
	public void ClickOnSalesOrderPage()
	{
		driver.findElement(ClickOnSalesOrderPage).click();
	}
	public void ClickOnMCFOrdersPage()
	{
		driver.findElement(ClickOnMCFOrdersPage).click();
	}
	public void ClickOnShippedOrdersPage()
	{
		driver.findElement(ClickOnShippedOrdersPage).click();
	}
	public void ClickOnCancelledOrdersPage()
	{
		driver.findElement(ClickOnCancelledOrdersPage).click();
	}
	
	public void ClickOnListings()
	{
		driver.findElement(ClickOnListings).click();
	}
	
	public void ClickOnWaitingToList()
	{
		driver.findElement(ClickOnWaitingToList).click();
	}
	
	public void ClickOnListingErrors()
	{
		driver.findElement(ClickOnListingErrors).click();
	}
	
	public void ClickOnListedProducts()
	{
		driver.findElement(ClickOnListedProducts).click();
	}
	
	public void ClickOnClosedProducts()
	{
		driver.findElement(ClickOnProductsInFBAPage).click();
	}
	
	public void ClickOnProductsInFBAPage()
	{
		driver.findElement(ClickOnProductsInFBAPage).click();
	}
	
	public void ClickOnWarehouseManagement()
	{
		driver.findElement(ClickOnWarehouseManagement).click();
	}
	
	public void ClickOnWarehouses()
	{
		driver.findElement(ClickOnWarehouses).click();
	}
	
	public void CreateNewWarehouse() throws InterruptedException
	{
		driver.findElement(ClickOnNewButton).click();
		driver.findElement(WarehouseName).sendKeys("Selenium Test WareHouse Name1");
		driver.findElement(WarehouseCode).sendKeys("WarehouseCode1");
		driver.findElement(EmailAddress).sendKeys("EmailAddress1@gmail.com");
		driver.findElement(ContactName).sendKeys("ContactName1");
		driver.findElement(AddressLine1).sendKeys("AddressLine1");
		driver.findElement(AddressLine2).sendKeys("AddressLine2");
		driver.findElement(AddressLine3).sendKeys("AddressLine3");
		driver.findElement(WCity).sendKeys("WCity");
		driver.findElement(WState).sendKeys("WState");
		driver.findElement(WCountry).click();
		driver.findElement(WCountrySelect).click();
		driver.findElement(WPostCode).sendKeys("WPostCode");
		Thread.sleep(3000);
		driver.findElement(DefaultWarehouse).click();
		Thread.sleep(5000);
		driver.findElement(WSaveButton).click();
		
	}
	
	public void CreateNewLocation() throws InterruptedException
	{
	driver.findElement(WClickOnActions).click();
	driver.findElement(WClickOnEdit).click();
	 driver.findElement(CreateNewLocationE).click();
	 Thread.sleep(5000);
	 driver.findElement(WAisla).sendKeys("Aisla");
	 driver.findElement(WBay).sendKeys("Bay");
	 driver.findElement(WShelf).sendKeys("Shelf");
	 driver.findElement(WBin).sendKeys("Bin");
	 driver.findElement(WLocationDefault).click();
	 Thread.sleep(5000);
	 driver.findElement(WLocationSaveButton).click();
	 
		
	}
	
	
	
	
	
	public void close()
	{
		driver.close();
	}
	
	
	
	@AfterTest
	public void endTest() {
		//driver.quit();
	}


}
