package WilliamRayanHomeBuyer;

	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	public class WRHDATAURL {
			
		    public static Properties prop;
		    public static WebDriver driver;
			public WilliamRayanHomeBuyerAuto WRH;
			public void BUYERDRIVER()
			{				
				WRH = new WilliamRayanHomeBuyerAuto (driver);
			}
 	    
		    public WRHDATAURL() {
		        
		        try {
		        	WRHDATAURL.prop = new Properties();
		            final FileInputStream ip = new FileInputStream("C:\\Selenium project\\src\\test\\java\\WilliamRayanHomeBuyer\\WRHprp.properties");
		            WRHDATAURL.prop.load(ip);
		        }
		            catch (IOException e2) {
		            e2.printStackTrace();
		        }    }
		    
		    public void LaunchBrowser()
		    {
				String browserName = prop.getProperty("Browser");
				
				if(browserName.equals("Chrome")){
					System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
					driver = new ChromeDriver(); 
				}
				else if(browserName.equals("FireFox")){
					System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");	
					driver = new FirefoxDriver(); 
				}else if(browserName.equals("Edge")){
					System.setProperty("webdriver.edge.driver", "D:\\msedgedriver.exe");	
					driver = new EdgeDriver(); 
				}
					
				driver.get(prop.getProperty("URL_1"));
				driver.manage().window().maximize(); 
				 driver.manage().timeouts().implicitlyWait(80000, TimeUnit.SECONDS);
		    }
		    
		    
		    public void loginuser() 
		    {
				String usertype = prop.getProperty("Home");

		    	
		    if (usertype.equals("LStoutenburg@yopmail.com"))
		    {
		    	  WRH.Email.sendKeys("LStoutenburg@yopmail.com");
		  		  WRH.password.sendKeys("Abc@1234");
					WRH.submitbtn.click(); 

		    }
		    else if(usertype.equals("bradberish@yopmail.com"))
		    {
		    	WRH.Email.sendKeys("bradberish@yopmail.com");
		  		  WRH.password.sendKeys("Abc@1234");
		  		  
					WRH.submitbtn.click(); 
					WRH.multiplehome.click();

		    	
		    }

	}}
	
	
		  
	      


	


