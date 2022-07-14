package week4;

import java.time.Duration;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://leaftaps.com/opentaps/control/login");	   
		// * 2. Enter UserName and Password Using Id Locator
		WebElement username= driver.findElement(By.id("username"));
		username.sendKeys("Demosalesmanager");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		// * 3. Click on Login Button using Class Locator
		WebElement login=driver.findElement(By.className("decorativeSubmit"));
		login.click();
		// * 4. Click on CRM/SFA Link
		WebElement crmsfa=driver.findElement(By.className("crmsfa"));
		crmsfa.click();
		// * 5. Click on contacts Button
		WebElement contacts=driver.findElement(By.xpath("//a[text( )='Contacts']"));
		 contacts.click();
		// * 6. Click on Merge Contacts using Xpath Locator
		 WebElement MergeContacts=driver.findElement(By.xpath("//a[text( )='Merge Contacts']"));
		 MergeContacts.click();
		// * 7. Click on Widget of From Contact
		 driver.findElement(By.xpath("//img[@alt=\"Lookup\"][1]")).click();
	Set<String>Window= driver.getWindowHandles();	
	List<String>WindowList=new ArrayList<>(Window);
	driver.switchTo().window(WindowList.get(1));
		// * 8. Click on First Resulting Contact
		
	driver.findElement(By.xpath("//a[text()='DemoCustomer']")).click();
		 
// * 9. Click on Widget of To Contact
 driver.switchTo().window(WindowList.get(0));
	
		 
		// * 10. Click on Second Resulting Contact
	driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	Set<String>Window1= driver.getWindowHandles();	
	List<String>WindowList1=new ArrayList<>(Window1);
	driver.switchTo().window(WindowList1.get(1));
		 driver.findElement(By.xpath("//a[text()='dp1a1contact2']")).click();
		 driver.switchTo().window(WindowList1.get(0));
		  
		// * 11. Click on Merge button using Xpath Locator
		 driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		  
		// * 12. Accept the Alert
		 driver.switchTo().alert().accept();
		 
		// * 13. Verify the title of the page
		 String Title=driver.getTitle();
		 System.out.println("The title of the page is"+Title);
	}

}
