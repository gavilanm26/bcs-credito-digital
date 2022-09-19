package com.bcs.certification.digitalloan.questions;

import com.bcs.certification.digitalloan.UI.loginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class messagesQuestion implements Question {
    private final String validationText;

    public messagesQuestion(String validationText) {
        this.validationText = validationText;
    }

    @Override
    public Object answeredBy(Actor actor) {

        if (loginUI.SELECT_ID_TYPE.equals("Usuario")) {
            if (loginUI.MESSAGE_MIN_CHARACTER_USER_PASSWORD
                    .resolveFor(actor)
                    .isVisible() && Text.of(loginUI.MESSAGE_MIN_CHARACTER_USER_PASSWORD)
                    .viewedBy(actor)
                    .asString()
                    .equals(validationText)
            )
                return true;
            else if (loginUI.MESSAGE_MIN_CHARACTER_PASSWORD
                    .resolveFor(actor)
                    .isVisible() && Text.of(loginUI.MESSAGE_MIN_CHARACTER_PASSWORD)
                    .viewedBy(actor)
                    .asString()
                    .equals(validationText)
            )
                return true;
        } else if (loginUI.MESSAGE_MIN_CHARACTER_3
                .resolveFor(actor)
                .isVisible() && Text.of(loginUI.MESSAGE_MIN_CHARACTER_3)
                .viewedBy(actor)
                .asString()
                .equals(validationText)
        )
            return true;

        else
            return false;

        return false;
    }

    public static messagesQuestion messages(String validationText){
        return new messagesQuestion(validationText);
    }
}
