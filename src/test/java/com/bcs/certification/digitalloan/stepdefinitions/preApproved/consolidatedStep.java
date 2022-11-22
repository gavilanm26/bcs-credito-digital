package com.bcs.certification.digitalloan.stepdefinitions.preApproved;

import com.bcs.certification.digitalloan.questions.identityValidation.consolidatedQuestion;
import com.bcs.certification.digitalloan.tasks.consolidated;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


@SuppressWarnings("unchecked")
public class consolidatedStep {
    @Then("I can see the product pending payment screen. (.*)$")
    public void iCanSeeTheProductPendingPaymentScreen(String txtConsolidated) {
        theActorInTheSpotlight().should(
            GivenWhenThen.seeThat(
                consolidatedQuestion.consolidateQuestion(txtConsolidated)
            )
        );
    }
    @And("I click the back to home button.")
    public void iClickTheBackToHomeButton() {
        consolidated.pendingPayment();
    }
}
