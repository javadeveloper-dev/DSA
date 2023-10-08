package com.Array;

public class RemoveDuplicatesFromSortedArrayEfficientSolution {
	private static int removeDuplicate(int[] arr, int n) {
		int res=1;
		for(int i=1;i<n;i++) {
			if(arr[i]!=arr[res-1]) {
				arr[res]=arr[i];
				System.out.println(arr[i]);
				res++;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 20, 30, 30, 30 };
		int result = RemoveDuplicatesFromSortedArrayEfficientSolution.removeDuplicate(arr, arr.length);
		System.out.println("Array after removing the duplicates ");
		for (int i = 0; i < result; i++) {
			System.out.print(arr[i]);
		}
	}
}
