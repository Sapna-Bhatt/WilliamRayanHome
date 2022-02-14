package ForgotPassword_Logout;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import WRH_Homepage.Login;

public class Forgot_logout extends Login{
    @Test
	 public void ForgetPassword() throws InterruptedException {
     driver.findElement(By.cssSelector("span[class='md:inline !moblands:hidden hidden text-16m font-medium text-wrh-gray-600']")).click();
     driver.findElement(By.xpath("//span[@class='w-full block t-16r text-wrh-gray-medium']")).click();
     driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > section:nth-child(2) > header:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2)")).click();
	 Thread.sleep(5000); 
	 driver.findElement(By.cssSelector("a[class='t-12r text-wrh-blue-400 hover:text-wrh-blue-600 md:t-14r']")).click();
     driver.findElement(By.cssSelector("#email")).sendKeys("jeffrey.howard@yopmail.com");
     driver.findElement(By.cssSelector("button[type='submit']")).click();

}
    
}