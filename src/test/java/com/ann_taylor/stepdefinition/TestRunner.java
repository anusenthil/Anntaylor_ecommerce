package com.ann_taylor.stepdefinition;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature",glue="com.ann_taylor.stepdefinition",  plugin= {"html:target",
	"rerun:src/test/resources/Feature/failed.txt"})

public class TestRunner{
	
}
