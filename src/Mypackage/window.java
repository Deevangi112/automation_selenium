package Mypackage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		System.out.println("Maximize browser");

		driver.get("https://snapmint:ciHns$@NKSa@qa2.snapmint.com/merchant-demo");
		System.out.println("open merchant demo page and enter username and password");

		System.out.println("URL:" + driver.getCurrentUrl());
		
		String parentHandle=driver.getWindowHandle();
		System.out.println("window test");
		
		Set<String> handles =driver.getWindowHandles();
		for (String handle :handles)
		{
			System.out.println(handle);
		}		
		
		
		Thread.sleep(2000);

	}

}
