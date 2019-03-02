package Projectselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits2707 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		
		
		//driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		WebDriverWait alpha = new WebDriverWait(driver, 20); 
		
		Actions act = new Actions(driver);
		
		alpha.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Electronics']")));
		
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Electronics']"))).perform();
		
		alpha.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='container']/div/header/div[3]/ul/li[1]/ul/li/ul/li[1]/ul/li[3]/a")));
		
		act.moveToElement(driver.findElement(By.xpath("//*[@id='container']/div/header/div[3]/ul/li[1]/ul/li/ul/li[1]/ul/li[3]/a"))).click().perform();
		
		
		//EXPLICIT WAIT
		/*alertIsPresent()
		elementSelectionStateToBe()
		elementToBeClickable()
		elementToBeSelected()
		frameToBeAvaliableAndSwitchToIt()
		invisibilityOfTheElementLocated()
		invisibilityOfElementWithText()
		presenceOfAllElementsLocatedBy()
		presenceOfElementLocated()
		textToBePresentInElement()
		textToBePresentInElementLocated()
		textToBePresentInElementValue()
		titleIs()
		titleContains()
		visibilityOf()
		visibilityOfAllElements()
		visibilityOfAllElementsLocatedBy()
		visibilityOfElementLocated()*/
		
	}

}
