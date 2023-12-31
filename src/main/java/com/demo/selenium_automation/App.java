package com.demo.selenium_automation;

import java.time.Duration;
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
    	
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    	
    	
    	
    	//open the url in the browser
    	driver.get("https://www.facebook.com/");
    	
    	System.out.println("Url Opened");
    	
    	
    	//pass xyz as an email id
    	driver.findElement(By.id("email")).sendKeys("xyz");
    	
    	System.out.println("email id updated");
    	
    	//sleep times to check the flow
    	//Thread.sleep(1000);
    	
    	//pass abc as password
    	driver.findElement(By.id("pass")).sendKeys("abc");
    	System.out.println("password updated");
    	
    	//Thread.sleep(1000);
    	      	   	
    	
    	driver.findElement(By.name("login")).click();
    	System.out.println("button clicked");
    	//Thread.sleep(10000);
    	
    	driver.quit();
    	
    	
    	System.out.println("Test Done");
    	
    	
    	
    	
    	
    	
    	
    }
}
