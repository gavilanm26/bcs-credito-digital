package com.bcs.certification.digitalloan.tasks;

import com.bcs.certification.digitalloan.UI.identityValidationUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class identityValidation implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(identityValidationUI.BTN_CONTINUE)
        );
    }

    public static identityValidation validation(){
        return Tasks.instrumented(identityValidation.class);
    }
}
