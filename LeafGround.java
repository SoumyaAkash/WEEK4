package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://www.leafground.com/pages/table.html");
		WebElement elementTable = driver.findElement(By.tagName("table"));
		// Getting the rows from the table
		java.util.List<WebElement> rows = elementTable.findElements(By.tagName("tr"));
		int rowcount=rows.size();
		System.out.println("Number of rows in the table is: "+rowcount);
		//Getting number of columns
		java.util.List<WebElement> columns = elementTable.findElements(By.tagName("th"));
		int columncount=columns.size();
		System.out.println("Number of colums in the table is: "+columncount);
		//Get the progress value of 'Learn to interact with Elements
String Value1=driver.findElement(By.xpath(("//table/tbody/tr[3]/td[2]"))).getText();
System.out.println("The progress value of learn to intract with the elements is  "+Value1);
String Value2=driver.findElement(By.xpath(("//table/tbody/tr[4]/td[2]"))).getText();
System.out.println("The progress value of learn to intract with the elements is  "+Value2);
String Value3=driver.findElement(By.xpath(("//table/tbody/tr[5]/td[2]"))).getText();
System.out.println("The progress value of learn to intract with the elements is  "+Value3);
		//Check the vital task for the least completed progress.
driver.findElement(By.xpath(("//table/tbody/tr[4]/td[3]"))).click();	
	}

}
