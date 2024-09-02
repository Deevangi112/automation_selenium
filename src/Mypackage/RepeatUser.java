package Mypackage;

import java.awt.Robot;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class RepeatUser {

	public static void main(String[] args) throws InterruptedException {

		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Automation\\Deiver\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		System.out.println("Maximize browser");

		driver.get("https://snapmint:ciHns$@NKSa@qa2.snapmint.com/merchant-demo");
		System.out.println("open merchant demo page and enter username and password");

		System.out.println("URL:" + driver.getCurrentUrl());

		driver.findElement(By.id("new-mobile")).sendKeys("9842758425");
		System.out.println("Enter user number");

		driver.findElement(By.name("merchant_id")).clear();
		driver.findElement(By.name("merchant_id")).sendKeys("4");
		System.out.println("Enter merchant id");

		driver.findElement(By.name("order_id")).clear();
		driver.findElement(By.name("order_id")).sendKeys("58ertertt");
		System.out.println("Enter order id");

		driver.findElement(By.name("order_value")).clear();
		driver.findElement(By.name("order_value")).sendKeys("2000");
		System.out.println("Enter order value");

		driver.findElement(By.name("full_name")).clear();
		System.out.println("Remove user name");

		driver.findElement(By.name("email")).clear();
		System.out.println("Remove Email id");

		driver.findElement(By.xpath("//input[@id='checksum_btn']")).click();
		System.out.println("Click create checksum button");
		driver.findElement(By.xpath("//input[@value='submit']")).click();
		System.out.println("Click submit button");

		driver.findElement(By.xpath("//input[@id='inputBox']")).sendKeys("1010");
		System.out.println("Enter OTP");
		Thread.sleep(2000);
		
		System.out.println("select T&C");
		//driver.findElement(By.xpath("//*[@class='bg-primary text-darkGreen  snap-primary-button w-[100%] px-[0px]']//button*[text()='Yes']")).click();
		//driver.findElement(By.xpath("//button[text()='Yes']")).click();
				
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Yes')]")));
		// click on the compose button as soon as the "Yes" button is visible
		driver.findElement(By.xpath("//*[contains(text(),'Yes')]")).click();
		WebElement D1 = driver
				.findElement(By.xpath("//input[@class='  peer  placeholder-transparent snap-input text-lg w-full']"));
		D1.sendKeys("777777777777@paytm");
		Thread.sleep(10000);
		System.out.println("Action class to be use");
		Actions A = new Actions(driver);

		A.doubleClick(D1).perform();

		System.out.println("Enter UPI ID ");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[starts-with(text(),'Pay')]")).click();
		// driver.findElement(By.xpath("//*[@class='bg-secondaryText snap-primary-button
		// py-[16px] h-[40PX] w-[164px] mx-auto text-[12px] mt-[12px]']")).click();
		System.out.println("Click Pay Now button");
		Thread.sleep(2000);

		// button[@class=" bg-secondaryText snap-primary-button py-[16px] h-[40PX]
		// w-[164px] mx-auto text-[12px] mt-[12px]"] }

		// driver.findElement(By.xpath("//*[@class='flex relative gap-[12px]
		// items-center w-full h-[48px] cursor-pointer text-headGreen bg-white
		// before:bg-[#ffffff] before:h-[47px] before:w-[8px] before:absolute
		// before:content-[''] before:left-[-4px] before:z-[99] after:bg-[#ffffff]
		// after:h-[47px] after:w-[8px] after:absolute after:content-['']
		// after:right-[-4px] after:z-[99] border-[#DEDEDE] border-y-[0.3px]
		// font-robotoBold']")).click();
		// driver.findElement(By.xpath("//*[@class='item-center w-[38px] h-[38px]
		// bg-[#fff] border-[#70C1CC] border-2 rounded-[4px]']")).click();
		// driver.findElement(By.xpath("//button[@class='bg-primary text-darkGreen
		// snap-primary-button py-[16px] h-[40PX] w-[164px] mx-auto
		// text-[12px]']")).click();

	}
}
