package com.bcs.certification.digitalloan.questions;

import com.bcs.certification.digitalloan.UI.accountsUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

@SuppressWarnings("MethodNameSameAsClassName")
public class accountQuestion implements Question {
    private final String validationText;

    public accountQuestion(String validationText) {
        this.validationText = validationText;
    }

    @Override
    public Object answeredBy(Actor actor) {
        WaitUntil.the(accountsUI.TXT_NO_ACCOUNTS, WebElementStateMatchers.isVisible())
            .forNoMoreThan(9000)
            .seconds();

        return Text.of(accountsUI.TXT_NO_ACCOUNTS)
            .answeredBy(actor)
            .equals(validationText);
    }
    public static accountQuestion accountQuestion(String validationText){
        return new accountQuestion(validationText);
    }
}
