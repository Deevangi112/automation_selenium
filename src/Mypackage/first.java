package Mypackage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class first {
         public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Deiver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://snapmint:ciHns$@NKSa@qa2.snapmint.com/merchant-demo");
		     System.out.println("open merchant demo page and enter username and password");
		driver.manage().window().maximize();
		System.out.println("Maximize browser");
		System.out.println("URL:" + driver.getCurrentUrl());
		
		driver.findElement(By.id("new-mobile")).sendKeys("8729680299");
		System.out.println("Enter user number");
		
	    driver.findElement(By.name("merchant_id")).clear();
		driver.findElement(By.name("merchant_id")).sendKeys("1");
		System.out.println("Enter merchant id");
		    
		driver.findElement(By.name("order_id")).clear();
		driver.findElement(By.name("order_id")).sendKeys("t1053");
	    System.out.println("Enter order id");
		  
		driver.findElement(By.name("order_value")).clear();		
		driver.findElement(By.name("order_value")).sendKeys("15000");
		System.out.println("Enter order value");
		
		driver.findElement(By.name("full_name")).clear();		
		driver.findElement(By.name("full_name")). sendKeys("test user");
		System.out.println("Enter user full name");
		
		driver.findElement(By.name("email")).clear();	
		driver.findElement(By.name("email")). sendKeys("t63hjhjj@gmail.com");
		System.out.println("Enter email id");
		
		driver.findElement(By.xpath("//input[@id='checksum_btn']")).click();
		System.out.println("Click create checksum button");
		driver.findElement(By.xpath("//input[@value='submit']")).click();
		System.out.println("Click submit button");
		
		driver.findElement(By.xpath("//input[@id='inputBox'][@name='otp']")).sendKeys("1010");
		System.out.println("Enter OTP");
		driver.findElement(By.className("snap-primary-button")).click();
		System.out.println("Enter Verify button");
		   
        driver.findElement(By.xpath("//input[@id='panNumber']")).sendKeys("FHOPL6855N");
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
	         
	    driver.get("https://qa2.snapmint.com/admin/login");
	    System.out.println("Open admin dashboard");
	    driver.findElement(By.xpath("//input[@id='admin_user_email']")).sendKeys("deevangi@snapmint.com");
	    System.out.println("Add Admin Username");
	 	Thread.sleep(2000);
	 	driver.findElement(By.xpath("//input[@id='admin_user_password']")).sendKeys("Password@112");
	 	System.out.println("Add Admin User Password");
	 	Thread.sleep(2000);
	 	driver.findElement(By.xpath("//input[@type='submit'][@name='commit']")).click();
	 	System.out.println("Click login Button");
	         
	 	//driver.get("https://qa2.snapmint.com/admin/login");
			
		//driver.findElement(By.xpath("//input[@id='admin_user_email']")).sendKeys("deevangi@snapmint.com");
			
		//driver.findElement(By.xpath("//input[@id='admin_user_password']")).sendKeys("Password@112");
			
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
			
		System.out.println("open admin page");
			
	    driver.get("https://qa2.snapmint.com/admin/test_frameworks");
	    System.out.println("Open Testframeworks page");
	    driver.findElement(By.xpath("//a[@href='/admin/test_frameworks/new']")).click();
	    System.out.println("click New Test Framework button");
	    driver.findElement(By.xpath("//input[@id='test_framework_user_name']")).sendKeys("testuser");
	    driver.findElement(By.xpath("//input[@id='test_framework_mobile']")).sendKeys("8729680299");
	    driver.findElement(By.xpath("//input[@id='test_framework_rules']")).clear();
	    driver.findElement(By.xpath("//input[@id='test_framework_rules']")).sendKeys("{:is_enach_required=>0, :kyc=>\"skip\", :voucher_limit=>50000}");
	    driver.findElement(By.xpath("//input[@name='commit']")).click();	
		System.out.println("Add Test framwork Value");
		
		driver.get("https://qa2.snapmint.com/admin/users");
		driver.findElement(By.xpath("//input[@id='q_mobile']")).sendKeys("8729680299");
		driver.findElement(By.xpath("//input[@name='commit']")).click();
		driver.findElement(By.xpath("//a[@class='resource_id_link']")).click();
		System.out.println("Open user page");
		
		driver.findElement(By.xpath("//a[contains(text(),'Boost Eligible Now')]")).click();
		driver.findElement(By.xpath("//input[@id='remark']")).sendKeys("25000");
		driver.findElement(By.xpath("//button[@class='btn']")).click();
		System.out.println("Add Eligible limit");
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Change Approved Limit')]")).click();
		driver.findElement(By.xpath("//input[@id='remark']")).sendKeys("25000");
	    driver.findElement(By.xpath("//button[@class='btn']")).click();
		System.out.println("Add Approved limit");
	   
	        
         }      
}
