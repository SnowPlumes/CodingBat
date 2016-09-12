package code;

public class Array1 {

	// Given an array of ints, return true if 6 appears as either the first or
	// last element in the array. The array will be length 1 or more.
	//
	// firstLast6([1, 2, 6]) ¡ú true
	// firstLast6([6, 1, 2, 3]) ¡ú true
	// firstLast6([13, 6, 1, 2, 3]) ¡ú false
	public boolean firstLast6(int[] nums) {
		if (nums[0] == 6 || nums[nums.length - 1] == 6) {
			return true;
		}
		return false;
	}

	// Given an array of ints, return true if the array is length 1 or more, and
	// the first element and the last element are equal.
	//
	// sameFirstLast([1, 2, 3]) ¡ú false
	// sameFirstLast([1, 2, 3, 1]) ¡ú true
	// sameFirstLast([1, 2, 1]) ¡ú true
	public boolean sameFirstLast(int[] nums) {
		boolean flag = false;
		if (nums.length == 0) {
			flag = false;
		} else if (nums[0] == nums[nums.length - 1]) {
			flag = true;
		}
		return flag;
	}

	// Return an int array length 3 containing the first 3 digits of pi, {3, 1,
	// 4}.
	//
	// makePi() ¡ú [3, 1, 4]
	public int[] makePi() {

		int[] nums = { 3, 1, 4 };

		return nums;
	}

