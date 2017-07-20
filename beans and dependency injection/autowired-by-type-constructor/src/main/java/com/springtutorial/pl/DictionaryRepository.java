package com.springtutorial.pl;

import java.util.HashMap;
import java.util.Map;

public class DictionaryRepository {
	public Map<String, String> getMap() {
		Map<String, String> result = new HashMap<>();
		result.put("a", "A");
		return result;
	}
}
