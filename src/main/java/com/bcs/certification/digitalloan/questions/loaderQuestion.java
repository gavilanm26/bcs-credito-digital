package com.bcs.certification.digitalloan.questions;

import com.bcs.certification.digitalloan.UI.offerUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class loaderQuestion implements Question {

    private final String loader;

    public loaderQuestion(String loader) {
        this.loader = loader;
    }

    @Override
    public Object answeredBy(Actor actor) {
        WaitUntil.the(offerUI.LOADER, WebElementStateMatchers.isVisible())
            .forNoMoreThan(1000)
            .seconds();

        return Text.of(offerUI.LOADER)
            .answeredBy(actor)
            .contains(loader);
    }
    public static loaderQuestion loader(String loader){
        return new loaderQuestion(loader);
    }

}
