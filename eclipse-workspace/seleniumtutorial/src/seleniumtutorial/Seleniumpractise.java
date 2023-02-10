package seleniumtutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Seleniumpractise {

	@FindBy(id="email") WebElement uid;           //pageobjectmodel By using Webelement //findby method 
	@FindBy(id="pass") WebElement password;
	
	
	public static void main(String[] args) throws InterruptedException {
   
		
		
		
		System.setProperty("webdriver.chrome.driver","/home/ticvictech/Downloads/eclipse-jee-2022-09-R-linux-gtk-x86_64/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		
     driver.get("https://www.facebook.com/");
     
     
     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);   //Implicit Synchornization point
     
     
    // WebDriverWait ww = new WebDriverWait(driver, 10);
     //ww.until(ExpectedConditions.titleContains("facebook"));             //webdriver wait synchronization point 
     
     
     Seleniumpractise var =PageFactory.initElements(driver, Seleniumpractise.class); // PageObjectModel
     
    System.out.println(var.password.isEnabled());
    System.out.println(var.password.isDisplayed());
    System.out.println(var.password.isSelected());
    System.out.println(var.password.getAttribute("name"));
    System.out.println(var.password.getText());
    System.out.println(var.password.getSize());
    
     
     java.util.List<WebElement> button = driver.findElements(By.tagName("button"));   //lists of webElement
     
//     for(int i=0;i<button.size();i++) {
//    	 String name  = button.get(i).getText();                
//    	 if(name.startsWith("m")==true) {
//    		 System.out.println(name);
//    	 }
//     }
     
     for(int i =0 ; i< button.size();i++) {                                   //get lists of webelemet 
    	 System.out.println(button.get(i).getText());
     }
     
         System.out.println(button.size());    // elements size 
     System.out.println(driver.getTitle());   //page title
     System.out.println(driver.getCurrentUrl());  //page url
     
     //Thread.sleep(1000);  // EXplicit synchronization point 
     driver.manage().window().maximize();
  //driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[1]/div/img")).getSize();
  //river.findElement(By.xpath("//button[@name='login']")).click();  //relative Xpath 
    System.out.println(driver.findElement(By.name("login")).isDisplayed()); //element displayed 
    System.out.println(driver.findElement(By.name("login")).getTagName());    //element TagName (img,button,a,input)
    System.out.println(driver.findElement(By.name("login")).getAttribute("id"));    //element locators
    System.out.println(driver.findElement(By.name("login")).getSize());  //element size
    System.out.println(driver.findElement(By.name("login")).getText());  //element text
    System.out.println(driver.findElement(By.name("login")).isEnabled()); //element enabled 
    
    WebElement mail = driver.findElement(By.id("email"));  //webelement 
    mail.sendKeys("athibanprakash1997@gmail.com");
    System.out.println(mail.getSize());
     System.out.println(mail.getAttribute("class"));
     mail.isEnabled();
     driver.findElement(By.id("pass")).sendKeys("253126jdb"); //sendkeys
     //Thread.sleep(1000);
     driver.findElement(By.name("login")).click(); //click the button
    // driver.findElement(By.id("pass")).clear();
     //Thread.sleep(3000);
     driver.close();
	}
}

 
