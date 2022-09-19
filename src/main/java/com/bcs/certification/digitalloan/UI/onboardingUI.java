package com.bcs.certification.digitalloan.UI;

import net.serenitybdd.screenplay.targets.Target;

public class onboardingUI {

    public static final Target BTN_ONBOARDING =
            Target.the("Button verifique aqui")
            .locatedBy("(//button[text()='¡Solicitar mi crédito!'])[1]"
    );

    public static final Target BTN_ONBOARDING2 =
            Target.the("Button verifique aqui")
                    .locatedBy("(//button[text()='¡Solicitar mi crédito!'])[2]"
                    );

    public static final Target VALIDATE_TEXT_ONBOARDING =
            Target.the("confirm that you are on the onboarding screen")
                    .locatedBy("//h2[text()='Tiene un crédito preaprobado de libre inversión']"
            );
}