	// Given 2 arrays of ints, a and b, return true if they have the same first
	// element or they have the same last element. Both arrays will be length 1
	// or more.
	//
	// commonEnd([1, 2, 3], [7, 3]) ¡ú true
	// commonEnd([1, 2, 3], [7, 3, 2]) ¡ú false
	// commonEnd([1, 2, 3], [1, 3]) ¡ú true
	public boolean commonEnd(int[] a, int[] b) {

		if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
			return true;
		}
		return false;
	}

	// Given an array of ints length 3, return the sum of all the elements.
	//
	// sum3([1, 2, 3]) ¡ú 6
	// sum3([5, 11, 2]) ¡ú 18
	// sum3([7, 0, 0]) ¡ú 7
	public int sum3(int[] nums) {

		return nums[0] + nums[1] + nums[2];
	}

	// Given an array of ints length 3, return an array with the elements
	// "rotated left" so {1, 2, 3} yields {2, 3, 1}.
	//
	// rotateLeft3([1, 2, 3]) ¡ú [2, 3, 1]
	// rotateLeft3([5, 11, 9]) ¡ú [11, 9, 5]
	// rotateLeft3([7, 0, 0]) ¡ú [0, 0, 7]
	public int[] rotateLeft3(int[] nums) {

		int temp = nums[0];

		nums[0] = nums[1];
		nums[1] = nums[2];
		nums[2] = temp;

		return nums;
	}

	// Given an array of ints length 3, return a new array with the elements in
	// reverse order, so {1, 2, 3} becomes {3, 2, 1}.
	//
	// reverse3([1, 2, 3]) ¡ú [3, 2, 1]
	// reverse3([5, 11, 9]) ¡ú [9, 11, 5]
	// reverse3([7, 0, 0]) ¡ú [0, 0, 7]
	public int[] reverse3(int[] nums) {

		int temp = nums[0];

		nums[0] = nums[2];
		nums[2] = temp;

		return nums;
	}

	// Given an array of ints length 3, figure out which is larger between the
	// first and last elements in the array, and set all the other elements to
	// be that value. Return the changed array.
	//
	// maxEnd3([1, 2, 3]) ¡ú [3, 3, 3]
	// maxEnd3([11, 5, 9]) ¡ú [11, 11, 11]
	// maxEnd3([2, 11, 3]) ¡ú [3, 3, 3]
	public int[] maxEnd3(int[] nums) {

		int max = 0;

		if (nums[0] > nums[2]) {
			max = nums[0];
		} else {
			max = nums[2];
		}

		nums[0] = max;
		nums[1] = max;
		nums[2] = max;

		return nums;
	}

	// Given an array of ints, return the sum of the first 2 elements in the
	// array. If the array length is less than 2, just sum up the elements that
	// exist, returning 0 if the array is length 0.
	//
	// sum2([1, 2, 3]) ¡ú 3
	// sum2([1, 1]) ¡ú 2
	// sum2([1, 1, 1, 1]) ¡ú 2
	public int sum2(int[] nums) {
		int sum = 0;
		if (nums.length == 1) {
			sum = nums[0];
		} else if (nums.length >= 2) {
			sum = nums[0] + nums[1];
		}
		return sum;
	}

	// Given 2 int arrays, a and b, each length 3, return a new array length 2
	// containing their middle elements.
	//
	// middleWay([1, 2, 3], [4, 5, 6]) ¡ú [2, 5]
	// middleWay([7, 7, 7], [3, 8, 0]) ¡ú [7, 8]
	// middleWay([5, 2, 9], [1, 4, 5]) ¡ú [2, 4]
	public int[] middleWay(int[] a, int[] b) {

		int[] mid = new int[2];

		mid[0] = a[1];
		mid[1] = b[1];

		return mid;
	}

	// Given an array of ints, return a new array length 2 containing the first
	// and last elements from the original array. The original array will be
	// length 1 or more.
	//
	// makeEnds([1, 2, 3]) ¡ú [1, 3]
	// makeEnds([1, 2, 3, 4]) ¡ú [1, 4]
	// makeEnds([7, 4, 6, 2]) ¡ú [7, 2]
	public int[] makeEnds(int[] nums) {

		int[] ends = new int[2];

		ends[0] = nums[0];
		ends[1] = nums[nums.length - 1];

		return ends;
	}

	// Given an int array length 2, return true if it contains a 2 or a 3.
	//
	// has23([2, 5]) ¡ú true
	// has23([4, 3]) ¡ú true
	// has23([4, 5]) ¡ú false
	public boolean has23(int[] nums) {

		if (nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3) {
			return true;
		}
		return false;
	}

	// Given an int array length 2, return true if it does not contain a 2 or 3.
	//
	// no23([4, 5]) ¡ú true
	// no23([4, 2]) ¡ú false
	// no23([3, 5]) ¡ú false
	public boolean no23(int[] nums) {

		if (nums[0] != 2 && nums[0] != 3 && nums[1] != 2 && nums[1] != 3) {
			return true;
		}
		return false;
	}

	// Given an int array, return a new array with double the length where its
	// last element is the same as the original array, and all the other
	// elements are 0. The original array will be length 1 or more. Note: by
	// default, a new int array contains all 0's.
	//
	// makeLast([4, 5, 6]) ¡ú [0, 0, 0, 0, 0, 6]
	// makeLast([1, 2]) ¡ú [0, 0, 0, 2]
	// makeLast([3]) ¡ú [0, 3]
	public int[] makeLast(int[] nums) {

		int[] newnum = new int[nums.length * 2];

		for (int i = 0; i < newnum.length - 1; i++) {
			newnum[i] = 0;
		}

		newnum[newnum.length - 1] = nums[nums.length - 1];
		return newnum;
	}

	// Given an int array, return true if the array contains 2 twice, or 3
	// twice. The array will be length 0, 1, or 2.
	//
	// double23([2, 2]) ¡ú true
	// double23([3, 3]) ¡ú true
	// double23([2, 3]) ¡ú false
	public boolean double23(int[] nums) {

		int count2 = 0;
		int count3 = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2) {
				count2++;
			}
			if (nums[i] == 3) {
				count3++;
			}
		}

		if (count2 == 2 || count3 == 2) {
			return true;
		}
		return false;
	}

	// Given an int array length 3, if there is a 2 in the array immediately
	// followed by a 3, set the 3 element to 0. Return the changed array.
	//
	// fix23([1, 2, 3]) ¡ú [1, 2, 0]
	// fix23([2, 3, 5]) ¡ú [2, 0, 5]
	// fix23([1, 2, 1]) ¡ú [1, 2, 1]
	public int[] fix23(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (i != 0) {
				if (nums[i] == 3 && nums[i - 1] == 2) {
					nums[i] = 0;
				}
			}
		}
		return nums;
	}

	// Start with 2 int arrays, a and b, of any length. Return how many of the
	// arrays have 1 as their first element.
	//
	// start1([1, 2, 3], [1, 3]) ¡ú 2
	// start1([7, 2, 3], [1]) ¡ú 1
	// start1([1, 2], []) ¡ú 1
	public int start1(int[] a, int[] b) {

		int count = 0;

		if (a.length != 0) {
			if (a[0] == 1)
				count++;
		}
		if (b.length != 0) {
			if (b[0] == 1)
				count++;
		}

		return count;
	}

	// Start with 2 int arrays, a and b, each length 2. Consider the sum of the
	// values in each array. Return the array which has the largest sum. In
	// event of a tie, return a.
	//
	// biggerTwo([1, 2], [3, 4]) ¡ú [3, 4]
	// biggerTwo([3, 4], [1, 2]) ¡ú [3, 4]
	// biggerTwo([1, 1], [1, 2]) ¡ú [1, 2]
	public int[] biggerTwo(int[] a, int[] b) {

		if (a[0] + a[1] >= b[0] + b[1]) {
			return a;
		}
		return b;

	}

	// Given an array of ints of even length, return a new array length 2
	// containing the middle two elements from the original array. The original
	// array will be length 2 or more.
	//
	// makeMiddle([1, 2, 3, 4]) ¡ú [2, 3]
	// makeMiddle([7, 1, 2, 3, 4, 9]) ¡ú [2, 3]
	// makeMiddle([1, 2]) ¡ú [1, 2]
	public int[] makeMiddle(int[] nums) {

		int newnum[] = new int[2];
		newnum[0] = nums[nums.length / 2 - 1];
		newnum[1] = nums[nums.length / 2];
		return newnum;
	}

	// Given 2 int arrays, each length 2, return a new array length 4 containing
	// all their elements.
	//
	// plusTwo([1, 2], [3, 4]) ¡ú [1, 2, 3, 4]
	// plusTwo([4, 4], [2, 2]) ¡ú [4, 4, 2, 2]
	// plusTwo([9, 2], [3, 4]) ¡ú [9, 2, 3, 4]
	public int[] plusTwo(int[] a, int[] b) {

		int[] nums = new int[4];

		nums[0] = a[0];
		nums[1] = a[1];
		nums[2] = b[0];
		nums[3] = b[1];

		return nums;
	}

	// Given an array of ints, swap the first and last elements in the array.
	// Return the modified array. The array length will be at least 1.
	//
	// swapEnds([1, 2, 3, 4]) ¡ú [4, 2, 3, 1]
	// swapEnds([1, 2, 3]) ¡ú [3, 2, 1]
	// swapEnds([8, 6, 7, 9, 5]) ¡ú [5, 6, 7, 9, 8]
	public int[] swapEnds(int[] nums) {

		int temp = nums[0];
		nums[0] = nums[nums.length - 1];
		nums[nums.length - 1] = temp;

		return nums;
	}

	// Given an array of ints of odd length, return a new array length 3
	// containing the elements from the middle of the array. The array length
	// will be at least 3.
	//
	// midThree([1, 2, 3, 4, 5]) ¡ú [2, 3, 4]
	// midThree([8, 6, 7, 5, 3, 0, 9]) ¡ú [7, 5, 3]
	// midThree([1, 2, 3]) ¡ú [1, 2, 3]
	public int[] midThree(int[] nums) {
		int mid = nums.length / 2;
		int[] shu = new int[3];
		shu[0] = nums[mid - 1];
		shu[1] = nums[mid];
		shu[2] = nums[mid + 1];
		return shu;
	}

	// Given an array of ints of odd length, look at the first, last, and middle
	// values in the array and return the largest. The array length will be a
	// least 1.
	//
	// maxTriple([1, 2, 3]) ¡ú 3
	// maxTriple([1, 5, 3]) ¡ú 5
	// maxTriple([5, 2, 3]) ¡ú 5
	public int maxTriple(int[] nums) {
		int max = nums[0];
		int mid = nums.length / 2;
		if (nums[mid] > max) {
			max = nums[mid];
		}
		if (nums[nums.length - 1] > max) {
			max = nums[nums.length - 1];
		}
		return max;
	}

	// Given an int array of any length, return a new array of its first 2
	// elements. If the array is smaller than length 2, use whatever elements
	// are present.
	//
	// frontPiece([1, 2, 3]) ¡ú [1, 2]
	// frontPiece([1, 2]) ¡ú [1, 2]
	// frontPiece([1]) ¡ú [1]
	public int[] frontPiece(int[] nums) {

		int num[] = new int[2];

		if (nums.length <= 2) {
			return nums;
		}

		num[0] = nums[0];
		num[1] = nums[1];
		return num;
	}

	// We'll say that a 1 immediately followed by a 3 in an array is an
	// "unlucky" 1. Return true if the given array contains an unlucky 1 in the
	// first 2 or last 2 positions in the array.
	//
	// unlucky1([1, 3, 4, 5]) ¡ú true
	// unlucky1([2, 1, 3, 4, 5]) ¡ú true
	// unlucky1([1, 1, 1]) ¡ú false
	public boolean unlucky1(int[] nums) {

		if (nums.length < 2)
			return false;

		if (nums[0] == 1 && nums[1] == 3) {
			return true;
		} else if (nums[1] == 1 && nums[2] == 3) {
			return true;
		} else if (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3) {
			return true;
		}
		return false;
	}

	// Given 2 int arrays, a and b, return a new array length 2 containing, as
	// much as will fit, the elements from a followed by the elements from b.
	// The arrays may be any length, including 0, but there will be 2 or more
	// elements available between the 2 arrays.
	//
	// make2([4, 5], [1, 2, 3]) ¡ú [4, 5]
	// make2([4], [1, 2, 3]) ¡ú [4, 1]
	// make2([], [1, 2]) ¡ú [1, 2]
	public int[] make2(int[] a, int[] b) {

		int[] nums = new int[2];

		if (a.length == 0) {
			nums[0] = b[0];
			nums[1] = b[1];
		}

		if (a.length == 1) {
			nums[0] = a[0];
			nums[1] = b[0];
		}

		if (a.length >= 2) {
			nums[0] = a[0];
			nums[1] = a[1];
			return nums;
		}

		return nums;
	}

	// Given 2 int arrays, a and b, of any length, return a new array with the
	// first element of each array. If either array is length 0, ignore that
	// array.
	//
	// front11([1, 2, 3], [7, 9, 8]) ¡ú [1, 7]
	// front11([1], [2]) ¡ú [1, 2]
	// front11([1, 7], []) ¡ú [1]
	public int[] front11(int[] a, int[] b) {

		int[] num = new int[1];

		if (a.length == 0 && b.length == 0) {
			int[] i = new int[0];
			return i;
		} else if (a.length == 0) {
			num[0] = b[0];
			return num;
		} else if (b.length == 0) {
			num[0] = a[0];
			return num;
		} else {
			int[] n = new int[2];
			n[0] = a[0];
			n[1] = b[0];
			return n;
		}
	}

	
}
