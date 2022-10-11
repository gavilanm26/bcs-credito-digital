package com.bcs.certification.digitalloan.UI;

import net.serenitybdd.screenplay.targets.Target;

public class loginUI {

    public static final Target TEXT_VALIDATE_LOGIN =
            Target.the("confirm that you are on the offer screen")
                    .locatedBy("//H1[@id='title-Login']"
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
            .locatedBy("(//input[@type='checkbox'])[2]"
            );

    public static final Target CHECK_COMMERCIAL_TERMS =
        Target.the("Enter User")
            .locatedBy("(//input[@type='checkbox'])[3]"
            );

    public static final Target TEXT_VALIDATE_PASSWORD =
            Target.the("confirm that it asks for the password")
                    .locatedBy("(//span[@role='paragraph'])[1]"
                    );

    public static final Target INPUT_PASSWORD =
            Target.the("Enter Password")
                    .locatedBy("//INPUT[@id='password']"
                    );

    public static final Target BTN_CONTINUE =
            Target.the("Button Continue")
                    .locatedBy("//BUTTON[@id='btn-login']"
                    );

    public static final Target BTN_CONTINUE2 =
            Target.the("Button Continue 2")
                    .locatedBy("//button[text()='Iniciar']"
                    );

    public static final Target BTN_FORGOT_PASSWORD =
            Target.the("forgot password")
                    .locatedBy("//A[@id='forgot-your-password']"
                    );

    public static final Target MESSAGE_MAX_CHARACTER =
            Target.the("Message of maximum 10 characters ")
                    .locatedBy("//SPAN[text()='Máximo 10 caracteres permitidos']"
                    );

    public static final Target MESSAGE_MIN_CHARACTER_3 =
            Target.the("Message of minimum 3 characters ")
                    .locatedBy("//SPAN[text()='Mínimo 3 caracteres']"
                    );

    public static final Target MESSAGE_MIN_CHARACTER_PASSWORD =
            Target.the("Message of minimum 8 characters password")
                    .locatedBy("(//SPAN[text()='Mínimo 8 caracteres'])[1]"
                    );

    public static final Target MESSAGE_MIN_CHARACTER_USER_PASSWORD =
            Target.the("Message of minimum 8 characters password")
                    .locatedBy("(//SPAN[text()='Mínimo 8 caracteres'])[2]"
                    );

    public static final Target MESSAGE_MAX_CHARACTER_PASSWORD =
            Target.the("Message of maximum 8 characters password")
                    .locatedBy("//SPAN[text()='Máximo 8 caracteres permitidos']"
                    );

    public static final Target MESSAGE_MAX_CHARACTER_USER =
            Target.the("Message of maximum 18 characters user")
                    .locatedBy("//SPAN[text()='Máximo 18 caracteres permitidos']"
                    );

    public static final Target THE_DOCUMENT_IS_MANDATORY =
            Target.the("Message of The document is mandatory")
                    .locatedBy("//SPAN[text()='El documento es obligatorio']"
                    );

    public static final Target PASSWORD_IS_REQUIERED =
            Target.the("Message of Password is required")
                    .locatedBy("//SPAN[text()='La contraseña es obligatoria']"
                    );

    public static final Target REPEATED_CHARACTERS =
            Target.the("repeated characters")
                    .locatedBy("//SPAN[text()='No se permiten caracteres repetidos']"
                    );

    public static final Target AT_LEAST_2_NUMBERS =
            Target.the("must have at least 2 numbers")
                    .locatedBy("//SPAN[text()='Debe estar formado por mínimo 2 números']"
                    );

    public static final Target NO_SPECIAL_CHARACTERS_ALLOWED =
            Target.the("no special characters allowed")
                    .locatedBy("//SPAN[@class='text-alert-error-300 mt-1 text-xs font-medium']"
                    );

    public static final Target INCORRECT_DATA =
            Target.the("Please check and try again")
                    .locatedBy("//DIV[@class='error-message'][text()='Por favor verifique e intente de nuevo']"
                    );

    public static final Target BTN_INCORRECT_DATA =
            Target.the("BUTTON TO ACCEPT")
                    .locatedBy("//BUTTON[@id='btn-modal']"
                    );

    public static final Target CLOSE_INCORRECT_DATA =
            Target.the("close details")
                    .locatedBy("//button[@class='text-gray-400 bg-transparent hover:bg-gray-200 hover:text-gray-900 rounded-lg text-sm p-1.5 ml-auto inline-flex items-center dark:hover:bg-gray-600 dark:hover:text-white']"
                    );

}
