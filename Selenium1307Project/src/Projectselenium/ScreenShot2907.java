package Projectselenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShot2907 {

public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "Driver/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
	
		driver.manage().window().maximize();
		
		driver.get("http://amazon.com.au");
		
TakesScreenshot ts = (TakesScreenshot)driver;
		
		File temp = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(temp.getAbsolutePath());
		File scnshot = new File("screenshots/MyScnShot.jpg");
		
			try {
				FileUtils.copyFile(temp, scnshot);
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		

}
}