package WilliamRayanHomeBuyer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WilliamRayanHomeBuyerAuto extends WRHDATAURL {
		public  WilliamRayanHomeBuyerAuto(WebDriver driver) {
			WRHDATAURL.driver = driver; 
			PageFactory.initElements(driver, this); 
		}
		
		
		@FindBy(xpath = "//a[normalize-space()='View All']")
		public WebElement Messageviewall;
		@FindBy(name = "email")
		public WebElement Email;
		@FindBy(id = "password")
		public WebElement password;
		@FindBy(css = "button[type='submit']")
		public WebElement submitbtn;
	    @FindBy(id = "signInSubmit")
		public WebElement submitBtn;
	    @FindBy(xpath = "//a[normalize-space()='View Timeline']")
		public WebElement viewtimeline;
	    @FindBy(xpath = "//a[normalize-space()='Dashboard']")
	    public WebElement Dashboard;
		@FindBy(xpath = "//h3[normalize-space()='Plan 2, French Eclectic, 12.20, N2700D']")
		public WebElement multiplehome;
		@FindBy(linkText = "//h2[normalize-space()='Home Progress']")
		public WebElement Hmpress;
		@FindBy(xpath = "//h2[normalize-space()='My Appointments']")
		public WebElement  Appointments;
		@FindBy(xpath = "//h2[normalize-space()='HLX Mortgage']")
		public WebElement Mortgage;
		@FindBy(xpath = "//button[normalize-space()='Go to Lender']")
		public WebElement Lender;
		@FindBy(xpath = "//a[normalize-space()='Timeline']")
		public WebElement TimelineMenu;
		@FindBy(css = "#contract")
		public WebElement contract;
		@FindBy(css = "#finance")
		public WebElement finance;
		@FindBy(css = "#selections")
		public WebElement selections;
		@FindBy(css = "#construction")
		public WebElement construction;
		@FindBy(css = "#ownership")
		public WebElement ownership;
		//Message
		@FindBy(xpath = "//a[normalize-space()='My Messages']")
		public WebElement Message;
		@FindBy(xpath = "//div[contains(text(),'No Announcements Found')]")
		public WebElement Announcements;
		@FindBy(tagName="div")
		public WebElement Conversations;
		@FindBy(xpath = "//button[normalize-space()='Brad Berish']")
		public WebElement clickdropdown;
		@FindBy(xpath = "//li[normalize-space()='Brad Berish']")
		public WebElement selectdropdown;
		@FindBy(xpath = "//div//div//div//div//div[2]//a[1]")
		public WebElement converstnxyz;
		@FindBy(xpath = "//input[@type='text']")
		public WebElement hello;
		@FindBy(xpath = "//button[@type='submit']")
		public WebElement Msgsend;
		//MY Photos
		@FindBy(xpath = "//a[normalize-space()='My Photos']")
		public WebElement MyPhots;
		@FindBy(xpath = "//button[normalize-space()='List View']")
		public WebElement ListView;
		@FindBy(xpath = "//button[contains(@class,'w-full t-14r py-2 px-3 rounded-md capitalize whitespace-nowrap focus:outline-none focus:ring-2 ring-offset-2 ring-offset-wrh-blue-extralight ring-wrh-gray-dark ring-opacity-20 bg-white shadow-modal text-black')]")
		public WebElement Gridview;	
		//My Document
		@FindBy(xpath = "//a[normalize-space()='My Documents']")
		public WebElement MyDocument;
		@FindBy(xpath = "//i[@title='Download File']//*[name()='svg']")
		public WebElement Download;
		@FindBy(xpath= "//i[@title='View File']//*[name()='svg']")
		public WebElement  ViewDocument;
        @FindBy(xpath= "//a[normalize-space()='Back to All Documents']")
		public WebElement  BackTodocument;
		//MyAccount
		@FindBy(css = "a[href='/myaccount']")
		public WebElement Myaccount;
		@FindBy(css = "body div li:nth-child(1)")
		public WebElement viewcontactinfo;
		@FindBy(css = "body div li:nth-child(2)")
		public WebElement changepassword;
		@FindBy(xpath = "//input[@id='oldPass']")
		public WebElement oldpassword;
		@FindBy(xpath = "//input[@id='newPassword']")
		public WebElement newpassword;
		@FindBy(xpath = "//div[3]//div[1]//input[1]")
		public WebElement confirmpassword;
		@FindBy(xpath = "//button[normalize-space()='Save']")
		public WebElement savepassword;
		@FindBy(xpath= "//li[normalize-space()='Add Additional User']")
		public WebElement AdditionalUser;
		@FindBy(xpath= "//div//div//div//div//div[1]//input[1]")
		public WebElement Firstname;
		@FindBy(xpath= "//div//div//div//div//div//div//div[2]//input[1]")
		public WebElement Lastname;
		@FindBy(xpath= "//div[3]//input[1]")
		public WebElement Phonenumber;
         @FindBy(xpath= "//div[4]//input[1]")
		public WebElement EmailAddress; 
        @FindBy(xpath= "//button[normalize-space()='Add Additional User']")
		public WebElement  saveAdditionalUser;
        @FindBy(xpath= "//li[normalize-space()='Transfer Warranty']")
      		public WebElement  TransferWarranty;
        @FindBy(xpath= "//body/div/div/section/main/div/div[2]/div[1]//*[name()='svg']")
  		public WebElement  passwordpopup;
        @FindBy(xpath= "//a[normalize-space()='Warranty']")
        //warranty
     		public WebElement  Warranty;
        @FindBy(xpath= "//body//div//main//button[1]//*[name()='svg']")
     		public WebElement  WarrantyTemplateDownload;
        @FindBy(xpath= "//li[normalize-space()='60 Days']")
     		public WebElement  sixtyDAYS;
       @FindBy(xpath= "//button[normalize-space()='+ Add Issue']")
     		public WebElement  AddIssue;
       @FindBy(xpath= "//*[name()='path' and contains(@d,'M 3 3 L 3 ')]")
     		public WebElement  Addfile;
       @FindBy(xpath= "//input[@type='text']")
     		public WebElement  Tittleissue;
       @FindBy(xpath="//body//div//div//section//main//div//div//section//div//div//div//div//form//textarea")
     		public WebElement  Describeissue;
       @FindBy(xpath= "//button[normalize-space()='Save']")
     		public WebElement  saveissue;

        
        
        
        
        
        

        

		
		
	
		

			
}
