package com.bcs.certification.digitalloan.runners;
import com.bcs.certification.digitalloan.utils.customrunner.customRunner;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@SuppressWarnings("NewClassNamingConvention")
@RunWith(customRunner.class)
@CucumberOptions(
        features = {"src/test/resources/features/e2e-login.feature"},
        glue = {"com.bcs.certification.digitalloan.stepdefinitions"},
        monochrome = true, snippets =CucumberOptions.SnippetType.CAMELCASE,
        tags = "@SuccessLogin"
)
public class e2eLoginRunner {
}
