package WRH_Message;

	import org.openqa.selenium.By;
	import org.testng.annotations.Test;
	import WRH_Homepage.Login;

		
		public class My_Document extends Login{
			@Test
			public void Document() throws InterruptedException{
				
				 driver.findElement(By.xpath("//a[normalize-space()='My Documents']")).click();
				 driver.findElement(By.xpath("//i[@title='Download File']//*[name()='svg']")).click();


				
				
				
}
}