package seleniumNotes;

import java.time.Duration;
import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//**********What is Action Class Used for? *****************
/*  Many times in HTML DOM (Design Object Model) it becomes difficult to operate without mouse and keyboard.
 * Action class represents actions performed by Mouse and keyboard.
 * There are 4 actions we can perform using mouse
 * 1. Mouse Hover over webElements
 * 2. left click operation
 * 3. Right click operation
 * 4. Double click operation
 */



public class T07_ActionClass_Mouse_Keyboard {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Testing\\AskWorkspace\\workspace1\\My_Selenium_Notes\\SoftFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement loginPopup = driver.findElement(By.xpath("//button[text()='✕']"));
		loginPopup.click();
		
		Actions act = new Actions(driver); //created object of Actions class
		
//	1. Mouse hover over WebElements
	/* This is required when drop down list elements are only visible after mouse is hovered over the parent element. clicking is not required.
	* Once the mouse cursor is over the parent element, all child elements appears in GUI as well as HTML DOM
	* While doing this it is very difficult to find xpath of hidden dowpdown list.
	* to make it easy we need to lock the HTML DOM for a while till we get xpath of hidden elements.
	* this is done by going to "Sources" tab; bring mouse to the element who's xpath we need to capture, then press f8 on keyboard. This way DOM will be locked.
	* now fetch xpath of all hidden elements and use in selenium script.
	* By providing xpath of parent element and looping by foreach loop and hover over all the child elements.
	*/
		/*WebElement parentFashion = driver.findElement(By.xpath("(//div[@class='xtXmba'])[4]"));
		act.moveToElement(parentFashion).perform();
		Thread.sleep(2000);
		WebElement Child1_MensTopWaer = driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
		act.moveToElement(Child1_MensTopWaer).perform();
		Thread.sleep(2000);
		WebElement Child2_All = driver.findElement(By.xpath("//a[contains(text(),'All')]"));
		act.click(Child2_All).perform();
		Thread.sleep(2000);
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);*/
		List<WebElement> parentCategory = driver.findElements(By.xpath("//div[@class='_37M3Pb']//a"));
		for (WebElement parentList : parentCategory) {
			act.moveToElement(parentList).perform();
			List<WebElement> childCategory = driver.findElements(By.xpath("//div[@class='_3XS_gI _7qr1OC']//a"));
			for (WebElement childList : childCategory) {
				act.moveToElement(childList).perform();
				List<WebElement> subChildCategory = driver.findElements(By.xpath("//div[@class='_3XS_gI']//a"));
				for (WebElement subChildList : subChildCategory) {
					act.moveToElement(subChildList).perform();
					Thread.sleep(500);
				}
				Thread.sleep(500);
			}
			Thread.sleep(500);
		}
	}
}
