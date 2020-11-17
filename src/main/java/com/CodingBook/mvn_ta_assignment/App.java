package com.CodingBook.mvn_ta_assignment;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println( "Hello World!" );
        
        System.setProperty("webdriver.chromedriver", "webdriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
		Thread.sleep(1000); 
        
//        WebElement element = driver.findElement(By.xpath("//input[@name=\"q\"]"));	//--> By.xpath
		WebElement element = driver.findElement(By.cssSelector("input[name=\"q\"]"));	//--> By.cssSelector
        element.sendKeys("CodingBook");
		Thread.sleep(1000); 
		element.submit();
		Thread.sleep(1000); 

		
		WebElement cbLink = driver.findElement(By.xpath("(//div[@class='g']//a)[1]"));
//		WebElement cbLink = driver.findElement(By.cssSelector("div[class='g']//a[1]"));

		cbLink.click();		
		Thread.sleep(1000); 
		
		ArrayList<String> locators = new ArrayList<String>();
		locators.add("//li[@id=\"menu-item-6539\"]/a");		//Courses
		locators.add("//li[@id=\"menu-item-6538\"]/a");		//TestAutomation
		locators.add("//a[@data-tab=\"#tab-curriculum\"]");	//Curriculum
		locators.add("//span[contains(text(), \"Basic Test Automation – Assignments\")]");
		locators.add("//a[contains(text(), 'youtube')]");	//Youtube link
		
//		for(String locator : locators) {
//			WebElement element1 = driver.findElement(By.xpath(locator));
//			element1.click();
//			Thread.sleep(1000);	
//		}
		
		locators.forEach((locator)->System.out.println(locator));

		
    }
}
