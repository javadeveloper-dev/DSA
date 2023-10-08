package com.Array;


public class MaximumDifferenceEfficientSolution {
	private static int maxDifference(int[] arr2, int n2) {
		int res=arr2[1]-arr2[0];
		int minVal=arr2[0];
		for(int i=1;i<n2;i++) {
			res=Math.max(res,arr2[i]-minVal);
		 minVal = Math.min(arr2[i],minVal);
		}
		return res ;
	}
	int arr[]= {2,3,10,6,4,8,1};
	int n=arr.length;
	int difference=MaximumDifferenceEfficientSolution.maxDifference(arr, n);
	
}
