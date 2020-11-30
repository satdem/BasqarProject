package runners;


import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.*;
import utilities.Driver;

@CucumberOptions(
        tags = {"@RegressionTest"},
        features = {"C:\\BasqarProject\\src\\test\\java\\features"},
        glue = {"StepDefinitions"},
        dryRun = false,
        plugin = {
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ParallelScenarios.html"
        }
)
public class ParallelTest extends AbstractTestNGCucumberTests {

    @BeforeTest
    @Parameters("browser")
    public static void beforeClass(String browser){
        Driver.browsers.set(browser);
    }
    @AfterClass
    public static void afterClass()
    {
        Reporter.loadXMLConfig("src/test/java/XMLFiles/extendReportSet.xml");
        Reporter.setSystemInfo("User Name", "İsmet Temur");
        Reporter.setSystemInfo("Application Name", "Basqar");
        Reporter.setSystemInfo("Operating System Info", System.getProperty("os.name"));
        Reporter.setSystemInfo("Department", "QA");
        Reporter.setTestRunnerOutput("Test excetuion Cucumber report");
    }
    @AfterTest
    public void tearDown(){
        Driver.quitDriver();
    }

}