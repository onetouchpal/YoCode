package Projectselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop2807 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "Driver/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
	
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		WebElement source = driver.findElement(By.xpath("//*[@id='credit2']/a"));
		
		WebElement target = driver.findElement(By.xpath("//*[@id='bank']/li"));
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(source, target).build().perform();
		
		

}
}