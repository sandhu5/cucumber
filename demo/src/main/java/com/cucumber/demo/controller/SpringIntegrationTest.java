package com.cucumber.demo.controller;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.springframework.web.client.RestTemplate;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:build/cucumber-html", "json:build/report.json"}, features = {"classpath:features"})

public abstract class SpringIntegrationTest {

    protected RestTemplate restTemplate = new RestTemplate();

    protected final String DEFAULT_URL = "http://localhost:8080/";

    
    public static void main(String[] args) {
        JUnitCore.main(SpringIntegrationTest.class.getName());
      }

}
