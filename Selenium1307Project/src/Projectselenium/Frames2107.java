package Projectselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames2107 {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver", "Driver/geckodriver.exe");
	
	WebDriver driver = new FirefoxDriver();

	driver.manage().window().maximize();
	driver.get("https://www.hdfcbank.com/");
	
	List<WebElement> alpha = driver.findElements(By.tagName("iframe"));
	System.out.println("The total number of iframes are " + alpha.size());
	
	for(WebElement el:alpha) {
	System.out.println("the name of frame is" + el.getAttribute("id"));
	}//name of frames
	
	driver.switchTo().frame(1);
	driver.switchTo().frame("packageListFrame");
	
}
}

