package com.Array.Basic;

import java.util.Arrays;

public class FindTripletsWithZeroSum {
	private static boolean getSum(int[] arr, int n) {
		Arrays.sort(arr);
		for(int i=0;i<n-2;i++) {
			int l=i+1;
			int r=n-1;
			int curr_sum=0;
			while(l<r) {
				curr_sum=arr[i]+arr[l]+arr[r];
				if(curr_sum==0) {
					return true;
				}else if(curr_sum<0) {
					 l+=1;
				}else {
					r-=1;
				}
				
			}
		}
		return false;
		
		}
	public static void main(String args[]) {
	int arr[]= {60,-65,5,-21,8,93};
//	int arr[]= {0,-1,2,-3,1};
		int n=arr.length;
	boolean result=FindTripletsWithZeroSum.getSum(arr,n);
	System.out.println(result);
	}
}
