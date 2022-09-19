package com.bcs.certification.digitalloan.questions;

import com.bcs.certification.digitalloan.UI.loginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class loginQuestion implements Question {

    private final String validationText;

    public loginQuestion(String validationText) {
        this.validationText = validationText;
    }

    @Override
    public Object answeredBy(Actor actor) {
        WaitUntil.the(loginUI.TEXT_VALIDATE_LOGIN, WebElementStateMatchers.isVisible())
                .forNoMoreThan(15)
                .seconds();

        if(Text.of(loginUI.TEXT_VALIDATE_LOGIN)
                .viewedBy(actor)
                .asString()
                .equals(validationText.toString()
                )
        )
            return true;
        else
            return false;
    }
    public static loginQuestion loginQuestion(String validationText){
        return new loginQuestion(validationText);
    }
}
