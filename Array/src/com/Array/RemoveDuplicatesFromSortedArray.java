package com.Array;

public class RemoveDuplicatesFromSortedArray {
	private static int removeDuplicate(int[] arr, int n) {
		int[] temp = new int[n];
		temp[0] = arr[0];
		int res = 1;
		int count = 0;
		for (int i = 1; i < n; i++) {
			if (temp[res - 1] != arr[i]) {
				temp[res] = arr[i];
				res++;
			} else {
				count++;
			}
		}
		System.out.println(temp.length - count);
		int x = temp.length - count;
		for (int i = 0; i < x; i++) {
			arr[i] = temp[i];
		}
		return count;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 20, 30, 30, 30 };
		int result = RemoveDuplicatesFromSortedArray.removeDuplicate(arr, arr.length);
		System.out.println("Array after removing the duplicates ");
		for (int i = 0; i < result; i++) {
			System.out.print(arr[i]);
		}

	}

}
