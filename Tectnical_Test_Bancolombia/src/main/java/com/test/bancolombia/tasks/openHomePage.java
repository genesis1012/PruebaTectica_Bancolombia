package com.test.bancolombia.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.test.bancolombia.userinterface.HomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class openHomePage implements Task{
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.wasAbleTo(Open.browserOn().the(HomePage.class));
	}
	
	public static openHomePage HomePage() {
		return instrumented(openHomePage.class);
	}

}
