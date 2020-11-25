package com.CodingBook.mvn_ta_assignment;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void gotoGoogle() throws InterruptedException {
    	System.setProperty("webdriver.chromedriver", "webdriver/chromedriver");
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://www.google.com");
    	System.out.print("Test");
    	
    	WebElement element = driver.findElement(By.xpath("//input[@name=\"q\"]"));
    	element.sendKeys("CodingBook");
		Thread.sleep(1000); 
		element.submit();
    }
}
