package com.tools;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ListCalculator {

	// Once you have each array, write a function that is able to return the index
	// of the array where the sum of integers at the index on the left is equal to
	// the sum of integers on the right.
	// If there is no index return null
	public static List<String> calculateAnswers(Map<String, List<String>> mapList) {
		List<String> results = new ArrayList<String>();

		for (String key : mapList.keySet()) {
			System.out.println("----- New List: " + key);
			String answer = "null";
			List<String> currentDataList = mapList.get(key);

			answer = calculateRowMiddle(currentDataList);
			results.add(answer);

		}
		System.out.println("===============================================");
		System.out.println(results.toString());

		return results;
	}

	// if(currentDataList.size() > 0) {
	// for (String valueNow : currentDataList) {
	// frontSum += Integer.valueOf(valueNow);
	// backSum +=Integer.valueOf(currentDataList.get(index--));
	// if
	// }
	private static String calculateRowMiddle(List<String> currentDataList) {
		System.out.println("===============================================");
		System.out.println(currentDataList);
		String middleResult = "null";
		boolean isListEmpty = false;
		if (currentDataList.size() > 0) {
			int frontSum = 0;
			int backSum = 0;

			int backIndex = currentDataList.size()-1;
			int frontIndex = 0;

			frontSum += Integer.valueOf(currentDataList.get(frontIndex));
			backSum += Integer.valueOf(currentDataList.get(backIndex));

			do {
				System.out.println("Print Indexes: " + frontIndex + ":" + backIndex);
				System.out.println("Print sums: " + frontSum + "==" + backSum);

				
				if (frontSum > backSum) {
					backSum += Integer.valueOf(currentDataList.get(backIndex--));
				} else {
					frontSum += Integer.valueOf(currentDataList.get(frontIndex++));
				}
				
				
				if (frontSum == backSum) {
					isListEmpty = true;
					middleResult = String.valueOf(backIndex);
				}

				//exit condition
				if (frontIndex >= backIndex) {
					isListEmpty = true;
				}

			} while (!isListEmpty);

		} else
			System.out.println("The list is empty...");

		return middleResult;
	}

}
