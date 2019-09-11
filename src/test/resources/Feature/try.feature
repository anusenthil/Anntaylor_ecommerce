
@tag
Feature: Search new Arrivals and select perticular cloth and add to cart
  I want to use this template for my feature file
 
  @tag1
  Scenario: Selected items should be add in cart
  Given user search the product
  When select the product and Add to bag
  And Checkout the product and proceed
  And give the valid delivery details and continue 
  Then order will placed and quit