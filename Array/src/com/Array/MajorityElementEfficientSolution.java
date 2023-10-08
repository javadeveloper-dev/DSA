package com.Array;

// Using Moore's Voting Algorithm
public class MajorityElementEfficientSolution {
	private static int getResult(int[] arr, int size) {
		int res = 0, count = 1;
		for (int i = 1; i < size; i++) { // Finds the candidate element
			if (arr[res] == arr[i]) {
				count++;
			} else {
				count--;
			}
			if (count == 0) {
				count = 1;
				res = i;
			}
		}
		int ccount = 0;
		for (int i = 0; i < size; i++) { // Checks if the candidate element found in the array
			if (arr[res] == arr[i]) {
				count++;
			}
			if (count > size / 2) {
				return res;
			}
		}
		return -1;
	}

	public static void main(String args[]) {
		int arr[] = { 6, 8, 4, 8, 8 };
		int size = arr.length;
		int result = MajorityElementEfficientSolution.getResult(arr, size);
		System.out.println(result);
	}
}
