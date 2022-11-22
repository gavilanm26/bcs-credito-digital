package com.bcs.certification.digitalloan.stepdefinitions.preApproved;

import com.bcs.certification.digitalloan.questions.*;
import com.bcs.certification.digitalloan.tasks.channels;
import com.bcs.certification.digitalloan.tasks.login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.serenitybdd.screenplay.GivenWhenThen;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

@SuppressWarnings("unchecked")
public class e2eLoginStep {
    @Given("^I enter the digital friend credit url. (.*)$")
    public void  iEnterTheDigitalFriendUrl(String textLanding) {
        landingStep landing = new landingStep();
        landing.iEnteredTheOnboardingUrl();
        landing.iClickTheFirstButtonIWantMyLoan(textLanding);
    }

    @When("^I select the type of document and the number. (.*), (.*), (.*)$")
    public void iSelectTheTypeOfDocumentAndTheNumber(String textLogin, String type, String number) {
        e2eDigitalChannelsStep channel = new e2eDigitalChannelsStep();
        channel.iFillInTheDocumentTypeDocumentNumberFieldsAndSelectOneVerificationField(textLogin, type, number);
    }


    @When("^I select the type of document and the number to validate messages. (.*), (.*), (.*)$")
    public void iSelectTheTypeOfDocumentAndTheNumberToValidateMessages(String textLogin, String type, String number) {
        String check = "validations";
        theActorInTheSpotlight().should(
            GivenWhenThen.seeThat(
                loginQuestion.loginQuestion(textLogin)
            )
        );
        theActorInTheSpotlight().wasAbleTo(
            channels.channels(check, type, number)
        );
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

    @When("^I wait for the page to load. (.*)$")
    public void iWaitForThePageToLoadValidando(String loader) {
        theActorInTheSpotlight().should(
            GivenWhenThen.seeThat(loaderQuestion.loader(loader))
        );
    }

    @Then("^I can see the offer customization screen. (.*)$")
    public void iCanSeeTheOfferCustomizationScreen(String textOffer) {
        theActorInTheSpotlight().should(
            GivenWhenThen.seeThat(offerQuestion.offerQuestion(textOffer))
        );
    }

    @Then("^the different messages are validated (.*), (.*)$")
    public void theDifferentMessagesAreValidated(String type, String message) {
        theActorInTheSpotlight().should(
            GivenWhenThen.seeThat(messagesQuestion.messages(type, message))
        );
    }

    @Then("^I check if I have entered an incorrect data or I have the user blocked. (.*)$")
    public void iCheckIfIHaveEnteredAnIncorrectDataOrIHaveTheUserBlocked(String modal) {
        theActorInTheSpotlight().should(
            GivenWhenThen.seeThat(loginModalQuestion.modal(modal))
        );
    }
}