package com.bcs.certification.digitalloan.questions;

import com.bcs.certification.digitalloan.UI.congratulationsUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

@SuppressWarnings("MethodNameSameAsClassName")
public class congratulationsQuestion implements Question {

    private final String validationText;

    public congratulationsQuestion(String validationText) {
        this.validationText = validationText;
    }
    @Override
    public Object answeredBy(Actor actor) {
        WaitUntil.the(congratulationsUI.TEXT_VALIDATE_CONGRATULATION, WebElementStateMatchers.isVisible())
            .forNoMoreThan(15)
            .seconds();

        return Text.of(congratulationsUI.TEXT_VALIDATE_CONGRATULATION)
            .answeredBy(actor)
            .equals(validationText);
    }

    public static congratulationsQuestion congratulationsQuestion(String validationText){
        return new congratulationsQuestion(validationText);
    }
}
