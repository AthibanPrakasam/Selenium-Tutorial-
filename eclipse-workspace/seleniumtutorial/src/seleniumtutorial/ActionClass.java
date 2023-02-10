package seleniumtutorial;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/home/ticvictech/Downloads/eclipse-jee-2022-09-R-linux-gtk-x86_64/chromedriver");
		WebDriver driver = new ChromeDriver();
     driver.get("https://www.amazon.in/");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
     
     File f =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  // screenshot Method
     Files.copy(f,new File( "/home/ticvictech/Desktop/Screenshots/amazonhomepage.png"));
                            //home/ticvictech/Desktop/Screenshots/"+driver.getTitle +".png      
     
     
     Actions a = new Actions(driver);   ////span[@class='nav-line-1 nav-progressive-content']
     
     WebElement job = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]/span"));
     a.moveToElement(job).build().perform();           //move cursor
     
     a.sendKeys(Keys.F5);    // Keyboard buttons 
     
     Thread.sleep(2000);
     
     driver.findElement(By.xpath("//span[text()='Your Orders']")).click();   
     
        Thread.sleep(2000);   
         driver.close();

	}

}

