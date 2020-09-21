package runners;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "features", //to tell cucumber where is ur feature file
		
		glue= "stepDefinitions", // to tell cucumber where is ur stepdef code

		//tags="",  // to tell which tagged feature file to execute
		
	    plugin = {"pretty", // to generate reports
			      "html:target/html/",
			      "json:target/json/file.json",
			      },
	   // strict = false,
	    //publish=true,
	    
	    dryRun= false// to tell whether to test run(true) or actual run(false)
		)

public class TestRunner1 {

}
