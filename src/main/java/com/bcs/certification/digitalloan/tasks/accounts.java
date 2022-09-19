package com.bcs.certification.digitalloan.tasks;

import com.bcs.certification.digitalloan.UI.accountsUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class accounts implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(accountsUI.SELECT_ACCOUNT),
                Click.on(accountsUI.CHECK_AUTHORIZATION),
                Click.on(accountsUI.BTN_CONTINUO_ACCOUNT)
        );
    }

    public static accounts acountsSelect(){
        return Tasks.instrumented(accounts.class);
    }
}
