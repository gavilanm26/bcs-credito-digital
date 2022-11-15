package com.bcs.certification.digitalloan.UI;

import net.serenitybdd.screenplay.targets.Target;

public class landingUI {

    public static final Target BTN_ONBOARDING =
        Target.the("Button verifique aqui")
            .locatedBy("//BUTTON[@id='btn-on-boarding-1']"
            );

    public static final Target BTN_ONBOARDING2 =
        Target.the("Button verifique aqui 2")
            .locatedBy("//BUTTON[@id='btn-on-boarding-1']"
            );

    public static final Target VALIDATE_TEXT_ONBOARDING =
        Target.the("confirm that you are on the onboarding screen")
            .locatedBy("//h1[text()='Le damos la bienvenida a']"
            );
}
