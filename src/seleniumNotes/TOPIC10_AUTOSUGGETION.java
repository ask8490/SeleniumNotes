package seleniumNotes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TOPIC10_AUTOSUGGETION {
	// used where we find "ul" & "li" tag-names in XML file 
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "E:\\Testing\\AskWorkspace\\workspace1\\My_Selenium_Notes\\SoftFiles\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    
//    Example of handling cities on bookmyshow webpage
    driver.get("https://in.bookmyshow.com/");
   
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click(); //clicking on "Not Now" of the notification
    List<WebElement> cityList = driver.findElements(By.xpath("//ul[@class='sc-FQuPU eCIDPD']/li")); //getting list of cities in the form of set of List of Webelements
       for (WebElement city: cityList) { //printing list of city using for each loop
       	System.out.println(city.getText());
       }
    String myCity = "Chandigarh"; //I want to click on this city
    for (WebElement city : cityList) {
		String cityText = city.getText();
		//System.out.println(cityText);
    	if (cityText.equals(myCity)) {
			city.click();
		}
//    	else {
//    		System.out.println("something is wrong");
//    	}
	}
}
}
