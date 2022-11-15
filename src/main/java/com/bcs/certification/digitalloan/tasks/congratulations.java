package com.bcs.certification.digitalloan.tasks;

import com.bcs.certification.digitalloan.UI.congratulationsUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class congratulations implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(congratulationsUI.RATE_STARS)
        );
    }

    public static congratulations congratulationsTask() {
        return Tasks.instrumented(congratulations.class);
    }

}
