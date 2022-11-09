package com.bcs.certification.digitalloan.questions;

import com.bcs.certification.digitalloan.UI.loginUI;
import com.bcs.certification.digitalloan.UI.offerUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class messagesQuestion implements Question {
    private final String validationText;
    private final String type;

    public messagesQuestion(String type, String validationText) {
        this.validationText = validationText;
        this.type = type;
    }

    @Override
    public Object answeredBy(Actor actor) {

        switch (type) {
            case "Cédula de ciudadanía":
            case "Cédula de extranjería":
                switch (validationText) {
                    case "Mínimo 3 caracteres":

                        if (loginUI.MESSAGE_MIN_CHARACTER_3
                            .resolveFor(actor)
                            .isVisible() && Text.of(loginUI.MESSAGE_MIN_CHARACTER_3)
                            .viewedBy(actor)
                            .asString()
                            .equals(validationText)
                        )
                            return true;
                        break;
                    case "Máximo 10 caracteres permitidos":

                        if (loginUI.MESSAGE_MAX_CHARACTER
                            .resolveFor(actor)
                            .isVisible() && Text.of(loginUI.MESSAGE_MAX_CHARACTER)
                            .viewedBy(actor)
                            .asString()
                            .equals(validationText)
                        )
                            return true;
                        break;
                }
                break;
            case "Usuario":
                switch (validationText) {
                    case "Mínimo 8 caracteres":

                        if (loginUI.MESSAGE_MIN_8_CHARACTER
                            .resolveFor(actor)
                            .isVisible() && Text.of(loginUI.MESSAGE_MIN_8_CHARACTER)
                            .viewedBy(actor)
                            .asString()
                            .equals(validationText)
                        )
                            return true;
                        break;
                    case "Máximo 18 caracteres permitidos":

                        if (loginUI.MESSAGE_MAX_CHARACTER_USER
                            .resolveFor(actor)
                            .isVisible() && Text.of(loginUI.MESSAGE_MAX_CHARACTER_USER)
                            .viewedBy(actor)
                            .asString()
                            .equals(validationText)
                        )
                            return true;
                        break;
                    case "Debe estar formado por mínimo 2 números":

                        if (loginUI.MINIMUM_2_NUMBER
                            .resolveFor(actor)
                            .isVisible() && Text.of(loginUI.MINIMUM_2_NUMBER)
                            .viewedBy(actor)
                            .asString()
                            .equals(validationText)
                        )
                            return true;
                        break;
                    case "No se permiten caracteres repetidos":

                        if (loginUI.REPEATED_CHARACTERS
                            .resolveFor(actor)
                            .isVisible() && Text.of(loginUI.REPEATED_CHARACTERS)
                            .viewedBy(actor)
                            .asString()
                            .equals(validationText)
                        )
                            return true;
                        break;
                    case "No se permiten: ñ caracteres especiales ni espacios":

                        if (loginUI.NO_SPECIAL_CHARACTERS_ALLOWED
                            .resolveFor(actor)
                            .isVisible() && Text.of(loginUI.NO_SPECIAL_CHARACTERS_ALLOWED)
                            .viewedBy(actor)
                            .asString()
                            .equals(validationText)
                        )
                            return true;
                        break;

                    default:
                        throw new IllegalStateException("Unexpected value: " + validationText);
                }
                break;
        }

        return false;
    }

    public static messagesQuestion messages(String type, String validationText){
        return new messagesQuestion(type, validationText);
    }
}
