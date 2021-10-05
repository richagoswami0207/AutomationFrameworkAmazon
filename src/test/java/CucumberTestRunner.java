import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "./src/Features"
            , tags= ("@CheckSubscribeAndSaveBanner")
            ,glue={"stepDefinition"}
            , plugin= {"pretty", "html:target/cucumber-reports.html",
            "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
    )

    public class CucumberTestRunner {

    }

