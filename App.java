package org.test.insureme;

import java.io.File;
import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException, IOException
    {
    	
    System.out.println("Script Started");	
       //initializing the web driver
   // System.setProperty("webdriver.chrome.driver", "/Users/shubham/Documents/softwares/chrome-driver/chromedriver");
    WebDriverManager.chromedriver().setup();
    //setting properties
    ChromeOptions chromeOptions = new ChromeOptions();
    //chromeOptions.addArguments("--headless");
    // open url
    System.out.println("Driver opening up the url in browser");	
    WebDriver driver = new ChromeDriver(chromeOptions);
    driver.get("http://13.233.146.111:8081/contact.html");	
    
    //invole implicit waits to load the page
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    
    System.out.println("Enter details in the form");
    //enter details
 
    //input name
    
    driver.findElement(By.id("inputName")).sendKeys("revanthkumar");
    Thread.sleep(500);
    
    driver.findElement(By.id("inputNumber")).sendKeys("9897969594");
    Thread.sleep(500);
    driver.findElement(By.id("inputMail")).sendKeys("revanth@123.gmail.com");
    Thread.sleep(500);
    driver.findElement(By.id("inputMessage")).sendKeys("i am intersted");
    Thread.sleep(500);
    driver.findElement(By.id("my-button")).click();
    
    String response = driver.findElement(By.id("response")).getText();
    
    System.out.println(response);
    
    System.out.println("rest scripts executed");
    
    TakesScreenshot scrShot = ((TakesScreenshot)driver);
    
    File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
    File destFile = new File("/home/ubuntu/revanth/test.jpg");
    FileUtils.copyFile(srcFile, destFile);
    Thread.sleep(1000);
    
    System.out.println("Saving details");
    Thread.sleep(2000);
    
    System.out.println("Test Case execution completed");
    Thread.sleep(2000);
    driver.quit();
    
    
    
    
    
    
    
    
    //submit form
    	
    //validate results
    	
    //take and store screenshots.
    	
    	
    	
    	
    	
    	
    	
        System.out.println( "Hello World!" );
    }

	private static File newFile(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
