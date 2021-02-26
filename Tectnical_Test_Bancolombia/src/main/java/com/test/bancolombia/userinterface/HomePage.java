package com.test.bancolombia.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;

@DefaultUrl("https://www.utest.com/")
public class HomePage extends PageObject{
	
	@WhenPageOpens
	public void waitUntilMainElementsAppears() {
		getDriver().manage().window().maximize();
	}
	
	public static final Target JOIN_TODAY = Target.the("Registro de usuario")
			.locatedBy("//*[@class='nav navbar-nav']//*[contains(@class,'sign-up')]");

}
