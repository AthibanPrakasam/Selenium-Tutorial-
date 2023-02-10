package seleniumtutorial;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObject
{
	@FindBy(id="email") WebElement uid;
	@FindBy(id="pass") WebElement password;
	

}
