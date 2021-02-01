package org.step;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.base.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.test.LoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends LibGlobal{
	
	                            @Given("Validating the login fuctionality.")
	                            public void validating_the_login_fuctionality() {
	                               getChromeBrowser();
	                               getUrl("https://www.liidaveqa.com/");
	                            }

	                           @When("User Enters the valid username and valid password.")
	                            public void user_Enters_the_valid_username_and_valid_password(io.cucumber.datatable.DataTable dataTable) {
	                                 List<Map<String, String>> asMaps = dataTable.asMaps();
	                                 LoginPojo loginPojo=new LoginPojo();
	                                 javaClick(loginPojo.getBtnLogin());       
	                               sendkey(loginPojo.getBtnUserName(),asMaps.get(0).get("username"));
	                                 sendkey(loginPojo.getBtnPassword(), asMaps.get(0).get("password"));
	                               
	                            }
	                            @Then("User clicks the login button.")
	                            public void user_clicks_the_login_button() throws IOException {
	                            	
	                               driver.quit();
	                            }




}
