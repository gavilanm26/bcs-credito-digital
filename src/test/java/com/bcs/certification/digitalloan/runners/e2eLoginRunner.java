package com.bcs.certification.digitalloan.runners;

import com.bcs.certification.digitalloan.utils.customrunner.customRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.junit.runner.RunWith;

@RunWith(customRunner.class)
@CucumberOptions(
        features = {"src/test/resources/features/e2e-login.feature"},
        glue = {"com.bcs.certification.digitalloan.stepdefinitions"},
        monochrome = true, snippets = SnippetType.CAMELCASE,
        tags = "@SuccessLogin"
)
public class e2eLoginRunner {
}
