package com.bcs.certification.digitalloan.stepdefinitions;

import com.bcs.certification.digitalloan.questions.channelsQuestion;
import com.bcs.certification.digitalloan.questions.loginQuestion;
import com.bcs.certification.digitalloan.tasks.channels;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class e2eDigitalChannelsStep {

    @Given("^the client enters the main page. (.*)$")
    public void theClientEntersTheMainPage(String txtLanding) {
        e2eOnboardingStep onboardingStep = new e2eOnboardingStep();
        onboardingStep.givenIEnteredTheOnboardingUrl();
        onboardingStep.iClickTheFirstButtonIWantMyLoan(txtLanding);
    }


    @When("^you fill in the document type and document number fields. (.*), (.*), (.*)$")
    public void youFillInTheDocumentTypeAndDocumentNumberFields(String txtLogin, String Type, String Number) {
        theActorInTheSpotlight().should(
            GivenWhenThen.seeThat(
                loginQuestion.loginQuestion(txtLogin)
            )
        );
        theActorInTheSpotlight().wasAbleTo(
            channels.channels(Type, Number)
        );
    }

    @Then("^you can see the field to enter the password. (.*)$")
    public void youCanSeeTheFieldToEnterThePassword(String txtPassword) {
        theActorInTheSpotlight().should(
            GivenWhenThen.seeThat(
                channelsQuestion.channelsQuestion(txtPassword)
            )
        );
    }
}
