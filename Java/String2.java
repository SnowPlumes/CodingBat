package code;

public class String2 {
	public static void main(String[] args) {
	}

	// Given a string, return a string where for every char in the original,
	// there are two chars.
	//
	// doubleChar("The") ¡ú "TThhee"
	// doubleChar("AAbb") ¡ú "AAAAbbbb"
	// doubleChar("Hi-There") ¡ú "HHii--TThheerree"
	public String doubleChar(String str) {
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			String c = str.substring(i, i + 1);
			s = s + c + c;
		}
		return s;
	}

	// Return the number of times that the string "hi" appears anywhere in the
	// given string.
	//
	// countHi("abc hi ho") ¡ú 1
	// countHi("ABChi hi") ¡ú 2
	// countHi("hihi") ¡ú 2
	public int countHi(String str) {

		int count = 0;

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.substring(i, i + 2).equals("hi")) {
				count++;
			}
		}
		return count;
	}

	// Return true if the string "cat" and "dog" appear the same number of times
	// in the given string.
	//
	// catDog("catdog") ¡ú true
	// catDog("catcat") ¡ú false
	// catDog("1cat1cadodog") ¡ú true
	public boolean catDog(String str) {
		int countc = 0;
		int countd = 0;
		for (int i = 0; i <= str.length() - 3; i++) {
			if (str.substring(i, i + 3).equals("cat")) {
				countc++;
			}
		}
		for (int i = 0; i <= str.length() - 3; i++) {
			if (str.substring(i, i + 3).equals("dog")) {
				countd++;
			}
		}
		if (countc == countd) {
			return true;
		} else {
			return false;
		}
	}

	// Return the number of times that the string "code" appears anywhere in the
	// given string, except we'll accept any letter for the 'd', so "cope" and
	// "cooe" count.
	//
	// countCode("aaacodebbb") ¡ú 1
	// countCode("codexxcode") ¡ú 2
	// countCode("cozexxcope") ¡ú 2
	public int countCode(String str) {

		int count = 0;

		for (int i = 0; i <= str.length() - 4; i++) {
			String s = str.substring(i, i + 4);
			if (s.charAt(0) == 'c' && s.charAt(1) == 'o' && s.charAt(3) == 'e') {
				count++;
			}
		}
		return count;
	}

	// Given two strings, return true if either of the strings appears at the
	// very end of the other string, ignoring upper/lower case differences (in
	// other words, the computation should not be "case sensitive"). Note:
	// str.toLowerCase() returns the lowercase version of a string.
	//
	// endOther("Hiabc", "abc") ¡ú true
	// endOther("AbC", "HiaBc") ¡ú true
	// endOther("abc", "abXabc") ¡ú true
	public boolean endOther(String a, String b) {

		int lena = a.length();
		int lenb = b.length();

		if (lena > lenb) {
			if (a.substring(lena - lenb).equalsIgnoreCase(b)) {
				return true;
			}
			return false;
		} else if (lena <= lenb) {
			if (b.substring(lenb - lena).equalsIgnoreCase(a)) {
				return true;
			}
			return false;
		}
		return false;
	}

	// Return true if the given string contains an appearance of "xyz" where the
	// xyz is not directly preceeded by a period (.). So "xxyz" counts but
	// "x.xyz" does not.
	//
	// xyzThere("abcxyz") ¡ú true
	// xyzThere("abc.xyz") ¡ú false
	// xyzThere("xyz.abc") ¡ú true
	public boolean xyzThere(String str) {

		for (int i = 0; i < str.length() - 2; i++) {
			if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'y' && str.charAt(i + 2) == 'z') {
				if (i == 0 || str.charAt(i - 1) != '.')
					return true;
			}
		}
		return false;
	}

	// Return true if the given string contains a "bob" string, but where the
	// middle 'o' char can be any char.
	//
	// bobThere("abcbob") ¡ú true
	// bobThere("b9b") ¡ú true
	// bobThere("bac") ¡ú false
	public boolean bobThere(String str) {
		boolean flag = false;

		if (str.length() < 3) {
			flag = false;
		} else {
			for (int i = 0; i < str.length() - 2; i++) {

				String s = str.substring(i, i + 3);
				String a = s.substring(0, 1);
				String b = s.substring(2, 3);

				if (a.equals("b") && b.equals("b")) {
					flag = true;
				}
			}
		}

		return flag;
	}

	// We'll say that a String is xy-balanced if for all the 'x' chars in the
	// string, there exists a 'y' char somewhere later in the string. So "xxy"
	// is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return
	// true if the given string is xy-balanced.
	//
	// xyBalance("aaxbby") ¡ú true
	// xyBalance("aaxbb") ¡ú false
	// xyBalance("yaaxbb") ¡ú false
	public boolean xyBalance(String str) {

		int countx = 0;
		int county = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'x') {
				countx = i;
			}
			if (str.charAt(i) == 'y') {
				county = i;
			}
		}

		if (str.equals("x"))
			return false;
		if (countx > county) {
			return false;
		}
		return true;
	}

	// Given two strings, a and b, create a bigger string made of the first char
	// of a, the first char of b, the second char of a, the second char of b,
	// and so on. Any leftover chars go at the end of the result.
	//
	// mixString("abc", "xyz") ¡ú "axbycz"
	// mixString("Hi", "There") ¡ú "HTihere"
	// mixString("xxxx", "There") ¡ú "xTxhxexre"
	public String mixString(String a, String b) {

		String result = "";
		int len = a.length() < b.length() ? a.length() : b.length();

		for (int i = 0; i < len; i++) {
			result = result + a.substring(i, i + 1) + b.substring(i, i + 1);
		}

		if (a.length() > b.length()) {
			result = result + a.substring(len);
		}
		result = result + b.substring(len);
		return result;
	}

	// Given a string and an int n, return a string made of n repetitions of the
	// last n characters of the string. You may assume that n is between 0 and
	// the length of the string, inclusive.
	//
	// repeatEnd("Hello", 3) ¡ú "llollollo"
	// repeatEnd("Hello", 2) ¡ú "lolo"
	// repeatEnd("Hello", 1) ¡ú "o"
	public String repeatEnd(String str, int n) {
		String result = "";
		str = str.substring(str.length() - n, str.length());
		for (int i = 0; i < n; i++) {
			result = result + str;
		}
		return result;
	}

	// Given a string and an int n, return a string made of the first n
	// characters of the string, followed by the first n-1 characters of the
	// string, and so on. You may assume that n is between 0 and the length of
	// the string, inclusive (i.e. n >= 0 and n <= str.length()).
	//
	// repeatFront("Chocolate", 4) ¡ú "ChocChoChC"
	// repeatFront("Chocolate", 3) ¡ú "ChoChC"
	// repeatFront("Ice Cream", 2) ¡ú "IcI"
	public String repeatFront(String str, int n) {

		String result = "";

		for (int i = n; i > 0; i--) {
			result = result + str.substring(0, i);
		}
		return result;
	}

	// Given two strings, word and a separator sep, return a big string made of
	// count occurrences of the word, separated by the separator string.
	//
	// repeatSeparator("Word", "X", 3) ¡ú "WordXWordXWord"
	// repeatSeparator("This", "And", 2) ¡ú "ThisAndThis"
	// repeatSeparator("This", "And", 1) ¡ú "This"
	public String repeatSeparator(String word, String sep, int count) {
		String str = "";
		for (int i = 0; i < count; i++) {
			str = str + word + sep;
		}
		int len = sep.length();
		str = str.substring(0, str.length() - len);
		return str;
	}

	// Given a string, consider the prefix string made of the first N chars of
	// the string. Does that prefix string appear somewhere else in the string?
	// Assume that the string is not empty and that N is in the range
	// 1..str.length().
	//
	// prefixAgain("abXYabc", 1) ¡ú true
	// prefixAgain("abXYabc", 2) ¡ú true
	// prefixAgain("abXYabc", 3) ¡ú false
	public boolean prefixAgain(String str, int n) {

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(n - 1)) {
				count++;
			}
		}
		if (count > 1) {
			return true;
		}
		return false;
	}

	// Given a string, does "xyz" appear in the middle of the string? To define
	// middle, we'll say that the number of chars to the left and right of the
	// "xyz" must differ by at most one. This problem is harder than it looks.
	//
	// xyzMiddle("AAxyzBB") ¡ú true
	// xyzMiddle("AxyzBB") ¡ú true
	// xyzMiddle("AxyzBBB") ¡ú false
	public boolean xyzMiddle(String str) {

		int len = str.length();
		int mid = 0;
		if (len < 3) {
			return false;
		}

		mid = len / 2;

		if (len % 2 == 0) {
			if (str.charAt(mid) == 'y')
				return (str.charAt(mid - 1) == 'x' && str.charAt(mid + 1) == 'z');
			if (str.charAt(mid - 1) == 'y')
				return (str.charAt(mid - 2) == 'x' && str.charAt(mid) == 'z');
			return false;
		} else if (str.charAt(mid) == 'y')
			return (str.charAt(mid - 1) == 'x' && str.charAt(mid + 1) == 'z');
		return false;
	}

	// A sandwich is two pieces of bread with something in between. Return the
	// string that is between the first and last appearance of "bread" in the
	// given string, or return the empty string "" if there are not two pieces
	// of bread.
	//
	// getSandwich("breadjambread") ¡ú "jam"
	// getSandwich("xxbreadjambreadyy") ¡ú "jam"
	// getSandwich("xxbreadyy") ¡ú ""
	public String getSandwich(String str) {

		int index = 0;
		int index1 = str.indexOf("bread");

		for (int i = 0; i <= str.length() - 5; i++) {
			if (str.substring(i, i + 5).equals("bread")) {
				index = i;
			}
		}
		if (index1 == -1 || index == index1) {
			return "";
		}
		return str.substring(str.indexOf("bread") + 5, index);
	}

	// Returns true if for every '*' (star) in the string, if there are chars
	// both immediately before and after the star, they are the same.
	//
	// sameStarChar("xy*yzz") ¡ú true
	// sameStarChar("xy*zzz") ¡ú false
	// sameStarChar("*xa*az") ¡ú true
	public boolean sameStarChar(String str) {

		boolean flag = true;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '*') {
				if (i != 0 && i != str.length() - 1) {
					if (!str.substring(i - 1, i).equals(str.substring(i + 1, i + 2))) {
						flag = false;
						break;
					}
				}
			}
		}
		return flag;
	}

	// Given a string, compute a new string by moving the first char to come
	// after the next two chars, so "abc" yields "bca". Repeat this process for
	// each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any
	// group of fewer than 3 chars at the end.
	//
	// oneTwo("abc") ¡ú "bca"
	// oneTwo("tca") ¡ú "cat"
	// oneTwo("tcagdo") ¡ú "catdog"
	public String oneTwo(String str) {

		String result = "";

		for (int i = 0; i <= str.length() - 3; i += 3) {
			String a = str.substring(i, i + 3);
			a = a.substring(1, 3) + a.substring(0, 1);
			result = result + a;
		}

		return result;
	}

	// Look for patterns like "zip" and "zap" in the string -- length-3,
	// starting with 'z' and ending with 'p'. Return a string where for all such
	// words, the middle letter is gone, so "zipXzap" yields "zpXzp".
	//
	// zipZap("zipXzap") ¡ú "zpXzp"
	// zipZap("zopzop") ¡ú "zpzp"
	// zipZap("zzzopzop") ¡ú "zzzpzp"
	public String zipZap(String str) {

		for (int i = 0; i < str.length() - 2; i++) {
			if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
				str = str.replace(str.substring(i, i + 3), "zp");
			}
		}
		return str;
	}

	// Return a version of the given string, where for every star (*) in the
	// string the star and the chars immediately to its left and right are gone.
	// So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
	//
	// starOut("ab*cd") ¡ú "ad"
	// starOut("ab**cd") ¡ú "ad"
	// starOut("sm*eilly") ¡ú "silly"
	public String starOut(String str) {

		if (str.equals("*")) {
			return "";
		}

		while (str.indexOf("*") != -1) {
			int start = str.indexOf("*");
			int end = 0;

			if (start == str.length() - 1) {
				str = str.replace(str.substring(start - 1), "");
			}

			for (int i = start; i < str.length(); i++) {
				if (str.charAt(i) != '*') {
					end = i;
					if (start != 0 && end != str.length()) {
						str = str.replace(str.substring(start - 1, end + 1), "");
					} else if (start == 0 && end != str.length()) {
						str = str.replace(str.substring(start, end + 1), "");
					} else if (end == str.length() && start != 0) {
						str = str.replace(str.substring(start - 1, end), "");
					}
					break;
				}
			}

		}

		return str;
	}

	// Given a string and a non-empty word string, return a version of the
	// original String where all chars have been replaced by pluses ("+"),
	// except for appearances of the word string which are preserved unchanged.
	//
	// plusOut("12xy34", "xy") ¡ú "++xy++"
	// plusOut("12xy34", "1") ¡ú "1+++++"
	// plusOut("12xy34xyabcxy", "xy") ¡ú "++xy++xy+++xy"
	public String plusOut(String str, String word) {

		for (int i = 0; i <= str.length() - word.length(); i++) {
			if (str.substring(i, i + word.length()).equals(word)) {
				str = str.replace(str.substring(i, i + word.length()), " ");
			}
		}
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				str = str.replace(str.substring(i, i + 1), "+");
			}
		}

		return str.replace(" ", word);
	}

	// Given a string and a non-empty word string, return a string made of each
	// char just before and just after every appearance of the word in the
	// string. Ignore cases where there is no char before or after the word, and
	// a char may be included twice if it is between two words.
	//
	// wordEnds("abcXY123XYijk", "XY") ¡ú "c13i"
	// wordEnds("XY123XY", "XY") ¡ú "13"
	// wordEnds("XY1XY", "XY") ¡ú "11"
	public String wordEnds(String str, String word) {

		int lenstr = str.length();
		int lenword = word.length();
		int start = str.indexOf(word);
		StringBuilder bd = new StringBuilder();

		while (start != -1) {

			if (start >= 1) {
				bd.append(str.charAt(start - 1));
			}

			if (start + lenword < lenstr) {
				bd.append(str.charAt(start + lenword));
			}

			start = str.indexOf(word, start + lenword);
		}

		return bd.toString();
	}

	
}
