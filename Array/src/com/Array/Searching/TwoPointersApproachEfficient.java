package com.Array.Searching;

public class TwoPointersApproachEfficient {

	public static boolean getPairSum(int[] arr, int n, int x) {
		int i=0,j=n-1;
		while(i<j) {
			if(arr[i]+arr[j]==x) {
				return true;
			}else if(arr[i]+arr[j]<x) {
				i++;
			}else {
				j--;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int arr[]= {2,5,8,12,30};
	     int x=17;
	     int n=arr.length;
	     boolean result=TwoPointersApproachEfficient.getPairSum(arr,n,x);
	     System.out.println(result);

	}

}
