package Mypackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QaAdmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Automation\\Deiver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://qa2.snapmint.com/admin/login");

		driver.findElement(By.xpath("//input[@id='admin_user_email']")).sendKeys("deevangi@snapmint.com");

		driver.findElement(By.xpath("//input[@id='admin_user_password']")).sendKeys("Password@112");

		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

}
