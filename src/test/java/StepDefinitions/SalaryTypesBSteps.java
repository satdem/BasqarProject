package StepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SalaryConstantsPage;

import java.util.Map;

public class SalaryTypesBSteps {
    SalaryConstantsPage scp=new SalaryConstantsPage();
    @Given("^User navigate to salary constans page$")
    public void userNavigateToSalaryConstansPage() {
        scp.getPage();

    }

    @When("^User create a new salary constans$")
    public void userCreateANewSalaryConstans(DataTable dataTable) {
        Map<String, String> map = dataTable.asMap(String.class, String.class);
        String name = map.get("name");
        String validFormDate = map.get("validFormDate");
        String key = map.get("key");
        int value = Integer.parseInt(map.get("value"));
        scp.add(name, validFormDate, key, value);

    }

    @When("^User update the salary constans name \"([^\"]*)\"$")
    public void userUpdateTheSalaryConstansName(String oldName,DataTable dataTable)  {
        scp.getPage();
        Map<String, String> map = dataTable.asMap(String.class, String.class);
        String name = map.get("name");
        String validFormDate = map.get("validFormDate");
        String key = map.get("key");
        int value = Integer.parseInt(map.get("value"));
        scp.update(oldName, name, validFormDate, key, value);
    }

    @Then("^User delete the salary constans name as \"([^\"]*)\"$")
    public void userDeleteTheSalaryConstansNameAs(String name) {
        scp.getPage();
        scp.delete(name);
    }
}
