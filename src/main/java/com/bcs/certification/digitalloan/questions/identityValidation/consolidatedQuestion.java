package com.bcs.certification.digitalloan.questions.identityValidation;

import com.bcs.certification.digitalloan.UI.consolidatedUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class consolidatedQuestion implements Question {

    private final String txtConsolidate;

    public consolidatedQuestion(String txtConsolidate) {
        this.txtConsolidate = txtConsolidate;
    }
    @Override
    public Object answeredBy(Actor actor) {

        WaitUntil.the(consolidatedUI.TXT_CONSOLIDATE, WebElementStateMatchers.isVisible())
            .forNoMoreThan(15000)
            .seconds();

        return Text.of(consolidatedUI.TXT_CONSOLIDATE)
            .answeredBy(actor)
            .contains(txtConsolidate);
    }

    public static consolidatedQuestion consolidateQuestion(String txtConsolidate){
        return  new consolidatedQuestion(txtConsolidate);
    }
}
