package seleniumtutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver","/home/ticvictech/Downloads/eclipse-jee-2022-09-R-linux-gtk-x86_64/geckodriver");
		 WebDriver driver = new FirefoxDriver();
		 driver.get("https://www.w3schools.com/sql/sql_intro.asp");
		 driver.manage().window().maximize();
		
	}

}
	
	
	
