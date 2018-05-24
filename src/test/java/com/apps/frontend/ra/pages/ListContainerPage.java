package com.apps.frontend.ra.pages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.tools.AbstractPage;

import net.serenitybdd.core.annotations.findby.FindBy;


public class ListContainerPage extends AbstractPage {

	@FindBy(css = ".challenge > div > div:nth-child(7)")
	private WebElement numbersListContainer;

	public Map<String, List<String>> grabRowsData() {
		Map<String, List<String>> results = new HashMap<String, List<String>>();

		element(numbersListContainer).waitUntilVisible();
		// extract all rows in the webpage
		List<WebElement> numberListElements = numbersListContainer.findElements(By.cssSelector("tr"));

		int mapKey = 0;

		// iterate through the rows
		for (WebElement rowNow : numberListElements) {
			mapKey++;
			// extract cells from the current number row
			List<WebElement> cellsElements = rowNow.findElements(By.cssSelector("td"));
			if (cellsElements.size() > 0) {
				List<String> rowExtractedElements = new ArrayList<String>();
				for (WebElement cellNow : cellsElements) {
					rowExtractedElements.add(cellNow.getText());
				}
				results.put(String.valueOf(mapKey), rowExtractedElements);
			}

		}

		return results;
	}
}
