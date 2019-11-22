package com.capgemini.selenium1.WebDriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getwindowhandle {
static {
	System.setProperty("webdriver.chrome.driver", "/Selenium/selenium1/src/main/resources/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.com/");
	String wh=driver.getWindowHandle();
	System.out.println(wh);
	
	driver.get("https://www.youtube.com/");
	Set<String> whs=driver.getWindowHandles();
	System.out.println("number of windows:"+whs.size());
	System.out.println(whs);
	driver.quit();
}

}
