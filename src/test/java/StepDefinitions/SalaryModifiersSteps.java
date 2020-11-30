package StepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageModels.NotificationResults;
import pages.SalaryModifiersPage;

import java.util.Map;

public class SalaryModifiersSteps {
    SalaryModifiersPage smp=new SalaryModifiersPage();
    @Given("^User navigate to salary modifiers page$")
    public void userNavigateToSalaryModifiersPage() {
        smp.getPage();
    }

    @When("^User create a new salary modifiers$")
    public void userCreateANewSalaryModifiers(DataTable dataTable) {
        Map<String, String> map = dataTable.asMap(String.class, String.class);
        smp.add(map);
    }

    @Then("^User update the salary modifier name \"([^\"]*)\"$")
    public void userUpdateTheSalaryModifierName(String oldName,DataTable dataTable)  {

        Map<String, String> map = dataTable.asMap(String.class, String.class);
        smp.getPage();
        smp.update(oldName, map);
    }

    @Then("^user delete the salary modifier name \"([^\"]*)\"$")
    public void userDeleteTheSalaryModifierName(String name)  {
     smp.delete(name);
    }

    @And("^salary modifier schould be created$")
    public void salaryModifierSchouldBeCreated() {
        smp.notificationResult(NotificationResults.Created);

    }

}
