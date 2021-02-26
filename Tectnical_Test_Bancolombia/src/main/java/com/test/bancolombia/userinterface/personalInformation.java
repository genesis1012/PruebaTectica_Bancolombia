package com.test.bancolombia.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class personalInformation extends PageObject {
	
	public static final Target NAME = Target.the("Nombre")
			.located(By.id("firstName"));
	
	public static final Target LAST_NAME = Target.the("Apellido")
			.located(By.id("lastName"));
	
	public static final Target EMAIL = Target.the("Email")
			.located(By.id("email"));
	
	public static final Target MONTH = Target.the("Mes")
			.located(By.id("birthMonth"));
	
	public static final Target DAY = Target.the("Dia")
			.located(By.id("birthDay"));
	
	public static final Target YEAR = Target.the("Año")
			.located(By.id("birthYear"));
	
	public static final Target LANGUAGES = Target.the("Lenguage")
			.locatedBy("//*[@id='languages']//*[@type='search']");
	
	public static final Target SELECT_LANGUAGE = Target.the("Seleccionar lenguage")
			.located(By.className("ui-select-highlight"));
	
	public static final Target NEXT = Target.the("Siguiente Formulario")
			.locatedBy("//*[@class='btn btn-blue']/span");

}
