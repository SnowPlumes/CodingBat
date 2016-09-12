package code;

import java.util.HashMap;
import java.util.Map;

public class Map2 {

	// Given an array of strings, return a Map<String, Integer> containing a key
	// for every different string in the array, always with the value 0. For
	// example the string "hello" makes the pair "hello":0. We'll do more
	// complicated counting later, but for this problem the value is simply 0.
	//
	// word0(["a", "b", "a", "b"]) ¡ú {"b": 0, "a": 0}
	// word0(["a", "b", "a", "c", "b"]) ¡ú {"b": 0, "c": 0, "a": 0}
	// word0(["c", "b", "a"]) ¡ú {"b": 0, "c": 0, "a": 0}
	public Map<String, Integer> word0(String[] strings) {
		Map<String, Integer> map = new HashMap();
		for (String s : strings) {
			map.put(s, 0);
		}
		return map;
	}

	// Given an array of strings, return a Map<String, Integer> containing a key
	// for every different string in the array, and the value is that string's
	// length.
	//
	// wordLen(["a", "bb", "a", "bb"]) ¡ú {"a": 1, "bb": 2}
	// wordLen(["this", "and", "that", "and"]) ¡ú {"that": 4, "this": 4, "and":
	// 3}
	// wordLen(["code", "code", "code", "bug"]) ¡ú {"bug": 3, "code": 4}
	public Map<String, Integer> wordLen(String[] strings) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < strings.length - 1; i++) {
			if (!strings[i].equals(strings[i + 1])) {
				map.put(strings[i], strings[i].length());
			}
			if (!strings[strings.length - 1].equals(strings[i])) {
				map.put(strings[strings.length - 1], strings[strings.length - 1].length());
			}
		}
		if (strings.length == 1) {
			map.put(strings[0], strings[0].length());
		}
		return map;
	}

	// Given an array of non-empty strings, create and return a Map<String,
	// String> as follows: for each string add its first character as a key with
	// its last character as the value.
	//
	// pairs(["code", "bug"]) ¡ú {"b": "g", "c": "e"}
	// pairs(["man", "moon", "main"]) ¡ú {"m": "n"}
	// pairs(["man", "moon", "good", "night"]) ¡ú {"g": "d", "n": "t", "m": "n"}
	public Map<String, String> pairs(String[] strings) {
		Map<String, String> map = new HashMap();
		for (String s : strings) {
			map.put(s.substring(0, 1), s.substring(s.length() - 1));
		}
		return map;
	}

	// The classic word-count algorithm: given an array of strings, return a
	// Map<String, Integer> with a key for each different string, with the value
	// the number of times that string appears in the array.
	//
	// wordCount(["a", "b", "a", "c", "b"]) ¡ú {"b": 2, "c": 1, "a": 2}
	// wordCount(["c", "b", "a"]) ¡ú {"b": 1, "c": 1, "a": 1}
	// wordCount(["c", "c", "c", "c"]) ¡ú {"c": 4}
	public Map<String, Integer> wordCount(String[] strings) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		int count = 0;
		for (int i = 0; i < strings.length; i++) {
			map.put(strings[i], count);
		}

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			// a
			String s = entry.getKey(); // a
			count = map.get(s);
			for (int j = 0; j < strings.length; j++) {
				if (s.equals(strings[j])) {
					count++;
				}
			}
			map.put(s, count);
		}

		return map;
	}

	// Given an array of non-empty strings, return a Map<String, String> with a
	// key for every different first character seen, with the value of all the
	// strings starting with that character appended together in the order they
	// appear in the array.
	//
	// firstChar(["salt", "tea", "soda", "toast"]) ¡ú {"t": "teatoast", "s":
	// "saltsoda"}
	// firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) ¡ú {"d": "d", "b": "bb",
	// "c": "cccCC", "a": "aaaAA"}
	// firstChar([]) ¡ú {}
	public Map<String, String> firstChar(String[] strings) {
		Map<String, String> map = new HashMap();
		for (String s : strings) {
			if (map.containsKey(s.substring(0, 1))) {
				map.put(s.substring(0, 1), map.get(s.substring(0, 1)) + s);
			} else {
				map.put(s.substring(0, 1), s);
			}
		}
		return map;
	}

	// Loop over the given array of strings to build a result string like this:
	// when a string appears the 2nd, 4th, 6th, etc. time in the array, append
	// the string to the result. Return the empty string if no string appears a
	// 2nd time.
	//
	// wordAppend(["a", "b", "a"]) ¡ú "a"
	// wordAppend(["a", "b", "a", "c", "a", "d", "a"]) ¡ú "aa"
	// wordAppend(["a", "", "a"]) ¡ú "a"
	public String wordAppend(String[] strings) {
		String str = "";
		Map<String, Integer> map = new HashMap();
		for (String s : strings) {
			if (map.containsKey(s)) {
				map.put(s, map.get(s) + 1);
				if (map.get(s) % 2 == 0) {
					str = str + s;
				}
			} else {
				map.put(s, 1);
			}
		}
		return str;
	}

	// Given an array of strings, return a Map<String, Boolean> where each
	// different string is a key and its value is true if that string appears 2
	// or more times in the array.
	//
	// wordMultiple(["a", "b", "a", "c", "b"]) ¡ú {"b": true, "c": false, "a":
	// true}
	// wordMultiple(["c", "b", "a"]) ¡ú {"b": false, "c": false, "a": false}
	// wordMultiple(["c", "c", "c", "c"]) ¡ú {"c": true}
	public Map<String, Boolean> wordMultiple(String[] strings) {
		Map<String, Boolean> map = new HashMap();
		for (String s : strings) {
			if (map.containsKey(s)) {
				map.put(s, true);

			} else {
				map.put(s, false);
			}
		}
		return map;
	}

	// We'll say that 2 strings "match" if they are non-empty and their first
	// chars are the same. Loop over and then return the given array of
	// non-empty strings as follows: if a string matches an earlier string in
	// the array, swap the 2 strings in the array. When a position in the array
	// has been swapped, it no longer matches anything. Using a map, this can be
	// solved making just one pass over the array. More difficult than it looks.
	//
	// allSwap(["ab", "ac"]) ¡ú ["ac", "ab"]
	// allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) ¡ú ["ay",
	// "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
	// allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) ¡ú ["ay", "by",
	// "ax", "bx", "aj", "ai", "by", "bx"]
	public String[] allSwap(String[] strings) {
		Map<String, Integer> map = new HashMap();
		int i = 0;
		String temp;
		for (String s : strings) {
			if (map.containsKey(s.substring(0, 1))) {
				temp = strings[i];
				strings[i] = strings[map.get(s.substring(0, 1))];
				strings[map.get(s.substring(0, 1))] = temp;
				map.remove(s.substring(0, 1));
			} else {
				map.put(s.substring(0, 1), i);
			}
			i++;
		}
		return strings;
	}

	// We'll say that 2 strings "match" if they are non-empty and their first
	// chars are the same. Loop over and then return the given array of
	// non-empty strings as follows: if a string matches an earlier string in
	// the array, swap the 2 strings in the array. A particular first char can
	// only cause 1 swap, so once a char has caused a swap, its later swaps are
	// disabled. Using a map, this can be solved making just one pass over the
	// array. More difficult than it looks.
	//
	// firstSwap(["ab", "ac"]) ¡ú ["ac", "ab"]
	// firstSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) ¡ú ["ay",
	// "by", "cy", "cx", "bx", "ax", "aaa", "azz"]
	// firstSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) ¡ú ["ay",
	// "by", "ax", "bx", "ai", "aj", "bx", "by"]
	public String[] firstSwap(String[] strings) {
		Map<String, Integer> map = new HashMap();
		int i = 0;
		String temp;
		for (String s : strings) {
			if (map.containsKey(s.substring(0, 1))) {
				if (map.get(s.substring(0, 1)) >= 0) {
					temp = strings[i];
					strings[i] = strings[map.get(s.substring(0, 1))];
					strings[map.get(s.substring(0, 1))] = temp;
					map.put(s.substring(0, 1), -1);
				}

			} else {
				map.put(s.substring(0, 1), i);
			}
			i++;
		}
		return strings;
	}

}
