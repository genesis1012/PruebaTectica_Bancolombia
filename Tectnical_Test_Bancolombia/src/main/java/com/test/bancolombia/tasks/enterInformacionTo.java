package com.test.bancolombia.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.test.bancolombia.userinterface.personalInformation.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class enterInformacionTo implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue("Heri").into(NAME),
				Enter.theValue("GENES").into(LAST_NAME),
				Enter.theValue("Heri@TESTR.COM").into(EMAIL),
				Enter.theValue("Heri").into(NAME),
				SelectFromOptions.byVisibleText("July").from(MONTH),
				SelectFromOptions.byVisibleText("19").from(DAY),
				SelectFromOptions.byVisibleText("1990").from(YEAR),
				Enter.theValue("Spanish").into(LANGUAGES),
				Click.on(SELECT_LANGUAGE),
				Click.on(NEXT)
				);
		
	}

	public static enterInformacionTo registerForm() {
		return instrumented(enterInformacionTo.class);
	}
	
}
