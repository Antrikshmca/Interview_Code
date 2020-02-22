package com.antriksh.basics;

public class SqureRoot {
	public static void main(String[] args) {
		double result = findSqrt(11);
		System.out.println(result);
	}

	public static int findSqrt(int x) {
		// Base Cases
		if (x == 0 || x == 1)
			return x;

		// Do Binary Search for floor(sqrt(x))
		int l = 1, h = x, ans = 0;
		while (l <= h) {
			int mid = (l + h) / 2;

			// If x is a perfect square
			if (mid * mid == x)
				return mid;

			// Since we need floor, we update answer when mid*mid is
			// smaller than x, and move closer to sqrt(x)
			if (mid * mid < x) {
				l = mid + 1;
				ans = mid;
			} else
				// If mid*mid is greater than x
				h = mid - 1;
		}
		return ans;
	}

}
