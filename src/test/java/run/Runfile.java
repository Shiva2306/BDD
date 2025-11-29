package run;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		  features = {"C:\\Users\\shiva\\Documents\\workspace-spring-tool-suite-4-4.22.1.RELEASE\\Penta\\pen\\2_log.feature",
				  "C:\\Users\\shiva\\Documents\\workspace-spring-tool-suite-4-4.22.1.RELEASE\\Penta\\pen\\1_reg.feature",
				  "C:\\Users\\shiva\\Documents\\workspace-spring-tool-suite-4-4.22.1.RELEASE\\Penta\\pen\\3_sear.feature"},
		  glue = {"stepDefinitionpenta"},
		  dryRun = false,
		  monochrome = true,
		  plugin = {
		      "pretty",
		      "html:reports/cucumber-html-report.html",
		      "json:reports/cucumber.json",
		      "junit:reports/cucumber.xml"
		  }
		)
		public class Runfile extends AbstractTestNGCucumberTests {
		}
