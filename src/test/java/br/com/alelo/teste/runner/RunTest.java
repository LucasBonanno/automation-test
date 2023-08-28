package br.com.alelo.teste.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/test/resources/features/", 
		glue = "br.com.alelo.teste",
		tags = "@APIController",
		plugin = { "pretty", "html:target/evidences/report.html", "html:target/evidences/report.xml", "json:target/evidences/report.json" },
		monochrome = false, 
		snippets = SnippetType.CAMELCASE, 
		dryRun = false
		)
public class RunTest {

}
