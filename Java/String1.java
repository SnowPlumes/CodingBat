package code;

public class String1 {

	// Given a string name, e.g. "Bob", return a greeting of the form "Hello
	// Bob!".
	//
	// helloName("Bob") ¡ú "Hello Bob!"
	// helloName("Alice") ¡ú "Hello Alice!"
	// helloName("X") ¡ú "Hello X!"
	public String helloName(String name) {

		return "Hello " + name + "!";
	}

	// Given two strings, a and b, return the result of putting them together in
	// the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
	//
	// makeAbba("Hi", "Bye") ¡ú "HiByeByeHi"
	// makeAbba("Yo", "Alice") ¡ú "YoAliceAliceYo"
	// makeAbba("What", "Up") ¡ú "WhatUpUpWhat"
	public String makeAbba(String a, String b) {

		return a + b + b + a;
	}

	// The web is built with HTML strings like "<i>Yay</i>" which draws Yay as
	// italic text. In this example, the "i" tag makes <i> and </i> which
	// surround the word "Yay". Given tag and word strings, create the HTML
	// string with tags around the word, e.g. "<i>Yay</i>".
	//
	// makeTags("i", "Yay") ¡ú "<i>Yay</i>"
	// makeTags("i", "Hello") ¡ú "<i>Hello</i>"
	// makeTags("cite", "Yay") ¡ú "<cite>Yay</cite>"
	public String makeTags(String tag, String word) {

		return "<" + tag + ">" + word + "</" + tag + ">";
	}

	// Given an "out" string length 4, such as "<<>>", and a word, return a new
	// string where the word is in the middle of the out string, e.g.
	// "<<word>>". Note: use str.substring(i, j) to extract the String starting
	// at index i and going up to but not including index j.
	//
	// makeOutWord("<<>>", "Yay") ¡ú "<<Yay>>"
	// makeOutWord("<<>>", "WooHoo") ¡ú "<<WooHoo>>"
	// makeOutWord("[[]]", "word") ¡ú "[[word]]"
	public String makeOutWord(String out, String word) {

		String start = out.substring(0, 2);
		String end = out.substring(2, 4);

		return start + word + end;
	}

	// Given a string, return a new string made of 3 copies of the last 2 chars
	// of the original string. The string length will be at least 2.
	//
	// extraEnd("Hello") ¡ú "lololo"
	// extraEnd("ab") ¡ú "ababab"
	// extraEnd("Hi") ¡ú "HiHiHi"
	public String extraEnd(String str) {
		String result = "";
		int len = str.length();
		for (int i = 0; i < 3; i++) {
			result = result + str.substring(len - 2, len);
		}
		return result;
	}

	// Given a string, return the string made of its first two chars, so the
	// String "Hello" yields "He". If the string is shorter than length 2,
	// return whatever there is, so "X" yields "X", and the empty string ""
	// yields the empty string "". Note that str.length() returns the length of
	// a string.
	//
	// firstTwo("Hello") ¡ú "He"
	// firstTwo("abcdefg") ¡ú "ab"
	// firstTwo("ab") ¡ú "ab"
	public String firstTwo(String str) {

		if (str.length() <= 2) {
			return str;
		}
		return str.substring(0, 2);
	}

	// Given a string of even length, return the first half. So the string
	// "WooHoo" yields "Woo".
	//
	// firstHalf("WooHoo") ¡ú "Woo"
	// firstHalf("HelloThere") ¡ú "Hello"
	// firstHalf("abcdef") ¡ú "abc"
	public String firstHalf(String str) {
		return str.substring(0, str.length() / 2);
	}

	// Given a string, return a version without the first and last char, so
	// "Hello" yields "ell". The string length will be at least 2.
	//
	// withoutEnd("Hello") ¡ú "ell"
	// withoutEnd("java") ¡ú "av"
	// withoutEnd("coding") ¡ú "odin"
	public String withoutEnd(String str) {
		return str.substring(1, str.length() - 1);
	}

	// Given 2 strings, a and b, return a string of the form short+long+short,
	// with the shorter string on the outside and the longer string on the
	// inside. The strings will not be the same length, but they may be empty
	// (length 0).
	//
	// comboString("Hello", "hi") ¡ú "hiHellohi"
	// comboString("hi", "Hello") ¡ú "hiHellohi"
	// comboString("aaa", "b") ¡ú "baaab"
	public String comboString(String a, String b) {

		if (a.length() < b.length()) {
			return a + b + a;
		} else {
			return b + a + b;
		}

	}

