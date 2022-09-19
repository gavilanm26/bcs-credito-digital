package com.bcs.certification.digitalloan.tasks;

import com.bcs.certification.digitalloan.UI.otpUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.SendKeys;

public class otp implements Task {

    private final String numberotp;

    public otp(String numberotp) {
        this.numberotp = numberotp;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of(numberotp).into(otpUI.INPUT_OTP)
        );
    }

    public static otp otpTask(String numberotp) {
        return Tasks.instrumented(otp.class, numberotp);
    }
}
