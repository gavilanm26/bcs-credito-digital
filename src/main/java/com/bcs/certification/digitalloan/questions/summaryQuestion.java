package com.bcs.certification.digitalloan.questions;

import com.bcs.certification.digitalloan.UI.summaryUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class summaryQuestion implements Question {

    private final String validationText;

    public summaryQuestion(String validationText) {
        this.validationText = validationText;
    }

    @Override
    public Object answeredBy(Actor actor) {
        WaitUntil.the(summaryUI.VALIDATE_TEXT_SUMMARY, WebElementStateMatchers.isVisible())
                .forNoMoreThan(15)
                .seconds();

        if(Text.of(summaryUI.VALIDATE_TEXT_SUMMARY)
                .viewedBy(actor)
                .asString()
                .equals(validationText.toString()
                )
        )
            return true;
        else
            return false;
    }
    public static summaryQuestion summaryQuestion(String validationText){
        return new summaryQuestion(validationText);
    }

}
