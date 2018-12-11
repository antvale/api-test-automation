package com.av.automation.api;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:src/test/results/"},
        glue = {"stepdefs"},
        features = {"src/test/resources/features"})
public class CucumberTests {}