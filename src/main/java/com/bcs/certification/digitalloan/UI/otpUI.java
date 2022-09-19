package com.bcs.certification.digitalloan.UI;

import net.serenitybdd.screenplay.targets.Target;

public class otpUI {

    public static final Target TEXT_VALIDATE_OTP =
            Target.the("confirm that you are on the OTP screen")
                    .locatedBy("//P[@class='font-light'][text()='Firma de pagaré']"
                    );

    public static final Target INPUT_OTP =
            Target.the("enter sms code")
                    .locatedBy("//INPUT[@aria-label='Please enter verification code. Digit 1']"
                    );

    public static final Target SPAN_RESEND =
            Target.the("retry the code")
                    .locatedBy("//SPAN[@id='reSend']"
                    );

    public static final Target COUNTER =
            Target.the("counter at 0")
                    .locatedBy("//P[@class='text-center text-secondary-200 mt-3 font-medium']"
                    );
}
