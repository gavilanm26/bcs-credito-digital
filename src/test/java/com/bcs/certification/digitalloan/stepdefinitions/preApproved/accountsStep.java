package com.bcs.certification.digitalloan.stepdefinitions.preApproved;

import com.bcs.certification.digitalloan.questions.accountQuestion;
import com.bcs.certification.digitalloan.tasks.accounts;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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

    @When("I select an account and I accept the automatic debit.")
    public void iSelectAnAccountAndIAcceptTheAutomaticDebit() {
        theActorInTheSpotlight().wasAbleTo(
            accounts.acountsSelect()
        );
    }

    @Then("I can see the beneficiary screen. (.*)$")
    public void iCanSeeTheBeneficiaryScreen() {

    }
}
