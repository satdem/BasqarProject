package StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageModels.NavBarObjects;
import pageModels.NotificationResults;
import pages.HomePage;
import pages.PositionSalaryPage;

public class PositionSalarySteps {

    PositionSalaryPage ps=new PositionSalaryPage();
    @When("^Navigate to position salary$")
    public void navigateToPositionSalary() {
        ps.getPage();

    }

    @Then("^Create a persen in position salary name  as \"([^\"]*)\"$")
    public void createAPersenInPositionSalaryNameAs(String positionName)  {

        ps.add(positionName);
    }

    @And("^Success message should be displayed$")
    public void successMessageShouldBeDisplayed() {
        ps.justifyNotificationAs(NotificationResults.Created);

    }

    @And("^Delete a position salary name as \"([^\"]*)\"$")
    public void deleteAPositionSalaryNameAs(String positionName) {
       ps.delete(positionName);
    }


    @And("^Update the person in position salary name \"([^\"]*)\" to \"([^\"]*)\"$")
    public void updateThePersonInPositionSalaryNameTo(String oldName, String newName)  {
        ps.update(oldName,newName);
    }
   /* @When("^user edit the person in position salary named \"([^\"]*)\"$")
    public void userEditThePositionSalaryNamed(String name)  {
        ps.editTheTableData(name);
    }*/


    @And("^User edit the positon salary \"([^\"]*)\" to \"([^\"]*)\"$")
    public void userEditThePositonSalaryTo(String oldName, String name){
        ps.editTheTableData(name);

    }

}
