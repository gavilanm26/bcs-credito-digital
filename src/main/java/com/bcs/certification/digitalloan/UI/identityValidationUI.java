package com.bcs.certification.digitalloan.UI;

import net.serenitybdd.screenplay.targets.Target;

public class identityValidationUI {

    public static final Target TXT_IDENTITY_VALIDATION =
        Target.the("Text identity validation")
            .locatedBy("//h1[text()='Por su seguridad validaremos su identidad']"
            );

    public static final Target BTN_CONTINUE =
        Target.the("Button continue")
            .locatedBy("//button[text()='Continuar']"
            );

    public static final Target TEXT_QUESTION =
            Target.the("identity validation questions\n")
                    .locatedBy("//button[text()='Continuar']"
                    );

}
