package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.Login;
import Utility.ReadConfigFile;

public class test
{
	public static WebDriver driver = new EdgeDriver();;
	static ReadConfigFile rc = new ReadConfigFile("./src\\HardcodeDependencies\\config.properties");
	static Login L = new Login(driver);

	@BeforeTest
	public static void openandlaunchBrowserURL()
	{
		driver.get(rc.getApplicationURL());
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public static void loginToSDemo() 
	{
		Login L = new Login(driver);
		L.enteruserName(rc.getUserName());
		L.enterPassword(rc.getPassword());
		L.clickLoginButton();
	}

	@Test(priority = 2)
	public static void getgreatestPrice() throws InterruptedException 
	{
		Thread.sleep(2000);
		L.clickonAddtoCart();
		
	}
	
	@Test(priority = 3)
	public static void opencartpage() throws InterruptedException 
	{
		Thread.sleep(2000);
		L.Cartbutton();
	}
	
	@Test(priority = 4)
	public static void Checkoutbutton() throws InterruptedException 
	{
		Thread.sleep(2000);
		L.clickonCheckOutButton();
	}
	
	@Test(priority = 5)
	public static void checkoutPage() 
	{
		Login L = new Login(driver);
		L.enterfirstName(rc.getfirstName());
		L.enterlastName(rc.getlastName());
		L.enterzipName(rc.getzipcode());
	}
	
	@Test(priority = 6)
	public static void continuebutton() throws InterruptedException 
	{
		Thread.sleep(2000);
		L.clickonContinueButton();
	}
	
	@Test(priority = 7)
	public static void finishbutton() throws InterruptedException 
	{
		Thread.sleep(2000);
		L.clickonFinishButton();
	}

}