package runner;

import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;

@CucumberOptions(
		features="src/main/java/features",
		glue="steps",
		monochrome=true,
		publish=true
		
		)
public class CucumberRunner extends BaseClass{

}
