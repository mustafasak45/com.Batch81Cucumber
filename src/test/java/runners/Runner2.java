package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features",
        glue = "stepDefinetions",
        tags = "@grup1 or @grup2",
        dryRun = false
)
public class Runner2 {

}
