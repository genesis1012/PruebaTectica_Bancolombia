package com.test.bancolombia.stepsdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.test.bancolombia.tasks.enterInformacionTo;
import com.test.bancolombia.tasks.enterLocation;
import com.test.bancolombia.tasks.goTo;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class RegisterUserStepDefinition {
	
	@Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }
	
	 @Given("^estoy en la pagina de registro$")
	    public void estoy_en_la_pagina_de_registro() {
		 theActorCalled("Heriberto").wasAbleTo(goTo.userRegister());
	    }


	    @When("^ingreso la informacion personal$")
	    public void ingreso_la_informacion_personal() {
	    	theActorInTheSpotlight().attemptsTo(enterInformacionTo.registerForm());
	    }

	    @And("^ingreso la informacion de ubicacion$")
	    public void ingreso_la_informacion_de_ubicacion() {
	    	theActorInTheSpotlight().attemptsTo(enterLocation.informationForm());
	    }

	    @Then("^registro exitoso$")
	    public void registro_exitoso() {
	    	
	    }
}