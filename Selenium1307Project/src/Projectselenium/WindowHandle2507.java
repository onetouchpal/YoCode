package Projectselenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle2507 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hdfcbank.com/personal/ways-to-bank/bank-online/credit-cards-netbanking");
		
		//String firsthandle = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//div[@class ='loginetbank']")).click();
		
		Thread.sleep(500);
		driver.findElement(By.id("netbanking")).click();
		//input[@id='netbanking']
		
		driver.findElement(By.xpath("//a[@id ='loginsubmit']")).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		System.out.println(handles.size());
		System.out.println(driver.getWindowHandle());
		
		for(String handle : handles) {
			//if(!handle.equals(firsthandle)) {
				driver.switchTo().window(handle);
				//break;
			}
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='pdtb25 text-center']")).click();
		
		//Thread.sleep(500);
		System.out.println(driver.getWindowHandle());
		//driver.findElement(By.xpath("//input[@id='User_Id']")).sendKeys("vishal");
		
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='pwd_field']")).sendKeys("vishal");
		//driver.quit();
		
	}

}
