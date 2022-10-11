package com.bcs.certification.digitalloan.stepdefinitions;

import com.bcs.certification.digitalloan.questions.landingQuestion;
import com.bcs.certification.digitalloan.questions.loginQuestion;
import com.bcs.certification.digitalloan.tasks.onboarding;
import com.bcs.certification.digitalloan.tasks.toAccess;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class landingStep {

    @Given("^given i entered the onboarding url$")
    public void givenIEnteredTheOnboardingUrl() {
        theActorInTheSpotlight().wasAbleTo(
                toAccess.toLoan()
        );
    }

    @When("^I click the first button, I want my loan! (.*)$")
    public void iClickTheFirstButtonIWantMyLoan(String validationText) {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(landingQuestion.landingQuestion(validationText))
        );
        theActorInTheSpotlight().wasAbleTo(
                onboarding.knowOffer()
        );
    }

    @Then("^I enter the login screen (.*)$")
    public void iEnterTheLoginScreen(String textLogin) {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(loginQuestion.loginQuestion(textLogin))
        );
    }
}
