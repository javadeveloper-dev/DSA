package com.Array;

public class CheckArraySorted {
	private static String checkArraySorted(int[] arr, int n) {
		int res = arr[0];
		int count = 0;
		for (int i = 1; i < n; i++) {
			if (res < arr[i]) {
				count++;
			}
		}
		if (count == n - 1) {
			return "Yes";
		} else {
			return "No";
		}
	}

	public static void main(String[] args) {
		int arr[] = { 8 };
		String result = CheckArraySorted.checkArraySorted(arr, arr.length);
		System.out.println("Array is sorted or not " + result);
	}
}
