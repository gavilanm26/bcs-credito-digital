package com.bcs.certification.digitalloan.questions;

import com.bcs.certification.digitalloan.UI.offerUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitWithTimeout;

import java.time.Duration;

@SuppressWarnings("MethodNameSameAsClassName")
public class offerQuestion implements Question {

    private final String offerText;

    public offerQuestion(String validation) {
        this.offerText = validation;
    }

    @Override
    public Object answeredBy(Actor actor) {

        WaitUntil.the(offerUI.TEXT_VALIDATE_OFFER, WebElementStateMatchers.isVisible())
            .forNoMoreThan(9000)
            .seconds();

        return Text.of(offerUI.TEXT_VALIDATE_OFFER)
            .answeredBy(actor)
            .equals(offerText);
}
    public static offerQuestion offerQuestion(String validationText){
        return new offerQuestion(validationText);
    }
}
