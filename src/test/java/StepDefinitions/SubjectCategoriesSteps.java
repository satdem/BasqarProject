package StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageModels.NotificationResults;
import pages.SubjectCategoriesPage;

public class SubjectCategoriesSteps {

    SubjectCategoriesPage sp=new SubjectCategoriesPage();
    @Given("^User navigate to SubjectCategories page$")
    public void userNavigateToSubjectCategoriesPage() {
        sp.getPage();

    }

    @Then("^User delete the SubjectCategories \"([^\"]*)\"$")
    public void userDeleteTheSubjectCategories(String name) {
        sp.delete(name);

    }

    @When("^User create a new SubjectCategories as \"([^\"]*)\" and code as \"([^\"]*)\"$")
    public void userCreateANewSubjectCategoriesAsAndCodeAs(String subjectCategoriesname, String subjectCategoriescode) {

        sp.add(subjectCategoriesname,subjectCategoriescode);
    }
    @And("^Error message should be displayed$")
    public void errorMessageShouldBeDisplayed() {
        sp.justifyNotificationAs(NotificationResults.Error);

    }
}
