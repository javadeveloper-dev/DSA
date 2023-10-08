package com.Array.Searching;

public class BinarySearch {

	private static int getBinarySearch(int[] arr, int n,int x) {
		int low=0,high=n-1;
		int y=0;
		while(low<=high) {
			int mid=low+(high - low)/2;
			y=mid;
			if(mid==x) {
				return mid;
			}else if(arr[mid]>x) {
				y=mid;
				high=mid-1;
			}else if(arr[mid]<x){
				low=mid+1;
				y=low;
			}
		}
		return y;
	}
	public static void main(String[] args) {
		int arr[]= {1,3,5,6};
		int n=arr.length;
		int x=2;
		int result=BinarySearch.getBinarySearch(arr,n,x);
		System.out.println(result);
	}


}
