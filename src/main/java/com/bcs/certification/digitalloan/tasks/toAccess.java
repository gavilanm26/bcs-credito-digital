package com.bcs.certification.digitalloan.tasks;

import com.bcs.certification.digitalloan.UI.digitalLoanURL;

import com.bcs.certification.digitalloan.UI.onboardingUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class toAccess implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Open.browserOn().the(digitalLoanURL.class),
                WaitUntil.the(onboardingUI.BTN_ONBOARDING, WebElementStateMatchers
                        .isVisible())
                        .forNoMoreThan(20)
                        .seconds()
        );
    }

    public static toAccess  toLoan(){
        return Tasks.instrumented(toAccess.class);
    }
}
