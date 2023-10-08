package com.Array;

public class MaximumLengthEvenOddSubArray {
	private static int getResult(int[] arr, int size) {
		int res = 1;
		for (int i = 0; i < size; i++) {
			int count = 1;
			for (int j = i + 1; j < size; j++) {
				if (arr[j] % 2 == 0 && arr[j - 1] % 2 != 0 || arr[j] % 2 != 0 && arr[j - 1] % 2 == 0) {
					count++;
				} else {
					break;
				}
			}
			res = Math.max(res, count);
		}
		return res;
	}

	public static void main(String args[]) {
		int arr[] = { 5, 10, 20, 6, 3, 8 };
		int size = arr.length;
		int result = MaximumLengthEvenOddSubArray.getResult(arr, size);
		System.out.println(result);
	}

}
