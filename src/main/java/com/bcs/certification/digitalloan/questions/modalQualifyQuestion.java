package com.bcs.certification.digitalloan.questions;

import com.bcs.certification.digitalloan.UI.congratulationsUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class modalQualifyQuestion implements Question {

    private final String validationText;

    public modalQualifyQuestion(String validationText) {
        this.validationText = validationText;
    }
    @Override
    public Object answeredBy(Actor actor) {

        actor.attemptsTo(
            WaitUntil.the(congratulationsUI.TEXT_VALIDATE_QUALIFY, WebElementStateMatchers.isVisible())
                .forNoMoreThan(15)
                .seconds()
        );
        return Text.of(congratulationsUI.TEXT_VALIDATE_QUALIFY)
            .answeredBy(actor)
            .equals(validationText);
    }

    public static modalQualifyQuestion modalQualify(String validationText){
        return new modalQualifyQuestion(validationText);
    }
}
