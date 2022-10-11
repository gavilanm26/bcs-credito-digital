package com.bcs.certification.digitalloan.stepdefinitions;

import com.bcs.certification.digitalloan.questions.channelsQuestion;
import com.bcs.certification.digitalloan.questions.loginQuestion;
import com.bcs.certification.digitalloan.questions.noChannelsQuestion;
import com.bcs.certification.digitalloan.tasks.channels;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class e2eDigitalChannelsStep {

    @Given("^I enter the digital friend credit url. (.*)$")
    public void iEnterTheDigitalFriendCreditUrl(String txtLanding) {
        landingStep onboardingStep = new landingStep();
        onboardingStep.givenIEnteredTheOnboardingUrl();
        onboardingStep.iClickTheFirstButtonIWantMyLoan(txtLanding);
    }


    @When("^I fill in the document type, document number fields and select one verification field. (.*), (.*), (.*)$")
    public void iFillInTheDocumentTypeDocumentNumberFieldsAndSelectOneVerificationField(String txtLogin, String Type, String Number) {
        theActorInTheSpotlight().should(
            GivenWhenThen.seeThat(
                loginQuestion.loginQuestion(txtLogin)
            )
        );
        theActorInTheSpotlight().wasAbleTo(
            channels.channels(Type, Number)
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
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        loginQuestion.loginQuestion(txtLogin)
                )
        );
        theActorInTheSpotlight().wasAbleTo(
                channels.channels(Type, Number)
        );
    }

    @When("^I fill in the fields of document type and document number. (.*), (.*), (.*)$")
    public void IFillInTheFieldsOfDocumentTypeAndDocumentNumber(String txtLogin, String Type, String Number) {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        loginQuestion.loginQuestion(txtLogin)
                )
        );
        theActorInTheSpotlight().wasAbleTo(
                channels.channels(Type, Number)
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
