package StepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.BudgetAccountsPage;

import java.util.Map;

public class BudgetAccountsSteps {
    BudgetAccountsPage bas=new BudgetAccountsPage();
    @Given("^User navigate to budget accounts page$")
    public void userNavigateToBudgetAccountsPage() {
        bas.getPage();

    }

    @When("^User cretae a budget account$")
    public void userCretaeABudgetAccount(DataTable dataTable) {
        Map<String, String> map = dataTable.asMap(String.class, String.class);
        bas.add(map);
    }

    @And("^User update the budget accounts \"([^\"]*)\"$")
    public void userUpdateTheBudgetAccounts(String oldName, DataTable dataTable)  {

    }

    @And("^User delete the budget accounts name \"([^\"]*)\" catagory (\\d+)$")
    public void userDeleteTheBudgetAccountsNameCatagory(String name, int catagory) {
       bas.delete(name,catagory);
    }
}
