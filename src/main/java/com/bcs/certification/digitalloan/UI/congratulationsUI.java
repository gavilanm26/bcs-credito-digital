package com.bcs.certification.digitalloan.UI;

import net.serenitybdd.screenplay.targets.Target;

public class congratulationsUI {

    public static final Target TEXT_VALIDATE_QUALIFY =
        Target.the("Validate grade text")
            .locatedBy("//H1[@class='text-center font-semibold lg:font-bold text-3xl sm:text-2xl lg:text-[32px] leading-[30px] text-gray-100 justify-center md:mb-[14px] lg:w-[448px] lg:text-[28px] lg:leading-[30px]'][text()='¿Cómo califica su experiencia adquiriendo el préstamo?']"
            );

    public static final Target TEXT_VALIDATE_CONGRATULATION =
        Target.the("confirm that you are on the congratulation screen")
            .locatedBy("//DIV[@class='text-secondary-100 font-bold text-[32px] mt-6 sm:mt-4'][text()='¡Felicitaciones!']"
            );

    public static final Target RATE_STARS =
        Target.the("rate stars")
            .locatedBy("//div[@id='five']"
            );

    public static final Target BTN_FINISH =
        Target.the("button finish")
            .locatedBy("//BUTTON[@id='btn-outlay-complete']"
            );
}
