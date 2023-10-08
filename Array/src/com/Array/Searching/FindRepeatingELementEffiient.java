package com.Array.Searching;
// It the array contains element from 1 to n. only
public class FindRepeatingELementEffiient {

	private static int getElement(int[] arr, int n) {
		int slow=arr[0],fast=arr[0];
		do {
			slow=arr[slow];
			fast=arr[arr[fast]];
		}while(slow!=fast);
		slow=arr[0];
		while(slow!=fast) {
			slow=arr[slow];
			fast=arr[fast];
		}
		return slow;
	}
	public static void main(String[] args) {
		int arr[]= {1,3,2,4,6,5,2,3};
		int n=arr.length;
		int result=FindRepeatingELementEffiient.getElement(arr,n);
		System.out.println(result);

	}


}
