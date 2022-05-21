package seleniumNotes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TOPIC07_MOUSEACTION {
	// TO PERFORM MOUSE ACTION WE HAVE TO USE Actions CLASS AND PASS PARAMETER AS DRIVER
		// Actions act= new Actions(driver)
		
		// 1>>  LEFT CLICK ACTION
		// WE HAVE TO USE moveToElement() AND PASS THE ARGUMENT AS WEBELEMENT THEN click()
		// IF WE ARE USING ONE METHOD THEN WE CAN DIIRECTLY USE perform()
		// IF WE ARE USING TWO OR MORE METHOD THEN WE HAVE TO USE build() THEN perform()
		
		// 2>>  RIGHT CLICK ACTION
		// FOR RIGHT CLICK WE HAVE TO USE contextClick()
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\AskWorkspace\\workspace1\\My_Selenium_Notes\\SoftFiles\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        WebElement login = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		Actions act= new Actions(driver);
		// TO PERFORM LEFT CLICK ACTION
		Thread.sleep(2000);
		act.moveToElement(login).click().build().perform();
		act.moveToElement(login).doubleClick(login).build().perform();
		act.dragAndDrop(login, login);
		
		// TO PERFORM RIGT CLICK ACTION
		WebElement more = driver.findElement(By.xpath("//div[@class='exehdJ']"));
		act.contextClick().perform();
		
		// TO PERFORM DOUBLE CLICK ACTION
//		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\AskWorkspace\\workspace1\\My_Selenium_Notes\\SoftFiles\\chromedriver.exe");
//		WebDriver driver= new ChromeDriver();
//		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
//		driver.manage().window().maximize();
//		Actions act= new Actions(driver);
//		WebElement button = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
//		act.moveToElement(button).doubleClick().build().perform();
		
		//driver.close();
		
		
		
	}

}
