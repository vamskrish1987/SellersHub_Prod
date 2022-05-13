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

public class SanityFlow extends generalMethods   {
	Random randomGenerator = new Random();  
	int randomInt = randomGenerator.nextInt(1000); 
	String str1="selenium"+randomInt+"@gmail.com";
	
	public void registration() throws InterruptedException 
	{
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
		//getStarted();
		Thread.sleep(10000);
		String str=driver.findElement(RegSuccessMessage).getText();
		Reporter.log("Registartion Working fine<br>");
		Reporter.log(str);
		
		Thread.sleep(10000);
	}
	
	public void activation() throws InterruptedException 
	{
		
	}
	public void login() throws InterruptedException 
	{
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
	
	public void integration() throws InterruptedException 
	{
		
	}
	
	public void addproduct() throws InterruptedException 
	{
		
	}
	
	public void addsupplier() throws InterruptedException 
	{
		
	}
	
	public void addwarehouse() throws InterruptedException 
	{
		
	}
	
	public void createorder() throws InterruptedException 
	{
		
	}
	
	public void createPO() throws InterruptedException 
	{
		
	}
	
	public void printinvoice() throws InterruptedException 
	{
		
	}
	public void printlabel() throws InterruptedException 
	{
		
	}
	public void duplexprint() throws InterruptedException 
	{
		
	}
	public void settings() throws InterruptedException 
	{
		
	}
	public void profile() throws InterruptedException 
	{
		
	}
	public void producttracking() throws InterruptedException 
	{
		
	}
	
}
