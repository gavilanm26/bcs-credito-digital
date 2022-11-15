package com.bcs.certification.digitalloan.UI;

import net.serenitybdd.screenplay.targets.Target;

public class accountsUI {

    public static final Target TEXT_VALIDATE_ACCOUNT =
        Target.the("confirm that you are on the account screen")
            .locatedBy("//P[@class='font-light'][text()='Seleccionar cuenta']"
            );
    public static final Target SELECT_ACCOUNT =
        Target.the("Select account")
            .locatedBy("(//DIV[@class='flex justify-between items-center'])[1]"
            );
    public static final Target CHECK_AUTHORIZATION =
        Target.the("automatic debit authorization")
            .locatedBy("(//SPAN[@class='checkmark ml-2 mr-2 border border-secondary-200 mt-1'])[2]"
            );

    public static final Target BTN_CONTINUO_ACCOUNT =
        Target.the("Continuo after select account")
            .locatedBy("//BUTTON[@id='btn-accounts']"
            );
}
