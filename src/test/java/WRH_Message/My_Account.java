package WRH_Message;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import WRH_Homepage.Login;
	public class My_Account extends Login{
		@Test
		public void Accpunt() throws InterruptedException{

			//View Account Info
			driver.findElement(By.cssSelector("a[href='/myaccount']")).click();
			System.out.println("View Account Info");
			 Thread.sleep(5000);   

			driver.findElement(By.cssSelector("body div li:nth-child(1)")).click();
					System.out.println("View Account Info2");

			//Chnage Password
										driver.findElement(By.cssSelector("body div li:nth-child(2)")).click();
										 Thread.sleep(5000);   
										driver.findElement(By.xpath("//input[@id='oldPass']")).sendKeys("Abc@1234");
										
						System.out.println("old password");
						driver.findElement(By.xpath("//input[@id='newPassword']")).sendKeys("Abc@1234");
						System.out.println("New password");
						driver.findElement(By.xpath("//input[@id='confirmPassword']")).sendKeys("Abc@12345");
						//button[@class='check column btn btn-invisible']


						
		}

		

}