package WRH_Message;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import WRH_Homepage.Login;
public class Message extends Login{
@Test
public void Message() throws InterruptedException{
		 driver.findElement(By.partialLinkText("My Messag")).click();
		 System.out.println("My Messag");
		 Thread.sleep(1000); 
		 driver.findElement(By.xpath("//*[@class='space-y-1']/h3")).click();
		 System.out.println("Announcements");
		 Thread.sleep(1000); 
		 driver.findElement(By.tagName("div")).click();
		 System.out.println("Conversations");
		 Thread.sleep(1000); 
		 driver.findElement(By.xpath("//button[normalize-space()='Brad Berish']")).click();
		 System.out.println("click drop-down");
		 Thread.sleep(2000); 
		 driver.findElement(By.xpath("//li[normalize-space()='Brad Berish']")).click();
		 System.out.println("selection from drop-down");
		 Thread.sleep(2000); 
		 driver.findElement(By.xpath("//div//div//div//div//div[2]//a[1]")).click();
		 Thread.sleep(2000); 

		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello..");
		 System.out.println("typing message");
		 Thread.sleep(2000); 
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 Thread.sleep(5000); 
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("How Are You");
		 Thread.sleep(2000); 
		 driver.findElement(By.xpath("//button[@type='submit']")).click();

		 
	
}
}