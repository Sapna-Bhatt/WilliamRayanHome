package Timeline;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import WRH_Homepage.Login;
public class Timeline extends Login{
@Test
public void Timeline() throws InterruptedException

{	 driver.findElement(By.partialLinkText("Timeli")).click();
     Thread.sleep(5000); 
	 driver.findElement(By.cssSelector("#contract")).click();
	 Thread.sleep(5000); 
	 driver.findElement(By.cssSelector("#contract")).click();

	 driver.findElement(By.cssSelector("#finance")).click();
	 Thread.sleep(5000); 
	 driver.findElement(By.cssSelector("#selections")).click();
	 Thread.sleep(5000); 
	 driver.findElement(By.cssSelector("#construction")).click();
	 Thread.sleep(5000); 
	 driver.findElement(By.cssSelector("#ownership")).click();
}}