package Projectselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {
	
	public WebDriver alpha;
	
	String driverPath = "Driver/chromedriver.exe";


  @Test()//enabled true- dependsonmethods-{testcase2}
  public void testcase1() {
		
		alpha.findElement(By.xpath("//input[@name='Username']")).sendKeys("ArunGB");
		alpha.findElement(By.xpath("//input[@name='Password']")).sendKeys("111cf97a");
		alpha.findElement(By.xpath("//button[@class='btn btn-lg btn-primary btn-block']")).click();
		
  }
  
  
  @Test
  public void testcase2()
  {
	 
  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", driverPath);
		
		alpha = new ChromeDriver();
	
		alpha.manage().window().maximize();
		
		alpha.get("https://www.creditsafe.com/gb/en.html");
		
		alpha.findElement(By.xpath("//span[@class='cta2']")).click();
  }

  @AfterMethod
  public void afterMethod() {
	  
	  alpha.quit();
	  
  }

}
