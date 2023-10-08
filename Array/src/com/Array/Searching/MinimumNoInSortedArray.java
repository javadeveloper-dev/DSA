package com.Array.Searching;

public class MinimumNoInSortedArray {

	private static int getResult(int[] arr, int n, int low, int high) {
		int x=0,y=0;
		while(low<high) {
			int mid=low+(high-low)/2;
			if(arr[mid]>arr[high]) {
				low=mid+1;
			}else {
				high=mid;
			}
			if(n==1) {
				return arr[0];
			}	
		}
		return arr[low];
	}
	public static void main(String[] args) {
		  int arr[]= {6,11,12,13,14};
		  int n=arr.length;
		  int low=0,high=n-1;
		  int result=MinimumNoInSortedArray.getResult(arr,n,low,high);
		  System.out.println(result);

	}


}
