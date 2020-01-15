package com.cucumber.demo.controller;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"html:build/cucumber-html", "json:build/report.json"}, features = "src/main/resources"
)
public class MainTest {
}
