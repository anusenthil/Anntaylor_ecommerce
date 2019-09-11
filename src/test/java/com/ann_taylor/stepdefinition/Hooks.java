package com.ann_taylor.stepdefinition;

import java.util.concurrent.TimeUnit;

import com.ann_taylor.resources.BaseClass;

import cucumber.api.java.Before;

public class Hooks  extends BaseClass{
	 
	@Before
	public void browserLaunch(){
		System.out.println("Hooks class called");

		getDriver("https://www.anntaylor.com");
		
		//loadUrl("https://www.anntaylor.com");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		
	}
	
	

}
