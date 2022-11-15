package com.bcs.certification.digitalloan.stepdefinitions;

import com.bcs.certification.digitalloan.questions.channelsQuestion;
import com.bcs.certification.digitalloan.questions.loginQuestion;
import com.bcs.certification.digitalloan.questions.noChannelsQuestion;
import com.bcs.certification.digitalloan.tasks.channels;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

@SuppressWarnings("unchecked")
public class e2eDigitalChannelsStep {

    @Given("^I entered digital friend credit. (.*)$")
    public void iEnteredDigitalFriendCredit(String txtLanding) {
        landingStep landingStep = new landingStep();
        landingStep.iEnteredTheOnboardingUrl();
        landingStep.iClickTheFirstButtonIWantMyLoan(txtLanding);
    }


    @When("^I fill in the document type, document number fields and select one verification field. (.*), (.*), (.*)$")
    public void iFillInTheDocumentTypeDocumentNumberFieldsAndSelectOneVerificationField(String txtLogin, String Type, String Number) {
        String check = "one";
        theActorInTheSpotlight().should(
            GivenWhenThen.seeThat(
                loginQuestion.loginQuestion(txtLogin)
            )
        );
        theActorInTheSpotlight().wasAbleTo(
            channels.channels(check, Type, Number)
        );
    }

    @Then("^I can see the field to enter the password. (.*)$")
    public void iCanSeeTheFieldToEnterThePassword(String txtPassword) {
        theActorInTheSpotlight().should(
            GivenWhenThen.seeThat(
                channelsQuestion.channelsQuestion(txtPassword)
            )
        );
    }

    @When("^I fill in the document type, document number fields and select two verification field. (.*), (.*), (.*)$")
    public void iFillInTheDocumentTypeDocumentNumberFieldsAndSelectTwoVerificationField(String txtLogin, String Type, String Number) {
        String check = "two";
        theActorInTheSpotlight().should(
            GivenWhenThen.seeThat(
                loginQuestion.loginQuestion(txtLogin)
            )
        );
        theActorInTheSpotlight().wasAbleTo(
            channels.channels(check, Type, Number)
        );
    }

    @Then("^I can see the identity validation screen. (.*)$")
    public void iCanSeeTheIdentityValidationScreen(String txtIdentityValidation) {
        theActorInTheSpotlight().should(
            GivenWhenThen.seeThat(
                noChannelsQuestion.noChannelsQuestion(txtIdentityValidation)
            )
        );
    }

}
