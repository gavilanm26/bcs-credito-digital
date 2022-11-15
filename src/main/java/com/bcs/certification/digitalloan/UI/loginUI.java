package com.bcs.certification.digitalloan.UI;

import net.serenitybdd.screenplay.targets.Target;

public class loginUI {

    public static final Target TEXT_VALIDATE_LOGIN =
        Target.the("confirm that you are on the login screen")
            .locatedBy("//h1[text()='Bienvenido a']"
            );
    public static final Target CLICK_SELECT =
        Target.the("Click Select")
            .locatedBy("//DIV[@id='documentType-label']"
            );

    public static final Target SELECT_ID_CC =
        Target.the("Select ID CC")
            .locatedBy("//li[text()='Cédula de ciudadanía']"
            );
    public static final Target SELECT_ID_CE =
        Target.the("Select ID CE")
            .locatedBy("//li[text()='Cédula de extranjería']"
            );
    public static final Target SELECT_ID_US =
        Target.the("Select ID US")
            .locatedBy("//li[text()='Usuario']"
            );
    public static final Target INPUT_USER =
        Target.the("Enter User")
            .locatedBy("//INPUT[@id='documentNumber']"
            );

    public static final Target CHECK_POLICY_AND_TERMS =
        Target.the("Enter User")
            .locatedBy("(//input[@type='checkbox'])[1]"
            );

    public static final Target CHECK_COMMERCIAL_TERMS =
        Target.the("Enter User")
            .locatedBy("(//input[@type='checkbox'])[2]"
            );

    public static final Target TEXT_VALIDATE_PASSWORD =
        Target.the("confirm that it asks for the password")
            .locatedBy("//p[contains(@class,'mt-4 text-secondary-100')]"
            );

    public static final Target INPUT_PASSWORD =
        Target.the("Enter Password")
            .locatedBy("//input[@type='password']"
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
            .locatedBy("//span[text()='Máximo 10 caracteres permitidos']"
            );

    public static final Target MESSAGE_MIN_CHARACTER_3 =
        Target.the("Message of minimum 3 characters ")
            .locatedBy("//span[text()='Mínimo 3 caracteres']"
            );

    public static final Target MESSAGE_MIN_8_CHARACTER =
        Target.the("Message of minimum 8 characters")
            .locatedBy("//span[text()='Mínimo 8 caracteres']"
            );

    public static final Target MESSAGE_MAX_CHARACTER_PASSWORD =
        Target.the("Message of maximum 8 characters password")
            .locatedBy("//SPAN[text()='Máximo 8 caracteres permitidos']"
            );

    public static final Target MESSAGE_MAX_CHARACTER_USER =
        Target.the("Message of maximum 18 characters user")
            .locatedBy("//span[text()='Máximo 18 caracteres permitidos']"
            );

    public static final Target MINIMUM_2_NUMBER =
        Target.the("minimum 2 numbers")
            .locatedBy("//span[text()='Debe estar formado por mínimo 2 números']"
            );

    public static final Target PASSWORD_IS_REQUIERED =
        Target.the("Message of Password is required")
            .locatedBy("//SPAN[text()='La contraseña es obligatoria']"
            );

    public static final Target REPEATED_CHARACTERS =
        Target.the("repeated characters")
            .locatedBy("//span[text()='No se permiten caracteres repetidos']"
            );

    public static final Target NO_SPECIAL_CHARACTERS_ALLOWED =
        Target.the("no special characters allowed")
            .locatedBy("//span[text()='No se permiten: ñ caracteres especiales ni espacios']"
            );

    public static final Target INCORRECT_DATA =
        Target.the("Please check and try again")
            .locatedBy("//div[text()='Por favor verifique e intente de nuevo']"
            );

    public static final Target BTN_INCORRECT_DATA =
        Target.the("Button to accept")
            .locatedBy("//button[text()='Aceptar']"
            );

    public static final Target USER_BLOCKED =
        Target.the("User blocked")
            .locatedBy("//div[text()='Usuario bloqueado, por favor intente de nuevo en 24 horas']"
            );

}
