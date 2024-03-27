package Mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

  public class qasnapmint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
            System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Deiver\\chromedriver.exe");
        
		  WebDriver driver = new ChromeDriver();
		  
		 //driver.navigate().to("https://qa.snapmint.com/");
		
		  driver.get("https://qa.snapmint.com/");
		   
		  driver.findElement(By.xpath("//div[@class='flex items-center xl:mr-4 w-[50%] justify-end gap-8 mr-8']/div[3]/button[@class='whitespace-nowrap cursor-pointer text-[#014751] font-robotoRegular text-[14px] leading-[18px] sm:text-sm']")).click();
		   
		   
		  driver.findElement(By.xpath("//div[@class='relative pl-2']/input[@name='mobile']")).sendKeys("9647583496");
		  
		  driver.findElement(By.xpath("//button[@class='!bg-headerBlue hover:bg-headerBlue font-montserratMedium mt-4 text-lightYellow w-[144px] h-[40px] px-6 py-2.5 text-center font-bold text-sm rounded-md shadow hover:shadow-lg outline-none focus:outline-none mx-auto']")).click();
	     // driver.findElement(By.xpath("//div[@id='modal']/input[@id='inputfield'][@name='otp']")).sendKeys("1010");
	
		// driver.findElement(By.xpath("//input[@id='inputfield'][@name='otp']")).sendKeys("1010");
		// driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[3]/div[2]/div/div/div/input[@id='inputfield'][@name='otp']")).sendKeys("1010");
		// driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[3]/div[2]/div/div/div/input")))
		 //driver.get("https://qa.snapmint.com/p/coolerss-a-ram-3-gb-storage-64-gb-mobiles-on-emi");
		 
		 
		 driver.findElement(By.xpath(("//input[@id='inputfield'])[2]"))).sendKeys("1010");
	}
	
	

}
