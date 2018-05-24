package com.apps.frontend.ra.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.tools.AbstractPage;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;

public class AnswersPage extends AbstractPage {

	@FindBy(css = ".challenge > div > div:nth-child(8)")
	private WebElement answersContainer;
	
	@FindBy(css = "button[tabindex]:not([data-test-id])")
	private WebElement submitAnswersButton;

	public void inputAllAnswers(List<String> answers) {
		element(answersContainer).waitUntilVisible();
		List<WebElement> inputList = answersContainer.findElements(By.cssSelector("input"));
		if (answers.size() >= inputList.size()) {
			for (int i = 0; i < inputList.size(); i++) {
				inputList.get(i).sendKeys(answers.get(i));
			}

		}
	}

	public void clickSubmitAnswers() {
		element(submitAnswersButton).waitUntilVisible();
		submitAnswersButton.click();
	}
}
