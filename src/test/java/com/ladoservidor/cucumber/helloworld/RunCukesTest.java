package com.ladoservidor.cucumber.helloworld;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(
  format = {
    "pretty",
    "html:target/cucumber-html-report",
    "json-pretty:target/cucumber-json-report.json",
    "json:target/cucumber-pt.json"
  }
)
public class RunCukesTest {
}
