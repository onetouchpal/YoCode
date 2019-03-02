package Projectselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptexecutor0108 {
	
	public static void main(String[] args) {
		
		
System.setProperty("webdriver.gecko.driver", "Driver/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
	
		driver.manage().window().maximize();
		
		driver.get("http://amazon.com.au");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement ele = driver.findElement(By.xpath("//div[contains(text(),'Make Money with Us')]"));
	
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
		
		//js.executeScript("window.scrollBy(500,0)", "");
		
		WebElement ele2 = driver.findElement(By.linkText("Sell on Amazon"));
		js.executeScript("arguments[0].click()", ele2);
				
		
		
		
		
		
		
	}	
	

}
