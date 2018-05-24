package com.apps.frontend.ra.pages;

import org.openqa.selenium.WebElement;

import com.tools.AbstractPage;

import net.serenitybdd.core.annotations.findby.FindBy;

public class QuestionnairePage extends AbstractPage{

	@FindBy(css = "button[data-test-id]")
	private WebElement renderTheChallengeButton;
	
	private String questionnaireTitleLocator = ".challenge > div > div:nth-child(8)";
	
	
	public void clickOnRenderTheChallengeButton() {
		element(renderTheChallengeButton).waitUntilVisible();
		renderTheChallengeButton.click();
	}
	
	
	public void scrollToQuestionnaire() {
		scrollElementIntoView(questionnaireTitleLocator);
//		((JavascriptExecutor) getDriver()).executeScript(
//				"$('html, body').animate({ scrollBottom: $('" + questionnaireTitleLocator + "').offset().top -200 }, 0);");
	}
	
	
}
