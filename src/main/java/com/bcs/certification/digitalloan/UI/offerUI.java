package com.bcs.certification.digitalloan.UI;

import net.serenitybdd.screenplay.targets.Target;

public class offerUI {

    public static final Target TEXT_VALIDATE_OFFER =
        Target.the("confirm that you are on the offer screen")
            .locatedBy("//p[text()='Personalice su oferta']"
            );

    public static final Target LOADER =
        Target.the("loader")
            .locatedBy("//p[text()='Estamos validando su información']"
            );

    public static final Target AMOUNT_MINOR =
        Target.the("lower amount")
            .locatedBy("//BUTTON[@id='mount-minor']"
            );

    public static final Target AMOUNT_MAYOR =
        Target.the("higher amount")
            .locatedBy("//BUTTON[@id='mount-mayor']"
            );

    public static final Target TERM_MINOR =
        Target.the("confirm that you are on the offer screen")
            .locatedBy("//BUTTON[@id='term-minor']"
            );

    public static final Target TERM_MAYOR =
        Target.the("confirm that you are on the offer screen")
            .locatedBy("//BUTTON[@id='term-mayor']"
            );

    public static final Target BTN_I_WANT_IT =
        Target.the("BTN CONTINUE")
            .locatedBy("//BUTTON[@id='btn-offer']"
            );

}
