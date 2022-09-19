package com.bcs.certification.digitalloan.tasks;

import com.bcs.certification.digitalloan.UI.onboardingUI;
import com.bcs.certification.digitalloan.utils.hasletters.hasLetters;
import com.bcs.certification.digitalloan.UI.loginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

public class login implements Task {

    private String idType;
    private String user;
    private String password;
    private String messasge = "Máximo 10 caracteres permitidos";
    private boolean flag = false;
    hasLetters letters = new hasLetters();

    public login(String idType, String user, String password) {
        this.idType = idType;
        this.user = user;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (idType.equals("Cédula de ciudadanía") && user.equals("NA") && password.equals("NA")){
            actor.attemptsTo(
                    SendKeys.of(idType).into(loginUI.SELECT_ID_TYPE)
            );
        }
        else if (idType.equals("Cédula de extranjería") && user.equals("NA") && password.equals("NA")){
            actor.attemptsTo(
                    SendKeys.of(idType).into(loginUI.SELECT_ID_TYPE)
            );
        }
        else if (idType.equals("Usuario") && user.equals("NA") && password.equals("NA")){
            actor.attemptsTo(
                    SendKeys.of(idType).into(loginUI.SELECT_ID_TYPE)
            );
        }
        else if(idType.equals("NA")) {
            actor.attemptsTo(
                    SendKeys.of(user).into(loginUI.INPUT_USER),
                    SendKeys.of(password).into(loginUI.INPUT_PASSWORD)
            );
        }
        else if (user.equals("NA")){
            actor.attemptsTo(
                    SendKeys.of(idType).into(loginUI.SELECT_ID_TYPE),
                    SendKeys.of(password).into(loginUI.INPUT_PASSWORD)
            );
        }
        else if (password.equals("NA")){
            actor.attemptsTo(
                    SendKeys.of(idType).into(loginUI.SELECT_ID_TYPE),
                    SendKeys.of(user).into(loginUI.INPUT_USER)
            );
        }
        else if (idType.equals("Cédula de ciudadanía") && letters.containsLetters(user)){
            actor.attemptsTo(
                    SendKeys.of(idType).into(loginUI.SELECT_ID_TYPE),
                    SendKeys.of(user).into(loginUI.INPUT_USER),
                    SendKeys.of(password).into(loginUI.INPUT_PASSWORD)
            );
        }
        else if (idType.equals("Cédula de extranjería") && letters.containsLetters(user)){
            actor.attemptsTo(
                    SendKeys.of(idType).into(loginUI.SELECT_ID_TYPE),
                    SendKeys.of(user).into(loginUI.INPUT_USER),
                    SendKeys.of(password).into(loginUI.INPUT_PASSWORD)

            );
        }
        else if (
                idType != "Usuario" &&
                user.length() < 3 ||
                user.length() > 10
            ){
                actor.attemptsTo(
                    SendKeys.of(idType).into(loginUI.SELECT_ID_TYPE),
                    SendKeys.of(user).into(loginUI.INPUT_USER),
                    SendKeys.of(password).into(loginUI.INPUT_PASSWORD)
                );
            if(messasge.equals(loginUI.MESSAGE_MAX_CHARACTER))
                flag = true;
        }
        else if (
                idType.equals("Usuario") &&
                        user.length() < 8 ||
                        user.length() > 18
        ){
            actor.attemptsTo(
                    SendKeys.of(idType).into(loginUI.SELECT_ID_TYPE),
                    SendKeys.of(user).into(loginUI.INPUT_USER),
                    SendKeys.of(password).into(loginUI.INPUT_PASSWORD)

            );
            if(messasge.equals(loginUI.MESSAGE_MAX_CHARACTER))
                flag = true;
        }
        else if (password.length() > 8){
            actor.attemptsTo(
                    SendKeys.of(idType).into(loginUI.SELECT_ID_TYPE),
                    SendKeys.of(user).into(loginUI.INPUT_USER),
                    SendKeys.of(password).into(loginUI.INPUT_PASSWORD)

            );
            if(messasge.equals(loginUI.MESSAGE_MAX_CHARACTER))
                flag = true;
        }

        else {
            actor.attemptsTo(
                    SendKeys.of(idType).into(loginUI.SELECT_ID_TYPE),
                    SendKeys.of(user).into(loginUI.INPUT_USER),
                    SendKeys.of(password).into(loginUI.INPUT_PASSWORD),
                    Click.on(loginUI.BTN_CONTINUE)
            );
        }
    }


    public static login login(String idType, String user, String password) {
        return Tasks.instrumented(login.class, idType, user, password);
    }
}
