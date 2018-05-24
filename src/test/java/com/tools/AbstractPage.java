package com.tools;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.pages.PageObject;

public class AbstractPage extends PageObject{

	
	/**
	 * Wait for document ready state for {@link Constants}.PAGE_LOAD_MAX_RETRY time.
	 * 
	 */
	public void waitForPageToLoad() {
		int retry = 0;
		String response = "";
		do {
			try {
				Thread.sleep(Constants.WAIT_TIME_CONSTANT);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			response = String.valueOf(((JavascriptExecutor) getDriver()).executeScript("return document.readyState"));
			retry++;
		} while (retry <= Constants.PAGE_LOAD_MAX_RETRY && response.equals("complete") != true);
	}

	protected void waitForScriptsToLoad() {
		int retry = 0;
		String response = "";
		do {
			try {
				Thread.sleep(Constants.WAIT_TIME_CONSTANT);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			response = String.valueOf(((JavascriptExecutor) getDriver())
					.executeScript("return window.jQuery != undefined && jQuery.active == 0"));
			retry++;
		} while (retry <= Constants.PAGE_LOAD_MAX_RETRY && response.equals("complete") != true);
	}

	protected void waitForElementInvisibilityByCssLocator(String cssLocator) {
		(new WebDriverWait(getDriver(), Constants.WAIT_TIME_LARGE_SEC))
				.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(cssLocator)));
	}

	protected WebElement waitForElementByCssLocator(String cssLocator) {
		return (new WebDriverWait(getDriver(), Constants.WAIT_TIME_LARGE_SEC))
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(cssLocator)));
	}

	protected WebElement waitForElementByCssLocatorToBeClickable(String cssLocator) {
		return (new WebDriverWait(getDriver(), Constants.WAIT_TIME_LARGE_SEC))
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector(cssLocator)));
	}

	protected List<WebElement> waitForElementsByCssLocator(String cssLocator) {
		return (new WebDriverWait(getDriver(), Constants.WAIT_TIME_LARGE_SEC))
				.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(cssLocator)));
	}

	protected void selectFromDropdownByVisibleText(String cssLocator, String textValue) {
		Select selectDropdown = new Select(waitForElementByCssLocator(cssLocator));
		selectDropdown.selectByVisibleText(textValue);
	}

	public void scrollElementIntoView(String cssSelector) {
		((JavascriptExecutor) getDriver()).executeScript("$('" + cssSelector + "')[0].scrollIntoView(true);");
//		((JavascriptExecutor) getDriver()).executeScript(
//				"$('html, body').animate({ scrollBottom: $('" + cssSelector + "').offset().top -200 }, 0);");
	}
}
