package com.bcs.certification.digitalloan.tasks;

import com.bcs.certification.digitalloan.UI.offerUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class offer implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(offerUI.BTN_I_WANT_IT)
        );
    }

    public static offer IWantIt() {
        return Tasks.instrumented(offer.class);
    }
}
