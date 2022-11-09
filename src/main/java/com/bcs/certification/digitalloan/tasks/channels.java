package com.bcs.certification.digitalloan.tasks;

import com.bcs.certification.digitalloan.UI.loginUI;
import com.bcs.certification.digitalloan.utils.hasletters.hasLetters;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;


public class channels implements Task {

    protected String idType;
    protected String user;
    protected String check;
    //hasLetters letters = new hasLetters();


    public channels(String check, String idType, String user) {
        this.idType = idType;
        this.user = user;
        this.check = check;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (check) {
            case "one":
                switch (idType) {
                    case "Cédula de ciudadanía":
                        actor.attemptsTo(
                                Click.on(loginUI.CLICK_SELECT),
                                Click.on(loginUI.SELECT_ID_CC),
                                SendKeys.of(user).into(loginUI.INPUT_USER),
                                Click.on(loginUI.CHECK_POLICY_AND_TERMS),
                                Click.on(loginUI.BTN_CONTINUE)
                        );
                        break;

                    case "Cédula de extranjería":
                        actor.attemptsTo(
                                Click.on(loginUI.CLICK_SELECT),
                                Click.on(loginUI.SELECT_ID_CE),
                                SendKeys.of(user).into(loginUI.INPUT_USER),
                                Click.on(loginUI.CHECK_POLICY_AND_TERMS),
                                Click.on(loginUI.BTN_CONTINUE)
                        );
                        break;

                    case "Usuario":
                      //  if (letters.containsLetters(user)) {
                            actor.attemptsTo(
                                    Click.on(loginUI.CLICK_SELECT),
                                    Click.on(loginUI.SELECT_ID_US),
                                    SendKeys.of(user).into(loginUI.INPUT_USER),
                                    Click.on(loginUI.CHECK_POLICY_AND_TERMS),
                                    Click.on(loginUI.BTN_CONTINUE)
                            );
                     //   }
                        break;

                }
                break;
            case "two":
                switch (idType) {
                    case "Cédula de ciudadanía":
                        actor.attemptsTo(
                                Click.on(loginUI.CLICK_SELECT),
                                Click.on(loginUI.SELECT_ID_CC),
                                SendKeys.of(user).into(loginUI.INPUT_USER),
                                Click.on(loginUI.CHECK_POLICY_AND_TERMS),
                                Click.on(loginUI.CHECK_COMMERCIAL_TERMS),
                                Click.on(loginUI.BTN_CONTINUE)
                        );
                        break;

                    case "Cédula de extranjería":
                        actor.attemptsTo(
                                Click.on(loginUI.CLICK_SELECT),
                                Click.on(loginUI.SELECT_ID_CE),
                                SendKeys.of(user).into(loginUI.INPUT_USER),
                                Click.on(loginUI.CHECK_POLICY_AND_TERMS),
                                Click.on(loginUI.CHECK_COMMERCIAL_TERMS),
                                Click.on(loginUI.BTN_CONTINUE)
                        );
                        break;

                    case "Usuario":
                       // if (letters.containsLetters(user)) {
                            actor.attemptsTo(
                                    Click.on(loginUI.CLICK_SELECT),
                                    Click.on(loginUI.SELECT_ID_US),
                                    SendKeys.of(user).into(loginUI.INPUT_USER),
                                    Click.on(loginUI.CHECK_POLICY_AND_TERMS),
                                    Click.on(loginUI.CHECK_COMMERCIAL_TERMS),
                                    Click.on(loginUI.BTN_CONTINUE)
                            );
                       // }
                        break;
                }
                break;
            case "validations":
                switch (idType) {
                    case "Cédula de ciudadanía":
                        actor.attemptsTo(
                                Click.on(loginUI.CLICK_SELECT),
                                Click.on(loginUI.SELECT_ID_CC),
                                SendKeys.of(user).into(loginUI.INPUT_USER)
                        );
                        break;

                    case "Cédula de extranjería":
                        actor.attemptsTo(
                                Click.on(loginUI.CLICK_SELECT),
                                Click.on(loginUI.SELECT_ID_CE),
                                SendKeys.of(user).into(loginUI.INPUT_USER)
                        );
                        break;

                    case "Usuario":
                      //  if (letters.containsLetters(user)) {
                            actor.attemptsTo(
                                    Click.on(loginUI.CLICK_SELECT),
                                    Click.on(loginUI.SELECT_ID_US),
                                    SendKeys.of(user).into(loginUI.INPUT_USER)
                            );
                     //   }
                        break;
                }
                break;
        }

    }

    public static channels channels(String check, String idType, String user){
        return Tasks.instrumented(channels.class, check, idType, user);
    }
}
