package seleniumNotes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TOPIC02_WEBELEMENT {
	// METHOD OF WEB ELEMENT
	
		// 1-- isSelected();
		// THIS METHOD IS USED TO CHECK WHETHER WEB ELEMENT IS SELECTED OR NOT
		// IT IS USE FOR CHECK BOX AND RADIO BUTTON
		// RETUN TYPE IS BOOLEAN
		
		// 2--isDisplayed();
		// THIS METHOD USE TO CHECK WHETHER THE ELEMENT IS DISPLAY/VISIBLE ON WEBPAGE OR NOT
		// RETURN TYPE IS BOOLEAN
		
		// 3-- isEnabled();
		// THIS METHOD IS USED TO CHECK WHETHER THE WEB ELEMENT IS ENABLED/ ACTIVE ON WEBPAGE OR NOT
		// RETURN TYPE IS BOOLEAN
		
		// 4-- getText();
		// GET METHOD WILL EXTRACT ALL THE TEXT FROM ALL THE CHILD FROM THAT SELECTED WEB ELEMENT
		// RETURN TYPE IS STRING
		
		// 5-- getAttribute();
		//THIS METHOD GIVES ATTRIBUTE VALUE
		// RETURN TYPE IS STRING
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\SAMADHAN\\PRACTICE PROGRAM\\SELENIUM_SYLABUS\\softFile\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		driver.manage().window().maximize();
		
		
		// 1-- isSelected METHOD
//		WebElement checkbox = driver.findElement(By.xpath("//input[@value='red']"));
//		checkbox.click();
//		Thread.sleep(2000);
//		boolean k=checkbox.isSelected();
//		if(k)
		{
//			System.out.println("checkbox is already sected");
		}
//		else
		{
//			checkbox.click();
//			System.out.println("checkbox is selected now");
		}
		
		// 2 isDisplayed METHOD
//		WebElement text = driver.findElement(By.xpath("//h2[text()='Checkboxes']"));
//		if(text.isDisplayed())
//		{
//			System.out.println("text is displayed");
//		}
//		else
//		{
//		    System.out.println("text is not displayed");
//			
//		}
		
		// 3 isEnabled METHOD
		
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\SAMADHAN\\PRACTICE PROGRAM\\seleniumDec21\\src\\softFiles\\chromedriver.exe" );
//		WebDriver driver1= new ChromeDriver();// up casting 
//		driver1.get("https://www.makemytrip.com/flights/?cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|RSA|483490446458&s_kwcid=AL!1631!3!483490446458!e!!g!!makemytrip&ef_id=EAIaIQobChMI8O_ZjLzb9gIVRa2WCh3rFA8OEAAYASAAEgJ5fPD_BwE:G:s&gclid=EAIaIQobChMI8O_ZjLzb9gIVRa2WCh3rFA8OEAAYASAAEgJ5fPD_BwE");
//		driver1.manage().window().maximize();
//		WebElement element = driver1.findElement(By.xpath("//li[@data-cy='account']"));
//		
//		element.click();
//		Thread.sleep(2000);
//		element.click();
//		WebElement element1 = driver1.findElement(By.xpath("//button[@data-cy='continueBtn']"));
//		boolean s=element1.isEnabled();
//		System.out.println(s);//false
//		if(s)
//		{
//			System.out.println("button is enabled");
//		}
//		else
//		{
//			System.out.println("button is disabled");
//			 WebElement element2 = driver1.findElement(By.xpath("//input [@id='username']"));
//			 element2.sendKeys("9049956363");
//		}
//		System.out.println(element1.isEnabled());//true
//		
		// 4-- getText();
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\SAMADHAN\\PRACTICE PROGRAM\\seleniumDec21\\src\\softFiles\\chromedriver.exe" );
//		WebDriver driver2= new ChromeDriver();// up casting 
//		driver2.get("https://www.makemytrip.com/flights/?cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|RSA|483490446458&s_kwcid=AL!1631!3!483490446458!e!!g!!makemytrip&ef_id=EAIaIQobChMI8O_ZjLzb9gIVRa2WCh3rFA8OEAAYASAAEgJ5fPD_BwE:G:s&gclid=EAIaIQobChMI8O_ZjLzb9gIVRa2WCh3rFA8OEAAYASAAEgJ5fPD_BwE");
//		driver2.manage().window().maximize();
//		WebElement element2 = driver2.findElement(By.xpath("//li[@data-cy='account']"));
//		String text = element2.getText();
//		System.out.println(text);
//		
		// 5-- getAttribute();
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\SAMADHAN\\PRACTICE PROGRAM\\seleniumDec21\\src\\softFiles\\chromedriver.exe" );
//		WebDriver driver3= new ChromeDriver();// up casting 
//		driver3.get("https://www.makemytrip.com/flights/?cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|RSA|483490446458&s_kwcid=AL!1631!3!483490446458!e!!g!!makemytrip&ef_id=EAIaIQobChMI8O_ZjLzb9gIVRa2WCh3rFA8OEAAYASAAEgJ5fPD_BwE:G:s&gclid=EAIaIQobChMI8O_ZjLzb9gIVRa2WCh3rFA8OEAAYASAAEgJ5fPD_BwE");
//		driver3.manage().window().maximize();
//		WebElement element3 = driver3.findElement(By.xpath("//li[@data-cy='account']"));
//		String text = element3.getAttribute("class");
//		System.out.println(text);
//		
	
		
		
		
		
		
		
		
		
		
		
	}

}
