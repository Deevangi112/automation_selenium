package Mypackage;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuperAdmin {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://qa-super-admin.snapmint.com/admin/login");
		System.out.println("open Super admin page");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='admin_user_email']")).sendKeys("deevangi@snapmint.com");
		System.out.println("Enter user name");
		driver.findElement(By.xpath("//input[@id='admin_user_password']")).sendKeys("Password@112");
		System.out.println("Enter Password");
		driver.findElement(By.xpath("//input[@name='commit']")).click();
		System.out.println("Click Login button");
		
		driver.findElement(By.xpath("//a[@href='/admin/loan_applications/upload_file_for_bulk_sms']")).click();
		System.out.println("choose File ");
		driver.findElement(By.xpath("//input[@id='file']")).sendKeys("C:\\Users\\deeva\\Downloads\\SMS test again(6).xlsx");
		System.out.println("Add file ");
		driver.findElement(By.xpath("//button[@id='submit_btn']")).click();
		System.out.println("Click submit button");
		
		TakesScreenshot screenshot =((TakesScreenshot)driver);
		
		File scr = screenshot.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Automation\\Demo\\Screenshot\\fullPage.png");
		
	  //FileUtils.copyFile(src,dest);
;		
		
		
		
		
	}
	

	
	}


