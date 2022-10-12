package com.bcs.certification.digitalloan.stepdefinitions;

import com.bcs.certification.digitalloan.questions.*;
import com.bcs.certification.digitalloan.tasks.login;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class e2eLoginStep {

    @Given("^I enter the digital friend credit url. (.*)$")
    public void iEnterTheDigitalFriendUrl(String textLanding) {
        landingStep landing = new landingStep();
        landing.iEnteredTheOnboardingUrl();
        landing.iClickTheFirstButtonIWantMyLoan(textLanding);
    }


    @When("^I select the type of document and the number. (.*), (.*), (.*)$")
    public void iSelectTheTypeOfDocumentAndTheNumber(String textLogin, String type, String number) {
        e2eDigitalChannelsStep channel = new e2eDigitalChannelsStep();
        channel.iFillInTheDocumentTypeDocumentNumberFieldsAndSelectOneVerificationField(textLogin, type, number);
    }

    @When("^I enter the correct password and click the start button. (.*), (.*)$")
    public void iEnterTheCorrectPasswordAndClickTheStartButton(
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

    @Then("^I can see the offer customization screen. (.*)$")
    public void iCanSeeTheOfferCustomizationScreen(String textOffer) {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(offerQuestion.offerQuestion(textOffer))
        );
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