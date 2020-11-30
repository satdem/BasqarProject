package runners;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import utilities.Driver;

@CucumberOptions(
        //tags = {"@RegressionTest"},
        features = {"src/test/java/features"},
        glue = {"StepDefinitions"},
        dryRun = false,

        plugin = {
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html"

        }
)

public class RunnerTest extends AbstractTestNGCucumberTests{



    @AfterClass
    public static void afterClass(){
        Reporter.loadXMLConfig("src/test/java/XMLFiles/extendReportSet.xml");
        Reporter.setSystemInfo("User Name","Sati Demirci");
        Reporter.setSystemInfo("Application Name","Basqar");
        Reporter.setSystemInfo("Operating System",System.getProperty("os.name"));
        Reporter.setSystemInfo("Department","QA");
        Reporter.setSystemInfo("Ek satır","Ek satır açıklama");
        Reporter.setTestRunnerOutput("Test excetuion Cucumber report");

    }
    @AfterTest
    public void tearDown(){
        Driver.quitDriver();
    }
}
