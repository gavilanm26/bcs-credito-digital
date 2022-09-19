package com.bcs.certification.digitalloan.UI;

import net.serenitybdd.screenplay.targets.Target;

public class channelsUI {

    public static final Target TEXT_VALIDATE_LOGIN =
        Target.the("confirm that you are on the offer screen")
            .locatedBy("//span[@role='paragraph']"
            );
    public static final Target SELECT_ID_TYPE =
        Target.the("Select ID Type")
            .locatedBy("//SELECT[@id='documentType']"
            );
    public static final Target INPUT_USER =
        Target.the("Enter User")
            .locatedBy("//INPUT[@id='documentNumber']"
            );

    public static final Target CHECK_POLICY_AND_TERMS =
        Target.the("Enter User")
            .locatedBy("//INPUT[@id='policy_and_terms']"
            );

    public static final Target CHECK_COMMERCIAL_TERMS =
        Target.the("Enter User")
            .locatedBy("//INPUT[@id='commercial_terms']"
            );

    public static final Target BTN_CONTINUE =
        Target.the("Button Continue")
            .locatedBy("//BUTTON[@id='btn-login']"
            );
    public static final Target TXT_PASSWORD =
        Target.the("Text Password")
            .locatedBy("(//span[@role='paragraph'])[2]"
            );

}
