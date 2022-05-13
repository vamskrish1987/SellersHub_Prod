package sellershub.sellershub;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CancelOrders {

	public WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\sellershub\\driver\\new\\chromedriver.exe");
		driver= new ChromeDriver();	
		driver.manage().window().maximize();
}
	//@BeforeMethod
	public void navigateToUrl() {
		driver.get("https://login.sellershub.io/secure/login");
	}
	@Test
	public void testCase() throws InterruptedException {
		navigateToUrl();
		Thread.sleep(3000);
		assertEquals("Sellers Hub",driver.getTitle());
		driver.findElement(By.xpath("//*[@id='loginform']//input[contains(@placeholder,'Username')]")).click();
		driver.findElement(By.xpath("//*[@id='loginform']//input[contains(@placeholder,'Username')]")).sendKeys("support@sellershub.io");							
		driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[2]/div/input")).sendKeys("demo12345");
		driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[4]/div/button")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//span[text()='ORDERS ']")).click();
		driver.findElement(By.xpath("//a[text()='SALES ORDERS']")).click();
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//*[@id='salesTable']/tbody/tr[1]/td[2]/div/a/img")).click();
		driver.findElement(By.xpath("//*[@id=\"sales_orders\"]/div/div/div/app-sales-orders/div[1]/div/div/div/div/div[3]/div[2]/div/div/a[7]")).click();
		Thread.sleep(8000);
		
	}	
	
	@AfterTest
	public void endTest() {
		driver.quit();
	}

}

