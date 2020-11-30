package StepDefinitions;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageModels.NotificationResults;
import pages.CountryPage;

public class CauntrySteps {
    CountryPage cp=new CountryPage();

    @When("^Create a country name as \"([^\"]*)\" and code as \"([^\"]*)\"$")
    public void createACountryNameAsAndCodeAs(String countryName, String CountryCode) {
        cp.add(countryName,CountryCode);
    }


  @Given("^Navigate to country$")
    public void navigateToCountry() {
        cp.getPage();
    }


    @And("^User edit the name \"([^\"]*)\" to \"([^\"]*)\" and add new code as \"([^\"]*)\"$")
    public void userEditTheNameToAndAddNewCodeAs(String oldCountryname, String newCountryname, String newCode) {
        cp.update(oldCountryname,newCountryname,newCode);

    }


    @Then("^Delete message should be displayed$")
    public void deleteMessageShouldBeDisplayed() {
        cp.justifyNotificationAs(NotificationResults.Deleted);

    }

    @Then("^Update message should be displayed$")
    public void updateMessageShouldBeDisplayed() {
        cp.justifyNotificationAs(NotificationResults.Updated);

    }

    @When("^User delete the country name is \"([^\"]*)\"$")
    public void userDeleteTheCountryNameIs(String countryName)  {
        cp.delete(countryName);
    }
}
