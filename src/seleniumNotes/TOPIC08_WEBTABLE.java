package seleniumNotes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TOPIC08_WEBTABLE {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\SAMADHAN\\PRACTICE PROGRAM\\SELENIUM_SYLABUS\\softFile\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("file:///C:/Users/Admin/Desktop/SAMADHAN/webtable2.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// size of row
		 int r = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr")).size();
        System.out.println("total no of row :"+r);
        // size of column
        int c = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr[2]/td")).size();
        System.out.println("total no of column :"+c);
        // get text of element present in taable
        String actual = driver.findElement(By.xpath("//table[@id='1234']/tbody/tr[4]/td[2]")).getText();
        System.out.println(actual);
        // to check whether the text is present in table or not(static table)
        String expected=" samadhan";
       String user = expected.trim();
        if(actual.equalsIgnoreCase(user))
        {
        	System.out.println("given text "+expected+" is found");
        }
        else
        {
        	System.out.println("given text "+expected+" is not found");
        }
      // to check whether the text is present in table or not(dyanamic table)
        String actual1="SAMAADHAN";
        int row = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr")).size();
        for(int i=2;i<=row;i++)
        {
        int column = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr["+i+"]/td")).size();
        	 for(int j=1;j<=column;j++)
        	 {
        		 String expected1 = driver.findElement(By.xpath("//table[@id='1234']/tbody/tr["+i+"]/td["+j+"]")).getText();
        		 if(actual1.equals(expected1))
        	        {
        	        	System.out.println("given text "+expected1+" is found");
        	        }
        	        
        	 }
        	
        	
        }
        // get all text from table
//        String al="";
//        int row1 = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr")).size();
//        for(int i=2;i<=row1;i++)
//        {
//        	 int column1 = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr["+i+"]/td")).size();
//        	 for(int j=1;j<=column1;j++)
//        	 {
//        		 all = driver.findElement(By.xpath("//table[@id='1234']/tbody/tr["+i+"]/td["+j+"]")).getText();
//        		 System.out.print(al);
//        	 }
//        	System.out.println();
//        	
		
	}

}
