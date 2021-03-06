package com.apps.frontend.ra.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.apps.frontend.ra.pages.AnswersPage;
import com.apps.frontend.ra.pages.ListContainerPage;
import com.apps.frontend.ra.pages.QuestionnairePage;
import com.apps.frontend.ra.pages.SubmitMessagePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ReactAppSteps extends ScenarioSteps{

	private static final long serialVersionUID = 1L;
	
	QuestionnairePage questionnairePage;
	ListContainerPage listContainerPage;
	AnswersPage answersPage;
	SubmitMessagePage submitMessagePage;
	
	@Step
	public void navigateTo(String baseUrl) {
		getDriver().get(baseUrl);
	}
	
	@Step
	public void moveToQuestion() {
		questionnairePage.clickOnRenderTheChallengeButton();
		
	}

	
	@Step
	public void inputAllAnswers(List<String> answers) {
		answersPage.inputAllAnswers(answers);
	}

	@Step
	public void clickSubmitAnswers() {
		answersPage.clickSubmitAnswers();		
	}
	
	/**
	 * Extract message after form submit.
	 * @return
	 */
	public String grabSubmitMessage() {
		return submitMessagePage.grabSubmitMessage();
	}
	
	/**
	 * Grab data as Map of Lists
	 */
	//Method does not have a @Step annotation because we dont want it in the final
	//html report
	public Map<String, List<String>>  grabRowsData() {
		return listContainerPage.grabRowsData();
	}
	
	@Step
	public void verifySubmitMessage(String expectedMessage, String actualMessage) {
		Assert.assertTrue("Failure: message not as expected. Expected: " + expectedMessage + " - Actual: " + actualMessage, actualMessage.contains(expectedMessage));

	}
}
