package com.bcs.certification.digitalloan.questions;

import com.bcs.certification.digitalloan.UI.loginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

@SuppressWarnings("MethodNameSameAsClassName")
public class channelsQuestion implements Question {

    private final String txtPassword;

    public channelsQuestion(String txtPassword) {
        this.txtPassword = txtPassword;
    }

    @Override
    public Object answeredBy(Actor actor) {
        WaitUntil.the(loginUI.TEXT_VALIDATE_PASSWORD, WebElementStateMatchers.isVisible())
            .forNoMoreThan(18000)
                .milliseconds();

        return Text.of(loginUI.TEXT_VALIDATE_PASSWORD)
            .answeredBy(actor)
            .contains(txtPassword);
    }

    public static channelsQuestion channelsQuestion(String txtPassword){
        return new channelsQuestion(txtPassword);
    }
}
