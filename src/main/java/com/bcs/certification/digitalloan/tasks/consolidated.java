package com.bcs.certification.digitalloan.tasks;

import com.bcs.certification.digitalloan.UI.consolidatedUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class consolidated implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(consolidatedUI.BTN_CONSOLIDATE)
        );
    }

    public static consolidated pendingPayment(){
        return Tasks.instrumented(consolidated.class);
    }
}
