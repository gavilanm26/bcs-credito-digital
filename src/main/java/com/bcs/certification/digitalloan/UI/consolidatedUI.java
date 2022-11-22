package com.bcs.certification.digitalloan.UI;

import net.serenitybdd.screenplay.targets.Target;

public class consolidatedUI {
    public static final Target TXT_CONSOLIDATE =
        Target.the("product pending payment")
            .locatedBy("//h1[contains(@class,'text-secondary-100 font-bold')]"
        );

    public static final Target BTN_CONSOLIDATE =
        Target.the("button to return to landing")
            .locatedBy("//*[@id='btn-too-many-tries']"
        );

}
