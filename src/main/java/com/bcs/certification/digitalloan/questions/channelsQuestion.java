package com.bcs.certification.digitalloan.questions;

import com.bcs.certification.digitalloan.UI.loginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class channelsQuestion implements Question {

    private final String txtPassword;

    public channelsQuestion(String txtPassword) {
        this.txtPassword = txtPassword;
    }

    @Override
    public Object answeredBy(Actor actor) {
        WaitUntil.the(loginUI.TEXT_VALIDATE_PASSWORD, WebElementStateMatchers.isVisible())
                .forNoMoreThan(15)
                .seconds();

        if(Text.of(loginUI.TEXT_VALIDATE_PASSWORD)
                .viewedBy(actor)
                .asString()
                .contains(txtPassword.toString()
                )
        )
            return true;
        else
            return false;
    }

    public static channelsQuestion channelsQuestion(String txtPassword){
        return new channelsQuestion(txtPassword);
    }
}
