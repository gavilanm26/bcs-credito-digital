package com.bcs.certification.digitalloan.questions;

import com.bcs.certification.digitalloan.UI.identityValidationUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class noChannelsQuestion implements Question {

    private final String txtIdentityValidation;

    public noChannelsQuestion(String txtIdentityValidation) {
        this.txtIdentityValidation = txtIdentityValidation;
    }

    @Override
    public Object answeredBy(Actor actor) {
        WaitUntil.the(identityValidationUI.TXT_IDENTITY_VALIDATION,
                WebElementStateMatchers.isVisible())
                .forNoMoreThan(15)
                .seconds();

        if(Text.of(identityValidationUI.TXT_IDENTITY_VALIDATION)
                .viewedBy(actor)
                .asString()
                .equals(txtIdentityValidation.toString()
                )
        )
            return true;
        else
            return false;
    }

    public static noChannelsQuestion noChannelsQuestion(String txtIdentityValidation){
        return new noChannelsQuestion(txtIdentityValidation);
    }

}
