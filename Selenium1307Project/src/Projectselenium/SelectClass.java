package Projectselenium;
	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
	
		public static void main(String[] args) {
			
			System.setProperty("webdriver.gecko.driver", "Driver/geckodriver.exe");
			
			WebDriver driver = new FirefoxDriver();
		
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
			
			driver.get("https://www.facebook.com/");
			
			driver.findElement(By.id("u_0_j")).sendKeys("vishal");
			
			driver.findElement(By.name("lastname")).sendKeys("bhardwaj");
			
			driver.findElement(By.id("u_0_o")).sendKeys("sherifzener@gmail.com");
			
			driver.findElement(By.id("u_0_r")).sendKeys("sherifzener@gmail.com");
			
			driver.findElement(By.id("u_0_v")).sendKeys("@India2018");
			
			
			WebElement ele = driver.findElement(By.id("day"));
			Select obj1 = new Select(ele);
			obj1.selectByIndex(2);
			
			WebElement ele1 = driver.findElement(By.id("month"));
			Select obj2 = new Select(ele1);
			obj2.selectByValue("12");
			
			WebElement ele2 = driver.findElement(By.id("year"));
			Select obj3 = new Select(ele2);
			obj3.selectByVisibleText("1988");
			
			driver.findElement(By.id("u_0_a")).click();
			
			driver.findElement(By.id("u_0_11")).click();
			
		//Thread.sleep(10000);
			driver.quit();
			
		
			
		

		}			

}
