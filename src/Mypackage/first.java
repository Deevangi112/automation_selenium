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
		     System.out.println("open merchant demo page and enter username and password");
		driver.manage().window().maximize();
		System.out.println("Maximize browser");
		driver.findElement(By.id("new-mobile")).sendKeys("9178590291");
		   Thread.sleep(2000);
		   System.out.println("Enter user number");
	    driver.findElement(By.name("merchant_id")).clear();
		driver.findElement(By.name("merchant_id")).sendKeys("4");
		    Thread.sleep(2000);
		    System.out.println("Enter merchant id");
		driver.findElement(By.name("order_id")).clear();
		driver.findElement(By.name("order_id")).sendKeys("ttti93");
		  Thread.sleep(2000);
		  System.out.println("Enter order id");
		driver.findElement(By.name("order_value")).clear();		
		driver.findElement(By.name("order_value")).sendKeys("15000");
		  Thread.sleep(2000);
		  System.out.println("Enter order value");
		driver.findElement(By.name("full_name")).clear();		
		driver.findElement(By.name("full_name")). sendKeys("Deevangi test");
		   Thread.sleep(2000);
		   System.out.println("Enter user full name");
		driver.findElement(By.name("email")).clear();	
		driver.findElement(By.name("email")). sendKeys("te6976k@gmail.com");
		   Thread.sleep(1000);
		   System.out.println("Enter email id");
		driver.findElement(By.xpath("//input[@id='checksum_btn']")).click();
		  System.out.println("Click create checksum button");
		driver.findElement(By.xpath("//input[@value='submit']")).click();
		  System.out.println("Click submit button");
		driver.findElement(By.xpath("//input[@id='inputBox'][@name='otp']")).sendKeys("1010");
		   Thread.sleep(1000);
           System.out.println("Enter OTP");
		driver.findElement(By.className("snap-primary-button")).click();
		   System.out.println("Enter Verify button");
           /*//clear first 
        driver.findElement(By.xpath("//input[@id='firstName']")).clear();
        //enter  first name
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("test");
        //clear last name
        driver.findElement(By.xpath("//input[@id='lastName']")).clear();
         //enter last name
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("user");
         */
        driver.findElement(By.xpath("//input[@id='panNumber']")).sendKeys("FHOPL5898N");
		   Thread.sleep(1000);
           System.out.println("Enter PAN number ");
        driver.findElement(By.xpath("//input[@value='f']")).click(); 
           Thread.sleep(1000);
           System.out.println("Select gender");
        driver.findElement(By.xpath("//div[text()='Day']")).click();
        Thread.sleep(2000);
        System.out.println("User click on Day tab");
              driver.findElement(By.xpath("//*[@id='react-select-2--option-20']")).click();
        Thread.sleep(2000);
        System.out.println("User Select Day from Dropdown");
        WebElement month=driver.findElement(By.xpath("(//*[@class='Select-placeholder'])[1]"));
              month.click();
        System.out.println("User click on Month tab");
              driver.findElement(By.xpath("//*[@id='react-select-3--option-8']")).click();
        Thread.sleep(2000);
        System.out.println("User Select Month from Dropdown");
        WebElement year = driver.findElement(By.xpath("(//*[@class='Select-placeholder'])[1]"));
               year.click();
        System.out.println("User click on Year tab");
               driver.findElement(By.xpath("//*[@id='react-select-4--option-31']")).click();
        Thread.sleep(2000);
        System.out.println("User Select Year from Dropdown");
		
         }	

}
