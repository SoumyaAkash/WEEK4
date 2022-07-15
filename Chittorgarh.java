package Selenium;

import java.time.Duration;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chittorgarh {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
// 1. Launch the URL https://www.chittorgarh.com/
		driver.get("https://www.chittorgarh.com/");
//2. Click on stock market
	WebElement stockmarket=	driver.findElement(By.xpath("//a[@id='navbtn_stockmarket']"));
	stockmarket.click();
//3. Click on NSE bulk Deals
	WebElement Nsedeal=	driver.findElement(By.xpath("//a[text( )='NSE Bulk Deals']"));
	Nsedeal.click();	
//4. Get all the Security names with details
//	List<WebElement>securityNames=driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//tr"));
	
  //  System.out.println(securityNames.size());
//	for(WebElement Name : securityNames)
	{
//System.out.println(Name.getText());
	}
	
List<WebElement>securityNames=driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//tr[.]//td[3]"));
List<String> list3 =new ArrayList<String>();
	System.out.println(securityNames.size());
	for(WebElement Name: securityNames)
	{
		//securityNames.add(Name);
	String text = Name.getText();
		System.out.println(text);
		list3.add(text);
	}
	System.out.println(list3);
		
	
	//Thread.sleep(5000);
	//5. Ensure whether there are duplicate Security names
	 System.out.println("The security names without duplicate is :");
	LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(list3);
     for(String duplicates :linkedHashSet)
	{
		
	   System.out.println(duplicates);
}
	//if(set1.size()<securityNames.size())
	//{
	//System.out.println("There are duplicate secuirity names available");
//	}		
				
	//

	}
}


