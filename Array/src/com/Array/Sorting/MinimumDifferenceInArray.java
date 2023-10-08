package com.Array.Sorting;

import java.util.Arrays;

public class MinimumDifferenceInArray {
	private static int getMinimumDifferenceArray(int[] arr, int n) {
		int res=Integer.MAX_VALUE;
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				res=Math.min(res,Math.abs(arr[i]-arr[j]));
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int arr[]= {5,3,8};
		int n=arr.length;
		int result=MinimumDifferenceInArray.getMinimumDifferenceArray(arr,n);
		System.out.println(result);
	}


}
