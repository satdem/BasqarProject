package StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ExcelTemplatePage;

public class ExelTamplateSteps {
    ExcelTemplatePage etp=new ExcelTemplatePage();
    @Given("^User navigate to excel template page$")
    public void userNavigateToExcelTemplatePage() {
        etp.getPage();


    }

    @When("^User create a new budget template as \"([^\"]*)\" and code as \"([^\"]*)\"$")
    public void userCreateANewBudgetTemplateAsAndCodeAs(String name, int code){
        etp.add(name,code);

    }

    @Then("^Update the person in excel template name \"([^\"]*)\" to \"([^\"]*)\" and code as (\\d+)$")
    public void updateThePersonInExcelTemplateNameToAndCodeAs(String oldName, String newName, int code) {
       etp.update(oldName, newName, code);
    }

    @Then("^User delete the excel template  \"([^\"]*)\"$")
    public void userDeleteTheExcelTemplate(String excelTemplate) {
       etp.delete(excelTemplate);
    }
}
