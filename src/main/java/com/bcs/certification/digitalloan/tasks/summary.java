package com.bcs.certification.digitalloan.tasks;

import com.bcs.certification.digitalloan.UI.summaryUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class summary implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(summaryUI.BTN_CONTINUE)
        );

    }
    public static summary summaryTask(){
        return Tasks.instrumented(summary.class);
    }

}
