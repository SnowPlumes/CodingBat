package code;

public class String3 {

	// Given a string, count the number of words ending in 'y' or 'z' -- so the
	// 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow"
	// (not case sensitive). We'll say that a y or z is at the end of a word if
	// there is not an alphabetic letter immediately following it. (Note:
	// Character.isLetter(char) tests if a char is an alphabetic letter.)
	//
	// countYZ("fez day") ¡ú 2
	// countYZ("day fez") ¡ú 2
	// countYZ("day fyyyz") ¡ú 2
	public int countYZ(String str) {

		int count = 0;
		str = str.toLowerCase();

		for (int i = 1; i < str.length(); i++) {
			if (!Character.isLetter(str.charAt(i))) {
				if (str.charAt(i - 1) == 'z' || str.charAt(i - 1) == 'y') {
					count++;
				}
			}
		}

		if (str.charAt(str.length() - 1) == 'z' || str.charAt(str.length() - 1) == 'y') {
			count++;
		}
		return count;
	}

	// Given two strings, base and remove, return a version of the base string
	// where all instances of the remove string have been removed (not case
	// sensitive). You may assume that the remove string is length 1 or more.
	// Remove only non-overlapping instances, so with "xxx" removing "xx" leaves
	// "x".
	//
	// withoutString("Hello there", "llo") ¡ú "He there"
	// withoutString("Hello there", "e") ¡ú "Hllo thr"
	// withoutString("Hello there", "x") ¡ú "Hello there"
	public String withoutString(String base, String remove) {

		int lenb = base.length();
		int lenr = remove.length();
		String newbase = base.toLowerCase();
		remove = remove.toLowerCase();
		int index = newbase.indexOf(remove);
		int i = 0;
		StringBuilder sb = new StringBuilder();

		while (index != -1) {
			sb.append(base.substring(i, index));
			i = index + lenr;
			index = newbase.indexOf(remove, index + lenr);
		}

		if (i < lenb) {
			sb.append(base.substring(i));
		}

		return sb.toString();
	}

	// Given a string, return true if the number of appearances of "is" anywhere
	// in the string is equal to the number of appearances of "not" anywhere in
	// the string (case sensitive).
	//
	// equalIsNot("This is not") ¡ú false
	// equalIsNot("This is notnot") ¡ú true
	// equalIsNot("noisxxnotyynotxisi") ¡ú true
	public boolean equalIsNot(String str) {
		int counti = 0;
		int countn = 0;
		for (int i = 0; i <= str.length() - 2; i++) {
			if (str.substring(i, i + 2).equals("is")) {
				counti++;
			}
		}
		for (int i = 0; i <= str.length() - 3; i++) {
			if (str.substring(i, i + 3).equals("not")) {
				countn++;
			}
		}
		if (counti == countn) {
			return true;
		} else {
			return false;
		}
	}

	// We'll say that a lowercase 'g' in a string is "happy" if there is another
	// 'g' immediately to its left or right. Return true if all the g's in the
	// given string are happy.
	//
	// gHappy("xxggxx") ¡ú true
	// gHappy("xxgxx") ¡ú false
	// gHappy("xxggyygxx") ¡ú false
	public boolean gHappy(String str) {

		int check = 0;
		int limit = str.length();

		for (int i = 0; i < limit; i++) {
			if (str.charAt(i) == 'g') {
				check = 0;
				if (i > 0) {
					if (str.charAt(i - 1) != 'g')
						check++;
				} else
					check++;
				if (i < limit - 1) {
					if (str.charAt(i + 1) != 'g')
						check++;
				} else
					check++;
				if (check == 2)
					return false;
			}
		}
		return true;
	}

