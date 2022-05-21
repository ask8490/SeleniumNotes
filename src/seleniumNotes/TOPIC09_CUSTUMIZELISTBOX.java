package seleniumNotes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TOPIC09_CUSTUMIZELISTBOX {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\AskWorkspace\\workspace1\\My_Selenium_Notes\\SoftFiles\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(5000);
		// APPROPCH 1>> USING Actions CLASS sendKeys(Keys method)
//		 WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
//		 Actions act= new Actions(driver);
//		 //act.moveToElement(month).click().build().perform();
//		 act.click(month).perform();
//		 
//		 act.sendKeys(Keys.ARROW_UP).perform();
//		 Thread.sleep(500);
//		 act.sendKeys(Keys.ARROW_UP).perform();
//		 Thread.sleep(500);
//		 act.sendKeys(Keys.ENTER).perform();
		 
		 // APPROPCH 2>> USING Actions CLASS sendKeys(Keys method) AND FOR LOOP
//		 WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
//		 Actions act= new Actions(driver);
//		 act.click(month).perform();
//		 for (int i = 1; i < 13; i++) 
//		 {
//			 act.sendKeys(Keys.ARROW_UP).perform();
//			 Thread.sleep(500);
//			
//		 }
//		 for (int i = 1; i < 12; i++) 
//		 {
//			 act.sendKeys(Keys.ARROW_DOWN).perform();
//			 Thread.sleep(500);
//			
//		 }
//		 act.sendKeys(Keys.ENTER).perform();
//		 
		 // APPROPCH 2>> USING SELENIUM DIRECTLY
		 WebElement month = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		 month.sendKeys("20");
		 Thread.sleep(500);
		 month.click();
		 Thread.sleep(500);
		 month.click();
	}

}
