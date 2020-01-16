package com.qa.gmail.Gmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class GmailImplementation {

	WebDriver driver;
	
	
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arunsinghchauhan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("chrome is launched and maximize");
	}
	
	public void enterUrl()
	{
		driver.get("https://mail.google.com");
		System.out.println("Respective URL is launched");
		
	}
	
	
	
}
