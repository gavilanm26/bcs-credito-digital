package com.bcs.certification.digitalloan.stepdefinitions;

import com.bcs.certification.digitalloan.tasks.*;
import com.bcs.certification.digitalloan.questions.*;


import com.bcs.certification.digitalloan.tasks.promissoryNote;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;


import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

@SuppressWarnings("unchecked")
public class happyPathCedulaStep {

    @Given("^given the customer clicks on the link in the SMS$")
    public void givenTheCustomerClicksOnTheLinkInTheSMS() {
        theActorInTheSpotlight().wasAbleTo(
            toAccess.toLoan()
        );
    }

    @When("^I know the conditions and benefits of the offer and I click on Verifique aqui (.*)$")
    public void iKnowTheConditionsAndBenefitsOfTheOfferAndIClickOnVerifiqueAqui(String validationText) {
        theActorInTheSpotlight().should(
            GivenWhenThen.seeThat(landingQuestion.landingQuestion(validationText))
        );
        theActorInTheSpotlight().wasAbleTo(
            onboarding.knowOffer()
        );
    }

    @When("^I select id type (.*) and I enter the user name (.*), I enter password (.*) I click the button I want it (.*)$")
    public void iSelectIdTypeAndIEnterTheUserNameIEnterPasswordIClickTheButtonIWantIt(String idType, String idNumber, String password, String textLogin) {

        theActorInTheSpotlight().should(
            GivenWhenThen.seeThat(loginQuestion.loginQuestion(textLogin))
        );
            //String Code = JOptionPane.showInputDialog("Ingrese código OTP");
        theActorInTheSpotlight(). wasAbleTo(
                //login.login(idType, idNumber, password)
        );

    }

    @When("^being in the offer I click on the continue button (.*)$")
    public void beingInTheOfferIClickOnTheContinueButton(String validationTextOffer) {
        theActorInTheSpotlight().should(
            GivenWhenThen.seeThat(offerQuestion.offerQuestion(validationTextOffer))
        );
        theActorInTheSpotlight().wasAbleTo(
            offer.IWantIt()
        );

    }

    @When("^I select an account and click the continue button (.*)$")
    public void iSelectAnAccountAndClickTheContinueButton(String validationTextAccount) {
        theActorInTheSpotlight().should(
            GivenWhenThen.seeThat(accountQuestion.accountQuestion(validationTextAccount))
        );
        theActorInTheSpotlight().wasAbleTo(
            accounts.acountsSelect()
        );
    }

    @When("^I Select how many beneficiaries I want to enter (.*), I enter the first name (.*), last name (.*), relationship (.*), percentage (.*) and click continue (.*)$")
    public void iSelectHowManyBeneficiariesIWantToEnterIEnterTheFirstNameLastNameRelationshipPercentageAndClickContinue(
        String beneficiaries,
        String name,
        String lastName,
        String relationship,
        String percentage,
        String textBeneficiaries
    ) {

        theActorInTheSpotlight().should(
            GivenWhenThen.seeThat(lifeInsuranceQuestion.lifeInsuranceQuestion(textBeneficiaries))
        );

        theActorInTheSpotlight().wasAbleTo(
            lifeInsurance.beneficiaries(beneficiaries, name, lastName, relationship, percentage)
        );
    }

    @When("^I verify the information (.*)$")
    public void iVerifyTheInformation(String textSummary) {
        theActorInTheSpotlight().should(
            GivenWhenThen.seeThat(summaryQuestion.summaryQuestion(textSummary))
        );

        theActorInTheSpotlight().wasAbleTo(
            summary.summaryTask()
        );

    }

    @When("^I read the promissory note and click on it promissory note signature button (.*)$")
    public void iReadThePromissoryNoteAndClickOnItPromissoryNoteSignatureButton(String textPromissoryNote) {
        theActorInTheSpotlight().should(
            GivenWhenThen.seeThat(promissoryNoteQuestion.promissoryNote(textPromissoryNote))
        );

        theActorInTheSpotlight().wasAbleTo(
            promissoryNote.promissoryNoteTask()
        );
    }

    @When("^I enter the number in the OTP (.*), (.*)$")
    public void iEnterTheNumberInTheOTP(String numberotp, String textOtp) {
        theActorInTheSpotlight().should(
            GivenWhenThen.seeThat(otpQuestion.otpQuestion(textOtp))
        );

        theActorInTheSpotlight().wasAbleTo(
            otp.otpTask(numberotp)
        );
    }

    @When("^I qualify the experience (.*), (.*)$")
    public void iQualifyTheExperience(String qualify, String textQualify) {
        theActorInTheSpotlight().should(
            GivenWhenThen.seeThat(modalQualifyQuestion.modalQualify(textQualify))
        );

        theActorInTheSpotlight().wasAbleTo(
            congratulations.congratulationsTask()
        );
    }

    @Then("^I can see the congratulations message (.*)$")
    public void iCanSeeTheCongratulationsMessage(String textCongratulations) {
        theActorInTheSpotlight().should(
            GivenWhenThen.seeThat(congratulationsQuestion.congratulationsQuestion(textCongratulations))
        );
    }


}


