package com.ann_taylor.stepdefinition;

import org.openqa.selenium.interactions.Actions;

import com.ann_taylor.object_repository.Checkout_page;
import com.ann_taylor.object_repository.Prod_Select_page;
import com.ann_taylor.object_repository.homePage;
import com.ann_taylor.resources.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class E_Commerce extends BaseClass {

	@Given("user search the product")
	public void user_search_the_product() {
		// po.getCon_Shop().click();
		System.out.println("loading search product");
		homePage hmpage = new homePage(driver);
		Actions act = new Actions(driver);
		act.moveToElement(hmpage.getmenu()).perform();
		hmpage.getTops_blouses().click();

	}

	
	@When("select the product and Add to bag")
	public void select_the_product_and_Add_to_bag() {
		System.out.println("loading add to bag");
		Prod_Select_page psPage = new Prod_Select_page();
		psPage.getSelect_product().click();
		psPage.getSize().click();
		psPage.getAdd_to_bag().click();
	}

	@When("Checkout the product and proceed")
	public void checkout_the_product_and_proceed() {
		Checkout_page chkpage = new Checkout_page();
		Actions act = new Actions(driver);
		act.moveToElement(chkpage.getMy_bag()).perform();
		chkpage.getCheckout().click();
		chkpage.getProceed_checkout().click();

		}

	@When("give the valid delivery details and continue")
	public void give_the_valid_delivery_details_and_continue() {
	}

	@Then("order will placed and quit")
	public void order_will_placed_and_quit() {
	}

}
