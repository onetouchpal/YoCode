package Projectselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewAlert2107 {

public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "Driver/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
	
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");
		
		Alert a = driver.switchTo().alert();
		a.accept();
		a.dismiss();
		a.sendKeys("hello");
		a.getText();
		
		
		
		
		
		
		
}
}
