package com.bcs.certification.digitalloan.questions;

import com.bcs.certification.digitalloan.UI.accountsUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class accountQuestion implements Question {
    private final String validationText;

    public accountQuestion(String validationText) {
        this.validationText = validationText;
    }

    @Override
    public Object answeredBy(Actor actor) {
        WaitUntil.the(accountsUI.TEXT_VALIDATE_ACCOUNT, WebElementStateMatchers.isVisible())
                .forNoMoreThan(15)
                .seconds();

        if(Text.of(accountsUI.TEXT_VALIDATE_ACCOUNT)
                .viewedBy(actor)
                .asString()
                .equals(validationText.toString()
                )
        )
            return true;
        else
            return false;
    }
    public static accountQuestion accountQuestion(String validationText){
        return new accountQuestion(validationText);
    }
}
