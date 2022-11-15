package com.bcs.certification.digitalloan.questions;

import com.bcs.certification.digitalloan.UI.lifeInsuranceUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

@SuppressWarnings("MethodNameSameAsClassName")
public class lifeInsuranceQuestion implements Question {

    private final String validationText;

    public lifeInsuranceQuestion(String validationText) {
        this.validationText = validationText;
    }

    @Override
    public Object answeredBy(Actor actor) {
        WaitUntil.the(lifeInsuranceUI.TEXT_VALIDATE_LIFEINSURANCE, WebElementStateMatchers.isVisible())
            .forNoMoreThan(15)
            .seconds();

        return Text.of(lifeInsuranceUI.TEXT_VALIDATE_LIFEINSURANCE)
            .answeredBy(actor)
            .equals(validationText);
    }
    public static lifeInsuranceQuestion lifeInsuranceQuestion(String validationText){
        return new lifeInsuranceQuestion(validationText);
    }
}
