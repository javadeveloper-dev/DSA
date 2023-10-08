package com.Array.Sorting;

//Time Complexity for this algorithm is O(n2).
public class BubbleSort {
	private static int[] sortArray(int[] arr, int n) {
		int temp = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = {18,17,16,15,14,13,12 };
		int n = arr.length;
		int result[] = BubbleSort.sortArray(arr, n);
		for (int i : result) {
			System.out.print(i + " ");
		}
	}
}
