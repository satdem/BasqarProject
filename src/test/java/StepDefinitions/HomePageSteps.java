package StepDefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

import pages.HomePage;

public class HomePageSteps {

    HomePage hp = new HomePage();

    @Given("^User on home page$")
    public void UserOnHomePage() {
        hp.getHomePage();
        hp.prepareLogin();
    }

    @And("^User login in to basqar$")
    public void UserLoginInToBasqar() {

        hp.login();
    }


}
