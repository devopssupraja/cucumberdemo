
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "html:Output/"               
        },        
         features = "Feature",
        glue = {"src/test/java/stepdefinitions"                
        },
        tags = {"@tag1"})

public class TestRunner {

}

