package com.test.bancolombia.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class locationInformation extends PageObject {
	
	public static final Target CITY = Target.the("Ciudad")
			.located(By.id("city"));
	
	public static final Target SELECT_CITY = Target.the("Seleccionar ciudad")
			.locatedBy("//*[@class='pac-container pac-logo']/div");
	
	public static final Target POSTAL_CODE = Target.the("Codigo postal")
			.located(By.id("zip"));
	
	public static final Target NEXT = Target.the("Codigo postal")
			.locatedBy("//*[@class='btn btn-blue pull-right']/span");

}
