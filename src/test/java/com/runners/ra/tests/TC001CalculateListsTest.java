package com.runners.ra.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.apps.frontend.ra.steps.ReactAppSteps;
import com.tools.Constants;
import com.tools.ListCalculator;
import com.tools.PrintUtils;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class TC001CalculateListsTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public ReactAppSteps reactAppSteps;
    
    public String baseUrl;
	public List<String> testList= new ArrayList<String>();
    
    @Before
    public void dataSetup() {
    	baseUrl = Constants.BASE_URL;
    	testList.add("10");
    	testList.add("15");
    	testList.add("5");
    	testList.add("7");
    	testList.add("1");
    	testList.add("24");
    	testList.add("36");
    	testList.add("2");
    }
    
    @Test
    public void tc001CalculateListsTest() {
    	reactAppSteps.navigateTo(baseUrl);
    	reactAppSteps.moveToQuestion();
    	Map<String, List<String>> mapList = reactAppSteps.grabRowsData();
    	
    	PrintUtils.printMapList(mapList);
//    	[10, 15, 5, 7, 1, 24, 36, 2]
    	mapList.put("x", testList);
    	
    	ListCalculator.calculateAnswers(mapList);
    }
}
