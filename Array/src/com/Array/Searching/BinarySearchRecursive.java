package com.Array.Searching;

public class BinarySearchRecursive {
	
	private static int getBinarySearch(int[] arr, int high, int low, int x) {
		if(low>high) {
			return -1;
		}
		int mid=(low+high)/2;
		if(arr[mid]>x) {
			return getBinarySearch(arr,mid-1,low,x);
			
		}else if(arr[mid]<x) {
			return getBinarySearch(arr,high,mid+1,x);
		}else {
			if(mid==0 || arr[mid-1]!=arr[mid]) {
				return mid;
			}else {
				return getBinarySearch(arr,mid-1,low,x);
			}
		}
	}

	public static void main(String[] args) {
		int arr[]= {1,2,2,4,4,4,5,6};
		int x=2;
		int high=arr.length-1;
		int low=0;
		int result=BinarySearchRecursive.getBinarySearch(arr,high,low,x);
		System.out.println(result);

	}

}
