package code;

import java.util.Map;

public class Map1 {

	// Modify and return the given map as follows: if the key "a" has a value,
	// set the key "b" to have that value, and set the key "a" to have the value
	// "". Basically "b" is a bully, taking the value and replacing it with the
	// empty string.
	//
	// mapBully({"b": "dirt", "a": "candy"}) ¡ú {"b": "candy", "a": ""}
	// mapBully({"a": "candy"}) ¡ú {"b": "candy", "a": ""}
	// mapBully({"b": "carrot", "c": "meh", "a": "candy"}) ¡ú {"b": "candy", "c":
	// "meh", "a": ""}
	public Map<String, String> mapBully(Map<String, String> map) {
		if (map.containsKey("a")) {
			map.put("b", map.get("a"));
			map.put("a", "");
		}
		return map;
	}

	// Modify and return the given map as follows: if the key "a" has a value,
	// set the key "b" to have that same value. In all cases remove the key "c",
	// leaving the rest of the map unchanged.
	//
	// mapShare({"b": "bbb", "c": "ccc", "a": "aaa"}) ¡ú {"b": "aaa", "a": "aaa"}
	// mapShare({"b": "xyz", "c": "ccc"}) ¡ú {"b": "xyz"}
	// mapShare({"d": "hi", "c": "meh", "a": "aaa"}) ¡ú {"d": "hi", "b": "aaa",
	// "a": "aaa"}
	public Map<String, String> mapShare(Map<String, String> map) {
		if (map.containsKey("a")) {
			map.put("b", map.get("a"));
		}
		if (map.containsKey("c")) {
			map.remove("c");
		}
		return map;
	}

	// Modify and return the given map as follows: for this problem the map may
	// or may not contain the "a" and "b" keys. If both keys are present, append
	// their 2 string values together and store the result under the key "ab".
	//
	// mapAB({"b": "There", "a": "Hi"}) ¡ú {"b": "There", "a": "Hi", "ab":
	// "HiThere"}
	// mapAB({"a": "Hi"}) ¡ú {"a": "Hi"}
	// mapAB({"b": "There"}) ¡ú {"b": "There"}
	public Map<String, String> mapAB(Map<String, String> map) {
		if (map.containsKey("a") && map.containsKey("b")) {
			String a = map.get("a");
			String b = map.get("b");
			String c = a + b;
			map.put("ab", c);
		}
		return map;
	}

	// Given a map of food keys and topping values, modify and return the map as
	// follows: if the key "ice cream" is present, set its value to "cherry". In
	// all cases, set the key "bread" to have the value "butter".
	//
	// topping1({"ice cream": "peanuts"}) ¡ú {"bread": "butter", "ice cream":
	// "cherry"}
	// topping1({}) ¡ú {"bread": "butter"}
	// topping1({"pancake": "syrup"}) ¡ú {"bread": "butter", "pancake": "syrup"}
	public Map<String, String> topping1(Map<String, String> map) {
		if (map.containsKey("ice cream")) {
			map.put("ice cream", "cherry");
		}
		map.put("bread", "butter");
		return map;
	}

	// Given a map of food keys and their topping values, modify and return the
	// map as follows: if the key "ice cream" has a value, set that as the value
	// for the key "yogurt" also. If the key "spinach" has a value, change that
	// value to "nuts".
	//
	// topping2({"ice cream": "cherry"}) ¡ú {"yogurt": "cherry", "ice cream":
	// "cherry"}
	// topping2({"spinach": "dirt", "ice cream": "cherry"}) ¡ú {"yogurt":
	// "cherry", "spinach": "nuts", "ice cream": "cherry"}
	// topping2({"yogurt": "salt"}) ¡ú {"yogurt": "salt"}
	public Map<String, String> topping2(Map<String, String> map) {
		if (map.containsKey("ice cream")) {
			map.put("yogurt", map.get("ice cream"));
		}
		if (map.containsKey("spinach")) {
			map.put("spinach", "nuts");
		}
		return map;
	}

	// Given a map of food keys and topping values, modify and return the map as
	// follows: if the key "potato" has a value, set that as the value for the
	// key "fries". If the key "salad" has a value, set that as the value for
	// the key "spinach".
	//
	// topping3({"potato": "ketchup"}) ¡ú {"fries": "ketchup", "potato":
	// "ketchup"}
	// topping3({"potato": "butter"}) ¡ú {"fries": "butter", "potato": "butter"}
	// topping3({"salad": "oil", "potato": "ketchup"}) ¡ú {"salad": "oil",
	// "fries": "ketchup", "spinach": "oil", "potato": "ketchup"}
	public Map<String, String> topping3(Map<String, String> map) {
		if (map.containsKey("potato")) {
			map.put("fries", map.get("potato"));
		}
		if (map.containsKey("salad")) {
			map.put("spinach", map.get("salad"));
		}
		return map;
	}
}
