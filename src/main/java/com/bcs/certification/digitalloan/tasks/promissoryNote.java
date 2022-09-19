package com.bcs.certification.digitalloan.tasks;

import com.bcs.certification.digitalloan.UI.promissoryNoteUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class promissoryNote implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(promissoryNoteUI.READ_DOCUMENT),
                Click.on(promissoryNoteUI.CLOSE_DOCUMENT),
                Click.on(promissoryNoteUI.BTN_ACCEPT_DOCUMENT)
        );
    }

    public static promissoryNote promissoryNoteTask(){
        return Tasks.instrumented(promissoryNote.class);
    }
}
