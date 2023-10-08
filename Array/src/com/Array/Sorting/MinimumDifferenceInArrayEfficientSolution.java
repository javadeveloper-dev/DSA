package com.Array.Sorting;

import java.util.Arrays;

public class MinimumDifferenceInArrayEfficientSolution {
	
	private static int getMinimumDifferenceInArray(int[] arr, int n) {
		int res=Integer.MAX_VALUE;
		Arrays.sort(arr);
		for(int i=0;i<n-1;i++) {
			res=Math.min(Math.abs(arr[i]-arr[i+1]), res);
		}
		return res;
	}

	public static void main(String[] args) {
		int arr[]= {10,3,20,12};
		int n=arr.length;
		int result=MinimumDifferenceInArrayEfficientSolution.getMinimumDifferenceInArray(arr,n);
		System.out.println(result);

	}

}
