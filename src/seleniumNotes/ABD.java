package seleniumNotes;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class ABD {

	public static void main(String[] args) throws IOException
	{
//		// SCREENSHOT
//		WebDriver driver= new ChromeDriver();
//		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File dest= new File("path");
//		FileHandler.copy(source, dest);
//		
//		//list box
//		  WebElement ele = driver.findElement(By.xpath(""));
//		Select sct= new Select(ele);// child list
//		sct.selectByValue("");
//		sct.selectByIndex(7);
//		sct.selectByValue("");
//		
//		//action class
//		Actions act= new Actions(driver);// Baap scope
//		act.click(ele);
//		act.moveToElement(ele).click().build().perform();
//		act.dragAndDrop(ele, ele);
//		act.moveToElement(ele).clickAndHold().moveToElement(ele).release().build().perform();
//		act.sendKeys(Keys.ARROW_UP);
//		
//		//iframe
//		driver.switchTo().frame(4);//4 ways id- string,name- string,index-int,webelement
//		driver.switchTo().parentFrame();//0 immediate parrent frame switch
//		driver.switchTo().defaultContent();//0 supermost parent frame that main page switch
//		
//		//pop up
//		 driver.switchTo().alert().dismiss();//0
//	
//		
//		//child browser
//		driver.switchTo().window("");//1 string- id
//		String s = driver.getWindowHandle();// current paage kaa id
//		Set<String> l = driver.getWindowHandles();// parent child browser ki id
//		 //set>>duplicate not allow,insertion order  not maintain,  index not used
//		// list>> duplicate allowed,insertion order maintain, index can be use
//		
//		ArrayList<String> a= new ArrayList<String>(l);
//		 String t = a.get(1);
//		driver.switchTo().window(t);
//		
		// get exxcel
		FileInputStream file= new FileInputStream("C:\\Users\\Admin\\Desktop\\SAMADHAN\\PRACTICE PROGRAM\\SELENIUM_SYLABUS\\test data\\sam.xlsx");
		Sheet one = WorkbookFactory.create(file).getSheet("Sheet1");
		String r= "samadhan";
	    boolean s = one.getRow(0).getCell(0).getStringCellValue().equals(r);
		
		System.out.println(s);
		
		
		
		

	}

}
