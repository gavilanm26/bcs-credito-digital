package com.bcs.certification.digitalloan.questions.identityValidation;

import com.bcs.certification.digitalloan.UI.accountsUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class validationQuestions implements Question {

    @Override
    public Object answeredBy(Actor actor) {

        WaitUntil.the(accountsUI.TEXT_VALIDATE_ACCOUNT, WebElementStateMatchers.isVisible())
                .forNoMoreThan(15)
                .seconds();

        return null;
    }
}
