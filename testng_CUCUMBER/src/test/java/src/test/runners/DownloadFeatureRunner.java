package src.test.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
 
@CucumberOptions(features = "src/test/resources/features/Download.feature",
        glue = "glue",
        format = {"pretty"})
public class DownloadFeatureRunner extends AbstractTestNGCucumberTests {
}
