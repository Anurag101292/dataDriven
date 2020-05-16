package com.CN.rough;

import java.util.HashMap;
import java.util.Map;

public class Countcharacter {

	public static void count(String s) {

		char[] charArray = s.toCharArray();

		Map<Character, Integer> basemap = new HashMap<Character, Integer>();
		for (Character ch : charArray) {
			if (basemap.containsKey(ch))

			{
				basemap.put(ch, basemap.get(ch) + 1);
			} else {
				basemap.put(ch, 1);
			}
		}
		System.out.println(basemap);
	}
	public static void main(String[] args) {
		Countcharacter.count("anurag");
	}
}
