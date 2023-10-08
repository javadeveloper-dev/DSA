package com.Array;

public class FindLargestElement {
	private static int largestElement(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			boolean flag = true;
			for (int j = i; j < n; j++) {
				if (arr[j] > arr[i]) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int n = 5;
		int result = FindLargestElement.largestElement(arr, n);
		System.out.println(result);
	}
}
