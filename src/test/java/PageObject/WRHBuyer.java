package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WRHBuyer {

		WebDriver driver; // Local driver for this class

		public void WRH(WebDriver driver) {
			this.driver = driver; 
			PageFactory.initElements(driver, this); // Invoke the objects of this class
		}
		
		@FindBy(name = "email")
		public WebElement Email;
		@FindBy(id = "password")
		public WebElement password;
		@FindBy(css = "button[type='submit']")
		public WebElement submitbtn;
		@FindBy(id = "continue")
		public WebElement continueBtn;
		@FindBy(id = "signInSubmit")
		public WebElement submitBtn;
		@FindBy(css = "li:nth-child(1) figure:nth-child(1) div:nth-child(1)")
		public WebElement multiplehme;
		@FindBy(css = "cssSelector")
		public WebElement loggeduserName;
		@FindBy(xpath = "//span[contains(text(),'Sign Out')]")
		WebElement signOut;
		@FindBy(id = "createAccountSubmit")
		WebElement createAccountbtn;
		@FindBy(id = "ap_customer_name")
		WebElement username;
		@FindBy(id = "ap_password_check")
		WebElement confirmPasswd;
		@FindBy(id = "ap_phone_number")
		WebElement phoneNo;
		
}

