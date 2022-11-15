package com.bcs.certification.digitalloan.questions;

import com.bcs.certification.digitalloan.UI.promissoryNoteUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class promissoryNoteQuestion implements Question {
    private final String validationText;

    public promissoryNoteQuestion(String validationText) {
        this.validationText = validationText;
    }

    @Override
    public Object answeredBy(Actor actor) {
        WaitUntil.the(promissoryNoteUI.TEXT_VALIDATE_PROMISSORYNOTE, WebElementStateMatchers.isVisible())
            .forNoMoreThan(15)
            .seconds();

        return Text.of(promissoryNoteUI.TEXT_VALIDATE_PROMISSORYNOTE)
            .answeredBy(actor)
            .equals(validationText);
    }

public static promissoryNoteQuestion promissoryNote(String validationText){
        return new promissoryNoteQuestion(validationText);
    }
}
