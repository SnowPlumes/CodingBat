package code;

public class Logic2 {

	// We want to make a row of bricks that is goal inches long. We have a
	// number of small bricks (1 inch each) and big bricks (5 inches each).
	// Return true if it is possible to make the goal by choosing from the given
	// bricks. This is a little harder than it looks and can be done without any
	// loops. See also: Introduction to MakeBricks
	//
	// makeBricks(3, 1, 8) ¡ú true
	// makeBricks(3, 1, 9) ¡ú false
	// makeBricks(3, 2, 10) ¡ú true
	public boolean makeBricks(int small, int big, int goal) {

		if (goal / 5 <= big) {
			if (goal % 5 <= small) {
				return true;
			}
		} else if (goal / 5 >= big) {
			if (goal - big * 5 <= small) {
				return true;
			}
		}
		return false;
	}

	// Given 3 int values, a b c, return their sum. However, if one of the
	// values is the same as another of the values, it does not count towards
	// the sum.
	//
	// loneSum(1, 2, 3) ¡ú 6
	// loneSum(3, 2, 3) ¡ú 2
	// loneSum(3, 3, 3) ¡ú 0
	public int loneSum(int a, int b, int c) {

		if (a == b && a == c) {
			return 0;
		} else if (a == b && a != c) {
			return c;
		} else if (a == c && a != b) {
			return b;
		} else if (b == c && b != a) {
			return a;
		}
		return a + b + c;
	}

	// Given 3 int values, a b c, return their sum. However, if one of the
	// values is 13 then it does not count towards the sum and values to its
	// right do not count. So for example, if b is 13, then both b and c do not
	// count.
	//
	// luckySum(1, 2, 3) ¡ú 6
	// luckySum(1, 2, 13) ¡ú 3
	// luckySum(1, 13, 3) ¡ú 1
	public int luckySum(int a, int b, int c) {

		if (a == 13) {
			return 0;
		} else if (b == 13) {
			return a;
		} else if (c == 13) {
			return a + b;
		}
		return a + b + c;
	}

	// Given 3 int values, a b c, return their sum. However, if any of the
	// values is a teen -- in the range 13..19 inclusive -- then that value
	// counts as 0, except 15 and 16 do not count as a teens. Write a separate
	// helper "public int fixTeen(int n) {"that takes in an int value and
	// returns that value fixed for the teen rule. In this way, you avoid
	// repeating the teen code 3 times (i.e. "decomposition"). Define the helper
	// below and at the same indent level as the main noTeenSum().
	//
	// noTeenSum(1, 2, 3) ¡ú 6
	// noTeenSum(2, 13, 1) ¡ú 3
	// noTeenSum(2, 1, 14) ¡ú 3
	public int noTeenSum(int a, int b, int c) {

		if (a >= 13 && a <= 19) {
			if (a != 15 && a != 16) {
				a = 0;
			}
		}

		if (b >= 13 && b <= 19) {
			if (b != 15 && b != 16) {
				b = 0;
			}
		}

		if (c >= 13 && c <= 19) {
			if (c != 15 && c != 16) {
				c = 0;
			}
		}

		return a + b + c;
	}

	// For this problem, we'll round an int value up to the next multiple of 10
	// if its rightmost digit is 5 or more, so 15 rounds up to 20. Alternately,
	// round down to the previous multiple of 10 if its rightmost digit is less
	// than 5, so 12 rounds down to 10. Given 3 ints, a b c, return the sum of
	// their rounded values. To avoid code repetition, write a separate helper
	// "public int round10(int num) {" and call it 3 times. Write the helper
	// entirely below and at the same indent level as roundSum().
	//
	// roundSum(16, 17, 18) ¡ú 60
	// roundSum(12, 13, 14) ¡ú 30
	// roundSum(6, 4, 4) ¡ú 10
	public int roundSum(int a, int b, int c) {

		int a1 = 0;
		int b1 = 0;
		int c1 = 0;

		if (a % 10 >= 5) {
			a1 = (a / 10 + 1) * 10;
		} else {
			a1 = a / 10 * 10;
		}

		if (b % 10 >= 5) {
			b1 = (b / 10 + 1) * 10;
		} else {
			b1 = b / 10 * 10;
		}

		if (c % 10 >= 5) {
			c1 = (c / 10 + 1) * 10;
		} else {
			c1 = c / 10 * 10;
		}

		return a1 + b1 + c1;
	}

	// Given three ints, a b c, return true if one of b or c is "close"
	// (differing from a by at most 1), while the other is "far", differing from
	// both other values by 2 or more. Note: Math.abs(num) computes the absolute
	// value of a number.
	//
	// closeFar(1, 2, 10) ¡ú true
	// closeFar(1, 2, 3) ¡ú false
	// closeFar(4, 1, 3) ¡ú true
	public boolean closeFar(int a, int b, int c) {

		if ((Math.abs(a - b) <= 1 && Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2)
				|| (Math.abs(a - c) <= 1 && Math.abs(a - b) >= 2 && Math.abs(b - c) >= 2)) {
			return true;
		}
		return false;
	}

	// Given 2 int values greater than 0, return whichever value is nearest to
	// 21 without going over. Return 0 if they both go over.
	//
	// blackjack(19, 21) ¡ú 21
	// blackjack(21, 19) ¡ú 21
	// blackjack(19, 22) ¡ú 19
	public int blackjack(int a, int b) {

		if (a > 21 && b > 21) {
			return 0;
		} else if (a > 21) {
			return b;
		} else if (b > 21) {
			return a;
		}
		if (21 - a > 21 - b) {
			return b;
		}
		return a;
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large.
	//
	// evenlySpaced(2, 4, 6) ¡ú true
	// evenlySpaced(4, 6, 2) ¡ú true
	// evenlySpaced(4, 6, 3) ¡ú false
	public boolean evenlySpaced(int a, int b, int c) {

		int[] arr = { a, b, c };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int temp = 0;
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		if (arr[2] - arr[1] == arr[1] - arr[0]) {
			return true;
		}
		return false;
	}

	// We want make a package of goal kilos of chocolate. We have small bars (1
	// kilo each) and big bars (5 kilos each). Return the number of small bars
	// to use, assuming we always use big bars before small bars. Return -1 if
	// it can't be done.
	//
	// makeChocolate(4, 1, 9) ¡ú 4
	// makeChocolate(4, 1, 10) ¡ú -1
	// makeChocolate(4, 1, 7) ¡ú 2
	public int makeChocolate(int small, int big, int goal) {

		if (goal / 5 <= big) {
			if (goal % 5 <= small) {
				return goal % 5;
			}
		} else if (goal / 5 >= big) {
			if (goal - big * 5 <= small) {
				return goal - big * 5;
			}
		}

		return -1;

	}
}
