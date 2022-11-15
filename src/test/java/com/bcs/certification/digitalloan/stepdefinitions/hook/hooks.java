package com.bcs.certification.digitalloan.stepdefinitions.hook;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.util.EnvironmentVariables;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class hooks {

    private EnvironmentVariables environmentVariables;
    private static int count = 0;
    //private WebDriver driver;

 /*   @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("actor");

        String browser = environmentVariables.optionalProperty("enviroments.dev.base.url")
                .orElse("enviroments.qa.base.url");

       // OnStage.theActorInTheSpotlight().whoCan(BrowseTheWeb.with(environmentVariables));
    }*/

    @Before
    public void setThestage(){
        count++;
        OnStage.setTheStage(
                new OnlineCast()
        );
        OnStage.theActorCalled("actor");

        System.out.println("Se esta ejecutando el escenario número: " + count);

    }

    @After
    public void tearDown() {
        System.out.println("El escenario número: " + count + " se ha ejecutado");
        //driver.close();
    }

}
