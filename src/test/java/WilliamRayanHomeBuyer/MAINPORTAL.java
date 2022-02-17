package WilliamRayanHomeBuyer;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

	public class MAINPORTAL extends WRHDATAURL  {
	@Test
	public void intialized() throws InterruptedException {
	 	LaunchBrowser(); 
	 	BUYERDRIVER();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
		loginuser(); 
		WRH.Appointments.isDisplayed();
	    WRH.Mortgage.isDisplayed();
		WebElement Element = driver.findElement(By.xpath("//button[normalize-space()='Go to Lender']"));
	    js.executeScript("arguments[0].scrollIntoView();", Element);  
		System.out.println("scroll1");
		WRH.Lender.click();
		// Switch to POPUP window to Main window
					String Main_window = driver.getWindowHandle();
					for (String popupwindow : driver.getWindowHandles()) {
						driver.switchTo().window(popupwindow);
					}
					System.out.println(driver.getTitle() + "__>>__" + driver.getCurrentUrl());
					driver.switchTo().window(Main_window);
		//Dashboard_ViewAll_Timeline
		Thread.sleep(5000);
		driver.navigate().refresh();
        Thread.sleep(9000);
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
		WRH.ViewDocument.click();
		WRH.Download.click();
		WRH.BackTodocument.click();
		 System.out.println("My MyDocument Menu");
		 //My Account
		 WRH.Myaccount.click();
		 WRH.changepassword.click();
		 WRH.oldpassword.sendKeys("Abc@1234");
		 WRH.newpassword.sendKeys("Abc@12345");
		 WRH.confirmpassword.sendKeys("Abc@12345");
		 WRH.savepassword.click();
		 System.out.println("My sdaadff Menu");

		Thread.sleep(13000);
		 WRH.passwordpopup.click();
		 System.out.println("My sdsd Menu");

		 WRH.AdditionalUser.click();
		 WRH.Firstname.sendKeys("Devid");
		 WRH.Lastname.sendKeys("PR");
		 WRH.Phonenumber.sendKeys("1122334455");
		 WRH.EmailAddress.sendKeys("devid.p@yopmail.com");
			Thread.sleep(13000);

	        WebElement Element12 = driver.findElement(By.xpath("//button[contains(text(),'Add Additional User')]"));
		    js.executeScript("arguments[0].scrollIntoView();", Element12);  
			WRH.saveAdditionalUser.click();

			System.out.println("saveAdditionalUser");
		 WRH.passwordpopup.click();
			Thread.sleep(13000);

		 WRH.TransferWarranty.click();
		 System.out.println("My account Menu");
		 
		 //warranty
		 WRH.Warranty.click();
		// WRH.WarrantyTemplateDownload.click();
		 WRH.sixtyDAYS.click();
		WebElement Element2 = driver.findElement(By.xpath("//button[normalize-space()='+ Add Issue']"));
		js.executeScript("arguments[0].scrollIntoView();", Element2);  
		System.out.println("scrollissue");
		 WRH.AddIssue.click();
			System.out.println("d");

		 WRH.AddIssue.sendKeys("D:\\size files_wrh document\\sample.pdf");
			System.out.println("ddd");

		 WRH.Tittleissue.sendKeys("Tittle of the issue");
		 WRH.Describeissue.sendKeys("Description the issue");
		 WRH.saveissue.click();
	}
	@AfterTest
		 //Logout
		public void logout() {
		 WRH.clickdropdown.click();
		 WRH.changeHome.click();
		 WRH.clickdropdown.click();
		 WRH.Logout.click();
		 //Forgot password
		 WRH.Forgotpassword.click();
		 WRH.Enteremail.sendKeys("bradberish@yopmail.com");
		 WRH.setRestInstruction.click();
		 
}
	 
	}
	
	
	
	
	
	
	
	
	
	
	
	
