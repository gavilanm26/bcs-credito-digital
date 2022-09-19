package com.bcs.certification.digitalloan.questions;

import com.bcs.certification.digitalloan.UI.lifeInsuranceUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

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

        if(Text.of(lifeInsuranceUI.TEXT_VALIDATE_LIFEINSURANCE)
                .viewedBy(actor)
                .asString()
                .equals(validationText.toString()
                )
        )
            return true;
        else
            return false;
    }
    public static lifeInsuranceQuestion lifeInsuranceQuestion(String validationText){
        return new lifeInsuranceQuestion(validationText);
    }
}
