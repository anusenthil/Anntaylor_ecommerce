package com.ann_taylor.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
	public static WebDriver driver;
	
	//Browser Lunch
	public static  WebDriver getDriver(String url) {
		System.out.println("driver initialize");
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Day1\\Anntylor\\driver\\chromedriver1.exe");
	driver = new ChromeDriver();
	driver.get(url);
	
	return driver;
  }
	
	//Load the URL
	/*public static void loadUrl(String url) {
		System.out.println("loading url");
		driver.get(url);
		
	}*/
	//mouse hover Action
	/*public static  void mouseHover(WebElement menu) {
		Actions act =new Actions(driver);
		act.moveToElement(menu).perform();
		
		
	}
*/
	public static void quitBrowser() {
	driver.quit();
	}
	public  static void closeBrowser() { 
	driver.close();
  }
}
