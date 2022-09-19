package com.bcs.certification.digitalloan.tasks;

import com.bcs.certification.digitalloan.UI.accountsUI;
import com.bcs.certification.digitalloan.UI.onboardingUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class onboarding implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(onboardingUI.BTN_ONBOARDING)
        );
    }

    public static onboarding knowOffer(){
        return Tasks.instrumented(onboarding.class);
    }
}
