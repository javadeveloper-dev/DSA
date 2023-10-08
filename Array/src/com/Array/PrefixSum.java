package com.Array;

public class PrefixSum {
	private static int getSum(int[] arr, int n, int l, int x) {
		int sum = 0;
		for (int i = l; i <= x; i++) {
			sum += arr[i];

		}
		return sum;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 8, 3, 9, 6, 5, 4 };
		int n = arr.length;
		int l = 1;
		int x = 3;
		int result = PrefixSum.getSum(arr, n, l, x);
		System.out.println(result);
	}
}
