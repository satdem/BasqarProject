package StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SalaryTypesPage;

public class SalaryTypesSteps {
    SalaryTypesPage stp=new SalaryTypesPage();
    @Given("^User navigate to salary types page$")
    public void userNavigateToSalaryTypesPage() {
        stp.getPage();
    }

    @When("^User create a new salary type name as \"([^\"]*)\" and user type as \"([^\"]*)\"$")
    public void userCreateANewSalaryTypeNameAsAndUserTypeAs(String salaryName, String userType)  {
       stp.add(salaryName,userType);
    }

    @When("^User update the salary name \"([^\"]*)\" to as \"([^\"]*)\" user type as \"([^\"]*)\"$")
    public void userUpdateTheSalaryNameToAsUserTypeAs(String oldSalaryName, String newSalaryName, String newUserType) {
        stp.update(oldSalaryName,newSalaryName,newUserType);

    }

    @Then("^User delete the salary type name as \"([^\"]*)\"$")
    public void userDeleteTheSalaryTypeNameAs(String salaryName)  {
       stp.delete(salaryName);
    }
}
