package com.ann_taylor.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ann_taylor.resources.BaseClass;

public class homePage {

	public homePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/*
	 * @FindBy(xpath="//button[text()='Continue Shopping']") private WebElement
	 * con_Shop;
	 * 
	 * 
	 * public WebElement getCon_Shop() { return con_Shop; }
	 */

	@FindBy(xpath = "//strong[text()='Clothing'] ")
	private WebElement menu;

	@FindBy(id="cata00002-1-cata000010")
	private WebElement tops_blouses;

	

	public WebElement getTops_blouses() {
		return tops_blouses;
	}



	public WebElement getmenu() {
		return menu;
	}

}
