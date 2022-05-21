package seleniumNotes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TOPIC05_LISTBOX {
	// HOW TO HAANDLE LIST BOX (DEFAULT)
		// WHILE HANDLING THE DEFAULT LIST BOX WHICH IS DEFINED BY SELECT TAG NAME
		// WE NEED TO USE SELECT CLASS
		// FIRST WE HAVE TO LOCATE THE LIST BOX WEB ELEMENT 
		// AND THEN NEED TO CREATE SELECT CLASS OBJECT AND PASS THE PARAMETER AS WEBELEMMENT OF LIST BOX THAT WE HAVE LOCATED
			
		// DIFFRENT METHOD TO SELECT LIST ELEMENT IN DROP DOWN
		// 1--selectByVisibleText("STRING");>>> STRING=CONTENT OF VISISIBLE TEXT
		// 2--selectByIndex(INT);>>> INT= INDEX VALUE
		// 3--selectByValue("STRING");>>> STRING=VALUE 
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\AskWorkspace\\workspace1\\My_Selenium_Notes\\SoftFiles\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
//	    Example of entering a date of birth on Facebook's create account page 
	    driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();  //clicking "create new account" button.
		Thread.sleep(1000);
//		Entering Date of Birth from drop down list by using Select class
		//Day value
		WebElement dayList = driver.findElement(By.xpath("//select[@id='day']")); //fetching day dropdown list into a webelement variable
		Select sDay = new Select(dayList); //feeding webelement to Select class object
		sDay.selectByIndex(7); //selecting value by its Index. index starts with 0.
		
		//Month value
		WebElement monthList = driver.findElement(By.xpath("//select[@id='month']")); //fetching month dropdown list into a webelement variable
		Select sMonth = new Select(monthList); //feeding webelement to Select class object
		sMonth.selectByVisibleText("Apr"); //Selecting value by visible text. we cal also provide part of the text
		
		//Year value
		WebElement yearList = driver.findElement(By.xpath("//select[@id='year']")); //fetching year dropdown list into a webelement variable
		Select sYear = new Select(yearList); ////feeding webelement to Select class object
		sYear.selectByValue("1990"); //Selecting value by providing value in string format
	}

}
