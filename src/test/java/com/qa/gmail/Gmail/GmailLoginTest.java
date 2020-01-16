package com.qa.gmail.Gmail;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class GmailLoginTest {

	GmailImplementation g= new GmailImplementation();
	
	@BeforeTest
	public void launch_Browser()
	{
	   g.launchBrowser();
	}
	
	@Test
	public void enter_Url()
	{
		g.enterUrl();
		/*
		 * String aTitle="Gmail"; String eTitle="";
		 */
		
		//Assert.assertEquals(eTitle, aTitle);
		
	}
	
	
	
	
	
	
}
