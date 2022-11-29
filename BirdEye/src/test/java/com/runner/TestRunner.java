package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.baseclass.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features", glue = "com.stepdefination", dryRun = false, tags = {
		"@BirdEyeLinks" }, plugin = { "pretty",
				"html:C:\\Users\\Santosh\\eclipse-workspace\\BirdEye\\src\\test\\resources\\Report" })
public class TestRunner extends BaseClass {

	@AfterClass
	public static void tearDown() {
		driver.quit();
	}
}
