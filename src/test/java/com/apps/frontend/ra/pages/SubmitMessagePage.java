package com.apps.frontend.ra.pages;

import org.openqa.selenium.WebElement;

import com.tools.AbstractPage;

import net.serenitybdd.core.annotations.findby.FindBy;

public class SubmitMessagePage extends AbstractPage{

	@FindBy(css = ".dialog")
	private WebElement messageContainer;
	
	public String grabSubmitMessage() {
		element(messageContainer).waitUntilVisible();
		return messageContainer.getText();
	}
}
