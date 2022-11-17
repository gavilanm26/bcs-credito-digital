package com.bcs.certification.digitalloan.runners.preApproved;
import com.bcs.certification.digitalloan.utils.customrunner.customRunner;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@SuppressWarnings("NewClassNamingConvention")
@RunWith(customRunner.class)
@CucumberOptions(
        features = {"src/test/resources/features/preApproved/e2e-channels.feature"},
        glue = {"com.bcs.certification.digitalloan.stepdefinitions"},
        monochrome = true, snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@withChannels1Check"
)
public class e2eDigitalChannelsRunner {
}
