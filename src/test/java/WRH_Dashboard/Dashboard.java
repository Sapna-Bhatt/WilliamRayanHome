package WRH_Dashboard;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import WRH_Homepage.Login;
public class Dashboard extends Login{
	@Test
    public void Dashboard() throws InterruptedException {
 	//contract
  driver.findElement(By.linkText("Home Progress")).click();
   System.out.println("contract");	
  driver.findElement(By.xpath("//a[normalize-space()='View Timeline']")).click();
  System.out.println("View All");	
   //Dashboard My Messages
   driver.findElement(By.partialLinkText("My Messages")).click();
   System.out.println("Dashboard My Messages");	
   //My Appointments
   driver.findElement(By.xpath("ffffffffffffffffffffffeen-dark']")).click();
   System.out.println("My Appointments");	
   //Preferred Lender
   driver.findElement(By.xpath("//button[normalize-space()='Go to Lender']']")).click();
   System.out.println("Preferred Lender");	
	
}
}