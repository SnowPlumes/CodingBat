package code;

public class Warmup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(sleepIn(false, false));

	}

	// The parameter weekday is true if it is a weekday, and the parameter
	// vacation is true if we are on vacation. We sleep in if it is not a
	// weekday or we're on vacation. Return true if we sleep in.
	//
	// sleepIn(false, false) ¡ú true
	// sleepIn(true, false) ¡ú false
	// sleepIn(false, true) ¡ú true
	public static boolean sleepIn(boolean weekday, boolean vacation) {
		if (vacation || !weekday) {
			return true;
		}
		return false;
	}

	// We have two monkeys, a and b, and the parameters aSmile and bSmile
	// indicate if each is smiling. We are in trouble if they are both smiling
	// or if neither of them is smiling. Return true if we are in trouble.
	//
	// monkeyTrouble(true, true) ¡ú true
	// monkeyTrouble(false, false) ¡ú true
	// monkeyTrouble(true, false) ¡ú false
	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		if (aSmile && bSmile) {
			return true;
		} else if (!aSmile && !bSmile) {
			return true;
		} else {
			return false;
		}
	}

	// Given two int values, return their sum. Unless the two values are the
	// same, then return double their sum.
	//
	// sumDouble(1, 2) ¡ú 3
	// sumDouble(3, 2) ¡ú 5
	// sumDouble(2, 2) ¡ú 8
	public int sumDouble(int a, int b) {
		int c;
		if (a == b) {
			c = (a + b) * 2;
		} else {
			c = a + b;
		}
		return c;
	}

	// Given an int n, return the absolute difference between n and 21, except
	// return double the absolute difference if n is over 21.
	//
	// diff21(19) ¡ú 2
	// diff21(10) ¡ú 11
	// diff21(21) ¡ú 0
	public int diff21(int n) {
		if (n >= 21) {
			return (n - 21) * 2;
		}
		return 21 - n;
	}

	// We have a loud talking parrot. The "hour" parameter is the current hour
	// time in the range 0..23. We are in trouble if the parrot is talking and
	// the hour is before 7 or after 20. Return true if we are in trouble.
	//
	// parrotTrouble(true, 6) ¡ú true
	// parrotTrouble(true, 7) ¡ú false
	// parrotTrouble(false, 6) ¡ú false
	public boolean parrotTrouble(boolean talking, int hour) {

		boolean flag = false;

		if (talking == false) {
			flag = false;
		} else {
			if (hour < 7 || hour > 20) {
				flag = true;
			}
		}

		return flag;
	}

	// Given 2 ints, a and b, return true if one if them is 10 or if their sum
	// is 10.
	//
	// makes10(9, 10) ¡ú true
	// makes10(9, 9) ¡ú false
	// makes10(1, 9) ¡ú true
	public boolean makes10(int a, int b) {
		if (a == 10 || b == 10 || a + b == 10) {
			return true;
		}
		return false;
	}

	// Given an int n, return true if it is within 10 of 100 or 200. Note:
	// Math.abs(num) computes the absolute value of a number.
	//
	// nearHundred(93) ¡ú true
	// nearHundred(90) ¡ú true
	// nearHundred(89) ¡ú false
	public boolean nearHundred(int n) {
		if (Math.abs(n - 100) <= 10) {
			return true;
		} else if (Math.abs(n - 200) <= 10) {
			return true;
		}
		return false;
	}

	// Given 2 int values, return true if one is negative and one is positive.
	// Except if the parameter "negative" is true, then return true only if both
	// are negative.
	//
	// posNeg(1, -1, false) ¡ú true
	// posNeg(-1, 1, false) ¡ú true
	// posNeg(-4, -5, true) ¡ú true
	public boolean posNeg(int a, int b, boolean negative) {
		if (negative) {
			if (a < 0 && b < 0) {
				return true;
			} else {
				return false;
			}
		} else {
			if (a > 0 && b > 0) {
				return false;
			} else if (a < 0 && b < 0) {
				return false;
			} else {
				return true;
			}
		}
	}

	// Given a string, return a new string where "not " has been added to the
	// front. However, if the string already begins with "not", return the
	// string unchanged. Note: use .equals() to compare 2 strings.
	//
	// notString("candy") ¡ú "not candy"
	// notString("x") ¡ú "not x"
	// notString("not bad") ¡ú "not bad"
	public String notString(String str) {
		if (str.length() >= 3) {
			if (str.substring(0, 3).equals("not")) {
				return str;
			}
		}
		return "not " + str;
	}

	// Given a non-empty string and an int n, return a new string where the char
	// at index n has been removed. The value of n will be a valid index of a
	// char in the original string (i.e. n will be in the range
	// 0..str.length()-1 inclusive).
	//
	// missingChar("kitten", 1) ¡ú "ktten"
	// missingChar("kitten", 0) ¡ú "itten"
	// missingChar("kitten", 4) ¡ú "kittn"
	public String missingChar(String str, int n) {
		return str.replace(str.substring(n, n + 1), "");
	}

	// Given a string, return a new string where the first and last chars have
	// been exchanged.
	//
	// frontBack("code") ¡ú "eodc"
	// frontBack("a") ¡ú "a"
	// frontBack("ab") ¡ú "ba"
	public String frontBack(String str) {

		if (str.length() <= 1) {
			return str;
		}

		String start = str.substring(0, 1);
		String end = str.substring(str.length() - 1, str.length());
		String mid = str.substring(1, str.length() - 1);

		return end + mid + start;
	}

	// Given a string, we'll say that the front is the first 3 chars of the
	// string. If the string length is less than 3, the front is whatever is
	// there. Return a new string which is 3 copies of the front.
	//
	// front3("Java") ¡ú "JavJavJav"
	// front3("Chocolate") ¡ú "ChoChoCho"
	// front3("abc") ¡ú "abcabcabc"
	public String front3(String str) {
		if (str.length() < 4) {
			str = str + str + str;
		} else {
			str = str.substring(0, 3);
			str = str + str + str;
		}
		return str;
	}

	// Given a string, take the last char and return a new string with the last
	// char added at the front and back, so "cat" yields "tcatt". The original
	// string will be length 1 or more.
	//
	// backAround("cat") ¡ú "tcatt"
	// backAround("Hello") ¡ú "oHelloo"
	// backAround("a") ¡ú "aaa"
	public String backAround(String str) {

		char ch = str.charAt(str.length() - 1);
		str = ch + str + ch;
		return str;
	}

	// Return true if the given non-negative number is a multiple of 3 or a
	// multiple of 5. Use the % "mod" operator -- see Introduction to Mod
	//
	// or35(3) ¡ú true
	// or35(10) ¡ú true
	// or35(8) ¡ú false
	public boolean or35(int n) {
		int a = n % 3;
		int b = n % 5;
		if (a == 0 || b == 0) {
			return true;
		} else {
			return false;
		}
	}

	// Given a string, take the first 2 chars and return the string with the 2
	// chars added at both the front and back, so "kitten" yields"kikittenki".
	// If the string length is less than 2, use whatever chars are there.
	//
	// front22("kitten") ¡ú "kikittenki"
	// front22("Ha") ¡ú "HaHaHa"
	// front22("abc") ¡ú "ababcab"
	public String front22(String str) {
		if (str.length() <= 2) {
			return str + str + str;
		}
		String newstr = str.substring(0, 2);
		return newstr + str + newstr;
	}

	// Given a string, return true if the string starts with "hi" and false
	// otherwise.
	//
	// startHi("hi there") ¡ú true
	// startHi("hi") ¡ú true
	// startHi("hello hi") ¡ú false
	public boolean startHi(String str) {
		if (str.startsWith("hi")) {
			return true;
		}
		return false;
	}

	// Given two temperatures, return true if one is less than 0 and the other
	// is greater than 100.
	//
	// icyHot(120, -1) ¡ú true
	// icyHot(-1, 120) ¡ú true
	// icyHot(2, 120) ¡ú false
	public boolean icyHot(int temp1, int temp2) {
		if (temp1 < 0 && temp2 > 100) {
			return true;
		} else if (temp1 > 100 && temp2 < 0) {
			return true;
		} else {
			return false;
		}

	}

	// Given 2 int values, return true if either of them is in the range 10..20
	// inclusive.
	//
	// in1020(12, 99) ¡ú true
	// in1020(21, 12) ¡ú true
	// in1020(8, 99) ¡ú false
	public boolean in1020(int a, int b) {
		if (a >= 10 && a <= 20) {
			return true;
		} else if (b >= 10 && b <= 20) {
			return true;
		}
		return false;
	}

	// We'll say that a number is "teen" if it is in the range 13..19 inclusive.
	// Given 3 int values, return true if 1 or more of them are teen.
	//
	// hasTeen(13, 20, 10) ¡ú true
	// hasTeen(20, 19, 10) ¡ú true
	// hasTeen(20, 10, 13) ¡ú true
	public boolean hasTeen(int a, int b, int c) {
		if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)) {
			return true;
		}
		return false;
	}

	// We'll say that a number is "teen" if it is in the range 13..19 inclusive.
	// Given 2 int values, return true if one or the other is teen, but not
	// both.
	//
	// loneTeen(13, 99) ¡ú true
	// loneTeen(21, 19) ¡ú true
	// loneTeen(13, 13) ¡ú false
	public boolean loneTeen(int a, int b) {
		boolean aTeen = (a >= 13 && a <= 19);
		boolean bTeen = (b >= 13 && b <= 19);

		return (aTeen && !bTeen) || (!aTeen && bTeen);
	}

	// Given a string, if the string "del" appears starting at index 1, return a
	// string where that "del" has been deleted. Otherwise, return the string
	// unchanged.
	//
	// delDel("adelbc") ¡ú "abc"
	// delDel("adelHello") ¡ú "aHello"
	// delDel("adedbc") ¡ú "adedbc"
	public String delDel(String str) {
		if (str.length() >= 4 && str.substring(1, 4).equals("del")) {
			str = str.replace("del", "");
		}
		return str;
	}

	// Return true if the given string begins with "mix", except the 'm' can be
	// anything, so "pix", "9ix" .. all count.
	//
	// mixStart("mix snacks") ¡ú true
	// mixStart("pix snacks") ¡ú true
	// mixStart("piz snacks") ¡ú false
	public boolean mixStart(String str) {
		if (str.length() <= 2) {
			return false;
		}
		if (str.substring(1, 3).equals("ix")) {
			return true;
		}
		return false;
	}

	// Given a string, return a string made of the first 2 chars (if present),
	// however include first char only if it is 'o' and include the second only
	// if it is 'z', so "ozymandias" yields "oz".
	//
	// startOz("ozymandias") ¡ú "oz"
	// startOz("bzoo") ¡ú "z"
	// startOz("oxx") ¡ú "o"
	public String startOz(String str) {

		String result = "";

		if (str.length() >= 1 && str.charAt(0) == 'o') {
			result = result + str.charAt(0);
		}

		if (str.length() >= 2 && str.charAt(1) == 'z') {
			result = result + str.charAt(1);
		}

		return result;
	}

	// Given three int values, a b c, return the largest.
	//
	// intMax(1, 2, 3) ¡ú 3
	// intMax(1, 3, 2) ¡ú 3
	// intMax(3, 2, 1) ¡ú 3
	public int intMax(int a, int b, int c) {
		int max = 0;
		if (a >= b) {
			max = a;
		} else {
			max = b;
		}
		if (c >= max) {
			max = c;
		}
		return max;
	}

	// Given 2 int values, return whichever value is nearest to the value 10, or
	// return 0 in the event of a tie. Note that Math.abs(n) returns the
	// absolute value of a number.
	//
	// close10(8, 13) ¡ú 8
	// close10(13, 8) ¡ú 8
	// close10(13, 7) ¡ú 0
	public int close10(int a, int b) {

		int i = Math.abs(10 - a);
		int y = Math.abs(10 - b);

		if (i > y) {
			return b;
		} else if (i < y) {
			return a;
		}
		return 0;
	}

	// Given 2 int values, return true if they are both in the range 30..40
	// inclusive, or they are both in the range 40..50 inclusive.
	//
	// in3050(30, 31) ¡ú true
	// in3050(30, 41) ¡ú false
	// in3050(40, 50) ¡ú true
	public boolean in3050(int a, int b) {
		if (a >= 30 && a <= 40 && b >= 30 && b <= 40) {
			return true;
		} else if (a >= 40 && a <= 50 && b >= 40 && b <= 50) {
			return true;
		}
		return false;
	}

	// Given 2 positive int values, return the larger value that is in the range
	// 10..20 inclusive, or return 0 if neither is in that range.
	//
	// max1020(11, 19) ¡ú 19
	// max1020(19, 11) ¡ú 19
	// max1020(11, 9) ¡ú 11
	public int max1020(int a, int b) {
		if (a > b) {
			if (a >= 10 && a <= 20) {
				return a;
			} else if (b >= 10 && b <= 20) {
				return b;
			}
		} else {
			if (b >= 10 && b <= 20) {
				return b;
			} else if (a >= 10 && a <= 20) {
				return a;
			}
		}
		return 0;
	}

	// Return true if the given string contains between 1 and 3 'e' chars.
	//
	// stringE("Hello") ¡ú true
	// stringE("Heelle") ¡ú true
	// stringE("Heelele") ¡ú false
	public boolean stringE(String str) {
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'e') {
				count++;
			}
		}
		if (count >= 1 && count <= 3) {
			return true;
		}
		return false;
	}

	// Given two non-negative int values, return true if they have the same last
	// digit, such as with 27 and 57. Note that the % "mod" operator computes
	// remainders, so 17 % 10 is 7.
	//
	// lastDigit(7, 17) ¡ú true
	// lastDigit(6, 17) ¡ú false
	// lastDigit(3, 113) ¡ú true
	public boolean lastDigit(int a, int b) {
		if (a % 10 == b % 10) {
			return true;
		}
		return false;
	}

	// Given a string, return a new string where the last 3 chars are now in
	// upper case. If the string has less than 3 chars, uppercase whatever is
	// there. Note that str.toUpperCase() returns the uppercase version of a
	// string.
	//
	// endUp("Hello") ¡ú "HeLLO"
	// endUp("hi there") ¡ú "hi thERE"
	// endUp("hi") ¡ú "HI"
	public String endUp(String str) {
		if (str.length() < 3) {
			return str.toUpperCase();
		} else {
			String star = str.substring(0, str.length() - 3);
			String end = str.substring(str.length() - 3, str.length()).toUpperCase();
			return star + end;
		}
	}

	// Given a non-empty string and an int N, return the string made starting
	// with char 0, and then every Nth char of the string. So if N is 3, use
	// char 0, 3, 6, ... and so on. N is 1 or more.
	//
	// everyNth("Miracle", 2) ¡ú "Mrce"
	// everyNth("abcdefg", 2) ¡ú "aceg"
	// everyNth("abcdefg", 3) ¡ú "adg"
	public String everyNth(String str, int n) {

		String result = "";
		for (int i = 0; i < str.length(); i += n) {
			result = result + str.charAt(i);
		}
		return result;
	}

}
