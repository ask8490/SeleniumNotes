package seleniumNotes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TOPIC01_WEBDRIVER {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\AskWorkspace\\workspace1\\My_Selenium_Notes\\SoftFiles\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
//		driver.get();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		//Thread.sleep(2000);
		// no of row
		List<WebElement> t = driver.findElements(By.xpath("//body/table/tbody/tr"));
		int row = t.size();
		System.out.println(t.size());
		
		// no of col
		int col = driver.findElements(By.xpath("//body/table/tbody/tr/th")).size();
		System.out.println(col);
		
		// text
		String text = driver.findElement(By.xpath("//body/table/tbody/tr[4]/td[3]")).getText();
		System.out.println(text);
		//findElement(By.xpath("//body/table/tbody/tr["+i+"]/td[2]"));
		String exp= "  SUMIT  ";
		
		for (int i = 2; i <=row; i++) 
		{
			String act = driver.findElement(By.xpath("//body/table/tbody/tr["+i+"]/td[2]")).getText();
			if(exp.trim().equalsIgnoreCase(act))
			{
				System.out.println("text fount");
			}
		}
		
		
		
		
		
	}


}
