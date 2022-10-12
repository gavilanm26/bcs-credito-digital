package com.bcs.certification.digitalloan.tasks;

import com.bcs.certification.digitalloan.UI.loginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

public class channels implements Task {

    protected String idType;
    protected String user;
    protected String check;

    public channels(String check, String idType, String user) {
        this.idType = idType;
        this.user = user;
        this.check = check;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if(check.equals("one")){
            actor.attemptsTo(
                    SendKeys.of(idType).into(loginUI.SELECT_ID_TYPE),
                    SendKeys.of(user).into(loginUI.INPUT_USER),
                    Click.on(loginUI.CHECK_POLICY_AND_TERMS),
                    Click.on(loginUI.BTN_CONTINUE)
            );
        }else{
            actor.attemptsTo(
                    SendKeys.of(idType).into(loginUI.SELECT_ID_TYPE),
                    SendKeys.of(user).into(loginUI.INPUT_USER),
                    Click.on(loginUI.CHECK_POLICY_AND_TERMS),
                    Click.on(loginUI.CHECK_COMMERCIAL_TERMS),
                    Click.on(loginUI.BTN_CONTINUE)
            );
        }

    }

    public static channels channels(String check, String idType, String user){
        return Tasks.instrumented(channels.class, check, idType, user);
    }
}
