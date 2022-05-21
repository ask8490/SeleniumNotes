package seleniumNotes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TOPIC12_SCROLLUPDOWN {
	// 1-- TO SCROLL UP AND DOWN WE HAVE TO TYPE CAST driver INTO (JavascriptExecutor)driver
		// THEN CALL A METHOD executeScript("window.scrollBy(0,-1500)")>> fix argument
		// X>> REPRESENT VETICAL AXIS, Y>> REPRESENT HORIZONTAL AXIS
		// POSSITIVE VALUE OF Y WILL SCROLL DOWN VETICALLY WHILE NEGATIVE VALUE OF Y WILL SCROLL UP VERTICALLY
		// POSSITIVE VALUE OF X WILL SCROLL RIGHT HORIZONTALY WHILE NEGATIVE VALUE OF X WILL SCROLL LEFT HORIZONTALY
		
		//2-- TO SCROLL DOWN TO THE WEB ELEMENT WE HAVE TO TYPE CAST driver INTO (JavascriptExecutor)driver
		// THEN CALL A METHOD executeScript("arguments[0].scrollIntoView(true)",WebElement)>> fix argument
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\AskWorkspace\\workspace1\\My_Selenium_Notes\\SoftFiles\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	    JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//SCROLL DOWN
		js.executeScript("window.scrollBy(0,1200)");
		Thread.sleep(2000);
		//SCROLL UP
		js.executeScript("window.scrollBy(0,-500)");
		//SCROLL RIGHT
		js.executeScript("window.scrollBy(500,0)");
		//SCROLL LEFT
		((JavascriptExecutor)driver).executeScript("window.scrollBy(-500,0)");
		
		//SCROLL UPTTO WEBELEMENT
		WebElement aboutus = driver.findElement(By.xpath("(//a[@class='_1arVWX'])[2]"));
		js.executeScript("arguments[0].scrollIntoView(true)",aboutus);
//		Thread.sleep(2000);
//		aboutus.click();
		
	}

}
