package Projectselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2307 {
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		
		WebDriver alpha = new ChromeDriver();
	
		alpha.manage().window().maximize();
		
		alpha.get("https://www.creditsafe.com/gb/en.html");
		alpha.findElement(By.xpath("//span[@class='cta2']")).click();
		alpha.findElement(By.xpath("//input[@name='Username']")).sendKeys("ChayGB");
		alpha.findElement(By.xpath("//input[@name='Password']")).sendKeys("Skua@1234");
		alpha.findElement(By.xpath("//button[@class='btn btn-lg btn-primary btn-block']")).click();
	 alpha.findElement(By.id("ctl00_tbCompanyName")).sendKeys("tesco");
	 alpha.findElement(By.id("ctl00_btnQuickSearch")).click(); 
	 alpha.findElement(By.xpath("//table[contains(@id,'dgCompanySearchResults')]//tr[2]/td[1]/a[contains(@id,'dgCompanySearchResults')]")).click();
	 
	 
		
		/*alpha.findElement(By.xpath("//span[@class='cta2']")).click();
		
		alpha.findElement(By.xpath("//input[@name='Username']")).sendKeys("ArunGB");
		alpha.findElement(By.xpath("//input[@name='Password']")).sendKeys("111cf97a");
		alpha.findElement(By.xpath("//button[@class='btn btn-lg btn-primary btn-block']")).click();
		
		
		List<WebElement> x = alpha.findElements(By.tagName("iframe"));
		System.out.println("The total number of iframes are " + x.size());
*/
		/*alpha.findElement(By.xpath("//a[@id='visiter-type-consumer']")).click();
		
		WebElement beta = alpha.findElement(By.id("paypalAccountData_countryselector"));
		Select gamma = new Select(beta);
		gamma.selectByVisibleText("India");
		
		alpha.findElement(By.id("email")).sendKeys("sherifzener1988@gmail.com");
		
		alpha.findElement(By.id("password")).sendKeys("@India2018");
		alpha.findElement(By.id("confirmPassword")).sendKeys("@India2018");
		alpha.findElement(By.id("_eventId_personal")).click();
		alpha.findElement(By.id("termsAgreeLabel")).click();
		
		List<WebElement> y = alpha.findElements(By.tagName("iframe"));
		System.out.println("The total number of iframes are " + y.size());
	
		//Thread.sleep(1000);
		
		//alpha.quit();
*/	}

	
	
}
