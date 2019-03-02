package Projectselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewClass2407 {
	public static void main(String[] args) throws InterruptedException {
		
    System.setProperty("webdriver.gecko.driver", "Driver/geckodriver.exe");
		
	WebDriver driver = new FirefoxDriver();
	
	driver.manage().window().maximize();
	driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html?org/openqa/selenium/WebElement.html");
	
	driver.switchTo().frame("packageListFrame");
	driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();

	driver.switchTo().defaultContent();
	Thread.sleep(500);
	driver.switchTo().frame("packageFrame");
	driver.findElement(By.xpath("//span[text()='WebDriver']")).click();
	
	driver.switchTo().defaultContent();
	Thread.sleep(500);
	driver.switchTo().frame("classFrame");
	
	String title = driver.findElement(By.xpath("//h2[@class='title']")).getText();
	System.out.println(title);
	}
}



