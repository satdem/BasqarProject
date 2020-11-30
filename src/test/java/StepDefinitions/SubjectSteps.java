package StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SubjectPage;

public class SubjectSteps {
    SubjectPage subjectPage = new SubjectPage();
    @Given("^User navigate to Subjects page$")
    public void userNavigateToSubjectsPage() {
        subjectPage.getPage();

    }

    @When("^User create a new Subjects name as \"([^\"]*)\" and code as \"([^\"]*)\" subject catagory index (\\d+) and style index (\\d+)$")
    public void userCreateANewSubjectsNameAsAndCodeAsSubjectCatagoryIndexAndStyleIndex(String subjectName, String code, int subjectCatagory, int style) {

        subjectPage.add(subjectName,code,subjectCatagory,style);
    }

    @Then("^User delete the subject \"([^\"]*)\"$")
    public void userDeleteTheSubject(String subjectName) {
       subjectPage.delete(subjectName);
    }

    @Then("^User create a new Subjects name as \"([^\"]*)\" and code as \"([^\"]*)\" subject catagory name \"([^\"]*)\" and style index (\\d+)$")
    public void userCreateANewSubjectsNameAsAndCodeAsSubjectCatagoryNameAndStyleIndex(String subjectName, String code, String subjectCatagory, int style)  {
        subjectPage.add(subjectName,code,subjectCatagory,style);

    }
}