	// Given 2 strings, return their concatenation, except omit the first char
	// of each. The strings will be at least length 1.
	//
	// nonStart("Hello", "There") ¡ú "ellohere"
	// nonStart("java", "code") ¡ú "avaode"
	// nonStart("shotl", "java") ¡ú "hotlava"
	public String nonStart(String a, String b) {

		return a.substring(1) + b.substring(1);
	}

	// Given a string, return a "rotated left 2" version where the first 2 chars
	// are moved to the end. The string length will be at least 2.
	//
	// left2("Hello") ¡ú "lloHe"
	// left2("java") ¡ú "vaja"
	// left2("Hi") ¡ú "Hi"
	public String left2(String str) {

		String start = str.substring(0, 2);
		String end = str.substring(2, str.length());

		return end + start;
	}

	// Given a string, return a "rotated right 2" version where the last 2 chars
	// are moved to the start. The string length will be at least 2.
	//
	// right2("Hello") ¡ú "loHel"
	// right2("java") ¡ú "vaja"
	// right2("Hi") ¡ú "Hi"
	public String right2(String str) {
		String result = "";
		result = str.substring(str.length() - 2, str.length());
		str = str.replace(result, "");
		result = result + str;
		return result;
	}

	// Given a string, return a string length 1 from its front, unless front is
	// false, in which case return a string length 1 from its back. The string
	// will be non-empty.
	//
	// theEnd("Hello", true) ¡ú "H"
	// theEnd("Hello", false) ¡ú "o"
	// theEnd("oh", true) ¡ú "o"
	public String theEnd(String str, boolean front) {
		if (front) {
			return str.substring(0, 1);
		} else {
			return str.substring(str.length() - 1, str.length());
		}
	}

	// Given a string, return a version without both the first and last char of
	// the string. The string may be any length, including 0.
	//
	// withouEnd2("Hello") ¡ú "ell"
	// withouEnd2("abc") ¡ú "b"
	// withouEnd2("ab") ¡ú ""
	public String withouEnd2(String str) {

		if (str.length() < 2) {
			return "";
		} else {
			return str.substring(1, str.length() - 1);
		}
	}

	// Given a string of even length, return a string made of the middle two
	// chars, so the string "string" yields "ri". The string length will be at
	// least 2.
	//
	// middleTwo("string") ¡ú "ri"
	// middleTwo("code") ¡ú "od"
	// middleTwo("Practice") ¡ú "ct"
	public String middleTwo(String str) {

		int mid = str.length() / 2;

		return str.substring(mid - 1, mid + 1);
	}

	// Given a string, return true if it ends in "ly".
	//
	// endsLy("oddly") ¡ú true
	// endsLy("y") ¡ú false
	// endsLy("oddy") ¡ú false
	public boolean endsLy(String str) {

		return str.endsWith("ly");
	}

	// Given a string and an int n, return a string made of the first and last n
	// chars from the string. The string length will be at least n.
	//
	// nTwice("Hello", 2) ¡ú "Helo"
	// nTwice("Chocolate", 3) ¡ú "Choate"
	// nTwice("Chocolate", 1) ¡ú "Ce"
	public String nTwice(String str, int n) {

		return str.substring(0, n) + str.substring(str.length() - n);
	}

	// Given a string and an index, return a string length 2 starting at the
	// given index. If the index is too big or too small to define a string
	// length 2, use the first 2 chars. The string length will be at least 2.
	//
	// twoChar("java", 0) ¡ú "ja"
	// twoChar("java", 2) ¡ú "va"
	// twoChar("java", 3) ¡ú "ja"
	public String twoChar(String str, int index) {
		if (index + 2 <= str.length() && index > 0) {
			return str.substring(index, index + 2);
		}
		return str.substring(0, 2);
	}

	// Given a string of odd length, return the string length 3 from its middle,
	// so "Candy" yields "and". The string length will be at least 3.
	//
	// middleThree("Candy") ¡ú "and"
	// middleThree("and") ¡ú "and"
	// middleThree("solving") ¡ú "lvi"
	public String middleThree(String str) {
		String result = "";
		int mid = str.length() / 2;
		result = str.substring(mid - 1, mid + 2);
		return result;
	}

