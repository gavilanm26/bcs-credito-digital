package com.bcs.certification.digitalloan.stepdefinitions;

import com.bcs.certification.digitalloan.questions.buttonDisableQuestion;
import com.bcs.certification.digitalloan.questions.loginQuestion;
import com.bcs.certification.digitalloan.questions.messagesQuestion;
import com.bcs.certification.digitalloan.tasks.login;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class e2eLoginStepStep {

    @Given("^given i entered the login url (.*)$")
    public void givenIEnteredTheLoginUrl(String validationText) {
        e2eOnboardingStep onboardingStep = new e2eOnboardingStep();
        onboardingStep.givenIEnteredTheOnboardingUrl();
        onboardingStep.iClickTheFirstButtonIWantMyLoan(validationText);
    }

    @When("^I fill in the login fields (.*), (.*), (.*), (.*)$")
    public void iFillInTheLoginFields(String idType, String idNumber, String password, String textLogin) {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(loginQuestion.loginQuestion(textLogin))
        );
        theActorInTheSpotlight().wasAbleTo(
                login.login(idType, idNumber, password)
        );

    }

    @Then("^the continue button should not be activated$")
    public void theContinueButtonShouldNotBeActivated() {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(buttonDisableQuestion.buttonDisable())
        );
    }

    @Then("^the different messages are validated (.*)$")
    public void theDifferentMessagesAreValidated(String message) {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(messagesQuestion.messages(message))
        );
    }
}
