package Testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;

public class Tutorialtestng  {
	
	WebDriver driver ;
	
	@BeforeSuite
	public void chrome()  {
		System.setProperty("webdriver.chrome.driver", "/home/ticvictech/Downloads/eclipse-jee-2022-09-R-linux-gtk-x86_64/chromedriver");
		driver =new ChromeDriver();
	}
	@BeforeClass
	public void openbrowser() {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	@Test(priority = 0)
	public void username() {
		WebElement w = driver.findElement(By.id("email"));
		w.isDisplayed();
		Assert.assertEquals(true,true);
	}
	
	@Test(priority = 2)
	public void password() {
		WebElement pw = driver.findElement(By.id("pass"));
		pw.isDisplayed();
		SoftAssert s = new SoftAssert();
		s.assertEquals(true, true);
	}
	@Test(priority = 1)
		
		public void uname() {
		WebElement w = driver.findElement(By.id("email"));
		w.sendKeys("athiban");
			
			
		}
	@AfterClass
	public void done() {
		driver.navigate().refresh();
		
	}
	@AfterSuite
	public void closee() {
		driver.close();
	}
		
	}
	
	
	
	
//	@Test(priority = 0)
//	
//	public void m()
//	{
//		System.out.println("firstclass");
//	}
//	
//	@Test(priority = 2)
//public void m1(){
//	System.out.println("Secound class");
//}
//	
//	@Test(enabled = false)
//public void m2(){
//	System.out.println("Third class");
//}
//	@Test(priority = 1)
//	public void m3(){
//	System.out.println("Fourth class");
//}
//}
