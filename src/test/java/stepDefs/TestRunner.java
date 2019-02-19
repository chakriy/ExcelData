package stepDefs;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by balajakka on 27/01/2019.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features ="./src/test/Features",
        glue={"stepDefs"},
        format = {"pretty", "html:target/destination" +
                ""}
)
public class TestRunner {
}
