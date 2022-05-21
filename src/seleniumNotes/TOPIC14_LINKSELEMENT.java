package seleniumNotes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TOPIC14_LINKSELEMENT {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\AskWorkspace\\workspace1\\My_Selenium_Notes\\SoftFiles\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
//	     driver.get("https://www.google.com/");
//	  		driver.manage().window().maximize();
//	  		Thread.sleep(2000);
//	  		// TO FIND HOW MANY LINK PRESENT ON WEB PAGE
//	  		 int size = driver.findElements(By.xpath("//a")).size();
//	  	    System.out.println("NO OF LINK PRESENT : "+size);
	  	    // TO GET ALL THE LINKS PRESENT ON WEB PAGE
//	  	   List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
//	  	   for (WebElement link : alllinks)
//	  	   {
//	  		   String text = link.getText();
//	  		   System.out.println(text);
//	  		
//	  	   }
	  	   // TO FIND HOW MANY ELEMENTS(RADIO BUTTON) PRESENT ON WEB PAGE
	  	   driver.get("https://www.ironspider.ca/forms/checkradio.htm");
	  	   driver.manage().window().maximize();
	  	   int size = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
	  	   System.out.println(size); 
//	  	   
//	  	   // HOW TO CLICK ALL THE CHECK BOX ONE BY ONE
	  	   List<WebElement> allcheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
	  	  for (WebElement checkbox : allcheckbox) {
	  		  checkbox.click();
	  		  Thread.sleep(500);
	  		
	  	}
	  	  
	    
	
	
	}
}

