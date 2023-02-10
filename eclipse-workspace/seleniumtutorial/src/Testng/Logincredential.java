package Testng;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Logincredential {
	String[][] data =null;
	
	@DataProvider (name="login")
	public Object getdatas() throws BiffException, IOException
	{
	 data=  execution();
		
		return data;
	}
			
	
	
	@Test(dataProvider = "login")
	public void login(String username, String password)   {
		System.setProperty("webdriver.chrome.driver", "/home/ticvictech/Downloads/eclipse-jee-2022-09-R-linux-gtk-x86_64/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement loginname = driver.findElement(By.id("email"));
		WebElement loginpassword = driver.findElement(By.id("pass"));
		loginname.sendKeys(username);
		loginpassword.sendKeys(password);
	}
	
	@Test
	public String[][] execution() throws BiffException, IOException {
		FileInputStream f = new FileInputStream("/home/ticvictech/Downloads/chromedriver_linux64 (3)/datadriven.xls");
		
		Workbook wb = Workbook.getWorkbook(f);
		
		Sheet s = wb.getSheet("Sheet1");
		
	 int rows=s.getRows();
	  int colum =s.getColumns();
	  String getdata[][]= new String[rows-1][colum];
	  for(int i=0;i<rows;i++) {
		  for(int j=0;j<colum;j++) {
			getdata[i-1][j] =s.getCell(j,i).getContents();
			
		  }
		  
		  }
	return getdata;
	
		  
	  }
	
	
		
		
	
	}