	// Given a string, return true if "bad" appears starting at index 0 or 1 in
	// the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The
	// string may be any length, including 0. Note: use .equals() to compare 2
	// strings.
	//
	// hasBad("badxx") ¡ú true
	// hasBad("xbadxx") ¡ú true
	// hasBad("xxbadxx") ¡ú false
	public boolean hasBad(String str) {

		if (str.length() > 3) {
			if (str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad")) {
				return true;
			}
		}
		if (str.equals("bad")) {
			return true;
		}
		return false;
	}

	// Given a string, return a string length 2 made of its first 2 chars. If
	// the string length is less than 2, use '@' for the missing chars.
	//
	// atFirst("hello") ¡ú "he"
	// atFirst("hi") ¡ú "hi"
	// atFirst("h") ¡ú "h@"
	public String atFirst(String str) {

		if (str.length() == 0) {
			return "@@";
		}
		if (str.length() == 1) {
			return str + "@";
		}
		return str.substring(0, 2);
	}

	// Given 2 strings, a and b, return a new string made of the first char of a
	// and the last char of b, so "yo" and "java" yields "ya". If either string
	// is length 0, use '@' for its missing char.
	//
	// lastChars("last", "chars") ¡ú "ls"
	// lastChars("yo", "java") ¡ú "ya"
	// lastChars("hi", "") ¡ú "h@"
	public String lastChars(String a, String b) {
		String first = "";
		String second = "";
		if (a.length() == 0) {
			first = "@";
		} else {
			first = a.substring(0, 1);
		}
		if (b.length() == 0) {
			second = "@";
		} else {
			second = b.substring(b.length() - 1, b.length());
		}
		return first + second;
	}

	// Given two strings, append them together (known as "concatenation") and
	// return the result. However, if the concatenation creates a double-char,
	// then omit one of the chars, so "abc" and "cat" yields "abcat".
	//
	// conCat("abc", "cat") ¡ú "abcat"
	// conCat("dog", "cat") ¡ú "dogcat"
	// conCat("abc", "") ¡ú "abc"
	public String conCat(String a, String b) {

		if (a.length() != 0 && b.length() != 0 && a.charAt(a.length() - 1) == b.charAt(0)) {
			return a + b.substring(1);
		}
		return a + b;
	}

	// Given a string of any length, return a new string where the last 2 chars,
	// if present, are swapped, so "coding" yields "codign".
	//
	// lastTwo("coding") ¡ú "codign"
	// lastTwo("cat") ¡ú "cta"
	// lastTwo("ab") ¡ú "ba"
	public String lastTwo(String str) {

		int len = str.length();

		if (len < 2) {
			return str;
		}

		String end1 = str.substring(len - 2, len - 1);
		String end2 = str.substring(len - 1, len);

		return str.substring(0, len - 2) + end2 + end1;
	}

	// Given a string, if the string begins with "red" or "blue" return that
	// color string, otherwise return the empty string.
	//
	// seeColor("redxx") ¡ú "red"
	// seeColor("xxred") ¡ú ""
	// seeColor("blueTimes") ¡ú "blue"
	public String seeColor(String str) {

		if (str.startsWith("red")) {
			return "red";
		}
		if (str.startsWith("blue")) {
			return "blue";
		}
		return "";
	}

	// Given a string, return true if the first 2 chars in the string also
	// appear at the end of the string, such as with "edited".
	//
	// frontAgain("edited") ¡ú true
	// frontAgain("edit") ¡ú false
	// frontAgain("ed") ¡ú true
	public boolean frontAgain(String str) {

		int len = str.length();

		if (len < 2) {
			return false;
		} else if (str.substring(0, 2).equals(str.substring(len - 2, len))) {
			return true;
		}
		return false;
	}

	// Given two strings, append them together (known as "concatenation") and
	// return the result. However, if the strings are different lengths, omit
	// chars from the longer string so it is the same length as the shorter
	// string. So "Hello" and "Hi" yield "loHi". The strings may be any length.
	//
	// minCat("Hello", "Hi") ¡ú "loHi"
	// minCat("Hello", "java") ¡ú "ellojava"
	// minCat("java", "Hello") ¡ú "javaello"
	public String minCat(String a, String b) {

		int lena = a.length();
		int lenb = b.length();

		if (lena > lenb) {
			return a.substring(lena - lenb) + b;
		}
		return a + b.substring(lenb - lena);
	}

