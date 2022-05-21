package seleniumNotes;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TOPIC06_POPUP {
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\AskWorkspace\\workspace1\\My_Selenium_Notes\\SoftFiles\\chromedriver.exe");
	    WebDriver	 driver= new ChromeDriver();
	 // 1. HIDDEN DIVISION POP UP
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
//		
		// 2. ALERT POP UP
		// TO HANDLE ALLERT POP UP WE NEED TO SWITCH SELENIUM FOCUS FROM MAIN PAAGE TO ALERT POPUP
		//BY USING>> Alert alt= driver.switchTo().alert();
		//ALERT IS AAN INTERFAACE WHICH CONTAAIN STATIC METHOD LIKE
		//accept(): USE  TO CLICK ON OK BUTTON
		//dismiss(): USE CLICK CANCEL BUTTON
		//getText(): USE TO GET TEXT PRESENT IN AA WEB PAGE	
		
		// 1:ALERT BOX
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\SAMADHAN\\PRACTICE PROGRAM\\seleniumDec21\\src\\softFiles\\chromedriver.exe" );
//		WebDriver driver1= new ChromeDriver();
//		driver1.get("https://chandanachaitanya.github.io/selenium-practice-site/");
//		driver1.manage().window().maximize();
//		Thread.sleep(3000);
//	    driver1.findElement(By.xpath("//button[@id='alertBox']")).click();
//		Alert alertbox = driver1.switchTo().alert();
//		String s = alertbox.getText();
		//alertbox.dismiss();
//		System.out.println(s);
//		Thread.sleep(2000);
	//	alertbox.accept();
		
		// 2:CONFIRM BOX
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\SAMADHAN\\PRACTICE PROGRAM\\seleniumDec21\\src\\softFiles\\chromedriver.exe" );
//		WebDriver driver2= new ChromeDriver();
//		driver2.get("https://chandanachaitanya.github.io/selenium-practice-site/");
//		driver2.manage().window().maximize();
//		Thread.sleep(3000);
//	    driver2.findElement(By.xpath("//button[@id='confirmBox']")).click();
//		Alert confirmbox = driver2.switchTo().alert();
//		String s = confirmbox.getText();
//		System.out.println(s);
//		Thread.sleep(2000);
//		confirmbox.accept();
//		//confirmbox.dismiss();
		
		// 3:PROMPT BOX
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\SAMADHAN\\PRACTICE PROGRAM\\seleniumDec21\\src\\softFiles\\chromedriver.exe" );
//		WebDriver driver3= new ChromeDriver();
//		driver3.get("https://chandanachaitanya.github.io/selenium-practice-site/");
//		driver3.manage().window().maximize();
//		Thread.sleep(3000);
//	    driver3.findElement(By.xpath("//button[@onclick='clickToPrompt()']")).click();
//		Alert promptbox = driver3.switchTo().alert();
//		String s = promptbox.getText();
//		System.out.println(s);
//		Thread.sleep(2000);
//		promptbox.sendKeys("samadhan");
//		//promptbox.accept();
//		promptbox.dismiss();
		
		//3. CHILD BROWSER POP UP(SMALL WINDOW)
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\SAMADHAN\\PRACTICE PROGRAM\\seleniumDec21\\src\\softFiles\\chromedriver.exe" );
//		WebDriver driver4= new ChromeDriver();
//     	driver4.get("https://chandanachaitanya.github.io/selenium-practice-site/");
//		driver4.manage().window().maximize();
//		Thread.sleep(3000);
//		driver4.findElement(By.xpath("//button[@id='win2']")).click();
//		// HOW TO GET MAIN PAGE ID
//		String mainpageid = driver4.getWindowHandle();
//		System.out.println(mainpageid);
//		// HOW TO GET CHILLD BROWSER ID
//	    Set<String> allbrowserid = driver4.getWindowHandles();
//	    System.out.println(allbrowserid);
//	    ArrayList<String> al= new ArrayList<String>(allbrowserid);
//	    System.out.println(al.get(0));
//	    System.out.println(al.get(1));
//	    driver4.switchTo().window(al.get(1));
//	    Thread.sleep(2000);
//	    driver4.manage().window().maximize();
//	   System.out.println( driver4.getWindowHandles());
	    // CHILD BROWSER POP UP(NEW BROWSER WINDOW)
	    System.setProperty("webdriver.chrome.driver","D:\\Testing\\AskWorkspace\\workspace1\\My_Selenium_Notes\\SoftFiles\\chromedriver.exe" );
		WebDriver driver5= new ChromeDriver();
     	driver5.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		driver5.manage().window().maximize();
		Thread.sleep(3000);
		driver5.findElement(By.xpath("//button[@id='win1']")).click();
		
		// HOW TO GET MAIN PAGE ID
		String mainpageid1 = driver5.getWindowHandle();
		System.out.println(mainpageid1);
		// HOW TO GET CHILLD BROWSER ID
	     Set<String> childbrowser = driver5.getWindowHandles();
	    System.out.println(childbrowser);
	    ArrayList<String> al1= new ArrayList<String>(childbrowser);
	    //System.out.println(al1.get(0));
	      String r = al1.get(1);
	    System.out.println(r);
	    driver5.switchTo().window(r);
	    Thread.sleep(2000);
	   // driver5.manage().window().maximize();
	    Thread.sleep(2000);
	    driver5.findElement(By.xpath("//a[@class='gb_A']")).click();
	}

}
