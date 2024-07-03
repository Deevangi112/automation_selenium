package Mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

class Base{
	 
	 String MobileNumber ="9887766322";
	 String AdminUsername="deevangi@snapmint.com";
	 String AdminUserpassword="Password@112";
	 String Testframwork ="{:is_enach_required=>0, :kyc=>\"skip\", :voucher_limit=>50000}";
	 WebDriver driver;
	   
	 public void D1() throws InterruptedException{
	    driver.get("https://qa2.snapmint.com/admin/login");
	    System.out.println("Open admin dashboard");
	    driver.findElement(By.xpath("//input[@id='admin_user_email']")).sendKeys(AdminUsername);
	    System.out.println("Add Admin Username");
	 	Thread.sleep(2000);
	 	driver.findElement(By.xpath("//input[@id='admin_user_password']")).sendKeys(AdminUserpassword);
	 	System.out.println("Add Admin User Password");
	 	Thread.sleep(2000);
	 	driver.findElement(By.xpath("//input[@type='submit'][@name='commit']")).click();
	 	System.out.println("Click login Button");
	
		System.out.println("open admin page");
			
	    driver.get("https://qa2.snapmint.com/admin/test_frameworks");
	    System.out.println("Open Testframeworks page");
	    driver.findElement(By.xpath("//a[@href='/admin/test_frameworks/new']")).click();
	    System.out.println("click New Test Framework button");
	    driver.findElement(By.xpath("//input[@id='test_framework_user_name']")).sendKeys("testuser");
	    driver.findElement(By.xpath("//input[@id='test_framework_mobile']")).sendKeys(MobileNumber);
	    driver.findElement(By.xpath("//input[@id='test_framework_rules']")).clear();
	    driver.findElement(By.xpath("//input[@id='test_framework_rules']")).sendKeys(Testframwork);
	    driver.findElement(By.xpath("//input[@name='commit']")).click();	
		System.out.println("Add Test framwork Value");
		
		driver.get("https://qa2.snapmint.com/admin/users");
		driver.findElement(By.xpath("//input[@id='q_mobile']")).sendKeys(MobileNumber);
		driver.findElement(By.xpath("//input[@name='commit']")).click();
		driver.findElement(By.xpath("//a[@class='resource_id_link']")).click();
		System.out.println("Open user page");
	 }
	 }
		
	 class Limit extends Base{
			
			 public void D2() throws InterruptedException{
		
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
	 
