package seleniumNotes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TOPIC04_IFRAME {
	// WHAT IS iFrame
		// iFrame IN SELENIUM WEBDRIVER IS WEB PAGE WHICH IS EMBEDDED IN ANOTHER WEB PAAGE
		// THE iFrame IS OFTEN USED TO ADD CONTENT FROM OTHER SOURCE LIKE AN ADEVERTISEMENT
		// INTO A WEB PAGE
		// THE IFRAME DEFINED WITH THE <iFrame>tag
		
		// HOW TO HANDLE iFrame
		// TO HANDLE iFrame FIRST WE NEED TO CHANGE FOCUS FROM MAIN PAGE TO iFrame 
		// BY USING SYNTAX
		// driver.switchto.frame();
		
		// DIFFRENT WAY TO SWITCH FROM MAIN PAGE TO iFrame
		
		// 1-- FRAME ID-- ARG(STRING)
		// 2-- FRAME NAME-- ARG(STRING)
		// 3-- FRAME WEBELEMENT-- ARG(WEBELEMENT)
		// 4-- FRAME INDEX-- ARG(INT)
		
		//SWITCH TO MMAIN PAGE FROM PARRENT FRAME
		// WHEN WE SWITCH FOCUS FROM MAIN PAGE TO FRAME AND IF WANT TO PERFORM SOME ACTION ON 
		// MAIN PAGE THEN WE NEED TO SWITCH OUR FOCUS FROM FRAME TO MAIN PAGE
		
		//  DIFFRENT WAY TO SWITCH FROM iFrame TO MAIN PAGE
		// 1--parentFrame();-- NO ARG >>THIS METHOD WILL SWITCH TO IMEADIATE PARENT FRAME(IN CASE OF NESTED FRAME MEANS FRAME INSIDE FRAME)
		// 2-- defaultContent();-- NO ARG >> THIS METHOD WILL SWITCH TO MAIN PAGE DIRECTLY

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\AskWorkspace\\workspace1\\My_Selenium_Notes\\SoftFiles\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.manage().window().maximize();
		
		       
		      // @ @ @ TO SWITCH FROM MAIN PAGE TO IFRAME @ @ @
		
		// 1-- SWITCH TO FRAME BY USING ID
//		 driver.switchTo().frame("iframeResult");// id
//		 driver.findElement(By.xpath("//button[@type='button']")).click();
		
		// 2-- SWITCH TO FRAME BY USING NAME
//		 driver.switchTo().frame("iframeResult");// name
//		 driver.findElement(By.xpath("//button[@type='button']")).click();
	       
		// 3-- SWITCH TO FRAME BY USING WEBELEMENT
		
//		 WebElement ele = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
//		 driver.switchTo().frame(ele);
//		 driver.findElement(By.xpath("//button[@type='button']")).click();
//		 					
		 
		// 4-- SWITCH TO FRAME BY USING INDEX
//		 driver.switchTo().frame(0);
//		 driver.findElement(By.xpath("//button[@type='button']")).click();
		
		 // @ @ @ TO SWWITCH FROM IFRAME TO MAIN PAGE @ @ @
		 
		 // 1--parentFrame();
//		 driver.switchTo().frame("iframeResult");
//	     driver.findElement(By.xpath("//button[@type='button']")).click();
//	     driver.switchTo().parentFrame();
//	     driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		
		 // 2-- defaultContent();
//	     driver.switchTo().frame("iframeResult");
//	     driver.findElement(By.xpath("//button[@type='button']")).click();
//	     driver.switchTo().defaultContent();
//	     driver.findElement(By.xpath("//a[@id='tryhome']")).click();
	}
}
