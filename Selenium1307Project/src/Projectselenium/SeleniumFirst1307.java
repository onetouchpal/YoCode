package Projectselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirst1307 {
	
	public static void main(String [] args) throws InterruptedException {
	
	System.setProperty("webdriver.gecko.driver", "Driver/geckodriver.exe");
	 
	
	WebDriver driver = new FirefoxDriver();
	
	driver.manage().window().maximize();
	
	//driver.get("https://www.facebook.com/");
	driver.navigate().to("https://www.facebook.com/");
	
	
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sherifzener1988@gmail.com");
	
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Easy2usevishal");
	
	Thread.sleep(100);
	driver.findElement(By.xpath("//input[@id='u_0_2']")).click();
	Thread.sleep(500);
	
	
	//driver.close();
	//driver.quit();
	
	
	
	
	}
}
