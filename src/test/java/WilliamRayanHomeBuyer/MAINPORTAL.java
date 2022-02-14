package WilliamRayanHomeBuyer;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import WilliamRayanHomeBuyer.WRHDATAURL;

	public class MAINPORTAL extends WRHDATAURL  {
	@Test
	public void intialized() throws InterruptedException {

		
	  
		LaunchBrowser(); 
		BUYER();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
		System.out.println("Website launch");
	     WRH.Email.sendKeys("bradberish@yopmail.com");
		 WRH.password.sendKeys("Abc@12345");
		 WRH.submitbtn.click(); 
		 
		 
		  try{
			     WRH.multiplehome.click();
		    } 
		    catch (NoSuchElementException e) 
		    {
		        System.err.println("One Home");
		         }
		
		Thread.sleep(5000); 
	    WRH.Appointments.isDisplayed();
	    WRH.Mortgage.isDisplayed();
		WebElement Element = driver.findElement(By.xpath("//button[normalize-space()='Go to Lender']"));
	    js.executeScript("arguments[0].scrollIntoView();", Element);  
		System.out.println("scroll");
		WRH.Lender.click();
		// Switch to POPUP window to Main window
					String Main_window = driver.getWindowHandle();
					for (String popupwindow : driver.getWindowHandles()) {
						driver.switchTo().window(popupwindow);
					}
					System.out.println(driver.getTitle() + "__>>__" + driver.getCurrentUrl());
					Thread.sleep(3000);
					driver.switchTo().window(Main_window);
		//Dashboard_ViewAll_Timeline
		Thread.sleep(5000);
	     WRH.viewtimeline.click();
	     Thread.sleep(1000);
		 driver.get("https://sprint-wrh-portal.exitest.com/timeline");      
	     Thread.sleep(6000);
	     if  (driver.getCurrentUrl().equals("https://sprint-wrh-portal.exitest.com/timeline")) 	 
	     {
	         System.out.println(" Dashboard_ViewAll_Timeline");

	     }
	     else
	     {	System.out.println("Not matching");
	}
	   	 WRH.Dashboard.click();

	    //Timeline Menu
		 WRH.TimelineMenu.click();
		 WRH.contract.click();
		 WRH.finance.click();
		 WRH.selections.click();
		 WRH.contract.click();
		 WRH.ownership.click();
		 System.out.println("Timeline Menu");
		 //MY Message Menu
		 WRH.Message.click();
		  try{
				 WRH.Announcements.click();
		    } 
		    catch (NoSuchElementException e) 
		    {
		        System.err.println("One Home");
		         }
		 WRH.Conversations.click();
		 WRH.clickdropdown.click();
		 WRH.selectdropdown.click();
	     WRH.converstnxyz.click();
	     WRH.hello.sendKeys("HELLO.. How Are You");
	     WRH.Msgsend.click();
		 System.out.println("My Message Menu");
	     //My Photos Menu
		 WRH.MyPhots.click();
		 WRH.Gridview.click();
		 WRH.ListView.click();
		 System.out.println("My Myphotos Menu");
		 //My Document
		 WRH.MyDocument.click();
		 WRH.Download.click();
					
		// WRH.ViewDocument.click();
		// WRH.BackTodocument.click();
		 //HANDLE firefox 
		 System.out.println("My MyDocument Menu");
		 //My Account
		 WRH.Myaccount.click();
		 WRH.changepassword.click();
		 WRH.oldpassword.sendKeys("Abc@12345");
		 WRH.newpassword.sendKeys("Abc@1234");
		 WRH.confirmpassword.sendKeys("Abc@1234");
		 WRH.savepassword.click();
		 WRH.passwordpopup.click();
		 WRH.Firstname.sendKeys("Devid");
		 WRH.Lastname.sendKeys("P");
		 WRH.Phonenumber.sendKeys("1122334455");
		 WRH.EmailAddress.sendKeys("devid.p@yopmail.com");
		 WRH.saveAdditionalUser.click();
		 WRH.passwordpopup.click();
		 WRH.TransferWarranty.click();
		 System.out.println("My account Menu");
		 //warranty
		 WRH.Warranty.click();
		// WRH.WarrantyTemplateDownload.click();
		 WRH.sixtyDAYS.click();
		 WRH.AddIssue.click();
		 WRH.Addfile.sendKeys("D:\\size files_wrh document\\sample.pdf");
		 WRH.Tittleissue.sendKeys("Tittle of the issue");
		 WRH.Describeissue.sendKeys("Description the issue");
		 WRH.saveissue.click();
		 //Logout
		 WRH.clickdropdown.click();
		 WRH.changeHome.click();
		 WRH.clickdropdown.click();
		 WRH.Logout.click();
		 //Forgot password
		 WRH.Forgotpassword.click();
		 WRH.Enteremail.sendKeys("bradberish@yopmail.com");
		 WRH.setRestInstruction.click();
		 

}}
	
	
	
	
	
	
	
	
	
	
	
	
