package com.Array;

public class PrefixSumEfficientSolution {
	private static int getSum(int[] psum, int l, int x) {
		if (l == 0) {
			return psum[x];
		}
		return psum[x] - psum[l - 1];
	}

	public static void main(String args[]) {
		int arr[] = { 2, 8, 3, 9, 6, 5, 4 };
		int n = arr.length;
		int l = 1;
		int x = 3;
		int psum[] = new int[n];
		psum[0] = arr[0];
		for (int i = 1; i < n; i++) {
			psum[i] = psum[i - 1] + arr[i];
		}
		int result = PrefixSumEfficientSolution.getSum(psum, l, x);
		System.out.println(result);
	}

}
