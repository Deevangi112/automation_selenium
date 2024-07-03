package Mypackage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Test2 {
         public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        	 
        	 String MobileNumber ="9887766322";
        	 String MID ="1";
        	 String Orderid="test29789333";
        	 String Ordervalue ="20000";
        	 String Username="test user";
        	 String Email ="tedfd535gg@gmail.com";
        	 String PAN="FTRPH6007N";
        	 String OTP ="1010";
        	 String AdminUsername="deevangi@snapmint.com";
        	 String AdminUserpassword="Password@112";
        	 String Testframwork ="{:is_enach_required=>0, :kyc=>\"skip\", :voucher_limit=>50000}";
        	 String UpiID ="77777777777@paytm";
        	 
		//System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Deiver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://snapmint:ciHns$@NKSa@qa2.snapmint.com/merchant-demo");
		System.out.println("open merchant demo page and enter username and password");
		driver.manage().window().maximize();
		System.out.println("Maximize browser");
		System.out.println("URL:" + driver.getCurrentUrl());
		
		driver.findElement(By.id("new-mobile")).sendKeys(MobileNumber);
		System.out.println("Enter user number");
		
	    driver.findElement(By.name("merchant_id")).clear();
		driver.findElement(By.name("merchant_id")).sendKeys(MID);
		System.out.println("Enter merchant id");
		    
		driver.findElement(By.name("order_id")).clear();
		driver.findElement(By.name("order_id")).sendKeys(Orderid);
	    System.out.println("Enter order id");
		  
		driver.findElement(By.name("order_value")).clear();		
		driver.findElement(By.name("order_value")).sendKeys(Ordervalue);
		System.out.println("Enter order value");
		
		driver.findElement(By.name("full_name")).clear();		
		driver.findElement(By.name("full_name")). sendKeys(Username);
		System.out.println("Enter user full name");
		
		driver.findElement(By.name("email")).clear();	
		driver.findElement(By.name("email")). sendKeys(Email);
		System.out.println("Enter email id");
		
		driver.findElement(By.xpath("//input[@id='checksum_btn']")).click();
		System.out.println("Click create checksum button");
		driver.findElement(By.xpath("//input[@value='submit']")).click();
		System.out.println("Click submit button");
		
		driver.findElement(By.xpath("//input[@id='inputBox'][@name='otp']")).sendKeys(OTP);
		System.out.println("Enter OTP");
		driver.findElement(By.className("snap-primary-button")).click();
		System.out.println("Enter Verify button");
		   
        driver.findElement(By.xpath("//input[@id='panNumber']")).sendKeys(PAN);
		Thread.sleep(1000);
        System.out.println("Enter PAN number ");
        driver.findElement(By.xpath("//input[@value='f']")).click(); 
        System.out.println("Select gender");
        driver.findElement(By.xpath("//div[text()='Day']")).click();
        Thread.sleep(2000);
        System.out.println("User click on Day tab");
        driver.findElement(By.xpath("//div[@class='even:bg-[#F4F7FF] odd:bg-white pl-4'][1]")).click();
        Thread.sleep(2000);
        System.out.println("User Select Day from Dropdown");
        driver.findElement(By.xpath("(//*[@class='w-[100%] h-[48px] border-[1px] rounded-[4px] text-center border-[#DEE4E5] flex items-center'])[2]")).click();
	    Thread.sleep(2000);
	    System.out.println("User click on Month tab");
	    driver.findElement(By.xpath("(//*[text()='June'])[1]")).click();
	    Thread.sleep(2000);
	    System.out.println("User Select Month from Dropdown");  
	    driver.findElement(By.xpath("//div[text()='Year']")).click();
	    Thread.sleep(2000);
	    System.out.println("User click on Year tab");
	    driver.findElement(By.xpath("//div[@class='even:bg-[#F4F7FF] odd:bg-white pl-4'][10]")).click();
	    Thread.sleep(2000);
	    System.out.println("User Select Year from Dropdown");
	    driver.findElement(By.xpath("//div[@class='w-full pt-12']")).click();
	    System.out.println("User click Next buttton");
	    System.out.println("Fil registration Form ");
	    
	    String CurrentpageURL = driver.getCurrentUrl();
	    
	         //testfffdgfhfgh
	    
	    Base F1 = new Base();
	    F1.D1();
		
        driver.get(CurrentpageURL);
        System.out.println("print page URL");
        
        driver.findElement(By.xpath("//*[@class='bg-primary text-darkGreen  snap-primary-button w-[100%] px-[0px]']")).click();
	     //driver.findElement(By.xpath("//button[@class='bg-primary text-darkGreen  snap-primary-button w-[100%] px-[0px]']")).click();
	     System.out.println("select T&C");
	     Thread.sleep(2000);
	      
	      WebElement D1 = driver.findElement(By.xpath("//input[@class='  peer  placeholder-transparent snap-input text-lg w-full']"));
	      D1.sendKeys(UpiID);
	      Thread.sleep(10000);
	      System.out.println("Action class to be use");
	      Actions A = new Actions(driver);
	      
	      A.doubleClick(D1).perform();
	      
	      System.out.println("Enter UPI ID ");
	      Thread.sleep(2000);
	      
	     driver.findElement(By.xpath("//button[starts-with(text(),'Pay')]")).click();
	    // driver.findElement(By.xpath("//*[@class='bg-secondaryText snap-primary-button py-[16px] h-[40PX] w-[164px] mx-auto text-[12px] mt-[12px]']")).click();
	     System.out.println("Click Pay Now button");
	     Thread.sleep(2000);
	        
         }

		   
}
