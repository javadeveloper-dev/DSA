package com.Array.Sorting;

public class PartitionInArray {
	private static int[] getPartition(int[] arr, int n, int p) {
		int temp = arr[p];
		int t[] = new int[n];
		int index = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] <= temp) {
				t[index] = arr[i];
				index++;
			}
		}
		for (int i = 0; i < n; i++) {
			if (arr[i] > temp) {
				t[index] = arr[i];
				index++;
			}
		}
		return t;
	}

	public static void main(String args[]) {
		int arr[] = { 3, 8, 6, 12, 10, 7 };
		int n = arr.length;
		int p = 5;
		int result[] = PartitionInArray.getPartition(arr, n, p);
		for (Integer i : result) {
			System.out.println(i);
		}
	}
}
