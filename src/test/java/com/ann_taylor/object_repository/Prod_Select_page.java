package com.ann_taylor.object_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ann_taylor.resources.BaseClass;

public class Prod_Select_page extends BaseClass{
	public Prod_Select_page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//strong[text()=' Bow Neck Blouse '] ")
	private WebElement select_product;
	
	@FindBy(id="size-0-3")
	private WebElement size;
	
	@FindBy(id="pdp-add-to-bag")
	private WebElement add_to_bag;

	public WebElement getAdd_to_bag() {
		return add_to_bag;
	}

	public WebElement getSize() {
		return size;
	}

		public WebElement getSelect_product() {
		return select_product;
	}
	
	

}
