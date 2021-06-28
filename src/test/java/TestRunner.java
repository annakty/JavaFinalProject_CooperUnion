import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        //This creates cucumber reports
        plugin = {"pretty", "html:Reports/Default/"},
        // Path to the feature files
        features = {"src/main/resources"},
        // Specify the step definition package name
        glue = {"SD", "Generic"},
        // Specify what tags should run
        tags = {"@FirstFeature"}
)
public class TestRunner {
}