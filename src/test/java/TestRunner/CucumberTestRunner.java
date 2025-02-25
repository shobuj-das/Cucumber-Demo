package TestRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/Features",
        glue = "StepDefinitions",
        plugin = {
                "pretty",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm", // Allure Report Plugin
                "timeline:test-output-thread/"
        },
        monochrome = true
)
public class CucumberTestRunner extends AbstractTestNGCucumberTests {
}
