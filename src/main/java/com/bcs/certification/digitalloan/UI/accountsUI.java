package com.bcs.certification.digitalloan.UI;

import net.serenitybdd.screenplay.targets.Target;

public class accountsUI {

    public static final Target TEXT_VALIDATE_ACCOUNT =
        Target.the("confirm that you are on the account screen")
            .locatedBy("//P[@class='font-light'][text()='Seleccionar cuenta']"
        );
    public static final Target SELECT_ACCOUNT =
        Target.the("Select account")
            .locatedBy("//div[@itemprop='bankAccountType']"
        );
    public static final Target YES_I_AUTHORIZE =
        Target.the("if I authorize the automatic debit")
            .locatedBy("/html/body/div[1]/div/div[3]/div[2]/div/div/label[2]/span"
        );

    public static final Target I_DO_NOT_AUTHORIZE =
        Target.the("I do not authorize automatic debit\n")
            .locatedBy("/html/body/div[1]/div/div[3]/div[2]/div/div/label[2]/span"
        );

    public static final Target BTN_CONTINUO_ACCOUNT =
        Target.the("Bead button")
            .locatedBy("//*[@id='btn-accounts']"
        );

    public static final Target TXT_NO_ACCOUNTS =
        Target.the("No accounts")
            .locatedBy("//p[contains(@class, 'pb-[70px]')]"
        );

    public static final Target BTN_NO_ACCOUNTS =
        Target.the("Button no accounts")
            .locatedBy("//*[@id='btn-too-many-tries']"
        );
}
