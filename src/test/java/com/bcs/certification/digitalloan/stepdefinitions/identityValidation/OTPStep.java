package com.bcs.certification.digitalloan.stepdefinitions.identityValidation;

import com.bcs.certification.digitalloan.questions.noChannelsQuestion;
import com.bcs.certification.digitalloan.tasks.identityValidation;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

@SuppressWarnings("unchecked")
public class OTPStep {

    @Then("I can see the identity validation screen and I click continue. (.*)$")
    public void iCanSeeTheIdentityValidationScreenAndIClickContinue(String txtIdentityValidation) {
        theActorInTheSpotlight().should(
            GivenWhenThen.seeThat(
                noChannelsQuestion.noChannelsQuestion(txtIdentityValidation)
            )
        );

        theActorInTheSpotlight().wasAbleTo(
            identityValidation.validation()
        );
    }
    @When("I answer the questions well")
    public void iAnswerTheQuestionsWell() {
    }
    @When("I select the correct cell phone number")
    public void iSelectTheCorrectCellPhoneNumber() {
    }
    @When("I enter the correct OTP number")
    public void iEnterTheCorrectOTPNumber() {
    }
    @Then("I can see the offer customization screen")
    public void iCanSeeTheOfferCustomizationScreen() {
    }
}
