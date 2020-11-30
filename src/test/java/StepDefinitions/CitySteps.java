package StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CityPage;

public class CitySteps {
    CityPage city=new CityPage();
    @Given("^User navigate to city page$")
    public void userNavigateToCityPage() {

        city.getPage();
    }



    @Then("^User delete the city \"([^\"]*)\"$")
    public void userDeleteTheCity(String cityName)  {
        city.delete(cityName);

    }


    @When("^User select index of (\\d+) and create a new city name as \"([^\"]*)\"$")
    public void userSelectIndexOfAndCreateANewCityNameAs(int index, String cityName) {
        city.add(index, cityName);
    }

    @When("^User select name of country \"([^\"]*)\" and create a new city name as \"([^\"]*)\"$")
    public void userSelectNameOfCountryAndCreateANewCityNameAs(String contryName, String cityName)  {
       city.add(contryName,cityName);

           }


}
