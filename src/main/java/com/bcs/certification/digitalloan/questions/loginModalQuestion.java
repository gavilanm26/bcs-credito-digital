package com.bcs.certification.digitalloan.questions;

import com.bcs.certification.digitalloan.UI.loginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class loginModalQuestion implements Question {

    private final String modal;

    public loginModalQuestion(String modal) {
        this.modal = modal;
    }

    @Override
    public Object answeredBy(Actor actor) {
        switch (modal){
            case "Por favor verifique e intente de nuevo":

                WaitUntil.the(loginUI.INCORRECT_DATA, WebElementStateMatchers.isVisible())
                    .forNoMoreThan(2000)
                    .seconds();

                if (loginUI.INCORRECT_DATA
                    .resolveFor(actor)
                    .isVisible() && Text.of(loginUI.INCORRECT_DATA)
                    .viewedBy(actor)
                    .asString()
                    .equals(modal)
                )
                return true;
                break;
            case "Usuario bloqueado, por favor intente de nuevo en 24 horas":

                WaitUntil.the(loginUI.USER_BLOCKED, WebElementStateMatchers.isVisible())
                    .forNoMoreThan(2000)
                    .seconds();

                if (loginUI.USER_BLOCKED
                    .resolveFor(actor)
                    .isVisible() && Text.of(loginUI.USER_BLOCKED)
                    .viewedBy(actor)
                    .asString()
                    .equals(modal)
                )
                return true;
            break;
        }
        return false;
    }

    public static loginModalQuestion modal(String modal){
        return new loginModalQuestion(modal);
    }
}
