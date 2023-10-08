package com.Array;

public class MaximumSumSubArrray {
	private static int getMaximumSumSubArray(int[] arr, int size) {
		int res=0;
		for(int i=0;i<size;i++) {
			int curr=0;
			for(int j=i;j<size;j++) {
				curr+=arr[j];
				res=Math.max(res, curr);
			}
		}
		return res;
	}
	public static void main(String args[]) {
		int arr[]= {1,-2,3,-1,2};
		int size=arr.length;
		int result=MaximumSumSubArrray.getMaximumSumSubArray(arr,size);
		System.out.println(result);
	}

}
