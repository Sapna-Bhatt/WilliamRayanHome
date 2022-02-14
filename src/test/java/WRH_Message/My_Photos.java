package WRH_Message;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import WRH_Homepage.Login;

	
	public class My_Photos extends Login{
		@Test
		public void Photos() throws InterruptedException{
	driver.findElement(By.xpath("//a[normalize-space()='My Photos']")).click();
	 driver.findElement(By.xpath("//button[normalize-space()='List View']")).click();
	 
	 driver.findElement(By.xpath("//button[contains(@class,'w-full t-14r py-2 px-3 rounded-md capitalize whitespace-nowrap focus:outline-none focus:ring-2 ring-offset-2 ring-offset-wrh-blue-extralight ring-wrh-gray-dark ring-opacity-20 bg-white shadow-modal text-black')]")).click();


}
}