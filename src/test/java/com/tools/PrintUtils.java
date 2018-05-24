package com.tools;

import java.util.List;
import java.util.Map;

public class PrintUtils {

	public static void printMapList(Map<String,List<String>> mapList) {
		for (String key : mapList.keySet()) {
			System.out.println("Key: " + key + " list: " + mapList.get(key).toString());
		}
	}
}
