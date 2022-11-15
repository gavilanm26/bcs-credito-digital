package com.bcs.certification.digitalloan.UI;

import net.serenitybdd.screenplay.targets.Target;

public class summaryUI {

    public static final Target VALIDATE_TEXT_SUMMARY =
        Target.the("confirm that you are on the summary screen")
            .locatedBy("//P[@class='font-light'][text()='Verificación de información']"
            );

    public static final Target EDIT_AMOUNT =
        Target.the("edit amount")
            .locatedBy("(//div[@class='cursor-pointer'])[1]"
            );

    public static final Target EDIT_TERM =
        Target.the("edit term")
            .locatedBy("(//div[@class='cursor-pointer'])[2]"
            );

    public static final Target BTN_ACCOUNT =
        Target.the("edit account")
            .locatedBy("(//div[@class='cursor-pointer'])[3]"
            );

    public static final Target EDIT_DATE =
        Target.the("edit date")
            .locatedBy("(//div[@class='cursor-pointer'])[4]"
            );

    public static final Target BTN_LIFE_INSURANCE =
        Target.the("edit life insurance")
            .locatedBy("(//div[@class='cursor-pointer'])[5]"
            );

    public static final Target BTN_CONTINUE =
        Target.the("button continue")
            .locatedBy("//BUTTON[@id='btn-pagare']"
            );
}