	// We'll say that a "triple" in a string is a char appearing three times in
	// a row. Return the number of triples in the given string. The triples may
	// overlap.
	//
	// countTriple("abcXXXabc") ¡ú 1
	// countTriple("xxxabyyyycd") ¡ú 3
	// countTriple("a") ¡ú 0
	public int countTriple(String str) {

		int count = 0;

		for (int i = 0; i < str.length() - 2; i++) {
			if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) {
				count++;
			}
		}
		return count;
	}

	// Given a string, return the sum of the digits 0-9 that appear in the
	// string, ignoring all other characters. Return 0 if there are no digits in
	// the string. (Note: Character.isDigit(char) tests if a char is one of the
	// chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an
	// int.)
	//
	// sumDigits("aa1bc2d3") ¡ú 6
	// sumDigits("aa11b33") ¡ú 8
	// sumDigits("Chocolate") ¡ú 0
	public int sumDigits(String str) {

		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				sum += Integer.parseInt(str.substring(i, i + 1));
			}
		}

		return sum;
	}

	// Given a string, return the longest substring that appears at both the
	// beginning and end of the string without overlapping. For example,
	// sameEnds("abXab") is "ab".
	//
	// sameEnds("abXYab") ¡ú "ab"
	// sameEnds("xx") ¡ú "x"
	// sameEnds("xxx") ¡ú "x"
	public String sameEnds(String string) {

		int len = string.length();
		int ind = len / 2;
		String temp;

		if (len % 2 == 0) {
			for (int i = len / 2; i > 0; i--) {
				temp = string.substring(0, i);
				if (temp.equals(string.substring(ind, len)))
					return temp;
				ind++;
			}
		} else {
			for (int i = len / 2; i > 0; i--) {
				temp = string.substring(0, i);
				if (temp.equals(string.substring(ind + 1, len)))
					return temp;
				ind++;
			}
		}

		return "";
	}

	// Given a string, look for a mirror image (backwards) string at both the
	// beginning and end of the given string. In other words, zero or more
	// characters at the very begining of the given string, and at the very end
	// of the string in reverse order (possibly overlapping). For example, the
	// string "abXYZba" has the mirror end "ab".
	//
	// mirrorEnds("abXYZba") ¡ú "ab"
	// mirrorEnds("abca") ¡ú "a"
	// mirrorEnds("aba") ¡ú "aba"
	public String mirrorEnds(String string) {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != string.charAt(string.length() - 1 - i))
				break;
			if (string.charAt(i) == string.charAt(string.length() - 1 - i)) {
				sb.append(string.charAt(i));
			}
		}

		return sb.toString();
	}

	// Given a string, return the length of the largest "block" in the string. A
	// block is a run of adjacent chars that are the same.
	//
	// maxBlock("hoopla") ¡ú 2
	// maxBlock("abbCCCddBBBxx") ¡ú 3
	// maxBlock("") ¡ú 0
	public int maxBlock(String str) {

		int max = 0;
		int j = 0;

		for (int i = 0; i < str.length(); i++) {
			for (j = i; j < str.length(); j++) {
				if (str.charAt(i) != str.charAt(j)) {
					if (max < j - i) {
						max = j - i;
					}
					break;
				}
			}
		}

		for (int i = str.length() - 1; i > 0; i--) {
			for (j = str.length() - 1; j > 0; j--) {
				if (str.charAt(i) != str.charAt(j)) {
					if (max < i - j) {
						max = i - j;
					}
					break;
				}
			}
		}

		return max;
	}

	// Given a string, return the sum of the numbers appearing in the string,
	// ignoring all other characters. A number is a series of 1 or more digit
	// chars in a row. (Note: Character.isDigit(char) tests if a char is one of
	// the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to
	// an int.)
	//
	// sumNumbers("abc123xyz") ¡ú 123
	// sumNumbers("aa11b33") ¡ú 44
	// sumNumbers("7 11") ¡ú 18
	public int sumNumbers(String str) {

		int len = str.length();
		int start = -1;
		int end = 0;
		int sum = 0;

		for (int i = 0; i < len; i++) {
			if (start == -1) {
				if (Character.isDigit(str.charAt(i))) {
					start = i;
					end = i + 1;
				}
			} else {
				if (Character.isDigit(str.charAt(i)))
					end++;
				else {
					sum += Integer.parseInt(str.substring(start, end));
					start = -1;
				}
			}
		}
		if (start != -1)
			sum += Integer.parseInt(str.substring(start, end));
		return sum;
	}

	// Given a string, return a string where every appearance of the lowercase
	// word "is" has been replaced with "is not". The word "is" should not be
	// immediately preceeded or followed by a letter -- so for example the "is"
	// in "this" does not count. (Note: Character.isLetter(char) tests if a char
	// is a letter.)
	//
	// notReplace("is test") ¡ú "is not test"
	// notReplace("is-is") ¡ú "is not-is not"
	// notReplace("This is right") ¡ú "This is not right"
	public String notReplace(String str) {

		int p = str.indexOf("is");
		int check;

		while (p != -1) {
			check = 0;
			if (p > 0) {
				if (!Character.isLetter(str.charAt(p - 1)))
					check++;
			} else
				check++;
			if (p < str.length() - 2) {
				if (!Character.isLetter(str.charAt(p + 2)))
					check++;
			} else
				check++;
			if (check == 2)
				str = str.substring(0, p) + "is not" + str.substring(p + 2);
			p = str.indexOf("is", p + 2);
		}
		return str;
	}

	
}
