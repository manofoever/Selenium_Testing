package com.demo.selenium_automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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
    public static void main( String[] args ) throws InterruptedException
    {
        // Initialize the driver property
    	
    	System.out.println("Test started");
    	
    	//System.setProperty("webdriver.chrome.driver","C:\\Users\\Manoj Shanmugham\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    	
    	//setup chrome parameters
    	
    	WebDriverManager.chromedriver().setup();
    	
    	
    	ChromeOptions chromeOptions = new ChromeOptions();
    	chromeOptions.addArguments("--headless");
    	
    	//Initialize the driver
    	
    	WebDriver driver = new ChromeDriver(chromeOptions);
    	
    	//Invoke wait to load the application
    	
    	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
    	
    	
    	
    	//open the url in the browser
    	driver.get("https://www.facebook.com/");
    	
    	
    	//pass xyz as an email id
    	driver.findElement(By.id("email")).sendKeys("xyz");
    	
    	//sleep times to check the flow
    	//Thread.sleep(1000);
    	
    	//pass abc as password
    	driver.findElement(By.id("pass")).sendKeys("abc");
    	
    	
    	//Thread.sleep(1000);
    	      	   	
    	
    	driver.findElement(By.name("login")).click();
    	
    	//Thread.sleep(10000);
    	
    	driver.close();
    	
    	
    	System.out.println("Test Done");
    	
    	
    	
    	
    	
    	
    	
    }
}
