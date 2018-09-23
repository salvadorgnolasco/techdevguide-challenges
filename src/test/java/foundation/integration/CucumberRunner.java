package foundation.integration;

import org.junit.runner.RunWith;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@ExtendedCucumberOptions(
    jsonReport = "target/cucumber.json",
    jsonUsageReport = "target/cucumber-usage.json",
    usageReport = true,
    detailedReport = true,
    detailedAggregatedReport = true,
    overviewReport = true,
    overviewChartsReport = true,
    toPDF = true,
    pdfPageSize = "A4 Landscape",
    retryCount = 3,
    outputFolder = "target")
@CucumberOptions(
  features = "src/test/resources/features",
  glue = "foundation/integration/feature",
  plugin = {
    "html:target", 
    "json:target/cucumber.json",
    "pretty:target/cucumber-pretty.txt",
    "usage:target/cucumber-usage.json", 
    "junit:target/cucumber-results.xml" }  
 )
public class CucumberRunner {
  
}
