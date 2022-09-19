package com.bcs.certification.digitalloan.questions;

import com.bcs.certification.digitalloan.UI.loginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class buttonDisableQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        if(loginUI.BTN_CONTINUE.resolveFor(actor).isDisabled())
            return true;
        else
            return false;
    }
    public static buttonDisableQuestion buttonDisable(){
        return new buttonDisableQuestion();
    }
}
