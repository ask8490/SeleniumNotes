package seleniumNotes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TOPIC13_DYANAMICELEMENT {
	// TO LOCATE WEB ELEMENT WHOSE VALUE IS CHANGED FREQUENTLY LIKE RATING OR REVIEW THAT IS DYANAMIC ELEMENT
	// FOR THAT WE HAVE TO FIND DYANAMIC XPATH
	// SO WE NEED TO TAKE XPATH FROM PARRENT TO CHILD
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\AskWorkspace\\workspace1\\My_Selenium_Notes\\SoftFiles\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmi 8");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		String rating = driver.findElement(By.xpath("(//div[@class='col col-7-12']//span/span//span[1])[1]")).getText();
		System.out.println(rating);
	
		
	}

}
