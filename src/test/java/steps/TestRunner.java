package steps;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 


@CucumberOptions(features= {"src/test/resources/features"},
                 glue={"steps"},
                 monochrome=true,
tags= {"@major"},
plugin = { "pretty", "html:target/HtmlReports","json:target/JsonReports/cucumber.json","junit:target/Reports/cucumber.xml"})
public class TestRunner {

}
