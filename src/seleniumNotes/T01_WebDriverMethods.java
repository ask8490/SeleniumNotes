package seleniumNotes;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* WebDriver is an interface used to perform actions on the browser.
 * Chrome/FireFox/Edge browser refers to webdriver while creating the object 
 */
public class T01_WebDriverMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\AskWorkspace\\workspace1\\My_Selenium_Notes\\SoftFiles\\chromedriver.exe"); //for setting path of chromedriver.exe file
		WebDriver driver = new ChromeDriver(); //creating object of chromedriver. this will launch the browser
		
		// Methods of Webdriver
		//1. get(): this method is used to open a specific url in the browser.
		
		driver.get("https://www.google.com/");
		System.out.println("Google Loaded");
		//2. navigate(): with this method we can open url, move to another url within same window, go back to previous url, go to forward url, and refresh the page.
		//we do not use this in regular coding because this method does not wait for all the web elements to load. also the entire process happens in the same window.
		
		driver.navigate().to("https://www.facebook.com/"); //this will not open a new window
		System.out.println("Facebook Loaded");
		driver.navigate().back(); //this will take us back to google.com
		System.out.println("Back to Google");
		driver.navigate().forward();//this will bring us back to facebook.com
		System.out.println("Forward to Facebook");
		driver.navigate().refresh(); // this will refresh the page
		System.out.println("Facebook Page Refreshed");
		
		//3. getTitle(): This method will return title of the webpage in the String format
		
		String webPageTitle = driver.getTitle(); //web page title fetched in string variable
		System.out.println(webPageTitle); //web page title printed on console
		
		//4. getCurrentUrl(): this will return url of the current browser in String format
		
		String currerntUrl = driver.getCurrentUrl(); //web page url fetched in string variable
		System.out.println(currerntUrl); //web page url printed on console
		
		//5. getWindowHandle(): This method will fetch handle of the current browser window. return type of this method is String
		
		String webPageHandle = driver.getWindowHandle(); //web page handle fetched in string variable
		System.out.println(webPageHandle); //web page handle printed on console
		
		//6. getWindowHandles(): this method fetches handles of all the browser windows opened simultaneously. these handles will be stored in set of String
		
		
		Set<String> wndwHandles = driver.getWindowHandles(); //all opened web page handles fetched in set of string variable. set will not allow any duplicate value hence stored in set.
		
		// To further operate on any of the window opened we need to feed the set of string to ArrayList. ArrayList is more preferable because we can fetch ArrayList elements with index.
		
		ArrayList<String> webHandles = new ArrayList<String>(wndwHandles); //created ArrayList Object and fed Set String to it.
		
		System.out.println(webHandles);
		 
	}

}
