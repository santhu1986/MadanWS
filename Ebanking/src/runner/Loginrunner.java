package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"E:\\MadanProject\\Ebanking\\src\\feature\\Login.feature",
                           "E:\\MadanProject\\Ebanking\\src\\feature\\Role.feature"},
                  glue="stepdefination",monochrome=true,
                    plugin= {"pretty","json:Target/reports/Role.json"})
public class Loginrunner 
{

}
