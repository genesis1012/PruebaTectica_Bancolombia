package com.test.bancolombia.tasks;

import static com.test.bancolombia.userinterface.locationInformation.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class enterLocation implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue("Caucasia Antioquia").into(CITY),
				Click.on(SELECT_CITY),
				Enter.theValue("2255").into(POSTAL_CODE),
				Click.on(NEXT)
				);
		
	}
	
	public static enterLocation informationForm() {
		return instrumented(enterLocation.class);
	}
	

}
