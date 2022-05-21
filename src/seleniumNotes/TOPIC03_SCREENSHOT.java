package seleniumNotes;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class TOPIC03_SCREENSHOT {

	// HOW TO TAKE SCREENSHOT IN SELENIUM???
	// STEP(1)--TO TAKE SCREENSHOT IN SELENIUM WEBDRIVER WE NEED TO TYPE CAST DRIVER OBJECT
	// INTO TakeScreenShot INTERFACE
	
	// STEP(2)--THEN WE NEED TO CALL THE FUNCTION getScreenShotas() , HERE WE NEED TO PASS 
	// THE ARGUMENT "OutputType.file"
	// THIS METHOD WILL RETURN OBJECT OF TYPE FILE
	// File source=((TakeScreenShot)driver).getScreenShotas(OutputType.file);
	// WHEN THIS STATMENT WILL EXECUTE IT WILL TAKE THE SCREENSHOT BUT SCREENSHOT WILL BE 
	// AVAAILABLE INSIDE TEMP MEMORY
	
	// STEP(3)-- TO SET OUR OWN PATH WE NEED TO USE FILE CLASS AND CREAT OBJECT as DESTINATION FOLDER OF FILE CLASS
	// File destination= new File("PATH OF DESTINATION FOLDER");
	
	// STEP(4)-- TO MOVE SCREENSHOT IN LOCAL DRIVE
	// WE HAVE TO USED FileHandler CLASS AND WE NEED TO USE COPY FUNCTION
	// IT WILL TAKE TWO PARAMETER FileHandler.COPY(source, destination)
	// THEN OUR SCREENSHOT WILL MOVE TO OUR DESIRE LOCATION
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\AskWorkspace\\workspace1\\My_Selenium_Notes\\SoftFiles\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//providing path of screenshot folder
		// Giving name "ask" to screenshot file  
		File destination = new File("E:\\Testing\\AskWorkspace\\workspace1\\My_Selenium_Notes\\Screenshot\\ask.jpg");
		FileHandler.copy(source, destination);
		
		
//		Giving random name to screenshot file
		String fileName = RandomString.make(3); //creating random string of length 3 for the name of screenshot file.
		File destinationRandom = new File("E:\\Testing\\AskWorkspace\\workspace1\\My_Selenium_Notes\\Screenshot\\"+fileName+".jpg");//providing path of screenshot folder
		FileHandler.copy(source, destinationRandom);
		
//		Giving current "date and time" name to the screenshot file
		Date d = new Date(); // import Date class from Java Utility
		String timestamp = d.toString().replace(" ", "_").replace(":", "."); 
		/*original time stamp has spaces and colon which is not good for a file name.
		hence using replace method from String Class to replace spaces & colons with underscore 		and dots*/
		File DestimationTimestamp = new File("E:\\Testing\\AskWorkspace\\workspace1\\My_Selenium_Notes\\Screenshot\\"+timestamp+".jpg");
		FileHandler.copy(source, DestimationTimestamp);
		
		//One can use for loops for providing numeric file names to screenshot files, in case of multiple screenshots to be taken
	}

}
