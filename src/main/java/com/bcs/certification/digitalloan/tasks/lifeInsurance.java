package com.bcs.certification.digitalloan.tasks;

import com.bcs.certification.digitalloan.UI.lifeInsuranceUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

public class lifeInsurance implements Task {

    private final String beneficiaries;
    private final String name;
    private final String lastName;
    private final String relationship;
    private final String percentage;

    public lifeInsurance(String beneficiaries, String name, String lastName, String relationship, String percentage) {
        this.beneficiaries = beneficiaries;
        this.name = name;
        this.lastName = lastName;
        this.relationship = relationship;
        this.percentage = percentage;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(lifeInsuranceUI.HREF_SEE_DETAILS),
                Click.on(lifeInsuranceUI.CLOSE_DETAILS),
                SendKeys.of(beneficiaries).into(lifeInsuranceUI.SELECT_BENEFICIARIES),
                SendKeys.of(name).into(lifeInsuranceUI.INPUT_FIRSTNAME),
                SendKeys.of(lastName).into(lifeInsuranceUI.INPUT_LASTNAME),
                SendKeys.of(relationship).into(lifeInsuranceUI.SELECT_RELATIONSHIP),
                Click.on(lifeInsuranceUI.SELECT_PERCENTAGE),
                Click.on(lifeInsuranceUI.BTN_CONTINUE)

        );
    }
    public static lifeInsurance beneficiaries(String beneficiaries, String name, String lastName, String relationship, String percentage) {
        return Tasks.instrumented(lifeInsurance.class, beneficiaries, name, lastName, relationship, percentage);
    }
}
