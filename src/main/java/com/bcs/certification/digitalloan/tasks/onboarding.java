package com.bcs.certification.digitalloan.tasks;

import com.bcs.certification.digitalloan.UI.landingUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class onboarding implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(landingUI.BTN_ONBOARDING)
        );
    }

    public static onboarding knowOffer(){
        return Tasks.instrumented(onboarding.class);
    }
}
