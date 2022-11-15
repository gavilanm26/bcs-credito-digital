package com.bcs.certification.digitalloan.questions;

import com.bcs.certification.digitalloan.UI.identityValidationUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

@SuppressWarnings("MethodNameSameAsClassName")
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

        return Text.of(identityValidationUI.TXT_IDENTITY_VALIDATION)
            .answeredBy(actor)
            .contains(txtIdentityValidation);
    }

    public static noChannelsQuestion noChannelsQuestion(String txtIdentityValidation){
        return new noChannelsQuestion(txtIdentityValidation);
    }

}