	// Given a string, return a new string made of 3 copies of the first 2 chars
	// of the original string. The string may be any length. If there are fewer
	// than 2 chars, use whatever is there.
	//
	// extraFront("Hello") ¡ú "HeHeHe"
	// extraFront("ab") ¡ú "ababab"
	// extraFront("H") ¡ú "HHH"
	public String extraFront(String str) {
		if (str.length() < 2) {
			str = str + str + str;
		} else {
			String st = str.substring(0, 2);
			str = st + st + st;
		}
		return str;
	}

	// Given a string, if a length 2 substring appears at both its beginning and
	// end, return a string without the substring at the beginning, so "HelloHe"
	// yields "lloHe". The substring may overlap with itself, so "Hi" yields "".
	// Otherwise, return the original string unchanged.
	//
	// without2("HelloHe") ¡ú "lloHe"
	// without2("HelloHi") ¡ú "HelloHi"
	// without2("Hi") ¡ú ""
	public String without2(String str) {
		if (str.length() < 2) {
			return str;
		}
		if (str.substring(0, 2).equals(str.substring(str.length() - 2))) {
			return str.substring(2);
		}
		return str;
	}

	// Given a string, return a version without the first 2 chars. Except keep
	// the first char if it is 'a' and keep the second char if it is 'b'. The
	// string may be any length. Harder than it looks.
	//
	// deFront("Hello") ¡ú "llo"
	// deFront("java") ¡ú "va"
	// deFront("away") ¡ú "aay"
	public String deFront(String str) {

		String first = "";
		String second = "";

		if (str.substring(0, 1).equals("a")) {
			first = "a";
		}
		if (str.substring(1, 2).equals("b")) {
			second = "b";
		}
		return first + second + str.substring(2);
	}

	// Given a string and a second "word" string, we'll say that the word
	// matches the string if it appears at the front of the string, except its
	// first char does not need to match exactly. On a match, return the front
	// of the string, or otherwise return the empty string. So, so with the
	// string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The
	// word will be at least length 1.
	//
	// startWord("hippo", "hi") ¡ú "hi"
	// startWord("hippo", "xip") ¡ú "hip"
	// startWord("hippo", "i") ¡ú "h"
	public String startWord(String str, String word) {

		int slen = str.length();
		int wlen = word.length();

		if (slen == 0) {
			return str;
		}

		if (wlen == 1) {
			return str.substring(0, 1);
		}

		for (int i = 0; i <= slen - wlen + 1; i++) {
			if (str.substring(i, i + wlen - 1).equals(word.substring(1, wlen))) {
				return str.substring(i + wlen - 1 - wlen, i + wlen - 1);
			}
		}
		return "";
	}

	// Given a string, if the first or last chars are 'x', return the string
	// without those 'x' chars, and otherwise return the string unchanged.
	//
	// withoutX("xHix") ¡ú "Hi"
	// withoutX("xHi") ¡ú "Hi"
	// withoutX("Hxix") ¡ú "Hxi"
	public String withoutX(String str) {
		if (str.startsWith("x")) {
			str = str.substring(1, str.length());
		}
		if (str.endsWith("x")) {
			str = str.substring(0, str.length() - 1);
		}
		return str;
	}

	// Given a string, if one or both of the first 2 chars is 'x', return the
	// string without those 'x' chars, and otherwise return the string
	// unchanged. This is a little harder than it looks.
	//
	// withoutX2("xHi") ¡ú "Hi"
	// withoutX2("Hxi") ¡ú "Hi"
	// withoutX2("Hi") ¡ú "Hi"
	public String withoutX2(String str) {
		String result = "";
		if (str.length() >= 2) {
			for (int i = 0; i < 2; i++) {
				if (!(str.charAt(i) == 'x')) {
					result = result + str.charAt(i);
				}
			}
			return result + str.substring(2);
		} else {
			if (str.equals("x") || str.length() == 0) {
				return "";
			}
			return str;
		}
	}
}
