package Projectselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce1710 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
	 
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://nbn--jigsawst2.cs5.my.salesforce.com/");
	
	driver.findElement(By.xpath("//*[@type='email']")).sendKeys("varunbhardwaj@nbnco.com.au.jigsawst2");
	driver.findElement(By.xpath("//*[@type='password']")).sendKeys("#Credebility1");
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	
	//username-varunbhardwaj@nbnco.com.au.jigsawst2
	//pwd- #Credebility1
	//INC000008536601
	}
}
