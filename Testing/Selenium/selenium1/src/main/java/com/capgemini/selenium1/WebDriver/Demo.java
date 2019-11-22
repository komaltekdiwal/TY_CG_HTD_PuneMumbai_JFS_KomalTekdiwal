package com.capgemini.selenium1.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
static{
	System.setProperty("webdriver.chrome.driver", "/Selenium/selenium1/src/main/resources/chromedriver.exe");
}

public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.seleniumhq.org/");
	driver.manage().window().maximize();
	driver.navigate().to("https://www.google.com/");
	driver.navigate().back();
	String title=driver.getTitle();
	System.out.println(title);
	driver.close();
	
}
}
