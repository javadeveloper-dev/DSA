package com.Array;

public class LeadersInArrayEfficientSolution {
	private void leader(int[] arr, int n) {
		int curr_element = arr[n - 1];
		System.out.println(curr_element);
		for (int i = n - 2; i >= 0; i--) {
			if (curr_element < arr[i]) {
				curr_element = arr[i];
				System.out.println(curr_element);
			}
		}

	}

	public static void main(String[] args) {
		int arr[] = { 7, 10, 4, 10, 6, 5, 2 };
		int n = arr.length;
		LeadersInArrayEfficientSolution leader = new LeadersInArrayEfficientSolution();
		leader.leader(arr, n);
	}

}
