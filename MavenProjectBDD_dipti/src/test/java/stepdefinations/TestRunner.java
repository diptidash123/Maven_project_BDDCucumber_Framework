package stepdefinations;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(features= "D:\\Eclipse Folder\\MavenProjectBDD_dipti\\src\\test\\resources\\Features",
glue ={"stepdefinations"},
monochrome = true,
plugin = {"pretty",
		"html:target/cucumber.html",
		"json:target/cucumber.json",
        "junit:target/cucumber.xml"})
       
public class TestRunner {
	}