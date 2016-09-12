package code;

public class Warmup2 {

	// Given a string and a non-negative int n, return a larger string that is n
	// copies of the original string.
	//
	// stringTimes("Hi", 2) ¡ú "HiHi"
	// stringTimes("Hi", 3) ¡ú "HiHiHi"
	// stringTimes("Hi", 1) ¡ú "Hi"
	public String stringTimes(String str, int n) {
		String str1 = "";
		for (int i = 0; i < n; i++) {
			str1 = str1 + str;
		}
		return str1;
	}

	// Given a string and a non-negative int n, we'll say that the front of the
	// string is the first 3 chars, or whatever is there if the string is less
	// than length 3. Return n copies of the front;
	//
	// frontTimes("Chocolate", 2) ¡ú "ChoCho"
	// frontTimes("Chocolate", 3) ¡ú "ChoChoCho"
	// frontTimes("Abc", 3) ¡ú "AbcAbcAbc"
	public String frontTimes(String str, int n) {
		String result = "";
		if (str.length() < 3) {
			for (int i = 0; i < n; i++) {
				result = result + str;
			}
		} else {
			str = str.substring(0, 3);
			for (int i = 0; i < n; i++) {
				result = result + str;
			}
		}
		return result;
	}

	// Count the number of "xx" in the given string. We'll say that overlapping
	// is allowed, so "xxx" contains 2 "xx".
	//
	// countXX("abcxx") ¡ú 1
	// countXX("xxx") ¡ú 2
	// countXX("xxxx") ¡ú 3
	public int countXX(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.substring(i, i + 2).equals("xx")) {
				count++;
			}
		}
		return count;
	}

	// Given a string, return true if the first instance of "x" in the string is
	// immediately followed by another "x".
	//
	// doubleX("axxbb") ¡ú true
	// doubleX("axaxax") ¡ú false
	// doubleX("xxxxx") ¡ú true
	public boolean doubleX(String str) {
		boolean flag = false;
		int firstx = str.indexOf("x");
		if (firstx == -1) {
			flag = false;
		} else if (firstx + 1 >= str.length()) {
			flag = false;
		} else if (str.substring(firstx + 1, firstx + 2).equals("x")) {
			flag = true;
		}
		return flag;
	}

	// Given a string, return a new string made of every other char starting
	// with the first, so "Hello" yields "Hlo".
	//
	// stringBits("Hello") ¡ú "Hlo"
	// stringBits("Hi") ¡ú "H"
	// stringBits("Heeololeo") ¡ú "Hello"
	public String stringBits(String str) {

		String result = "";

		for (int i = 0; i < str.length(); i += 2) {
			result = result + str.substring(i, i + 1);
		}
		return result;
	}

	// Given a non-empty string like "Code" return a string like "CCoCodCode".
	//
	// stringSplosion("Code") ¡ú "CCoCodCode"
	// stringSplosion("abc") ¡ú "aababc"
	// stringSplosion("ab") ¡ú "aab"
	public String stringSplosion(String str) {
		String result = "";
		for (int i = 0; i <= str.length(); i++) {
			result = result + str.substring(0, i);
		}
		return result;
	}

	// Given a string, return the count of the number of times that a substring
	// length 2 appears in the string and also as the last 2 chars of the
	// string, so "hixxxhi" yields 1 (we won't count the end substring).
	//
	// last2("hixxhi") ¡ú 1
	// last2("xaxxaxaxx") ¡ú 1
	// last2("axxxaaxx") ¡ú 2
	public int last2(String str) {

		int count = 0;

		for (int i = 0; i < str.length() - 2; i++) {
			if (str.substring(i, i + 2).equals(str.substring(str.length() - 2, str.length()))) {
				count++;
			}
		}
		return count;
	}

	// Given an array of ints, return the number of 9's in the array.
	//
	// arrayCount9([1, 2, 9]) ¡ú 1
	// arrayCount9([1, 9, 9]) ¡ú 2
	// arrayCount9([1, 9, 9, 3, 9]) ¡ú 3
	public int arrayCount9(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 9) {
				count++;
			}
		}
		return count;
	}

	// Given an array of ints, return true if one of the first 4 elements in the
	// array is a 9. The array length may be less than 4.
	//
	// arrayFront9([1, 2, 9, 3, 4]) ¡ú true
	// arrayFront9([1, 2, 3, 4, 9]) ¡ú false
	// arrayFront9([1, 2, 3, 4, 5]) ¡ú false
	public boolean arrayFront9(int[] nums) {

		if (nums.length < 4) {
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == 9) {
					return true;
				}
			}
		} else {
			for (int i = 0; i < 3; i++) {
				if (nums[i] == 9) {
					return true;
				}
			}
		}
		return false;
	}

	// Given an array of ints, return true if .. 1, 2, 3, .. appears in the
	// array somewhere.
	//
	// array123([1, 1, 2, 3, 1]) ¡ú true
	// array123([1, 1, 2, 4, 1]) ¡ú false
	// array123([1, 1, 2, 1, 2, 3]) ¡ú true
	public boolean array123(int[] nums) {
		boolean flag = false;
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
				flag = true;
			}
		}
		return flag;
	}

	// Given 2 strings, a and b, return the number of the positions where they
	// contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3,
	// since the "xx", "aa", and "az" substrings appear in the same place in
	// both strings.
	//
	// stringMatch("xxcaazz", "xxbaaz") ¡ú 3
	// stringMatch("abc", "abc") ¡ú 2
	// stringMatch("abc", "axc") ¡ú 0
	public int stringMatch(String a, String b) {
		int count = 0;
		int len = Math.min(a.length(), b.length());
		for (int i = 0; i < len - 1; i++) {
			if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
				count++;
			}
		}
		return count;
	}

	// Given a string, return a version where all the "x" have been removed.
	// Except an "x" at the very start or end should not be removed.
	//
	// stringX("xxHxix") ¡ú "xHix"
	// stringX("abxxxcd") ¡ú "abcd"
	// stringX("xabxxxcdx") ¡ú "xabcdx"
	public String stringX(String str) {

		String result = "";

		for (int i = 0; i < str.length(); i++) {
			if (!str.substring(i, i + 1).equals("x") || i == 0 || i == str.length() - 1) {
				result = result + str.substring(i, i + 1);
			}
		}

		return result;
	}

	// Given a string, return a string made of the chars at indexes 0,1, 4,5,
	// 8,9 ... so "kittens" yields "kien".
	//
	// altPairs("kitten") ¡ú "kien"
	// altPairs("Chocolate") ¡ú "Chole"
	// altPairs("CodingHorror") ¡ú "Congrr"
	public String altPairs(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i += 4) {
			if (str.length() <= i + 2) {
				result = result + str.substring(i, str.length());
			} else {
				result = result + str.substring(i, i + 2);
			}
		}
		return result;
	}

	// Suppose the string "yak" is unlucky. Given a string, return a version
	// where all the "yak" are removed, but the "a" can be any char. The "yak"
	// strings will not overlap.
	//
	// stringYak("yakpak") ¡ú "pak"
	// stringYak("pakyak") ¡ú "pak"
	// stringYak("yak123ya") ¡ú "123ya"
	public String stringYak(String str) {
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
				i += 2;
			} else {
				result = result + str.charAt(i);
			}
		}

		return result;
	}

	// Given an array of ints, return the number of times that two 6's are next
	// to each other in the array. Also count instances where the second "6" is
	// actually a 7.
	//
	// array667([6, 6, 2]) ¡ú 1
	// array667([6, 6, 2, 6]) ¡ú 1
	// array667([6, 7, 2, 6]) ¡ú 1
	public int array667(int[] nums) {

		int count = 0;

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 6) {
				if (nums[i + 1] == 6 || nums[i + 1] == 7) {
					count++;
				}
			}
		}
		return count;
	}

	// Given an array of ints, we'll say that a triple is a value appearing 3
	// times in a row in the array. Return true if the array does not contain
	// any triples.
	//
	// noTriples([1, 1, 2, 2, 1]) ¡ú true
	// noTriples([1, 1, 2, 2, 2, 1]) ¡ú false
	// noTriples([1, 1, 1, 2, 2, 2, 1]) ¡ú false
	public boolean noTriples(int[] nums) {

		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
				return false;
			}
		}
		return true;
	}

	// Given an array of ints, return true if it contains a 2, 7, 1 pattern -- a
	// value, followed by the value plus 5, followed by the value minus 1.
	// Additionally the 271 counts even if the "1" differs by 2 or less from the
	// correct value.
	//
	// has271([1, 2, 7, 1]) ¡ú true
	// has271([1, 2, 8, 1]) ¡ú false
	// has271([2, 7, 1]) ¡ú true
	public boolean has271(int[] nums) {

		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i + 1] == nums[i] + 5 && Math.abs(nums[i + 2] - (nums[i] - 1)) <= 2) {
				return true;
			}
		}
		return false;
	}

}
