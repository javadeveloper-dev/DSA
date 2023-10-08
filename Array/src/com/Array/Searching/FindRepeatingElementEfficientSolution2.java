package com.Array.Searching;

public class FindRepeatingElementEfficientSolution2 {
	private static int getElement(int[] arr, int n) {
		int slow=arr[0]+1, fast=arr[0]+1;
		do {
			slow=arr[slow]+1;
			fast=arr[arr[fast]+1];
		}while(slow!=fast);
		slow=arr[0]+1;
		while(slow!=fast) {
			slow=arr[slow]+1;
			fast=arr[fast]+1;
		}
		return slow;
	}

	public static void main(String[] args) {
		int arr[]= {0,2,1,3,5,4,6,2};
		int n=arr.length;
		int result=FindRepeatingElementEfficientSolution2.getElement(arr,n);
		System.out.println(result);

	}


}
