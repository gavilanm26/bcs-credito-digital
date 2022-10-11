package com.bcs.certification.digitalloan.questions;

import com.bcs.certification.digitalloan.UI.landingUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class landingQuestion implements Question {
    private final String validationText;

    public landingQuestion(String validationText) {
        this.validationText = validationText;
    }

    @Override
    public Object answeredBy(Actor actor) {
        WaitUntil.the(landingUI.VALIDATE_TEXT_ONBOARDING, WebElementStateMatchers.isVisible())
                .forNoMoreThan(15)
                .seconds();

        if(Text.of(landingUI.VALIDATE_TEXT_ONBOARDING)
                .viewedBy(actor)
                .asString()
                .equals(validationText.toString()
                )
        )
            return true;
        else
            return false;
    }
    public static landingQuestion landingQuestion(String validationText){
        return new landingQuestion(validationText);
    }
}
