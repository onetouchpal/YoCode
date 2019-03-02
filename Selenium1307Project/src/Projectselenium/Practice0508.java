package Projectselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice0508 {
  
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		
		WebDriver alpha = new ChromeDriver();
	
		alpha.manage().window().maximize();
		
		alpha.get("https://en.wikipedia.org/wiki/Wiki");
		
JavascriptExecutor js = (JavascriptExecutor)alpha;
		
		WebElement ele = alpha.findElement(By.xpath("//a[@title='Cornell Law School']"));
	
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
		
		Actions act = new Actions(alpha);
		act.moveToElement(alpha.findElement(By.xpath("//a[@title='Cornell Law School']"))).perform();
		Thread.sleep(100);
		act.click(alpha.findElement(By.xpath("//a[@class='mwe-popups-settings-icon']"))).build().perform();
		
		act.moveToElement(alpha.findElement(By.xpath("//a[@class='mwe-popups-settings-icon']"))).click().perform();
		
		
		

	}

}
