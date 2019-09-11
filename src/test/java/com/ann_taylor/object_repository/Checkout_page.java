package com.ann_taylor.object_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ann_taylor.resources.BaseClass;

public class Checkout_page extends BaseClass{
	public Checkout_page() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="my-bag-icon")
	private WebElement my_bag;
	
	@FindBy(xpath="//a[text()='Checkout']")
	private WebElement checkout;
	
	@FindBy(id="checkout-proceed")
	private WebElement proceed_checkout;
	
	public WebElement getProceed_checkout() {
		return proceed_checkout;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getMy_bag() {
		return my_bag;
	}



}
