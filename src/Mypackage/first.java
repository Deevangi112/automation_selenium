package Mypackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class first {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Deiver\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://snapmint:ciHns$@NKSa@qa2.snapmint.com/merchant-demo");
		
		
		//driver.get("https://qa.snapmint.com/");
		
		//driver.findElement(By.xpath("//contains[@class='flex gap-2 sm:gap-1 items-center']")).click();
		
		//maximize browser
		driver.manage().window().maximize();
		
		driver.findElement(By.id("new-mobile")).sendKeys("9191095952");
		
		
		driver.findElement(By.name("merchant_id")).clear();
		driver.findElement(By.name("merchant_id")).sendKeys("4");
		
		driver.findElement(By.name("order_id")).clear();
		driver.findElement(By.name("order_id")).sendKeys("ttti93");
		
		driver.findElement(By.name("order_value")).clear();		
		driver.findElement(By.name("order_value")).sendKeys("15000");
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("full_name")).clear();		
		driver.findElement(By.name("full_name")). sendKeys("Deevangi test");
		
		
		driver.findElement(By.name("email")).clear();	
		driver.findElement(By.name("email")). sendKeys("q7976k@gmail.com");
		
		Thread.sleep(1000);
			
		//driver.findElement(By.id("checksum_btn")).click();
		
		driver.findElement(By.xpath("//input[@id='checksum_btn']")).click();
		
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		
			driver.findElement(By.xpath("//input[@value='submit']")).click();
		//locate password using multiple attribute

		driver.findElement(By.xpath("//input[@id='inputBox'][@name='otp']")).sendKeys("1010");
		
		//locate verify button
		
		driver.findElement(By.className("snap-primary-button")).click();
		
		//clear first 
        driver.findElement(By.xpath("//input[@id='firstName']")).clear();
        //enter  first name
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("test");
        //clear last name
        driver.findElement(By.xpath("//input[@id='lastName']")).clear();
         //enter last name
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("user");
         //enter pan number

		driver.findElement(By.xpath("//input[@id='panNumber']")).sendKeys("FHOPL5898N");
		
		//gender
        WebElement radio=driver.findElement(By.xpath("//input[@value='f']"));
		
		radio.click();
		
		//driver.quit();	
	}

}
