package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;

public class stepDefinations {


@Given("^User is on Netbanking Landing Page$")
public void user_is_on_Netbanking_Landing_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   System.out.println("User lands on Login Page");
}

@When("^User Login into Apllication ith username \"([^\"]*)\" and password \"([^\"]*)\"$")
public void user_login_into_apllication_ith_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
   System.out.println(strArg1);
   System.out.println(strArg2);
}

@Then("^Home page is populated$")
public void home_page_is_populated() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   System.out.println("Home page is displayed");
}

@And("^Cards Displayed are \"([^\"]*)\"$")
public void cards_displayed_are_something(String strArg1) throws Throwable {
  System.out.println(strArg1);
}


}
