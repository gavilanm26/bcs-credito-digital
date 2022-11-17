package com.bcs.certification.digitalloan.stepdefinitions.preApproved;

import com.bcs.certification.digitalloan.questions.accountQuestion;
import com.bcs.certification.digitalloan.questions.loaderQuestion;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

@SuppressWarnings("unchecked")
public class accountsStep {

    @Then("I can see the screen that I have no active accounts. (.*)$")
    public void iCanSeeTheScreenThatIHaveNoActiveAccounts(String txtAccounts) {
        theActorInTheSpotlight().should(
            GivenWhenThen.seeThat(
                accountQuestion.accountQuestion(txtAccounts)
            )
        );
    }
}
