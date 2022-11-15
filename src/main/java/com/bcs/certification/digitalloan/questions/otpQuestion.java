package com.bcs.certification.digitalloan.questions;

import com.bcs.certification.digitalloan.UI.otpUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

@SuppressWarnings("MethodNameSameAsClassName")
public class otpQuestion implements Question {

    private final String validationText;

    public otpQuestion(String validationText) {
        this.validationText = validationText;
    }
    @Override
    public Object answeredBy(Actor actor) {
        WaitUntil.the(otpUI.TEXT_VALIDATE_OTP, WebElementStateMatchers.isVisible())
            .forNoMoreThan(15)
            .seconds();

        return Text.of(otpUI.TEXT_VALIDATE_OTP)
            .answeredBy(actor)
            .equals(validationText);
    }

    public static otpQuestion otpQuestion(String validationText){
        return new otpQuestion(validationText);
    }
}
