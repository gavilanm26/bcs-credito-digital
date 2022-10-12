package com.bcs.certification.digitalloan.stepdefinitions;

import com.bcs.certification.digitalloan.questions.*;
import com.bcs.certification.digitalloan.tasks.login;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class e2eLoginStepStep {

    @Given("^I entered the login url (.*)$")
    public void IEnteredTheLoginUrl(String textLanding) {
        landingStep landing = new landingStep();
        landing.givenIEnteredTheOnboardingUrl();
        landing.iClickTheFirstButtonIWantMyLoan(textLanding);
    }


    @When("^I have selected the type of document and the number (.*), (.*), (.*)$")
    public void iHaveSelectedTheTypeOfDocumentAndTheNumber(String textLogin, String type, String number) {
        e2eDigitalChannelsStep channel = new e2eDigitalChannelsStep();
        channel.iFillInTheDocumentTypeDocumentNumberFieldsAndSelectOneVerificationField(textLogin, type, number);
    }

    @When("^enter the correct password and click the start button (.*), (.*)$")
    public void enterTheCorrectPasswordAndClickTheStartButton(
            String txtPassword,
            String password) {
//String name = JOptionPane.showInputDialog("Type your name please");
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        channelsQuestion.channelsQuestion(txtPassword)
                )
        );

        theActorInTheSpotlight().wasAbleTo(
            login.login(password)
        );
    }

    @Then("^you can see the offer customization screen (.*)$")
    public void youCanSeeTheOfferCustomizationScreen() {

    }

}

  /*  @Given("^given i entered the login url (.*)$")
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

        //e2eDigitalChannelsStep channelsStep = new e2eDigitalChannelsStep();
        //channelsStep.youFillInTheDocumentTypeAndDocumentNumberFields(textLogin, idType, idNumber);

        theActorInTheSpotlight().wasAbleTo(
                login.login(password)
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
    }*/