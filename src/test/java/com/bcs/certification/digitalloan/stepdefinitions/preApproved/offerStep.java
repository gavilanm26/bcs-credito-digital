package com.bcs.certification.digitalloan.stepdefinitions.preApproved;

import com.bcs.certification.digitalloan.questions.accountQuestion;
import com.bcs.certification.digitalloan.tasks.offer;
import io.cucumber.java.en.Then;

public class offerStep {

    @Then("I click the continue button.")
    public void iClickTheContinueButton() {
        offer.IWantIt();
    }

    @Then("I can see the select account screen. (.*)$")
    public void iCanSeeTheSelectAccountScreen(String txtAccount) {
        accountQuestion.accountQuestion(txtAccount);
    }
}
