package seleniumNotes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TOPIC18_SYNCHRONIZATION {
	// SYNCHRONIZTION-- MATCHING OF SPEED OF WEB BROWSER WITH TEST SCRIPT SPEED IS SYNCHRONIZTION
		// WE CAN ACHIEVE SYNCHRONIZTION BY USING WAIT
		// THREE TYPES OF WAIT
		// 1-- IMPLICIT WAIT
		// 2-- EXPLICIT WAIT
		// 3-- FLUENT WAIT
		
		// 1--IMPLICIT WAIT(WAITING TIME ONLY)
		// IT IS USED WHEN WE EXCTLY HOW MUCH TIME IS TAKEN BY THE BROWSER TO LOAD THE WEB PAGE
		// IT IS USED TO INSTRUCT THE WEB DRIVER TO WAIT FOR CERTAIN TIME BEFORE THROWING AN EXCEPTION
		// driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		// IT IS APPLICABLE TO WHOLE WEB PAAGE
		
		// 2-- EXPLICIT WAIT(WAITING TIME + CONDITION)
		// EXPLICIT WAIT IS USED WHEN WE DONT KNOW EXCTLY HOW MUCH TIME WILL BE TAKEN BY BROWSER TO LOAD 
		// THE ELEMENT PRESENT ON THE WEB PAGE
		// IN EXPLICIT WAIT WE INSTRUCT WEB DRIVER TOWAIT FOR CERTAIN CONDITION OR GIVEN MAX TIME
		// BEFORE SHOWING THE EXCEPTION
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\AskWorkspace\\workspace1\\My_Selenium_Notes\\SoftFiles\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	//	1--IMPLICIT WAIT
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	
	}

}
