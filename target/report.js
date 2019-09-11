$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/try.feature");
formatter.feature({
  "name": "Search new Arrivals and select perticular cloth and add to cart",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Selected items should be add in cart",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user search the product",
  "keyword": "Given "
});
formatter.match({
  "location": "E_Commerce.user_search_the_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select the product and Add to bag",
  "keyword": "When "
});
formatter.match({
  "location": "E_Commerce.select_the_product_and_Add_to_bag()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Checkout the product and proceed",
  "keyword": "And "
});
formatter.match({
  "location": "E_Commerce.checkout_the_product_and_proceed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "give the valid delivery details and continue",
  "keyword": "And "
});
formatter.match({
  "location": "E_Commerce.give_the_valid_delivery_details_and_continue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "order will placed and quit",
  "keyword": "Then "
});
formatter.match({
  "location": "E_Commerce.order_will_placed_and_quit()"
});
formatter.result({
  "status": "passed"
});
});