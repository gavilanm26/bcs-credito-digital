package com.bcs.certification.digitalloan.questions;

import com.bcs.certification.digitalloan.UI.loginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

@SuppressWarnings("MethodNameSameAsClassName")
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

        return Text.of(loginUI.TEXT_VALIDATE_LOGIN)
            .answeredBy(actor)
            .equals(validationText);
    }
    public static loginQuestion loginQuestion(String validationText){
        return new loginQuestion(validationText);
    }
}
