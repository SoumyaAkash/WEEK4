package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CherCher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
driver.switchTo().frame("frame1");
WebElement input = driver.findElement(By.xpath("//b [ text()=\"Topic :\"] //following :: input"));
input.sendKeys("This is a frame Test");
driver.switchTo().frame(0);
driver.findElement(By.id("a")).click();
driver.switchTo().defaultContent();
driver.switchTo().frame(1);
WebElement element=driver.findElement(By.id("animals"));
Select sel= new Select(element);
sel.selectByVisibleText("Big Baby Cat");


	}

}
