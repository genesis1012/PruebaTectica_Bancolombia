package com.test.bancolombia.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.test.bancolombia.userinterface.HomePage.JOIN_TODAY;

import com.test.bancolombia.userinterface.HomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class goTo implements Task{
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.wasAbleTo(openHomePage.HomePage());
		actor.wasAbleTo(Click.on(JOIN_TODAY));
		
	}
	
	public static goTo userRegister() {
		return instrumented(goTo.class);
	}

}
