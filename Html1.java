package week4;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Html1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		//1.Load the url
		driver.get("https://html.com/tags/table/");
		//2.Get the Table count 
int size=driver.findElements(By.xpath("//table")).size();
System.out.println("Number of tables in the HTML page is :" +size);
		//count number of columns
	List<WebElement> column = driver.findElements(By.xpath("//table/thead/tr/th"));
	int columnCount =column.size();
	System.out.println("Number of columns in the Table 1 is: "+columnCount);
		//count number of rows in Table 1 is
		
		List<WebElement> rows = driver.findElements(By.xpath("(//table)[1]//tr"));
		int rowcount=rows.size();
	System.out.println("Number of rows in the Table 1 is: "+rowcount);
     Thread.sleep(4000);
		//count number of rows in Table 2 is
		List<WebElement> rows1 = driver.findElements(By.xpath("(//table)[2]//tr"));
		int rowcount1=rows1.size();
		System.out.println("Number of rows in the Table 2 is: "+rowcount1);
		//print respective value
	System.out.println(rows.get(1).getText());
	System.out.println(rows.get(2).getText());
		
	}

}
