package runners;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.*;
import utilities.Driver;


@CucumberOptions(
        tags = {"@RegressionTest"},
        features = {"src/test/java/features"},
        glue = {"StepDefinitions"},
        plugin = {
                "com.cucumber.listener.ExtentCucumberFormatter:" +
                        "target/ExtentReport/RegressionTest.html"
        }
)

public class RegressionTest extends AbstractTestNGCucumberTests {

    @BeforeTest
    @Parameters("browser")
    public static void beforeClass(String browser){
        Driver.browsers.set(browser);
    }



    @AfterClass
    public static void afterClass() {

        Reporter.loadXMLConfig("src/test/java/XMLFiles/extentReportSet.xml");
        Reporter.setSystemInfo("User Name", "Grup-4");
        Reporter.setSystemInfo("Application Name", "Basqar");
        Reporter.setSystemInfo("Operating System Info", System.getProperty("os.name"));
        Reporter.setSystemInfo("Department", "QA-4");
        Reporter.setSystemInfo("Project Name", "Proficiency Project");
        Reporter.setSystemInfo("Test Modüle", "Test NG, Selenium");
        Reporter.setSystemInfo("Test Language", "Java, Cucumber");
    }

    @AfterTest
    public void tearDown(){
        Driver.quitDriver();
    }


}